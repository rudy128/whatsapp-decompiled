package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.Axi  reason: case insensitive filesystem */
public final class C22104Axi extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22104Axi(CartFragment cartFragment) {
        super(1);
        this.this$0 = cartFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (AnonymousClass000.A1Y(obj)) {
            CartFragment cartFragment = this.this$0;
            AnonymousClass8FS r1 = cartFragment.A0M;
            if (r1 != null) {
                r1.A00 = null;
                r1.A01 = false;
                r1.A02 = false;
                AnonymousClass8G8 A2K = cartFragment.A2K();
                if (!A2K.A01) {
                    C72463Mc.A1B(A2K.A08);
                }
                this.this$0.A2M().A06("cart_view_tag", false);
            } else {
                C18070vi.A11("refreshCartDialogSequenceViewModel");
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
