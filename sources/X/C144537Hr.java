package X;

import com.whatsapp.expressionstray.expression.gifs.GifExpressionsFragment;
import com.whatsapp.expressionstray.expression.gifs.GifExpressionsSearchViewModel;
import com.whatsapp.expressionstray.expression.gifs.GifExpressionsSearchViewModel$onGifSelected$1;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onGifSelected$1;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;

/* renamed from: X.7Hr  reason: invalid class name and case insensitive filesystem */
public class C144537Hr implements AnonymousClass87C {
    public final int A00;
    public final Object A01;

    public C144537Hr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BvG(AnonymousClass77J r5, boolean z) {
        AnonymousClass1OX A002;
        AnonymousClass1OS gifExpressionsSearchViewModel$onGifSelected$1;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(r5, 0);
                GifExpressionsFragment gifExpressionsFragment = (GifExpressionsFragment) this.A01;
                ExpressionsSearchViewModel expressionsSearchViewModel = gifExpressionsFragment.A06;
                if (expressionsSearchViewModel != null) {
                    A002 = C41561wd.A00(expressionsSearchViewModel);
                    gifExpressionsSearchViewModel$onGifSelected$1 = new ExpressionsSearchViewModel$onGifSelected$1(expressionsSearchViewModel, r5, (C30391dr) null, z);
                } else {
                    GifExpressionsSearchViewModel gifExpressionsSearchViewModel = (GifExpressionsSearchViewModel) gifExpressionsFragment.A0G.getValue();
                    A002 = C41561wd.A00(gifExpressionsSearchViewModel);
                    gifExpressionsSearchViewModel$onGifSelected$1 = new GifExpressionsSearchViewModel$onGifSelected$1(gifExpressionsSearchViewModel, r5, (C30391dr) null, z);
                }
                AnonymousClass3MX.A1Q(gifExpressionsSearchViewModel$onGifSelected$1, A002);
                return;
            case 1:
                C18070vi.A0d(r5, 0);
                AnonymousClass87C r0 = ((C112375lN) this.A01).A00;
                if (r0 != null) {
                    r0.BvG(r5, z);
                    return;
                }
                return;
            case 2:
                ((MessageReplyActivity) this.A01).A4d(r5);
                return;
            default:
                C18070vi.A0d(r5, 0);
                TextStatusComposerFragment.A07(r5, (TextStatusComposerFragment) this.A01);
                return;
        }
    }
}
