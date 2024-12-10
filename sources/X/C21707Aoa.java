package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {0, 0, 0, 0, 0}, l = {596, 608, 616, 623}, m = "fetchPslAndStartFlow", n = {"this", "flowsContextParams", "flowIdLink", "flowReadyCallback", "flowTerminationCallback"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* renamed from: X.Aoa  reason: case insensitive filesystem */
public final class C21707Aoa extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21707Aoa(PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C30391dr r2) {
        super(r2);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PhoenixFlowsManagerWithCoroutines.A01((A2N) null, this.this$0, (C195709tm) null, (B9G) null, (C22521BBe) null, this);
    }
}
