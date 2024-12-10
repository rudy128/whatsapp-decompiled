package X;

/* renamed from: X.Abx  reason: case insensitive filesystem */
public final class C20943Abx implements AnonymousClass25D {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C20943Abx) && C18070vi.A18(this.A00, ((C20943Abx) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C20943Abx(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageIABInfo(reportedUrl=");
        return C17900vP.A0B(this.A00, A10);
    }
}
