package X;

/* renamed from: X.CaM  reason: case insensitive filesystem */
public final class C25170CaM {
    public final DPN A00;
    public final C4U A01;

    public C25170CaM(DPN dpn, C4U c4u) {
        C18070vi.A0d(c4u, 2);
        this.A00 = dpn;
        this.A01 = c4u;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25170CaM) {
                C25170CaM caM = (C25170CaM) obj;
                if (!C18070vi.A18(this.A00, caM.A00) || !C18070vi.A18(this.A01, caM.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoBlockValue(wireType=");
        A10.append(this.A00);
        A10.append(", value=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
