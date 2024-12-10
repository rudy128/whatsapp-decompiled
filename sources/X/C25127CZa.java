package X;

/* renamed from: X.CZa  reason: case insensitive filesystem */
public final class C25127CZa {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C25127CZa) && C18070vi.A18(this.A00, ((C25127CZa) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C25127CZa(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UrlAnnotation(url=");
        return C17900vP.A0B(this.A00, A10);
    }
}
