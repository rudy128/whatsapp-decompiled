package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {415, 419}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
/* renamed from: X.Dda  reason: case insensitive filesystem */
public final class C27419Dda extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C27187DXx this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27419Dda(C30391dr r1, C27187DXx dXx) {
        super(r1);
        this.this$0 = dXx;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this);
    }
}
