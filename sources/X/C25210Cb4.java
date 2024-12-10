package X;

/* renamed from: X.Cb4  reason: case insensitive filesystem */
public final class C25210Cb4 {
    public final float A00;
    public final boolean A01;
    public final boolean A02;
    public final float A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25210Cb4) {
                C25210Cb4 cb4 = (C25210Cb4) obj;
                if (!(this.A02 == cb4.A02 && this.A01 == cb4.A01 && Float.compare(this.A00, cb4.A00) == 0 && Float.compare(this.A03, cb4.A03) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A02), this.A01), this.A00), this.A03);
    }

    public C25210Cb4(float f, float f2, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = f;
        this.A03 = f2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RedactionInfo(redactionsWereApplied=");
        A10.append(this.A02);
        A10.append(", isLowQuality=");
        A10.append(this.A01);
        A10.append(", redactedPercent=");
        A10.append(this.A00);
        A10.append(", averageSegmentConfidence=");
        return AnonymousClass001.A1K(A10, this.A03);
    }
}
