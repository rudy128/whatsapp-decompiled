package X;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: X.0Rr  reason: invalid class name and case insensitive filesystem */
public class C05310Rr implements AbsListView.OnScrollListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass0QH A02;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C05310Rr(View view, View view2, AnonymousClass0QH r3) {
        this.A02 = r3;
        this.A01 = view;
        this.A00 = view2;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0QH.A02(absListView, this.A01, this.A00);
    }
}
