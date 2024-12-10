package X;

/* renamed from: X.6sN  reason: invalid class name and case insensitive filesystem */
public final class C135546sN {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135546sN) {
                C135546sN r5 = (C135546sN) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17890vO.A02(this.A00, C17880vN.A03(this.A02)));
    }

    public C135546sN(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UCOffersAndAnnouncementsConfig(fragmentTitle=");
        A10.append(this.A02);
        A10.append(", fragmentDesc=");
        A10.append(this.A00);
        A10.append(", fragmentSubmitCTAText=");
        return C17900vP.A0B(this.A01, A10);
    }
}
