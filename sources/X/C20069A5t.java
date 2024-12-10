package X;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.A5t  reason: case insensitive filesystem */
public class C20069A5t {
    public static final Set A00 = Collections.synchronizedSet(C17880vN.A12());

    public static void A01(C18030ve r5) {
        if (C18020vd.A05(C18040vf.A02, r5, 3663)) {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (!(stackTraceElement == null || stackTraceElement.getClass() == null)) {
                    A00.add(stackTraceElement.getClassName());
                }
            }
        }
    }

    public static Object A00(Object obj, String str) {
        Class cls = obj.getClass();
        Class cls2 = cls;
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Unable to find field ");
        A10.append(str);
        throw new NoSuchFieldException(AnonymousClass001.A1E(cls2, " in ", A10));
    }
}
