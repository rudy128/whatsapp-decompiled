package X;

import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;

/* renamed from: X.7zE  reason: invalid class name */
public final class AnonymousClass7zE extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zE(StickerExpressionsFragment stickerExpressionsFragment) {
        super(1);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        StickerExpressionsFragment stickerExpressionsFragment = this.this$0;
        C108945cZ.A0e(stickerExpressionsFragment.A2H()).A03(43, 1, 10);
        AnonymousClass00H r0 = stickerExpressionsFragment.A0W;
        if (r0 != null) {
            r0.get();
            stickerExpressionsFragment.A1k(AnonymousClass1LU.A0W(stickerExpressionsFragment.A1D(), AnonymousClass6RG.DISCOVERY_PACK, str, AnonymousClass3MW.A0y(C88414Zp.A01(stickerExpressionsFragment, "rawChatJid"))));
            return C27621Wu.A00;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }
}
