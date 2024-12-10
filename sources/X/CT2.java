package X;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.AccelerateInterpolator;

public class CT2 {
    public float A00;
    public int A01;
    public boolean A02;
    public final ValueAnimator A03;
    public final ValueAnimator A04;
    public final PointF A05;

    public CT2(PointF pointF, C24931CQe cQe, float f, float f2, int i, long j) {
        this.A05 = pointF;
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.2f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A03 = ofFloat;
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(accelerateInterpolator);
        ofFloat.addUpdateListener(new C26318Cxb(this, f, f2, i));
        ofFloat.addListener(new BEJ(cQe, this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A04 = ofFloat2;
        ofFloat2.setDuration(200);
        ofFloat2.setInterpolator(accelerateInterpolator);
        ofFloat2.addUpdateListener(new C26316CxZ(this, f, f2));
        ofFloat2.addListener(new BEK(cQe, this, j));
    }
}
