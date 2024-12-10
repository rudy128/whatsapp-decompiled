package X;

/* renamed from: X.9tG  reason: invalid class name and case insensitive filesystem */
public final class C195389tG {
    public final BCV A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195389tG) {
                C195389tG r5 = (C195389tG) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || this.A05 != r5.A05 || !C18070vi.A18(this.A00, r5.A00) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((AnonymousClass0DV.A00((C17890vO.A02(this.A02, C17880vN.A03(this.A01)) + C17900vP.A00(this.A03)) * 31, this.A05) + C17880vN.A02(this.A00)) * 31, this.A04);
    }

    public C195389tG(BCV bcv, String str, String str2, String str3, boolean z, boolean z2) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = z;
        this.A00 = bcv;
        this.A04 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PslDownloadData(flowId=");
        A10.append(this.A01);
        A10.append(", pslCdnUrl=");
        A10.append(this.A02);
        A10.append(", pslSignature=");
        A10.append(this.A03);
        A10.append(", isDraft=");
        A10.append(this.A05);
        A10.append(", fetchAssetCallback=");
        A10.append(this.A00);
        A10.append(", endMarkerWhenDownloadComplete=");
        return C17900vP.A0F(A10, this.A04);
    }
}
