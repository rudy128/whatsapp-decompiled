package X;

/* renamed from: X.BWi  reason: case insensitive filesystem */
public final class C22940BWi extends C3Y {
    public final C24866CNk A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C22940BWi) && C18070vi.A18(this.A00, ((C22940BWi) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C22940BWi(C24866CNk cNk) {
        this.A00 = cNk;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Metadata(metadata=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
