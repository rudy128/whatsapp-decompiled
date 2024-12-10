package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.57G  reason: invalid class name */
public final class AnonymousClass57G extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Object $element;
    public final /* synthetic */ C108495bn $this_trySendBlocking;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass57G(Object obj, C30391dr r3, C108495bn r4) {
        super(2, r3);
        this.$this_trySendBlocking = r4;
        this.$element = obj;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AnonymousClass57G r0 = new AnonymousClass57G(this.$element, r5, this.$this_trySendBlocking);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object r1;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108495bn r12 = this.$this_trySendBlocking;
            Object obj3 = this.$element;
            try {
                this.label = 1;
                if (r12.CHH(obj3, this) == r3) {
                    return r3;
                }
            } catch (Throwable th) {
                obj2 = new AnonymousClass1IU(th);
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        obj2 = C27621Wu.A00;
        if (!(obj2 instanceof AnonymousClass1IU)) {
            r1 = C27621Wu.A00;
        } else {
            r1 = new AnonymousClass5WK(C30671eK.A00(obj2));
        }
        return new C26020Cqb(r1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass57G) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
