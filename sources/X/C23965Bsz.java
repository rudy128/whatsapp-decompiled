package X;

/* renamed from: X.Bsz  reason: case insensitive filesystem */
public final class C23965Bsz extends C4V {
    public final C25170CaM A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23965Bsz) && C18070vi.A18(this.A00, ((C23965Bsz) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23965Bsz(C25170CaM caM) {
        this.A00 = caM;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Block(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
