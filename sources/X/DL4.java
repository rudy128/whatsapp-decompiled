package X;

import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.scroller.RecyclerFastScroller;

public final /* synthetic */ class DL4 implements C28664EDb {
    public final /* synthetic */ RecyclerFastScroller A00;

    public final void BzS(AppBarLayout appBarLayout, int i) {
        RecyclerFastScroller recyclerFastScroller = this.A00;
        int i2 = -i;
        if (recyclerFastScroller.A00 != i2) {
            RecyclerFastScroller.A01(recyclerFastScroller);
            recyclerFastScroller.A00 = i2;
        }
    }

    public /* synthetic */ DL4(RecyclerFastScroller recyclerFastScroller) {
        this.A00 = recyclerFastScroller;
    }
}
