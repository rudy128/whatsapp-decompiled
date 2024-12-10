package X;

/* renamed from: X.9HI  reason: invalid class name */
public final class AnonymousClass9HI extends AnonymousClass9HK {
    public final Object A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9HI) {
                AnonymousClass9HI r5 = (AnonymousClass9HI) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + C17880vN.A02(this.A00);
    }

    public AnonymousClass9HI(Object obj, Object obj2) {
        this.A01 = obj;
        this.A00 = obj2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(request=");
        A10.append(this.A01);
        A10.append(", response=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
