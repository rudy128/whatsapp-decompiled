package X;

/* renamed from: X.2lI  reason: invalid class name and case insensitive filesystem */
public final class C58812lI {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C58812lI) && C18070vi.A18(this.A00, ((C58812lI) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C58812lI(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrivacyRequest(setting=");
        return C17900vP.A0B(this.A00, A10);
    }
}
