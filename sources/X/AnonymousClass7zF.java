package X;

import android.content.Context;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$sendStickerPackLink$1;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$sendStickerPackMessage$1;

/* renamed from: X.7zF  reason: invalid class name */
public final class AnonymousClass7zF extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zF(StickerExpressionsFragment stickerExpressionsFragment) {
        super(1);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        AnonymousClass614 r8 = (AnonymousClass614) obj;
        C18070vi.A0d(r8, 0);
        StickerExpressionsFragment stickerExpressionsFragment = this.this$0;
        AnonymousClass725 r6 = r8.A00;
        AnonymousClass778 r0 = (AnonymousClass778) AnonymousClass3Ma.A0y(AnonymousClass00R.A0C, new C155807tL(stickerExpressionsFragment));
        if (!(r0 == null || (str = r0.A01) == null)) {
            if (r6.A0W) {
                Context A1n = stickerExpressionsFragment.A1n();
                if (A1n != null) {
                    StickerExpressionsViewModel A0P = C108955ca.A0P(stickerExpressionsFragment);
                    C22931Dv r02 = AnonymousClass1BI.A00;
                    AnonymousClass1BI A01 = C22931Dv.A01(str);
                    C219217x r03 = (C219217x) C18070vi.A0E(A0P.A0Z);
                    boolean A17 = C18070vi.A17(A1n, r03);
                    if (!r03.A0G()) {
                        A1n.startActivity(AnonymousClass74O.A03(A1n, 2131894471, C123636Vf.A00(), false));
                    } else if (A17) {
                        AnonymousClass3MW.A1X(A0P.A0g, new StickerExpressionsViewModel$sendStickerPackMessage$1(A0P, A01, r6, (C30391dr) null), C41561wd.A00(A0P));
                    }
                }
            } else {
                StickerExpressionsViewModel A0P2 = C108955ca.A0P(stickerExpressionsFragment);
                String A00 = AnonymousClass725.A00(r6);
                C22931Dv r04 = AnonymousClass1BI.A00;
                AnonymousClass1BI A012 = C22931Dv.A01(str);
                AnonymousClass3MX.A1Q(new StickerExpressionsViewModel$sendStickerPackLink$1(A0P2, A012, A00, (C30391dr) null), C41561wd.A00(A0P2));
            }
        }
        return C27621Wu.A00;
    }
}
