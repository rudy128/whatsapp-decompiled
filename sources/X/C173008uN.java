package X;

/* renamed from: X.8uN  reason: invalid class name and case insensitive filesystem */
public final class C173008uN extends C180759Nu {
    public final String A00;

    public C173008uN(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C173008uN) && C18070vi.A18(this.A00, ((C173008uN) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("String(value=");
        return C17900vP.A0B(this.A00, A10);
    }
}
