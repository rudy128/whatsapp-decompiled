package X;

/* renamed from: X.CaR  reason: case insensitive filesystem */
public final class C25175CaR {
    public final DPJ A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25175CaR) {
                C25175CaR caR = (C25175CaR) obj;
                if (!C18070vi.A18(this.A01, caR.A01) || !C18070vi.A18(this.A00, caR.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17880vN.A03(this.A01));
    }

    public C25175CaR(DPJ dpj, String str) {
        C18070vi.A0j(str, dpj);
        this.A01 = str;
        this.A00 = dpj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoWireTypeStoreEntry(name=");
        A10.append(this.A01);
        A10.append(", type=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
