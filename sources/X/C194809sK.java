package X;

/* renamed from: X.9sK  reason: invalid class name and case insensitive filesystem */
public final class C194809sK {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194809sK) {
                C194809sK r5 = (C194809sK) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C17890vO.A02(this.A03, C17900vP.A00(this.A00) * 31) + C17900vP.A00(this.A01)) * 31) + C108955ca.A06(this.A02);
    }

    public C194809sK(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SignedUserInfo(phoneNumber=");
        A10.append(this.A00);
        A10.append(", ttlTimestamp=");
        A10.append(this.A03);
        A10.append(", phoneNumberSignature=");
        A10.append(this.A01);
        A10.append(", postcode=");
        return C17900vP.A0B(this.A02, A10);
    }
}
