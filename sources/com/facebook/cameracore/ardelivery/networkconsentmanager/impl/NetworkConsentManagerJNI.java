package com.facebook.cameracore.ardelivery.networkconsentmanager.impl;

import X.AnonymousClass1A8;
import X.C18070vi;
import X.C24309Bz6;
import X.C8G;
import com.facebook.cameracore.ardelivery.networkconsentmanager.interfaces.NetworkConsentStorage;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.util.TriState;
import com.facebook.jni.HybridData;

public final class NetworkConsentManagerJNI {
    public static final C8G Companion = new Object();
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid(NetworkConsentStorage networkConsentStorage, AnalyticsLogger analyticsLogger);

    private final native void setUserConsent(String str, boolean z, int i);

    public native TriState hasUserAllowedNetworking(String str);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C8G, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("ard-android-network-consent-manager-impl");
    }

    public NetworkConsentManagerJNI(NetworkConsentStorage networkConsentStorage, AnalyticsLogger analyticsLogger) {
        C18070vi.A0j(networkConsentStorage, analyticsLogger);
        this.mHybridData = initHybrid(networkConsentStorage, analyticsLogger);
    }

    public void setUserConsent(String str, boolean z, C24309Bz6 bz6) {
        C18070vi.A0i(str, bz6);
        setUserConsent(str, z, bz6.mCppValue);
    }
}
