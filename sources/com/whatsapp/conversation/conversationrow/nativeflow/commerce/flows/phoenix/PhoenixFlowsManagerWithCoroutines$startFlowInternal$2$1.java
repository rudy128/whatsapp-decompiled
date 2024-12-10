package com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix;

import X.A2N;
import X.A2V;
import X.A2X;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7NX;
import X.B9G;
import X.C18070vi;
import X.C193199ph;
import X.C22042Awi;
import X.C22043Awj;
import X.C22521BBe;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$startFlowInternal$2$1", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixFlowsManagerWithCoroutines$startFlowInternal$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ B9G $flowReadyCallback;
    public final /* synthetic */ C22521BBe $flowTerminationCallback;
    public final /* synthetic */ A2N $flowsContextParams;
    public final /* synthetic */ String $it;
    public final /* synthetic */ C193199ph $phoenixSessionConfig;
    public final /* synthetic */ String $pslData;
    public final /* synthetic */ Map $stateMachineInputParams;
    public int label;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixFlowsManagerWithCoroutines$startFlowInternal$2$1(A2N a2n, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, B9G b9g, C22521BBe bBe, C193199ph r6, String str, String str2, Map map, C30391dr r10) {
        super(2, r10);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$it = str;
        this.$phoenixSessionConfig = r6;
        this.$flowsContextParams = a2n;
        this.$pslData = str2;
        this.$stateMachineInputParams = map;
        this.$flowReadyCallback = b9g;
        this.$flowTerminationCallback = bBe;
    }

    public final C30391dr create(Object obj, C30391dr r12) {
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.this$0;
        String str = this.$it;
        C193199ph r5 = this.$phoenixSessionConfig;
        return new PhoenixFlowsManagerWithCoroutines$startFlowInternal$2$1(this.$flowsContextParams, phoenixFlowsManagerWithCoroutines, this.$flowReadyCallback, this.$flowTerminationCallback, r5, str, this.$pslData, this.$stateMachineInputParams, r12);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            A2X A02 = ((A2V) this.this$0.A0M.get()).A02(this.$it);
            String A0G = C18070vi.A0G(this.this$0.A08, 2131890451);
            String A0G2 = C18070vi.A0G(this.this$0.A08, 2131898593);
            String A0G3 = C18070vi.A0G(this.this$0.A08, 2131892908);
            PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.this$0;
            C193199ph r8 = this.$phoenixSessionConfig;
            A2N a2n = this.$flowsContextParams;
            String str = this.$pslData;
            Map map = this.$stateMachineInputParams;
            B9G b9g = this.$flowReadyCallback;
            C22521BBe bBe = this.$flowTerminationCallback;
            A02.A02(new AnonymousClass7NX(A0G, A0G2, A0G3, new C22042Awi(a2n, phoenixFlowsManagerWithCoroutines, b9g, bBe, r8, str, map), new C22043Awj(a2n, phoenixFlowsManagerWithCoroutines, b9g, bBe, r8, str, map)));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhoenixFlowsManagerWithCoroutines$startFlowInternal$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
