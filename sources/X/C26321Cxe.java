package X;

import android.animation.ValueAnimator;
import com.whatsapp.WaTextView;
import com.whatsapp.components.AutoScrollView;

/* renamed from: X.Cxe  reason: case insensitive filesystem */
public final /* synthetic */ class C26321Cxe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AutoScrollView A04;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.A01;
        int i2 = this.A02;
        AutoScrollView autoScrollView = this.A04;
        float f = this.A00;
        int i3 = this.A03;
        float A002 = ((float) i) * C72483Me.A00(valueAnimator, 5) * ((float) i2);
        WaTextView waTextView = autoScrollView.A09;
        waTextView.setTranslationX(f + A002);
        autoScrollView.A0A.setTranslationX(waTextView.getTranslationX() + ((float) (i * i3)));
    }

    public /* synthetic */ C26321Cxe(AutoScrollView autoScrollView, float f, int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A04 = autoScrollView;
        this.A00 = f;
        this.A03 = i3;
    }
}
