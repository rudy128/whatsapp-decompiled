package com.facebook.jni.kotlin;

import X.AnonymousClass20G;
import X.C18070vi;
import com.facebook.jni.HybridData;

public final class NativeFunction4 extends NativeFunctionBase implements AnonymousClass20G {
    public final HybridData mHybridData;

    public NativeFunction4(HybridData hybridData) {
        C18070vi.A0d(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public native Object invoke(Object obj, Object obj2, Object obj3, Object obj4);
}
