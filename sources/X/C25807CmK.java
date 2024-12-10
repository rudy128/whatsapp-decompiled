package X;

/* renamed from: X.CmK  reason: case insensitive filesystem */
public final class C25807CmK {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25807CmK) {
                C25807CmK cmK = (C25807CmK) obj;
                if (!(this.A05 == cmK.A05 && this.A06 == cmK.A06 && this.A07 == cmK.A07 && this.A01 == cmK.A01 && this.A00 == cmK.A00 && this.A02 == cmK.A02 && this.A03 == cmK.A03 && this.A04 == cmK.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00((((((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A05), this.A06), this.A07) + this.A01) * 31) + this.A00) * 31) + this.A02) * 31, this.A03), this.A04);
    }

    public C25807CmK(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A03 = z4;
        this.A04 = z5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RichTextFormatConfig(isBotMessage=");
        A10.append(this.A05);
        A10.append(", shouldShowHeader=");
        A10.append(this.A06);
        A10.append(", shouldShowNestedList=");
        A10.append(this.A07);
        A10.append(", quotedFormattingTextColor=");
        A10.append(this.A01);
        A10.append(", inlineCodeBgColor=");
        A10.append(this.A00);
        A10.append(", richTextFormatHeaderSize=");
        A10.append(this.A02);
        A10.append(", forEditing=");
        A10.append(this.A03);
        A10.append(", inlineCitationEnabled=");
        return C17900vP.A0F(A10, this.A04);
    }

    public C25807CmK() {
        this(0, 0, 0, false, false, false, false, false);
    }
}
