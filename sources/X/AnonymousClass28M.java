package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.28M  reason: invalid class name */
public class AnonymousClass28M extends C40611uz {
    public final int A00;
    public final C18000vb A01;

    public AnonymousClass28M(C18000vb r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void A05(Rect rect, View view, C38021qZ r10, RecyclerView recyclerView) {
        AnonymousClass28N r2 = (AnonymousClass28N) view.getLayoutParams();
        int i = r2.A01;
        int i2 = ((GridLayoutManager) recyclerView.getLayoutManager()).A00;
        int i3 = r2.A00;
        if (i == i2 || i2 == 0) {
            rect.set(0, 0, 0, 0);
            return;
        }
        int i4 = i2 / i;
        int i5 = i3 / i;
        rect.top = 0;
        int i6 = this.A00;
        rect.bottom = i6;
        float f = (float) i6;
        float f2 = (float) i4;
        int floor = (int) Math.floor((double) ((((float) i5) * f) / f2));
        int ceil = (int) Math.ceil((double) ((f * ((float) ((i4 - i5) - 1))) / f2));
        if (C18000vb.A00(this.A01).A06) {
            rect.left = ceil;
            rect.right = floor;
            return;
        }
        rect.left = floor;
        rect.right = ceil;
    }
}
