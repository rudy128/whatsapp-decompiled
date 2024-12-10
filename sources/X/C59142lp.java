package X;

import java.util.Set;

/* renamed from: X.2lp  reason: invalid class name and case insensitive filesystem */
public final class C59142lp {
    public final BD1 A00;
    public final Set A01;

    public C59142lp(BD1 bd1, Set set) {
        C18070vi.A0d(bd1, 1);
        this.A00 = bd1;
        this.A01 = set;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59142lp) {
                C59142lp r5 = (C59142lp) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentServiceWrapper(paymentService=");
        A10.append(this.A00);
        A10.append(", currencies=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
