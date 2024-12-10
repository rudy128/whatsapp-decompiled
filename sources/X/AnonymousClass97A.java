package X;

/* renamed from: X.97A  reason: invalid class name */
public final class AnonymousClass97A extends C180349Me {
    public final String A00;

    public AnonymousClass97A(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass97A) && C18070vi.A18(this.A00, ((AnonymousClass97A) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(error=");
        return C17900vP.A0B(this.A00, A10);
    }
}
