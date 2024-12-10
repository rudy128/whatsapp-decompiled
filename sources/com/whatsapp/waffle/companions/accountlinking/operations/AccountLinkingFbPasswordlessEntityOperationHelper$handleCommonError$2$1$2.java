package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass705;
import X.C122936Sm;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C34891lF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2$1$2", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {353}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2$1$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122936Sm $e;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ C18090vk $retryRunnable;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2$1$2(AnonymousClass705 r2, C122936Sm r3, C34891lF r4, C30391dr r5, C18090vk r6) {
        super(2, r5);
        this.this$0 = r4;
        this.$e = r3;
        this.$operationRetryState = r2;
        this.$retryRunnable = r6;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C34891lF r3 = this.this$0;
        return new AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2$1$2(this.$operationRetryState, this.$e, r3, r8, this.$retryRunnable);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C34891lF r0 = this.this$0;
            C122936Sm r5 = this.$e;
            AnonymousClass705 r4 = this.$operationRetryState;
            C18090vk r3 = this.$retryRunnable;
            this.label = 1;
            obj = C30451dy.A00(this, r0.A08, new AccountLinkingFbPasswordlessEntityOperationHelper$retryWithBackoff$2(r4, r5, (C30391dr) null, r3));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2$1$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
