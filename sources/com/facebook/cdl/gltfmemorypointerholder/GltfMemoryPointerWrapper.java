package com.facebook.cdl.gltfmemorypointerholder;

import X.AnonymousClass1A8;
import X.C24539C8k;
import com.facebook.jni.HybridData;

public final class GltfMemoryPointerWrapper {
    public static final C24539C8k Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native boolean hasColorizationData();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.C8k] */
    static {
        AnonymousClass1A8.A06("gltfholdernew");
    }
}
