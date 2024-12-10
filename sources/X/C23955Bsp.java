package X;

/* renamed from: X.Bsp  reason: case insensitive filesystem */
public final class C23955Bsp extends C4U {
    public final String A00;

    public C23955Bsp(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23955Bsp) && C18070vi.A18(this.A00, ((C23955Bsp) obj).A00));
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
