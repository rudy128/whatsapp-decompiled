package X;

import androidx.compose.animation.core.SuspendAnimationKt;

/* renamed from: X.0kA  reason: invalid class name and case insensitive filesystem */
public final class C11500kA extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C16900tP $animation;
    public final /* synthetic */ C22821Di $block;
    public final /* synthetic */ float $durationScale;
    public final /* synthetic */ Object $initialValue;
    public final /* synthetic */ AnonymousClass0D0 $initialVelocityVector;
    public final /* synthetic */ C98494rF $lateInitScope;
    public final /* synthetic */ C05780Vr $this_animate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11500kA(C16900tP r2, C05780Vr r3, AnonymousClass0D0 r4, Object obj, C22821Di r6, C98494rF r7, float f) {
        super(1);
        this.$lateInitScope = r7;
        this.$initialValue = obj;
        this.$animation = r2;
        this.$initialVelocityVector = r4;
        this.$this_animate = r3;
        this.$durationScale = f;
        this.$block = r6;
    }

    public final void A00(long j) {
        C98494rF r1 = this.$lateInitScope;
        Object obj = this.$initialValue;
        C16900tP r0 = this.$animation;
        long j2 = j;
        AnonymousClass0J2 r3 = new AnonymousClass0J2(this.$initialVelocityVector, r0.Bav(), obj, r0.BaD(), new C07730dx(this.$this_animate), j2, j2);
        AnonymousClass0J2 r12 = r3;
        SuspendAnimationKt.A05(this.$animation, r12, this.$this_animate, this.$block, this.$durationScale, j2);
        r1.element = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(((Number) obj).longValue());
        return C27621Wu.A00;
    }
}
