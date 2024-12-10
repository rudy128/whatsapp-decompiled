package X;

/* renamed from: X.4Sl  reason: invalid class name and case insensitive filesystem */
public final class C86644Sl {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86644Sl) && C18070vi.A18(this.A00, ((C86644Sl) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C86644Sl(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CTWAVideoContent(url=");
        return C17900vP.A0B(this.A00, A10);
    }
}
