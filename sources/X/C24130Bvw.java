package X;

/* renamed from: X.Bvw  reason: case insensitive filesystem */
public final class C24130Bvw extends C24885COd {
    public final C25778Clp A00;
    public final C25778Clp A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24130Bvw) {
                C24130Bvw bvw = (C24130Bvw) obj;
                if (!C18070vi.A18(this.A00, bvw.A00) || !C18070vi.A18(this.A01, bvw.A01)) {
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

    public C24130Bvw(C25778Clp clp, C25778Clp clp2) {
        super(clp, clp2);
        this.A00 = clp;
        this.A01 = clp2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NestedChipVariant(leftIcon=");
        A10.append(this.A00);
        A10.append(", rightIcon=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
