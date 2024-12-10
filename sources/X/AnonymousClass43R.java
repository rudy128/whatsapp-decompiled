package X;

/* renamed from: X.43R  reason: invalid class name */
public final class AnonymousClass43R extends C83304Ep {
    public String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass43R) && C18070vi.A18(this.A00, ((AnonymousClass43R) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Header(title=");
        return C17900vP.A0B(this.A00, A10);
    }
}
