package X;

import java.lang.reflect.Field;

/* renamed from: X.Ckj  reason: case insensitive filesystem */
public final class C25713Ckj {
    public final Field field;

    public void set(Object obj, int i) {
        try {
            this.field.set(obj, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public C25713Ckj(Field field2) {
        this.field = field2;
        field2.setAccessible(true);
    }

    public void set(Object obj, Object obj2) {
        try {
            this.field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }
}
