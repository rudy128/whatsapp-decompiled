package com.facebook.imagepipeline.nativecode;

import X.AnonymousClass1AK;
import android.graphics.Bitmap;

public class NativeBlurFilter {
    public static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    static {
        AnonymousClass1AK.A00("native-filters");
    }
}
