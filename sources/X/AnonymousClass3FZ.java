package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {382, 389, 392}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* renamed from: X.3FZ  reason: invalid class name */
public final class AnonymousClass3FZ extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C25701Ph this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FZ(C30391dr r1, C25701Ph r2) {
        super(r1);
        this.this$0 = r2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C25701Ph.A01(this, (AnonymousClass1G2) null, this.this$0);
    }
}
