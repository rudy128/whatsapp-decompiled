package X;

/* renamed from: X.AdN  reason: case insensitive filesystem */
public final class C21031AdN implements C22389B5s {
    public final ADN A00;
    public final boolean A01;

    public C21031AdN(ADN adn, boolean z) {
        C18070vi.A0d(adn, 1);
        this.A00 = adn;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21031AdN) {
                C21031AdN adN = (C21031AdN) obj;
                if (!C18070vi.A18(this.A00, adN.A00) || this.A01 != adN.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnEmailOtpRequested(result=");
        A10.append(this.A00);
        A10.append(", showProgress=");
        return C17900vP.A0F(A10, this.A01);
    }
}
