package X;

import android.content.Context;
import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.8EE  reason: invalid class name */
public class AnonymousClass8EE extends AnonymousClass8EF {
    public Method A08(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Typeface A07(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.A05, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A06.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }

    public Typeface A04(Context context, Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }
}
