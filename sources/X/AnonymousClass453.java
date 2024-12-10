package X;

/* renamed from: X.453  reason: invalid class name */
public final class AnonymousClass453 extends C83344Et {
    public final AnonymousClass443 A00;

    public AnonymousClass453(AnonymousClass443 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass453) && C18070vi.A18(this.A00, ((AnonymousClass453) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Suspension(enforcement=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
