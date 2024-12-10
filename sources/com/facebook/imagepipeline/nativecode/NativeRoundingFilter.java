package com.facebook.imagepipeline.nativecode;

import X.AnonymousClass1AK;
import X.C26208Cuj;
import android.graphics.Bitmap;

public class NativeRoundingFilter {
    public static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    public static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    public static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    public static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    static {
        AnonymousClass1AK.A00("native-filters");
    }

    public static void toCircle(Bitmap bitmap, boolean z) {
        C26208Cuj.A01(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFilter(bitmap, z);
        }
    }

    public static void toCircleFast(Bitmap bitmap, boolean z) {
        C26208Cuj.A01(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFastFilter(bitmap, z);
        }
    }
}
