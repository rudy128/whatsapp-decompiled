package com.facebook.flexlayout;

import X.AnonymousClass1A8;
import com.facebook.flexlayout.layoutoutput.LayoutOutput;

public class FlexLayoutNative {
    public static native void jni_calculateLayout(float[] fArr, float[][] fArr2, float f, float f2, float f3, float f4, float f5, float f6, LayoutOutput layoutOutput, FlexLayoutNativeMeasureCallback flexLayoutNativeMeasureCallback);

    static {
        AnonymousClass1A8.A06("flexlayout");
    }
}
