package X;

/* renamed from: X.CaO  reason: case insensitive filesystem */
public final class C25172CaO {
    public final C4V A00;
    public final C25190Cah A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25172CaO) {
                C25172CaO caO = (C25172CaO) obj;
                if (!C18070vi.A18(this.A01, caO.A01) || !C18070vi.A18(this.A00, caO.A00)) {
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

    public C25172CaO(C25190Cah cah, C4V c4v) {
        this.A01 = cah;
        this.A00 = c4v;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoFieldOptionalValue(wireType=");
        A10.append(this.A01);
        A10.append(", value=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
