package com.whatsapp.backup.encryptedbackup;

import X.B8U;
import X.B8V;
import X.C18070vi;
import X.C18600wl;
import X.C191519mj;
import X.C72473Md;
import com.whatsapp.passkeys.PasskeyAndroidApiImpl;
import com.whatsapp.passkeys.PasskeyExistsCache;
import com.whatsapp.passkeys.PasskeyFacade;

public final class PasskeyBackupEnabler {
    public final PasskeyAndroidApiImpl A00;
    public final PasskeyExistsCache A01;
    public final PasskeyFacade A02;
    public final C191519mj A03;
    public final C18600wl A04;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler r6, X.AX0 r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.C21616An7
            if (r0 == 0) goto L_0x0039
            r5 = r8
            X.An7 r5 = (X.C21616An7) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0039
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r3) goto L_0x003f
            X.C30691eM.A01(r1)
        L_0x0020:
            X.9pd r1 = (X.C193159pd) r1
            X.9pa r0 = r1.A00
            return r0
        L_0x0025:
            X.C30691eM.A01(r1)
            X.0wl r2 = r6.A04
            r1 = 0
            com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler$deriveBackupEncapsulationKey$2 r0 = new com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler$deriveBackupEncapsulationKey$2
            r0.<init>(r7, r1)
            r5.label = r3
            java.lang.Object r1 = X.C30451dy.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0020
            return r4
        L_0x0039:
            X.An7 r5 = new X.An7
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x003f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler.A00(com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler, X.AX0, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(android.app.Activity r8, X.C193139pb r9, X.C30391dr r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C21676Ao5
            if (r0 == 0) goto L_0x00ba
            r5 = r10
            X.Ao5 r5 = (X.C21676Ao5) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ba
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r6 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r2) goto L_0x004e
            if (r0 != r3) goto L_0x00c1
            java.lang.Object r9 = r5.L$0
            X.9pb r9 = (X.C193139pb) r9
            X.C30691eM.A01(r1)
            X.9pd r1 = (X.C193159pd) r1
            X.9pa r1 = r1.A00
        L_0x002c:
            X.9pa r1 = (X.C193129pa) r1
            X.9q2 r0 = new X.9q2
            r0.<init>(r1, r9)
            X.8yZ r1 = new X.8yZ
            r1.<init>(r0)
            return r1
        L_0x0039:
            X.C30691eM.A01(r1)
            X.9pe r1 = X.C197529wq.A00
            com.whatsapp.passkeys.PasskeyAndroidApiImpl r0 = r7.A00
            r5.L$0 = r7
            r5.L$1 = r9
            r5.label = r2
            java.lang.Object r1 = r0.A05(r8, r9, r1, r5)
            if (r1 == r4) goto L_0x00d7
            r2 = r7
            goto L_0x0059
        L_0x004e:
            java.lang.Object r9 = r5.L$1
            X.9pb r9 = (X.C193139pb) r9
            java.lang.Object r2 = r5.L$0
            com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler r2 = (com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler) r2
            X.C30691eM.A01(r1)
        L_0x0059:
            X.9MT r1 = (X.AnonymousClass9MT) r1
            boolean r0 = r1 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x007a
            X.8yZ r1 = (X.C175348yZ) r1
            java.lang.Object r1 = r1.A00
            X.B5O r1 = (X.B5O) r1
            boolean r0 = r1 instanceof X.AX1
            if (r0 != 0) goto L_0x00cb
            boolean r0 = r1 instanceof X.AX2
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = "encb/PasskeyBackupEnabler/restoreWithExistingPasskey/prf not supported"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.9IE r0 = X.AnonymousClass9IE.PRF_NOT_SUPPORTED
        L_0x0074:
            X.8yY r1 = new X.8yY
            r1.<init>(r0)
            return r1
        L_0x007a:
            boolean r0 = r1 instanceof X.C175338yY
            if (r0 == 0) goto L_0x00d2
            X.8yY r1 = (X.C175338yY) r1
            java.lang.Object r2 = r1.A00
            X.A1a r2 = (X.C19965A1a) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "encb/PasskeyBackupEnabler/restoreWithExistingPasskey/error: "
            X.C17900vP.A0Z(r2, r0, r1)
            java.lang.Integer r0 = r2.A00
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x00a4
            r0 = 1
            if (r1 == r0) goto L_0x00a1
            if (r1 == r3) goto L_0x009e
            X.9IE r0 = X.AnonymousClass9IE.OTHER_PASSKEY_ERROR
            goto L_0x0074
        L_0x009e:
            X.9IE r0 = X.AnonymousClass9IE.PASSKEY_NOT_ON_DEVICE_OR_DENIED_ACCESS_TO_PASSKEY
            goto L_0x0074
        L_0x00a1:
            X.9IE r0 = X.AnonymousClass9IE.USER_CANCELED
            goto L_0x0074
        L_0x00a4:
            X.9IE r0 = X.AnonymousClass9IE.INELIGIBLE
            goto L_0x0074
        L_0x00a7:
            boolean r0 = r1 instanceof X.AX0
            if (r0 == 0) goto L_0x00c6
            X.AX0 r1 = (X.AX0) r1
            r5.L$0 = r9
            r5.L$1 = r6
            r5.label = r3
            java.lang.Object r1 = A00(r2, r1, r5)
            if (r1 != r4) goto L_0x002c
            return r4
        L_0x00ba:
            X.Ao5 r5 = new X.Ao5
            r5.<init>(r7, r10)
            goto L_0x0012
        L_0x00c1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00c6:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00cb:
            java.lang.String r0 = "This cannot happen, we did request PRF"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00d2:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00d7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler.A01(android.app.Activity, X.9pb, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(android.app.Activity r9, X.C30391dr r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C21640AnV
            if (r0 == 0) goto L_0x00bc
            r6 = r10
            X.AnV r6 = (X.C21640AnV) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bc
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r2 = r6.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 0
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r4) goto L_0x0039
            if (r0 != r3) goto L_0x00c3
            java.lang.Object r4 = r6.L$0
            X.9qv r4 = (X.C193949qv) r4
            X.C30691eM.A01(r2)
        L_0x0028:
            X.9pd r2 = (X.C193159pd) r2
            X.9pa r2 = r2.A00
            X.9pb r1 = r4.A00
            X.9q2 r0 = new X.9q2
            r0.<init>(r2, r1)
            X.8yZ r1 = new X.8yZ
            r1.<init>(r0)
            return r1
        L_0x0039:
            java.lang.Object r1 = r6.L$0
            com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler r1 = (com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler) r1
            X.C30691eM.A01(r2)
            goto L_0x0055
        L_0x0041:
            X.C30691eM.A01(r2)
            X.9pe r2 = X.C197529wq.A00
            com.whatsapp.passkeys.PasskeyFacade r1 = r8.A02
            X.Awp r0 = X.C22049Awp.A00
            r6.L$0 = r8
            r6.label = r4
            java.lang.Object r2 = r1.A01(r9, r2, r6, r0)
            if (r2 == r7) goto L_0x00d9
            r1 = r8
        L_0x0055:
            X.9MT r2 = (X.AnonymousClass9MT) r2
            boolean r0 = r2 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x0078
            X.8yZ r2 = (X.C175348yZ) r2
            java.lang.Object r4 = r2.A00
            X.9qv r4 = (X.C193949qv) r4
            X.B5O r2 = r4.A01
            boolean r0 = r2 instanceof X.AX1
            if (r0 != 0) goto L_0x00cd
            boolean r0 = r2 instanceof X.AX2
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = "encb/PasskeyBackupEnabler/enableAndCreatePasskey/prf not supported"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.9I8 r0 = X.AnonymousClass9I8.PRF_NOT_SUPPORTED
        L_0x0072:
            X.8yY r1 = new X.8yY
            r1.<init>(r0)
            return r1
        L_0x0078:
            boolean r0 = r2 instanceof X.C175338yY
            if (r0 == 0) goto L_0x00d4
            X.8yY r2 = (X.C175338yY) r2
            java.lang.Object r2 = r2.A00
            X.A1b r2 = (X.C19966A1b) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "encb/PasskeyBackupEnabler/enableAndCreatePasskey/error: "
            X.C17900vP.A0X(r2, r0, r1)
            java.lang.Integer r0 = r2.A00
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x00a1
            if (r1 == r4) goto L_0x00a1
            if (r1 == r3) goto L_0x00a1
            r0 = 3
            if (r1 == r0) goto L_0x009e
            X.9I8 r0 = X.AnonymousClass9I8.INELIGIBLE
            goto L_0x0072
        L_0x009e:
            X.9I8 r0 = X.AnonymousClass9I8.USER_CANCELED
            goto L_0x0072
        L_0x00a1:
            X.9I8 r0 = X.AnonymousClass9I8.OTHER_PASSKEY_ERROR
            goto L_0x0072
        L_0x00a4:
            boolean r0 = r2 instanceof X.AX0
            if (r0 == 0) goto L_0x00c8
            X.AX0 r2 = (X.AX0) r2
            X.0wl r1 = r1.A04
            com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler$enableAndCreatePasskey$encapsulationKey$1 r0 = new com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler$enableAndCreatePasskey$encapsulationKey$1
            r0.<init>(r2, r5)
            r6.L$0 = r4
            r6.label = r3
            java.lang.Object r2 = X.C30451dy.A00(r6, r1, r0)
            if (r2 != r7) goto L_0x0028
            return r7
        L_0x00bc:
            X.AnV r6 = new X.AnV
            r6.<init>(r8, r10)
            goto L_0x0012
        L_0x00c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00c8:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00cd:
            java.lang.String r0 = "This cannot happen, we did request PRF"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00d4:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00d9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler.A02(android.app.Activity, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(android.app.Activity r9, X.C30391dr r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C21677Ao6
            if (r0 == 0) goto L_0x00da
            r4 = r10
            X.Ao6 r4 = (X.C21677Ao6) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00da
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 2
            r6 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r0 == r6) goto L_0x006e
            if (r0 != r3) goto L_0x00e1
            java.lang.Object r7 = r4.L$0
            X.9pb r7 = (X.C193139pb) r7
            X.C30691eM.A01(r1)
            X.9pd r1 = (X.C193159pd) r1
            X.9pa r1 = r1.A00
        L_0x002c:
            X.9pa r1 = (X.C193129pa) r1
            X.9q2 r0 = new X.9q2
            r0.<init>(r1, r7)
            X.8yZ r1 = new X.8yZ
            r1.<init>(r0)
            return r1
        L_0x0039:
            X.C30691eM.A01(r1)
            com.whatsapp.passkeys.PasskeyExistsCache r0 = r8.A01
            X.1G1 r0 = r0.A03
            java.lang.Object r1 = r0.getValue()
            X.B5N r1 = (X.B5N) r1
            boolean r0 = r1 instanceof X.C20741AWw
            if (r0 == 0) goto L_0x0062
            X.AWw r1 = (X.C20741AWw) r1
            X.9pb r7 = r1.A00
            if (r7 == 0) goto L_0x006b
            X.9pe r1 = X.C197529wq.A00
            com.whatsapp.passkeys.PasskeyAndroidApiImpl r0 = r8.A00
            r4.L$0 = r8
            r4.L$1 = r7
            r4.label = r6
            java.lang.Object r1 = r0.A05(r9, r7, r1, r4)
            if (r1 == r5) goto L_0x00e6
            r6 = r8
            goto L_0x0079
        L_0x0062:
            boolean r0 = r1 instanceof X.C20742AWx
            if (r0 != 0) goto L_0x006b
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x006b:
            X.9II r0 = X.AnonymousClass9II.USER_HAS_NO_PASSKEY
            goto L_0x0094
        L_0x006e:
            java.lang.Object r7 = r4.L$1
            X.9pb r7 = (X.C193139pb) r7
            java.lang.Object r6 = r4.L$0
            com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler r6 = (com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler) r6
            X.C30691eM.A01(r1)
        L_0x0079:
            X.9MT r1 = (X.AnonymousClass9MT) r1
            boolean r0 = r1 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x009a
            X.8yZ r1 = (X.C175348yZ) r1
            java.lang.Object r1 = r1.A00
            X.B5O r1 = (X.B5O) r1
            boolean r0 = r1 instanceof X.AX1
            if (r0 != 0) goto L_0x00ec
            boolean r0 = r1 instanceof X.AX2
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = "encb/PasskeyBackupEnabler/enableWithExistingPasskey/prf not supported"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.9II r0 = X.AnonymousClass9II.PRF_NOT_SUPPORTED
        L_0x0094:
            X.8yY r1 = new X.8yY
            r1.<init>(r0)
            return r1
        L_0x009a:
            boolean r0 = r1 instanceof X.C175338yY
            if (r0 == 0) goto L_0x00f3
            X.8yY r1 = (X.C175338yY) r1
            java.lang.Object r2 = r1.A00
            X.A1a r2 = (X.C19965A1a) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "encb/PasskeyBackupEnabler/enableWithExistingPasskey/error: "
            X.C17900vP.A0Z(r2, r0, r1)
            java.lang.Integer r0 = r2.A00
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x00c4
            r0 = 1
            if (r1 == r0) goto L_0x00c1
            if (r1 == r3) goto L_0x00be
            X.9II r0 = X.AnonymousClass9II.OTHER_PASSKEY_ERROR
            goto L_0x0094
        L_0x00be:
            X.9II r0 = X.AnonymousClass9II.PASSKEY_NOT_ON_DEVICE_OR_DENIED_ACCESS_TO_PASSKEY
            goto L_0x0094
        L_0x00c1:
            X.9II r0 = X.AnonymousClass9II.USER_CANCELED
            goto L_0x0094
        L_0x00c4:
            X.9II r0 = X.AnonymousClass9II.INELIGIBLE
            goto L_0x0094
        L_0x00c7:
            boolean r0 = r1 instanceof X.AX0
            if (r0 == 0) goto L_0x00e7
            X.AX0 r1 = (X.AX0) r1
            r4.L$0 = r7
            r4.L$1 = r2
            r4.label = r3
            java.lang.Object r1 = A00(r6, r1, r4)
            if (r1 != r5) goto L_0x002c
            return r5
        L_0x00da:
            X.Ao6 r4 = new X.Ao6
            r4.<init>(r8, r10)
            goto L_0x0012
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00e6:
            return r5
        L_0x00e7:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00ec:
            java.lang.String r0 = "This cannot happen, we did request PRF"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00f3:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler.A03(android.app.Activity, X.1dr):java.lang.Object");
    }

    public PasskeyBackupEnabler(PasskeyAndroidApiImpl passkeyAndroidApiImpl, PasskeyExistsCache passkeyExistsCache, B8U b8u, B8V b8v, C18600wl r6) {
        C18070vi.A0j(b8u, b8v);
        C72473Md.A1M(passkeyAndroidApiImpl, passkeyExistsCache, r6, 3);
        this.A00 = passkeyAndroidApiImpl;
        this.A01 = passkeyExistsCache;
        this.A04 = r6;
        C191519mj BGc = b8v.BGc(3);
        this.A03 = BGc;
        this.A02 = b8u.BGb(BGc);
    }
}
