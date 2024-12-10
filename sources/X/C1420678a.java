package X;

import android.view.View;

/* renamed from: X.78a  reason: invalid class name and case insensitive filesystem */
public final class C1420678a implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ AnonymousClass741 A02;

    public C1420678a(AnonymousClass741 r1, float f, float f2) {
        this.A02 = r1;
        this.A00 = f;
        this.A01 = f2;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        view.startAnimation(AnonymousClass741.A00(this.A00, this.A01));
    }
}
