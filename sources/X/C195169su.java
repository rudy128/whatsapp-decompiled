package X;

import java.util.List;

/* renamed from: X.9su  reason: invalid class name and case insensitive filesystem */
public final class C195169su {
    public final long A00;
    public final C195679tj A01;
    public final C185649cv A02;
    public final String A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195169su) {
                C195169su r8 = (C195169su) obj;
                if (!C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A04, r8.A04) || this.A00 != r8.A00 || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0K(this.A00, AnonymousClass000.A0N(this.A04, C17880vN.A03(this.A03))) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A01);
    }

    public C195169su(C195679tj r1, C185649cv r2, String str, List list, long j) {
        this.A03 = str;
        this.A04 = list;
        this.A00 = j;
        this.A02 = r2;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Order(id=");
        A10.append(this.A03);
        A10.append(", products=");
        A10.append(this.A04);
        A10.append(", timestamp=");
        A10.append(this.A00);
        A10.append(", price=");
        A10.append(this.A02);
        A10.append(", appliedPromotion=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
