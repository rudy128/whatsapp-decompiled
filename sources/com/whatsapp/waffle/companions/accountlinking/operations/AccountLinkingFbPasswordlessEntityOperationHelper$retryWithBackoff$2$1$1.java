package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$retryWithBackoff$2$1$1", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {388}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$retryWithBackoff$2$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $delay;
    public final /* synthetic */ C18090vk $r;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$retryWithBackoff$2$1$1(C30391dr r2, C18090vk r3, long j) {
        super(2, r2);
        this.$delay = j;
        this.$r = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AccountLinkingFbPasswordlessEntityOperationHelper$retryWithBackoff$2$1$1(r6, this.$r, this.$delay);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            long j = this.$delay;
            this.label = 1;
            if (C62882s9.A00(this, j) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return this.$r.invoke();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$retryWithBackoff$2$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
