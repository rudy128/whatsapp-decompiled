package X;

/* renamed from: X.8wM  reason: invalid class name and case insensitive filesystem */
public final class C174178wM extends C174358we {
    public final AF1 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C174178wM) && C18070vi.A18(this.A00, ((C174178wM) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C174178wM(AF1 af1) {
        super(75);
        this.A00 = af1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MapViewBusinessShimmerItem(tag=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
