package com.facebook.msys.mci;

import X.AnonymousClass3ME;
import X.C72003Ke;
import com.facebook.simplejni.NativeHolder;

@Deprecated
public class NotificationCenter extends NotificationCenterInternal {
    public NotificationCenter() {
        super(false);
    }

    public synchronized void addObserver(AnonymousClass3ME r2, String str, int i, C72003Ke r5) {
        super.addObserver(r2, str, i, r5);
    }

    public native void addObserverNative(String str, int i);

    public native NativeHolder initNativeHolder();

    public synchronized void postStrictNotification(String str, int i, C72003Ke r4) {
        super.postStrictNotification(str, i, r4);
    }

    public native void postStrictNotificationNative(String str, int i);

    public synchronized void removeEveryObserver(AnonymousClass3ME r2) {
        super.removeEveryObserver(r2);
    }

    public synchronized void removeObserver(AnonymousClass3ME r2, String str, C72003Ke r4) {
        super.removeObserver(r2, str, r4);
    }

    public native void removeObserverNative(String str);
}
