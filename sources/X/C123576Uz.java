package X;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

/* renamed from: X.6Uz  reason: invalid class name and case insensitive filesystem */
public abstract class C123576Uz {
    public static View A00(Dialog dialog, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C123566Uy.A00(dialog, i);
        }
        View findViewById = dialog.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw AnonymousClass000.A0k("ID does not reference a View inside this Dialog");
    }
}
