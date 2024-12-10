package com.whatsapp.registration.autoconf;

import X.C18070vi;
import X.C191459md;
import X.C192809p1;
import X.C19830z4;
import X.C19880zA;
import X.C86374Rj;

public final class AutoconfUseCase extends C86374Rj {
    public final C19830z4 A00;
    public final C192809p1 A01;
    public final C19880zA A02;
    public final C191459md A03;

    public AutoconfUseCase(C19880zA r2, C19830z4 r3, C192809p1 r4, C191459md r5) {
        C18070vi.A0f(r3, 1, r2);
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r5;
        this.A02 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C194629s2 r15, com.whatsapp.registration.autoconf.AutoconfUseCase r16, java.lang.String r17, X.C30391dr r18) {
        /*
            r4 = r18
            r3 = r16
            boolean r0 = r4 instanceof X.C21665Anu
            if (r0 == 0) goto L_0x00d6
            r14 = r4
            X.Anu r14 = (X.C21665Anu) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d6
            int r2 = r2 - r1
            r14.label = r2
        L_0x0016:
            java.lang.Object r6 = r14.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r14.label
            r1 = 2
            r4 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r4) goto L_0x005a
            if (r0 != r1) goto L_0x00dd
            X.C30691eM.A01(r6)
        L_0x0027:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002a:
            X.C30691eM.A01(r6)
            java.lang.String r0 = "AutoconfUseCase/onAutoconfCodeSent/attempt to verify authResponse"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9md r5 = r3.A03
            X.0z4 r0 = r3.A00
            java.lang.String r10 = X.C108955ca.A0t(r0)
            java.lang.String r11 = X.C108955ca.A0u(r0)
            X.99E r7 = r15.A01
            X.0zA r0 = r3.A02
            X.8aU r6 = X.A80.A00(r0)
            r14.L$0 = r3
            r14.label = r4
            java.lang.String r8 = "autoconf"
            r15 = 0
            r12 = 0
            r13 = r17
            r9 = r8
            r16 = r1
            java.lang.Object r6 = r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r6 != r2) goto L_0x0061
            return r2
        L_0x005a:
            java.lang.Object r3 = r14.L$0
            com.whatsapp.registration.autoconf.AutoconfUseCase r3 = (com.whatsapp.registration.autoconf.AutoconfUseCase) r3
            X.C30691eM.A01(r6)
        L_0x0061:
            X.9hy r6 = (X.C188779hy) r6
            r0 = 0
            r14.L$0 = r0
            r14.label = r1
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AutoconfUseCase/onRegisterEntrypointResponse/status="
            r5.append(r0)
            java.lang.Integer r0 = r6.A07
            java.lang.String r0 = X.C181679Rk.A00(r0)
            X.C17890vO.A1A(r5, r0)
            java.lang.Integer r0 = r6.A07
            int r7 = r0.intValue()
            r5 = 0
            if (r7 == r5) goto L_0x00b2
            r0 = 12
            if (r7 == r0) goto L_0x00c2
            r0 = 17
            if (r7 == r0) goto L_0x00ac
            if (r7 == r1) goto L_0x00a9
            X.0z4 r1 = r3.A00
            java.lang.String r0 = "autoconf_authentication_failed"
            r1.A1X(r0)
            r1.A17(r5)
            java.lang.Integer r0 = r6.A07
            java.lang.String r0 = X.C181679Rk.A00(r0)
            X.A9B.A0U(r1, r0)
            X.AdE r0 = X.C21022AdE.A00
        L_0x00a2:
            java.lang.Object r0 = r3.A02(r0, r14)
        L_0x00a6:
            if (r0 != r2) goto L_0x0027
            return r2
        L_0x00a9:
            X.AdD r0 = X.C21021AdD.A00
            goto L_0x00a2
        L_0x00ac:
            X.AdA r0 = new X.AdA
            r0.<init>(r6)
            goto L_0x00d1
        L_0x00b2:
            X.0z4 r1 = r3.A00
            java.lang.String r0 = "autoconf_authentication_successful"
            r1.A1X(r0)
            r1.A17(r4)
            X.AdB r0 = new X.AdB
            r0.<init>(r6)
            goto L_0x00d1
        L_0x00c2:
            X.0z4 r1 = r3.A00
            java.lang.String r0 = "autoconf_authentication_successful"
            r1.A1X(r0)
            r1.A17(r4)
            X.Ad9 r0 = new X.Ad9
            r0.<init>(r6)
        L_0x00d1:
            java.lang.Object r0 = r3.A02(r0, r14)
            goto L_0x00a6
        L_0x00d6:
            X.Anu r14 = new X.Anu
            r14.<init>(r3, r4)
            goto L_0x0016
        L_0x00dd:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.autoconf.AutoconfUseCase.A00(X.9s2, com.whatsapp.registration.autoconf.AutoconfUseCase, java.lang.String, X.1dr):java.lang.Object");
    }
}
