package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.55Q  reason: invalid class name */
public final class AnonymousClass55Q extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1G1 $subscriptionCount;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55Q(C30391dr r2, AnonymousClass1G1 r3) {
        super(2, r2);
        this.$subscriptionCount = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AnonymousClass55Q r0 = new AnonymousClass55Q(r4, this.$subscriptionCount);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            Object obj3 = new Object();
            AnonymousClass1G1 r2 = this.$subscriptionCount;
            C99574t7 r0 = new C99574t7(obj2, obj3, 21);
            this.label = 1;
            if (r2.BFC(this, r0) == r6) {
                return r6;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw AnonymousClass3MW.A13();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass55Q) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
