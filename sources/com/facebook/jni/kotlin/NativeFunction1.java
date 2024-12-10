package com.facebook.jni.kotlin;

import X.C18070vi;
import X.C22821Di;
import com.facebook.jni.HybridData;

public final class NativeFunction1 extends NativeFunctionBase implements C22821Di {
    public final HybridData mHybridData;

    public NativeFunction1(HybridData hybridData) {
        C18070vi.A0d(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public native Object invoke(Object obj);
}
