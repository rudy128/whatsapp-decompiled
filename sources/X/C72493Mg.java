package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.3Mg  reason: invalid class name and case insensitive filesystem */
public class C72493Mg extends AnimatorListenerAdapter {
    public final float A00;
    public final int A01;
    public final Object A02;

    public C72493Mg(Object obj, float f, int i) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = f;
    }

    public void onAnimationCancel(Animator animator) {
        int i = this.A01;
        Object obj = this.A02;
        switch (i) {
            case 0:
                ((View) obj).setX(this.A00);
                return;
            case 1:
                ((C108285bR) obj).setBackgroundScale(this.A00);
                return;
            default:
                ((C108285bR) obj).setForegroundScale(this.A00);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A01 != 0) {
            super.onAnimationEnd(animator);
        } else {
            ((View) this.A02).setX(this.A00);
        }
    }
}
