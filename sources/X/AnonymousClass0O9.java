package X;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0O9  reason: invalid class name */
public abstract class AnonymousClass0O9 {
    public static Method A00;
    public static Method A01;
    public static Method A02;
    public static boolean A03 = true;

    static {
        Class<AbsListView> cls = AbsListView.class;
        try {
            Class cls2 = Float.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("positionSelector", new Class[]{Integer.TYPE, View.class, Boolean.TYPE, cls2, cls2});
            A00 = declaredMethod;
            declaredMethod.setAccessible(true);
            Class<AdapterView> cls3 = AdapterView.class;
            Class cls4 = Integer.TYPE;
            Method declaredMethod2 = cls3.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls4});
            A02 = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = cls3.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls4});
            A01 = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void A00(View view, C009205e r8, int i) {
        try {
            Method method = A00;
            Integer valueOf = Integer.valueOf(i);
            method.invoke(r8, new Object[]{valueOf, view, false, -1, -1});
            A02.invoke(r8, new Object[]{valueOf});
            A01.invoke(r8, new Object[]{valueOf});
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static boolean A01() {
        return A03;
    }
}
