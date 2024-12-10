package X;

/* renamed from: X.9pJ  reason: invalid class name and case insensitive filesystem */
public final class C192959pJ {
    public final A22 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C192959pJ) && C18070vi.A18(this.A00, ((C192959pJ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C192959pJ(A22 a22) {
        this.A00 = a22;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArdGetModelMetadataEntity(aimModelBatchedManifest=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
