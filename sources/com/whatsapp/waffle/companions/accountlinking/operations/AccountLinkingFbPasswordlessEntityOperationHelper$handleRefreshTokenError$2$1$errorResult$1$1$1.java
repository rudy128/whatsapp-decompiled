package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass705;
import X.C1418477e;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C34891lF;
import java.security.cert.X509Certificate;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1$1$1", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C1418477e $fbid;
    public final /* synthetic */ C1418477e $nonce;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1$1$1(AnonymousClass705 r2, C1418477e r3, C1418477e r4, C34891lF r5, X509Certificate x509Certificate, C30391dr r7) {
        super(2, r7);
        this.this$0 = r5;
        this.$nonce = r3;
        this.$fbid = r4;
        this.$encryptionCert = x509Certificate;
        this.$operationRetryState = r2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C34891lF r4 = this.this$0;
        return new AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1$1$1(this.$operationRetryState, this.$nonce, this.$fbid, r4, this.$encryptionCert, r9);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C34891lF r7 = this.this$0;
            C1418477e r5 = this.$nonce;
            C1418477e r6 = this.$fbid;
            X509Certificate x509Certificate = this.$encryptionCert;
            AnonymousClass705 r4 = this.$operationRetryState;
            this.label = 1;
            obj = C30451dy.A00(this, r7.A08, new AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2(r4, r5, r6, r7, x509Certificate, (C30391dr) null));
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
