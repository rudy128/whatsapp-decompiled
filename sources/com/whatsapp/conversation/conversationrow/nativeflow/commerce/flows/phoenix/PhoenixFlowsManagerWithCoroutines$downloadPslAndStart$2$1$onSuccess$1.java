package com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix;

import X.A2N;
import X.AnonymousClass1OS;
import X.B9G;
import X.C195709tm;
import X.C22521BBe;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {}, l = {646, 656}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C195709tm $flowIdLink;
    public final /* synthetic */ B9G $flowReadyCallback;
    public final /* synthetic */ C22521BBe $flowTerminationCallback;
    public final /* synthetic */ A2N $flowsContextParams;
    public int label;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1(A2N a2n, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C195709tm r4, B9G b9g, C22521BBe bBe, C30391dr r7) {
        super(2, r7);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$flowsContextParams = a2n;
        this.$flowIdLink = r4;
        this.$flowReadyCallback = b9g;
        this.$flowTerminationCallback = bBe;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1(this.$flowsContextParams, this.this$0, this.$flowIdLink, this.$flowReadyCallback, this.$flowTerminationCallback, r9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r5 = 1
            r4 = 2
            if (r0 == 0) goto L_0x0012
            if (r0 == r5) goto L_0x0030
            if (r0 != r4) goto L_0x006e
            X.C30691eM.A01(r12)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r12)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r0 = r11.this$0
            X.00H r0 = r0.A0F
            java.lang.Object r2 = r0.get()
            X.9o2 r2 = (X.C192239o2) r2
            X.A2N r0 = r11.$flowsContextParams
            java.lang.String r1 = r0.A05
            int r0 = r1.hashCode()
            r11.label = r5
            java.lang.Object r12 = r2.A01(r1, r11, r0)
            if (r12 != r3) goto L_0x0033
            return r3
        L_0x0030:
            X.C30691eM.A01(r12)
        L_0x0033:
            X.1D6 r12 = (X.AnonymousClass1D6) r12
            java.lang.Object r0 = r12.first
            boolean r6 = X.AnonymousClass000.A1Y(r0)
            java.lang.Object r10 = r12.second
            java.lang.String r10 = (java.lang.String) r10
            int r5 = X.AnonymousClass8BU.A01(r6)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r0 = r11.this$0
            X.00H r0 = r0.A0K
            X.A6h r2 = X.AnonymousClass8BR.A0V(r0)
            X.A2N r0 = r11.$flowsContextParams
            java.lang.String r0 = r0.A05
            int r1 = r0.hashCode()
            short r0 = (short) r5
            r2.A08(r1, r0)
            if (r6 == 0) goto L_0x000f
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r6 = r11.this$0
            X.A2N r5 = r11.$flowsContextParams
            if (r10 == 0) goto L_0x0073
            X.9tm r7 = r11.$flowIdLink
            X.B9G r8 = r11.$flowReadyCallback
            X.BBe r9 = r11.$flowTerminationCallback
            r11.label = r4
            java.lang.Object r0 = com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A00(r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r3) goto L_0x000f
            return r3
        L_0x006e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0073:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
