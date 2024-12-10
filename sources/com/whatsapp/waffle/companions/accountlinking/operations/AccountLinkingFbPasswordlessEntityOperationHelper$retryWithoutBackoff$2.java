package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6OB;
import X.AnonymousClass705;
import X.C122936Sm;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C72473Md;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$retryWithoutBackoff$2", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$retryWithoutBackoff$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122936Sm $e;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ C18090vk $r;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$retryWithoutBackoff$2(AnonymousClass705 r2, C122936Sm r3, C30391dr r4, C18090vk r5) {
        super(2, r4);
        this.$operationRetryState = r2;
        this.$r = r5;
        this.$e = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AccountLinkingFbPasswordlessEntityOperationHelper$retryWithoutBackoff$2(this.$operationRetryState, this.$e, r6, this.$r);
    }

    public final Object invokeSuspend(Object obj) {
        Object r0;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass705 r02 = this.$operationRetryState;
            C18090vk r3 = this.$r;
            C122936Sm r2 = this.$e;
            this.L$0 = r02;
            this.L$1 = r3;
            this.L$2 = r2;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            if (r02.A04()) {
                r0 = r3.invoke();
            } else {
                r0 = new AnonymousClass6OB(r2, true);
            }
            A0m.resumeWith(r0);
            obj = A0m.A0C();
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$retryWithoutBackoff$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
