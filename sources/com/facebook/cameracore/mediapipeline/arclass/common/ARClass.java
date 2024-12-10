package com.facebook.cameracore.mediapipeline.arclass.common;

import X.AnonymousClass1A8;
import X.C8S;
import com.facebook.jni.HybridData;

public final class ARClass {
    public static final C8S Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(int i);

    public final native int getValue();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C8S, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("arclass");
    }

    public ARClass(int i) {
        this.mHybridData = initHybrid(0);
    }

    public ARClass(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
