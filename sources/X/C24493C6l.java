package X;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.C6l  reason: case insensitive filesystem */
public abstract class C24493C6l {
    public static Method A00;
    public static boolean A01;
    public static Field A02;
    public static boolean A03;

    public abstract float A00(View view);

    public abstract void A01(Matrix matrix, View view);

    public abstract void A02(Matrix matrix, View view);

    public abstract void A03(Matrix matrix, View view);

    public abstract void A04(View view, float f);

    public void A05(View view, int i) {
        if (!A03) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                A02 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            A03 = true;
        }
        Field field = A02;
        if (field != null) {
            try {
                A02.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void A06(View view, int i, int i2, int i3, int i4) {
        if (!A01) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                A00 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            A01 = true;
        }
        Method method = A00;
        if (method != null) {
            try {
                Object[] objArr = new Object[4];
                AnonymousClass000.A1L(objArr, i);
                AnonymousClass000.A1M(objArr, i2);
                AnonymousClass3Ma.A1S(objArr, i3);
                C17890vO.A1G(objArr, i4);
                method.invoke(view, objArr);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw AnonymousClass8BR.A0x(e2.getCause());
            }
        }
    }
}
