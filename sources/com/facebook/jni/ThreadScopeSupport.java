package com.facebook.jni;

import X.AnonymousClass1AK;

public class ThreadScopeSupport {
    public static native void runStdFunctionImpl(long j);

    static {
        AnonymousClass1AK.A01("fbjni");
    }

    public static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
