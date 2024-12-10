package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6p7;
import X.AnonymousClass705;
import X.AnonymousClass7SI;
import X.C122936Sm;
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

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$errorHandlerResult$1", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$errorHandlerResult$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122936Sm $e;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ int $errorCode;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ AnonymousClass6p7 $user;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$errorHandlerResult$1(AnonymousClass6p7 r2, AnonymousClass705 r3, C122936Sm r4, C34891lF r5, X509Certificate x509Certificate, C30391dr r7, int i) {
        super(2, r7);
        this.this$0 = r5;
        this.$errorCode = i;
        this.$e = r4;
        this.$operationRetryState = r3;
        this.$encryptionCert = x509Certificate;
        this.$user = r2;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        C34891lF r4 = this.this$0;
        int i = this.$errorCode;
        C122936Sm r3 = this.$e;
        return new AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$errorHandlerResult$1(this.$user, this.$operationRetryState, r3, r4, this.$encryptionCert, r10, i);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C34891lF r7 = this.this$0;
            int i2 = this.$errorCode;
            C122936Sm r6 = this.$e;
            AnonymousClass705 r5 = this.$operationRetryState;
            AnonymousClass7SI r9 = new AnonymousClass7SI(this.$user, r5, r7, this.$encryptionCert);
            this.label = 1;
            obj = C30451dy.A00(this, r7.A08, new AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonAccessTokenError$2(r5, r6, r7, (C30391dr) null, r9, i2));
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$handlePingError$2$1$errorHandlerResult$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
