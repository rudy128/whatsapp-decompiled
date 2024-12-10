package X;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: X.27d  reason: invalid class name */
public class AnonymousClass27d extends C28181Ze {
    public static Constructor A02;
    public static Field A03;
    public static boolean A04;
    public static boolean A05;
    public WindowInsets A00;
    public C33321id A01;

    public AnonymousClass27d() {
        WindowInsets windowInsets;
        if (!A05) {
            try {
                A03 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            A05 = true;
        }
        Field field = A03;
        if (field != null) {
            try {
                WindowInsets windowInsets2 = (WindowInsets) field.get((Object) null);
                if (windowInsets2 != null) {
                    windowInsets = new WindowInsets(windowInsets2);
                    this.A00 = windowInsets;
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!A04) {
            try {
                A02 = WindowInsets.class.getConstructor(new Class[]{Rect.class});
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            A04 = true;
        }
        Constructor constructor = A02;
        if (constructor != null) {
            try {
                windowInsets = (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
            this.A00 = windowInsets;
        }
        windowInsets = null;
        this.A00 = windowInsets;
    }
}
