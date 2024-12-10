package X;

import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1tX  reason: invalid class name and case insensitive filesystem */
public final class C39721tX extends C39711tW {
    public final /* synthetic */ AbsListView.OnScrollListener A00;

    public void A03(RecyclerView recyclerView, int i) {
        int i2 = 0;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported scroll state ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        this.A00.onScrollStateChanged((AbsListView) null, i2);
    }

    public C39721tX(AbsListView.OnScrollListener onScrollListener) {
        this.A00 = onScrollListener;
    }
}
