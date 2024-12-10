package X;

/* renamed from: X.A1o  reason: case insensitive filesystem */
public final class C19978A1o {
    public static final C189079iT A03 = new Object();
    public final Long A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19978A1o) {
                C19978A1o a1o = (C19978A1o) obj;
                if (!C18070vi.A18(this.A02, a1o.A02) || !C18070vi.A18(this.A01, a1o.A01) || !C18070vi.A18(this.A00, a1o.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C17880vN.A03(this.A02) + C17900vP.A00(this.A01)) * 31) + C17880vN.A02(this.A00);
    }

    public C19978A1o(Long l, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = l;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsAssetVerification(publicKey=");
        A10.append(this.A02);
        A10.append(", prevPublicKey=");
        A10.append(this.A01);
        A10.append(", prevPublicKeyExpiryTimeInMilli=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
