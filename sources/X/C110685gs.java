package X;

import android.widget.Scroller;

/* renamed from: X.5gs  reason: invalid class name and case insensitive filesystem */
public final class C110685gs extends Scroller {
    public float A00;

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        float f = this.A00;
        if (f != 0.0f) {
            i5 = (int) (f * ((float) i5));
        }
        super.startScroll(i, i2, i3, i4, i5);
    }
}
