package X;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: X.05T  reason: invalid class name */
public final class AnonymousClass05T extends EdgeEffect {
    public float A00;
    public final float A01;

    public void onAbsorb(int i) {
        this.A00 = 0.0f;
        super.onAbsorb(i);
    }

    public void onPull(float f, float f2) {
        this.A00 = 0.0f;
        super.onPull(f, f2);
    }

    public void onRelease() {
        this.A00 = 0.0f;
        super.onRelease();
    }

    public AnonymousClass05T(Context context) {
        super(context);
        this.A01 = C78.A00(context).CPQ(1.0f);
    }

    public void onPull(float f) {
        this.A00 = 0.0f;
        super.onPull(f);
    }
}
