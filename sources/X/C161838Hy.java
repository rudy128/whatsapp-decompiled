package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8Hy  reason: invalid class name and case insensitive filesystem */
public final class C161838Hy extends C38391rD implements B79 {
    public final AnonymousClass9VH A00;
    public final C20005A2v A01;
    public final OrderDetailFragment A02;
    public final C18000vb A03;
    public final C18030ve A04;
    public final UserJid A05;
    public final List A06 = AnonymousClass000.A13();

    public C161838Hy(AnonymousClass9VH r2, C20005A2v a2v, OrderDetailFragment orderDetailFragment, C18000vb r5, C18030ve r6, UserJid userJid) {
        C72473Md.A1M(a2v, r2, r6, 1);
        C18070vi.A0d(r5, 6);
        this.A01 = a2v;
        this.A02 = orderDetailFragment;
        this.A05 = userJid;
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r5;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                AnonymousClass9VH r2 = this.A00;
                C20005A2v a2v = this.A01;
                OrderDetailFragment orderDetailFragment = this.A02;
                UserJid userJid = this.A05;
                View A09 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625841);
                C36251na r22 = r2.A00;
                AnonymousClass10E r1 = r22.A02;
                C18000vb A6Q = AnonymousClass10E.A6Q(r1);
                C26911Ty A0D = AnonymousClass8BT.A0D(r1);
                C189919k4 A0A = AnonymousClass1K1.A0A(r22.A00);
                return new C168098iH(A09, A0D, this, AnonymousClass8BU.A0C(r1), a2v, (C19973A1i) r1.A1r.get(), orderDetailFragment, A0A, A6Q, userJid);
            } else if (i == 3) {
                List list = C42011xT.A0I;
                return new C168118iJ(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625843, false), this.A03, this.A04);
            } else if (i == 4) {
                return new C168068iE(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625849));
            } else {
                throw AnonymousClass000.A0n("CartItemsAdapter/onCreateViewHolder/unhandled view type");
            }
        } else {
            List list2 = C42011xT.A0I;
            return new C168058iD(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625840, false), (CartFragment) null);
        }
    }

    public int A0Q() {
        return this.A06.size();
    }

    public C182879Wb BQj(int i) {
        return (C182879Wb) this.A06.get(i);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        AnonymousClass8IS r22 = (AnonymousClass8IS) r2;
        C18070vi.A0d(r22, 0);
        r22.A0B((C182879Wb) this.A06.get(i));
    }

    public int getItemViewType(int i) {
        return ((C182879Wb) this.A06.get(i)).A00;
    }
}
