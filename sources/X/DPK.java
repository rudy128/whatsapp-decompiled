package X;

public final class DPK implements C28473E2o {
    public final DPJ A00;

    public DPK(DPJ dpj) {
        C18070vi.A0d(dpj, 1);
        this.A00 = dpj;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DPK) && C18070vi.A18(this.A00, ((DPK) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoArrayWireType(of=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
