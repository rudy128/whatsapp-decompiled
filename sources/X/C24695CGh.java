package X;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.CGh  reason: case insensitive filesystem */
public abstract class C24695CGh {
    public static long A00;
    public static Method A01;

    public static boolean A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C7Z.A00();
        }
        try {
            Method method = A01;
            if (method == null) {
                Class<Trace> cls = Trace.class;
                A00 = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                method = BE6.A0x(cls, Long.TYPE, "isTagEnabled", new Class[1], 0);
                A01 = method;
            }
            Object[] objArr = new Object[1];
            AnonymousClass3MX.A1S(objArr, 0, A00);
            return AnonymousClass000.A1Y(method.invoke((Object) null, objArr));
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw cause;
                }
                throw AnonymousClass8BR.A0x(cause);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unable to call ");
            A10.append("isTagEnabled");
            Log.v("Trace", AnonymousClass000.A0y(" via reflection", A10), e);
            return false;
        }
    }
}
