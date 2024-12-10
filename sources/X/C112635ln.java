package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5ln  reason: invalid class name and case insensitive filesystem */
public final class C112635ln extends C40611uz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public void A05(Rect rect, View view, C38021qZ r6, RecyclerView recyclerView) {
        int i;
        int i2 = 0;
        C18070vi.A0d(rect, 0);
        C18070vi.A0j(view, recyclerView);
        int A002 = RecyclerView.A00(view);
        rect.top = 0;
        rect.bottom = 0;
        boolean z = this.A03;
        if (A002 == 0) {
            i2 = this.A02;
        }
        if (z) {
            rect.right = i2;
        } else {
            rect.left = i2;
        }
        C38391rD r0 = recyclerView.A0B;
        if (r0 != null) {
            if (A002 == r0.A0Q() - 1) {
                i = this.A01;
            } else {
                i = this.A00;
            }
            if (z) {
                rect.left = i;
            } else {
                rect.right = i;
            }
        }
    }

    public C112635ln(int i, int i2, int i3, boolean z) {
        this.A02 = i;
        this.A00 = i2;
        this.A03 = z;
        this.A01 = i + i3;
    }
}
