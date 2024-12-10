package X;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: X.0Fn  reason: invalid class name and case insensitive filesystem */
public abstract class C02820Fn {
    public static final Field A00;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        A00 = field;
    }
}
