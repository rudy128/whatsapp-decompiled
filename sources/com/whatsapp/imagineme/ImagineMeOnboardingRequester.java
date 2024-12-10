package com.whatsapp.imagineme;

import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1PY;
import X.C18070vi;

public final class ImagineMeOnboardingRequester {
    public final AnonymousClass11S A00;
    public final AnonymousClass1PY A01;
    public final AnonymousClass10I A02;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C30391dr r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C100404uS
            if (r0 == 0) goto L_0x005b
            r3 = r8
            X.4uS r3 = (X.C100404uS) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005b
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r2 = r3.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r3.label
            r0 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 != r0) goto L_0x0061
            X.C30691eM.A01(r2)
        L_0x0020:
            X.1eK r2 = (X.C30671eK) r2
            java.lang.Object r0 = r2.value
            return r0
        L_0x0025:
            X.C30691eM.A01(r2)
            r3.L$0 = r7
            r3.label = r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C71053Dp.A01
            X.1dr r0 = X.C30581eB.A02(r3)
            X.3Dp r5 = new X.3Dp
            r5.<init>(r0)
            r0 = 4
            X.41r r4 = new X.41r
            r4.<init>(r5, r0)
            X.A7K r3 = new X.A7K
            r3.<init>()
            java.lang.Class<com.whatsapp.infra.graphql.generated.bots.DeleteImagineMeOnboardingResponseImpl> r2 = com.whatsapp.infra.graphql.generated.bots.DeleteImagineMeOnboardingResponseImpl.class
            java.lang.String r0 = "DeleteImagineMeOnboarding"
            X.AIj r1 = new X.AIj
            r1.<init>(r3, r2, r0)
            X.1PY r0 = r7.A01
            X.A2g r0 = r0.A01(r1)
            r0.A03(r4)
            java.lang.Object r2 = r5.A00()
            if (r2 != r6) goto L_0x0020
            return r6
        L_0x005b:
            X.4uS r3 = new X.4uS
            r3.<init>(r7, r8)
            goto L_0x0012
        L_0x0061:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.imagineme.ImagineMeOnboardingRequester.A00(X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C30391dr r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C100004to
            if (r0 == 0) goto L_0x001f
            r4 = r10
            X.4to r4 = (X.C100004to) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x001f
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r8 = 0
            r3 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 != r3) goto L_0x0025
            goto L_0x0076
        L_0x001f:
            X.4to r4 = new X.4to
            r4.<init>(r9, r10)
            goto L_0x0012
        L_0x0025:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002a:
            X.C30691eM.A01(r2)
            X.11S r0 = r9.A00
            X.1E2 r0 = r0.A09()
            if (r0 != 0) goto L_0x0036
            return r8
        L_0x0036:
            X.A7K r7 = new X.A7K
            r7.<init>()
            com.whatsapp.infra.graphql.generated.bots.calls.XWA2WAUsersInput r6 = new com.whatsapp.infra.graphql.generated.bots.calls.XWA2WAUsersInput
            r6.<init>()
            com.whatsapp.infra.graphql.generated.bots.calls.XWA2WAUserQueryInput r2 = new com.whatsapp.infra.graphql.generated.bots.calls.XWA2WAUserQueryInput
            r2.<init>()
            java.lang.String r1 = "jid"
            java.lang.String r0 = r0.getRawString()
            r2.A05(r1, r0)
            java.util.List r1 = X.C18070vi.A0M(r2)
            java.lang.String r0 = "query_input"
            r6.A06(r0, r1)
            java.lang.String r0 = "input"
            r7.A04(r6, r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.bots.GetImagineMeOnboardedResponseImpl> r2 = com.whatsapp.infra.graphql.generated.bots.GetImagineMeOnboardedResponseImpl.class
            java.lang.String r0 = "GetImagineMeOnboarded"
            X.AIj r1 = new X.AIj
            r1.<init>(r7, r2, r0)
            X.1PY r0 = r9.A01     // Catch:{ 1Uc -> 0x00a2 }
            X.A2g r1 = r0.A01(r1)     // Catch:{ 1Uc -> 0x00a2 }
            r4.label = r3     // Catch:{ 1Uc -> 0x00a2 }
            X.B33 r0 = X.B33.A00     // Catch:{ 1Uc -> 0x00a2 }
            java.lang.Object r2 = r1.A01(r4, r0)     // Catch:{ 1Uc -> 0x00a2 }
            if (r2 != r5) goto L_0x0079
            return r5
        L_0x0076:
            X.C30691eM.A01(r2)     // Catch:{ 1Uc -> 0x00a2 }
        L_0x0079:
            X.A8k r2 = (X.C20125A8k) r2     // Catch:{ 1Uc -> 0x00a2 }
            java.lang.String r1 = "xwa2_fetch_wa_users"
            java.lang.Class<com.whatsapp.infra.graphql.generated.bots.GetImagineMeOnboardedResponseImpl$Xwa2FetchWaUsers> r0 = com.whatsapp.infra.graphql.generated.bots.GetImagineMeOnboardedResponseImpl.Xwa2FetchWaUsers.class
            X.1IX r0 = r2.A0A(r0, r1)     // Catch:{ 1Uc -> 0x00a2 }
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = X.C29431cG.A0c(r0)     // Catch:{ 1Uc -> 0x00a2 }
            com.whatsapp.infra.graphql.generated.bots.GetImagineMeOnboardedResponseImpl$Xwa2FetchWaUsers r0 = (com.whatsapp.infra.graphql.generated.bots.GetImagineMeOnboardedResponseImpl.Xwa2FetchWaUsers) r0     // Catch:{ 1Uc -> 0x00a2 }
            if (r0 == 0) goto L_0x00a0
            com.whatsapp.infra.graphql.generated.bots.ImagineMeFieldsImpl r1 = r0.A0H()     // Catch:{ 1Uc -> 0x00a2 }
            if (r1 == 0) goto L_0x00a0
            java.lang.String r0 = "memu_onboarded"
            boolean r0 = r1.A0G(r0)     // Catch:{ 1Uc -> 0x00a2 }
            if (r0 != r3) goto L_0x00a0
        L_0x009b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch:{ 1Uc -> 0x00a2 }
            return r8
        L_0x00a0:
            r3 = 0
            goto L_0x009b
        L_0x00a2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.imagineme.ImagineMeOnboardingRequester.A01(X.1dr):java.lang.Object");
    }

    public ImagineMeOnboardingRequester(AnonymousClass11S r1, AnonymousClass1PY r2, AnonymousClass10I r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
