package X;

/* renamed from: X.6EL  reason: invalid class name */
public final class AnonymousClass6EL extends C123136Tg {
    public final int A00;
    public final C122936Sm A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6EL) {
                AnonymousClass6EL r5 = (AnonymousClass6EL) obj;
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

    public AnonymousClass6EL(C122936Sm r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IqError(error=");
        A10.append(this.A01);
        A10.append(", errorCode=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
