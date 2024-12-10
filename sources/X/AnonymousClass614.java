package X;

/* renamed from: X.614  reason: invalid class name */
public final class AnonymousClass614 extends AnonymousClass6UU {
    public final AnonymousClass725 A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass614) {
                AnonymousClass614 r5 = (AnonymousClass614) obj;
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

    public AnonymousClass614(AnonymousClass725 r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Pack(id=");
        A10.append(this.A01);
        A10.append(", pack=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
