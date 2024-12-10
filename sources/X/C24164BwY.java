package X;

/* renamed from: X.BwY  reason: case insensitive filesystem */
public final class C24164BwY extends C24443C4d {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24164BwY) {
                C24164BwY bwY = (C24164BwY) obj;
                if (!C18070vi.A18(this.A01, bwY.A01) || !C18070vi.A18(this.A00, bwY.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + C17900vP.A00(this.A00);
    }

    public C24164BwY(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(phoneNumber=");
        A10.append(C29361c9.A0Z(this.A01, 4));
        A10.append(", openOnPhoneNonce=");
        String str2 = this.A00;
        if (str2 != null) {
            str = C29361c9.A0Z(str2, 4);
        } else {
            str = null;
        }
        return C17900vP.A0B(str, A10);
    }
}
