package X;

/* renamed from: X.4Ta  reason: invalid class name and case insensitive filesystem */
public final class C86774Ta {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86774Ta) {
                C86774Ta r5 = (C86774Ta) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, this.A00 * 31);
    }

    public C86774Ta(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Item(type=");
        A10.append(this.A00);
        A10.append(", data=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
