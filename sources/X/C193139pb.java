package X;

/* renamed from: X.9pb  reason: invalid class name and case insensitive filesystem */
public final class C193139pb {
    public final C193149pc A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193139pb) && C18070vi.A18(this.A00, ((C193139pb) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C193139pb(C193149pc r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PasskeyCredentialId(credentialId=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
