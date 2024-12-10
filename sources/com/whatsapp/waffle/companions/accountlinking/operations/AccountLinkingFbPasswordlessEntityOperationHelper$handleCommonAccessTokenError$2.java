package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass4GT;
import X.AnonymousClass6OA;
import X.AnonymousClass6OB;
import X.AnonymousClass6OT;
import X.AnonymousClass6U6;
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
import X.C34891lF;
import X.C72473Md;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonAccessTokenError$2", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonAccessTokenError$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122936Sm $e;
    public final /* synthetic */ int $errorCode;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ C18090vk $retryRunnable;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonAccessTokenError$2(AnonymousClass705 r2, C122936Sm r3, C34891lF r4, C30391dr r5, C18090vk r6, int i) {
        super(2, r5);
        this.$errorCode = i;
        this.$e = r3;
        this.this$0 = r4;
        this.$operationRetryState = r2;
        this.$retryRunnable = r6;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        int i = this.$errorCode;
        return new AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonAccessTokenError$2(this.$operationRetryState, this.$e, this.this$0, r9, this.$retryRunnable, i);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            int i2 = this.$errorCode;
            C122936Sm r6 = this.$e;
            C34891lF r7 = this.this$0;
            AnonymousClass705 r5 = this.$operationRetryState;
            C18090vk r9 = this.$retryRunnable;
            this.L$0 = r6;
            this.L$1 = r7;
            this.L$2 = r5;
            this.L$3 = r9;
            this.I$0 = i2;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            Object obj2 = (AnonymousClass6U6) AnonymousClass4GT.A00(AnonymousClass1OR.A00, new AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonAccessTokenError$2$1$result$1(r5, r6, r7, (C30391dr) null, r9, i2));
            if (!(obj2 instanceof AnonymousClass6OA) && (!(obj2 instanceof AnonymousClass6OB) || !((AnonymousClass6OB) obj2).A01)) {
                obj2 = (i2 == 483 || i2 == 485) ? AnonymousClass6OB.A00(new AnonymousClass6OT(2, r6)) : new AnonymousClass6OB(r6, false);
            }
            A0m.resumeWith(obj2);
            obj = A0m.A0C();
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
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonAccessTokenError$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
