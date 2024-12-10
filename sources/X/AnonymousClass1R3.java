package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1R3  reason: invalid class name */
public class AnonymousClass1R3 {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1LY A02;
    public final C22611Cn A03;
    public final AnonymousClass1Cd A04;
    public final C18030ve A05;
    public final C25981Qj A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass1Q6 A09;
    public final C26061Qr A0A;

    public AnonymousClass206 A03(AnonymousClass1BI r4) {
        if (r4 == null) {
            Log.e("LastMessageStore/getCachedLastChatsListDisplayedMessage/jid is null");
            return null;
        }
        C29691ci A002 = AnonymousClass1CJ.A00(this.A01, r4);
        if (A002 != null) {
            return A002.A0g;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LastMessageStore/getCachedLastChatsListDisplayedMessage/no chat for ");
        sb.append(r4);
        Log.w(sb.toString());
        return null;
    }

    public AnonymousClass206 A06(AnonymousClass1BI r7, boolean z) {
        if (r7 == null) {
            Log.e("msgstore/last/message/jid is null");
            return null;
        }
        AnonymousClass1CJ r1 = this.A01;
        if (AnonymousClass1CJ.A00(r1, r7) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/last/message/no chat for ");
            sb.append(r7);
            Log.w(sb.toString());
            return null;
        }
        C29691ci A002 = AnonymousClass1CJ.A00(r1, r7);
        if (A002 == null) {
            return null;
        }
        long j = A002.A0P;
        if (j == 1) {
            return null;
        }
        AnonymousClass206 r4 = A002.A0f;
        if (r4 == null) {
            AnonymousClass206 A003 = A00(r7, j, z);
            A002.A0f = A003;
            return A003;
        } else if (r4.A0u == 99) {
            return A00(r7, j, z);
        } else {
            return r4;
        }
    }

    public ArrayList A08(AnonymousClass1BI r7, int i) {
        return A01(C199410f.of(), this, r7, i, false, false);
    }

    public boolean A0A(AnonymousClass1BI r7, long j) {
        Cursor A0A2;
        boolean z = false;
        String[] strArr = {String.valueOf(this.A00.A09(r7)), String.valueOf(j)};
        C28781at A042 = this.A04.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A("SELECT  1  FROM available_message_view WHERE chat_row_id = ? AND timestamp >= ? AND message_type NOT IN ('7') AND from_me = 1 LIMIT 1", "OUTGOING_MESSAGE_EXISTS_SINCE_TIMESTAMP_RAW_SQL", strArr);
            if (A0A2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/get/no outgoing message for: ");
                sb.append(r7);
                sb.append(" after ");
                sb.append(j);
                Log.i(sb.toString());
            } else {
                if (A0A2.getCount() > 0) {
                    z = true;
                }
                A0A2.close();
            }
            A042.close();
            return z;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ac, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass206 A00(X.AnonymousClass1BI r13, long r14, boolean r16) {
        /*
            r12 = this;
            X.00H r0 = r12.A07
            java.lang.Object r0 = r0.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            if (r16 == 0) goto L_0x0046
            X.1W2 r0 = r0.A01
            X.206 r7 = r0.A03(r14)
        L_0x0010:
            boolean r0 = X.C22971Dz.A0c(r13)
            if (r0 == 0) goto L_0x0045
            boolean r0 = r7 instanceof X.C436420i
            if (r0 == 0) goto L_0x0045
            r5 = r7
            X.20i r5 = (X.C436420i) r5
            int r1 = r5.A00
            r0 = 2
            if (r1 != r0) goto L_0x0045
            java.lang.String r0 = "msgstore/initialize/update-group-create-failed-msg"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = r5
            X.2Mh r4 = (X.C48392Mh) r4
            X.205 r3 = r5.A0v
            long r1 = r5.A0I
            r0 = 3
            X.2MR r7 = new X.2MR
            r7.<init>(r3, r0, r1)
            java.lang.String r0 = r5.A0P()
            r7.A0i(r0)
            java.util.List r0 = r4.A01
            r7.A0m(r0)
            X.1Q6 r0 = r12.A09
            r0.A0B(r7)
        L_0x0045:
            return r7
        L_0x0046:
            X.1W2 r2 = r0.A01
            java.lang.String r4 = "CachedMessageStore/getMessageWithoutComments/rowId"
            r6 = 0
            long r10 = android.os.SystemClock.uptimeMillis()
            X.1Cd r0 = r2.A06     // Catch:{ all -> 0x00b4 }
            X.1at r3 = r0.get()     // Catch:{ all -> 0x00b4 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ad }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = X.AnonymousClass203.A0C     // Catch:{ all -> 0x00ad }
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x00ad }
            X.1LW r8 = r2.A01     // Catch:{ all -> 0x00ad }
            long r0 = r8.A09(r13)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00ad }
            r5[r6] = r0     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x00ad }
            r0 = 1
            r5[r0] = r1     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "GET_MESSAGE_BY_ROW_ID_WITHOUT_COMMENTS_SQL"
            android.database.Cursor r5 = r9.A0A(r7, r0, r5)     // Catch:{ all -> 0x00ad }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x00a6 }
            r7 = 0
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = "chat_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a6 }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x00a6 }
            X.1BI r1 = r8.A0B(r0)     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0094
            r0 = 1
            X.206 r7 = r2.A04(r5, r1, r6, r0)     // Catch:{ all -> 0x00a6 }
        L_0x0094:
            r5.close()     // Catch:{ all -> 0x00ad }
            r3.close()     // Catch:{ all -> 0x00b4 }
            X.1LY r2 = r2.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r10
            r2.A01(r4, r0)
            goto L_0x0010
        L_0x00a6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x00ad }
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00b4 }
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r3 = move-exception
            X.1LY r2 = r2.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r10
            r2.A01(r4, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R3.A00(X.1BI, long, boolean):X.206");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x01bb A[Catch:{ all -> 0x01d4, all -> 0x01db, all -> 0x01e0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A01(X.C199410f r6, X.AnonymousClass1R3 r7, X.AnonymousClass1BI r8, int r9, boolean r10, boolean r11) {
        /*
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.1LW r0 = r7.A00
            long r3 = r0.A09(r8)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r1.add(r0)
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x0020
            X.C26061Qr.A01(r6, r1)
        L_0x0020:
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r1.add(r0)
            if (r10 == 0) goto L_0x00b0
            if (r11 == 0) goto L_0x00b0
            int r5 = r6.size()
            java.lang.String r0 = X.AnonymousClass203.A0P
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = X.AnonymousClass203.A0J
            r3.append(r0)
            java.lang.String r0 = " AND "
            r3.append(r0)
            java.lang.String r0 = "message_type"
            r3.append(r0)
            java.lang.String r0 = " NOT IN ('"
            r3.append(r0)
            r0 = 8
            r3.append(r0)
            java.lang.String r4 = "', '"
            r3.append(r4)
            r0 = 10
            r3.append(r0)
            r3.append(r4)
            r0 = 7
            r3.append(r0)
            r3.append(r4)
            r0 = 19
            r3.append(r0)
            java.lang.String r0 = "') AND "
            r3.append(r0)
            java.lang.String r0 = "from_me = 0"
            r3.append(r0)
            if (r5 <= 0) goto L_0x019c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = " AND ("
            r4.append(r0)
            java.lang.String r0 = "view_mode NOT IN "
            r4.append(r0)
            java.lang.String r0 = X.AnonymousClass1H2.A00(r5)
        L_0x0088:
            r4.append(r0)
            java.lang.String r0 = ") "
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x0094:
            r3.append(r0)
            java.lang.String r0 = " ORDER BY sort_id DESC"
            r3.append(r0)
            java.lang.String r0 = " LIMIT ?"
            r3.append(r0)
            java.lang.String r5 = r3.toString()
        L_0x00a5:
            int r0 = r1.size()
            java.lang.String[] r3 = new java.lang.String[r0]
            r1.toArray(r3)
            goto L_0x01a4
        L_0x00b0:
            if (r10 == 0) goto L_0x01a0
            int r6 = r6.size()
            java.lang.String r0 = X.AnonymousClass203.A0P
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "   SELECT "
            r3.append(r0)
            java.lang.String[] r0 = X.C209514c.A01
            java.lang.String r4 = "available_message_view"
            java.lang.String r0 = X.AnonymousClass1H2.A01(r4, r0)
            r3.append(r0)
            java.lang.String r0 = " FROM "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r5 = " LEFT JOIN "
            r3.append(r5)
            java.lang.String r0 = "message_call_log"
            r3.append(r0)
            java.lang.String r4 = " ON "
            r3.append(r4)
            java.lang.String r0 = "message_call_log.message_row_id = available_message_view._id"
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = "call_log"
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = "call_log._id = message_call_log.call_log_row_id"
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = "bot_message_info"
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = "bot_message_info.message_row_id = available_message_view._id"
            r3.append(r0)
            java.lang.String r0 = " WHERE "
            r3.append(r0)
            java.lang.String r0 = "chat_row_id = ?"
            r3.append(r0)
            java.lang.String r4 = " AND "
            r3.append(r4)
            java.lang.String r0 = "message_type"
            r3.append(r0)
            java.lang.String r0 = " NOT IN ('"
            r3.append(r0)
            r0 = 8
            r3.append(r0)
            java.lang.String r5 = "', '"
            r3.append(r5)
            r0 = 10
            r3.append(r0)
            r3.append(r5)
            r0 = 7
            r3.append(r0)
            r3.append(r5)
            r0 = 19
            r3.append(r0)
            r3.append(r5)
            r0 = 96
            r3.append(r0)
            r3.append(r5)
            r0 = 69
            r3.append(r0)
            r3.append(r5)
            r0 = 36
            r3.append(r0)
            r3.append(r5)
            r0 = 77
            r3.append(r0)
            r3.append(r5)
            r0 = 87
            r3.append(r0)
            java.lang.String r0 = "') AND ("
            r3.append(r0)
            java.lang.String r0 = "message_type <> 90 OR call_log._id IS NOT NULL"
            r3.append(r0)
            java.lang.String r0 = ") AND "
            r3.append(r0)
            java.lang.String r0 = "available_message_view.from_me = 0"
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = "bot_message_info.message_row_id IS NULL"
            r3.append(r0)
            if (r6 <= 0) goto L_0x019c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = " AND ("
            r4.append(r0)
            java.lang.String r0 = "view_mode NOT IN "
            r4.append(r0)
            java.lang.String r0 = X.AnonymousClass1H2.A00(r6)
            goto L_0x0088
        L_0x019c:
            java.lang.String r0 = ""
            goto L_0x0094
        L_0x01a0:
            java.lang.String r5 = X.AnonymousClass203.A05
            goto L_0x00a5
        L_0x01a4:
            X.1Cd r0 = r7.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f1, IllegalStateException -> 0x01ea }
            X.1at r4 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f1, IllegalStateException -> 0x01ea }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01e0 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "GET_LAST_SIGNIFICANT_INCOMING_MESSAGES_SQL"
            android.database.Cursor r3 = r1.A0A(r5, r0, r3)     // Catch:{ all -> 0x01e0 }
        L_0x01b5:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x01d4 }
            if (r0 == 0) goto L_0x01cd
            X.00H r0 = r7.A07     // Catch:{ all -> 0x01d4 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01d4 }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x01d4 }
            X.206 r0 = r0.A02(r3, r8)     // Catch:{ all -> 0x01d4 }
            if (r0 == 0) goto L_0x01b5
            r2.add(r0)     // Catch:{ all -> 0x01d4 }
            goto L_0x01b5
        L_0x01cd:
            r3.close()     // Catch:{ all -> 0x01e0 }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f1, IllegalStateException -> 0x01ea }
            return r2
        L_0x01d4:
            r1 = move-exception
            if (r3 == 0) goto L_0x01df
            r3.close()     // Catch:{ all -> 0x01db }
            goto L_0x01df
        L_0x01db:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01e0 }
        L_0x01df:
            throw r1     // Catch:{ all -> 0x01e0 }
        L_0x01e0:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x01e5 }
            goto L_0x01e9
        L_0x01e5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f1, IllegalStateException -> 0x01ea }
        L_0x01e9:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f1, IllegalStateException -> 0x01ea }
        L_0x01ea:
            r1 = move-exception
            java.lang.String r0 = "msgstore/getlastsignificantincomingmessages/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
            return r2
        L_0x01f1:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r7.A03
            r0.A03()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R3.A01(X.10f, X.1R3, X.1BI, int, boolean, boolean):java.util.ArrayList");
    }

    public static void A02(Cursor cursor, AnonymousClass1R3 r4, AnonymousClass1BI r5, ArrayList arrayList) {
        if (cursor != null) {
            while (cursor.moveToNext()) {
                try {
                    AnonymousClass206 A022 = ((AnonymousClass1W6) r4.A07.get()).A02(cursor, r5);
                    if (A022 != null) {
                        if ((A022 instanceof C441822l) && A022.A09 == 1) {
                            C62572rc r0 = ((C441822l) A022).A02;
                            if (r0 != null) {
                                if (!r0.A0V) {
                                }
                            }
                        } else if (!(A022 instanceof AnonymousClass23N)) {
                        }
                        arrayList.add(A022);
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e((Throwable) e);
                    r4.A03.A03();
                } catch (IllegalStateException e2) {
                    Log.i("msgstore/getlastmessagesfornotification/IllegalStateException ", e2);
                } catch (Throwable th) {
                    cursor.close();
                    throw th;
                }
            }
            cursor.close();
        }
    }

    public ArrayList A09(AnonymousClass1BI r8, int i) {
        Cursor A0A2;
        ArrayList arrayList = new ArrayList();
        try {
            C28781at A042 = this.A04.get();
            try {
                A0A2 = ((C28801av) A042).A02.A0A(AnonymousClass203.A06, "GET_LAST_SIGNIFICANT_MESSAGES_WITHOUT_REVOKED_SQL", new String[]{String.valueOf(this.A00.A09(r8)), String.valueOf(i)});
                while (A0A2.moveToNext()) {
                    AnonymousClass206 A022 = ((AnonymousClass1W6) this.A07.get()).A02(A0A2, r8);
                    if (A022 != null) {
                        arrayList.add(A022);
                    }
                }
                A0A2.close();
                A042.close();
                return arrayList;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A03.A03();
            return arrayList;
        } catch (IllegalStateException e2) {
            Log.i("msgstore/getLastSignificantMessagesWithoutRevoked/IllegalStateException ", e2);
            return arrayList;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public AnonymousClass1R3(AnonymousClass11P r1, AnonymousClass1LW r2, AnonymousClass1CJ r3, AnonymousClass1LY r4, AnonymousClass1Q6 r5, C22611Cn r6, AnonymousClass1Cd r7, C18030ve r8, C26061Qr r9, C25981Qj r10, AnonymousClass00H r11) {
        this.A08 = r1;
        this.A05 = r8;
        this.A00 = r2;
        this.A01 = r3;
        this.A07 = r11;
        this.A06 = r10;
        this.A02 = r4;
        this.A09 = r5;
        this.A04 = r7;
        this.A0A = r9;
        this.A03 = r6;
    }

    @Deprecated
    public AnonymousClass206 A04(AnonymousClass1BI r2) {
        return A05(r2);
    }

    public AnonymousClass206 A05(AnonymousClass1BI r10) {
        AnonymousClass206 A032 = A03(r10);
        if (A032 == null) {
            AnonymousClass1CJ r0 = this.A01;
            C29691ci A0A2 = r0.A0A(r10);
            if (A0A2 == null || r10 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/last/message/no chat for ");
                sb.append(r10);
                Log.w(sb.toString());
                return null;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            C29691ci A002 = AnonymousClass1CJ.A00(r0, r10);
            if (A002 != null) {
                long j = A002.A0W;
                if (j != 1) {
                    A032 = A00(r10, j, true);
                    this.A02.A01("LastMessageStore/getLastChatsListDisplayedMessageFromDb", SystemClock.uptimeMillis() - uptimeMillis);
                    A0A2.A0g = A032;
                }
            }
            A032 = null;
            A0A2.A0g = A032;
        }
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r0 != false) goto L_0x0027;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A07(X.AnonymousClass1BI r11, int r12) {
        /*
            r10 = this;
            long r8 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = 1
            if (r12 != r6) goto L_0x006c
            X.206 r2 = r10.A05(r11)
            if (r2 == 0) goto L_0x005b
            X.205 r0 = r2.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0027
            X.1Qj r0 = r10.A06
            boolean r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x0027
            boolean r0 = r2 instanceof X.C436420i
            if (r0 != 0) goto L_0x005c
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x006c
        L_0x0027:
            boolean r0 = r2 instanceof X.AnonymousClass22O
            if (r0 != 0) goto L_0x006c
            boolean r0 = r2 instanceof X.AnonymousClass23U
            if (r0 != 0) goto L_0x006c
            boolean r0 = r2 instanceof X.AnonymousClass23N
            if (r0 != 0) goto L_0x006c
            boolean r0 = r2 instanceof X.C442622t
            if (r0 != 0) goto L_0x006c
            boolean r0 = r2 instanceof X.C442822v
            if (r0 != 0) goto L_0x006c
            boolean r0 = r2 instanceof X.C445623x
            if (r0 != 0) goto L_0x006c
            int r1 = r2.A0u
            r0 = 90
            if (r1 == r0) goto L_0x006c
            boolean r0 = r2 instanceof X.C441822l
            if (r0 == 0) goto L_0x0058
            int r0 = r2.A09
            if (r0 != r6) goto L_0x0058
            r0 = r2
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r0 = r0.A02
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x005b
        L_0x0058:
            r4.add(r2)
        L_0x005b:
            return r4
        L_0x005c:
            r0 = r2
            X.20i r0 = (X.C436420i) r0
            int r0 = r0.A00
            java.util.Set r1 = X.AnonymousClass2WQ.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            goto L_0x0025
        L_0x006c:
            X.1Cd r0 = r10.A04
            X.1at r7 = r0.get()
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ba }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = X.C50932Wi.A03     // Catch:{ all -> 0x00ba }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00ba }
            X.1LW r0 = r10.A00     // Catch:{ all -> 0x00ba }
            long r0 = r0.A09(r11)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00ba }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00ba }
            r2[r6] = r0     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "GET_NOTIFICATION_MESSAGES_SQL"
            android.database.Cursor r0 = r5.A0A(r3, r0, r2)     // Catch:{ all -> 0x00ba }
            A02(r0, r10, r11, r4)     // Catch:{ all -> 0x0099 }
            goto L_0x00a5
        L_0x0099:
            r1 = move-exception
            if (r0 == 0) goto L_0x00a4
            r0.close()     // Catch:{ all -> 0x00a0 }
            goto L_0x00a4
        L_0x00a0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00ba }
        L_0x00a4:
            throw r1     // Catch:{ all -> 0x00ba }
        L_0x00a5:
            if (r0 == 0) goto L_0x00aa
            r0.close()     // Catch:{ all -> 0x00ba }
        L_0x00aa:
            r7.close()
            X.1LY r3 = r10.A02
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r8
            java.lang.String r0 = "LastMessageStore/getLastMessagesForNotification"
            r3.A01(r0, r1)
            return r4
        L_0x00ba:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00bf }
            throw r1
        L_0x00bf:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R3.A07(X.1BI, int):java.util.ArrayList");
    }
}
