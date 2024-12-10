package com.facebook.jni;

import X.AnonymousClass1AK;

public class Countable {
    public long mInstance = 0;

    public native void dispose();

    static {
        AnonymousClass1AK.A01("fb");
    }

    public void finalize() {
        dispose();
    }
}
