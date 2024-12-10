package X;

import android.content.Context;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$onShapeSelected$1;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onShapeSelected$1;

/* renamed from: X.7zD  reason: invalid class name */
public final class AnonymousClass7zD extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zD(StickerExpressionsFragment stickerExpressionsFragment) {
        super(1);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1OX A00;
        C18600wl r4;
        AnonymousClass1OS stickerExpressionsViewModel$onShapeSelected$1;
        C139806zT r7 = (C139806zT) obj;
        C18070vi.A0d(r7, 0);
        StickerExpressionsFragment stickerExpressionsFragment = this.this$0;
        if (C72453Mb.A1a(stickerExpressionsFragment.A0b)) {
            ExpressionsSearchViewModel expressionsSearchViewModel = stickerExpressionsFragment.A0E;
            if (expressionsSearchViewModel != null) {
                Context A14 = stickerExpressionsFragment.A14();
                A00 = C41561wd.A00(expressionsSearchViewModel);
                r4 = expressionsSearchViewModel.A0K;
                stickerExpressionsViewModel$onShapeSelected$1 = new ExpressionsSearchViewModel$onShapeSelected$1(A14, r7, expressionsSearchViewModel, (C30391dr) null);
            }
            return C27621Wu.A00;
        }
        StickerExpressionsViewModel A0P = C108955ca.A0P(stickerExpressionsFragment);
        Context A142 = stickerExpressionsFragment.A14();
        A00 = C41561wd.A00(A0P);
        r4 = A0P.A0h;
        stickerExpressionsViewModel$onShapeSelected$1 = new StickerExpressionsViewModel$onShapeSelected$1(A142, A0P, r7, (C30391dr) null);
        AnonymousClass3MW.A1X(r4, stickerExpressionsViewModel$onShapeSelected$1, A00);
        return C27621Wu.A00;
    }
}
