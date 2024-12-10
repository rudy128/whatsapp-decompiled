package X;

import java.lang.reflect.Field;

public class COT {
    public final Field A00;
    public final Field A01;

    public COT(Object obj) {
        Class<?> cls = obj.getClass();
        Field declaredField = cls.getDeclaredField("paused");
        this.A01 = declaredField;
        declaredField.setAccessible(true);
        Field declaredField2 = cls.getDeclaredField("activity");
        this.A00 = declaredField2;
        declaredField2.setAccessible(true);
    }
}
