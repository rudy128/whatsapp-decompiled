package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;
import java.util.List;

/* renamed from: X.Axj  reason: case insensitive filesystem */
public final class C22105Axj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22105Axj(CartFragment cartFragment) {
        super(1);
        this.this$0 = cartFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        if (str != null) {
            C161848Hz r5 = this.this$0.A0J;
            if (r5 != null) {
                List list = r5.A0C;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    C182879Wb r1 = (C182879Wb) list.get(i);
                    if ((r1 instanceof C168018i9) && str.equals(((C168018i9) r1).A00.A01.A0H)) {
                        list.remove(i);
                        r5.A0I(i);
                        break;
                    }
                    i++;
                }
            } else {
                C18070vi.A11("cartItemsAdapter");
                throw null;
            }
        }
        CartFragment.A02(this.this$0);
        return C27621Wu.A00;
    }
}
