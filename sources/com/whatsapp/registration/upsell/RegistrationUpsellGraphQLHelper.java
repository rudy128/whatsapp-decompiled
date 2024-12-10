package com.whatsapp.registration.upsell;

import X.AnonymousClass00H;
import X.C18070vi;

public final class RegistrationUpsellGraphQLHelper {
    public final AnonymousClass00H A00;

    public RegistrationUpsellGraphQLHelper(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r7, X.C30391dr r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C21633AnO
            if (r0 == 0) goto L_0x001e
            r5 = r8
            X.AnO r5 = (X.C21633AnO) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x001e
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 != r3) goto L_0x0024
            goto L_0x0052
        L_0x001e:
            X.AnO r5 = new X.AnO
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x0024:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0029:
            X.C30691eM.A01(r2)
            X.A7K r2 = X.A7K.A00()
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.String r0 = "input"
            r2.A07(r0, r7)
            java.lang.Class<com.whatsapp.infra.graphql.generated.registration.RegistrationUpsellShownResponseImpl> r1 = com.whatsapp.infra.graphql.generated.registration.RegistrationUpsellShownResponseImpl.class
            java.lang.String r0 = "RegistrationUpsellShown"
            X.AIj r1 = X.AIj.A00(r2, r1, r0)
            X.00H r0 = r6.A00     // Catch:{ 1Uc -> 0x006a }
            X.A2g r1 = X.C108975cc.A0J(r1, r0)     // Catch:{ 1Uc -> 0x006a }
            r5.label = r3     // Catch:{ 1Uc -> 0x006a }
            X.B33 r0 = X.B33.A00     // Catch:{ 1Uc -> 0x006a }
            java.lang.Object r2 = r1.A01(r5, r0)     // Catch:{ 1Uc -> 0x006a }
            if (r2 != r4) goto L_0x0055
            return r4
        L_0x0052:
            X.C30691eM.A01(r2)     // Catch:{ 1Uc -> 0x006a }
        L_0x0055:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1Uc -> 0x006a }
            java.lang.String r0 = "RegistrationUpsellProtocolHelper/sendRegistrationUpsellShown/onData: "
            r1.append(r0)     // Catch:{ 1Uc -> 0x006a }
            X.A8k r2 = (X.C20125A8k) r2     // Catch:{ 1Uc -> 0x006a }
            java.lang.String r0 = "xwa2_reg_upsell_shown"
            boolean r0 = r2.A0G(r0)     // Catch:{ 1Uc -> 0x006a }
            X.C17900vP.A0r(r1, r0)     // Catch:{ 1Uc -> 0x006a }
            goto L_0x007c
        L_0x006a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RegistrationUpsellProtocolHelper/sendRegistrationUpsellShown/onError : "
            r1.append(r0)
            X.A6Z r0 = r2.error
            r1.append(r0)
            X.C17890vO.A0w(r1)
        L_0x007c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.upsell.RegistrationUpsellGraphQLHelper.A00(java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C30391dr r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C21632AnN
            if (r0 == 0) goto L_0x0054
            r5 = r7
            X.AnN r5 = (X.C21632AnN) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0054
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r3) goto L_0x005a
            X.C30691eM.A01(r2)
        L_0x0020:
            X.A8k r2 = (X.C20125A8k) r2
            com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell r1 = com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "xwa2_reg_upsells"
            X.1IX r0 = r2.A0B(r1, r0)
            if (r0 != 0) goto L_0x0033
            X.1IX r0 = X.AnonymousClass1IX.of()
            X.C18070vi.A0X(r0)
        L_0x0033:
            return r0
        L_0x0034:
            X.C30691eM.A01(r2)
            X.A7K r2 = X.A7K.A00()
            java.lang.Class<com.whatsapp.infra.graphql.generated.registration.GetRegistrationUpsellsResponseImpl> r1 = com.whatsapp.infra.graphql.generated.registration.GetRegistrationUpsellsResponseImpl.class
            java.lang.String r0 = "GetRegistrationUpsells"
            X.AIj r1 = X.AIj.A00(r2, r1, r0)
            X.00H r0 = r6.A00
            X.A2g r1 = X.C108975cc.A0J(r1, r0)
            r5.label = r3
            X.B33 r0 = X.B33.A00
            java.lang.Object r2 = r1.A01(r5, r0)
            if (r2 != r4) goto L_0x0020
            return r4
        L_0x0054:
            X.AnN r5 = new X.AnN
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x005a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.upsell.RegistrationUpsellGraphQLHelper.A01(X.1dr):java.lang.Object");
    }
}
