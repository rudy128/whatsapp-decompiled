package X;

import com.whatsapp.backup.encryptedbackup.EncBackupMainActivity;

/* renamed from: X.5QX  reason: invalid class name */
public final class AnonymousClass5QX extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ EncBackupMainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5QX(EncBackupMainActivity encBackupMainActivity) {
        super(1);
        this.this$0 = encBackupMainActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r0.A0T() == 1) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        if (r0 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        r0.A0X(3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Number r9 = (java.lang.Number) r9
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity r2 = r8.this$0
            int r4 = X.AnonymousClass3MY.A03(r9)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r2.A02
            java.lang.String r7 = "viewModel"
            if (r0 == 0) goto L_0x010c
            r3 = 1
            X.1DT r0 = r0.A04
            X.AnonymousClass3MX.A1J(r0, r3)
            X.1GP r0 = r2.A00
            java.lang.String r6 = "fragmentManager"
            if (r0 == 0) goto L_0x0108
            java.lang.String r5 = java.lang.String.valueOf(r4)
            androidx.fragment.app.Fragment r0 = r0.A0Q(r5)
            r1 = 0
            if (r0 == 0) goto L_0x002f
            X.1GP r0 = r2.A00
            if (r0 == 0) goto L_0x0108
            r0.A0v(r5, r1)
        L_0x002c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002f:
            r0 = 100
            if (r4 == r0) goto L_0x00f7
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 == r0) goto L_0x00d7
            r0 = 500(0x1f4, float:7.0E-43)
            if (r4 == r0) goto L_0x00e5
            r0 = 502(0x1f6, float:7.03E-43)
            if (r4 == r0) goto L_0x00b6
            r0 = 202(0xca, float:2.83E-43)
            if (r4 == r0) goto L_0x00a6
            r0 = 203(0xcb, float:2.84E-43)
            if (r4 == r0) goto L_0x00a0
            switch(r4) {
                case 102: goto L_0x0081;
                case 103: goto L_0x0091;
                case 104: goto L_0x0097;
                default: goto L_0x004a;
            }
        L_0x004a:
            r1 = 3
            switch(r4) {
                case 300: goto L_0x0058;
                case 301: goto L_0x006b;
                case 302: goto L_0x007b;
                default: goto L_0x004e;
            }
        L_0x004e:
            switch(r4) {
                case 400: goto L_0x0052;
                case 401: goto L_0x00ac;
                case 402: goto L_0x00c4;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x002c
        L_0x0052:
            com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment r0 = new com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment
            r0.<init>()
            goto L_0x00b1
        L_0x0058:
            com.whatsapp.backup.encryptedbackup.CreatePasswordFragment r0 = new com.whatsapp.backup.encryptedbackup.CreatePasswordFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A0V(r2, r0, r4, r3)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r2.A02
            if (r0 == 0) goto L_0x010c
            int r0 = r0.A0T()
            if (r0 != r3) goto L_0x002c
            goto L_0x0073
        L_0x006b:
            com.whatsapp.backup.encryptedbackup.EncryptionKeyInfoFragment r0 = new com.whatsapp.backup.encryptedbackup.EncryptionKeyInfoFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A0V(r2, r0, r4, r3)
        L_0x0073:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r2.A02
            if (r0 == 0) goto L_0x010c
            r0.A0X(r1)
            goto L_0x002c
        L_0x007b:
            com.whatsapp.backup.encryptedbackup.ConfirmDisableFragment r0 = new com.whatsapp.backup.encryptedbackup.ConfirmDisableFragment
            r0.<init>()
            goto L_0x00b1
        L_0x0081:
            com.whatsapp.backup.encryptedbackup.EnabledLandingFragment r0 = new com.whatsapp.backup.encryptedbackup.EnabledLandingFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A0V(r2, r0, r4, r3)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r2.A02
            if (r0 == 0) goto L_0x010c
            r0.A0Y(r3)
            goto L_0x002c
        L_0x0091:
            com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment r0 = new com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment
            r0.<init>()
            goto L_0x00b1
        L_0x0097:
            com.whatsapp.backup.encryptedbackup.ForcedRegLandingFragment r0 = new com.whatsapp.backup.encryptedbackup.ForcedRegLandingFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A0V(r2, r0, r4, r1)
            goto L_0x002c
        L_0x00a0:
            com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment r0 = new com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment
            r0.<init>()
            goto L_0x00b1
        L_0x00a6:
            com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment r0 = new com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment
            r0.<init>()
            goto L_0x00b1
        L_0x00ac:
            com.whatsapp.backup.encryptedbackup.ConfirmEncryptionKeyFragment r0 = new com.whatsapp.backup.encryptedbackup.ConfirmEncryptionKeyFragment
            r0.<init>()
        L_0x00b1:
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A0V(r2, r0, r4, r3)
            goto L_0x002c
        L_0x00b6:
            com.whatsapp.backup.encryptedbackup.ChangePasswordDoneFragment r0 = new com.whatsapp.backup.encryptedbackup.ChangePasswordDoneFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A0Q(r2, r0, r4)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r2.A02
            if (r1 == 0) goto L_0x010c
            r0 = 7
            goto L_0x00d2
        L_0x00c4:
            com.whatsapp.backup.encryptedbackup.DisableDoneFragment r0 = new com.whatsapp.backup.encryptedbackup.DisableDoneFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A0Q(r2, r0, r4)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r2.A02
            if (r1 == 0) goto L_0x010c
            r0 = 8
        L_0x00d2:
            r1.A0Y(r0)
            goto L_0x002c
        L_0x00d7:
            com.whatsapp.backup.encryptedbackup.EnableEducationFragment r0 = new com.whatsapp.backup.encryptedbackup.EnableEducationFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A0V(r2, r0, r4, r3)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r2.A02
            if (r1 == 0) goto L_0x010c
            r0 = 2
            goto L_0x00f2
        L_0x00e5:
            com.whatsapp.backup.encryptedbackup.EnableDoneFragment r0 = new com.whatsapp.backup.encryptedbackup.EnableDoneFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A0V(r2, r0, r4, r3)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r2.A02
            if (r1 == 0) goto L_0x010c
            r0 = 4
        L_0x00f2:
            r1.A0X(r0)
            goto L_0x002c
        L_0x00f7:
            com.whatsapp.backup.encryptedbackup.EnableInfoFragment r0 = new com.whatsapp.backup.encryptedbackup.EnableInfoFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A0V(r2, r0, r4, r3)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r2.A02
            if (r0 == 0) goto L_0x010c
            r0.A0X(r3)
            goto L_0x002c
        L_0x0108:
            X.C18070vi.A11(r6)
            goto L_0x010f
        L_0x010c:
            X.C18070vi.A11(r7)
        L_0x010f:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5QX.invoke(java.lang.Object):java.lang.Object");
    }
}
