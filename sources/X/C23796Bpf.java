package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.Bpf  reason: case insensitive filesystem */
public class C23796Bpf extends C90704eV {
    public final /* synthetic */ C24149BwF A00;

    public C23796Bpf(C24149BwF bwF) {
        this.A00 = bwF;
    }

    public void onAnimationEnd(Animation animation) {
        View view;
        C24149BwF bwF = this.A00;
        bwF.A0Y.clearAnimation();
        bwF.removeCallbacks(bwF.A0t);
        bwF.A0L = false;
        if (bwF.A0M) {
            bwF.A0a.setVisibility(8);
            bwF.A0k.setVisibility(8);
            view = bwF.A0i;
        } else {
            view = bwF.A0l;
        }
        view.setVisibility(8);
    }
}
