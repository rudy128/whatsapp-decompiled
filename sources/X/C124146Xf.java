package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.6Xf  reason: invalid class name and case insensitive filesystem */
public abstract class C124146Xf {
    public static final void A00(View view, int i) {
        C18070vi.A0d(view, 1);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }
}
