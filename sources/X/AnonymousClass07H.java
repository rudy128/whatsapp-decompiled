package X;

/* renamed from: X.07H  reason: invalid class name */
public final class AnonymousClass07H extends C03410Hz {
    public final C16330s5 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass07H) && C18070vi.A18(this.A00, ((AnonymousClass07H) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public int A00(C24246By4 by4, int i) {
        return this.A00.BC0(by4, 0, i);
    }

    public AnonymousClass07H(C16330s5 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HorizontalCrossAxisAlignment(horizontal=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
