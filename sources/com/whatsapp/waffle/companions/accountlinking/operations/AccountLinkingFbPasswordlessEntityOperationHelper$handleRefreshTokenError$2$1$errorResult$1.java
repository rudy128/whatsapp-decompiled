package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass705;
import X.AnonymousClass7SJ;
import X.C122936Sm;
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

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {209}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122936Sm $e;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ int $errorCode;
    public final /* synthetic */ C1418477e $fbid;
    public final /* synthetic */ C1418477e $nonce;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1(AnonymousClass705 r2, C1418477e r3, C1418477e r4, C122936Sm r5, C34891lF r6, X509Certificate x509Certificate, C30391dr r8, int i) {
        super(2, r8);
        this.this$0 = r6;
        this.$errorCode = i;
        this.$e = r5;
        this.$operationRetryState = r2;
        this.$nonce = r3;
        this.$fbid = r4;
        this.$encryptionCert = x509Certificate;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        C34891lF r5 = this.this$0;
        int i = this.$errorCode;
        return new AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1(this.$operationRetryState, this.$nonce, this.$fbid, this.$e, r5, this.$encryptionCert, r11, i);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj2);
            C34891lF r7 = this.this$0;
            int i2 = this.$errorCode;
            C122936Sm r6 = this.$e;
            AnonymousClass705 r5 = this.$operationRetryState;
            AnonymousClass7SJ r11 = new AnonymousClass7SJ(r5, this.$nonce, this.$fbid, r7, this.$encryptionCert);
            this.label = 1;
            obj2 = C30451dy.A00(this, r7.A08, new AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonAccessTokenError$2(r5, r6, r7, (C30391dr) null, r11, i2));
            if (obj2 == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj2);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$handleRefreshTokenError$2$1$errorResult$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
