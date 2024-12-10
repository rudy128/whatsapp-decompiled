package X;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* renamed from: X.0ff  reason: invalid class name and case insensitive filesystem */
public final class C08790ff extends AnonymousClass11G implements C18090vk {
    public static final C08790ff A00 = new C08790ff();

    public C08790ff() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Class<InputMethodManager> cls = InputMethodManager.class;
        try {
            Field declaredField = cls.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            return new C009605n(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return C009705o.A00;
        }
    }
}
