package X;

/* renamed from: X.Ca5  reason: case insensitive filesystem */
public final class C25154Ca5 {
    public final C25222CbI A00;
    public final C25214CbA A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25154Ca5) {
                C25154Ca5 ca5 = (C25154Ca5) obj;
                if (!C18070vi.A18(this.A01, ca5.A01) || !C18070vi.A18(this.A00, ca5.A00)) {
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

    public C25154Ca5(C25222CbI cbI, C25214CbA cbA) {
        this.A01 = cbA;
        this.A00 = cbI;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TooltipInfo(tooltipPositionInfo=");
        A10.append(this.A01);
        A10.append(", tooltipAttributes=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
