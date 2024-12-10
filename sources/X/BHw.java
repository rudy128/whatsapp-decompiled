package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class BHw extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SwipeRefreshLayout A02;

    public BHw(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.A02 = swipeRefreshLayout;
        this.A01 = i;
        this.A00 = i2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        BFC bfc = this.A02.A0D;
        int i = this.A01;
        bfc.setAlpha((int) (((float) i) + (((float) (this.A00 - i)) * f)));
    }
}
