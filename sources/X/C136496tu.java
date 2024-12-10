package X;

/* renamed from: X.6tu  reason: invalid class name and case insensitive filesystem */
public final class C136496tu {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136496tu) {
                C136496tu r5 = (C136496tu) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A04 == r5.A04 && this.A08 == r5.A08 && this.A05 == r5.A05 && this.A03 == r5.A03 && this.A07 == r5.A07 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(((this.A00 * 31) + this.A01) * 31, this.A02), this.A04), this.A08), this.A05), this.A03), this.A07), this.A06);
    }

    public C136496tu(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = z;
        this.A04 = z2;
        this.A08 = z3;
        this.A05 = z4;
        this.A03 = z5;
        this.A07 = z6;
        this.A06 = z7;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaSentLogData(mediaType=");
        A10.append(this.A00);
        A10.append(", origin=");
        A10.append(this.A01);
        A10.append(", isChat=");
        A10.append(this.A02);
        A10.append(", isGroup=");
        A10.append(this.A04);
        A10.append(", isStatus=");
        A10.append(this.A08);
        A10.append(", isLargeDoc=");
        A10.append(this.A05);
        A10.append(", isCommunity=");
        A10.append(this.A03);
        A10.append(", isOriginalQuality=");
        A10.append(this.A07);
        A10.append(", isMediaAsDoc=");
        return C17900vP.A0F(A10, this.A06);
    }
}
