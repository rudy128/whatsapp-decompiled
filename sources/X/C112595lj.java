package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5lj  reason: invalid class name and case insensitive filesystem */
public final class C112595lj extends C40611uz {
    public int A00 = 0;
    public int A01;
    public final int A02;

    public C112595lj(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
    }

    public void A05(Rect rect, View view, C38021qZ r6, RecyclerView recyclerView) {
        C18070vi.A0d(rect, 0);
        C18070vi.A0j(view, recyclerView);
        int A002 = RecyclerView.A00(view);
        if (A002 == 0) {
            rect.set(0, this.A01, 0, 0);
        } else if (A002 == this.A02 - 1) {
            rect.set(0, 0, 0, this.A00);
        }
    }
}
