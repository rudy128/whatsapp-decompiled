package X;

/* renamed from: X.971  reason: invalid class name */
public final class AnonymousClass971 extends C180319Mb {
    public final C107855aj A00;

    public AnonymousClass971(C107855aj r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass971) && C18070vi.A18(this.A00, ((AnonymousClass971) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(arEffect=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
