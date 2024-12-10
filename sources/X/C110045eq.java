package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.5eq  reason: invalid class name and case insensitive filesystem */
public class C110045eq extends Animation {
    public final int A00;
    public final int A01;
    public final View A02;
    public final /* synthetic */ C143087By A03;

    public boolean willChangeBounds() {
        return true;
    }

    public C110045eq(View view, C143087By r3, int i) {
        this.A03 = r3;
        this.A02 = view;
        this.A01 = i;
        this.A00 = view.getHeight();
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i + ((int) (((float) (this.A01 - i)) * f));
        View view = this.A02;
        AnonymousClass3MX.A1F(view, i2);
        view.requestLayout();
        C143087By r2 = this.A03;
        C143087By.A09(r2, (float) AnonymousClass3MW.A02(r2.A0A, i2), false);
    }
}
