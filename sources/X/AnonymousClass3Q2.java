package X;

import android.widget.LinearLayout;

/* renamed from: X.3Q2  reason: invalid class name */
public abstract class AnonymousClass3Q2 extends LinearLayout {
    public final void A01(int i, boolean z, int i2) {
        int i3 = 0;
        C72463Mc.A12(this);
        int i4 = i - i2;
        if (getMeasuredWidth() > i4) {
            float measuredWidth = ((float) i4) / ((float) getMeasuredWidth());
            if (z) {
                i3 = i + i2;
            }
            setPivotX((float) i3);
            setPivotY((float) getMeasuredHeight());
            setScaleX(measuredWidth);
            setScaleY(measuredWidth);
        }
    }
}
