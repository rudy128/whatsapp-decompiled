package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* renamed from: X.05n  reason: invalid class name and case insensitive filesystem */
public final class C009605n extends C02110Ct {
    public final Field A00;
    public final Field A01;
    public final Field A02;

    public View A00(InputMethodManager inputMethodManager) {
        C18070vi.A0d(inputMethodManager, 0);
        try {
            return (View) this.A02.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }

    public Object A01(InputMethodManager inputMethodManager) {
        C18070vi.A0d(inputMethodManager, 0);
        try {
            return this.A00.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public boolean A02(InputMethodManager inputMethodManager) {
        C18070vi.A0d(inputMethodManager, 0);
        try {
            this.A01.set(inputMethodManager, (Object) null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    public C009605n(Field field, Field field2, Field field3) {
        this.A00 = field;
        this.A02 = field2;
        this.A01 = field3;
    }
}
