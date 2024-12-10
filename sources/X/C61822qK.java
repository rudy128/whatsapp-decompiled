package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2qK  reason: invalid class name and case insensitive filesystem */
public final class C61822qK {
    public static final C61822qK A00 = new Object();

    public final void A00(Configuration configuration, View view, boolean z) {
        int i;
        int i2;
        if (view != null) {
            View findViewById = view.findViewById(2131430377);
            int i3 = configuration.orientation;
            Resources resources = view.getResources();
            int i4 = 2131166640;
            if (i3 == 2) {
                i4 = 2131166639;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i4);
            if (findViewById != null) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (findViewById.getVisibility() == 0) {
                    i2 = dimensionPixelSize;
                } else {
                    i2 = findViewById.getLayoutParams().height;
                }
                layoutParams.height = i2;
                ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                if (findViewById.getVisibility() != 0) {
                    dimensionPixelSize = findViewById.getLayoutParams().width;
                }
                layoutParams2.width = dimensionPixelSize;
            }
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            C18070vi.A0z(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            if (!z) {
                i = view.getResources().getDimensionPixelSize(2131168994);
            } else {
                i = 0;
            }
            marginLayoutParams.topMargin = i;
        }
    }
}
