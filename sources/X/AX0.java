package X;

public final class AX0 implements B5O {
    public final C195889u5 A00;
    public final C195889u5 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AX0) {
                AX0 ax0 = (AX0) obj;
                if (!C18070vi.A18(this.A00, ax0.A00) || !C18070vi.A18(this.A01, ax0.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public AX0(C195889u5 r1, C195889u5 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrfSupported(first=");
        A10.append(this.A00);
        A10.append(", second=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
