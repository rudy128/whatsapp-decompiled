package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.04H  reason: invalid class name */
public class AnonymousClass04H extends AnimatorListenerAdapter {
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public AnonymousClass04H(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    public void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A00 = null;
        actionBarOverlayLayout.A03 = false;
    }

    public void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A00 = null;
        actionBarOverlayLayout.A03 = false;
    }
}
