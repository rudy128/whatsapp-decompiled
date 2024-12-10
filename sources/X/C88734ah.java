package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.4ah  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C88734ah implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C80053wT A04;
    public final /* synthetic */ boolean A05;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.A00;
        C80053wT r8 = this.A04;
        boolean z = this.A05;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        int A002 = (int) (((float) i) * C72483Me.A00(valueAnimator, 6));
        ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(r8);
        A0P.height = A002;
        A0P.width = A002;
        int i5 = (i - A002) / 2;
        if (z) {
            A0P.setMargins((i2 - A002) - i5, i5, i3 + i5, A0P.bottomMargin);
        } else {
            A0P.setMargins(i4 + i5, i5, 0, A0P.bottomMargin);
        }
        r8.setLayoutParams(A0P);
    }

    public /* synthetic */ C88734ah(C80053wT r1, int i, int i2, int i3, int i4, boolean z) {
        this.A00 = i;
        this.A04 = r1;
        this.A05 = z;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }
}
