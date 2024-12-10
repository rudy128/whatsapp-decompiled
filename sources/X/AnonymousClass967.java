package X;

/* renamed from: X.967  reason: invalid class name */
public final class AnonymousClass967 extends AnonymousClass9MZ {
    public final A7B A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass967) {
                AnonymousClass967 r5 = (AnonymousClass967) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public AnonymousClass967(A7B a7b, boolean z) {
        this.A01 = z;
        this.A00 = a7b;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerifyVpaError(isBackgroundVerification=");
        A10.append(this.A01);
        A10.append(", error=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
