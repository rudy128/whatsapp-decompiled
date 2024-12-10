package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8iI  reason: invalid class name and case insensitive filesystem */
public final class C168108iI extends AnonymousClass8IS {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final C198799yv A07;
    public final C182869Wa A08;
    public final CartFragment A09;
    public final C20114A7x A0A;
    public final QuantitySelector A0B;
    public final C19973A1i A0C;
    public final C189919k4 A0D;
    public final C18000vb A0E;
    public final UserJid A0F;
    public final C20005A2v A0G;

    public static final boolean A00(ImageView imageView, C168108iI r6, C20287AEv aEv) {
        String str;
        List<AEI> list = aEv.A0A;
        if (!list.isEmpty() && !aEv.A02()) {
            for (AEI aei : list) {
                if (aei != null && (str = aei.A01) != null && str.length() != 0) {
                    C20246ADe aDe = new C20246ADe(aei.A04, str);
                    C20005A2v a2v = r6.A0G;
                    UserJid userJid = r6.A0F;
                    C183889Zz r1 = null;
                    if (userJid != null) {
                        r1 = new C183889Zz(new C182919Wf(897453112), userJid);
                    }
                    AnonymousClass9PO.A00(imageView, r1, a2v, aDe);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C168108iI(View view, C198799yv r5, C182869Wa r6, B79 b79, CartFragment cartFragment, CartFragment cartFragment2, C20114A7x a7x, C20005A2v a2v, C19973A1i a1i, C189919k4 r13, C18000vb r14, UserJid userJid) {
        super(view);
        C18070vi.A0j(r14, a1i);
        C18070vi.A0d(a7x, 4);
        this.A0E = r14;
        this.A0C = a1i;
        this.A0D = r13;
        this.A0A = a7x;
        this.A07 = r5;
        this.A0G = a2v;
        this.A09 = cartFragment2;
        this.A04 = AnonymousClass3Ma.A0E(view, 2131428873);
        this.A02 = AnonymousClass3Ma.A0E(view, 2131428867);
        this.A03 = AnonymousClass3Ma.A0E(view, 2131428866);
        QuantitySelector quantitySelector = (QuantitySelector) C18070vi.A05(view, 2131428869);
        this.A0B = quantitySelector;
        this.A01 = (LinearLayout) C18070vi.A05(view, 2131428868);
        quantitySelector.A03 = new C20513ANy(b79, this, 0);
        quantitySelector.A04 = new AO0(b79, this, 0);
        this.A00 = AnonymousClass3Ma.A0C(view, 2131428871);
        view.setOnClickListener(new AnonymousClass6LG(new C90084dV((Object) this, (Object) b79, (Object) cartFragment, 8), 39));
        this.A05 = AnonymousClass3Ma.A0E(view, 2131428874);
        this.A06 = AnonymousClass3Ma.A0E(view, 2131428875);
        this.A0F = userJid;
        this.A08 = r6;
    }
}
