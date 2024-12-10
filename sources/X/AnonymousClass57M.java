package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.57M  reason: invalid class name */
public final class AnonymousClass57M extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1G2 $collector;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass5WQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass57M(C30391dr r2, AnonymousClass1G2 r3, AnonymousClass5WQ r4) {
        super(2, r2);
        this.this$0 = r4;
        this.$collector = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AnonymousClass57M r0 = new AnonymousClass57M(r5, this.$collector, this.this$0);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            C98494rF A00 = C98494rF.A00();
            AnonymousClass5WQ r5 = this.this$0;
            C23421Fz r0 = r5.A00;
            C99544t2 r3 = new C99544t2(this.$collector, r5, A00, obj2, 3);
            this.label = 1;
            if (r0.BFC(this, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass57M) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
