package X;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class D5M implements Animation.AnimationListener {
    public final int A00;
    public final Object A01;

    public D5M(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.A00 = i;
        this.A01 = swipeRefreshLayout;
    }

    public void onAnimationEnd(Animation animation) {
        E3e e3e;
        if (this.A00 != 0) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.A01;
            C22653BHv bHv = new C22653BHv(swipeRefreshLayout, 1);
            swipeRefreshLayout.A0B = bHv;
            bHv.setDuration(150);
            C22657BIh bIh = swipeRefreshLayout.A0C;
            bIh.A00 = null;
            bIh.clearAnimation();
            bIh.startAnimation(swipeRefreshLayout.A0B);
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) this.A01;
        if (swipeRefreshLayout2.A0G) {
            BFC bfc = swipeRefreshLayout2.A0D;
            bfc.setAlpha(255);
            bfc.start();
            if (swipeRefreshLayout2.A0F && (e3e = swipeRefreshLayout2.A0E) != null) {
                e3e.C2k();
            }
            swipeRefreshLayout2.A01 = swipeRefreshLayout2.A0C.getTop();
            return;
        }
        swipeRefreshLayout2.A05();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
