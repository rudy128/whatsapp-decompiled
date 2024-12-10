package X;

import com.whatsapp.util.Log;

/* renamed from: X.1W8  reason: invalid class name */
public class AnonymousClass1W8 {
    public final AnonymousClass1Cd A00;
    public final C26111Qw A01;
    public final C202711m A02;

    public long A00(AnonymousClass206 r11) {
        AnonymousClass26f A0C;
        C202711m r9 = this.A02;
        long j = r11.A0x;
        try {
            C28781at A04 = r9.A03.get();
            try {
                A0C = ((C28801av) A04).A02.A0C((C42621yT) null, "SELECT _id FROM message_add_on WHERE parent_message_row_id = ? AND message_add_on_type = ? AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", "SELECT_MESSAGE_ADD_ON_ROW_ID_FOR_PARENT_ROW_ID_AND_TYPE", new String[]{String.valueOf(j), String.valueOf(74), String.valueOf(AnonymousClass11P.A01(r9.A00))});
                if (A0C.moveToFirst()) {
                    long j2 = (long) A0C.getInt(A0C.getColumnIndexOrThrow("_id"));
                    A0C.close();
                    A04.close();
                    return j2;
                }
                A0C.close();
                A04.close();
                return -1;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to get message_add_on_row_id for parent_message_row_id=");
            sb.append(j);
            sb.append(" and message_add_on_type=");
            sb.append(74);
            Log.e(sb.toString(), e);
            return -1;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public AnonymousClass1W8(AnonymousClass1Cd r1, C26111Qw r2, C202711m r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A01(X.AnonymousClass206 r14) {
        /*
            r13 = this;
            r0 = 131072(0x20000, double:6.47582E-319)
            boolean r0 = r14.A11(r0)
            r6 = -1
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            if (r0 == 0) goto L_0x00e8
            X.36c r0 = X.C60492o7.A00(r14)
            if (r0 == 0) goto L_0x00e8
            X.36c r0 = X.C60492o7.A00(r14)
            X.205 r4 = r0.A02
            X.36c r0 = X.C60492o7.A00(r14)
            long r0 = r0.A00
            r3 = 74
            X.213 r5 = new X.213
            r5.<init>(r4, r3, r0)
            X.205 r1 = r14.A0v
            X.1BI r3 = r14.A0H()
            X.A51 r0 = new X.A51
            r0.<init>(r3, r1)
            r5.A05 = r0
            long r3 = r14.A0x
            r5.A02 = r3
            X.1BI r0 = r14.A0H()
            r5.A0d(r0)
            X.1Cd r0 = r13.A00     // Catch:{ SQLiteConstraintException -> 0x00dd }
            X.1au r12 = r0.A05()     // Catch:{ SQLiteConstraintException -> 0x00dd }
            X.1xA r11 = r12.BD0()     // Catch:{ all -> 0x00d3 }
            X.11m r0 = r13.A02     // Catch:{ all -> 0x00c9 }
            long r9 = r0.A00(r5)     // Catch:{ all -> 0x00c9 }
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x007d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r1.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "MessageAddOnEditManager/storeEditOriginalAndCopyReceipts duplicate addon message "
            r1.append(r0)     // Catch:{ all -> 0x00c9 }
            X.205 r0 = r5.A0v     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x00c9 }
            r1.append(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c9 }
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c9 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x00c9 }
            r3.<init>(r0, r2)     // Catch:{ all -> 0x00c9 }
            r11.close()     // Catch:{ all -> 0x00d3 }
            r12.close()     // Catch:{ SQLiteConstraintException -> 0x00dd }
            return r3
        L_0x007d:
            boolean r0 = r1.A02     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00b1
            X.1Qw r0 = r13.A01     // Catch:{ all -> 0x00c9 }
            X.1Cd r0 = r0.A02     // Catch:{ all -> 0x00c9 }
            X.1au r8 = r0.A05()     // Catch:{ all -> 0x00c9 }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a7 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x00a7 }
            java.lang.String r6 = "INSERT INTO message_add_on_receipt_device(message_add_on_row_id, receipt_device_jid_row_id, primary_device_version, receipt_device_timestamp)SELECT ?, receipt_device_jid_row_id, primary_device_version, receipt_device_timestamp FROM receipt_device WHERE message_row_id = ?"
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00a7 }
            r0 = 0
            r5[r0] = r1     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00a7 }
            r0 = 1
            r5[r0] = r1     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "RECEIPT_COPY_QUERY"
            r7.A0F(r6, r0, r5)     // Catch:{ all -> 0x00a7 }
            goto L_0x00ae
        L_0x00a7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x00c9 }
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00ae:
            r8.close()     // Catch:{ all -> 0x00c9 }
        L_0x00b1:
            r11.A00()     // Catch:{ all -> 0x00c9 }
            r11.close()     // Catch:{ all -> 0x00d3 }
            r12.close()     // Catch:{ SQLiteConstraintException -> 0x00dd }
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r0)
            return r3
        L_0x00c9:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x00ce }
            goto L_0x00d2
        L_0x00ce:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00d3 }
        L_0x00d2:
            throw r1     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x00d8 }
            goto L_0x00dc
        L_0x00d8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00dd }
        L_0x00dc:
            throw r1     // Catch:{ SQLiteConstraintException -> 0x00dd }
        L_0x00dd:
            r0 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r2)
            return r0
        L_0x00e8:
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1W8.A01(X.206):android.util.Pair");
    }
}
