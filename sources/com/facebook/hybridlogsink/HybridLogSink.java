package com.facebook.hybridlogsink;

import X.AnonymousClass1A8;
import X.C25312CdH;
import com.facebook.jni.HybridData;

public final class HybridLogSink {
    public static final C25312CdH Companion = new Object();
    public final HybridData mHybridData = initHybrid(1000);

    public static final native HybridData initHybrid(int i);

    public final native String[] getLogMessages();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CdH] */
    static {
        AnonymousClass1A8.A06("hybridlogsinkjni");
    }
}
