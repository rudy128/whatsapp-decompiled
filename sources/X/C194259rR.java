package X;

/* renamed from: X.9rR  reason: invalid class name and case insensitive filesystem */
public final class C194259rR {
    public final String A00;
    public final String A01;
    public final Object A02;

    public C194259rR(Object obj, String str, String str2) {
        C18070vi.A0d(str2, 2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194259rR) {
                C194259rR r5 = (C194259rR) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A01, C17880vN.A03(this.A00)) + AnonymousClass001.A0k(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BreadCrumbItem(itemId=");
        A10.append(this.A00);
        A10.append(", itemName=");
        A10.append(this.A01);
        A10.append(", data=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
