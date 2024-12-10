package com.facebook.flexlayout.layoutoutput;

import X.BEB;

public class LayoutOutput {
    public float[] arr;
    public final Object[] measureResults;

    public int getChildrenCount() {
        return this.measureResults.length;
    }

    public float getHeight() {
        return this.arr[1];
    }

    public float getLeftForChildAt(int i) {
        return this.arr[BEB.A01(i)];
    }

    public Object getMeasureResultForChildAt(int i) {
        return this.measureResults[i];
    }

    public float getTopForChildAt(int i) {
        return this.arr[BEB.A01(i) + 1];
    }

    public float getWidth() {
        return this.arr[0];
    }

    public LayoutOutput(int i) {
        this.measureResults = new Object[i];
        this.arr = new float[BEB.A01(i)];
    }
}
