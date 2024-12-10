package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.Axl  reason: case insensitive filesystem */
public final class C22107Axl extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22107Axl(CartFragment cartFragment) {
        super(1);
        this.this$0 = cartFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        C179399Hu r7 = (C179399Hu) obj;
        C18070vi.A0d(r7, 0);
        CartFragment cartFragment = this.this$0;
        AnonymousClass8FS r1 = cartFragment.A0M;
        if (r1 != null) {
            if (r1.A01 || r1.A02) {
                C19972A1h a1h = (C19972A1h) cartFragment.A2L().A01.A06();
                if (a1h != null) {
                    z = a1h.A01;
                } else {
                    z = false;
                }
                AnonymousClass8FS r2 = cartFragment.A0M;
                if (r2 != null) {
                    if (r2.A01 || r2.A02) {
                        A1W a1w = r2.A00;
                        A1W a1w2 = null;
                        if (a1w != null) {
                            a1w2 = new A1W(r7, a1w.A01);
                        }
                        r2.A00 = a1w2;
                        r2.A01 = false;
                        if (!r2.A02 && a1w2 != null) {
                            r2.A03.A0F(a1w2);
                            r2.A00 = null;
                        }
                    }
                    if (z && cartFragment.A2L().A0T() != null) {
                        C198719yn r3 = cartFragment.A2L().A02;
                        r3.A0C.CGF(new AnonymousClass7RK(11, (Object) r3, true));
                    }
                }
            } else if (r7 != C179399Hu.NO_CHANGES) {
                CartFragment.A01((C22851Dl) null, r7, cartFragment);
            }
            return C27621Wu.A00;
        }
        C18070vi.A11("refreshCartDialogSequenceViewModel");
        throw null;
    }
}
