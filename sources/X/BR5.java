package X;

public final class BR5 extends C3B {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BR5) && C18070vi.A18(this.A00, ((BR5) obj).A00));
    }

    public int hashCode() {
        return C17880vN.A03(this.A00) + 1231;
    }

    public BR5(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarLoadStart(requestId=");
        A10.append(this.A00);
        A10.append(", showLoader=");
        return C17900vP.A0F(A10, true);
    }
}
