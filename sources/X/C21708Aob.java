package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {355, 380, 382}, m = "forceFetchMetadataAndCheckBusiness", n = {"this", "flowsContextParams", "flowReadyCallback", "flowTerminationCallback", "instanceKey", "this", "flowsContextParams"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1"})
/* renamed from: X.Aob  reason: case insensitive filesystem */
public final class C21708Aob extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21708Aob(PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C30391dr r2) {
        super(r2);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PhoenixFlowsManagerWithCoroutines.A03((A2N) null, this.this$0, (B9G) null, (C22521BBe) null, this, 0);
    }
}
