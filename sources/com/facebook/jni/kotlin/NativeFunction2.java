package com.facebook.jni.kotlin;

import X.AnonymousClass1OS;
import X.C18070vi;
import com.facebook.jni.HybridData;

public final class NativeFunction2 extends NativeFunctionBase implements AnonymousClass1OS {
    public final HybridData mHybridData;

    public NativeFunction2(HybridData hybridData) {
        C18070vi.A0d(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public native Object invoke(Object obj, Object obj2);
}
