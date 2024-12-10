package X;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.58V  reason: invalid class name */
public final class AnonymousClass58V extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C23421Fz[] $flows;
    public final /* synthetic */ int $i;
    public final /* synthetic */ AtomicInteger $nonClosed;
    public final /* synthetic */ C108485bm $resultChannel;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass58V(AtomicInteger atomicInteger, C30391dr r3, C108485bm r4, C23421Fz[] r5, int i) {
        super(2, r3);
        this.$flows = r5;
        this.$i = i;
        this.$nonClosed = atomicInteger;
        this.$resultChannel = r4;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new AnonymousClass58V(this.$nonClosed, r8, this.$resultChannel, this.$flows, this.$i);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz[] r0 = this.$flows;
            int i2 = this.$i;
            C23421Fz r2 = r0[i2];
            C99564t6 r02 = new C99564t6(this.$resultChannel, i2, 1);
            this.label = 1;
            if (r2.BFC(this, r02) == r6) {
                return r6;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (Throwable th) {
                th = th;
                if (this.$nonClosed.decrementAndGet() == 0) {
                    this.$resultChannel.BF8((Throwable) null);
                    throw th;
                }
            }
        } else {
            th = AnonymousClass000.A0l();
            throw th;
        }
        if (this.$nonClosed.decrementAndGet() == 0) {
            this.$resultChannel.BF8((Throwable) null);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass58V) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
