package X;

/* renamed from: X.6N6  reason: invalid class name */
public final class AnonymousClass6N6 extends AnonymousClass6U4 {
    public final Exception A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6N6) && C18070vi.A18(this.A00, ((AnonymousClass6N6) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6N6(Exception exc) {
        this.A00 = exc;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnknownError(error=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
