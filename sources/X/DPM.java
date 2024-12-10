package X;

public final class DPM implements C28473E2o {
    public final DPJ A00;

    public DPM(DPJ dpj) {
        C18070vi.A0d(dpj, 1);
        this.A00 = dpj;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DPM) && C18070vi.A18(this.A00, ((DPM) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoNullableWireType(of=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
