package X;

import com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsGetCart;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsGetCart", f = "FlowsGetCart.kt", i = {0}, l = {35}, m = "execute", n = {"this"}, s = {"L$0"})
/* renamed from: X.Anc  reason: case insensitive filesystem */
public final class C21647Anc extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowsGetCart this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21647Anc(FlowsGetCart flowsGetCart, C30391dr r2) {
        super(r2);
        this.this$0 = flowsGetCart;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A04(this);
    }
}
