package X;

/* renamed from: X.6qa  reason: invalid class name and case insensitive filesystem */
public final class C134436qa {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134436qa) && C18070vi.A18(this.A00, ((C134436qa) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C134436qa(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BanStatusResponse(banStatus=");
        return C17900vP.A0B(this.A00, A10);
    }
}
