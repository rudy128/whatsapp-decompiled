package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Mh  reason: invalid class name and case insensitive filesystem */
public class C72503Mh extends AnimatorListenerAdapter {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C72503Mh(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A00 != 0) {
            super.onAnimationEnd(animator);
            return;
        }
        C77913rm r2 = (C77913rm) this.A02;
        ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
        int i = this.A01;
        layoutParams.height = i;
        r2.setLayoutParams(layoutParams);
        if (i == 0) {
            r2.setVisibility(8);
            r2.A09(false);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A00 != 0) {
            View view = (View) this.A02;
            int i = this.A01;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = i;
                view.setLayoutParams(marginLayoutParams);
                return;
            }
            throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        C77913rm r1 = (C77913rm) this.A02;
        if (r1.getVisibility() != 0) {
            C77913rm.A03(r1);
            r1.setVisibility(0);
            r1.A09(true);
        }
    }
}
