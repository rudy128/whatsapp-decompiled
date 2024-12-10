package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.Slider;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;
import java.util.List;

public class BEQ extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public BEQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animator animator, Object obj, int i) {
        animator.addListener(new BEQ(obj, i));
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 3:
                C28485E3p e3p = ((BIJ) this.A01).A06;
                if (e3p != null) {
                    e3p.C5W();
                    return;
                }
                return;
            case 4:
                C28484E3o e3o = ((BIJ) this.A01).A05;
                if (e3o != null) {
                    e3o.Brv();
                    return;
                }
                return;
            case 6:
                BER.A01((BER) this.A01);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        Animator animator2;
        ObjectAnimator objectAnimator;
        switch (this.A00) {
            case 0:
                ((AnonymousClass1LG) this.A01).A09();
                animator.removeListener(this);
                return;
            case 1:
                C454028v r4 = (C454028v) this.A01;
                ArrayList A10 = C17880vN.A10(r4.A02);
                int size = A10.size();
                for (int i = 0; i < size; i++) {
                    ((C6Y) A10.get(i)).A01(r4);
                }
                return;
            case 2:
                BIK bik = (BIK) this.A01;
                if (bik.getChildCount() > 0) {
                    Interpolator interpolator = BIK.A07;
                    if (animator != bik.A04 || (objectAnimator = bik.A03) == null || !objectAnimator.isStarted()) {
                        BIK.A01(AnonymousClass3MY.A0F(bik), bik);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                C28485E3p e3p = ((BIJ) this.A01).A06;
                if (e3p != null) {
                    e3p.C5W();
                    return;
                }
                return;
            case 4:
                C28484E3o e3o = ((BIJ) this.A01).A05;
                if (e3o != null) {
                    e3o.Brv();
                    return;
                }
                return;
            case 5:
                BEC bec = (BEC) this.A01;
                BEC.A00(bec, new C27929DoR(bec));
                return;
            case 6:
                BER.A01((BER) this.A01);
                return;
            case 7:
                ((C25809CmM) this.A01).A02(false);
                return;
            case 8:
                ((HideBottomViewOnScrollBehavior) this.A01).A06 = null;
                return;
            case 10:
                super.onAnimationEnd(animator);
                C25692CkN ckN = (C25692CkN) this.A01;
                ObjectAnimator objectAnimator2 = ckN.A03;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                C6Y c6y = ckN.A05;
                if (c6y != null) {
                    c6y.A01(ckN.A06);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                BFE bfe = (BFE) this.A01;
                BEQ.super.setVisible(false, false);
                List<C6Y> list = bfe.A05;
                if (list != null && !bfe.A06) {
                    for (C6Y A012 : list) {
                        A012.A01(bfe);
                    }
                    return;
                }
                return;
            case 13:
                ViewOverlay viewOverlay = null;
                super.onAnimationEnd(animator);
                Slider slider = (Slider) this.A01;
                ViewGroup A02 = AnonymousClass1YU.A02(slider);
                if (A02 != null) {
                    viewOverlay = A02.getOverlay();
                }
                for (Drawable remove : slider.A0p) {
                    viewOverlay.remove(remove);
                }
                return;
            case 14:
            case 15:
                ((C26155CtN) this.A01).A07();
                return;
            case 17:
                ((C25277CcZ) this.A01).A02.A0A(false);
                return;
            case 18:
                Bio bio = (Bio) this.A01;
                bio.A02.A09(false);
                animator2 = bio.A01;
                break;
            case 19:
                ((ExpandableTransformationBehavior) this.A01).A00 = null;
                return;
            case 20:
                C18070vi.A0d(animator, 0);
                super.onAnimationEnd(animator);
                animator2 = ((C25695CkQ) this.A01).A01;
                break;
            case 21:
                C22655BIe bIe = (C22655BIe) this.A01;
                View view = bIe.A0D;
                if (view != null) {
                    bIe.A0L = false;
                    view.setPivotX((float) (view.getMeasuredWidth() / 2));
                    View view2 = bIe.A0D;
                    view2.setPivotY((float) (view2.getMeasuredHeight() / 2));
                    C28481E2w e2w = bIe.A0I;
                    if (e2w != null) {
                        DR0 dr0 = ((C27053DQy) e2w).A00;
                        if (C18020vd.A05(C18040vf.A02, dr0.A0M, 1052)) {
                            Rect A07 = AnonymousClass3MW.A07();
                            Point point = new Point();
                            dr0.A05.getGlobalVisibleRect(A07, point);
                            A07.offset(point.x - A07.left, point.y - A07.top);
                            dr0.A0J.set(A07);
                            if (dr0.A0C) {
                                dr0.BKs(false);
                                return;
                            } else {
                                dr0.BKP();
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                super.onAnimationEnd(animator);
                return;
        }
        animator2.start();
    }

    public void onAnimationRepeat(Animator animator) {
        if (9 - this.A00 != 0) {
            super.onAnimationRepeat(animator);
            return;
        }
        super.onAnimationRepeat(animator);
        C25692CkN ckN = (C25692CkN) this.A01;
        ckN.A02 = (ckN.A02 + 4) % ckN.A08.A08.length;
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 1:
                C454028v r4 = (C454028v) this.A01;
                ArrayList A10 = C17880vN.A10(r4.A02);
                int size = A10.size();
                for (int i = 0; i < size; i++) {
                    ((C6Y) A10.get(i)).A02(r4);
                }
                return;
            case 11:
                super.onAnimationStart(animator);
                BFE bfe = (BFE) this.A01;
                Property property = BFE.A0A;
                List<C6Y> list = bfe.A05;
                if (list != null && !bfe.A06) {
                    for (C6Y A02 : list) {
                        A02.A02(bfe);
                    }
                    return;
                }
                return;
            case 14:
                C26155CtN ctN = (C26155CtN) this.A01;
                Handler handler = C26155CtN.A0M;
                E2T e2t = ctN.A0K;
                int i2 = ctN.A0C;
                int i3 = ctN.A0A;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) e2t;
                snackbarContentLayout.A02.setAlpha(0.0f);
                long j = (long) i3;
                ViewPropertyAnimator duration = snackbarContentLayout.A02.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.A03;
                long j2 = (long) (i2 - i3);
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.A01.getVisibility() == 0) {
                    snackbarContentLayout.A01.setAlpha(0.0f);
                    snackbarContentLayout.A01.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    return;
                }
                return;
            case 16:
                ((C25277CcZ) this.A01).A02.A0A(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
