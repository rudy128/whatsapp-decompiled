package X;

/* renamed from: X.9q5  reason: invalid class name and case insensitive filesystem */
public final class C193429q5 {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193429q5) {
                C193429q5 r5 = (C193429q5) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + C17900vP.A00(this.A00);
    }

    public C193429q5(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CatalogPageInfo(hasNextPage=");
        A10.append(this.A01);
        A10.append(", endCursor=");
        return C17900vP.A0B(this.A00, A10);
    }
}
