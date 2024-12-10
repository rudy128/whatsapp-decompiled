package X;

public final class DPS implements C28473E2o {
    public final DVO A00 = new DVO();

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DPS) && C18070vi.A18(this.A00, ((DPS) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public /* synthetic */ DPS(DVO dvo, AnonymousClass1Y1 r3, int i) {
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoRecordWireType(fields=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public DPS() {
    }
}
