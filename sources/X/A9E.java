package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

public class A9E implements ValueAnimator.AnimatorUpdateListener {
    public final RecyclerView A00;
    public final BM0 A01;

    public A9E(RecyclerView recyclerView, BM0 bm0) {
        this.A00 = recyclerView;
        this.A01 = bm0;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A00 = AnonymousClass000.A04(valueAnimator.getAnimatedValue());
        this.A00.invalidate();
    }
}
