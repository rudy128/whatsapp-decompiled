package X;

import java.util.List;

/* renamed from: X.9q4  reason: invalid class name and case insensitive filesystem */
public final class C193419q4 {
    public final List A00;
    public final C185649cv A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193419q4) {
                C193419q4 r5 = (C193419q4) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass001.A0k(this.A01) * 31);
    }

    public C193419q4(C185649cv r1, List list) {
        this.A01 = r1;
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CartInfo(price=");
        A10.append(this.A01);
        A10.append(", products=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
