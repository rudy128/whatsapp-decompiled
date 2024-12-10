package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder;

import X.AnonymousClass1A8;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.insights.GPUInsights;
import com.facebook.jni.HybridData;

public class IgluConfigHolder {
    public final HybridData mHybridData;

    private native void attachInsightsNative(GPUInsights gPUInsights);

    private native void detachInsightsNative(GPUInsights gPUInsights);

    private native void releaseNative();

    static {
        AnonymousClass1A8.A06("mediapipeline-iglufilter-holder");
    }

    public IgluConfigHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void release() {
        releaseNative();
    }
}
