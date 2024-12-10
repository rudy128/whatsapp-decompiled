package X;

import android.util.Pair;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import java.util.List;

/* renamed from: X.Axk  reason: case insensitive filesystem */
public final class C22106Axk extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22106Axk(CartFragment cartFragment) {
        super(1);
        this.this$0 = cartFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        C18070vi.A0d(pair, 0);
        C161848Hz r4 = this.this$0.A0J;
        if (r4 == null) {
            C18070vi.A11("cartItemsAdapter");
            throw null;
        }
        Object obj2 = pair.first;
        Number number = (Number) pair.second;
        List list = r4.A0C;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C182879Wb r1 = (C182879Wb) list.get(i);
            if (r1 instanceof C168018i9) {
                C194209rM r2 = ((C168018i9) r1).A00;
                if (C18070vi.A18(obj2, r2.A01.A0H)) {
                    r2.A00 = (long) number.intValue();
                    List list2 = C42011xT.A0I;
                    r4.A01.A04(true, i, 1);
                    break;
                }
            }
            i++;
        }
        CartFragment.A02(this.this$0);
        return C27621Wu.A00;
    }
}
