package com.facebook.tigon.iface;

import X.AnonymousClass1Y1;
import com.facebook.jni.HybridData;

public class HttpPriorityContext {
    public HybridData mHybridData;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HttpPriorityContext(HybridData hybridData, int i, AnonymousClass1Y1 r4) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public final HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final void setMHybridData(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public HttpPriorityContext(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public HttpPriorityContext() {
        this((HybridData) null);
    }
}
