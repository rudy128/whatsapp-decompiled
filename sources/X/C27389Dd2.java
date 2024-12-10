package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {226}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
/* renamed from: X.Dd2  reason: case insensitive filesystem */
public final class C27389Dd2 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C27184DXt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27389Dd2(C30391dr r1, C27184DXt dXt) {
        super(r1);
        this.this$0 = dXt;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BFC(this, (AnonymousClass1G2) null);
    }
}
