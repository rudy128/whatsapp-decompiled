package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.57L  reason: invalid class name */
public final class AnonymousClass57L extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1G2 $collector;
    public final /* synthetic */ Object $value;
    public int label;
    public final /* synthetic */ AnonymousClass5WQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass57L(Object obj, C30391dr r3, AnonymousClass1G2 r4, AnonymousClass5WQ r5) {
        super(2, r3);
        this.this$0 = r5;
        this.$collector = r4;
        this.$value = obj;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        AnonymousClass5WQ r3 = this.this$0;
        return new AnonymousClass57L(this.$value, r6, this.$collector, r3);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C36001nB r2 = this.this$0.A00;
            AnonymousClass1G2 r1 = this.$collector;
            Object obj2 = this.$value;
            this.label = 1;
            if (r2.invoke(r1, obj2, this) == r4) {
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
        return ((AnonymousClass57L) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
