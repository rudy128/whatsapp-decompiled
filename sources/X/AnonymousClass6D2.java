package X;

/* renamed from: X.6D2  reason: invalid class name */
public final class AnonymousClass6D2 extends C123076Ta {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6D2) && C18070vi.A18(this.A00, ((AnonymousClass6D2) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public AnonymousClass6D2(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(error=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
