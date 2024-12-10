package X;

import androidx.compose.animation.core.SuspendAnimationKt;

/* renamed from: X.0k0  reason: invalid class name and case insensitive filesystem */
public final class C11420k0 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C16900tP $animation;
    public final /* synthetic */ C22821Di $block;
    public final /* synthetic */ float $durationScale;
    public final /* synthetic */ C98494rF $lateInitScope;
    public final /* synthetic */ C05780Vr $this_animate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11420k0(C16900tP r2, C05780Vr r3, C22821Di r4, C98494rF r5, float f) {
        super(1);
        this.$lateInitScope = r5;
        this.$durationScale = f;
        this.$animation = r2;
        this.$this_animate = r3;
        this.$block = r4;
    }

    public final void A00(long j) {
        Object obj = this.$lateInitScope.element;
        C18070vi.A0b(obj);
        float f = this.$durationScale;
        SuspendAnimationKt.A05(this.$animation, (AnonymousClass0J2) obj, this.$this_animate, this.$block, f, j);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(((Number) obj).longValue());
        return C27621Wu.A00;
    }
}
