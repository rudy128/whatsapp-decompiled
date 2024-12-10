package X;

import android.view.View;

/* renamed from: X.D4u  reason: case insensitive filesystem */
public final class C26580D4u implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;

    public C26580D4u(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float f = this.A00;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setTranslationY(C108945cZ.A04(view) * this.A01 * f);
    }
}
