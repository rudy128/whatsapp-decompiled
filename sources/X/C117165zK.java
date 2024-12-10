package X;

/* renamed from: X.5zK  reason: invalid class name and case insensitive filesystem */
public final class C117165zK extends C125876bp {
    public final AnonymousClass1BI A00;
    public final C1409773u A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C117165zK) {
                C117165zK r5 = (C117165zK) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C117165zK(AnonymousClass1BI r1, C1409773u r2) {
        super(r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnShapeSelected(shape=");
        A10.append(this.A01);
        A10.append(", chatJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
