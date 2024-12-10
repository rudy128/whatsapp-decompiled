package X;

/* renamed from: X.6rR  reason: invalid class name and case insensitive filesystem */
public final class C134966rR {
    public final C1418377d A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134966rR) {
                C134966rR r5 = (C134966rR) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17880vN.A03(this.A01));
    }

    public C134966rR(C1418377d r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EditCustomPackListItem(id=");
        A10.append(this.A01);
        A10.append(", sticker=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
