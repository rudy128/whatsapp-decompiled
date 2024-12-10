package X;

/* renamed from: X.6EJ  reason: invalid class name */
public final class AnonymousClass6EJ extends C123136Tg {
    public final Exception A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6EJ) && C18070vi.A18(this.A00, ((AnonymousClass6EJ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6EJ(Exception exc) {
        this.A00 = exc;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(error=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
