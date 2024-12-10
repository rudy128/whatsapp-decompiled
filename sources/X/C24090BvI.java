package X;

/* renamed from: X.BvI  reason: case insensitive filesystem */
public final class C24090BvI extends C24441C4b {
    public final String A00;

    public C24090BvI(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C24090BvI) && C18070vi.A18(this.A00, ((C24090BvI) obj).A00));
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
