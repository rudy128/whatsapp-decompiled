package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* renamed from: X.AFk  reason: case insensitive filesystem */
public final /* synthetic */ class C20302AFk implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ C168648jP A00;
    public final /* synthetic */ C28931bI A01;

    public final void onScrollChanged() {
        int i;
        int i2;
        int i3;
        View childAt;
        C168648jP r5 = this.A00;
        C28931bI r4 = this.A01;
        boolean A1Z = C72453Mb.A1Z(r4);
        ScrollView scrollView = r5.A05;
        if (scrollView == null || (childAt = scrollView.getChildAt(A1Z)) == null) {
            i = 0;
        } else {
            i = childAt.getBottom();
        }
        ScrollView scrollView2 = r5.A05;
        if (scrollView2 != null) {
            i2 = scrollView2.getHeight();
        } else {
            i2 = 0;
        }
        ScrollView scrollView3 = r5.A05;
        if (scrollView3 != null) {
            i3 = scrollView3.getScrollY();
        } else {
            i3 = 0;
        }
        if (i <= i2 + i3) {
            r4.A04(8);
        } else {
            r4.A04(A1Z ? 1 : 0);
        }
    }

    public /* synthetic */ C20302AFk(C168648jP r1, C28931bI r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
