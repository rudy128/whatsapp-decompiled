package X;

import com.whatsapp.flows.webview.bridge.factory.impl.FlowsComplete;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.factory.impl.FlowsComplete", f = "FlowsComplete.kt", i = {0}, l = {38}, m = "execute", n = {"this"}, s = {"L$0"})
/* renamed from: X.Ana  reason: case insensitive filesystem */
public final class C21645Ana extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowsComplete this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21645Ana(FlowsComplete flowsComplete, C30391dr r2) {
        super(r2);
        this.this$0 = flowsComplete;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A04(this);
    }
}
