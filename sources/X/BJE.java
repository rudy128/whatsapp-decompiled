package X;

public final class BJE extends C24418C2r {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BJE) && C18070vi.A18(this.A00, ((BJE) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public BJE(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerbatimTtsAnnotation(verbatim=");
        return C17900vP.A0B(this.A00, A10);
    }
}
