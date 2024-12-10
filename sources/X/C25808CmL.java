package X;

/* renamed from: X.CmL  reason: case insensitive filesystem */
public final class C25808CmL {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25808CmL) {
                C25808CmL cmL = (C25808CmL) obj;
                if (!(Float.compare(this.A05, cmL.A05) == 0 && Float.compare(this.A00, cmL.A00) == 0 && Float.compare(this.A08, cmL.A08) == 0 && Float.compare(this.A06, cmL.A06) == 0 && Float.compare(this.A07, cmL.A07) == 0 && Float.compare(this.A01, cmL.A01) == 0 && Float.compare(this.A03, cmL.A03) == 0 && Float.compare(this.A04, cmL.A04) == 0 && Float.compare(this.A02, cmL.A02) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A05), this.A00), this.A08), this.A06), this.A07), this.A01), this.A03), this.A04), this.A02);
    }

    public C25808CmL(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.A05 = f;
        this.A00 = f2;
        this.A08 = f3;
        this.A06 = f4;
        this.A07 = f5;
        this.A01 = f6;
        this.A03 = f7;
        this.A04 = f8;
        this.A02 = f9;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SpeechIndicatorParameters(topRingAlpha=");
        A10.append(this.A05);
        A10.append(", backgroundRingAlpha=");
        A10.append(this.A00);
        A10.append(", topRingRotationAngleDiff=");
        A10.append(this.A08);
        A10.append(", topRingRotationAcceleration=");
        A10.append(this.A06);
        A10.append(", topRingRotationAccelerationFactor=");
        A10.append(this.A07);
        A10.append(", backgroundRingRotationAngleDiff=");
        A10.append(this.A01);
        A10.append(", pulseDiff=");
        A10.append(this.A03);
        A10.append(", ringWaveFactor=");
        A10.append(this.A04);
        A10.append(", gradientOffsetDiff=");
        return AnonymousClass001.A1K(A10, this.A02);
    }

    public C25808CmL() {
        this(0.5f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
    }
}
