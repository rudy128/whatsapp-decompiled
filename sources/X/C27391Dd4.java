package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {115}, m = "collect", n = {"ownershipMarker"}, s = {"L$0"})
/* renamed from: X.Dd4  reason: case insensitive filesystem */
public final class C27391Dd4 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C27179DXo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27391Dd4(C27179DXo dXo, C30391dr r2) {
        super(r2);
        this.this$0 = dXo;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BFC(this, (AnonymousClass1G2) null);
    }
}
