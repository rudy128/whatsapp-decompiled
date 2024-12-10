package com.whatsapp.waffle.companions.accountlinking.operations;

import X.C18070vi;
import X.C34871lD;
import X.C34881lE;
import X.C34891lF;
import X.C34911lH;
import X.C34921lI;

public final class CompanionWafflePingHelper {
    public final C34911lH A00;
    public final C34881lE A01;
    public final C34871lD A02;
    public final C34921lI A03;
    public final C34891lF A04;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C30391dr r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.AnonymousClass7UF
            if (r0 == 0) goto L_0x00a9
            r3 = r12
            X.7UF r3 = (X.AnonymousClass7UF) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a9
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r5 = r3.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 != r2) goto L_0x00b0
            java.lang.Object r2 = r3.L$0
            com.whatsapp.waffle.companions.accountlinking.operations.CompanionWafflePingHelper r2 = (com.whatsapp.waffle.companions.accountlinking.operations.CompanionWafflePingHelper) r2
            X.C30691eM.A01(r5)
        L_0x0024:
            X.6U6 r5 = (X.AnonymousClass6U6) r5
            boolean r0 = r5 instanceof X.AnonymousClass6OB
            if (r0 == 0) goto L_0x003c
            r0 = r5
            X.6OB r0 = (X.AnonymousClass6OB) r0
            java.lang.Exception r1 = r0.A00
            boolean r0 = r1 instanceof X.AnonymousClass6SS
            if (r0 == 0) goto L_0x003c
            boolean r0 = r1 instanceof X.AnonymousClass6OR
            if (r0 == 0) goto L_0x003d
            X.1lI r0 = r2.A03
            r0.A01()
        L_0x003c:
            return r5
        L_0x003d:
            boolean r0 = r1 instanceof X.AnonymousClass6OS
            if (r0 == 0) goto L_0x004a
            X.1lI r0 = r2.A03
            r0.A02()
            r0.A03()
            return r5
        L_0x004a:
            boolean r0 = r1 instanceof X.AnonymousClass6OT
            if (r0 == 0) goto L_0x003c
            X.1lI r0 = r2.A03
            r0.A02()
            return r5
        L_0x0054:
            X.C30691eM.A01(r5)
            X.1lH r1 = r11.A00
            X.1lW r0 = X.C35021lW.A09
            X.6p7 r6 = r1.A01(r0)
            r0 = 0
            if (r6 != 0) goto L_0x006e
            java.lang.String r0 = "user does not exist"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)
        L_0x0068:
            X.6OB r0 = new X.6OB
            r0.<init>(r1, r2)
            return r0
        L_0x006e:
            com.whatsapp.waffle.companions.accountlinking.operations.CompanionWafflePingHelper$ping$certResult$1 r1 = new com.whatsapp.waffle.companions.accountlinking.operations.CompanionWafflePingHelper$ping$certResult$1
            r1.<init>(r11, r0)
            X.1OR r0 = X.AnonymousClass1OR.A00
            java.lang.Object r1 = X.AnonymousClass4GT.A00(r0, r1)
            X.6U6 r1 = (X.AnonymousClass6U6) r1
            boolean r0 = r1 instanceof X.AnonymousClass6OA
            if (r0 == 0) goto L_0x009c
            X.1lF r8 = r11.A04
            X.6OA r1 = (X.AnonymousClass6OA) r1
            java.lang.Object r9 = r1.A00
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9
            X.705 r7 = X.C124546Yt.A00
            r3.L$0 = r11
            r3.label = r2
            X.0wl r0 = r8.A08
            r10 = 0
            com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2 r5 = new com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r5 = X.C30451dy.A00(r3, r0, r5)
            if (r5 != r4) goto L_0x00a6
            return r4
        L_0x009c:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.waffle.coroutine.AwaitResult.Error<java.security.cert.X509Certificate>"
            X.C18070vi.A0z(r1, r0)
            X.6OB r1 = (X.AnonymousClass6OB) r1
            java.lang.Exception r1 = r1.A00
            goto L_0x0068
        L_0x00a6:
            r2 = r11
            goto L_0x0024
        L_0x00a9:
            X.7UF r3 = new X.7UF
            r3.<init>(r11, r12)
            goto L_0x0012
        L_0x00b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.waffle.companions.accountlinking.operations.CompanionWafflePingHelper.A00(X.1dr):java.lang.Object");
    }

    public CompanionWafflePingHelper(C34911lH r2, C34921lI r3, C34891lF r4, C34881lE r5, C34871lD r6) {
        C18070vi.A0j(r6, r2);
        C18070vi.A0d(r3, 4);
        this.A02 = r6;
        this.A00 = r2;
        this.A01 = r5;
        this.A03 = r3;
        this.A04 = r4;
    }
}
