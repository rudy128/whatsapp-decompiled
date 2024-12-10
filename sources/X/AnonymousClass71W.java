package X;

import android.view.View;
import android.view.animation.ScaleAnimation;

/* renamed from: X.71W  reason: invalid class name */
public final class AnonymousClass71W {
    public static final AnonymousClass71W A00 = new Object();

    public static final void A00(View view, boolean z, boolean z2) {
        C18070vi.A0d(view, 0);
        A00.A01(view, 125, z, z2);
    }

    public final void A01(View view, int i, boolean z, boolean z2) {
        int visibility = view.getVisibility();
        if (z) {
            if (visibility != 0) {
                view.setVisibility(0);
                if (z2) {
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                    C108995ce.A0y(scaleAnimation, (long) i);
                    scaleAnimation.setFillBefore(true);
                    view.startAnimation(scaleAnimation);
                }
            }
        } else if (visibility == 0) {
            if (z2) {
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                C108995ce.A0y(scaleAnimation2, (long) i);
                scaleAnimation2.setFillBefore(true);
                view.startAnimation(scaleAnimation2);
            }
            view.setVisibility(4);
        }
    }
}
