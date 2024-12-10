package X;

public final class BR3 extends C3B {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BR3) && C18070vi.A18(this.A00, ((BR3) obj).A00));
    }

    public int hashCode() {
        return C17880vN.A03(this.A00) + 1231;
    }

    public BR3(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarGenerationStart(requestId=");
        A10.append(this.A00);
        A10.append(", showLoader=");
        return C17900vP.A0F(A10, true);
    }
}
