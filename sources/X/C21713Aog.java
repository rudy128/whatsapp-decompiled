package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {1, 1, 1, 1, 1, 1, 1, 1}, l = {783, 829}, m = "startFlowInternal", n = {"this", "flowsContextParams", "pslData", "flowReadyCallback", "flowTerminationCallback", "stateMachineInputParams", "phoenixSessionConfig", "isDraft"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0"})
/* renamed from: X.Aog  reason: case insensitive filesystem */
public final class C21713Aog extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21713Aog(PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C30391dr r2) {
        super(r2);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PhoenixFlowsManagerWithCoroutines.A00((A2N) null, this.this$0, (C195709tm) null, (B9G) null, (C22521BBe) null, (String) null, this);
    }
}
