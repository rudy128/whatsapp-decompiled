package com.facebook.onecamera.components.mediapipeline.gl.context.igl;

import X.AnonymousClass1A8;
import X.C9W;
import com.facebook.jni.HybridData;
import java.util.Map;

public final class IglTexture {
    public static final C9W Companion = new Object();
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final native int getHandle();

    public final native int getHeight();

    public final native Map getParams();

    public final native int getTarget();

    public final native int getWidth();

    public final native void release();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C9W, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("mediapipeline-igl-context");
    }

    public IglTexture(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
