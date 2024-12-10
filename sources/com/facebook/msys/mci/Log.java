package com.facebook.msys.mci;

import X.AnonymousClass1CH;
import X.C49582Ra;
import android.os.Trace;
import java.lang.reflect.Method;

public class Log {
    public static boolean sRegistered;

    public static int getWaLogLevel(int i) {
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 7 ? 1 : 0;
        }
        return 2;
    }

    public static native void registerLoggerNative(long j, int i, boolean z, int i2);

    public static native void setLogLevel(int i);

    public static synchronized boolean registerLogger(C49582Ra r2) {
        synchronized (Log.class) {
            Method method = AnonymousClass1CH.A03;
            Trace.beginSection("registerLogger");
            try {
                if (!sRegistered) {
                    throw new NullPointerException("loggingCategories");
                }
            } finally {
                Trace.endSection();
            }
        }
        return false;
    }

    public static void log(int i, String str) {
        int waLogLevel = getWaLogLevel(i);
        StringBuilder sb = new StringBuilder();
        sb.append("wamsys/");
        sb.append(str);
        com.whatsapp.util.Log.log(waLogLevel, sb.toString());
    }
}
