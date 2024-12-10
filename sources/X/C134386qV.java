package X;

/* renamed from: X.6qV  reason: invalid class name and case insensitive filesystem */
public final class C134386qV {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134386qV) && C18070vi.A18(this.A00, ((C134386qV) obj).A00));
    }

    public int hashCode() {
        return C17900vP.A00(this.A00);
    }

    public C134386qV(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImagineContent(uri=");
        return C17900vP.A0B(this.A00, A10);
    }
}
