package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5lc  reason: invalid class name and case insensitive filesystem */
public final class C112525lc extends C40611uz {
    public final C18000vb A00;

    public C112525lc(C18000vb r1) {
        this.A00 = r1;
    }

    public void A05(Rect rect, View view, C38021qZ r6, RecyclerView recyclerView) {
        boolean A15 = C18070vi.A15(rect, view);
        int dimensionPixelSize = AnonymousClass000.A0Y(view).getDimensionPixelSize(2131166898);
        if (AnonymousClass3MY.A1b(this.A00)) {
            rect.set(A15, A15, dimensionPixelSize, A15);
        } else {
            rect.set(dimensionPixelSize, A15 ? 1 : 0, A15, A15);
        }
    }
}
