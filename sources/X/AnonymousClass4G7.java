package X;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.4G7  reason: invalid class name */
public abstract class AnonymousClass4G7 {
    public static void A00(Toolbar toolbar, int i) {
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt != null) {
                childAt.setAccessibilityTraversalBefore(i);
            }
        }
    }
}
