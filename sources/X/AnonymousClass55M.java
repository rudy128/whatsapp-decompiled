package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.55M  reason: invalid class name */
public final class AnonymousClass55M extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C23421Fz $this_debounceInternal;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55M(C30391dr r2, C23421Fz r3) {
        super(2, r2);
        this.$this_debounceInternal = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AnonymousClass55M r0 = new AnonymousClass55M(r4, this.$this_debounceInternal);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            C23421Fz r1 = this.$this_debounceInternal;
            C99614tB A00 = C99614tB.A00(obj2, 45);
            this.label = 1;
            if (r1.BFC(this, A00) == r4) {
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
        return ((AnonymousClass55M) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
