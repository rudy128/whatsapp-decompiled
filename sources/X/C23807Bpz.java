package X;

/* renamed from: X.Bpz  reason: case insensitive filesystem */
public final class C23807Bpz extends C25621Cj1 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final float A0G;
    public final float A0H;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23807Bpz) {
                C23807Bpz bpz = (C23807Bpz) obj;
                if (!(Float.compare(this.A0F, bpz.A0F) == 0 && Float.compare(this.A08, bpz.A08) == 0 && Float.compare(this.A0E, bpz.A0E) == 0 && Float.compare(this.A01, bpz.A01) == 0 && Float.compare(this.A00, bpz.A00) == 0 && Float.compare(this.A02, bpz.A02) == 0 && Float.compare(this.A0G, bpz.A0G) == 0 && Float.compare(this.A0H, bpz.A0H) == 0 && Float.compare(this.A06, bpz.A06) == 0 && Float.compare(this.A07, bpz.A07) == 0 && Float.compare(this.A0D, bpz.A0D) == 0 && Float.compare(this.A09, bpz.A09) == 0 && Float.compare(this.A0A, bpz.A0A) == 0 && Float.compare(this.A0C, bpz.A0C) == 0 && Float.compare(this.A0B, bpz.A0B) == 0 && Float.compare(this.A05, bpz.A05) == 0 && Float.compare(this.A03, bpz.A03) == 0 && Float.compare(this.A04, bpz.A04) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A0F), this.A08), this.A0E), this.A01), this.A00), this.A02), this.A0G), this.A0H), this.A06), this.A07), this.A0D), this.A09), this.A0A), this.A0C), this.A0B), this.A05), this.A03), this.A04);
    }

    public C23807Bpz(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        super(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14);
        this.A0F = f;
        this.A08 = f2;
        this.A0E = f3;
        this.A01 = f4;
        this.A00 = f5;
        this.A02 = f6;
        this.A0G = f7;
        this.A0H = f8;
        this.A06 = f9;
        this.A07 = f10;
        this.A0D = f11;
        this.A09 = f12;
        this.A0A = f13;
        this.A0C = f14;
        this.A0B = f15;
        this.A05 = f16;
        this.A03 = f17;
        this.A04 = f18;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NormalBubbleSpec(top=");
        A10.append(this.A0F);
        A10.append(", left=");
        A10.append(this.A08);
        A10.append(", shadowSize=");
        A10.append(this.A0E);
        A10.append(", bubbleWidth=");
        A10.append(this.A01);
        A10.append(", bubbleHeight=");
        A10.append(this.A00);
        A10.append(", cornerRadius=");
        A10.append(this.A02);
        A10.append(", verticalStretchStartY=");
        A10.append(this.A0G);
        A10.append(", verticalStretchStopY=");
        A10.append(this.A0H);
        A10.append(", horizontalStretchStartX=");
        A10.append(this.A06);
        A10.append(", horizontalStretchStopX=");
        A10.append(this.A07);
        A10.append(", ninePatchTopPadding=");
        A10.append(this.A0D);
        A10.append(", ninePatchBottomPadding=");
        A10.append(this.A09);
        A10.append(", ninePatchLeftPadding=");
        A10.append(this.A0A);
        A10.append(", ninePatchRightPadding=");
        A10.append(this.A0C);
        A10.append(", ninePatchPadding=");
        A10.append(this.A0B);
        A10.append(", handleWidth=");
        A10.append(this.A05);
        A10.append(", handleHeight=");
        A10.append(this.A03);
        A10.append(", handleTopRoundedCornerRadius=");
        return AnonymousClass001.A1K(A10, this.A04);
    }
}
