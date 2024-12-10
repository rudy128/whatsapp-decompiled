package X;

/* renamed from: X.6Dt  reason: invalid class name and case insensitive filesystem */
public final class C120456Dt extends C123096Tc {
    public final String A00;

    public C120456Dt(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C120456Dt) && C18070vi.A18(this.A00, ((C120456Dt) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SearchQuery(query=");
        return C17900vP.A0B(this.A00, A10);
    }
}
