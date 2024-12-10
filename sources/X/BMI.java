package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class BMI extends C25272CcK {
    public float A00;
    public int A01 = 0;
    public int A02 = 0;
    public PointF A03;
    public boolean A04 = false;
    public final DisplayMetrics A05;
    public final DecelerateInterpolator A06 = new DecelerateInterpolator();
    public final LinearInterpolator A07 = new LinearInterpolator();

    public void A03() {
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = null;
    }

    public int A0A(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 >= 0) {
                return 0;
            }
            return i7;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw AnonymousClass000.A0k("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int A0B(View view, int i) {
        C38251qy r2 = this.A02;
        if (r2 == null || !r2.A1I()) {
            return 0;
        }
        ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(view);
        return A0A((view.getLeft() - BE7.A0D(view).left) - A0B.leftMargin, view.getRight() + BE7.A0D(view).right + A0B.rightMargin, r2.A0M(), r2.A03 - r2.A0N(), i);
    }

    public int A0C(View view, int i) {
        C38251qy r2 = this.A02;
        if (r2 == null || !r2.A1J()) {
            return 0;
        }
        ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(view);
        return A0A((view.getTop() - BE7.A0D(view).top) - A0B.topMargin, view.getBottom() + BE7.A0D(view).bottom + A0B.bottomMargin, r2.A0O(), r2.A00 - r2.A0L(), i);
    }

    public float A06(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int A07() {
        PointF pointF = this.A03;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.x;
        if (f == 0.0f) {
            return 0;
        }
        if (f > 0.0f) {
            return 1;
        }
        return -1;
    }

    public int A08() {
        PointF pointF = this.A03;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        if (f > 0.0f) {
            return 1;
        }
        return -1;
    }

    public BMI(Context context) {
        this.A05 = C108965cb.A08(context);
    }

    public void A05(View view, C67 c67) {
        int A0B = A0B(view, A07());
        int A0C = A0C(view, A08());
        int A032 = BE7.A03((double) A09((int) Math.sqrt((double) ((A0B * A0B) + (A0C * A0C)))), 0.3356d);
        if (A032 > 0) {
            DecelerateInterpolator decelerateInterpolator = this.A06;
            c67.A02 = -A0B;
            c67.A03 = -A0C;
            c67.A01 = A032;
            c67.A05 = decelerateInterpolator;
            c67.A06 = true;
        }
    }

    public int A09(int i) {
        float abs = (float) Math.abs(i);
        if (!this.A04) {
            this.A00 = A06(this.A05);
            this.A04 = true;
        }
        return BE8.A03(abs, this.A00);
    }
}
