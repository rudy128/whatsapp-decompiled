package com.facebook.profilo.provider.stacktrace;

import X.AnonymousClass1A8;

public class StackTraceWhitelist {
    public static native void nativeAddToWhitelist(int i);

    public static native void nativeRemoveFromWhitelist(int i);

    static {
        AnonymousClass1A8.A06("profilo_stacktrace");
    }
}
