package X;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: X.1bz  reason: invalid class name and case insensitive filesystem */
public final class C29301bz {
    public final PointerIcon A00;

    public static C29301bz A00(Context context) {
        PointerIcon pointerIcon;
        if (Build.VERSION.SDK_INT >= 24) {
            pointerIcon = C29311c0.A00(context);
        } else {
            pointerIcon = null;
        }
        return new C29301bz(pointerIcon);
    }

    public C29301bz(PointerIcon pointerIcon) {
        this.A00 = pointerIcon;
    }

    public Object A01() {
        return this.A00;
    }
}
