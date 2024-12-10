package X;

import android.view.View;
import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.8iG  reason: invalid class name and case insensitive filesystem */
public final class C168088iG extends AnonymousClass8IS {
    public final CartFragment A00;
    public final C18000vb A01;
    public final C18030ve A02;
    public final C28931bI A03;
    public final C28931bI A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;

    public C168088iG(View view, CartFragment cartFragment, C18000vb r7, C18030ve r8) {
        super(view);
        C28931bI r0;
        this.A01 = r7;
        this.A02 = r8;
        this.A00 = cartFragment;
        View findViewById = view.findViewById(2131427635);
        C28931bI r3 = null;
        if (findViewById != null) {
            r0 = new C28931bI(findViewById);
        } else {
            r0 = null;
        }
        this.A03 = r0;
        View findViewById2 = view.findViewById(2131427824);
        r3 = findViewById2 != null ? new C28931bI(findViewById2) : r3;
        this.A04 = r3;
        this.A06 = AnonymousClass1DF.A01(new C21851Atd(this));
        this.A07 = AnonymousClass1DF.A01(new C21852Ate(this));
        this.A05 = AnonymousClass1DF.A01(new C21850Atc(this));
        view.setOnClickListener(new AnonymousClass6LG(new AFU((Object) this, 39), 39));
        if (r3 != null) {
            r3.A07(new C98254qp(this, 1));
        }
        A09(false);
    }
}
