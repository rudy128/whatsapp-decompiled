package X;

/* renamed from: X.6I9  reason: invalid class name */
public final class AnonymousClass6I9 extends C123306Tx {
    public final String A00;

    public AnonymousClass6I9(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6I9) && C18070vi.A18(this.A00, ((AnonymousClass6I9) obj).A00));
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
