package X;

import android.graphics.Rect;

/* renamed from: X.0BX  reason: invalid class name */
public final class AnonymousClass0BX extends C06140Xc {
    public static AnonymousClass0BX A03;
    public static final C24245By3 A04 = C24245By3.Ltr;
    public static final C24245By3 A05 = C24245By3.Rtl;
    public Rect A00 = new Rect();
    public C05060Qg A01;
    public C26227CvJ A02;

    private final int A00(C24245By3 by3, int i) {
        C26227CvJ cvJ = this.A02;
        if (cvJ != null) {
            int A0F = cvJ.A0F(i);
            C26227CvJ cvJ2 = this.A02;
            if (cvJ2 != null) {
                C24245By3 A0Q = cvJ2.A0Q(A0F);
                C26227CvJ cvJ3 = this.A02;
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

    public final void A05(C05060Qg r1, C26227CvJ cvJ, String str) {
        this.A00 = str;
        this.A02 = cvJ;
        this.A01 = r1;
    }

    public int[] BLU(int i) {
        int A0B;
        if (C06140Xc.A01(this) <= 0 || i >= C06140Xc.A01(this)) {
            return null;
        }
        try {
            C05060Qg r0 = this.A01;
            if (r0 == null) {
                C18070vi.A11("node");
                throw null;
            }
            AnonymousClass0NU A0C = r0.A0C();
            int A012 = C22339B3q.A01(A0C.A00 - A0C.A03);
            int i2 = 0;
            if (0 < i) {
                i2 = i;
            }
            C26227CvJ cvJ = this.A02;
            if (cvJ != null) {
                int A0E = cvJ.A0E(i2);
                C26227CvJ cvJ2 = this.A02;
                if (cvJ2 != null) {
                    float A09 = cvJ2.A09(A0E) + ((float) A012);
                    C26227CvJ cvJ3 = this.A02;
                    if (cvJ3 != null) {
                        int i3 = (A09 > cvJ3.A09(cvJ3.A0B() - 1) ? 1 : (A09 == cvJ3.A09(cvJ3.A0B() - 1) ? 0 : -1));
                        C26227CvJ cvJ4 = this.A02;
                        if (i3 < 0) {
                            if (cvJ4 != null) {
                                A0B = cvJ4.A0C(A09);
                            }
                        } else if (cvJ4 != null) {
                            A0B = cvJ4.A0B();
                        }
                        return A04(i2, A00(A04, A0B - 1) + 1);
                    }
                }
            }
            C18070vi.A11("layoutResult");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public int[] CCD(int i) {
        int i2;
        if (C06140Xc.A01(this) <= 0 || i <= 0) {
            return null;
        }
        try {
            C05060Qg r0 = this.A01;
            if (r0 == null) {
                C18070vi.A11("node");
                throw null;
            }
            AnonymousClass0NU A0C = r0.A0C();
            int A012 = C22339B3q.A01(A0C.A00 - A0C.A03);
            int A013 = C06140Xc.A01(this);
            if (A013 > i) {
                A013 = i;
            }
            C26227CvJ cvJ = this.A02;
            if (cvJ != null) {
                int A0E = cvJ.A0E(A013);
                C26227CvJ cvJ2 = this.A02;
                if (cvJ2 != null) {
                    float A09 = cvJ2.A09(A0E) - ((float) A012);
                    if (A09 > 0.0f) {
                        C26227CvJ cvJ3 = this.A02;
                        if (cvJ3 != null) {
                            i2 = cvJ3.A0C(A09);
                        }
                    } else {
                        i2 = 0;
                    }
                    if (A013 == C06140Xc.A01(this) && i2 < A0E) {
                        i2++;
                    }
                    return A04(A00(A05, i2), A013);
                }
            }
            C18070vi.A11("layoutResult");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
