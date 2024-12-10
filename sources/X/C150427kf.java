package X;

import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel;
import java.util.ArrayList;

/* renamed from: X.7kf  reason: invalid class name and case insensitive filesystem */
public final class C150427kf extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150427kf(StickerExpressionsViewModel stickerExpressionsViewModel) {
        super(0);
        this.this$0 = stickerExpressionsViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int A00;
        ArrayList A13 = AnonymousClass000.A13();
        C18030ve r2 = this.this$0.A0C.A00;
        if (C25291Nq.A04(r2, 9860)) {
            A00 = 5;
        } else {
            A00 = C18020vd.A00(C18040vf.A02, r2, 5422);
        }
        for (int i = 0; i < A00; i++) {
            C1418377d A0a = C108985cd.A0a();
            A0a.A0F = "loading-hash";
            A13.add(A0a);
        }
        return A13;
    }
}
