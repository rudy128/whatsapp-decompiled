package X;

/* renamed from: X.0NK  reason: invalid class name */
public final class AnonymousClass0NK {
    public static int A09;
    public static final C02570En A0A = new Object();
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final AnonymousClass0AC A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0NK) {
                AnonymousClass0NK r8 = (AnonymousClass0NK) obj;
                if (AnonymousClass000.A1P(Float.compare(this.A01, r8.A01)) && AnonymousClass000.A1P(Float.compare(this.A00, r8.A00)) && this.A03 == r8.A03 && this.A02 == r8.A02 && C18070vi.A18(this.A07, r8.A07)) {
                    long j = this.A06;
                    long j2 = r8.A06;
                    C02540Ek r0 = C05100Qk.A06;
                    if (!(j == j2 && this.A05 == r8.A05 && this.A08 == r8.A08)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0N = AnonymousClass000.A0N(this.A07, AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(0, this.A01), this.A00), this.A03), this.A02));
        long j = this.A06;
        C02540Ek r0 = C05100Qk.A06;
        int A0K = (AnonymousClass001.A0K(j, A0N) + this.A05) * 31;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        return A0K + i;
    }

    public /* synthetic */ AnonymousClass0NK(AnonymousClass0AC r4, float f, float f2, float f3, float f4, int i, long j, boolean z) {
        int i2;
        synchronized (A0A) {
            i2 = A09;
            A09 = i2 + 1;
        }
        this.A01 = f;
        this.A00 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A07 = r4;
        this.A06 = j;
        this.A05 = i;
        this.A08 = z;
        this.A04 = i2;
    }

    public final AnonymousClass0AC A00() {
        return this.A07;
    }
}
