package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.57H  reason: invalid class name */
public final class AnonymousClass57H extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C98494rF $lastValue;
    public final /* synthetic */ C108585bw $ticker;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass57H(C30391dr r2, C98494rF r3, C108585bw r4) {
        super(2, r2);
        this.$lastValue = r3;
        this.$ticker = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AnonymousClass57H r0 = new AnonymousClass57H(r5, this.$lastValue, this.$ticker);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass57H) create(new C26020Cqb(((C26020Cqb) obj).A00), (C30391dr) obj2)).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Throwable th;
        AnonymousClass5WK r3;
        if (this.label == 0) {
            C30691eM.A01(obj);
            Object obj2 = ((C26020Cqb) this.L$0).A00;
            C98494rF r2 = this.$lastValue;
            boolean z = obj2 instanceof AnonymousClass4PR;
            if (!z) {
                r2.element = obj2;
            }
            C108585bw r1 = this.$ticker;
            if (z) {
                if (!(obj2 instanceof AnonymousClass5WK) || (r3 = (AnonymousClass5WK) obj2) == null || (th = r3.A00) == null) {
                    r1.BEM(new C27335Dc7());
                    r2.element = AnonymousClass4IV.A00;
                }
            }
            return C27621Wu.A00;
        }
        th = AnonymousClass000.A0l();
        throw th;
    }
}
