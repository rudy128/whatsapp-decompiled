package X;

/* renamed from: X.4Yl  reason: invalid class name and case insensitive filesystem */
public final class C88134Yl {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C88134Yl() {
        this(0, 0, false, true, false, false, false, false, false, false, true, false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88134Yl) {
                C88134Yl r5 = (C88134Yl) obj;
                if (!(this.A0B == r5.A0B && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A07 == r5.A07 && this.A08 == r5.A08 && this.A0A == r5.A0A && this.A09 == r5.A09 && this.A05 == r5.A05 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        if (!this.A04) {
            return 0;
        }
        if (this.A0A) {
            return 2;
        }
        if (this.A03 && this.A00 == 0) {
            return 1;
        }
        if (!this.A02 || this.A00 != 1) {
            return 0;
        }
        return 1;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A0B), this.A04), this.A03), this.A02) + this.A00) * 31) + this.A01) * 31, this.A07), this.A08), this.A0A), this.A09), this.A05), this.A06);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("State(toolTipVisible=");
        A10.append(this.A0B);
        A10.append(", entryIsBlank=");
        A10.append(this.A04);
        A10.append(", canSendVoiceMessages=");
        A10.append(this.A03);
        A10.append(", canSendPushToVideoMessages=");
        A10.append(this.A02);
        A10.append(", recorderMode=");
        A10.append(this.A00);
        A10.append(", toolTipType=");
        A10.append(this.A01);
        A10.append(", isPushToVideoNuxEnabled=");
        A10.append(this.A07);
        A10.append(", isRecorderModeMenuVisible=");
        A10.append(this.A08);
        A10.append(", shouldShowMetaAiVoiceButton=");
        A10.append(this.A0A);
        A10.append(", keyboardVisibility=");
        A10.append(this.A09);
        A10.append(", isAiVoiceButtonEnabled=");
        A10.append(this.A05);
        A10.append(", isBotChat=");
        return C17900vP.A0F(A10, this.A06);
    }

    public C88134Yl(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A0B = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A02 = z4;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = z5;
        this.A08 = z6;
        this.A0A = z7;
        this.A09 = z8;
        this.A05 = z9;
        this.A06 = z10;
    }
}
