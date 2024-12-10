package X;

public final class DPL implements C28473E2o {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DPL) && this.A00 == ((DPL) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public DPL(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoFixedWireType(length=");
        return C17900vP.A0E(A10, this.A00);
    }
}
