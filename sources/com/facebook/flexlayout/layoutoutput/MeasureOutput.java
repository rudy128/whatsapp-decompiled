package com.facebook.flexlayout.layoutoutput;

import X.AnonymousClass00R;

public class MeasureOutput {
    public float[] arr;
    public final Object measureResult;

    public MeasureOutput(float f, float f2, float f3, Object obj) {
        float[] fArr = new float[AnonymousClass00R.A00(3).length];
        this.arr = fArr;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = Float.NaN;
        this.measureResult = obj;
    }
}
