package X;

import java.lang.reflect.Method;

/* renamed from: X.0GW  reason: invalid class name */
public abstract class AnonymousClass0GW {
    public static Class A00;
    public static Method A01;

    static {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            A00 = cls;
            Method method = cls.getMethod("currentActivityThread", new Class[0]);
            A01 = method;
            method.setAccessible(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
