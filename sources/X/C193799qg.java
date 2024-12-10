package X;

/* renamed from: X.9qg  reason: invalid class name and case insensitive filesystem */
public final class C193799qg {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193799qg) {
                C193799qg r5 = (C193799qg) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C17900vP.A00(this.A00) * 31) + C108955ca.A06(this.A01);
    }

    public C193799qg(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsEndpointPublicKey(publicKeyPem=");
        A10.append(this.A00);
        A10.append(", publicKeySignature=");
        return C17900vP.A0B(this.A01, A10);
    }
}
