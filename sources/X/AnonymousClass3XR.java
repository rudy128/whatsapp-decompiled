package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3XR  reason: invalid class name */
public final class AnonymousClass3XR extends C40611uz {
    public final int A00;

    public void A05(Rect rect, View view, C38021qZ r5, RecyclerView recyclerView) {
        C18070vi.A0d(rect, 0);
        C18070vi.A0j(view, recyclerView);
        int A002 = RecyclerView.A00(view);
        rect.left = 0;
        rect.right = 0;
        rect.bottom = 0;
        if (A002 == 0) {
            rect.top = 0;
        } else {
            rect.top = this.A00;
        }
    }

    public AnonymousClass3XR(int i) {
        this.A00 = i;
    }
}
