package X;

/* renamed from: X.9AN  reason: invalid class name */
public final class AnonymousClass9AN extends C180429Mm {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass9AN) && C18070vi.A18(this.A00, ((AnonymousClass9AN) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass9AN(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(username=");
        return C17900vP.A0B(this.A00, A10);
    }
}
