package X;

import com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsSetCartItem;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsSetCartItem", f = "FlowsSetCartItem.kt", i = {0, 0}, l = {34}, m = "execute", n = {"this", "errorCode"}, s = {"L$0", "L$1"})
/* renamed from: X.AoB  reason: case insensitive filesystem */
public final class C21682AoB extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowsSetCartItem this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21682AoB(FlowsSetCartItem flowsSetCartItem, C30391dr r2) {
        super(r2);
        this.this$0 = flowsSetCartItem;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A04(this);
    }
}
