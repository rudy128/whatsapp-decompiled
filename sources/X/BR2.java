package X;

public final class BR2 extends C3B {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BR2) && C18070vi.A18(this.A00, ((BR2) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public BR2(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarColorRampGenerationStart(requestId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
