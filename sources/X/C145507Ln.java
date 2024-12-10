package X;

/* renamed from: X.7Ln  reason: invalid class name and case insensitive filesystem */
public final class C145507Ln implements C1596485i {
    public final int A00;
    public final ADN A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C145507Ln) {
                C145507Ln r5 = (C145507Ln) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public C145507Ln(ADN adn, int i) {
        this.A01 = adn;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnSendSmsToWaRequestSucceed(result=");
        A10.append(this.A01);
        A10.append(", dialogType=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
