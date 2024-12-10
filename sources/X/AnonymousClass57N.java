package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.57N  reason: invalid class name */
public final class AnonymousClass57N extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C36001nB $block;
    public final /* synthetic */ AnonymousClass1G2 $this_unsafeFlow;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass57N(C30391dr r2, C36001nB r3, AnonymousClass1G2 r4) {
        super(2, r2);
        this.$block = r3;
        this.$this_unsafeFlow = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AnonymousClass57N r0 = new AnonymousClass57N(r5, this.$block, this.$this_unsafeFlow);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            C36001nB r1 = this.$block;
            AnonymousClass1G2 r0 = this.$this_unsafeFlow;
            this.label = 1;
            if (r1.invoke(obj2, r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass57N) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
