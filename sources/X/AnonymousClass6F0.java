package X;

/* renamed from: X.6F0  reason: invalid class name */
public final class AnonymousClass6F0 extends C123176Tk {
    public final Exception A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6F0) && C18070vi.A18(this.A00, ((AnonymousClass6F0) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6F0(Exception exc) {
        this.A00 = exc;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(exception=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
