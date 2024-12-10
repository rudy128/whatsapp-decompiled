package X;

/* renamed from: X.0Ir  reason: invalid class name and case insensitive filesystem */
public final class C03540Ir {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C03540Ir)) {
                long j = this.A00;
                C03540Ir r8 = (C03540Ir) obj;
                long j2 = r8.A00;
                C02540Ek r0 = C05100Qk.A06;
                if (!(j == j2 && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A03 == r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A03, AnonymousClass001.A0K(this.A02, AnonymousClass001.A0K(this.A01, AnonymousClass001.A0I(this.A00))));
    }

    public C03540Ir(long j, long j2, long j3, long j4) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A03 = j4;
    }
}
