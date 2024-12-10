package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.registration.EULA;

/* renamed from: X.AFr  reason: case insensitive filesystem */
public class C20309AFr implements AbsListView.OnScrollListener {
    public final /* synthetic */ BottomSheetListView A00;
    public final /* synthetic */ EULA A01;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C20309AFr(BottomSheetListView bottomSheetListView, EULA eula) {
        this.A01 = eula;
        this.A00 = bottomSheetListView;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View findViewById = this.A01.findViewById(2131430779);
        if (findViewById != null) {
            findViewById.setVisibility(C72453Mb.A07(this.A00.A01() ? 1 : 0));
        }
    }
}
