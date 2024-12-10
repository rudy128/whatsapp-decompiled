package com.facebook.msys.util;

import X.C72003Ke;
import com.facebook.simplejni.NativeHolder;

public final class NotificationScope implements C72003Ke {
    public final McfReferenceHolder mMcfReference = new McfReferenceHolder();
    public final NativeHolder mNativeHolder = initNativeHolder(this);

    public static native NativeHolder initNativeHolder(NotificationScope notificationScope);

    public long getNativeReference() {
        return this.mMcfReference.nativeReference;
    }
}
