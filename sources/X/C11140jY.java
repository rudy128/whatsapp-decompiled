package X;

import androidx.compose.foundation.gestures.UpdatableAnimationState;

/* renamed from: X.0jY  reason: invalid class name and case insensitive filesystem */
public final class C11140jY extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $beforeFrame;
    public final /* synthetic */ float $durationScale;
    public final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11140jY(UpdatableAnimationState updatableAnimationState, C22821Di r3, float f) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$durationScale = f;
        this.$beforeFrame = r3;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.074, X.0D0] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.074, X.0D0] */
    public final void A00(long j) {
        long A03;
        UpdatableAnimationState updatableAnimationState = this.this$0;
        long j2 = updatableAnimationState.A01;
        if (j2 == Long.MIN_VALUE) {
            updatableAnimationState.A01 = j;
            j2 = j;
        }
        float f = updatableAnimationState.A00;
        ? obj = new Object();
        obj.A00 = f;
        float f2 = this.$durationScale;
        if (f2 == 0.0f) {
            C16830tI r3 = updatableAnimationState.A04;
            ? obj2 = new Object();
            obj2.A00 = f;
            A03 = r3.BR0(obj2, UpdatableAnimationState.A05, updatableAnimationState.A02);
        } else {
            A03 = C22339B3q.A03(((float) (j - j2)) / f2);
        }
        UpdatableAnimationState updatableAnimationState2 = this.this$0;
        C16830tI r6 = updatableAnimationState2.A04;
        AnonymousClass074 r8 = UpdatableAnimationState.A05;
        float f3 = ((AnonymousClass074) r6.BbF(obj, r8, updatableAnimationState2.A02, A03)).A00;
        UpdatableAnimationState updatableAnimationState3 = this.this$0;
        updatableAnimationState3.A02 = (AnonymousClass074) updatableAnimationState3.A04.BbK(obj, r8, updatableAnimationState3.A02, A03);
        UpdatableAnimationState updatableAnimationState4 = this.this$0;
        updatableAnimationState4.A01 = j;
        updatableAnimationState4.A00 = f3;
        this.$beforeFrame.invoke(Float.valueOf(updatableAnimationState4.A00 - f3));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(((Number) obj).longValue());
        return C27621Wu.A00;
    }
}
