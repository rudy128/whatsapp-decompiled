package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.57I  reason: invalid class name */
public final class AnonymousClass57I extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108935cY $result;
    public final /* synthetic */ C23421Fz $upstream;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass57I(C30391dr r2, C108935cY r3, C23421Fz r4) {
        super(2, r2);
        this.$upstream = r4;
        this.$result = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AnonymousClass57I r0 = new AnonymousClass57I(r5, this.$result, this.$upstream);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            C98494rF A00 = C98494rF.A00();
            C23421Fz r3 = this.$upstream;
            AnonymousClass4t0 r0 = new AnonymousClass4t0(A00, obj2, this.$result, 5);
            this.label = 1;
            if (r3.BFC(this, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (Throwable th) {
                this.$result.BFO(th);
                throw th;
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass57I) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
