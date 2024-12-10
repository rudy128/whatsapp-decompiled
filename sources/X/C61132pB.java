package X;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.2pB  reason: invalid class name and case insensitive filesystem */
public abstract class C61132pB {
    public static boolean A00 = true;
    public static Method A01;
    public static boolean A02;

    public static int A00(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!A02) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("getChildDrawingOrder", new Class[]{cls2, cls2});
                A01 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            A02 = true;
        }
        Method method = A01;
        if (method != null) {
            try {
                Object[] objArr = new Object[2];
                C17880vN.A1T(objArr, viewGroup.getChildCount(), 0);
                C17880vN.A1T(objArr, i, 1);
                return AnonymousClass000.A0M(method.invoke(viewGroup, objArr));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    public static void A01(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (A00) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }
}
