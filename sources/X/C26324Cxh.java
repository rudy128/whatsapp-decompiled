package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.Cxh  reason: case insensitive filesystem */
public class C26324Cxh implements ValueAnimator.AnimatorUpdateListener {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final Object A06;

    public static int A00(ValueAnimator valueAnimator, float f, int i, int i2) {
        return C22339B3q.A01(f + (((float) (i - i2)) * valueAnimator.getAnimatedFraction()));
    }

    public C26324Cxh(ValueAnimator valueAnimator, C22645BHh bHh, float f, float f2, int i, int i2, int i3) {
        this.A02 = i3;
        this.A06 = bHh;
        if (i3 != 0) {
            this.A01 = f;
            this.A00 = f2;
            this.A03 = i;
            this.A04 = i2;
            this.A05 = valueAnimator;
        } else {
            this.A03 = i;
            this.A04 = i2;
            this.A05 = valueAnimator;
            this.A01 = f;
            this.A00 = f2;
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C04220Mi r1;
        C04220Mi r12;
        C23679Bnm bnm;
        C04220Mi r2;
        switch (this.A02) {
            case 0:
                C22645BHh bHh = (C22645BHh) this.A06;
                ViewGroup viewGroup = bHh.A00;
                if (viewGroup != null && (r1 = bHh.A01) != null) {
                    float A0B = (float) BE8.A0B(r1.A01);
                    float A0A = (float) BE8.A0A(r1.A01);
                    int[] iArr = new int[2];
                    bHh.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    int i = this.A03;
                    int i2 = iArr2[0];
                    int i3 = i - i2;
                    int i4 = this.A04;
                    int i5 = iArr2[1];
                    int i6 = i4 - i5;
                    int i7 = iArr[1] - i5;
                    C23679Bnm bnm2 = bHh.A03;
                    ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(bnm2);
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.A05;
                    A0P.leftMargin = C22339B3q.A01(((float) i3) + (((float) ((iArr[0] - i2) - i3)) * valueAnimator2.getAnimatedFraction()));
                    A0P.topMargin = A00(valueAnimator2, (float) i6, i7, i6);
                    int A012 = C22339B3q.A01(C17880vN.A00(A0B, this.A01, valueAnimator2.getAnimatedFraction()));
                    int A013 = C22339B3q.A01(C17880vN.A00(A0A, this.A00, valueAnimator2.getAnimatedFraction()));
                    bnm2.A01 = A012;
                    bnm2.A00 = A013;
                    C23679Bnm.A02(bnm2);
                    bnm2.requestLayout();
                    return;
                }
                return;
            case 1:
                C22645BHh bHh2 = (C22645BHh) this.A06;
                ViewGroup viewGroup2 = bHh2.A00;
                if (viewGroup2 != null && (r12 = bHh2.A01) != null) {
                    float A0B2 = (float) BE8.A0B(r12.A01);
                    float A0A2 = (float) BE8.A0A(r12.A01);
                    float f = this.A01;
                    float f2 = this.A00;
                    float min = Math.min(f / A0B2, f2 / A0A2);
                    float f3 = 1.0f - min;
                    float f4 = f / min;
                    float f5 = f2 / min;
                    int[] iArr3 = new int[2];
                    viewGroup2.getLocationOnScreen(iArr3);
                    int i8 = this.A03 - iArr3[0];
                    int i9 = this.A04 - iArr3[1];
                    int[] iArr4 = new int[2];
                    bHh2.getLocationOnScreen(iArr4);
                    int i10 = iArr4[0] - iArr3[0];
                    int i11 = iArr4[1] - iArr3[1];
                    bnm = bHh2.A03;
                    ViewGroup.MarginLayoutParams A0P2 = C72463Mc.A0P(bnm);
                    ValueAnimator valueAnimator3 = (ValueAnimator) this.A05;
                    bnm.setScaleX((valueAnimator3.getAnimatedFraction() * f3) + min);
                    bnm.setScaleY(min + (valueAnimator3.getAnimatedFraction() * f3));
                    float animatedFraction = valueAnimator3.getAnimatedFraction() * (A0A2 - f5);
                    int A002 = A00(valueAnimator3, ((float) i8) - ((f4 - (bnm.getScaleX() * f4)) / 2.0f), i10, i8);
                    int A003 = A00(valueAnimator3, ((float) i9) - ((f5 - (bnm.getScaleY() * f5)) / 2.0f), i11, i9);
                    A0P2.leftMargin = A002;
                    A0P2.topMargin = A003;
                    int A014 = C22339B3q.A01(f4 + (valueAnimator3.getAnimatedFraction() * (A0B2 - f4)));
                    int A015 = C22339B3q.A01(f5 + animatedFraction);
                    bnm.A01 = A014;
                    bnm.A00 = A015;
                    C23679Bnm.A02(bnm);
                    break;
                } else {
                    return;
                }
            default:
                C22645BHh bHh3 = (C22645BHh) this.A06;
                ViewGroup viewGroup3 = bHh3.A00;
                if (viewGroup3 != null && (r2 = bHh3.A01) != null) {
                    float A0B3 = (float) BE8.A0B(r2.A01);
                    float A0A3 = (float) BE8.A0A(r2.A01);
                    float f6 = this.A01 / A0B3;
                    float f7 = this.A00 / A0A3;
                    int[] iArr5 = new int[2];
                    bHh3.getLocationOnScreen(iArr5);
                    int[] iArr6 = new int[2];
                    viewGroup3.getLocationOnScreen(iArr6);
                    int i12 = this.A03;
                    int i13 = iArr6[0];
                    int i14 = i12 - i13;
                    int i15 = this.A04;
                    int i16 = iArr6[1];
                    int i17 = i15 - i16;
                    int i18 = iArr5[1] - i16;
                    bnm = bHh3.A03;
                    ViewGroup.MarginLayoutParams A0P3 = C72463Mc.A0P(bnm);
                    ValueAnimator valueAnimator4 = (ValueAnimator) this.A05;
                    bnm.setScaleX(f6 + (valueAnimator4.getAnimatedFraction() * (1.0f - f6)));
                    bnm.setScaleY(f7 + (valueAnimator4.getAnimatedFraction() * (1.0f - f7)));
                    int A004 = A00(valueAnimator4, ((float) i14) - ((A0B3 - (bnm.getScaleX() * A0B3)) / 2.0f), iArr5[0] - i13, i14);
                    int A005 = A00(valueAnimator4, ((float) i17) - ((A0A3 - (bnm.getScaleY() * A0A3)) / 2.0f), i18, i17);
                    A0P3.leftMargin = A004;
                    A0P3.topMargin = A005;
                    break;
                } else {
                    return;
                }
        }
        bnm.requestLayout();
    }
}
