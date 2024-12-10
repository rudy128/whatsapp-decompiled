package X;

import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$updateSelectedStickerPack$1;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onItemsScroll$1;
import java.util.List;

/* renamed from: X.60v  reason: invalid class name and case insensitive filesystem */
public final class C1177560v extends C112755lz {
    public boolean A00;
    public final /* synthetic */ StickerExpressionsFragment A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1177560v(Resources resources, GridLayoutManager gridLayoutManager, AnonymousClass11P r10, StickerExpressionsFragment stickerExpressionsFragment, C111835kV r12, C18030ve r13, boolean z) {
        super(resources, gridLayoutManager, r10, r12, r13, z);
        this.A01 = stickerExpressionsFragment;
        C18070vi.A0b(r13);
        C18070vi.A0b(resources);
    }

    public void A03(RecyclerView recyclerView, int i) {
        boolean z = false;
        C18070vi.A0d(recyclerView, 0);
        super.A03(recyclerView, i);
        if (i != 0) {
            z = true;
            if (i != 1) {
                return;
            }
        }
        this.A00 = z;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        AnonymousClass1OB r0;
        C18070vi.A0d(recyclerView, 0);
        StickerExpressionsFragment stickerExpressionsFragment = this.A01;
        if (!stickerExpressionsFragment.A0X) {
            if (stickerExpressionsFragment.A0B != null) {
                if (System.currentTimeMillis() - stickerExpressionsFragment.A00 >= 100) {
                    super.A04(recyclerView, i, i2);
                    AnonymousClass6UU r7 = this.A01;
                    if (r7 != null) {
                        if (!r7.equals(stickerExpressionsFragment.A0G)) {
                            StickerExpressionsViewModel A0P = C108955ca.A0P(stickerExpressionsFragment);
                            boolean z = this.A00;
                            AnonymousClass3MW.A1X(A0P.A0g, new StickerExpressionsViewModel$updateSelectedStickerPack$1(A0P, r7, (C30391dr) null, z), C41561wd.A00(A0P));
                        }
                        stickerExpressionsFragment.A0G = r7;
                    }
                    if (i2 != 0) {
                        if (C72453Mb.A1a(stickerExpressionsFragment.A0b)) {
                            StickerExpressionsViewModel A0P2 = C108955ca.A0P(stickerExpressionsFragment);
                            int i3 = this.A00;
                            List list = A0P2.A02;
                            if (list == null || list.size() < 100) {
                                int i4 = 0;
                                int A0m = AnonymousClass001.A0m(A0P2.A04);
                                List list2 = A0P2.A03;
                                if (list2 != null) {
                                    i4 = list2.size();
                                }
                                List list3 = A0P2.A02;
                                if (list3 != null) {
                                    int A0A = C108945cZ.A0A(list3, i4 + A0m);
                                    String str = A0P2.A01;
                                    if (str != null && i3 + 20 > A0A && (r0 = A0P2.A07) != null && !r0.Be2()) {
                                        List list4 = A0P2.A03;
                                        if (list4 == null) {
                                            list4 = C18460wS.A00;
                                        }
                                        A0P2.A07 = AnonymousClass3MY.A0s(new StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1(A0P2, str, list4, list3, (C30391dr) null), C41561wd.A00(A0P2));
                                    }
                                }
                            }
                        }
                        ExpressionsSearchViewModel expressionsSearchViewModel = stickerExpressionsFragment.A0E;
                        if (expressionsSearchViewModel != null) {
                            AnonymousClass3MX.A1Q(new ExpressionsSearchViewModel$onItemsScroll$1(expressionsSearchViewModel, (C30391dr) null), C41561wd.A00(expressionsSearchViewModel));
                        }
                    }
                    if (stickerExpressionsFragment.A0B != null) {
                        stickerExpressionsFragment.A00 = System.currentTimeMillis();
                        return;
                    }
                } else {
                    return;
                }
            }
            C18070vi.A11("time");
            throw null;
        }
    }
}
