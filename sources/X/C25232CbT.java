package X;

/* renamed from: X.CbT  reason: case insensitive filesystem */
public final class C25232CbT {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25232CbT) {
                C25232CbT cbT = (C25232CbT) obj;
                if (!(this.A05 == cbT.A05 && this.A04 == cbT.A04 && this.A02 == cbT.A02 && this.A03 == cbT.A03 && this.A01 == cbT.A01 && this.A00 == cbT.A00 && this.A07 == cbT.A07 && this.A06 == cbT.A06 && this.A08 == cbT.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(((((((((((((((this.A05 * 31) + this.A04) * 31) + this.A02) * 31) + this.A03) * 31) + this.A01) * 31) + this.A00) * 31) + this.A07) * 31) + this.A06) * 31, this.A08);
    }

    public C25232CbT(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.A05 = i;
        this.A04 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A01 = i5;
        this.A00 = i6;
        this.A07 = i7;
        this.A06 = i8;
        this.A08 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnComputePositionInfo(screenWidth=");
        A10.append(this.A05);
        A10.append(", screenHeight=");
        A10.append(this.A04);
        A10.append(", anchorX=");
        A10.append(this.A02);
        A10.append(", anchorY=");
        A10.append(this.A03);
        A10.append(", anchorWidth=");
        A10.append(this.A01);
        A10.append(", anchorHeight=");
        A10.append(this.A00);
        A10.append(", tooltipIntrinsicWidth=");
        A10.append(this.A07);
        A10.append(", tooltipIntrinsicHeight=");
        A10.append(this.A06);
        A10.append(", isRtl=");
        return C17900vP.A0F(A10, this.A08);
    }
}
