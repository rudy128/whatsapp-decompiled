package X;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

public class BEv extends Animatable2.AnimationCallback {
    public final /* synthetic */ C6Y A00;

    public BEv(C6Y c6y) {
        this.A00 = c6y;
    }

    public void onAnimationEnd(Drawable drawable) {
        this.A00.A01(drawable);
    }

    public void onAnimationStart(Drawable drawable) {
        this.A00.A02(drawable);
    }
}
