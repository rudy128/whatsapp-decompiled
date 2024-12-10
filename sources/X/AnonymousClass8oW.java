package X;

/* renamed from: X.8oW  reason: invalid class name */
public final class AnonymousClass8oW extends AnonymousClass9MG {
    public final AnonymousClass1D6 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8oW) && C18070vi.A18(this.A00, ((AnonymousClass8oW) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass8oW(AnonymousClass1D6 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(value=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
