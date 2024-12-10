package com.whatsapp.calling.banner.viewmodel;

import X.AnonymousClass1VE;
import X.C18070vi;

public final class AnimateBannerUseCase {
    public Boolean A00;
    public final AnonymousClass1VE A01;

    public AnimateBannerUseCase(AnonymousClass1VE r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C86534Sa r9, X.C30391dr r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C100264uE
            if (r0 == 0) goto L_0x0073
            r6 = r10
            X.4uE r6 = (X.C100264uE) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0073
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 != r7) goto L_0x0079
            boolean r2 = r6.Z$0
            X.C30691eM.A01(r1)
        L_0x0022:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0027:
            X.C30691eM.A01(r1)
            java.lang.Boolean r0 = r8.A00
            if (r0 == 0) goto L_0x004a
            boolean r2 = r0.booleanValue()
        L_0x0032:
            if (r2 == 0) goto L_0x0022
            com.whatsapp.voipcalling.CallState r1 = r9.A0B
            X.C18070vi.A0W(r1)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0022
            r6.Z$0 = r2
            r6.label = r7
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.C62882s9.A00(r6, r0)
            if (r0 != r5) goto L_0x0022
            return r5
        L_0x004a:
            java.lang.String r4 = r9.A0C
            X.C18070vi.A0W(r4)
            X.1VE r3 = r8.A01
            android.content.SharedPreferences r2 = X.AnonymousClass1VE.A00(r3)
            java.lang.String r1 = "animated_banner_entry_for_callid"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.getString(r1, r0)
            boolean r0 = r4.equals(r0)
            r2 = r0 ^ 1
            if (r2 == 0) goto L_0x006c
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass3MZ.A08(r3)
            X.C17880vN.A1E(r0, r1, r4)
        L_0x006c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r8.A00 = r0
            goto L_0x0032
        L_0x0073:
            X.4uE r6 = new X.4uE
            r6.<init>(r8, r10)
            goto L_0x0012
        L_0x0079:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.banner.viewmodel.AnimateBannerUseCase.A00(X.4Sa, X.1dr):java.lang.Object");
    }
}
