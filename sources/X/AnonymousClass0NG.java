package X;

/* renamed from: X.0NG  reason: invalid class name */
public final class AnonymousClass0NG {
    public static final AnonymousClass0NG A03 = new AnonymousClass0NG(0.0f, 4278190080L << 32, AnonymousClass0QY.A03);
    public final float A00;
    public final long A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0NG) {
                long j = this.A01;
                AnonymousClass0NG r9 = (AnonymousClass0NG) obj;
                long j2 = r9.A01;
                C02540Ek r0 = C05100Qk.A06;
                if (j == j2) {
                    long j3 = this.A02;
                    long j4 = r9.A02;
                    long j5 = AnonymousClass0QY.A03;
                    if (!(j3 == j4 && this.A00 == r9.A00)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0I = AnonymousClass001.A0I(this.A01);
        long j = this.A02;
        long j2 = AnonymousClass0QY.A03;
        return AnonymousClass000.A0C(AnonymousClass001.A0K(j, A0I), this.A00);
    }

    public AnonymousClass0NG(float f, long j, long j2) {
        this.A01 = j;
        this.A02 = j2;
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Shadow(color=");
        AnonymousClass000.A1F(A10, this.A01);
        A10.append(", offset=");
        A10.append(AnonymousClass0QY.A06(this.A02));
        A10.append(", blurRadius=");
        return AnonymousClass001.A1K(A10, this.A00);
    }

    static {
        C02540Ek r0 = C05100Qk.A06;
    }
}
