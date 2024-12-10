package com.facebook.msys.util;

import X.C17960vV;

public class Environment {
    public static boolean setenv(String str, String str2) {
        return setenv(str, str2, true);
    }

    public static native synchronized boolean setenvNative(String str, String str2, boolean z);

    public static boolean setenv(String str, String str2, boolean z) {
        C17960vV.A07(str);
        C17960vV.A07(str2);
        return setenvNative(str, str2, z);
    }
}
