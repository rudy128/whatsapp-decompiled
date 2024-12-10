package X;

import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;

/* renamed from: X.6x5  reason: invalid class name and case insensitive filesystem */
public final class C138446x5 {
    public ViewPropertyAnimator A00;
    public ViewPropertyAnimator A01;
    public boolean A02;
    public boolean A03;
    public final Interpolator A04 = new LinearInterpolator();

    public static final void A00(Fragment fragment, C138446x5 r3, C28931bI r4) {
        if (fragment.A1b() && !fragment.A0Z && !fragment.A0j && fragment.A1n() != null) {
            r4.A02().setAlpha(0.0f);
            C72463Mc.A0N(r4).post(new C146797Qq(r4, r3, 15));
        }
    }
}
