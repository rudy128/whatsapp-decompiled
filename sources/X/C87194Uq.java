package X;

/* renamed from: X.4Uq  reason: invalid class name and case insensitive filesystem */
public final class C87194Uq {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C87194Uq(String str, String str2, String str3, String str4, int i) {
        C18070vi.A0d(str, 2);
        this.A00 = i;
        this.A01 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87194Uq) {
                C87194Uq r5 = (C87194Uq) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C17890vO.A02(this.A01, this.A00 * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A02)) * 31) + C108955ca.A06(this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TapTargetConfiguration(buttonIndex=");
        A10.append(this.A00);
        A10.append(", canonicalUrl=");
        A10.append(this.A01);
        A10.append(", title=");
        A10.append(this.A04);
        A10.append(", description=");
        A10.append(this.A02);
        A10.append(", domain=");
        return C17900vP.A0B(this.A03, A10);
    }
}
