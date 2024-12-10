package X;

import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.19i  reason: invalid class name and case insensitive filesystem */
public abstract class C222919i {
    public static final Method A00;
    public static final Method A01;
    public static final Method A02;
    public static final Method A03;
    public static final Method A04;
    public static final Method A05;
    public static volatile boolean A06;

    public static Object A01(Method method, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return method.invoke((Object) null, objArr);
        } catch (IllegalAccessException e) {
            Log.e("SystemPropertiesHiddenMembers/invoke/IllegalAccessException/", e);
            A06 = false;
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("SystemPropertiesHiddenMembers/invoke/InvocationTargetException/", e2);
            return null;
        }
    }

    static {
        boolean z;
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Class<String> cls2 = String.class;
            Method method = cls.getMethod("get", new Class[]{cls2});
            Method method2 = cls.getMethod("getBoolean", new Class[]{cls2, Boolean.TYPE});
            Method method3 = cls.getMethod("getInt", new Class[]{cls2, Integer.TYPE});
            Method method4 = cls.getMethod("getLong", new Class[]{cls2, Long.TYPE});
            Method method5 = cls.getMethod("set", new Class[]{cls2, cls2});
            A00 = cls.getMethod("addChangeCallback", new Class[]{Runnable.class});
            A03 = method;
            A02 = method2;
            A01 = method3;
            A04 = method4;
            A05 = method5;
            z = true;
        } catch (ClassNotFoundException e) {
            e = e;
            str = "SystemPropertiesHiddenMembers/newInstance/ClassNotFoundException/";
            Log.e(str, e);
            z = false;
            A06 = z;
        } catch (NoSuchMethodException e2) {
            e = e2;
            str = "SystemPropertiesHiddenMembers/newInstance/NoSuchMethodException/";
            Log.e(str, e);
            z = false;
            A06 = z;
        }
        A06 = z;
    }

    public static long A00(String str) {
        if (A06) {
            Number number = (Number) A01(A04, str, 0L);
            if (number != null) {
                return number.longValue();
            }
        }
        return 0;
    }

    public static String A02(String str) {
        if (A06) {
            String str2 = (String) A01(A03, str);
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }
}
