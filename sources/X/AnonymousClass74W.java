package X;

import android.animation.TimeInterpolator;

/* renamed from: X.74W  reason: invalid class name */
public class AnonymousClass74W implements TimeInterpolator {
    public final C122956So A00;

    public float getInterpolation(float f) {
        if (((double) f) > 0.5d) {
            return Math.min(f, (float) C122956So.A00(this.A00));
        }
        return 0.0f;
    }

    public AnonymousClass74W(C122956So r1) {
        this.A00 = r1;
    }
}
