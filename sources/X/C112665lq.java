package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.5lq  reason: invalid class name and case insensitive filesystem */
public class C112665lq extends C40611uz {
    public final int A00;
    public final int A01;

    public C112665lq(GifSearchContainer gifSearchContainer) {
        this.A00 = 4;
        this.A01 = gifSearchContainer.getResources().getDimensionPixelSize(2131168605);
    }

    public void A05(Rect rect, View view, C38021qZ r6, RecyclerView recyclerView) {
        int i = this.A00;
        C18070vi.A0d(rect, 0);
        int i2 = this.A01;
        switch (i) {
            case 0:
                rect.set(0, i2, 0, i2);
                return;
            case 2:
                rect.set(0, i2, i2, i2);
                return;
            default:
                rect.set(0, i2, i2, 0);
                return;
        }
    }

    public C112665lq(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }
}
