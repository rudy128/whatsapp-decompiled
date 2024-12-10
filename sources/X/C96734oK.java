package X;

/* renamed from: X.4oK  reason: invalid class name and case insensitive filesystem */
public final class C96734oK implements AnonymousClass5Y4 {
    public final C41761x1 A00;
    public final C22821Di A01;

    public C96734oK(C41761x1 r2, C22821Di r3) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C96734oK) {
                C96734oK r5 = (C96734oK) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ListItemStatic(labelInfo=");
        A10.append(this.A00);
        A10.append(", onAdded=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
