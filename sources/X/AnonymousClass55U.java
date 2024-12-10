package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.55U  reason: invalid class name */
public final class AnonymousClass55U extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1G2 $downstream;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55U(C30391dr r2, AnonymousClass1G2 r3) {
        super(2, r2);
        this.$downstream = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AnonymousClass55U r0 = new AnonymousClass55U(r4, this.$downstream);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            AnonymousClass1G2 r0 = this.$downstream;
            this.label = 1;
            if (r0.BJt(obj2, this) == r3) {
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
        return ((AnonymousClass55U) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
