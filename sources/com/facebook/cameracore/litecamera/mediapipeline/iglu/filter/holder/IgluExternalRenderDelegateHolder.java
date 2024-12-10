package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder;

import X.AnonymousClass1A8;
import X.C8K;
import com.facebook.jni.HybridData;

public abstract class IgluExternalRenderDelegateHolder {
    public static final C8K Companion = new Object();

    public static final native HybridData initHybrid(FilterWeakPtr filterWeakPtr, IgluExternalRenderDelegateWrapper igluExternalRenderDelegateWrapper);

    private final native void releaseNative();

    public abstract void release();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.C8K] */
    static {
        AnonymousClass1A8.A06("mediapipeline-iglufilter-holder");
    }
}
