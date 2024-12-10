package X;

/* renamed from: X.0Iv  reason: invalid class name and case insensitive filesystem */
public final class C03580Iv {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C03580Iv)) {
                long j = this.A01;
                C03580Iv r8 = (C03580Iv) obj;
                long j2 = r8.A01;
                C02540Ek r0 = C05100Qk.A06;
                if (!(j == j2 && this.A03 == r8.A03 && this.A02 == r8.A02 && this.A04 == r8.A04 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass001.A0K(this.A04, AnonymousClass001.A0K(this.A02, AnonymousClass001.A0K(this.A03, AnonymousClass001.A0I(this.A01)))));
    }

    public C03580Iv(long j, long j2, long j3, long j4, long j5) {
        this.A01 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A04 = j4;
        this.A00 = j5;
    }
}
