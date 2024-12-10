package androidx.compose.animation.core;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass0D0;
import X.AnonymousClass0I8;
import X.AnonymousClass0Q3;
import X.AnonymousClass3F6;
import X.C03860Kx;
import X.C05780Vr;
import X.C11310jp;
import X.C16900tP;
import X.C22811Dh;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {312}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
public final class Animatable$runAnimation$2 extends C30431dv implements C22821Di {
    public final /* synthetic */ C16900tP $animation;
    public final /* synthetic */ C22821Di $block;
    public final /* synthetic */ Object $initialVelocity;
    public final /* synthetic */ long $startTime;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AnonymousClass0Q3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(AnonymousClass0Q3 r2, C16900tP r3, Object obj, C30391dr r5, C22821Di r6, long j) {
        super(1, r5);
        this.this$0 = r2;
        this.$initialVelocity = obj;
        this.$animation = r3;
        this.$startTime = j;
        this.$block = r6;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3) {
        return ((Animatable$runAnimation$2) create(r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(C30391dr r9) {
        AnonymousClass0Q3 r1 = this.this$0;
        Object obj = this.$initialVelocity;
        return new Animatable$runAnimation$2(r1, this.$animation, obj, r9, this.$block, this.$startTime);
    }

    public final Object invokeSuspend(Object obj) {
        C05780Vr r9;
        C22811Dh r8;
        Integer num;
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            try {
                AnonymousClass0Q3 r0 = this.this$0;
                r0.A04.A02 = (AnonymousClass0D0) r0.A05.BPS().invoke(this.$initialVelocity);
                AnonymousClass0Q3 r3 = this.this$0;
                r3.A07.setValue(this.$animation.BaD());
                AnonymousClass000.A1C(this.this$0.A06, true);
                C05780Vr r1 = this.this$0.A04;
                Object value = r1.A05.getValue();
                r9 = new C05780Vr(C03860Kx.A00(r1.A02), r1.A04, value, r1.A01, Long.MIN_VALUE, r1.A03);
                r8 = new C22811Dh();
                C16900tP r10 = this.$animation;
                long j = this.$startTime;
                C11310jp r02 = new C11310jp(this.this$0, r9, this.$block, r8);
                this.L$0 = r9;
                this.L$1 = r8;
                this.label = 1;
                if (SuspendAnimationKt.A01(r10, r9, this, r02, j) == A03) {
                    return A03;
                }
            } catch (CancellationException e) {
                AnonymousClass0Q3.A04(this.this$0);
                throw e;
            }
        } else if (i == 1) {
            r8 = (C22811Dh) this.L$1;
            r9 = (C05780Vr) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (r8.element) {
            num = AnonymousClass00R.A00;
        } else {
            num = AnonymousClass00R.A01;
        }
        AnonymousClass0Q3.A04(this.this$0);
        return new AnonymousClass0I8(r9, num);
    }
}
