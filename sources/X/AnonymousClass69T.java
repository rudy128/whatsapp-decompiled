package X;

import android.graphics.RectF;

/* renamed from: X.69T  reason: invalid class name */
public final class AnonymousClass69T extends C1409773u {
    public void A0O(RectF rectF, float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = f5;
        if (f5 > f6) {
            f7 = f6;
        }
        RectF rectF2 = this.A06;
        float f8 = (f5 - f7) / 2.0f;
        float f9 = (f6 - f7) / 2.0f;
        rectF2.set(f + f8, f2 + f9, f3 - f8, f4 - f9);
        rectF2.sort();
    }

    public AnonymousClass69T() {
        AnonymousClass3MW.A1P(this.A05);
    }
}
