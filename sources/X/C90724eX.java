package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.BottomSheetListView;

/* renamed from: X.4eX  reason: invalid class name and case insensitive filesystem */
public final class C90724eX implements AbsListView.OnScrollListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ BottomSheetListView A02;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C90724eX(View view, BottomSheetListView bottomSheetListView, int i) {
        this.A02 = bottomSheetListView;
        this.A01 = view;
        this.A00 = i;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        float f;
        boolean A012 = this.A02.A01();
        View view = this.A01;
        if (A012) {
            f = (float) this.A00;
        } else {
            f = 0.0f;
        }
        view.setElevation(f);
    }
}
