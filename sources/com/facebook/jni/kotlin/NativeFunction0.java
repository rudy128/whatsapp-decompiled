package com.facebook.jni.kotlin;

import X.C18070vi;
import X.C18090vk;
import com.facebook.jni.HybridData;

public final class NativeFunction0 extends NativeFunctionBase implements C18090vk {
    public final HybridData mHybridData;

    public NativeFunction0(HybridData hybridData) {
        C18070vi.A0d(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public native Object invoke();
}
