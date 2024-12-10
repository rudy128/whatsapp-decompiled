package X;

import java.util.List;

/* renamed from: X.9qj  reason: invalid class name and case insensitive filesystem */
public final class C193829qj {
    public final AU8 A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193829qj) {
                C193829qj r5 = (C193829qj) obj;
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

    public C193829qj(AU8 au8, List list) {
        this.A00 = au8;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RequestSection(headingRow=");
        A10.append(this.A00);
        A10.append(", requestRows=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
