package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

public class BEP extends AnimatorListenerAdapter {
    public boolean A00;
    public final int A01 = 0;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public BEP(DOZ doz, C23736Boh boh, E8A e8a) {
        this.A02 = doz;
        this.A03 = e8a;
        this.A04 = boh;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A01 != 0) {
            super.onAnimationCancel(animator);
        } else {
            this.A00 = true;
        }
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A01 == 0) {
            C18070vi.A0d(animator, 0);
            C20046A4p A0Q = BE7.A0Q(animator);
            A0Q.A03(C108945cZ.A1A(this.A00), 1);
            C25974Cph.A00((C23736Boh) this.A04, BE7.A0R(A0Q, this.A02, 2), (E8A) this.A03);
            this.A00 = false;
        } else if (!this.A00) {
            ((View) this.A03).setVisibility(4);
            View view = (View) this.A04;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (1 - this.A01 != 0) {
            super.onAnimationStart(animator);
        } else if (this.A00) {
            ((View) this.A03).setVisibility(0);
            View view = (View) this.A04;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }

    public BEP(View view, View view2, FabTransformationBehavior fabTransformationBehavior, boolean z) {
        this.A02 = fabTransformationBehavior;
        this.A00 = z;
        this.A03 = view;
        this.A04 = view2;
    }
}
