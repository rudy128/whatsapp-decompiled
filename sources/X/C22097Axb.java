package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Axb  reason: case insensitive filesystem */
public final class C22097Axb extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22097Axb(CartFragment cartFragment) {
        super(1);
        this.this$0 = cartFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AEW aew = (AEW) obj;
        if (aew != null) {
            CartFragment cartFragment = this.this$0;
            C161848Hz r6 = cartFragment.A0J;
            if (r6 != null) {
                r6.A00 = aew;
                int size = r6.A0C.size();
                List list = C42011xT.A0I;
                r6.A01.A04(AnonymousClass000.A0i(), 0, size);
                AnonymousClass8G8 A2K = cartFragment.A2K();
                int i = cartFragment.A02;
                int i2 = cartFragment.A01;
                C161848Hz r0 = cartFragment.A0J;
                if (r0 != null) {
                    ArrayList A0V = r0.A0V();
                    if (A2K.A00 || !(!A0V.isEmpty())) {
                        C20004A2u A2M = cartFragment.A2M();
                        C161848Hz r02 = cartFragment.A0J;
                        if (r02 != null) {
                            A2M.A04("cart_view_tag", "ProductsCount", String.valueOf(r02.A0U()));
                            cartFragment.A2M().A06("cart_view_tag", true);
                        }
                    } else {
                        A2K.A00 = true;
                        ArrayList A0g = C108975cc.A0g(A0V);
                        Iterator it = A0V.iterator();
                        while (it.hasNext()) {
                            A0g.add(AnonymousClass8BR.A0J(it).A01.A0H);
                        }
                        C198799yv r2 = A2K.A0I;
                        r2.A0F.A03(new C195119sp(A2K.A0K.A00(aew, AnonymousClass9QG.A00()), A2K.A0O, A0g, i, i2), r2.A0M);
                    }
                }
            }
            C18070vi.A11("cartItemsAdapter");
            throw null;
        }
        return C27621Wu.A00;
    }
}
