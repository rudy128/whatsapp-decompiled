package X;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;

/* renamed from: X.0Eh  reason: invalid class name and case insensitive filesystem */
public abstract class C02510Eh {
    public static final Bitmap A00(C03710Kf r5, int i, int i2, int i3) {
        Bitmap.Config config;
        if (i3 == 0) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ALPHA_8;
        }
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, C02490Ef.A00(r5));
    }
}
