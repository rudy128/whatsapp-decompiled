package com.whatsapp.stickers.store;

import X.AnonymousClass00H;
import X.AnonymousClass18K;
import X.AnonymousClass1L9;
import X.AnonymousClass1SB;
import X.AnonymousClass6IH;
import X.AnonymousClass725;
import X.AnonymousClass7RQ;
import X.C108945cZ;
import X.C108975cc;
import X.C112295lF;
import X.C112735lx;
import X.C39711tW;
import X.C72453Mb;
import X.C90594eK;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StickerStoreFeaturedTabFragment extends Hilt_StickerStoreFeaturedTabFragment {
    public View A00;
    public View A01;
    public View A02;
    public AnonymousClass1L9 A03;
    public AnonymousClass18K A04;
    public C90594eK A05 = null;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public boolean A09;
    public boolean A0A;
    public final C39711tW A0B = new C112735lx(this, 15);

    public static void A00(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment) {
        C112295lF r1 = stickerStoreFeaturedTabFragment.A0B;
        List list = stickerStoreFeaturedTabFragment.A0J;
        if (r1 == null) {
            AnonymousClass6IH r3 = new AnonymousClass6IH(stickerStoreFeaturedTabFragment, list);
            stickerStoreFeaturedTabFragment.A0B = r3;
            RecyclerView recyclerView = stickerStoreFeaturedTabFragment.A04;
            if (recyclerView != null) {
                recyclerView.suppressLayout(false);
                RecyclerView.A0C(r3, recyclerView, true, true);
                recyclerView.A0x(true);
                recyclerView.requestLayout();
            }
            stickerStoreFeaturedTabFragment.A27();
            return;
        }
        r1.A00 = list;
        r1.notifyDataSetChanged();
    }

    public static boolean A01(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment) {
        if (stickerStoreFeaturedTabFragment.A06.A0N() || !stickerStoreFeaturedTabFragment.A29() || C108975cc.A1I(stickerStoreFeaturedTabFragment.A0D)) {
            return false;
        }
        return true;
    }

    public void A1r() {
        C108945cZ.A0p(this.A06).A00(3);
        super.A1r();
    }

    public void A27() {
        super.A27();
        View view = this.A02;
        if (view != null) {
            view.setVisibility(C72453Mb.A07(this.A0A ? 1 : 0));
        }
    }

    public void A28(AnonymousClass725 r4, int i) {
        super.A28(r4, i);
        r4.A0A = false;
        this.A0B.A0G(i);
        AnonymousClass1SB r2 = this.A0A;
        AnonymousClass7RQ.A02(r2.A0C, r2, r4, 25);
    }
}
