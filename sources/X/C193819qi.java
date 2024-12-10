package X;

/* renamed from: X.9qi  reason: invalid class name and case insensitive filesystem */
public final class C193819qi {
    public final C22821Di A00;
    public final C22821Di A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193819qi) {
                C193819qi r5 = (C193819qi) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C193819qi(C22821Di r1, C22821Di r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NestedMessageChecker(hasMessage=");
        A10.append(this.A01);
        A10.append(", getMessage=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
