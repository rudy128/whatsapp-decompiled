package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {271}, m = "emit", n = {}, s = {})
/* renamed from: X.7Ta  reason: invalid class name and case insensitive filesystem */
public final class C147407Ta extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C147277Sn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147407Ta(C147277Sn r1, C30391dr r2) {
        super(r2);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BJt((Object) null, this);
    }
}
