package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.57K  reason: invalid class name */
public final class AnonymousClass57K extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1G2 $collector;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C99664tG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass57K(C30391dr r2, AnonymousClass1G2 r3, C99664tG r4) {
        super(2, r2);
        this.$collector = r3;
        this.this$0 = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AnonymousClass57K r0 = new AnonymousClass57K(r5, this.$collector, this.this$0);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r1 = this.$collector;
            C108585bw A01 = this.this$0.A01((AnonymousClass1OX) this.L$0);
            this.label = 1;
            if (AnonymousClass4WB.A00(this, A01, r1, true) == r4) {
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
        return ((AnonymousClass57K) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
