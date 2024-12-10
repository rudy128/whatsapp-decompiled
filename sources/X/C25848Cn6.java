package X;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Cn6  reason: case insensitive filesystem */
public abstract class C25848Cn6 {
    public static final Interpolator A01 = new C26312CxV(1);
    public static final Interpolator A02 = new C26312CxV(2);
    public int A00 = -1;

    public abstract int A01(C42011xT r1, RecyclerView recyclerView);

    public boolean A05() {
        return true;
    }

    public boolean A06() {
        return true;
    }

    public boolean A07(C42011xT r2, C42011xT r3, RecyclerView recyclerView) {
        return true;
    }

    public abstract boolean A08(C42011xT r1, C42011xT r2, RecyclerView recyclerView);

    public int A02(RecyclerView recyclerView, int i, int i2, long j) {
        int i3 = this.A00;
        if (i3 == -1) {
            i3 = recyclerView.getResources().getDimensionPixelSize(2131167190);
            this.A00 = i3;
        }
        int abs = Math.abs(i2);
        float f = (float) abs;
        float f2 = 1.0f;
        int signum = (int) (((float) (((int) Math.signum((float) i2)) * i3)) * A02.getInterpolation(Math.min(1.0f, (f * 1.0f) / ((float) i))));
        if (j <= 2000) {
            f2 = ((float) j) / 2000.0f;
        }
        int interpolation = (int) (((float) signum) * A01.getInterpolation(f2));
        if (interpolation != 0) {
            return interpolation;
        }
        if (i2 > 0) {
            return 1;
        }
        return -1;
    }

    public void A04(C42011xT r5, RecyclerView recyclerView) {
        View view = r5.A0H;
        Object tag = view.getTag(2131431852);
        if (tag instanceof Float) {
            AnonymousClass1HF.A0W(view, AnonymousClass000.A04(tag));
        }
        view.setTag(2131431852, (Object) null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public final int A00(C42011xT r6, RecyclerView recyclerView) {
        int A012 = A01(r6, recyclerView);
        int layoutDirection = recyclerView.getLayoutDirection();
        int i = A012 & 3158064;
        if (i == 0) {
            return A012;
        }
        int i2 = A012 & (i ^ -1);
        if (layoutDirection != 0) {
            int i3 = i >> 1;
            i2 |= -3158065 & i3;
            i = i3 & 3158064;
        }
        return i2 | (i >> 2);
    }

    public void A03(C42011xT r1, int i) {
    }
}
