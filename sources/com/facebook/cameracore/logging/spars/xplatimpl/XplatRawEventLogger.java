package com.facebook.cameracore.logging.spars.xplatimpl;

import X.AnonymousClass1A8;
import X.C18070vi;
import X.C28421E0m;
import X.C8Q;
import com.facebook.jni.HybridData;

public final class XplatRawEventLogger {
    public static final C8Q Companion = new Object();
    public final C28421E0m logWriter;
    public final HybridData mHybridData = initHybrid();

    public XplatRawEventLogger(C28421E0m e0m) {
        C18070vi.A0d(e0m, 1);
        this.logWriter = e0m;
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C8Q, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("camera-xplat-spars-jni");
    }

    public final void logEvent(String str, String str2) {
        C18070vi.A0h(str, str2);
    }
}
