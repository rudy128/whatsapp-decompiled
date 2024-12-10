package X;

/* renamed from: X.2lY  reason: invalid class name and case insensitive filesystem */
public final class C58972lY {
    public final long A00;
    public final DSQ A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C58972lY) {
                C58972lY r8 = (C58972lY) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0I(this.A00) * 31);
    }

    public C58972lY(DSQ dsq, long j) {
        this.A00 = j;
        this.A01 = dsq;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ClientSecretKeyHolder(keyId=");
        A10.append(this.A00);
        A10.append(", secretKey=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
