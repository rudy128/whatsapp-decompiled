package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1WW  reason: invalid class name */
public class AnonymousClass1WW {
    public final C002100z A00 = new C002100z(250);
    public final AnonymousClass1DL A01;
    public final AnonymousClass1Cd A02;

    /* JADX INFO: finally extract failed */
    public C56862i9 A00(long j) {
        Long valueOf;
        C56862i9 r0;
        C56862i9 r5;
        Cursor A0A;
        C002100z r7 = this.A00;
        synchronized (r7) {
            valueOf = Long.valueOf(j);
            r0 = (C56862i9) r7.A04(valueOf);
        }
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1Cd r02 = this.A02;
        C28781at A04 = r02.get();
        try {
            synchronized (r7) {
                r5 = new C56862i9();
                C28781at A042 = r02.get();
                try {
                    A0A = ((C28801av) A042).A02.A0A("SELECT receipt_user_jid_row_id,receipt_timestamp,read_timestamp,played_timestamp FROM receipt_user WHERE message_row_id = ?", "GET_MESSAGE_RECEIPTS_SQL", new String[]{String.valueOf(j)});
                    int columnIndexOrThrow = A0A.getColumnIndexOrThrow("receipt_user_jid_row_id");
                    int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("receipt_timestamp");
                    int columnIndexOrThrow3 = A0A.getColumnIndexOrThrow("read_timestamp");
                    int columnIndexOrThrow4 = A0A.getColumnIndexOrThrow("played_timestamp");
                    while (A0A.moveToNext()) {
                        UserJid userJid = (UserJid) this.A01.A0E(UserJid.class, A0A.getLong(columnIndexOrThrow));
                        if (userJid != null) {
                            r5.A00.put(userJid, new C62452rQ(A0A.getLong(columnIndexOrThrow2), A0A.getLong(columnIndexOrThrow3), A0A.getLong(columnIndexOrThrow4)));
                        }
                    }
                    A0A.close();
                    A042.close();
                    r7.A08(valueOf, r5);
                } catch (Throwable th) {
                    try {
                        A042.close();
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                    throw th;
                }
            }
            A04.close();
            return r5;
        } catch (Throwable th3) {
            try {
                A04.close();
                throw th3;
            } catch (Throwable th4) {
                AnonymousClass0DT.A00(th3, th4);
                throw th3;
            }
        }
        throw th;
    }

    public void A01(UserJid userJid, int i, long j, long j2) {
        String str;
        C41851xA BD0;
        long j3 = j;
        UserJid userJid2 = userJid;
        int i2 = i;
        long j4 = j2;
        if (A00(j3).A00(userJid2, i2, j4)) {
            StringBuilder sb = new StringBuilder();
            sb.append("ReceiptUserStore/insertOrUpdateUserReceiptForMessage rowId=");
            sb.append(j3);
            sb.append("; status=");
            sb.append(i2);
            sb.append(" timestamp=");
            sb.append(j4);
            Log.i(sb.toString());
            ContentValues contentValues = new ContentValues(1);
            if (i2 == 5) {
                str = "receipt_timestamp";
            } else if (i2 == 8) {
                str = "played_timestamp";
            } else if (i2 == 13) {
                str = "read_timestamp";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected message status ");
                sb2.append(i2);
                sb2.append(" for user receipt");
                throw new IllegalArgumentException(sb2.toString());
            }
            contentValues.put(str, Long.valueOf(j4));
            C28791au A05 = this.A02.A05();
            try {
                BD0 = A05.BD0();
                long A09 = this.A01.A09(userJid2);
                boolean z = false;
                if (A09 != -1) {
                    z = true;
                }
                C17960vV.A0H(z, "invalid jid");
                C23141Ev r13 = ((C28801av) A05).A02;
                if (((long) r13.A02(contentValues, "receipt_user", "message_row_id=? AND receipt_user_jid_row_id=?", "insertOrUpdateUserReceiptForMessage/UPDATE_RECEIPT_USER", new String[]{String.valueOf(j3), String.valueOf(A09)})) == 0) {
                    contentValues.put("message_row_id", Long.valueOf(j3));
                    contentValues.put("receipt_user_jid_row_id", Long.valueOf(A09));
                    if (r13.A05("receipt_user", "insertOrUpdateUserReceiptForMessage/INSERT_RECEIPT_USER", contentValues) == -1) {
                        Log.e("ReceiptUserStore/insertOrUpdateUserReceiptForMessage insert failed");
                    }
                }
                BD0.A00();
                BD0.close();
                A05.close();
                return;
            } catch (Throwable th) {
                try {
                    A05.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public void A02(UserJid userJid, long j, long j2, long j3, long j4) {
        boolean z;
        long j5 = j;
        C56862i9 A002 = A00(j5);
        long j6 = j2;
        UserJid userJid2 = userJid;
        if (j2 > 0) {
            z = A002.A00(userJid2, 5, j6);
        } else {
            z = false;
        }
        long j7 = j3;
        if (j3 > 0) {
            z |= A002.A00(userJid2, 13, j7);
        }
        long j8 = j4;
        if (j4 > 0) {
            z |= A002.A00(userJid2, 8, j8);
        }
        if (z) {
            long A09 = this.A01.A09(userJid2);
            boolean z2 = false;
            if (A09 != -1) {
                z2 = true;
            }
            C17960vV.A0H(z2, "invalid jid");
            ContentValues contentValues = new ContentValues(5);
            contentValues.put("message_row_id", Long.valueOf(j5));
            contentValues.put("receipt_user_jid_row_id", Long.valueOf(A09));
            if (j2 > 0) {
                contentValues.put("receipt_timestamp", Long.valueOf(j6));
            }
            if (j3 > 0) {
                contentValues.put("read_timestamp", Long.valueOf(j7));
            }
            if (j4 > 0) {
                contentValues.put("played_timestamp", Long.valueOf(j8));
            }
            C28791au A05 = this.A02.A05();
            try {
                C23141Ev r6 = ((C28801av) A05).A02;
                if (r6.A02(contentValues, "receipt_user", "message_row_id = ? AND receipt_user_jid_row_id = ?", "insertOrUpdateEntireUserReceiptForMessage/UPDATE_RECEIPT_USER", new String[]{String.valueOf(j5), String.valueOf(A09)}) <= 0 && r6.A05("receipt_user", "insertOrUpdateEntireUserReceiptForMessage/INSERT_RECEIPT_USER", contentValues) == -1) {
                    Log.e("ReceiptUserStore/insertOrUpdateEntireUserReceiptForMessage/insert_failed");
                }
                A05.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
    }

    public AnonymousClass1WW(AnonymousClass1DL r3, AnonymousClass1Cd r4) {
        this.A01 = r3;
        this.A02 = r4;
    }
}
