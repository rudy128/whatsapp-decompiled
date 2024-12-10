package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8I3  reason: invalid class name */
public final class AnonymousClass8I3 extends C40611uz {
    public void A05(Rect rect, View view, C38021qZ r7, RecyclerView recyclerView) {
        C18070vi.A0d(rect, 0);
        C18070vi.A0o(view, recyclerView, r7);
        super.A05(rect, view, r7, recyclerView);
        int A00 = RecyclerView.A00(view);
        C38391rD r0 = recyclerView.A0B;
        if (r0 == null) {
            return;
        }
        if (A00 == 0 || A00 == r0.A0Q() - 1) {
            view.setPaddingRelative(view.getPaddingStart(), AnonymousClass3MW.A01(view.getResources(), 2131168354), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }
}
