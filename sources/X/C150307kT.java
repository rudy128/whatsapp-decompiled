package X;

import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;

/* renamed from: X.7kT  reason: invalid class name and case insensitive filesystem */
public final class C150307kT extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150307kT(StickerExpressionsFragment stickerExpressionsFragment) {
        super(0);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C38251qy r3;
        GridLayoutManager gridLayoutManager;
        StickerExpressionsFragment stickerExpressionsFragment = this.this$0;
        AnonymousClass11P r4 = stickerExpressionsFragment.A0B;
        if (r4 != null) {
            C18030ve r7 = stickerExpressionsFragment.A02;
            Resources A09 = AnonymousClass3MZ.A09(stickerExpressionsFragment);
            boolean A1F = C108975cc.A1F(this.this$0);
            StickerExpressionsFragment stickerExpressionsFragment2 = this.this$0;
            if (A1F) {
                gridLayoutManager = stickerExpressionsFragment2.A05;
            } else {
                RecyclerView recyclerView = stickerExpressionsFragment2.A06;
                if (recyclerView != null) {
                    r3 = recyclerView.getLayoutManager();
                } else {
                    r3 = null;
                }
                C18070vi.A0z(r3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                gridLayoutManager = (GridLayoutManager) r3;
            }
            boolean A1S = AnonymousClass000.A1S(C72453Mb.A0I(this.this$0.A0d), 7);
            StickerExpressionsFragment stickerExpressionsFragment3 = this.this$0;
            return new C1177560v(A09, gridLayoutManager, r4, stickerExpressionsFragment3, stickerExpressionsFragment3.A0F, r7, A1S);
        }
        C18070vi.A11("time");
        throw null;
    }
}
