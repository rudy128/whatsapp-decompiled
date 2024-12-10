package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {58, 60}, m = "emit", n = {}, s = {})
/* renamed from: X.Dcl  reason: case insensitive filesystem */
public final class C27372Dcl extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C27186DXw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27372Dcl(C27186DXw dXw, C30391dr r2) {
        super(r2);
        this.this$0 = dXw;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BJt((Object) null, this);
    }
}
