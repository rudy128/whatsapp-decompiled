package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.74f  reason: invalid class name and case insensitive filesystem */
public class C1410874f implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;

    public C1410874f(View view, int i, int i2, int i3, int i4) {
        this.A00 = i4;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.A00 != 0) {
            int i4 = this.A01;
            int i5 = this.A02;
            int i6 = this.A03;
            view = (View) this.A04;
            float A002 = C72483Me.A00(valueAnimator, 4);
            i = (int) (((float) i4) * A002);
            i2 = (int) (((float) i5) * A002);
            i3 = (int) (((float) i6) * A002);
            marginLayoutParams = C72463Mc.A0P(view);
        } else {
            int i7 = this.A01;
            int i8 = this.A02;
            int i9 = this.A03;
            view = (View) this.A04;
            float A003 = C72483Me.A00(valueAnimator, 4);
            float f = (float) i7;
            i = (int) (f - (f * A003));
            float f2 = (float) i8;
            i2 = (int) (f2 - (f2 * A003));
            float f3 = (float) i9;
            i3 = (int) (f3 - (f3 * A003));
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
        }
        marginLayoutParams.setMargins(i, i2, i, i3);
        view.setLayoutParams(marginLayoutParams);
    }
}
