package com.facebook.cameracore.litecamera.mediapipeline.iglu.insights;

import X.AnonymousClass1A8;
import X.C28420E0l;
import X.C8O;
import com.facebook.jni.HybridData;

public final class GPUInsights {
    public static final C8O Companion = new Object();
    public C28420E0l gpuEventLogger;
    public final HybridData mHybridData = initHybrid();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public final native void clearGPUError();

    public final native int getAllocatedTextureBytes();

    public final native int getAllocatedTextureCount();

    public final native String getGPUError();

    public final native String makeAndHoldATexture(int i, boolean z);

    public final native void triggerGPUError(int i);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.C8O] */
    static {
        AnonymousClass1A8.A06("mediapipeline-iglufilter-insights");
    }

    public final void logExistingEvents(String str) {
        getGPUError();
    }

    public final void setGpuLogger(C28420E0l e0l) {
        this.gpuEventLogger = e0l;
    }
}
