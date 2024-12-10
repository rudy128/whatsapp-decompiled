package X;

/* renamed from: X.6zt  reason: invalid class name and case insensitive filesystem */
public final class C140066zt {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C39191sf A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C140066zt) {
                C140066zt r5 = (C140066zt) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A07 == r5.A07 && this.A03 == r5.A03 && this.A05 == r5.A05 && this.A06 == r5.A06 && this.A04 == r5.A04 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static int A00(AnonymousClass6KR r0) {
        return (r0.A0A.BTV().A00 * 2) + 1;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A04, AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass0DV.A00(((this.A02 * 31) + this.A01) * 31, this.A07) + this.A03) * 31, this.A05), this.A06)) + this.A00;
    }

    public C140066zt(C39191sf r1, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.A02 = i;
        this.A01 = i2;
        this.A07 = z;
        this.A03 = i3;
        this.A05 = z2;
        this.A06 = z3;
        this.A04 = r1;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusTileSpec(itemWidthPx=");
        A10.append(this.A02);
        A10.append(", itemHeightPx=");
        A10.append(this.A01);
        A10.append(", isSingleRow=");
        A10.append(this.A07);
        A10.append(", screenOrientation=");
        A10.append(this.A03);
        A10.append(", isEmbedded=");
        A10.append(this.A05);
        A10.append(", isGridAllowed=");
        A10.append(this.A06);
        A10.append(", profilePicSize=");
        A10.append(this.A04);
        A10.append(", gridItemsPerRow=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
