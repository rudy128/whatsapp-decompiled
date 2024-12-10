package X;

import android.view.ViewTreeObserver;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;

/* renamed from: X.2vH  reason: invalid class name and case insensitive filesystem */
public final class C64752vH implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver A00;
    public final /* synthetic */ StickyHeadersLinearLayoutManager A01;

    public C64752vH(ViewTreeObserver viewTreeObserver, StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        this.A00 = viewTreeObserver;
        this.A01 = stickyHeadersLinearLayoutManager;
    }

    public void onGlobalLayout() {
        this.A00.removeOnGlobalLayoutListener(this);
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A01;
        int i = stickyHeadersLinearLayoutManager.A01;
        if (i != -1) {
            stickyHeadersLinearLayoutManager.A1a(i, stickyHeadersLinearLayoutManager.A00);
            stickyHeadersLinearLayoutManager.A01 = -1;
            stickyHeadersLinearLayoutManager.A00 = Integer.MIN_VALUE;
        }
    }
}
