package X;

/* renamed from: X.9rE  reason: invalid class name and case insensitive filesystem */
public final class C194139rE {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194139rE) {
                C194139rE r5 = (C194139rE) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass001.A0k(this.A01);
    }

    public C194139rE(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IndexedValue(index=");
        A10.append(this.A00);
        A10.append(", value=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
