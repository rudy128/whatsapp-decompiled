package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {115, 119}, m = "collect", n = {"this", "$this$onStart_u24lambda_u241", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.Ddk  reason: case insensitive filesystem */
public final class C27429Ddk extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C27183DXs this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27429Ddk(C27183DXs dXs, C30391dr r2) {
        super(r2);
        this.this$0 = dXs;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BFC(this, (AnonymousClass1G2) null);
    }
}
