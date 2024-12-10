package X;

/* renamed from: X.0BW  reason: invalid class name */
public final class AnonymousClass0BW extends C06140Xc {
    public static AnonymousClass0BW A01;
    public static final C24245By3 A02 = C24245By3.Ltr;
    public static final C24245By3 A03 = C24245By3.Rtl;
    public C26227CvJ A00;

    private final int A00(C24245By3 by3, int i) {
        C26227CvJ cvJ = this.A00;
        if (cvJ != null) {
            int A0F = cvJ.A0F(i);
            C26227CvJ cvJ2 = this.A00;
            if (cvJ2 != null) {
                C24245By3 A0Q = cvJ2.A0Q(A0F);
                C26227CvJ cvJ3 = this.A00;
                if (by3 != A0Q) {
                    if (cvJ3 != null) {
                        return cvJ3.A0F(i);
                    }
                } else if (cvJ3 != null) {
                    return C26227CvJ.A00(cvJ3, i) - 1;
                }
            }
        }
        C18070vi.A11("layoutResult");
        throw null;
    }

    public final void A05(C26227CvJ cvJ, String str) {
        this.A00 = str;
        this.A00 = cvJ;
    }

    public int[] BLU(int i) {
        int A0E;
        if (C06140Xc.A01(this) > 0 && i < C06140Xc.A01(this)) {
            if (i < 0) {
                C26227CvJ cvJ = this.A00;
                if (cvJ != null) {
                    A0E = cvJ.A0E(0);
                }
                C18070vi.A11("layoutResult");
                throw null;
            }
            C26227CvJ cvJ2 = this.A00;
            if (cvJ2 != null) {
                A0E = cvJ2.A0E(i);
                if (A00(A03, A0E) != i) {
                    A0E++;
                }
            }
            C18070vi.A11("layoutResult");
            throw null;
            C26227CvJ cvJ3 = this.A00;
            if (cvJ3 != null) {
                if (A0E < cvJ3.A0B()) {
                    return A04(A00(A03, A0E), A00(A02, A0E) + 1);
                }
            }
            C18070vi.A11("layoutResult");
            throw null;
        }
        return null;
    }

    public int[] CCD(int i) {
        int A0E;
        if (C06140Xc.A01(this) > 0 && i > 0) {
            if (i > C06140Xc.A01(this)) {
                C26227CvJ cvJ = this.A00;
                if (cvJ != null) {
                    A0E = cvJ.A0E(C06140Xc.A01(this));
                }
                C18070vi.A11("layoutResult");
                throw null;
            }
            C26227CvJ cvJ2 = this.A00;
            if (cvJ2 != null) {
                A0E = cvJ2.A0E(i);
                if (A00(A02, A0E) + 1 != i) {
                    A0E--;
                }
            }
            C18070vi.A11("layoutResult");
            throw null;
            if (A0E >= 0) {
                return A04(A00(A03, A0E), A00(A02, A0E) + 1);
            }
        }
        return null;
    }
}
