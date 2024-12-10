package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass1OS;
import X.AnonymousClass705;
import X.C1418477e;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C34891lF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$1", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {226, 229}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C1418477e $fbid;
    public final /* synthetic */ C1418477e $nonce;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$1(AnonymousClass705 r2, C1418477e r3, C1418477e r4, C34891lF r5, C30391dr r6) {
        super(2, r6);
        this.this$0 = r5;
        this.$operationRetryState = r2;
        this.$nonce = r3;
        this.$fbid = r4;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$1(this.$operationRetryState, this.$nonce, this.$fbid, this.this$0, r8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r6 = 1
            r5 = 2
            if (r0 == 0) goto L_0x0010
            if (r0 == r6) goto L_0x0028
            if (r0 != r5) goto L_0x0058
            X.C30691eM.A01(r13)
        L_0x000f:
            return r13
        L_0x0010:
            X.C30691eM.A01(r13)
            X.1lF r0 = r12.this$0
            X.1lE r4 = r0.A02
            r12.label = r6
            X.0wl r3 = r4.A02
            r1 = 0
            com.whatsapp.waffle.companions.accountlinking.operations.CompanionWaffleCertificateHelper$awaitRefreshCertificate$2 r0 = new com.whatsapp.waffle.companions.accountlinking.operations.CompanionWaffleCertificateHelper$awaitRefreshCertificate$2
            r0.<init>(r4, r1)
            java.lang.Object r13 = X.C30451dy.A00(r12, r3, r0)
            if (r13 != r2) goto L_0x002b
            return r2
        L_0x0028:
            X.C30691eM.A01(r13)
        L_0x002b:
            X.6U6 r13 = (X.AnonymousClass6U6) r13
            boolean r0 = r13 instanceof X.AnonymousClass6OA
            if (r0 == 0) goto L_0x005d
            X.705 r0 = r12.$operationRetryState
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x005d
            X.1lF r9 = r12.this$0
            X.77e r7 = r12.$nonce
            X.77e r8 = r12.$fbid
            X.6OA r13 = (X.AnonymousClass6OA) r13
            java.lang.Object r10 = r13.A00
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            X.705 r6 = r12.$operationRetryState
            r12.label = r5
            X.0wl r0 = r9.A08
            r11 = 0
            com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2 r5 = new com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.Object r13 = X.C30451dy.A00(r12, r0, r5)
            if (r13 != r2) goto L_0x000f
            return r2
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x005d:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.waffle.coroutine.AwaitResult.Error<java.security.cert.X509Certificate>"
            X.C18070vi.A0z(r13, r0)
            X.6OB r13 = (X.AnonymousClass6OB) r13
            java.lang.Exception r0 = r13.A00
            X.6OB r13 = new X.6OB
            r13.<init>(r0, r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
