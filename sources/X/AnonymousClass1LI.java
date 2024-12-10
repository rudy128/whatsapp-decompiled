package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.1LI  reason: invalid class name */
public class AnonymousClass1LI extends AnonymousClass1LH {
    public static final TimeInterpolator A01 = new AccelerateInterpolator();
    public static final TimeInterpolator A02 = new DecelerateInterpolator();
    public static final AnonymousClass1LK A03 = new C453628r(1);
    public static final AnonymousClass1LK A04 = new C453528q(0);
    public static final AnonymousClass1LK A05 = new C453528q(1);
    public static final AnonymousClass1LK A06 = new C453628r(0);
    public AnonymousClass1LK A00 = A03;

    public static ObjectAnimator A02(TimeInterpolator timeInterpolator, View view, AnonymousClass1LG r16, C62392rK r17, float f, float f2, float f3, float f4, int i, int i2) {
        View view2 = view;
        float f5 = f2;
        float f6 = f;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        View view3 = r17.A00;
        int[] iArr = (int[]) view3.getTag(2131436424);
        if (iArr != null) {
            f6 = ((float) (iArr[0] - i)) + translationX;
            f5 = ((float) (iArr[1] - i2)) + translationY;
        }
        int round = i + Math.round(f6 - translationX);
        int round2 = i2 + Math.round(f5 - translationY);
        view.setTranslationX(f6);
        view.setTranslationY(f5);
        if (f6 == f3 && f5 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f6, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f5, f4})});
        C450225r r7 = new C450225r(view2, view3, translationX, translationY, round, round2);
        r16.A0N(r7);
        ofPropertyValuesHolder.addListener(r7);
        ofPropertyValuesHolder.addPauseListener(r7);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    public void A0X(int i) {
        AnonymousClass1LK r0;
        if (i == 3) {
            r0 = A04;
        } else if (i == 5) {
            r0 = A05;
        } else if (i == 48) {
            r0 = A06;
        } else if (i != 80) {
            throw new IllegalArgumentException("Invalid slide direction");
        } else {
            r0 = A03;
        }
        this.A00 = r0;
        AnonymousClass1LP r02 = new AnonymousClass1LP();
        r02.A01 = i;
        A0P(r02);
    }

    public AnonymousClass1LI(int i) {
        A0X(i);
    }

    public AnonymousClass1LI() {
        A0X(80);
    }
}
