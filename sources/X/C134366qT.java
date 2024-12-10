package X;

/* renamed from: X.6qT  reason: invalid class name and case insensitive filesystem */
public final class C134366qT {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134366qT) && C18070vi.A18(this.A00, ((C134366qT) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C134366qT(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImageResponse(uri=");
        return C17900vP.A0B(this.A00, A10);
    }
}
