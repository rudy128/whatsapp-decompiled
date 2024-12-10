package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.Axf  reason: case insensitive filesystem */
public final class C22101Axf extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22101Axf(CartFragment cartFragment) {
        super(1);
        this.this$0 = cartFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1Y = AnonymousClass000.A1Y(obj);
        CartFragment cartFragment = this.this$0;
        if (A1Y) {
            cartFragment.A11 = false;
            ((AnonymousClass1FU) C72453Mb.A0Z(cartFragment)).CEx();
            AnonymousClass8BS.A15(cartFragment.A17(), cartFragment.A14().getString(2131888017), 0);
            cartFragment.A2M().A06("order_creates_tag", false);
        }
        return C27621Wu.A00;
    }
}
