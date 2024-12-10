package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;

/* renamed from: X.4aa  reason: invalid class name and case insensitive filesystem */
public class C88664aa implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public C88664aa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        int i;
        C108875cR r1;
        switch (this.A00) {
            case 0:
                C85814Ov r4 = (C85814Ov) this.A01;
                View view = r4.A02;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    i = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                } else {
                    i = 0;
                }
                C27641Ww.A03(view, i, 0);
                Animator animator2 = r4.A01;
                r4.A00 = animator2;
                r4.A01 = null;
                if (animator2 != null) {
                    animator2.start();
                    return;
                }
                return;
            case 1:
                ((C85814Ov) this.A01).A03.setVisibility(0);
                return;
            case 2:
                return;
            case 3:
                C78883tq r12 = ((AnonymousClass4MN) this.A01).A00;
                AnonymousClass3MZ.A1F(r12, r12.getLayoutParams());
                return;
            default:
                C79053uH r3 = (C79053uH) this.A01;
                Interpolator interpolator = C79053uH.A0d;
                r3.A08 = false;
                if (r3.A01 == 0 && !r3.A07 && r3.A0A != null && r3.A1h()) {
                    AnonymousClass3QI r42 = r3.A0A;
                    if (AnonymousClass4DK.REPLY_WITH_PTV == r42.A00) {
                        r42.A01.animate().alpha(1.0f).setDuration(100).withStartAction(new C98784ri((Object) r42, 39));
                    }
                }
                if (C18020vd.A05(C18040vf.A02, r3.A0F, 10506) && r3.A07 && r3.A01 == 1 && (r1 = r3.A0k) != null) {
                    r1.C2C((AnonymousClass21V) r3.A0I);
                }
                C79053uH.A03(r3);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass3QI r5;
        switch (this.A00) {
            case 1:
            case 2:
                ((C85814Ov) this.A01).A03.setVisibility(8);
                return;
            case 4:
                C79053uH r4 = (C79053uH) this.A01;
                Interpolator interpolator = C79053uH.A0d;
                r4.A08 = true;
                if (r4.A01 == 1 && r4.A07 && (r5 = r4.A0A) != null) {
                    if (AnonymousClass4DK.REPLY_WITH_PTV == r5.A00) {
                        r5.A01.animate().alpha(0.0f).setDuration(100).withStartAction(new C98784ri((Object) r5, 40)).withEndAction(new C98784ri((Object) r5, 41));
                    }
                    r4.A0Q.setPlayWhenReadyAndActive(true);
                }
                C79053uH.A03(r4);
                return;
            default:
                return;
        }
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
