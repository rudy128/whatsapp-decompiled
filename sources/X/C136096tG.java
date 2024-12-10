package X;

/* renamed from: X.6tG  reason: invalid class name and case insensitive filesystem */
public final class C136096tG {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136096tG) {
                C136096tG r5 = (C136096tG) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((C17900vP.A00(this.A03) * 31) + C17900vP.A00(this.A01)) * 31) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A04)) * 31) + C108955ca.A06(this.A00);
    }

    public C136096tG(String str, String str2, String str3, String str4, String str5) {
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A00 = str5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FdsAdoptionViewerQuery(owningComponent=");
        A10.append(this.A03);
        A10.append(", leaf=");
        A10.append(this.A01);
        A10.append(", leafViewBoundsOnScreen=");
        A10.append(this.A02);
        A10.append(", rootViewBoundsOnScreen=");
        A10.append(this.A04);
        A10.append(", designSystem=");
        return C17900vP.A0B(this.A00, A10);
    }
}
