package X;

import android.view.View;
import android.widget.ScrollView;

/* renamed from: X.4W3  reason: invalid class name */
public abstract class AnonymousClass4W3 {
    public static final boolean A01(ScrollView scrollView) {
        C18070vi.A0d(scrollView, 0);
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return false;
        }
        if (scrollView.getHeight() < childAt.getHeight() + scrollView.getPaddingTop() + scrollView.getPaddingBottom()) {
            return true;
        }
        return false;
    }

    public static final void A00(View view, ScrollView scrollView) {
        C18070vi.A0h(scrollView, view);
        C90574eI.A00(scrollView.getViewTreeObserver(), scrollView, view, 8);
    }
}
