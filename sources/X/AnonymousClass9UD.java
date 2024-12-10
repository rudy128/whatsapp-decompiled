package X;

import android.graphics.Typeface;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.9UD  reason: invalid class name */
public abstract class AnonymousClass9UD {
    public static final C001100p A00 = new C001100p(3);
    public static final Object A01 = C17880vN.A0p();
    public static final Constructor A02;
    public static final Field A03;
    public static final Method A04;

    static {
        Field field;
        Method method;
        Constructor<Typeface> constructor;
        Class<Typeface> cls = Typeface.class;
        try {
            field = cls.getDeclaredField("native_instance");
            method = cls.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", new Class[]{Long.TYPE, Integer.TYPE, Boolean.TYPE});
            method.setAccessible(true);
            constructor = cls.getDeclaredConstructor(new Class[]{Long.TYPE});
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            Log.e("WeightTypeface", C17890vO.A0U(e), e);
            field = null;
            method = null;
            constructor = null;
        }
        A03 = field;
        A04 = method;
        A02 = constructor;
    }
}
