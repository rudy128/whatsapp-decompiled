package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6OB;
import X.AnonymousClass6U6;
import X.AnonymousClass705;
import X.C122936Sm;
import X.C1418477e;
import X.C18070vi;
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

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$1", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C1418477e $fbId;
    public final /* synthetic */ C1418477e $nonce;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ AnonymousClass6U6 $sendDataResult;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$1(AnonymousClass705 r2, C1418477e r3, C1418477e r4, C34891lF r5, AnonymousClass6U6 r6, X509Certificate x509Certificate, C30391dr r8) {
        super(2, r8);
        this.this$0 = r5;
        this.$sendDataResult = r6;
        this.$encryptionCert = x509Certificate;
        this.$nonce = r3;
        this.$fbId = r4;
        this.$operationRetryState = r2;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        C34891lF r4 = this.this$0;
        AnonymousClass6U6 r5 = this.$sendDataResult;
        X509Certificate x509Certificate = this.$encryptionCert;
        return new AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$1(this.$operationRetryState, this.$nonce, this.$fbId, r4, r5, x509Certificate, r10);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C34891lF r8 = this.this$0;
            Exception exc = ((AnonymousClass6OB) this.$sendDataResult).A00;
            C18070vi.A0z(exc, "null cannot be cast to non-null type com.whatsapp.protocol.IqResponseErrorException");
            X509Certificate x509Certificate = this.$encryptionCert;
            C1418477e r5 = this.$nonce;
            C1418477e r6 = this.$fbId;
            AnonymousClass705 r4 = this.$operationRetryState;
            this.label = 1;
            obj = C30451dy.A00(this, r8.A08, new AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2(r4, r5, r6, (C122936Sm) exc, r8, x509Certificate, (C30391dr) null));
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
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$awaitRefreshAccessTokenWithNonce$2$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
