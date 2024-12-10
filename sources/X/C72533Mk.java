package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.3Mk  reason: invalid class name and case insensitive filesystem */
public class C72533Mk extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C72533Mk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A05 = obj2;
        this.A01 = obj4;
        this.A02 = obj5;
        this.A04 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        Object obj;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(animator, 0);
                super.onAnimationEnd(animator);
                View view = (View) this.A01;
                C87434Vo.A00(view);
                View view2 = (View) this.A02;
                C87434Vo.A00(view2);
                View[] viewArr = new View[2];
                viewArr[0] = view;
                C87434Vo.A01(C18070vi.A0O(view2, viewArr, 1));
                view.clearAnimation();
                view2.clearAnimation();
                obj = this.A04;
                break;
            case 1:
                C18070vi.A0d(animator, 0);
                super.onAnimationEnd(animator);
                Object[] objArr = new View[3];
                objArr[0] = this.A04;
                objArr[1] = this.A01;
                C87434Vo.A01(C18070vi.A0O(this.A05, objArr, 2));
                View view3 = (View) this.A02;
                C87434Vo.A00(view3);
                view3.clearAnimation();
                obj = this.A03;
                break;
            case 2:
                C18070vi.A0d(animator, 0);
                super.onAnimationEnd(animator);
                ((View) this.A03).clearAnimation();
                return;
            case 3:
                View view4 = (View) this.A02;
                if (view4 != null) {
                    view4.animate().alpha(1.0f).setDuration(100).start();
                }
                ((View) this.A03).animate().alpha(1.0f).setDuration(100).start();
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
        ((Animator) obj).start();
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(animator, 0);
                super.onAnimationStart(animator);
                ((View) this.A03).setVisibility(8);
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.A05;
                if (transitionDrawable != null) {
                    transitionDrawable.startTransition(500);
                    return;
                }
                return;
            case 2:
                C18070vi.A0d(animator, 0);
                super.onAnimationStart(animator);
                ((View) this.A03).setAlpha(0.0f);
                ((View) this.A04).setVisibility(0);
                ((View) this.A02).setVisibility(0);
                ((View) this.A05).setVisibility(8);
                ((View) this.A01).setVisibility(8);
                return;
            case 3:
                ((AnonymousClass4VR) this.A01).A02.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) this.A05);
                View view = (View) this.A04;
                view.setVisibility(8);
                view.setAlpha(1.0f);
                View view2 = (View) this.A02;
                if (view2 != null) {
                    view2.setAlpha(0.0f);
                    view2.setVisibility(0);
                }
                View view3 = (View) this.A03;
                view3.setAlpha(0.0f);
                view3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
