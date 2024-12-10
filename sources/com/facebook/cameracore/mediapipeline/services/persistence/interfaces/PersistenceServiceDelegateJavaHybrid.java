package com.facebook.cameracore.mediapipeline.services.persistence.interfaces;

import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

public abstract class PersistenceServiceDelegateJavaHybrid extends PersistenceServiceDelegateHybrid {
    private native HybridData initHybrid();

    public abstract void get(String str, NativeDataPromise nativeDataPromise);

    public abstract void getV2(String str, String str2, String str3, int i, int i2, NativeDataPromise nativeDataPromise);

    public abstract void remove(String str, NativeDataPromise nativeDataPromise);

    public abstract void removeV2(String str, String str2, String str3, int i, int i2);

    public abstract void set(String str, String str2, NativeDataPromise nativeDataPromise);

    public abstract void setV2(String str, String str2, String str3, String str4, int i, int i2);
}
