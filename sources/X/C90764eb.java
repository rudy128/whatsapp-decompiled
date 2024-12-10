package X;

import android.widget.AbsListView;
import android.widget.ListView;

/* renamed from: X.4eb  reason: invalid class name and case insensitive filesystem */
public class C90764eb implements AbsListView.OnScrollListener {
    public int A00;
    public int A01;
    public final /* synthetic */ C79333vF A02;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C90764eb(C79333vF r1) {
        this.A02 = r1;
    }

    private void A00(int i, int i2) {
        AnonymousClass206 BTT;
        C79333vF r4 = this.A02;
        int count = r4.A04.getCount();
        while (i <= i2) {
            ListView listView = r4.getListView();
            C17960vV.A05(listView);
            int headerViewsCount = i - listView.getHeaderViewsCount();
            if (headerViewsCount >= 0 && headerViewsCount <= count - 1 && (BTT = r4.A04.BTT(headerViewsCount)) != null && BTT.A0u == 13) {
                r4.A00.A0G.A02(BTT.A0v);
            }
            i++;
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        if (!(i2 == 0 || (i4 = this.A01) == 0)) {
            int i5 = i + i2;
            int i6 = this.A00;
            int i7 = i4 + i6;
            if (i6 < i) {
                A00(i6, i - 1);
            } else if (i5 < i7) {
                A00(i5 + 1, i7);
            }
        }
        this.A00 = i;
        this.A01 = i2;
    }
}
