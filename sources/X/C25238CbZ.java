package X;

/* renamed from: X.CbZ  reason: case insensitive filesystem */
public final class C25238CbZ {
    public int A00;
    public int A01;
    public E41 A02;
    public C24275ByY A03;
    public Integer A04;
    public String A05 = "WA_MEDIA";
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final D43 A0A;
    public final C26551D3p A0B;
    public final D47 A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C25238CbZ(D43 d43, C24275ByY byY, C26551D3p d3p, D47 d47, Integer num, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A0C = d47;
        this.A03 = byY;
        this.A01 = i;
        this.A04 = num;
        this.A0B = d3p;
        this.A06 = "";
        this.A0A = d43;
        this.A0D = z;
        this.A0E = z2;
        this.A08 = z3;
        this.A00 = i2;
        this.A09 = z4;
        this.A07 = z5;
    }

    public boolean A00() {
        return AnonymousClass000.A1Z(this.A0C.A07, AnonymousClass00R.A01);
    }

    public boolean equals(Object obj) {
        D47 d47 = this.A0C;
        if (d47.A0H == null || !(obj instanceof C25238CbZ) || !d47.equals(((C25238CbZ) obj).A0C)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A0C);
    }
}
