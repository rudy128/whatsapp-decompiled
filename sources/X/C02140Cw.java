package X;

/* renamed from: X.0Cw  reason: invalid class name and case insensitive filesystem */
public final class C02140Cw {
    public float A00;
    public long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C02140Cw) {
                C02140Cw r8 = (C02140Cw) obj;
                if (!(this.A01 == r8.A01 && Float.compare(this.A00, r8.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0I(this.A01) * 31, this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DataPointAtTime(time=");
        A10.append(this.A01);
        A10.append(", dataPoint=");
        return AnonymousClass001.A1K(A10, this.A00);
    }
}
