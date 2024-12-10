package X;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: X.0DA  reason: invalid class name */
public abstract class AnonymousClass0DA {
    public static void A00(Resources.Theme theme, ThemedSpinnerAdapter themedSpinnerAdapter) {
        if (!AnonymousClass026.A00(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}
