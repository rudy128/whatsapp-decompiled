package X;

/* renamed from: X.2Dn  reason: invalid class name and case insensitive filesystem */
public final class C46192Dn extends C49652Ri {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C46192Dn) && C18070vi.A18(this.A00, ((C46192Dn) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C46192Dn(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(result=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
