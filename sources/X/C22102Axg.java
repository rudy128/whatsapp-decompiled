package X;

import android.view.View;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import java.util.List;

/* renamed from: X.Axg  reason: case insensitive filesystem */
public final class C22102Axg extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22102Axg(CartFragment cartFragment) {
        super(1);
        this.this$0 = cartFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1Y = AnonymousClass000.A1Y(obj);
        CartFragment cartFragment = this.this$0;
        View view = cartFragment.A03;
        if (view != null) {
            view.setVisibility(C72453Mb.A07(A1Y ? 1 : 0));
        }
        C161848Hz r5 = cartFragment.A0J;
        if (r5 == null) {
            C18070vi.A11("cartItemsAdapter");
            throw null;
        }
        List list = r5.A0C;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C182879Wb r1 = (C182879Wb) list.get(i);
            if (r1 instanceof C167998i7) {
                ((C167998i7) r1).A01 = A1Y;
                r5.A0G(i);
                break;
            }
            i++;
        }
        return C27621Wu.A00;
    }
}
