package X;

/* renamed from: X.9sW  reason: invalid class name and case insensitive filesystem */
public final class C194929sW {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194929sW) {
                C194929sW r5 = (C194929sW) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C17880vN.A03(this.A02) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A01)) * 31) + C108955ca.A06(this.A00);
    }

    public C194929sW(String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = str4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PixKey(type=");
        A10.append(this.A02);
        A10.append(", value=");
        AnonymousClass8BT.A1W(A10, this.A03);
        A10.append(this.A01);
        A10.append(", credentialId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
