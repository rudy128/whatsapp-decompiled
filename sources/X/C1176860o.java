package X;

/* renamed from: X.60o  reason: invalid class name and case insensitive filesystem */
public final class C1176860o extends C138756xd {
    public final C139806zT A00;
    public final AnonymousClass6UU A01;
    public final String A02;

    public C1176860o(C139806zT r2, AnonymousClass6UU r3, String str) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1176860o) {
                C1176860o r5 = (C1176860o) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A02)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShapeSticker(id=");
        A10.append(this.A02);
        A10.append(", shape=");
        C108965cb.A1S(this.A00, A10);
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
