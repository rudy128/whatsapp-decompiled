package X;

import java.math.BigDecimal;

/* renamed from: X.8iB  reason: invalid class name and case insensitive filesystem */
public final class C168038iB extends C182879Wb {
    public final C195679tj A00;
    public final A6S A01;
    public final BigDecimal A02;

    public C168038iB(C195679tj r2, A6S a6s, BigDecimal bigDecimal) {
        super(2);
        this.A00 = r2;
        this.A02 = bigDecimal;
        this.A01 = a6s;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C168038iB) {
                C168038iB r5 = (C168038iB) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass001.A0k(this.A00) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PromotionDisplayItem(promotion=");
        A10.append(this.A00);
        A10.append(", actualDiscount=");
        A10.append(this.A02);
        A10.append(", currency=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
