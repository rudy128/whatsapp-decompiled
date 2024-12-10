package X;

/* renamed from: X.6qN  reason: invalid class name and case insensitive filesystem */
public final class C134306qN {
    public final String A00;

    public C134306qN(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134306qN) && C18070vi.A18(this.A00, ((C134306qN) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Key(query=");
        return C17900vP.A0B(this.A00, A10);
    }
}
