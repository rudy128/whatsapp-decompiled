package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {236}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
/* renamed from: X.58S  reason: invalid class name */
public final class AnonymousClass58S extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1G2 $downstream;
    public final /* synthetic */ C98494rF $lastValue;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass58S(C30391dr r2, C98494rF r3, AnonymousClass1G2 r4) {
        super(2, r2);
        this.$lastValue = r3;
        this.$downstream = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AnonymousClass58S r0 = new AnonymousClass58S(r5, this.$lastValue, this.$downstream);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass58S) create(new C26020Cqb(((C26020Cqb) obj).A00), (C30391dr) obj2)).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C98494rF r4;
        AnonymousClass5WK r0;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = ((C26020Cqb) this.L$0).A00;
            r4 = this.$lastValue;
            boolean z = obj2 instanceof AnonymousClass4PR;
            if (!z) {
                r4.element = obj2;
            }
            AnonymousClass1G2 r2 = this.$downstream;
            if (z) {
                if (!(obj2 instanceof AnonymousClass5WK) || (r0 = (AnonymousClass5WK) obj2) == null || (r0 = r0.A00) == null) {
                    Object obj3 = r4.element;
                    if (obj3 != null) {
                        if (obj3 == AnonymousClass4IV.A01) {
                            obj3 = null;
                        }
                        this.L$0 = obj2;
                        this.L$1 = r4;
                        this.label = 1;
                        if (r2.BJt(obj3, this) == r6) {
                            return r6;
                        }
                    }
                }
                throw r0;
            }
            return C27621Wu.A00;
        } else if (i == 1) {
            r4 = (C98494rF) this.L$1;
            C30691eM.A01(obj);
        } else {
            Throwable th = AnonymousClass000.A0l();
            throw th;
        }
        r4.element = AnonymousClass4IV.A00;
        return C27621Wu.A00;
    }
}
