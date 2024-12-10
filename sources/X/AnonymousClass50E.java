package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.50E  reason: invalid class name */
public final class AnonymousClass50E extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C23421Fz $this_launchIn;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass50E(C30391dr r2, C23421Fz r3) {
        super(2, r2);
        this.$this_launchIn = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AnonymousClass50E(r4, this.$this_launchIn);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AnonymousClass50E((C30391dr) obj2, this.$this_launchIn).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz r0 = this.$this_launchIn;
            this.label = 1;
            if (C88604aC.A01(this, r0) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
