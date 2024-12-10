package X;

/* renamed from: X.970  reason: invalid class name */
public final class AnonymousClass970 extends C180319Mb {
    public final String A00;

    public AnonymousClass970(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass970) && C18070vi.A18(this.A00, ((AnonymousClass970) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(reason=");
        return C17900vP.A0B(this.A00, A10);
    }
}
