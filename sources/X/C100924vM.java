package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.4vM  reason: invalid class name and case insensitive filesystem */
public final class C100924vM extends C30431dv implements C22821Di {
    public final /* synthetic */ AnonymousClass1G2 $downstream;
    public final /* synthetic */ C98494rF $lastValue;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100924vM(C30391dr r2, C98494rF r3, AnonymousClass1G2 r4) {
        super(1, r2);
        this.$downstream = r4;
        this.$lastValue = r3;
    }

    public final C30391dr create(C30391dr r4) {
        return new C100924vM(r4, this.$lastValue, this.$downstream);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C100924vM) create((C30391dr) obj)).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r2 = this.$downstream;
            AnonymousClass1I8 r1 = AnonymousClass4IV.A01;
            Object obj2 = this.$lastValue.element;
            if (obj2 == r1) {
                obj2 = null;
            }
            this.label = 1;
            if (r2.BJt(obj2, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.$lastValue.element = null;
        return C27621Wu.A00;
    }
}
