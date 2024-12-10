package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass1OS;
import X.AnonymousClass705;
import X.C122936Sm;
import X.C1418477e;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C34891lF;
import java.security.cert.X509Certificate;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122936Sm $e;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C1418477e $fbid;
    public final /* synthetic */ C1418477e $nonce;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2(AnonymousClass705 r2, C1418477e r3, C1418477e r4, C122936Sm r5, C34891lF r6, X509Certificate x509Certificate, C30391dr r8) {
        super(2, r8);
        this.$e = r5;
        this.this$0 = r6;
        this.$operationRetryState = r2;
        this.$nonce = r3;
        this.$fbid = r4;
        this.$encryptionCert = x509Certificate;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        return new AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2(this.$operationRetryState, this.$nonce, this.$fbid, this.$e, this.this$0, this.$encryptionCert, r10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            r4 = r15
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r14.label
            r0 = 1
            if (r1 == 0) goto L_0x000e
            if (r1 != r0) goto L_0x008e
            X.C30691eM.A01(r15)
        L_0x000d:
            return r4
        L_0x000e:
            X.C30691eM.A01(r15)
            X.6Sm r9 = r14.$e
            X.1lF r10 = r14.this$0
            X.705 r6 = r14.$operationRetryState
            X.77e r7 = r14.$nonce
            X.77e r8 = r14.$fbid
            java.security.cert.X509Certificate r11 = r14.$encryptionCert
            r14.L$0 = r9
            r14.L$1 = r10
            r14.L$2 = r6
            r14.L$3 = r7
            r14.L$4 = r8
            r14.L$5 = r11
            r14.label = r0
            X.1g7 r1 = X.C72473Md.A0m(r14)
            int r13 = X.C122936Sm.A00(r9)
            r12 = 0
            com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1 r5 = new com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.1OR r4 = X.AnonymousClass1OR.A00
            java.lang.Object r3 = X.AnonymousClass4GT.A00(r4, r5)
            X.6U6 r3 = (X.AnonymousClass6U6) r3
            boolean r0 = r3 instanceof X.AnonymousClass6OA
            if (r0 != 0) goto L_0x0050
            boolean r0 = r3 instanceof X.AnonymousClass6OB
            if (r0 == 0) goto L_0x005a
            r0 = r3
            X.6OB r0 = (X.AnonymousClass6OB) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x005a
        L_0x0050:
            r1.resumeWith(r3)
        L_0x0053:
            java.lang.Object r4 = r1.A0C()
            if (r4 != r2) goto L_0x000d
            return r2
        L_0x005a:
            r0 = 401(0x191, float:5.62E-43)
            r3 = 2
            if (r13 == r0) goto L_0x007e
            r0 = 480(0x1e0, float:6.73E-43)
            if (r13 == r0) goto L_0x006f
            r0 = 484(0x1e4, float:6.78E-43)
            if (r13 == r0) goto L_0x0084
            X.C109005cf.A0H(r13)
            X.6OB r3 = X.AnonymousClass6OB.A00(r9)
            goto L_0x0050
        L_0x006f:
            com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$1 r5 = new com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$1
            r9 = r10
            r10 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r0 = X.AnonymousClass4GT.A00(r4, r5)
            r1.resumeWith(r0)
            goto L_0x0053
        L_0x007e:
            X.6OS r0 = new X.6OS
            r0.<init>(r9)
            goto L_0x0089
        L_0x0084:
            X.6OR r0 = new X.6OR
            r0.<init>(r3, r9)
        L_0x0089:
            X.6OB r3 = X.AnonymousClass6OB.A00(r0)
            goto L_0x0050
        L_0x008e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
