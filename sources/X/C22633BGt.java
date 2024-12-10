package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;

/* renamed from: X.BGt  reason: case insensitive filesystem */
public class C22633BGt extends Transition {
    public static final String[] A02;
    public final boolean A00;
    public final boolean A01;

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float f;
        float f2;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues != null) {
            TransitionValues transitionValues4 = transitionValues2;
            if (transitionValues2 != null) {
                CZN czn = (CZN) transitionValues3.values.get("circleTransition:transforms");
                CZN czn2 = (CZN) transitionValues4.values.get("circleTransition:transforms");
                if (!(czn == null || czn2 == null || czn.equals(czn2))) {
                    float f3 = ((float) czn.A07) * czn.A00;
                    int i = czn2.A07;
                    int i2 = i;
                    float f4 = (float) i;
                    float f5 = czn2.A00;
                    float f6 = f4 * f5;
                    float f7 = ((float) ((-czn2.A08) + czn.A08)) + ((f3 - f6) / 2.0f) + czn.A02;
                    int i3 = czn2.A06;
                    int i4 = i3;
                    float f8 = (float) i3;
                    float f9 = f7 + ((f6 - (f8 * f5)) / 2.0f);
                    float f10 = (float) ((-czn2.A09) + czn.A09);
                    float f11 = ((float) czn.A04) * czn.A01;
                    int i5 = czn2.A04;
                    int i6 = i5;
                    float f12 = (float) i5;
                    float f13 = czn2.A01;
                    float f14 = f12 * f13;
                    int i7 = czn2.A05;
                    float f15 = (float) i7;
                    float f16 = f10 + ((f11 - f14) / 2.0f) + czn.A03 + ((f14 - (f15 * f13)) / 2.0f);
                    float f17 = czn2.A02;
                    if (f4 / f8 < 1.0f) {
                        f = (((f6 - f8) / 2.0f) + f6) * f5;
                    } else {
                        f = 0.0f;
                    }
                    float f18 = f17 + f;
                    float f19 = czn2.A03;
                    if (f12 / f15 < 1.0f) {
                        f2 = (((f14 - f15) / 2.0f) + f14) * f13;
                    } else {
                        f2 = 0.0f;
                    }
                    float f20 = f19 + f2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(transitionValues4.view, View.TRANSLATION_X, View.TRANSLATION_Y, getPathMotion().getPath(f9, f16, f18, f20));
                    transitionValues4.view.setTranslationX(f9);
                    transitionValues4.view.setTranslationY(f16);
                    float min = Math.min(f3 / f8, f11 / f15);
                    View view = transitionValues4.view;
                    Property property = View.SCALE_X;
                    float[] fArr = new float[2];
                    fArr[0] = min;
                    ObjectAnimator A0C = C108945cZ.A0C(property, view, fArr, f6 / f8, 1);
                    View view2 = transitionValues4.view;
                    Property property2 = View.SCALE_Y;
                    float[] fArr2 = new float[2];
                    fArr2[0] = min;
                    ObjectAnimator A0C2 = C108945cZ.A0C(property2, view2, fArr2, f14 / f15, 1);
                    float max = (float) Math.max(i2, i4);
                    float max2 = (float) Math.max(i6, i7);
                    float min2 = Math.min(max, max2) / 2.0f;
                    float A002 = (float) (BE9.A00(max, max2) / 2.0d);
                    View view3 = transitionValues4.view;
                    int i8 = ((int) max) / 2;
                    int i9 = ((int) max2) / 2;
                    float f21 = A002;
                    if (this.A01) {
                        f21 = min2;
                    }
                    boolean z = this.A00;
                    if (!z) {
                        min2 = A002;
                    }
                    BEE bee = new BEE(ViewAnimationUtils.createCircularReveal(view3, i8, i9, f21, min2));
                    transitionValues4.view.setAlpha(0.0f);
                    bee.addListener(new BEL(transitionValues4, czn2, this, 1));
                    if (z) {
                        transitionValues4.view.setOutlineProvider(new BHs(this, czn2, 1));
                        transitionValues4.view.setClipToOutline(true);
                        transitionValues4.view.invalidateOutline();
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    Animator[] animatorArr = new Animator[4];
                    animatorArr[0] = ofFloat;
                    animatorArr[1] = bee;
                    AnonymousClass001.A1R(A0C, A0C2, animatorArr);
                    animatorSet.playTogether(animatorArr);
                    animatorSet.setInterpolator(getInterpolator());
                    return animatorSet;
                }
            }
        }
        return null;
    }

    public void captureEndValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            transitionValues.values.put("circleTransition:transforms", new CZN(transitionValues.view));
        }
    }

    public void captureStartValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            transitionValues.values.put("circleTransition:transforms", new CZN(transitionValues.view));
        }
    }

    public String[] getTransitionProperties() {
        return A02;
    }

    static {
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "circleTransition:transforms";
        A02 = A1Y;
    }

    public C22633BGt(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
