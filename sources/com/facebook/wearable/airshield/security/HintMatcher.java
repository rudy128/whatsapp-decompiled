package com.facebook.wearable.airshield.security;

import X.AnonymousClass1A8;
import X.CAY;
import com.facebook.jni.HybridData;

public final class HintMatcher {
    public static final CAY Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    /* access modifiers changed from: private */
    public final native boolean hintMatchesNative(byte[] bArr, byte[] bArr2);

    private final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CAY] */
    static {
        AnonymousClass1A8.A06("airshield_light_mbed_jni");
    }
}
