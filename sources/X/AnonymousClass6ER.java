package X;

/* renamed from: X.6ER  reason: invalid class name */
public final class AnonymousClass6ER extends C123146Th {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6ER) && C18070vi.A18(this.A00, ((AnonymousClass6ER) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6ER(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NotAvailable(source=");
        return C17900vP.A0B(this.A00, A10);
    }
}
