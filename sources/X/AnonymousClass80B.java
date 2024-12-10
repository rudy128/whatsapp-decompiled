package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.80B  reason: invalid class name */
public final class AnonymousClass80B extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ VideoComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80B(VideoComposerFragment videoComposerFragment) {
        super(1);
        this.this$0 = videoComposerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View A02;
        View A022;
        AnimatorSet A0B = C108945cZ.A0B();
        VideoComposerFragment videoComposerFragment = this.this$0;
        Animator[] animatorArr = new Animator[2];
        C28931bI r0 = videoComposerFragment.A0U;
        if (r0 == null || (A022 = r0.A02()) == null) {
            objectAnimator = null;
        } else {
            Property property = View.ALPHA;
            float[] A1V = C108945cZ.A1V();
            // fill-array-data instruction
            A1V[0] = 1065353216;
            A1V[1] = 0;
            objectAnimator = ObjectAnimator.ofFloat(A022, property, A1V);
        }
        animatorArr[0] = objectAnimator;
        C28931bI r02 = videoComposerFragment.A0V;
        if (r02 == null || (A02 = r02.A02()) == null) {
            objectAnimator2 = null;
        } else {
            Property property2 = View.ALPHA;
            float[] A1V2 = C108945cZ.A1V();
            // fill-array-data instruction
            A1V2[0] = 1065353216;
            A1V2[1] = 0;
            objectAnimator2 = ObjectAnimator.ofFloat(A02, property2, A1V2);
        }
        animatorArr[1] = objectAnimator2;
        A0B.playTogether(C200410p.A0P(animatorArr));
        A0B.setDuration(300);
        C109195cy.A02(A0B, videoComposerFragment, 13);
        A0B.start();
        return C27621Wu.A00;
    }
}
