package X;

import android.view.View;
import androidx.core.widget.NestedScrollView;

/* renamed from: X.9Ru  reason: invalid class name and case insensitive filesystem */
public abstract class C181779Ru {
    public static final void A00(NestedScrollView nestedScrollView) {
        C18070vi.A0d(nestedScrollView, 0);
        int childCount = nestedScrollView.getChildCount();
        if (childCount != 0) {
            View childAt = nestedScrollView.getChildAt(childCount - 1);
            nestedScrollView.A0F(AnonymousClass3MW.A02(childAt, childAt.getScrollY()) + nestedScrollView.getPaddingBottom());
        }
    }
}
