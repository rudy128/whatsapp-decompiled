package X;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.CHc  reason: case insensitive filesystem */
public abstract class C24715CHc {
    public static Method A00;
    public static Method A01;
    public static boolean A02;

    public static void A00(Canvas canvas, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i != 28) {
            if (!A02) {
                Class<Canvas> cls = Canvas.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    A01 = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = cls.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    A00 = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                A02 = true;
            }
            if (z) {
                try {
                    Method method = A01;
                    if (method != null) {
                        method.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                } catch (InvocationTargetException e) {
                    throw AnonymousClass8BR.A0x(e.getCause());
                }
            } else {
                Method method2 = A00;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            }
        } else {
            throw AnonymousClass000.A0n("This method doesn't work on Pie!");
        }
    }
}
