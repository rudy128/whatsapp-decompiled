package com.facebook.profilo.provider.atrace;

import X.C22911BUw;
import X.C24702CGo;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Atrace {
    public static boolean sHasHook;
    public static boolean sHookFailed;

    public static native void enableSystraceNative(boolean z);

    public static native boolean installSystraceHook(MultiBufferLogger multiBufferLogger, int i, boolean z);

    public static native boolean isEnabled();

    public static native void restoreSystraceNative(boolean z);

    public static synchronized boolean hasHacks(MultiBufferLogger multiBufferLogger, boolean z) {
        boolean z2;
        synchronized (Atrace.class) {
            z2 = sHasHook;
            if (!z2 && !sHookFailed) {
                z2 = installSystraceHook(multiBufferLogger, C22911BUw.A00, z);
                sHasHook = z2;
                sHookFailed = !z2;
            }
        }
        return z2;
    }

    public static void enableSystrace(MultiBufferLogger multiBufferLogger, boolean z) {
        Method method;
        if (hasHacks(multiBufferLogger, z)) {
            enableSystraceNative(z);
            Field field = C24702CGo.A00;
            if (field != null && (method = C24702CGo.A01) != null) {
                try {
                    field.set((Object) null, method.invoke((Object) null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }

    public static void restoreSystrace(MultiBufferLogger multiBufferLogger, boolean z) {
        Method method;
        if (hasHacks(multiBufferLogger, z)) {
            restoreSystraceNative(z);
            Field field = C24702CGo.A00;
            if (field != null && (method = C24702CGo.A01) != null) {
                try {
                    field.set((Object) null, method.invoke((Object) null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }
}
