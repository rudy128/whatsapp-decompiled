package X;

import com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext", f = "StoreShoppingFlowContext.kt", i = {0, 0, 0, 0, 0}, l = {91}, m = "processFlow", n = {"this", "flowId", "flowToken", "flowAction", "payloadDecodingResult"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* renamed from: X.Aoc  reason: case insensitive filesystem */
public final class C21709Aoc extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StoreShoppingFlowContext this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21709Aoc(StoreShoppingFlowContext storeShoppingFlowContext, C30391dr r2) {
        super(r2);
        this.this$0 = storeShoppingFlowContext;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StoreShoppingFlowContext.A00(this.this$0, (UserJid) null, (String) null, (String) null, (String) null, (String) null, this);
    }
}
