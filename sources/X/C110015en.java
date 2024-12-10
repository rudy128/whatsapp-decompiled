package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.5en  reason: invalid class name and case insensitive filesystem */
public class C110015en extends Animation {
    public final /* synthetic */ C110335fK A00;

    public C110015en(C110335fK r1) {
        this.A00 = r1;
    }

    public void applyTransformation(float f, Transformation transformation) {
        C110335fK r1 = this.A00;
        r1.A00 = 1.0f - f;
        r1.invalidate();
    }
}
