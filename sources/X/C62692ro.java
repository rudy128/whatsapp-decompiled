package X;

import android.view.View;
import android.view.WindowInsetsController;

/* renamed from: X.2ro  reason: invalid class name and case insensitive filesystem */
public abstract class C62692ro {
    public static C25932Cow A00(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return C25932Cow.A00(windowInsetsController);
        }
        return null;
    }

    public static CharSequence A01(View view) {
        return view.getStateDescription();
    }

    public static void A02(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
