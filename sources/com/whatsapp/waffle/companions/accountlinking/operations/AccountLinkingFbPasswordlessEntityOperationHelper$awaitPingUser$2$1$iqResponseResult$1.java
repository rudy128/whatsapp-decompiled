package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OZ;
import X.AnonymousClass61Q;
import X.C122206Od;
import X.C17880vN;
import X.C27621Wu;
import X.C29621ca;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C34891lF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$iqResponseResult$1", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$iqResponseResult$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122206Od $data;
    public final /* synthetic */ String $iqId;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$iqResponseResult$1(C34891lF r2, C122206Od r3, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$iqId = str;
        this.$data = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$iqResponseResult$1(this.this$0, this.$data, this.$iqId, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OZ A0U = C17880vN.A0U(this.this$0.A07);
            String str = this.$iqId;
            C29621ca A00 = ((AnonymousClass61Q) this.this$0.A06.get()).A00(this.$data, this.$iqId, 83);
            this.label = 1;
            obj = A0U.A0A(A00, str, this, 264, 32000, false);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$awaitPingUser$2$1$iqResponseResult$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
