package X;

public final class BR4 extends C3B {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BR4) && C18070vi.A18(this.A00, ((BR4) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public BR4(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarLoadEnd(requestId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
