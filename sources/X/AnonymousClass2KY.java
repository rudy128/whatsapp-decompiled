package X;

import android.content.res.Resources;

/* renamed from: X.2KY  reason: invalid class name */
public class AnonymousClass2KY extends C60182nW implements AnonymousClass3LC {
    public C59702mk A00;
    public final C59782ms A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2KY(X.AnonymousClass190 r17, X.AnonymousClass11S r18, X.AnonymousClass18O r19, X.AnonymousClass1M9 r20, X.C24921Me r21, X.AnonymousClass11C r22, X.AnonymousClass118 r23, X.C18000vb r24, X.C59702mk r25, X.C59782ms r26, X.C32211gp r27, X.C18030ve r28, X.AnonymousClass1LU r29, X.C217217d r30, X.AnonymousClass72L r31) {
        /*
            r16 = this;
            r0 = r25
            X.206 r14 = r0.A03
            r11 = r28
            r10 = r27
            r15 = r31
            r3 = r18
            r13 = r30
            r2 = r17
            r12 = r29
            r1 = r16
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.A00 = r0
            r0 = r26
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KY.<init>(X.190, X.11S, X.18O, X.1M9, X.1Me, X.11C, X.118, X.0vb, X.2mk, X.2ms, X.1gp, X.0ve, X.1LU, X.17d, X.72L):void");
    }

    public static String A00(AnonymousClass2KY r8) {
        C59702mk r1 = r8.A00;
        Integer num = r1.A01;
        if (num == null) {
            return "";
        }
        int intValue = num.intValue() - 1;
        if (intValue <= 0) {
            return r8.A05.A00.getString(2131895161);
        }
        int i = 2131755355;
        if (r1.A05.size() > 1) {
            i = 2131755356;
        }
        Resources resources = r8.A05.A00.getResources();
        Object[] objArr = new Object[2];
        C217217d r2 = r8.A08;
        AnonymousClass206 r0 = r8.A00;
        objArr[0] = r2.A0L(r0.A0H(), r0.A0v.A00);
        C17880vN.A1S(objArr, intValue, 1);
        return resources.getQuantityString(i, intValue, objArr);
    }

    public static String A01(AnonymousClass2KY r5, String str) {
        Integer num = r5.A00.A01;
        if (num == null) {
            return "";
        }
        int intValue = num.intValue() - 1;
        if (intValue <= 0) {
            return str;
        }
        Resources resources = r5.A05.A00.getResources();
        Object[] A1a = C17890vO.A1a(str);
        C17880vN.A1T(A1a, intValue, 1);
        return resources.getQuantityString(2131755352, intValue, A1a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ad, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b1, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C1409673t r10, androidx.core.app.NotificationCompat$MessagingStyle r11, X.AnonymousClass1E7 r12) {
        /*
            r9 = this;
            X.2mk r5 = r9.A00
            java.lang.Integer r0 = r5.A01
            if (r0 != 0) goto L_0x00bd
            X.2ms r4 = r9.A01
            r6 = 0
            X.205 r0 = r5.A04
            X.1BI r1 = r0.A00
            if (r1 == 0) goto L_0x00bd
            X.1CJ r0 = r4.A01
            long r0 = r0.A07(r1)
            java.util.Set r3 = r5.A05
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x00b8
            int r7 = r3.size()
            r2 = 10
            if (r7 > r2) goto L_0x00b8
            java.lang.String[] r2 = X.C17880vN.A1Y()
            X.C17880vN.A1V(r2, r6, r0)
            java.util.ArrayList r7 = X.AnonymousClass1ZU.A06(r2)
            java.util.ArrayList r8 = X.C29351c6.A0E(r3)
            java.util.Iterator r2 = r3.iterator()
        L_0x0038:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004a
            long r0 = X.C17890vO.A07(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.add(r0)
            goto L_0x0038
        L_0x004a:
            r7.addAll(r8)
            int r1 = r3.size()
            java.lang.String r0 = X.C50862Wb.A02
            r0 = 1
            if (r1 < r0) goto L_0x00b5
            r0 = 10
            if (r1 > r0) goto L_0x00b5
            java.lang.String r2 = X.AnonymousClass1H2.A00(r1)
            X.C18070vi.A0X(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "\n          SELECT \n            COUNT(DISTINCT sender_jid_row_id) as sender_count\n          FROM message_comment JOIN available_message_view \n          WHERE\n            message_row_id = available_message_view._id  \n            AND message_row_id > ?\n        AND parent_message_row_id in "
            java.lang.String r3 = X.AnonymousClass001.A1H(r0, r2, r1)
            if (r3 == 0) goto L_0x00b5
            X.1Cd r0 = r4.A05
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ae }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00ae }
            java.lang.String[] r1 = X.C17890vO.A1b(r7, r6)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "SELECT_UNSEEN_COMMENT_SENDER_COUNT_NOTIFICATION"
            android.database.Cursor r3 = r2.A0A(r3, r0, r1)     // Catch:{ all -> 0x00ae }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00a7 }
            r2 = 0
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = "sender_count"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a7 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x009e
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x00a7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a7 }
        L_0x009e:
            r5.A01 = r2     // Catch:{ all -> 0x00a7 }
        L_0x00a0:
            r3.close()     // Catch:{ all -> 0x00ae }
            r4.close()
            goto L_0x00bd
        L_0x00a7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00ae }
            throw r0     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x00b5:
            java.lang.String r0 = "MessageCommentParentStore/populateSenderDataForParents/failed to make a query"
            goto L_0x00ba
        L_0x00b8:
            java.lang.String r0 = "MessageCommentParentStore/populateSenderDataForParents/too many parents to parse"
        L_0x00ba:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00bd:
            super.A0A(r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KY.A0A(X.73t, androidx.core.app.NotificationCompat$MessagingStyle, X.1E7):void");
    }

    public AnonymousClass205 BWG() {
        return this.A00.A04;
    }
}
