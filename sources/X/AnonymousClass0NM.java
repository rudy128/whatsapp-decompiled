package X;

/* renamed from: X.0NM  reason: invalid class name */
public final class AnonymousClass0NM {
    public C16910tQ A00;
    public C16910tQ A01;
    public final C26227CvJ A02;

    private final long A00(long j) {
        AnonymousClass0NU r3;
        C16910tQ r1;
        C16910tQ r2 = this.A01;
        if (r2 == null || !r2.Be8() || (r1 = this.A00) == null) {
            r3 = AnonymousClass0NU.A04;
        } else {
            r3 = r1.Bhs(r2, true);
        }
        float A012 = AnonymousClass0QY.A01(j);
        float f = r3.A01;
        if (A012 >= f) {
            float A013 = AnonymousClass0QY.A01(j);
            f = r3.A02;
            if (A013 <= f) {
                f = AnonymousClass0QY.A01(j);
            }
        }
        float A022 = AnonymousClass0QY.A02(j);
        float f2 = r3.A03;
        if (A022 >= f2) {
            float A023 = AnonymousClass0QY.A02(j);
            f2 = r3.A00;
            if (A023 <= f2) {
                f2 = AnonymousClass0QY.A02(j);
            }
        }
        return AnonymousClass001.A0p(f, f2);
    }

    public final int A01(boolean z, long j) {
        if (z) {
            j = A00(j);
        }
        return this.A02.A0G(A02(j));
    }

    public final long A02(long j) {
        C16910tQ r1;
        C16910tQ r2 = this.A01;
        if (r2 == null || !r2.Be8() || (r1 = this.A00) == null || !r1.Be8()) {
            return j;
        }
        return r2.Bht(r1, j);
    }

    public AnonymousClass0NM(C26227CvJ cvJ) {
        this.A02 = cvJ;
    }

    public final C26227CvJ A03() {
        return this.A02;
    }

    public final boolean A04(long j) {
        long A022 = A02(A00(j));
        C26227CvJ cvJ = this.A02;
        int A0C = cvJ.A0C(AnonymousClass0QY.A02(A022));
        if (AnonymousClass0QY.A01(A022) < cvJ.A07(A0C) || AnonymousClass0QY.A01(A022) > cvJ.A08(A0C)) {
            return false;
        }
        return true;
    }
}
