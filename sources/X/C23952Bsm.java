package X;

/* renamed from: X.Bsm  reason: case insensitive filesystem */
public final class C23952Bsm extends C4U {
    public final C4Q A00;

    public C23952Bsm(C4Q c4q) {
        C18070vi.A0d(c4q, 1);
        this.A00 = c4q;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23952Bsm) && C18070vi.A18(this.A00, ((C23952Bsm) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Desc(value=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
