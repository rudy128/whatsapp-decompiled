package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: X.25o  reason: invalid class name and case insensitive filesystem */
public class C449925o extends AnimatorListenerAdapter {
    public boolean A00 = false;
    public final View A01;

    public void onAnimationEnd(Animator animator) {
        View view = this.A01;
        C25446Cfx.A02.A04(view, 1.0f);
        if (this.A00) {
            view.setLayerType(0, (Paint) null);
        }
    }

    public void onAnimationStart(Animator animator) {
        View view = this.A01;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.A00 = true;
            view.setLayerType(2, (Paint) null);
        }
    }

    public C449925o(View view) {
        this.A01 = view;
    }
}
