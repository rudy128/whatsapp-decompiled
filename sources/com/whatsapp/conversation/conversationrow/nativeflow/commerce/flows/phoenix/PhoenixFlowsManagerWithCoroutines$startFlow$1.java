package com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix;

import X.A2N;
import X.AnonymousClass1OS;
import X.B9G;
import X.C172058si;
import X.C22521BBe;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$startFlow$1", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {}, l = {307, 321, 333}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixFlowsManagerWithCoroutines$startFlow$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ B9G $flowReadyCallback;
    public final /* synthetic */ C22521BBe $flowTerminationCallback;
    public final /* synthetic */ A2N $flowsContextParams;
    public int label;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixFlowsManagerWithCoroutines$startFlow$1(A2N a2n, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, B9G b9g, C22521BBe bBe, C30391dr r6) {
        super(2, r6);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$flowTerminationCallback = bBe;
        this.$flowsContextParams = a2n;
        this.$flowReadyCallback = b9g;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new PhoenixFlowsManagerWithCoroutines$startFlow$1(this.$flowsContextParams, this.this$0, this.$flowReadyCallback, this.$flowTerminationCallback, r8);
    }

    public static void A00(PhoenixFlowsManagerWithCoroutines$startFlow$1 phoenixFlowsManagerWithCoroutines$startFlow$1, boolean z) {
        ((C172058si) phoenixFlowsManagerWithCoroutines$startFlow$1.this$0.A0G.get()).A07(phoenixFlowsManagerWithCoroutines$startFlow$1.$flowsContextParams.A05.hashCode(), "metadata_cache_hit", z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.9tm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            r0 = r17
            int r5 = r0.label
            r3 = 3
            r2 = 2
            r1 = 1
            if (r5 == 0) goto L_0x0016
            if (r5 == r1) goto L_0x0219
            if (r5 == r2) goto L_0x0219
            if (r5 == r3) goto L_0x0219
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0016:
            X.C30691eM.A01(r18)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r5 = r0.this$0
            X.0ve r7 = r5.A0A
            r6 = 5333(0x14d5, float:7.473E-42)
            X.0vf r5 = X.C18040vf.A02
            boolean r5 = X.C18020vd.A05(r5, r7, r6)
            if (r5 == 0) goto L_0x0040
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r5 = r0.this$0
            X.0ve r5 = r5.A0A
            boolean r5 = X.AnonymousClass8BS.A1N(r5)
            if (r5 == 0) goto L_0x0040
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r3 = r0.this$0
            X.BBe r2 = r0.$flowTerminationCallback
            X.A2N r0 = r0.$flowsContextParams
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "extensions-features-disabled"
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A08(r3, r2, r0, r1)
            goto L_0x021c
        L_0x0040:
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r6 = r0.this$0
            X.A2N r5 = r0.$flowsContextParams
            int r5 = r5.hashCode()
            r6.A00 = r5
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r5 = r0.this$0
            X.00H r5 = r5.A0J
            X.A6h r7 = X.AnonymousClass8BR.A0V(r5)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r5 = r0.this$0
            int r6 = r5.A00
            java.lang.String r5 = "phoenixExtensionFlow"
            r7.A04(r6, r5)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r5 = r0.this$0
            X.00H r5 = r5.A0J
            X.A6h r6 = X.AnonymousClass8BR.A0V(r5)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r5 = r0.this$0
            int r11 = r5.A00
            X.A2N r5 = r0.$flowsContextParams
            java.lang.String r8 = r5.A08
            java.lang.String r9 = r5.A09
            com.whatsapp.jid.UserJid r7 = r5.A02
            java.lang.String r10 = r5.A05
            r6.A09(r7, r8, r9, r10, r11)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r5 = r0.this$0
            X.00H r5 = r5.A0J
            X.A6h r8 = X.AnonymousClass8BR.A0V(r5)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r5 = r0.this$0
            int r7 = r5.A00
            X.A2N r5 = r0.$flowsContextParams
            boolean r6 = r5.A0C
            java.lang.String r5 = "is_resumed"
            r8.A07(r7, r5, r6)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r6 = r0.this$0
            X.11P r6 = r6.A07
            long r12 = X.AnonymousClass11P.A01(r6)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r11 = r0.this$0
            X.A2N r7 = r0.$flowsContextParams
            com.whatsapp.jid.UserJid r6 = r7.A02
            java.lang.String r8 = r7.A05
            X.9uT r7 = r11.A09
            java.lang.String r6 = r6.user
            long r9 = r7.A02(r6, r8)
            r6 = 0
            int r8 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x00b0
            X.0ve r7 = r11.A0A
            r6 = 2892(0xb4c, float:4.053E-42)
            long r6 = X.AnonymousClass8BW.A07(r7, r6)
            long r6 = r6 + r9
        L_0x00b0:
            int r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r6 = r0.this$0
            if (r8 >= 0) goto L_0x00f1
            X.BBe r2 = r0.$flowTerminationCallback
            X.A2N r1 = r0.$flowsContextParams
            java.lang.String r1 = r1.A05
            java.lang.String r11 = "extensions-banned-id-error"
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A08(r6, r2, r11, r1)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r1 = r0.this$0
            X.00H r1 = r1.A0D
            java.lang.Object r2 = r1.get()
            X.A25 r2 = (X.A25) r2
            X.A2N r1 = r0.$flowsContextParams
            java.lang.String r8 = r1.A05
            com.whatsapp.jid.UserJid r5 = r1.A02
            java.lang.String r9 = r1.A08
            java.lang.String r10 = r1.A09
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r1 = r0.this$0
            X.1PM r3 = r1.A05
            X.00H r1 = r1.A0O
            java.lang.Object r4 = X.C18070vi.A0E(r1)
            X.A0M r4 = (X.A0M) r4
            X.A2N r0 = r0.$flowsContextParams
            boolean r0 = r0.A0C
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.lang.String r7 = "galaxy_message"
            r12 = 0
            r2.A03(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x021c
        L_0x00f1:
            X.00H r6 = r6.A0I
            X.8sh r8 = X.AnonymousClass8BR.A0U(r6)
            X.A2N r6 = r0.$flowsContextParams
            com.whatsapp.jid.UserJid r7 = r6.A02
            java.lang.String r6 = "user_interaction"
            r13 = 0
            int r12 = r8.A0E(r7, r6)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r6 = r0.this$0
            X.00H r6 = r6.A0I
            X.A6h r7 = X.AnonymousClass8BR.A0V(r6)
            X.A2N r6 = r0.$flowsContextParams
            java.lang.String r9 = r6.A08
            java.lang.String r10 = r6.A09
            com.whatsapp.jid.UserJid r8 = r6.A02
            java.lang.String r11 = r6.A05
            r7.A09(r8, r9, r10, r11, r12)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r6 = r0.this$0
            X.00H r6 = r6.A0E
            X.A5U r8 = X.AnonymousClass8BR.A0S(r6)
            java.lang.Integer r7 = X.AnonymousClass3MW.A0v(r12)
            X.A2N r6 = r0.$flowsContextParams
            java.lang.String r6 = r6.A05
            X.9dK r7 = r8.A03(r7, r6)
            if (r7 == 0) goto L_0x014f
            java.util.List r6 = r7.A02
            X.A2N r10 = r0.$flowsContextParams
            java.util.Iterator r11 = r6.iterator()
        L_0x0135:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x014d
            java.lang.Object r9 = r11.next()
            r6 = r9
            X.9tm r6 = (X.C195709tm) r6
            java.lang.String r8 = r6.A04
            java.lang.String r6 = r10.A05
            boolean r6 = X.C18070vi.A18(r8, r6)
            if (r6 == 0) goto L_0x0135
            r13 = r9
        L_0x014d:
            X.9tm r13 = (X.C195709tm) r13
        L_0x014f:
            r8 = 0
            if (r13 == 0) goto L_0x01f8
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r3 = r0.this$0
            X.00H r3 = r3.A0J
            X.A6h r6 = X.AnonymousClass8BR.A0V(r3)
            java.lang.String r10 = r13.A00
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r3 = r0.this$0
            int r3 = r3.A00
            r6.A0C(r10, r3)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r3 = r0.this$0
            X.00H r3 = r3.A0G
            X.A6h r6 = X.AnonymousClass8BR.A0V(r3)
            java.lang.String r3 = r13.A04
            int r3 = r3.hashCode()
            r6.A0C(r10, r3)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r3 = r0.this$0
            X.00H r3 = r3.A0G
            X.A6h r9 = X.AnonymousClass8BR.A0V(r3)
            X.A2N r3 = r0.$flowsContextParams
            boolean r6 = r3.A0C
            java.lang.String r3 = r3.A05
            int r3 = r3.hashCode()
            r9.A07(r3, r5, r6)
            java.lang.String r3 = "DRAFT"
            boolean r3 = X.C18070vi.A18(r10, r3)
            if (r3 != 0) goto L_0x01d7
            X.A2N r3 = r0.$flowsContextParams
            java.lang.String r5 = r3.A06
            java.lang.String r3 = r3.A04
            boolean r3 = com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A0A(r5, r3)
            if (r3 != 0) goto L_0x01a0
            A00(r0, r1)
        L_0x01a0:
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r3 = r0.this$0
            X.00H r3 = r3.A0I
            X.8sh r6 = X.AnonymousClass8BR.A0U(r3)
            java.lang.Integer r5 = X.AnonymousClass3MW.A0v(r12)
            java.lang.Short r3 = new java.lang.Short
            r3.<init>(r2)
            r6.A0G(r5, r3)
            X.A2N r5 = r0.$flowsContextParams
            java.lang.String r2 = r13.A03
            r5.A00 = r2
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r3 = r0.this$0
            X.BBe r2 = r0.$flowTerminationCallback
            boolean r2 = com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A09(r5, r3, r13, r7, r2)
            if (r2 != 0) goto L_0x021c
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r12 = r0.this$0
            X.A2N r11 = r0.$flowsContextParams
            X.B9G r14 = r0.$flowReadyCallback
            X.BBe r15 = r0.$flowTerminationCallback
            r0.label = r1
            r16 = r0
            java.lang.Object r0 = com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A01(r11, r12, r13, r14, r15, r16)
        L_0x01d4:
            if (r0 != r4) goto L_0x021c
            return r4
        L_0x01d7:
            A00(r0, r8)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r1 = r0.this$0
            X.00H r1 = r1.A0I
            X.8sh r3 = X.AnonymousClass8BR.A0U(r1)
            java.lang.String r1 = "draft"
            r3.A0F(r12, r1)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r6 = r0.this$0
            X.A2N r5 = r0.$flowsContextParams
            X.B9G r7 = r0.$flowReadyCallback
            X.BBe r8 = r0.$flowTerminationCallback
            r0.label = r2
            r9 = r0
            r10 = r12
            java.lang.Object r0 = com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A02(r5, r6, r7, r8, r9, r10)
            goto L_0x01d4
        L_0x01f8:
            A00(r0, r8)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r1 = r0.this$0
            X.00H r1 = r1.A0I
            X.8sh r2 = X.AnonymousClass8BR.A0U(r1)
            java.lang.String r1 = "unknown_extension"
            r2.A0F(r12, r1)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r6 = r0.this$0
            X.A2N r5 = r0.$flowsContextParams
            X.B9G r7 = r0.$flowReadyCallback
            X.BBe r8 = r0.$flowTerminationCallback
            r0.label = r3
            r9 = r0
            r10 = r12
            java.lang.Object r0 = com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A03(r5, r6, r7, r8, r9, r10)
            goto L_0x01d4
        L_0x0219:
            X.C30691eM.A01(r18)
        L_0x021c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$startFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhoenixFlowsManagerWithCoroutines$startFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
