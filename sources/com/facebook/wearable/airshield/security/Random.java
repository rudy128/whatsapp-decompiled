package com.facebook.wearable.airshield.security;

import X.AnonymousClass1A8;
import X.AnonymousClass1DF;
import X.AnonymousClass1Y1;
import X.C18100vl;
import X.C24581CAc;
import X.C27885DnM;
import com.facebook.jni.HybridData;

public final class Random {
    public static final C24581CAc Companion = new Object();
    public static final C18100vl instance = AnonymousClass1DF.A01(C27885DnM.A00);
    public final HybridData mHybridData;

    public /* synthetic */ Random(AnonymousClass1Y1 r1) {
        this();
    }

    /* access modifiers changed from: private */
    public final native void bytesNative(byte[] bArr);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CAc, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("airshield_light_mbed_jni");
    }

    public Random() {
        this.mHybridData = initHybrid();
    }
}
