package X;

import com.whatsapp.backup.encryptedbackup.PasswordInputFragment;

public final class B3S extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ PasswordInputFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B3S(PasswordInputFragment passwordInputFragment) {
        super(1);
        this.this$0 = passwordInputFragment;
    }

    public static String A00(C18000vb r9, long j) {
        C17960vV.A0D(AnonymousClass000.A1Q((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        long j2 = (j + 60000) - 1;
        long j3 = j2 / 3600000;
        if (j3 == 0) {
            return C64052u8.A02(r9, (int) (j2 / 60000), 1);
        }
        return C64052u8.A02(r9, (int) j3, 2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010e, code lost:
        r4.A2A(r4.A1H(r0), r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Number r13 = (java.lang.Number) r13
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment r4 = r12.this$0
            int r1 = X.AnonymousClass3MY.A03(r13)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r4.A26()
            X.1DT r0 = r0.A08
            java.lang.Number r3 = X.C108945cZ.A1C(r0)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r4.A26()
            X.1DT r0 = r0.A06
            java.lang.Object r0 = X.AnonymousClass8BS.A0W(r0)
            int r9 = X.AnonymousClass8BU.A03(r0)
            switch(r1) {
                case 4: goto L_0x0117;
                case 5: goto L_0x0096;
                case 6: goto L_0x006f;
                case 7: goto L_0x0049;
                case 8: goto L_0x0029;
                default: goto L_0x0023;
            }
        L_0x0023:
            r4.A28()
        L_0x0026:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0029:
            r0 = 2131889829(0x7f120ea5, float:1.9414333E38)
            java.lang.String r2 = r4.A1H(r0)
            r1 = 1
            r0 = 0
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment.A02(r0, r4, r2, r1)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r4.A26()
            int r1 = r0.A0T()
            r0 = 2
            if (r1 != r0) goto L_0x0026
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r4.A26()
            r0 = 5
            r1.A0Z(r0)
            goto L_0x0026
        L_0x0049:
            int r1 = r4.A00
            r0 = 2
            r5 = 0
            if (r1 != r0) goto L_0x0067
            android.content.res.Resources r3 = X.AnonymousClass3MZ.A09(r4)
            r2 = 2131755112(0x7f100068, float:1.9141094E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            r0 = 64
            X.C17880vN.A1T(r1, r0, r5)
            java.lang.String r0 = r3.getQuantityString(r2, r0, r1)
        L_0x0063:
            r4.A2A(r0, r5)
            goto L_0x0026
        L_0x0067:
            r0 = 2131889876(0x7f120ed4, float:1.9414428E38)
            java.lang.String r0 = r4.A1H(r0)
            goto L_0x0063
        L_0x006f:
            r7 = 1
            if (r3 == 0) goto L_0x0092
            r1 = 0
            long r5 = r3.longValue()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0092
            r3 = 2131889848(0x7f120eb8, float:1.9414371E38)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            X.0vb r0 = r4.A09
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = A00(r0, r5)
            r1 = 0
            java.lang.String r0 = X.AnonymousClass3MX.A16(r4, r0, r2, r1, r3)
            r4.A2A(r0, r1)
            goto L_0x0026
        L_0x0092:
            r0 = 2131896261(0x7f1227c5, float:1.9427378E38)
            goto L_0x010e
        L_0x0096:
            int r1 = r4.A00
            r0 = 2
            r6 = 0
            r8 = 0
            r7 = 1
            if (r1 != r0) goto L_0x00b1
            if (r9 != 0) goto L_0x00d3
            r0 = 2131889852(0x7f120ebc, float:1.941438E38)
            java.lang.String r1 = r4.A1H(r0)
            X.AGq r0 = new X.AGq
            r0.<init>(r4, r7)
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment.A02(r0, r4, r1, r8)
            goto L_0x0026
        L_0x00b1:
            if (r9 != 0) goto L_0x00bf
            r0 = 2131889874(0x7f120ed2, float:1.9414424E38)
            java.lang.String r0 = r4.A1H(r0)
            r4.A2A(r0, r8)
            goto L_0x0026
        L_0x00bf:
            r0 = 2131889832(0x7f120ea8, float:1.9414339E38)
            java.lang.String r0 = r4.A1H(r0)
            r4.A2A(r0, r7)
            if (r9 != r7) goto L_0x0026
            r0 = 2131889875(0x7f120ed3, float:1.9414426E38)
            java.lang.String r0 = r4.A1H(r0)
            goto L_0x0106
        L_0x00d3:
            if (r3 == 0) goto L_0x010b
            r10 = 0
            long r1 = r3.longValue()
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x010b
            r5 = 2131889833(0x7f120ea9, float:1.941434E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.0vb r0 = r4.A09
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = A00(r0, r1)
            java.lang.String r0 = X.AnonymousClass3MX.A16(r4, r0, r3, r8, r5)
            r4.A2A(r0, r8)
            if (r9 != r7) goto L_0x0026
            r5 = 2131889834(0x7f120eaa, float:1.9414343E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.0vb r0 = r4.A09
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = A00(r0, r1)
            java.lang.String r0 = X.AnonymousClass3MX.A16(r4, r0, r3, r8, r5)
        L_0x0106:
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment.A02(r6, r4, r0, r7)
            goto L_0x0026
        L_0x010b:
            r0 = 2131889832(0x7f120ea8, float:1.9414339E38)
        L_0x010e:
            java.lang.String r0 = r4.A1H(r0)
            r4.A2A(r0, r7)
            goto L_0x0026
        L_0x0117:
            r0 = 2131896261(0x7f1227c5, float:1.9427378E38)
            java.lang.String r2 = r4.A1H(r0)
            r1 = 1
            r0 = 0
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment.A02(r0, r4, r2, r1)
            goto L_0x0026
        L_0x0125:
            X.AnonymousClass3MW.A1M()
            r0 = 0
            throw r0
        L_0x012a:
            X.AnonymousClass3MW.A1M()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B3S.invoke(java.lang.Object):java.lang.Object");
    }
}
