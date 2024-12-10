package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3XT  reason: invalid class name */
public final class AnonymousClass3XT extends C40611uz {
    public final int A00;
    public final C18000vb A01;

    public void A05(Rect rect, View view, C38021qZ r5, RecyclerView recyclerView) {
        C18070vi.A0d(rect, 0);
        C18070vi.A0j(view, recyclerView);
        int A002 = RecyclerView.A00(view);
        rect.top = 0;
        rect.bottom = 0;
        if (A002 == 0) {
            rect.left = 0;
        } else if (AnonymousClass3MY.A1b(this.A01)) {
            rect.left = this.A00;
        } else {
            rect.left = 0;
            rect.right = this.A00;
            return;
        }
        rect.right = 0;
    }

    public AnonymousClass3XT(C18000vb r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }
}
