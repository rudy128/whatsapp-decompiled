package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.55T  reason: invalid class name */
public final class AnonymousClass55T extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C99514sw $collector;
    public final /* synthetic */ C23421Fz $flow;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55T(C30391dr r2, C23421Fz r3, C99514sw r4) {
        super(2, r2);
        this.$flow = r3;
        this.$collector = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AnonymousClass55T(r5, this.$flow, this.$collector);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz r1 = this.$flow;
            C99514sw r0 = this.$collector;
            this.label = 1;
            if (r1.BFC(this, r0) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass55T) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
