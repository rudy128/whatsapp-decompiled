package X;

/* renamed from: X.0NU  reason: invalid class name */
public final class AnonymousClass0NU {
    public static final AnonymousClass0NU A04 = new AnonymousClass0NU(0.0f, 0.0f, 0.0f, 0.0f);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0NU) {
                AnonymousClass0NU r5 = (AnonymousClass0NU) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A03, r5.A03) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long A00() {
        float f = this.A01;
        float f2 = this.A03;
        long A0p = AnonymousClass001.A0p(f + ((this.A02 - f) / 2.0f), f2 + ((this.A00 - f2) / 2.0f));
        long j = AnonymousClass0QY.A03;
        return A0p;
    }

    public final AnonymousClass0NU A01(float f, float f2) {
        return new AnonymousClass0NU(this.A01 + f, this.A03 + f2, this.A02 + f, this.A00 + f2);
    }

    public final AnonymousClass0NU A02(long j) {
        return new AnonymousClass0NU(this.A01 + AnonymousClass0QY.A01(j), this.A03 + AnonymousClass0QY.A02(j), this.A02 + AnonymousClass0QY.A01(j), this.A00 + AnonymousClass0QY.A02(j));
    }

    public final AnonymousClass0NU A03(AnonymousClass0NU r6) {
        return new AnonymousClass0NU(Math.max(this.A01, r6.A01), Math.max(this.A03, r6.A03), Math.min(this.A02, r6.A02), Math.min(this.A00, r6.A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A01), this.A03), this.A02), this.A00);
    }

    public AnonymousClass0NU(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Rect.fromLTRB(");
        C02460Ec.A00(A10, this.A01);
        A10.append(", ");
        C02460Ec.A00(A10, this.A03);
        A10.append(", ");
        C02460Ec.A00(A10, this.A02);
        A10.append(", ");
        C02460Ec.A00(A10, this.A00);
        return AnonymousClass001.A1J(A10);
    }
}
