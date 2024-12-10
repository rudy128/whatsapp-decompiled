package X;

import com.whatsapp.flows.webview.bridge.factory.impl.FlowsGetPublicKey;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.factory.impl.FlowsGetPublicKey", f = "FlowsGetPublicKey.kt", i = {0, 0}, l = {19}, m = "execute", n = {"this", "data"}, s = {"L$0", "L$2"})
/* renamed from: X.AoP  reason: case insensitive filesystem */
public final class C21696AoP extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowsGetPublicKey this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21696AoP(FlowsGetPublicKey flowsGetPublicKey, C30391dr r2) {
        super(r2);
        this.this$0 = flowsGetPublicKey;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A04(this);
    }
}
