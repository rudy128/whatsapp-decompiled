package X;

/* renamed from: X.6tk  reason: invalid class name and case insensitive filesystem */
public final class C136396tk {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136396tk) {
                C136396tk r5 = (C136396tk) obj;
                if (!C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C17890vO.A02(this.A03, C17890vO.A02(this.A02, C17880vN.A03(this.A06))) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A01)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C108955ca.A06(this.A05);
    }

    public C136396tk(Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A06 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A01 = str5;
        this.A00 = l;
        this.A05 = str6;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostRequestPayload(uniqueId=");
        A10.append(this.A06);
        A10.append(", mediaEverstoreDirectPath=");
        A10.append(this.A02);
        A10.append(", mediaType=");
        A10.append(this.A03);
        A10.append(", message=");
        A10.append(this.A04);
        A10.append(", linkUrl=");
        A10.append(this.A01);
        A10.append(", dispatchTimestamp=");
        A10.append(this.A00);
        A10.append(", musicContentMediaId=");
        return C17900vP.A0B(this.A05, A10);
    }
}
