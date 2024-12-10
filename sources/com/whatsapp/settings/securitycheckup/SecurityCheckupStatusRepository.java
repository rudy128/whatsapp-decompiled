package com.whatsapp.settings.securitycheckup;

import X.C18070vi;
import X.C196039uM;
import X.C19830z4;
import X.C30901eh;
import com.whatsapp.passkeys.PasskeyExistsCache;

public final class SecurityCheckupStatusRepository {
    public final C19830z4 A00;
    public final C196039uM A01;
    public final PasskeyExistsCache A02;
    public final C30901eh A03;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r2.A0C() != r3) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C30391dr r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C100524ue
            if (r0 == 0) goto L_0x0057
            r5 = r7
            X.4ue r5 = (X.C100524ue) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 == r1) goto L_0x0026
            if (r0 != r2) goto L_0x005d
            X.C30691eM.A01(r4)
        L_0x0023:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0026:
            java.lang.Object r0 = r5.L$0
            com.whatsapp.settings.securitycheckup.SecurityCheckupStatusRepository r0 = (com.whatsapp.settings.securitycheckup.SecurityCheckupStatusRepository) r0
            X.C30691eM.A01(r4)
            goto L_0x003e
        L_0x002e:
            X.C30691eM.A01(r4)
            com.whatsapp.passkeys.PasskeyExistsCache r0 = r6.A02
            r5.L$0 = r6
            r5.label = r1
            java.lang.Object r0 = r0.A00(r5)
            if (r0 == r3) goto L_0x0056
            r0 = r6
        L_0x003e:
            r5.L$0 = r0
            r5.label = r2
            X.1g7 r2 = X.C72473Md.A0m(r5)
            X.9uM r1 = r0.A01
            X.5Ll r0 = new X.5Ll
            r0.<init>(r2)
            r1.A00(r0)
            java.lang.Object r0 = r2.A0C()
            if (r0 != r3) goto L_0x0023
        L_0x0056:
            return r3
        L_0x0057:
            X.4ue r5 = new X.4ue
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.securitycheckup.SecurityCheckupStatusRepository.A00(X.1dr):java.lang.Object");
    }

    public SecurityCheckupStatusRepository(C19830z4 r1, C196039uM r2, PasskeyExistsCache passkeyExistsCache, C30901eh r4) {
        C18070vi.A0s(passkeyExistsCache, r1, r4, r2);
        this.A02 = passkeyExistsCache;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }
}
