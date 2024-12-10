package X;

import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;

/* renamed from: X.844  reason: invalid class name */
public final class AnonymousClass844 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass844(StickerExpressionsFragment stickerExpressionsFragment) {
        super(2);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        C1418377d r5 = (C1418377d) obj;
        AnonymousClass6UU r4 = (AnonymousClass6UU) obj2;
        C18070vi.A0h(r5, r4);
        A59 A0e = C108945cZ.A0e(this.this$0.A2H());
        int i2 = 10;
        if (this.this$0.A0E != null) {
            i2 = 9;
        }
        A0e.A03(C108955ca.A0j(), 4, i2);
        if (C18070vi.A18(r4.A00(), "all")) {
            i = 5;
        } else {
            i = 3;
            if (r4 instanceof AnonymousClass613) {
                i = 7;
            }
        }
        r5.A05 = Integer.valueOf(i);
        StickerExpressionsFragment stickerExpressionsFragment = this.this$0;
        ((C131186kg) this.this$0.A0a.get()).A00(stickerExpressionsFragment.A1B(), r4, r5, AnonymousClass3MW.A0y(C88414Zp.A01(stickerExpressionsFragment, "rawChatJid")), C72453Mb.A1a(this.this$0.A0b));
        return C27621Wu.A00;
    }
}
