package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.BHv  reason: case insensitive filesystem */
public class C22653BHv extends Animation {
    public final int A00;
    public final Object A01;

    public C22653BHv(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.A00 = i;
        this.A01 = swipeRefreshLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        switch (this.A00) {
            case 0:
                ((SwipeRefreshLayout) this.A01).setAnimationProgress(f);
                return;
            case 1:
                ((SwipeRefreshLayout) this.A01).setAnimationProgress(1.0f - f);
                return;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.A01;
                BEB.A0s(swipeRefreshLayout, f, swipeRefreshLayout.A06 - Math.abs(swipeRefreshLayout.A05), swipeRefreshLayout.A03);
                BFC bfc = swipeRefreshLayout.A0D;
                float f2 = 1.0f - f;
                CUQ cuq = bfc.A05;
                if (f2 != cuq.A00) {
                    cuq.A00 = f2;
                }
                bfc.invalidateSelf();
                return;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) this.A01;
                BEB.A0s(swipeRefreshLayout2, f, swipeRefreshLayout2.A05, swipeRefreshLayout2.A03);
                return;
        }
    }
}
