package X;

import androidx.compose.foundation.gestures.UpdatableAnimationState;

/* renamed from: X.0jB  reason: invalid class name and case insensitive filesystem */
public final class C10910jB extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $beforeFrame;
    public final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10910jB(UpdatableAnimationState updatableAnimationState, C22821Di r3) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$beforeFrame = r3;
    }

    public final void A00() {
        UpdatableAnimationState updatableAnimationState = this.this$0;
        float f = updatableAnimationState.A00;
        updatableAnimationState.A00 = 0.0f;
        this.$beforeFrame.invoke(Float.valueOf(f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((Number) obj).longValue();
        A00();
        return C27621Wu.A00;
    }
}
