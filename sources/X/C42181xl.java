package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1xl  reason: invalid class name and case insensitive filesystem */
public abstract class C42181xl {
    public static final int A00(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        C38251qy layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null) {
            return -1;
        }
        int A1O = linearLayoutManager.A1O();
        int A1N = linearLayoutManager.A1N();
        if (A1N == -1) {
            return A1O;
        }
        if (A1O == -1) {
            return A1N;
        }
        return Math.min(A1O, A1N);
    }
}
