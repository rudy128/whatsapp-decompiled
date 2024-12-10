package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.58T  reason: invalid class name */
public final class AnonymousClass58T extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Object $initialValue;
    public final /* synthetic */ AnonymousClass1G3 $shared;
    public final /* synthetic */ C23421Fz $upstream;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass58T(Object obj, C30391dr r3, C23421Fz r4, AnonymousClass1G3 r5) {
        super(2, r3);
        this.$upstream = r4;
        this.$shared = r5;
        this.$initialValue = obj;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        AnonymousClass58T r0 = new AnonymousClass58T(this.$initialValue, r6, this.$upstream, this.$shared);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            int ordinal = ((AnonymousClass4D2) this.L$0).ordinal();
            if (ordinal == 0) {
                C23421Fz r1 = this.$upstream;
                AnonymousClass1G3 r0 = this.$shared;
                this.label = 1;
                if (r1.BFC(this, r0) == r4) {
                    return r4;
                }
            } else if (ordinal == 2) {
                Object obj2 = this.$initialValue;
                AnonymousClass1I8 r12 = C62922sD.A00;
                AnonymousClass1G3 r02 = this.$shared;
                if (obj2 == r12) {
                    r02.CFl();
                } else {
                    r02.CPw(obj2);
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
        return ((AnonymousClass58T) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
