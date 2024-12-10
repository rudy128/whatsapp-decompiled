package X;

import java.lang.reflect.Method;

/* renamed from: X.0GX  reason: invalid class name */
public abstract class AnonymousClass0GX {
    public static Class A00;
    public static Method A01;

    static {
        try {
            Class<?> cls = Class.forName("android.app.ResourcesManager");
            A00 = cls;
            Method declaredMethod = cls.getDeclaredMethod("getInstance", new Class[0]);
            A01 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
