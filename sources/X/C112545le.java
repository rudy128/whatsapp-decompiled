package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5le  reason: invalid class name and case insensitive filesystem */
public final class C112545le extends C40611uz {
    public final /* synthetic */ AnonymousClass6AQ A00;

    public void A05(Rect rect, View view, C38021qZ r6, RecyclerView recyclerView) {
        C18070vi.A0d(rect, 0);
        C18070vi.A0e(view, 1, recyclerView);
        C38391rD r0 = recyclerView.A0B;
        if (r0 != null && r0.A0Q() > 1 && recyclerView.getLayoutManager() != null && C38251qy.A02(view) != 0) {
            rect.set(0, AnonymousClass000.A0Y(view).getDimensionPixelSize(2131165321), 0, 0);
        }
    }

    public C112545le(AnonymousClass6AQ r1) {
        this.A00 = r1;
    }
}
