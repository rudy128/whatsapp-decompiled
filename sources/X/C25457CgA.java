package X;

import android.os.Trace;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.CgA  reason: case insensitive filesystem */
public abstract class C25457CgA {
    public static final long A00;
    public static final Method A01;
    public static final Method A02;
    public static volatile boolean A03 = true;

    static {
        Class<Trace> cls = Trace.class;
        try {
            Method A0x = BE6.A0x(cls, Long.TYPE, "isTagEnabled", new Class[1], 0);
            Method A0x2 = BE6.A0x(cls, Boolean.TYPE, "setAppTracingAllowed", new Class[1], 0);
            Field field = cls.getField("TRACE_TAG_APP");
            if (field.getType() == Long.TYPE) {
                long j = field.getLong((Object) null);
                A01 = A0x;
                A02 = A0x2;
                A00 = j;
            }
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
        }
    }

    public static Object A00(Method method, Object... objArr) {
        try {
            return method.invoke((Object) null, objArr);
        } catch (IllegalAccessException unused) {
            A03 = false;
            return null;
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (!(targetException instanceof RuntimeException) && !(targetException instanceof Error)) {
                return null;
            }
            throw targetException;
        }
    }
}
