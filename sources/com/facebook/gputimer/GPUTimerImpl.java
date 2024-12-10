package com.facebook.gputimer;

import X.C25311CdG;
import com.facebook.jni.HybridData;

public final class GPUTimerImpl {
    public static final C25311CdG Companion = new Object();
    public static final Class TAG = GPUTimerImpl.class;
    public final HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    public native void beginFrame();

    public native void beginMarker(int i);

    public native int createTimerHandle(String str);

    public native void endFrame();

    public native void endMarker();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CdG] */
    static {
        C25311CdG.A00();
    }
}
