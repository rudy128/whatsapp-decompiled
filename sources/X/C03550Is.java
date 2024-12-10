package X;

/* renamed from: X.0Is  reason: invalid class name and case insensitive filesystem */
public final class C03550Is {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C03550Is)) {
                long j = this.A02;
                C03550Is r8 = (C03550Is) obj;
                long j2 = r8.A02;
                C02540Ek r0 = C05100Qk.A06;
                if (!(j == j2 && this.A03 == r8.A03 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, AnonymousClass001.A0K(this.A00, AnonymousClass001.A0K(this.A03, AnonymousClass001.A0I(this.A02))));
    }

    public C03550Is(long j, long j2, long j3, long j4) {
        this.A02 = j;
        this.A03 = j2;
        this.A00 = j3;
        this.A01 = j4;
    }
}
