package com.facebook.wearable.airshield.security;

import X.AnonymousClass1A8;
import X.CAX;
import com.facebook.jni.HybridData;

public final class Hint {
    public static final CAX Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    /* access modifiers changed from: private */
    public final native void createHintNative(byte[] bArr);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native byte[] serializeNative();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CAX] */
    static {
        AnonymousClass1A8.A06("airshield_light_mbed_jni");
    }

    public final byte[] serialize() {
        return serializeNative();
    }
}
