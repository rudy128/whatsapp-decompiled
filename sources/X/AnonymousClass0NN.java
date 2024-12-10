package X;

/* renamed from: X.0NN  reason: invalid class name */
public final class AnonymousClass0NN {
    public C03430Id A00;
    public boolean A01;
    public int A02;
    public C03430Id A03;
    public Long A04;

    public final void A03(C26224CvE cvE) {
        C26224CvE cvE2;
        String str;
        C26224CvE A002;
        this.A01 = false;
        C03430Id r0 = this.A00;
        if (r0 != null) {
            cvE2 = r0.A00();
        } else {
            cvE2 = null;
        }
        if (!C18070vi.A18(cvE, cvE2)) {
            String A042 = cvE.A04();
            C03430Id r02 = this.A00;
            if (r02 == null || (A002 = r02.A00()) == null) {
                str = null;
            } else {
                str = A002.A04();
            }
            boolean A18 = C18070vi.A18(A042, str);
            C03430Id r03 = this.A00;
            if (!A18) {
                C03430Id r2 = new C03430Id(r03, cvE);
                this.A00 = r2;
                this.A03 = null;
                int length = this.A02 + A042.length();
                this.A02 = length;
                if (length > 100000 && r2.A00 != null) {
                    do {
                        C03430Id r04 = r2.A00;
                        if (r04 == null || r04.A00 == null) {
                            r2.A00 = null;
                            return;
                        }
                        r2 = r2.A00;
                    } while (r2 != null);
                }
            } else if (r03 != null) {
                r03.A01(cvE);
            }
        }
    }

    public final C26224CvE A01() {
        C03430Id r3 = this.A03;
        if (r3 == null) {
            return null;
        }
        this.A03 = r3.A00;
        this.A00 = new C03430Id(this.A00, r3.A00());
        int i = this.A02;
        C26224CvE A002 = r3.A00();
        this.A02 = i + A002.A04().length();
        return A002;
    }

    public final C26224CvE A02() {
        C03430Id r3;
        C03430Id r2 = this.A00;
        if (r2 == null || (r3 = r2.A00) == null) {
            return null;
        }
        this.A00 = r3;
        int i = this.A02;
        C26224CvE A002 = r2.A00();
        this.A02 = i - A002.A04().length();
        this.A03 = new C03430Id(this.A03, A002);
        return r3.A00();
    }

    public final void A04(C26224CvE cvE, long j) {
        long j2;
        if (!this.A01) {
            Long l = this.A04;
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 0;
            }
            if (j <= j2 + 5000) {
                return;
            }
        }
        this.A04 = Long.valueOf(j);
        A03(cvE);
    }
}
