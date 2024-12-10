package X;

import android.os.Bundle;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9PJ  reason: invalid class name */
public abstract class AnonymousClass9PJ {
    public static final CartFragment A00(UserJid userJid, String str, int i) {
        CartFragment cartFragment = new CartFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelable("extra_business_id", userJid);
        A0D.putInt("extra_entry_point", i);
        A0D.putString("extra_product_id", str);
        A0D.putBoolean("extra_is_new_instance", true);
        cartFragment.A1R(A0D);
        return cartFragment;
    }
}
