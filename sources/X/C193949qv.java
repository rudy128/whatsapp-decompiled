package X;

/* renamed from: X.9qv  reason: invalid class name and case insensitive filesystem */
public final class C193949qv {
    public final C193139pb A00;
    public final B5O A01;

    public C193949qv(C193139pb r2, B5O b5o) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = b5o;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193949qv) {
                C193949qv r5 = (C193949qv) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PasskeyCreateResult(credentialId=");
        A10.append(this.A00);
        A10.append(", prfOutput=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
