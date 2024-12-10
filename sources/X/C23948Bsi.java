package X;

/* renamed from: X.Bsi  reason: case insensitive filesystem */
public final class C23948Bsi extends C4T {
    public final DPJ A00;

    public C23948Bsi(DPJ dpj) {
        C18070vi.A0d(dpj, 1);
        this.A00 = dpj;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23948Bsi) && C18070vi.A18(this.A00, ((C23948Bsi) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Some(wireType=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
