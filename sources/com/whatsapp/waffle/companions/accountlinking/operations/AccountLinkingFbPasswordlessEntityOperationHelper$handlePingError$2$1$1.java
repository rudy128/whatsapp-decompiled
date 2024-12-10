package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass1OS;
import X.AnonymousClass6p7;
import X.AnonymousClass705;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C34891lF;
import java.security.cert.X509Certificate;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$1", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {289, 292}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ AnonymousClass6p7 $user;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$1(AnonymousClass6p7 r2, AnonymousClass705 r3, C34891lF r4, X509Certificate x509Certificate, C30391dr r6) {
        super(2, r6);
        this.this$0 = r4;
        this.$operationRetryState = r3;
        this.$encryptionCert = x509Certificate;
        this.$user = r2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C34891lF r3 = this.this$0;
        return new AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$1(this.$user, this.$operationRetryState, r3, this.$encryptionCert, r8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r1 = 1
            r5 = 2
            if (r0 == 0) goto L_0x0010
            if (r0 == r1) goto L_0x0028
            if (r0 != r5) goto L_0x0052
            X.C30691eM.A01(r12)
        L_0x000f:
            return r12
        L_0x0010:
            X.C30691eM.A01(r12)
            X.1lF r0 = r11.this$0
            X.1lE r4 = r0.A02
            r11.label = r1
            X.0wl r2 = r4.A02
            r1 = 0
            com.whatsapp.waffle.companions.accountlinking.operations.CompanionWaffleCertificateHelper$awaitRefreshCertificate$2 r0 = new com.whatsapp.waffle.companions.accountlinking.operations.CompanionWaffleCertificateHelper$awaitRefreshCertificate$2
            r0.<init>(r4, r1)
            java.lang.Object r12 = X.C30451dy.A00(r11, r2, r0)
            if (r12 != r3) goto L_0x002b
            return r3
        L_0x0028:
            X.C30691eM.A01(r12)
        L_0x002b:
            X.6U6 r12 = (X.AnonymousClass6U6) r12
            boolean r0 = r12 instanceof X.AnonymousClass6OA
            if (r0 == 0) goto L_0x0057
            X.705 r0 = r11.$operationRetryState
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0057
            X.1lF r8 = r11.this$0
            java.security.cert.X509Certificate r9 = r11.$encryptionCert
            X.6p7 r6 = r11.$user
            X.705 r7 = r11.$operationRetryState
            r11.label = r5
            X.0wl r0 = r8.A08
            r10 = 0
            com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2 r5 = new com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r12 = X.C30451dy.A00(r11, r0, r5)
            if (r12 != r3) goto L_0x000f
            return r3
        L_0x0052:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0057:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.waffle.coroutine.AwaitResult.Error<java.security.cert.X509Certificate>"
            X.C18070vi.A0z(r12, r0)
            X.6OB r12 = (X.AnonymousClass6OB) r12
            java.lang.Exception r0 = r12.A00
            X.6OB r12 = X.AnonymousClass6OB.A00(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
