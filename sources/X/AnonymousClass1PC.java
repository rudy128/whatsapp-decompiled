package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1PC  reason: invalid class name */
public class AnonymousClass1PC {
    public final AnonymousClass11P A00;
    public final AnonymousClass1MH A01;
    public final AnonymousClass18O A02;

    public int A00() {
        Cursor A0A;
        C28781at A05 = this.A01.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT COUNT(*) as count FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0", "SignalPreKeyStore/getUnsentPreKeysCount", (String[]) null);
            if (A0A.moveToNext()) {
                int i = A0A.getInt(A0A.getColumnIndexOrThrow("count"));
                A0A.close();
                A05.close();
                return i;
            }
            throw new SQLiteException("unable to fetch count from table");
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public ArrayList A01() {
        Cursor A0A;
        ArrayList arrayList = new ArrayList();
        C28781at A05 = this.A01.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT prekey_id, record FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0 LIMIT ?", "SignalPreKeyStore/getUnsentPreKeys", new String[]{String.valueOf(this.A02.A04(AnonymousClass18O.A1S))});
            while (A0A.moveToNext()) {
                arrayList.add(new C52972bm(A0A.getInt(A0A.getColumnIndexOrThrow("prekey_id")), A0A.getBlob(A0A.getColumnIndexOrThrow("record"))));
            }
            A0A.close();
            A05.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A02(int i) {
        C28791au A06 = this.A01.A06();
        try {
            long A04 = (long) ((C28801av) A06).A02.A04("prekeys", "prekey_id = ?", "SignalPreKeyStore/removePreKey", new String[]{String.valueOf(i)});
            if (A04 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("SignalPreKeyStore/removePreKey deleted ");
                sb.append(A04);
                sb.append(" pre keys with id ");
                sb.append(i);
                Log.i(sb.toString());
            }
            A06.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A03(int[] iArr) {
        C28791au A06;
        AnonymousClass1MH r6 = this.A01;
        C28791au A062 = r6.A06();
        try {
            C41851xA BD0 = A062.BD0();
            try {
                long A012 = AnonymousClass11P.A01(this.A00) / 1000;
                int i = 0;
                while (true) {
                    int length = iArr.length;
                    if (i < length) {
                        int min = Math.min(i + 200, length);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("sent_to_server", true);
                        contentValues.put("upload_timestamp", Long.valueOf(A012));
                        StringBuilder sb = new StringBuilder("?");
                        String[] strArr = new String[(min - i)];
                        for (int i2 = i; i2 < min; i2++) {
                            strArr[i2 - i] = String.valueOf(iArr[i2]);
                            if (i2 != i) {
                                sb.append(",?");
                            }
                        }
                        A06 = r6.A06();
                        C23141Ev r13 = ((C28801av) A06).A02;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("prekey_id IN (");
                        sb2.append(sb);
                        sb2.append(")");
                        int A022 = r13.A02(contentValues, "prekeys", sb2.toString(), "SignalPreKeyStore/setPreKeysAsSentToServer", strArr);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SignalPreKeyStore/setPreKeysAsSentToServer updated ");
                        sb3.append(A022);
                        sb3.append(" prekeys; values=");
                        sb3.append(contentValues);
                        Log.i(sb3.toString());
                        A06.close();
                        i = min;
                    } else {
                        A06 = r6.A06();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("upload_timestamp", Long.valueOf(A012));
                        ((C28801av) A06).A02.A05("prekey_uploads", "SignalPreKeyStore/savePreKeyUpload", contentValues2);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("SignalPreKeyStore/savePreKeyUpload addPreKeyUpload ts:");
                        sb4.append(A012);
                        Log.i(sb4.toString());
                        A06.close();
                        BD0.A00();
                        BD0.close();
                        A062.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                BD0.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A062.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public byte[] A04(int i) {
        Cursor A0A;
        C28781at A05 = this.A01.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT record FROM prekeys WHERE prekey_id = ?", "SignalPreKeyStore/getPreKey", new String[]{String.valueOf(i)});
            if (!A0A.moveToNext()) {
                A0A.close();
                A05.close();
                return null;
            }
            byte[] blob = A0A.getBlob(A0A.getColumnIndexOrThrow("record"));
            A0A.close();
            A05.close();
            return blob;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass1PC(AnonymousClass18O r1, AnonymousClass11P r2, AnonymousClass1MH r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r1;
    }
}
