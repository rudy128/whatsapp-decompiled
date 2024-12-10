package X;

/* renamed from: X.6Dx  reason: invalid class name and case insensitive filesystem */
public final class C120496Dx extends C123106Td {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C120496Dx) && C18070vi.A18(this.A00, ((C120496Dx) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C120496Dx(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Loading(stableId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
