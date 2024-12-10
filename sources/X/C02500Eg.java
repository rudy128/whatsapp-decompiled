package X;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;

/* renamed from: X.0Eg  reason: invalid class name and case insensitive filesystem */
public abstract class C02500Eg {
    public static final AnonymousClass0WQ A00(C03710Kf r4, int i, int i2, int i3) {
        Bitmap.Config config;
        Bitmap createBitmap;
        if (i3 == 0) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ALPHA_8;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = C02510Eh.A00(r4, i, i2, i3);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, config);
            createBitmap.setHasAlpha(true);
        }
        return new AnonymousClass0WQ(createBitmap);
    }
}
