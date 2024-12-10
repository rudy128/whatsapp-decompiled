package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.Axe  reason: case insensitive filesystem */
public final class C22100Axe extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22100Axe(CartFragment cartFragment) {
        super(1);
        this.this$0 = cartFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C010105w r3;
        A1W a1w = (A1W) obj;
        C18070vi.A0d(a1w, 0);
        CartFragment cartFragment = this.this$0;
        ((AnonymousClass1FU) C72453Mb.A0Z(cartFragment)).CEx();
        if (a1w.A01) {
            C73203Rj A03 = AnonymousClass4a6.A03(cartFragment);
            A03.A0T(false);
            A03.A0D(2131889070);
            A03.A0g(cartFragment, new C20328AGk(0), 2131899286);
            r3 = A03.create();
        } else {
            r3 = null;
        }
        C179399Hu r2 = a1w.A00;
        if (r2 != C179399Hu.NO_CHANGES) {
            CartFragment.A01(new C20334AGq(r3, 32), r2, cartFragment);
        } else if (r3 != null) {
            r3.show();
        } else {
            AnonymousClass8BS.A15(cartFragment.A17(), cartFragment.A14().getString(2131888017), 0);
        }
        return C27621Wu.A00;
    }
}
