package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {33, 34, 36}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
/* renamed from: X.DdV  reason: case insensitive filesystem */
public final class C27414DdV extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C27186DXw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27414DdV(C27186DXw dXw, C30391dr r2) {
        super(r2);
        this.this$0 = dXw;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BJt((Object) null, this);
    }
}
