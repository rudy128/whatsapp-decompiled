package X;

/* renamed from: X.07I  reason: invalid class name */
public final class AnonymousClass07I extends C03410Hz {
    public final C16340s6 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass07I) && C18070vi.A18(this.A00, ((AnonymousClass07I) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public int A00(C24246By4 by4, int i) {
        return this.A00.BBy(0, i);
    }

    public AnonymousClass07I(C16340s6 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerticalCrossAxisAlignment(vertical=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
