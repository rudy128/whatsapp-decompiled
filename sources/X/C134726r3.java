package X;

/* renamed from: X.6r3  reason: invalid class name and case insensitive filesystem */
public final class C134726r3 {
    public final Exception A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134726r3) {
                C134726r3 r5 = (C134726r3) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A01) * 31) + C17880vN.A02(this.A00);
    }

    public C134726r3(Exception exc, Object obj) {
        this.A01 = obj;
        this.A00 = exc;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Result(value=");
        A10.append(this.A01);
        A10.append(", exception=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
