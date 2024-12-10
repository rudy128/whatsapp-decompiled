package com.facebook.xplat.fbglog;

import X.AnonymousClass1AK;
import X.AnonymousClass2SW;
import X.C26294Cx6;
import java.util.List;

public class FbGlog {
    public static AnonymousClass2SW sCallback;

    public static native void setLogLevel(int i);

    public static native void setSkipSubscribe(boolean z);

    static {
        AnonymousClass1AK.A01("fb");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.2SW] */
    public static synchronized void ensureSubscribedToBLogLevelChanges() {
        synchronized (FbGlog.class) {
            if (sCallback == null) {
                ? obj = new Object();
                sCallback = obj;
                List list = C26294Cx6.A00;
                synchronized (C26294Cx6.class) {
                    list.add(obj);
                }
                setLogLevel(C26294Cx6.A01.BUz());
            }
        }
    }
}
