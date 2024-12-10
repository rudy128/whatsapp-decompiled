package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public abstract class C98 {
    public static final void A00(Drawable drawable, float f) {
        drawable.setLevel(C22339B3q.A01(f * 10000.0f));
        boolean A1U = BE8.A1U(drawable.getLevel(), 9990);
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (A1U) {
                animatable.start();
            } else {
                animatable.stop();
            }
        }
    }
}
