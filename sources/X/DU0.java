package X;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

public final class DU0 implements PrivilegedExceptionAction {
    public final /* synthetic */ Object run() {
        Class<Unsafe> cls = Unsafe.class;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        for (int i = 0; i < length; i++) {
            Object A0m = BE9.A0m(declaredFields, i);
            if (cls.isInstance(A0m)) {
                return cls.cast(A0m);
            }
        }
        return null;
    }
}
