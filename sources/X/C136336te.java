package X;

/* renamed from: X.6te  reason: invalid class name and case insensitive filesystem */
public final class C136336te {
    public final int A00;
    public final int A01;
    public final long A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136336te) {
                C136336te r8 = (C136336te) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00 && this.A03 == r8.A03 && this.A04 == r8.A04 && this.A02 == r8.A02 && this.A06 == r8.A06 && this.A05 == r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass001.A0K(this.A02, AnonymousClass0DV.A00(AnonymousClass0DV.A00(((this.A01 * 31) + this.A00) * 31, this.A03), this.A04)), this.A06), this.A05) + 1231;
    }

    public C136336te(int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = j;
        this.A06 = z3;
        this.A05 = z4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NetworkHealthEvent(previousState=");
        A10.append(this.A01);
        A10.append(", currentState=");
        A10.append(this.A00);
        A10.append(", shouldPlaySoundAlert=");
        A10.append(this.A03);
        A10.append(", shouldShowBannerSubtitle=");
        A10.append(this.A04);
        A10.append(", maxBannerDurationMs=");
        A10.append(this.A02);
        A10.append(", shouldShowPoorNetworkBanner=");
        A10.append(this.A06);
        A10.append(", shouldShowNoNetworkBanner=");
        A10.append(this.A05);
        A10.append(", isVersion2=");
        return C17900vP.A0F(A10, true);
    }
}
