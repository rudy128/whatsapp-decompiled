package X;

/* renamed from: X.6Cy  reason: invalid class name and case insensitive filesystem */
public final class C120246Cy extends AnonymousClass6TZ {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C120246Cy) && C18070vi.A18(this.A00, ((C120246Cy) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C120246Cy(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(handle=");
        return C17900vP.A0B(this.A00, A10);
    }
}
