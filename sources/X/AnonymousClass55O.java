package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.55O  reason: invalid class name */
public final class AnonymousClass55O extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1G2 $downstream;
    public final /* synthetic */ C98494rF $lastValue;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55O(C30391dr r2, C98494rF r3, AnonymousClass1G2 r4) {
        super(2, r2);
        this.$lastValue = r3;
        this.$downstream = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AnonymousClass55O(r5, this.$lastValue, this.$downstream);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C98494rF r0 = this.$lastValue;
            Object obj2 = r0.element;
            if (obj2 != null) {
                r0.element = null;
                AnonymousClass1G2 r1 = this.$downstream;
                if (obj2 == AnonymousClass4IV.A01) {
                    obj2 = null;
                }
                this.label = 1;
                if (r1.BJt(obj2, this) == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass55O) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
