package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {113, 120, 127}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
/* renamed from: X.DdT  reason: case insensitive filesystem */
public final class C27412DdT extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C27183DXs this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27412DdT(C27183DXs dXs, C30391dr r2) {
        super(r2);
        this.this$0 = dXs;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BFC(this, (AnonymousClass1G2) null);
    }
}
