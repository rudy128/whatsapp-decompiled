package X;

import android.animation.Animator;

/* renamed from: X.DoU  reason: case insensitive filesystem */
public final class C27932DoU extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BEC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27932DoU(BEC bec) {
        super(1);
        this.this$0 = bec;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) obj;
        C18070vi.A0d(animatorListener, 0);
        animatorListener.onAnimationEnd(this.this$0);
        return C27621Wu.A00;
    }
}
