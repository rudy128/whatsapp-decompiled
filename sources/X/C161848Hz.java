package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: X.8Hz  reason: invalid class name and case insensitive filesystem */
public final class C161848Hz extends C38391rD implements B79 {
    public AEW A00;
    public Date A01 = new Date();
    public final AnonymousClass9VJ A02;
    public final C198799yv A03;
    public final C182869Wa A04 = new C182869Wa(this);
    public final CartFragment A05;
    public final CartFragment A06;
    public final CartFragment A07;
    public final C20005A2v A08;
    public final C18000vb A09;
    public final C18030ve A0A;
    public final UserJid A0B;
    public final List A0C = AnonymousClass000.A13();

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        C18070vi.A0d(viewGroup2, 0);
        int i2 = i;
        if (i == 0) {
            List list = C42011xT.A0I;
            return new C168058iD(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131625840, false), this.A05);
        } else if (i2 == 1) {
            List list2 = C42011xT.A0I;
            AnonymousClass9VJ r5 = this.A02;
            C198799yv r9 = this.A03;
            C20005A2v a2v = this.A08;
            CartFragment cartFragment = this.A05;
            CartFragment cartFragment2 = this.A07;
            UserJid userJid = this.A0B;
            C182869Wa r10 = this.A04;
            C108965cb.A1P(r9, 2, r10);
            View A0B2 = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131625842, false);
            C36251na r4 = r5.A00;
            AnonymousClass10E r2 = r4.A02;
            C18000vb A6Q = AnonymousClass10E.A6Q(r2);
            C189919k4 A0A2 = AnonymousClass1K1.A0A(r4.A00);
            return new C168108iI(A0B2, r9, r10, this, cartFragment, cartFragment2, AnonymousClass8BU.A0C(r2), a2v, (C19973A1i) r2.A1r.get(), A0A2, A6Q, userJid);
        } else if (i2 == 2) {
            List list3 = C42011xT.A0I;
            C18000vb r6 = this.A09;
            C18030ve r52 = this.A0A;
            return new C168088iG(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131625844, false), this.A06, r6, r52);
        } else if (i2 == 3) {
            List list4 = C42011xT.A0I;
            return new C168118iJ(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131625843, false), this.A09, this.A0A);
        } else if (i2 == 4) {
            List list5 = C42011xT.A0I;
            return new C168078iF(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup2), viewGroup2, 2131625838, false));
        } else {
            throw AnonymousClass000.A0n("CartItemsAdapter/onCreateViewHolder/unhandled view type");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.C161848Hz r5) {
        /*
            java.util.List r5 = r5.A0C
            int r0 = r5.size()
            r4 = -1
            int r3 = r0 + -1
            if (r3 < 0) goto L_0x0024
        L_0x000b:
            int r2 = r3 + -1
            java.lang.Object r1 = r5.get(r3)
            boolean r0 = r1 instanceof X.C168048iC
            if (r0 != 0) goto L_0x0023
            boolean r0 = r1 instanceof X.C168018i9
            if (r0 != 0) goto L_0x0021
            boolean r0 = r1 instanceof X.C168038iB
            if (r0 != 0) goto L_0x0021
            if (r2 < 0) goto L_0x0024
            r3 = r2
            goto L_0x000b
        L_0x0021:
            int r3 = r3 + 1
        L_0x0023:
            return r3
        L_0x0024:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161848Hz.A00(X.8Hz):int");
    }

    public /* bridge */ /* synthetic */ void A0P(C42011xT r2, List list, int i) {
        AnonymousClass8IS r22 = (AnonymousClass8IS) r2;
        C18070vi.A0i(r22, list);
        if (list.isEmpty()) {
            Bmc(r22, i);
        } else {
            r22.A0C((C182879Wb) this.A0C.get(i), list);
        }
    }

    public int A0Q() {
        return this.A0C.size();
    }

    public final int A0U() {
        int i = 0;
        for (C182879Wb r1 : this.A0C) {
            if (r1 instanceof C168018i9) {
                i += (int) ((C168018i9) r1).A00.A00;
            }
        }
        return i;
    }

    public C182879Wb BQj(int i) {
        return (C182879Wb) this.A0C.get(i);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        AnonymousClass8IS r22 = (AnonymousClass8IS) r2;
        C18070vi.A0d(r22, 0);
        r22.A0B((C182879Wb) this.A0C.get(i));
    }

    public int getItemViewType(int i) {
        return ((C182879Wb) this.A0C.get(i)).A00;
    }

    public C161848Hz(AnonymousClass9VJ r2, C198799yv r3, CartFragment cartFragment, CartFragment cartFragment2, CartFragment cartFragment3, C20005A2v a2v, C18000vb r8, C18030ve r9, UserJid userJid) {
        this.A0A = r9;
        this.A08 = a2v;
        this.A03 = r3;
        this.A09 = r8;
        this.A05 = cartFragment;
        this.A07 = cartFragment2;
        this.A06 = cartFragment3;
        this.A02 = r2;
        this.A0B = userJid;
    }

    public final ArrayList A0V() {
        ArrayList A13 = AnonymousClass000.A13();
        for (C182879Wb r1 : this.A0C) {
            if (r1 instanceof C168018i9) {
                A13.add(((C168018i9) r1).A00);
            }
        }
        return A13;
    }
}
