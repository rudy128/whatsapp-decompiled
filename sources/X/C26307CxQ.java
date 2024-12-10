package X;

import android.animation.Animator;
import java.util.AbstractMap;

/* renamed from: X.CxQ  reason: case insensitive filesystem */
public final class C26307CxQ implements Animator.AnimatorListener {
    public final /* synthetic */ DOZ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public C26307CxQ(DOZ doz, String str, boolean z) {
        this.A02 = z;
        this.A00 = doz;
        this.A01 = str;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A02) {
            DOZ doz = this.A00;
            ((AbstractMap) doz.A01(2131428149)).remove(this.A01);
        }
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A02) {
            DOZ doz = this.A00;
            ((AbstractMap) doz.A01(2131428149)).remove(this.A01);
        }
    }
}
