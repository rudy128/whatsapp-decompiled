package X;

/* renamed from: X.6HH  reason: invalid class name */
public final class AnonymousClass6HH extends C133436ok {
    public final int A00;
    public final AnonymousClass725 A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6HH) {
                AnonymousClass6HH r5 = (AnonymousClass6HH) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, C17880vN.A03(this.A02)) + this.A00;
    }

    public AnonymousClass6HH(AnonymousClass725 r1, String str, int i) {
        super(r1);
        this.A02 = str;
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Downloading(packId=");
        A10.append(this.A02);
        A10.append(", pack=");
        A10.append(this.A01);
        A10.append(", progress=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
