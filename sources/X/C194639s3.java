package X;

/* renamed from: X.9s3  reason: invalid class name and case insensitive filesystem */
public final class C194639s3 {
    public final C193219pj A00;
    public final C22821Di A01;
    public final C192919pF A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194639s3) {
                C194639s3 r5 = (C194639s3) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A00)));
    }

    public C194639s3(C192919pF r1, C193219pj r2, C22821Di r3) {
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RegistrationRule(config=");
        A10.append(this.A00);
        A10.append(", behavior=");
        A10.append(this.A02);
        A10.append(", predicate=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
