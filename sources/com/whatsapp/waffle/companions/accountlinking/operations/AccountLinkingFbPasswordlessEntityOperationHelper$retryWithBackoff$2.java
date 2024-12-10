package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass4GT;
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

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$retryWithBackoff$2", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$retryWithBackoff$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122936Sm $e;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ C18090vk $r;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$retryWithBackoff$2(AnonymousClass705 r2, C122936Sm r3, C30391dr r4, C18090vk r5) {
        super(2, r4);
        this.$operationRetryState = r2;
        this.$e = r3;
        this.$r = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AccountLinkingFbPasswordlessEntityOperationHelper$retryWithBackoff$2(this.$operationRetryState, this.$e, r6, this.$r);
    }

    public final Object invokeSuspend(Object obj) {
        Object r0;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass705 r02 = this.$operationRetryState;
            C122936Sm r2 = this.$e;
            C18090vk r5 = this.$r;
            this.L$0 = r02;
            this.L$1 = r2;
            this.L$2 = r5;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            Long A01 = r02.A01();
            if (A01 != null) {
                r0 = AnonymousClass4GT.A00(AnonymousClass1OR.A00, new AccountLinkingFbPasswordlessEntityOperationHelper$retryWithBackoff$2$1$1((C30391dr) null, r5, A01.longValue()));
            } else {
                r0 = new AnonymousClass6OB(r2, true);
            }
            A0m.resumeWith(r0);
            obj = A0m.A0C();
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
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$retryWithBackoff$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
