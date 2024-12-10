package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5lZ  reason: invalid class name and case insensitive filesystem */
public final class C112495lZ extends C40611uz {
    public void A05(Rect rect, View view, C38021qZ r7, RecyclerView recyclerView) {
        C18070vi.A0d(rect, 0);
        C18070vi.A0o(view, recyclerView, r7);
        super.A05(rect, view, r7, recyclerView);
        int A00 = RecyclerView.A00(view);
        C38391rD r0 = recyclerView.A0B;
        if (r0 != null) {
            int itemViewType = r0.getItemViewType(A00);
            if (A00 == 0 && itemViewType == 0) {
                view.setPaddingRelative(view.getPaddingStart(), AnonymousClass3MW.A01(view.getResources(), 2131168591), view.getPaddingEnd(), view.getPaddingBottom());
            }
        }
    }
}
