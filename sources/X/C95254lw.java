package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: X.4lw  reason: invalid class name and case insensitive filesystem */
public final class C95254lw implements C38231qw {
    public final ListView A00;

    public C95254lw(ListView listView) {
        C18070vi.A0d(listView, 1);
        this.A00 = listView;
    }

    public void BBC(View view, boolean z) {
        this.A00.addFooterView(view, (Object) null, z);
    }

    public void BBD(View view, boolean z) {
        C18070vi.A0d(view, 0);
        this.A00.addHeaderView(view, (Object) null, z);
    }

    public /* synthetic */ void C04() {
    }

    public void CIr() {
        this.A00.setFastScrollEnabled(false);
    }

    public void CJ4() {
        this.A00.setHeaderDividersEnabled(true);
    }

    public void CKZ() {
        this.A00.setScrollbarFadingEnabled(true);
    }

    public void CKh() {
        this.A00.setSelection(0);
    }

    public void CNT() {
        this.A00.smoothScrollToPosition(0);
    }

    public C38361rA BMX() {
        ListAdapter adapter = this.A00.getAdapter();
        if (adapter instanceof C38361rA) {
            return (C38361rA) adapter;
        }
        return null;
    }

    public int BRo() {
        return this.A00.getFirstVisiblePosition();
    }

    public int BSQ() {
        return this.A00.getHeaderViewsCount();
    }

    public int BTt() {
        return this.A00.getLastVisiblePosition();
    }

    public ViewGroup BbU() {
        return this.A00;
    }

    public void CEk(View view) {
        this.A00.removeHeaderView(view);
    }

    public void CHn(C38361rA r2) {
        this.A00.setAdapter((ListAdapter) r2);
    }

    public void CIn(View view) {
        this.A00.setEmptyView(view);
    }

    public void CJi(AbsListView.OnScrollListener onScrollListener) {
        this.A00.setOnScrollListener(onScrollListener);
    }

    public Context getContext() {
        return AnonymousClass3MY.A04(this.A00);
    }

    public int getCount() {
        return this.A00.getCount();
    }
}
