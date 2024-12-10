package X;

/* renamed from: X.6t3  reason: invalid class name and case insensitive filesystem */
public final class C135966t3 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135966t3) {
                C135966t3 r5 = (C135966t3) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A04 == r5.A04 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.A03 * 31) + this.A02) * 31) + this.A00) * 31) + this.A04) * 31) + this.A01;
    }

    public C135966t3(int i, int i2, int i3, int i4, int i5) {
        this.A03 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A04 = i4;
        this.A01 = i5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TranscriptionSegment(substringStart=");
        A10.append(this.A03);
        A10.append(", substringLength=");
        A10.append(this.A02);
        A10.append(", confidence=");
        A10.append(this.A00);
        A10.append(", timestamp=");
        A10.append(this.A04);
        A10.append(", duration=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
