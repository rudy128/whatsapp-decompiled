package X;

import java.math.BigDecimal;

/* renamed from: X.9iQ  reason: invalid class name and case insensitive filesystem */
public class C189049iQ {
    public C185649cv A00(C29621ca r8) {
        String A0M;
        A6S a6s;
        if (r8 == null) {
            return null;
        }
        C29621ca A0K = r8.A0K("subtotal");
        C29621ca A0K2 = r8.A0K("total");
        C29621ca A0K3 = r8.A0K("currency");
        C29621ca A0K4 = r8.A0K("price_status");
        if (A0K4 == null) {
            A0M = null;
        } else {
            A0M = A0K4.A0M();
        }
        if (A0K3 == null || AnonymousClass1EG.A0H(A0K3.A0M())) {
            a6s = null;
        } else {
            a6s = new A6S(A0K3.A0M());
        }
        BigDecimal A0Z = AnonymousClass8BY.A0Z(a6s, A0K2);
        BigDecimal A0Z2 = AnonymousClass8BY.A0Z(a6s, A0K);
        if (A0M == null || a6s == null || A0Z == null || A0Z2 == null) {
            return null;
        }
        return new C185649cv(a6s, A0Z2, A0Z);
    }
}
