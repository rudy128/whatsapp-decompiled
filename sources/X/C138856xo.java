package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.6xo  reason: invalid class name and case insensitive filesystem */
public final class C138856xo {
    public static int A01;
    public static WeakReference A02;
    public ValueAnimator A00;

    public final void A01(View view, boolean z) {
        C18070vi.A0d(view, 0);
        if (!z) {
            A00(this);
            view.setVisibility(8);
        } else if (view.getVisibility() == 8) {
            A00(this);
        } else {
            int height = view.getHeight();
            C109195cy r0 = new C109195cy(view, 33);
            A00(this);
            ValueAnimator A0B = C108995ce.A0B(height, 0);
            this.A00 = A0B;
            if (A0B != null) {
                C109005cf.A0I(r0, A0B);
                C1411074h.A00(A0B, view, 26);
                A0B.setStartDelay(0);
                A0B.start();
            }
        }
    }

    public static final void A00(C138856xo r1) {
        ValueAnimator valueAnimator = r1.A00;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = r1.A00;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = r1.A00;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
    }
}
