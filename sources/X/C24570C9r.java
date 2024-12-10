package X;

import android.graphics.Rect;

/* renamed from: X.C9r  reason: case insensitive filesystem */
public abstract class C24570C9r {
    public static final Rect A00(C24321BzI bzI, float f, int i, int i2) {
        int i3 = (int) (16.0f * f);
        float f2 = (float) (i - (i3 * 2));
        int ordinal = bzI.ordinal();
        float f3 = 1.5857725f;
        if (ordinal != 0) {
            if (ordinal == 1) {
                f3 = 1.418919f;
            } else if (ordinal == 2) {
                f3 = 1.4204545f;
            }
        }
        int i4 = (int) ((((float) i2) / 2.0f) - ((f2 * (1.0f / f3)) / 2.0f));
        return new Rect(i3, i4, i - i3, i2 - i4);
    }
}
