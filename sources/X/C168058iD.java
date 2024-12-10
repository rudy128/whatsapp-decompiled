package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.8iD  reason: invalid class name and case insensitive filesystem */
public final class C168058iD extends AnonymousClass8IS {
    public final TextView A00;
    public final C28931bI A01;

    public C168058iD(View view, CartFragment cartFragment) {
        super(view);
        this.A00 = AnonymousClass3Ma.A0E(view, 2131436328);
        C28931bI A002 = C28931bI.A00(view, 2131427618);
        this.A01 = A002;
        if (cartFragment != null) {
            A002.A05(new AnonymousClass6LG(new AFU(cartFragment, 38), 39));
        }
    }
}
