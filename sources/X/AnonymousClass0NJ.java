package X;

/* renamed from: X.0NJ  reason: invalid class name */
public final class AnonymousClass0NJ {
    public static final AnonymousClass0NJ A08;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0NJ) {
                AnonymousClass0NJ r9 = (AnonymousClass0NJ) obj;
                if (Float.compare(this.A01, r9.A01) == 0 && Float.compare(this.A03, r9.A03) == 0 && Float.compare(this.A02, r9.A02) == 0 && Float.compare(this.A00, r9.A00) == 0) {
                    long j = this.A06;
                    long j2 = r9.A06;
                    long j3 = C04140Lz.A00;
                    if (!(j == j2 && this.A07 == r9.A07 && this.A05 == r9.A05 && this.A04 == r9.A04)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    static {
        long j = C04140Lz.A00;
        long A0p = AnonymousClass001.A0p(AnonymousClass001.A02(j), AnonymousClass001.A01(j));
        A08 = new AnonymousClass0NJ(0.0f, 0.0f, 0.0f, 0.0f, A0p, A0p, A0p, A0p);
    }

    public int hashCode() {
        int A0B = AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A01), this.A03), this.A02), this.A00);
        long j = this.A06;
        long j2 = C04140Lz.A00;
        return AnonymousClass001.A0J(this.A04, AnonymousClass001.A0K(this.A05, AnonymousClass001.A0K(this.A07, AnonymousClass001.A0K(j, A0B))));
    }

    public String toString() {
        long j = this.A06;
        long j2 = this.A07;
        long j3 = this.A05;
        long j4 = this.A04;
        StringBuilder A10 = AnonymousClass000.A10();
        C02460Ec.A00(A10, this.A01);
        A10.append(", ");
        C02460Ec.A00(A10, this.A03);
        A10.append(", ");
        C02460Ec.A00(A10, this.A02);
        A10.append(", ");
        C02460Ec.A00(A10, this.A00);
        String obj = A10.toString();
        long j5 = C04140Lz.A00;
        if (AnonymousClass000.A1P((j > j2 ? 1 : (j == j2 ? 0 : -1))) && j2 == j3 && j3 == j4) {
            float A022 = AnonymousClass001.A02(j);
            float A012 = AnonymousClass001.A01(j);
            int i = (A022 > A012 ? 1 : (A022 == A012 ? 0 : -1));
            StringBuilder A11 = AnonymousClass000.A11("RoundRect(rect=");
            if (i == 0) {
                A11.append(obj);
                A11.append(", radius=");
            } else {
                A11.append(obj);
                A11.append(", x=");
                C02460Ec.A00(A11, A022);
                A11.append(", y=");
                A022 = A012;
            }
            C02460Ec.A00(A11, A022);
            A11.append(')');
            return A11.toString();
        }
        StringBuilder A112 = AnonymousClass000.A11("RoundRect(rect=");
        A112.append(obj);
        A112.append(", topLeft=");
        A112.append(C04140Lz.A00(j));
        A112.append(", topRight=");
        A112.append(C04140Lz.A00(j2));
        A112.append(", bottomRight=");
        A112.append(C04140Lz.A00(j3));
        A112.append(", bottomLeft=");
        A112.append(C04140Lz.A00(j4));
        A112.append(')');
        return A112.toString();
    }

    public AnonymousClass0NJ(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A04 = j4;
    }
}
