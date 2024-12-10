package com.facebook.jni.kotlin;

import X.C18070vi;
import X.C36001nB;
import com.facebook.jni.HybridData;

public final class NativeFunction3 extends NativeFunctionBase implements C36001nB {
    public final HybridData mHybridData;

    public NativeFunction3(HybridData hybridData) {
        C18070vi.A0d(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public native Object invoke(Object obj, Object obj2, Object obj3);
}
