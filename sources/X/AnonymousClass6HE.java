package X;

/* renamed from: X.6HE  reason: invalid class name */
public final class AnonymousClass6HE extends C133436ok {
    public final AnonymousClass725 A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6HE) {
                AnonymousClass6HE r5 = (AnonymousClass6HE) obj;
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

    public AnonymousClass6HE(AnonymousClass725 r1, String str) {
        super(r1);
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Discovery(packId=");
        A10.append(this.A01);
        A10.append(", pack=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
