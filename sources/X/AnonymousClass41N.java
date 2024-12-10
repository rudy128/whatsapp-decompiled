package X;

/* renamed from: X.41N  reason: invalid class name */
public final class AnonymousClass41N extends C83194Ee {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass41N) && C18070vi.A18(this.A00, ((AnonymousClass41N) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass41N(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(errorMessage=");
        return C17900vP.A0B(this.A00, A10);
    }
}
