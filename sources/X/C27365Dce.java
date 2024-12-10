package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {73}, m = "emit", n = {}, s = {})
/* renamed from: X.Dce  reason: case insensitive filesystem */
public final class C27365Dce extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C27186DXw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27365Dce(C27186DXw dXw, C30391dr r2) {
        super(r2);
        this.this$0 = dXw;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BJt((Object) null, this);
    }
}
