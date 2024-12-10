package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5li  reason: invalid class name and case insensitive filesystem */
public class C112585li extends C40611uz {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C112585li(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public void A05(Rect rect, View view, C38021qZ r6, RecyclerView recyclerView) {
        int i = this.A00;
        int i2 = this.A01;
        switch (i) {
            case 2:
                rect.set(0, i2, i2, i2);
                return;
            case 3:
                rect.set(0, 0, i2, 0);
                return;
            default:
                rect.set(0, i2, 0, i2);
                return;
        }
    }
}
