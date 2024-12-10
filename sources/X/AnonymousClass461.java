package X;

/* renamed from: X.461  reason: invalid class name */
public final class AnonymousClass461 extends AnonymousClass4F1 {
    public final AnonymousClass6SM A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass461) && C18070vi.A18(this.A00, ((AnonymousClass461) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass461(AnonymousClass6SM r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(error=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
