package X;

/* renamed from: X.6td  reason: invalid class name and case insensitive filesystem */
public final class C136326td {
    public final AnonymousClass77S A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136326td) {
                C136326td r5 = (C136326td) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A02, C17890vO.A02(this.A03, (((AnonymousClass000.A0L(this.A00) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A01)) * 31)) + C108955ca.A06(this.A05);
    }

    public C136326td(AnonymousClass77S r1, String str, String str2, String str3, String str4, String str5) {
        this.A00 = r1;
        this.A04 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A05 = str5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyCrosspostRequestPayload(enforcedEncryptedUniqueId=");
        A10.append(this.A00);
        A10.append(", message=");
        A10.append(this.A04);
        A10.append(", linkUrl=");
        A10.append(this.A01);
        A10.append(", mediaType=");
        A10.append(this.A03);
        A10.append(", mediaEverstoreDirectPath=");
        A10.append(this.A02);
        A10.append(", musicContentMediaId=");
        return C17900vP.A0B(this.A05, A10);
    }
}
