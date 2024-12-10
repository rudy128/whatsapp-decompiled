package com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix;

import X.A2N;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.B9G;
import X.C170638qQ;
import X.C17890vO;
import X.C18070vi;
import X.C195709tm;
import X.C20611ARv;
import X.C22521BBe;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C195709tm $flowIdLink;
    public final /* synthetic */ B9G $flowReadyCallback;
    public final /* synthetic */ C22521BBe $flowTerminationCallback;
    public final /* synthetic */ A2N $flowsContextParams;
    public int label;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2(A2N a2n, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C195709tm r4, B9G b9g, C22521BBe bBe, C30391dr r7) {
        super(2, r7);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$flowsContextParams = a2n;
        this.$flowIdLink = r4;
        this.$flowReadyCallback = b9g;
        this.$flowTerminationCallback = bBe;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2(this.$flowsContextParams, this.this$0, this.$flowIdLink, this.$flowReadyCallback, this.$flowTerminationCallback, r9);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C170638qQ r2 = this.this$0.A0B;
            String str = this.$flowsContextParams.A05;
            C195709tm r0 = this.$flowIdLink;
            String str2 = r0.A07;
            if (str2 != null) {
                r2.A0C(new C20611ARv(this.$flowsContextParams, this.this$0, this.$flowIdLink, this.$flowReadyCallback, this.$flowTerminationCallback), str, str2, r0.A08, C18070vi.A18(r0.A00, "DRAFT"), false);
                return C27621Wu.A00;
            }
            throw C17890vO.A0K();
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
