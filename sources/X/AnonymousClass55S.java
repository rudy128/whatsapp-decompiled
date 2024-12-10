package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.55S  reason: invalid class name */
public final class AnonymousClass55S extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass5WR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55S(C30391dr r2, AnonymousClass5WR r3) {
        super(2, r2);
        this.this$0 = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AnonymousClass55S r0 = new AnonymousClass55S(r4, this.this$0);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass5WR r0 = this.this$0;
            this.label = 1;
            if (r0.A02(this, (AnonymousClass1G2) this.L$0) == r3) {
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
        return ((AnonymousClass55S) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
