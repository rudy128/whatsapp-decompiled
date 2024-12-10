package X;

import android.animation.ValueAnimator;
import com.whatsapp.components.SegmentedProgressBar;

/* renamed from: X.74d  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1410674d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SegmentedProgressBar A01;
    public final /* synthetic */ float[] A02;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = this.A02;
        int i = this.A00;
        SegmentedProgressBar segmentedProgressBar = this.A01;
        fArr[i] = C72483Me.A00(valueAnimator, 3);
        segmentedProgressBar.postInvalidate();
    }

    public /* synthetic */ C1410674d(SegmentedProgressBar segmentedProgressBar, float[] fArr, int i) {
        this.A02 = fArr;
        this.A00 = i;
        this.A01 = segmentedProgressBar;
    }
}
