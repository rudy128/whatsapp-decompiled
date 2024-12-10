package X;

/* renamed from: X.Cb2  reason: case insensitive filesystem */
public final class C25208Cb2 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public C25208Cb2(String str, String str2, boolean z) {
        String A0A;
        C18070vi.A0e(str, 1, str2);
        if (!z || str2.length() <= 0) {
            A0A = C17900vP.A0A("wa.me/", str);
        } else {
            A0A = C17890vO.A0Z(str2, AnonymousClass8BW.A0o("wa.me/", str), '#');
        }
        boolean A1R = AnonymousClass000.A1R(str2.length());
        C18070vi.A0d(A0A, 1);
        this.A01 = A0A;
        this.A02 = A1R;
        this.A03 = z;
        this.A00 = AnonymousClass001.A1H("https://", A0A, AnonymousClass000.A10());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25208Cb2) {
                C25208Cb2 cb2 = (C25208Cb2) obj;
                if (!(C18070vi.A18(this.A01, cb2.A01) && this.A02 == cb2.A02 && this.A03 == cb2.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(C17880vN.A03(this.A01), this.A02), this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UsernameShareViewState(waMeUrl=");
        A10.append(this.A01);
        A10.append(", hasPin=");
        A10.append(this.A02);
        A10.append(", includeUsernamePin=");
        return C17900vP.A0F(A10, this.A03);
    }
}
