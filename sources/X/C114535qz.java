package X;

import android.view.animation.Animation;

/* renamed from: X.5qz  reason: invalid class name and case insensitive filesystem */
public class C114535qz extends C90704eV {
    public final /* synthetic */ Animation A00;
    public final /* synthetic */ AnonymousClass7OH A01;
    public final /* synthetic */ boolean A02;

    public C114535qz(Animation animation, AnonymousClass7OH r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = animation;
    }

    public void onAnimationEnd(Animation animation) {
        boolean z = this.A02;
        AnonymousClass7OH r1 = this.A01;
        int i = 2131232163;
        if (z) {
            i = 2131232100;
        }
        r1.A03(i);
        r1.A0B.startAnimation(this.A00);
    }

    public void onAnimationStart(Animation animation) {
        this.A01.A0B.setClickable(false);
    }
}
