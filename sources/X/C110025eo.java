package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.5eo  reason: invalid class name and case insensitive filesystem */
public final class C110025eo extends Animation {
    public final View A00;
    public final int A01;
    public final int A02;

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A02;
        int i2 = (int) (((float) i) + (((float) (this.A01 - i)) * f));
        View view = this.A00;
        AnonymousClass1HF.A0a(view, i2 - view.getTop());
    }

    public C110025eo(View view, int i) {
        this.A01 = i;
        this.A02 = view.getTop();
        this.A00 = view;
        setDuration(300);
    }
}
