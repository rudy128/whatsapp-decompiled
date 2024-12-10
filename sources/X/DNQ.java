package X;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public final class DNQ implements E6D {
    public SwipeRefreshLayout A00;
    public boolean A01;

    public boolean CHw(DOZ doz, Object obj, int i) {
        C18070vi.A0d(obj, 2);
        if (i != 38) {
            return false;
        }
        boolean A012 = C25343Ce2.A01(obj);
        this.A01 = A012;
        SwipeRefreshLayout swipeRefreshLayout = this.A00;
        if (swipeRefreshLayout == null) {
            return true;
        }
        swipeRefreshLayout.setRefreshing(A012);
        return true;
    }
}
