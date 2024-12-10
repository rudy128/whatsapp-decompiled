package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {21}, m = "emit", n = {}, s = {})
/* renamed from: X.Dd7  reason: case insensitive filesystem */
public final class C27394Dd7 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C27185DXu this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27394Dd7(C27185DXu dXu, C30391dr r2) {
        super(r2);
        this.this$0 = dXu;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BJt((Object) null, this);
    }
}
