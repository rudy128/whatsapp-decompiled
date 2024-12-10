package X;

/* renamed from: X.8mI  reason: invalid class name */
public final class AnonymousClass8mI extends C186649eX {
    public final C184309ak A00;

    public AnonymousClass8mI(C184309ak r2) {
        super(r2, false, false, false);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8mI) && C18070vi.A18(this.A00, ((AnonymousClass8mI) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(errorBehaviour=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
