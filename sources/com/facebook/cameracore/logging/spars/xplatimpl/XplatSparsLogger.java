package com.facebook.cameracore.logging.spars.xplatimpl;

import X.AnonymousClass1A8;
import X.C18070vi;
import X.C24729CHr;
import X.C28421E0m;
import X.C8R;
import com.facebook.jni.HybridData;
import java.util.List;

public final class XplatSparsLogger {
    public static final C8R Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static final native boolean consistencyHelperHasError();

    public static final native int consistencyHelperNumProcessedSessions();

    public static final native void debugExpectSessionOpen(String str);

    public static final native void flushAndDestroyConsistencyHelper();

    public static final native void flushConsistencyHelper();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public static final XplatSparsLogger makeInstance(C28421E0m e0m) {
        C18070vi.A0d(e0m, 0);
        return new XplatSparsLogger(new XplatRawEventLogger(e0m));
    }

    public void logSessionClosure(String str, boolean z) {
        C18070vi.A0d(str, 0);
        logSessionClosureNative(str, z);
    }

    public final native void logSessionClosureNative(String str, boolean z);

    public void logSessionCreation(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        C18070vi.A0n(str, str2, str3);
        C18070vi.A0d(str5, 4);
        String str7 = str6;
        C18070vi.A0d(str7, 6);
        List list = C24729CHr.A00;
        logSessionCreationNative("unknown", str, str2, str3, str4, str5, z, str7);
    }

    public final native void logSessionCreationNative(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7);

    public final native void setRawEventLogger(XplatRawEventLogger xplatRawEventLogger);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C8R, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("camera-xplat-spars-jni");
    }

    public XplatSparsLogger(XplatRawEventLogger xplatRawEventLogger) {
        setRawEventLogger(xplatRawEventLogger);
    }

    public XplatSparsLogger() {
    }

    public static final XplatSparsLogger makeInstance(XplatRawEventLogger xplatRawEventLogger) {
        XplatSparsLogger xplatSparsLogger;
        if (xplatRawEventLogger != null) {
            return xplatSparsLogger;
        }
        xplatSparsLogger = new XplatSparsLogger();
        return xplatSparsLogger;
    }

    public static final XplatSparsLogger makeInstance() {
        return new XplatSparsLogger();
    }
}
