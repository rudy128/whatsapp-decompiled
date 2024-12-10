package X;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.1HL  reason: invalid class name */
public abstract class AnonymousClass1HL {
    public static Field A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    public static void A00(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C60252ne.A00(popupWindow, i);
            return;
        }
        if (!A03) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                A01 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            A03 = true;
        }
        Method method = A01;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }

    public static void A01(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            C60252ne.A01(popupWindow, z);
            return;
        }
        if (!A02) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                A00 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
            A02 = true;
        }
        Field field = A00;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException e2) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
            }
        }
    }
}
