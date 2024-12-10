package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass0MW;
import X.AnonymousClass0Tr;
import X.AnonymousClass0Tv;
import X.AnonymousClass0UA;
import X.AnonymousClass0US;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C05780Vr;
import X.C11330jr;
import X.C15640qx;
import X.C16100ri;
import X.C16590sg;
import X.C22821Di;
import X.C27061DRh;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import androidx.compose.animation.core.SuspendAnimationKt;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0, 0}, l = {965}, m = "invokeSuspend", n = {"velocityLeft", "animationState"}, s = {"L$0", "L$1"})
public final class DefaultFlingBehavior$performFling$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ float $initialVelocity;
    public final /* synthetic */ C16100ri $this_performFling;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AnonymousClass0US this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(AnonymousClass0US r2, C16100ri r3, C30391dr r4, float f) {
        super(2, r4);
        this.$initialVelocity = f;
        this.this$0 = r2;
        this.$this_performFling = r3;
    }

    public static final Object A00(C05780Vr r9, C15640qx r10, C30391dr r11, C22821Di r12) {
        Object A01 = SuspendAnimationKt.A01(new AnonymousClass0Tr(r9.A02, r9.A04, new AnonymousClass0UA(((AnonymousClass0Tv) r10).A00), r9.A05.getValue()), r9, r11, r12, Long.MIN_VALUE);
        if (A01 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A01;
    }

    /* renamed from: A02 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((DefaultFlingBehavior$performFling$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new DefaultFlingBehavior$performFling$2(this.this$0, this.$this_performFling, r6, this.$initialVelocity);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, X.074, X.0D0] */
    public final Object invokeSuspend(Object obj) {
        float f;
        C27061DRh dRh;
        C05780Vr r9;
        Object A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            f = this.$initialVelocity;
            if (Math.abs(f) > 1.0f) {
                dRh = new C27061DRh();
                dRh.element = f;
                C27061DRh dRh2 = new C27061DRh();
                C16590sg r11 = AnonymousClass0MW.A02;
                Float valueOf = Float.valueOf(0.0f);
                ? obj2 = new Object();
                obj2.A00 = f;
                r9 = new C05780Vr(obj2, r11, valueOf, Long.MIN_VALUE, Long.MIN_VALUE, false);
                AnonymousClass0US r3 = this.this$0;
                C15640qx r2 = r3.A01;
                C11330jr r0 = new C11330jr(r3, this.$this_performFling, dRh2, dRh);
                this.L$0 = dRh;
                this.L$1 = r9;
                this.label = 1;
                if (A00(r9, r2, this, r0) == A03) {
                    return A03;
                }
            }
            return new Float(f);
        } else if (i == 1) {
            r9 = (C05780Vr) this.L$1;
            dRh = (C27061DRh) this.L$0;
            try {
                C30691eM.A01(obj);
            } catch (CancellationException unused) {
                dRh.element = AnonymousClass000.A04(r9.A00());
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        f = dRh.element;
        return new Float(f);
    }
}
