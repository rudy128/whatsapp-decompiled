package com.facebook.native_bridge;

import X.AnonymousClass1A8;
import com.facebook.jni.HybridData;

public class NativeDataPromise implements Promise {
    public final HybridData mHybridData;

    public native void setException(String str);

    public native void setValue(Object obj);

    static {
        AnonymousClass1A8.A06("native_bridge");
    }

    public NativeDataPromise(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
