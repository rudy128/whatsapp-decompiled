package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5ld  reason: invalid class name and case insensitive filesystem */
public final class C112535ld extends C40611uz {
    public final /* synthetic */ AnonymousClass6AS A00;

    public void A05(Rect rect, View view, C38021qZ r9, RecyclerView recyclerView) {
        int A0Q;
        C18070vi.A0d(rect, 0);
        C18070vi.A0e(view, 1, recyclerView);
        C38391rD r0 = recyclerView.A0B;
        if (r0 != null && (A0Q = r0.A0Q()) > 1 && recyclerView.getLayoutManager() != null) {
            int A02 = C38251qy.A02(view);
            boolean A1b = AnonymousClass3MY.A1b(this.A00.A05);
            if (A1b) {
                if (A02 == A0Q - 1) {
                    return;
                }
            } else if (A02 == 0) {
                return;
            }
            int dimensionPixelSize = AnonymousClass000.A0Y(view).getDimensionPixelSize(2131165317);
            if (A1b) {
                rect.set(0, 0, dimensionPixelSize, 0);
            } else {
                rect.set(dimensionPixelSize, 0, 0, 0);
            }
        }
    }

    public C112535ld(AnonymousClass6AS r1) {
        this.A00 = r1;
    }
}
