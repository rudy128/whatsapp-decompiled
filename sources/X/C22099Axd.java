package X;

import android.view.View;
import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.Axd  reason: case insensitive filesystem */
public final class C22099Axd extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22099Axd(CartFragment cartFragment) {
        super(1);
        this.this$0 = cartFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        String A1H;
        AnonymousClass9M0 r9 = (AnonymousClass9M0) obj;
        C18070vi.A0d(r9, 0);
        CartFragment cartFragment = this.this$0;
        AnonymousClass8FS r3 = cartFragment.A0M;
        if (r3 != null) {
            if (r3.A01 || r3.A02) {
                A1W a1w = r3.A00;
                A1W a1w2 = null;
                if (a1w != null) {
                    a1w2 = new A1W(a1w.A00, r9 instanceof C167978i5);
                }
                r3.A00 = a1w2;
                r3.A02 = false;
                if (!r3.A01 && a1w2 != null) {
                    r3.A03.A0F(a1w2);
                    r3.A00 = null;
                }
            } else if (r9 instanceof C167978i5) {
                if (r9 instanceof C167958i3) {
                    Object[] objArr = new Object[1];
                    C167958i3 r92 = (C167958i3) r9;
                    C18000vb r2 = cartFragment.A0W;
                    if (r2 != null) {
                        String A03 = r92.A00.A03(r2, r92.A01, true);
                        C18070vi.A0X(A03);
                        A1H = AnonymousClass3MX.A16(cartFragment, A03, objArr, 0, 2131889071);
                    } else {
                        str = "whatsAppLocale";
                    }
                } else {
                    A1H = cartFragment.A1H(2131889070);
                }
                C18070vi.A0b(A1H);
                C23520Bik A02 = C23520Bik.A02(cartFragment.A17(), A1H, 0);
                View findViewById = A02.A0H.findViewById(2131435151);
                if (findViewById != null) {
                    A02.A0B(findViewById);
                    A02.A08();
                } else {
                    throw AnonymousClass001.A13("Unable to find anchor view with id: ", AnonymousClass000.A10(), 2131435151);
                }
            }
            return C27621Wu.A00;
        }
        str = "refreshCartDialogSequenceViewModel";
        C18070vi.A11(str);
        throw null;
    }
}
