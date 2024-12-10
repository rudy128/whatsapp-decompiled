package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines;
import java.util.Map;

/* renamed from: X.Awi  reason: case insensitive filesystem */
public final class C22042Awi extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ B9G $flowReadyCallback;
    public final /* synthetic */ C22521BBe $flowTerminationCallback;
    public final /* synthetic */ A2N $flowsContextParams;
    public final /* synthetic */ C193199ph $phoenixSessionConfig;
    public final /* synthetic */ String $pslData;
    public final /* synthetic */ Map $stateMachineInputParams;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22042Awi(A2N a2n, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, B9G b9g, C22521BBe bBe, C193199ph r6, String str, Map map) {
        super(0);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$phoenixSessionConfig = r6;
        this.$flowsContextParams = a2n;
        this.$pslData = str;
        this.$stateMachineInputParams = map;
        this.$flowReadyCallback = b9g;
        this.$flowTerminationCallback = bBe;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.this$0;
        C193199ph r4 = this.$phoenixSessionConfig;
        PhoenixFlowsManagerWithCoroutines.A06(this.$flowsContextParams, phoenixFlowsManagerWithCoroutines, this.$flowReadyCallback, this.$flowTerminationCallback, r4, this.$pslData, this.$stateMachineInputParams, true);
        return C27621Wu.A00;
    }
}
