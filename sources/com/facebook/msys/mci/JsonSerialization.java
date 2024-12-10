package com.facebook.msys.mci;

import X.AnonymousClass1CH;
import android.os.Trace;
import java.lang.reflect.Method;

public class JsonSerialization {
    public static boolean sInitialized;

    public static native void nativeInitialize();

    public static synchronized boolean initialize() {
        synchronized (JsonSerialization.class) {
            Method method = AnonymousClass1CH.A03;
            Trace.beginSection("JsonSerialization.initialize");
            try {
                if (sInitialized) {
                    return false;
                }
                nativeInitialize();
                sInitialized = true;
                Trace.endSection();
                return true;
            } finally {
                Trace.endSection();
            }
        }
    }

    public static boolean isMCPEnabledForJsonSerialization() {
        return false;
    }
}
