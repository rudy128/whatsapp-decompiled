package X;

import java.math.BigDecimal;

/* renamed from: X.8i3  reason: invalid class name and case insensitive filesystem */
public final class C167958i3 extends C167978i5 {
    public final A6S A00;
    public final BigDecimal A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167958i3) {
                C167958i3 r5 = (C167958i3) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C167958i3(A6S a6s, BigDecimal bigDecimal) {
        this.A01 = bigDecimal;
        this.A00 = a6s;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TooLittleCartPriceFailure(minimumCartPrice=");
        A10.append(this.A01);
        A10.append(", currency=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
