package X;

/* renamed from: X.72C  reason: invalid class name */
public final class AnonymousClass72C {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass72C) {
                AnonymousClass72C r5 = (AnonymousClass72C) obj;
                if (!(this.A06 == r5.A06 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A07 == r5.A07 && this.A02 == r5.A02 && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(AnonymousClass735 r9, AnonymousClass72C r10, int i, boolean z, boolean z2) {
        AnonymousClass735.A01(r9, new AnonymousClass72C(i, z, z2, r10.A07, r10.A02, r10.A03, r10.A04, r10.A05));
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass3MX.A03(this.A06) + this.A00) * 31, this.A01), this.A07), this.A02), this.A03), this.A04), this.A05);
    }

    public AnonymousClass72C(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A06 = z;
        this.A00 = i;
        this.A01 = z2;
        this.A07 = z3;
        this.A02 = z4;
        this.A03 = z5;
        this.A04 = z6;
        this.A05 = z7;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallTooltipInternalState(isPictureInPicture=");
        A10.append(this.A06);
        A10.append(", deviceOrientation=");
        A10.append(this.A00);
        A10.append(", callControlsAreVisible=");
        A10.append(this.A01);
        A10.append(", isScreenShareButtonVisibleAndEnabled=");
        A10.append(this.A07);
        A10.append(", canShowMoreMenuTooltip=");
        A10.append(this.A02);
        A10.append(", isAddParticipantsButtonVisibleAndEnabled=");
        A10.append(this.A03);
        A10.append(", isArEffectsButtonVisibleAndEnabled=");
        A10.append(this.A04);
        A10.append(", isArEffectsPipButtonVisibleAndEnabled=");
        return C17900vP.A0F(A10, this.A05);
    }

    public AnonymousClass72C() {
        this(0, false, true, false, false, false, false, false);
    }
}
