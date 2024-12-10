package com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix;

import X.A2N;
import X.AEW;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C20486AMx;
import X.C26911Ty;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ A2N $flowsContextParams;
    public int label;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2(A2N a2n, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C30391dr r4) {
        super(2, r4);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$flowsContextParams = a2n;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2(this.$flowsContextParams, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AEW A08 = this.this$0.A03.A08(this.$flowsContextParams.A02);
            if (A08 == null || !A08.A0b) {
                PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.this$0;
                C26911Ty r4 = phoenixFlowsManagerWithCoroutines.A03;
                A2N a2n = this.$flowsContextParams;
                r4.A0F(new C20486AMx(phoenixFlowsManagerWithCoroutines, a2n, 1), a2n.A02, (String) null);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
