package X;

import android.graphics.Typeface;
import android.util.Log;
import java.lang.reflect.Field;

/* renamed from: X.2WY  reason: invalid class name */
public abstract class AnonymousClass2WY {
    public static final C001100p A00 = new C001100p(3);
    public static final Object A01 = C17880vN.A0p();
    public static final Field A02;

    static {
        Field field;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
        } catch (Exception e) {
            Log.e("WeightTypeface", C17890vO.A0U(e), e);
            field = null;
        }
        A02 = field;
    }
}
