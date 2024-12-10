package X;

import android.animation.ValueAnimator;

/* renamed from: X.3Mr  reason: invalid class name and case insensitive filesystem */
public final class C72573Mr extends ValueAnimator {
    public final C18090vk A00;
    public final float A01;

    public C72573Mr(C18090vk r3, C22821Di r4, float f, float f2) {
        this.A01 = f;
        this.A00 = r3;
        setFloatValues(new float[]{f, f2});
        setDuration(200);
        addListener(new AnonymousClass3Mo(this, 3));
        C88754aj.A00(this, r4, 7);
    }

    public final void A00() {
        if (this.A01 <= 0.0f) {
            this.A00.invoke();
        } else {
            super.start();
        }
    }
}
