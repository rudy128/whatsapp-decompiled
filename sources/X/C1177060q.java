package X;

/* renamed from: X.60q  reason: invalid class name and case insensitive filesystem */
public final class C1177060q extends C138756xd {
    public final AnonymousClass6UU A00;
    public final String A01;
    public final String A02;

    public C1177060q(AnonymousClass6UU r2, String str, String str2) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1177060q) {
                C1177060q r5 = (C1177060q) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17890vO.A02(this.A01, C17880vN.A03(this.A02)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerPackMore(id=");
        A10.append(this.A02);
        A10.append(", count=");
        C138756xd.A02(A10, this.A01);
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
