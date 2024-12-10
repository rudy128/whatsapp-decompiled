package X;

import java.text.BreakIterator;
import java.util.List;

/* renamed from: X.0Qt  reason: invalid class name */
public final class AnonymousClass0Qt {
    public long A00;
    public C27069DRu A01;
    public final AnonymousClass0H5 A02;
    public final long A03;
    public final AnonymousClass0NM A04;
    public final C27069DRu A05;
    public final C26227CvJ A06;
    public final EBT A07;
    public final C26224CvE A08;

    public /* synthetic */ AnonymousClass0Qt(AnonymousClass0H5 r8, C27069DRu dRu, C26227CvJ cvJ, EBT ebt, AnonymousClass1Y1 r12, long j) {
        this(r8, dRu, cvJ, ebt, j);
    }

    private final int A00() {
        return this.A07.CB1(AnonymousClass000.A0H(this.A00));
    }

    private final int A01() {
        return this.A07.CB1(C26260Cw5.A01(this.A00));
    }

    private final int A02() {
        return this.A07.CB1(C26260Cw5.A02(this.A00));
    }

    private final int A03(AnonymousClass0NM r9, int i) {
        AnonymousClass0NU r7;
        C16910tQ r1;
        C16910tQ r2 = r9.A01;
        if (r2 == null || (r1 = r9.A00) == null) {
            r7 = AnonymousClass0NU.A04;
        } else {
            r7 = r1.Bhs(r2, true);
        }
        EBT A0M = A0M();
        int CB1 = A0M.CB1(AnonymousClass000.A0H(this.A08.A01()));
        C26227CvJ A032 = r9.A03();
        AnonymousClass0NU A0K = A032.A0K(CB1);
        long A0p = AnonymousClass001.A0p(A0K.A01, A0K.A03 + (AnonymousClass0QG.A00(AnonymousClass001.A0p(r7.A02 - r7.A01, r7.A00 - r7.A03)) * ((float) i)));
        long j = AnonymousClass0QY.A03;
        return A0M.CPo(A032.A0G(A0p));
    }

    public static int A04(AnonymousClass0Qt r2) {
        r2.A02.A00 = null;
        return r2.A0S().length();
    }

    /* access modifiers changed from: private */
    public final int A0B(C26227CvJ cvJ, int i) {
        while (true) {
            int length = this.A05.length();
            if (i >= length) {
                return length;
            }
            int length2 = A0S().length() - 1;
            int i2 = i;
            if (i > length2) {
                i2 = length2;
            }
            int A0H = AnonymousClass000.A0H(cvJ.A0I(i2));
            if (A0H > i) {
                return this.A07.CPo(A0H);
            }
            i++;
        }
    }

    /* access modifiers changed from: private */
    public final int A0C(C26227CvJ cvJ, int i) {
        while (i > 0) {
            int length = A0S().length() - 1;
            int i2 = i;
            if (i > length) {
                i2 = length;
            }
            int A0G = AnonymousClass000.A0G(cvJ.A0I(i2));
            if (A0G < i) {
                return this.A07.CPo(A0G);
            }
            i--;
        }
        return 0;
    }

    private final boolean A0I() {
        C24245By3 by3;
        C26227CvJ cvJ = this.A06;
        if (cvJ != null) {
            by3 = cvJ.A0Q(A00());
        } else {
            by3 = null;
        }
        if (by3 != C24245By3.Rtl) {
            return true;
        }
        return false;
    }

    public final int A0J() {
        String A022 = this.A01.A02();
        int A0H = AnonymousClass000.A0H(this.A00);
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(A022);
        return characterInstance.following(A0H);
    }

    public final int A0K() {
        String A022 = this.A01.A02();
        int A0H = AnonymousClass000.A0H(this.A00);
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(A022);
        return characterInstance.preceding(A0H);
    }

    public final C26224CvE A0N() {
        return C26224CvE.A00(A0L(), this.A08, 4, this.A00);
    }

    public final Integer A0O() {
        C26227CvJ cvJ = this.A06;
        if (cvJ != null) {
            return Integer.valueOf(A09(cvJ, A01()));
        }
        return null;
    }

    public final Integer A0P() {
        C26227CvJ cvJ = this.A06;
        if (cvJ != null) {
            return Integer.valueOf(A0A(cvJ, A02()));
        }
        return null;
    }

    public final Integer A0Q() {
        C26227CvJ cvJ = this.A06;
        if (cvJ != null) {
            return Integer.valueOf(A0B(cvJ, A00()));
        }
        return null;
    }

    public final Integer A0R() {
        C26227CvJ cvJ = this.A06;
        if (cvJ != null) {
            return Integer.valueOf(A0C(cvJ, A00()));
        }
        return null;
    }

    public final String A0S() {
        return this.A01.A02();
    }

    public final List A0T(C22821Di r5) {
        if (C26260Cw5.A04(this.A00)) {
            Object invoke = r5.invoke(this);
            if (invoke != null) {
                return AnonymousClass1ZT.A00(invoke);
            }
            return null;
        }
        int A022 = C26260Cw5.A02(this.A00);
        return AnonymousClass1ZU.A08(new D60("", 0), new C26609D5z(A022, A022));
    }

    public final void A0Z() {
        this.A02.A00 = null;
        String A0S = A0S();
        int length = A0S.length();
        if (length > 0) {
            int A012 = C26260Cw5.A01(this.A00);
            while (true) {
                if (A012 < length) {
                    if (A0S.charAt(A012) == 10) {
                        break;
                    }
                    A012++;
                } else {
                    A012 = length;
                    break;
                }
            }
            if (A012 == C26260Cw5.A01(this.A00) && A012 != length) {
                while (true) {
                    A012++;
                    if (A012 < length) {
                        if (A0S.charAt(A012) == 10) {
                            break;
                        }
                    } else {
                        A012 = length;
                        break;
                    }
                }
            }
            A0n(A012, A012);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0a() {
        this.A02.A00 = null;
        String A0S = A0S();
        if (A0S.length() > 0) {
            int A022 = C26260Cw5.A02(this.A00);
            while (true) {
                if (A022 <= 0) {
                    A022 = 0;
                    break;
                }
                int i = A022 - 1;
                if (A0S.charAt(i) == 10) {
                    break;
                }
                A022 = i;
            }
            if (A022 == C26260Cw5.A02(this.A00) && A022 != 0) {
                while (true) {
                    A022--;
                    if (A022 > 0) {
                        if (A0S.charAt(A022 - 1) == 10) {
                            break;
                        }
                    } else {
                        A022 = 0;
                        break;
                    }
                }
            }
            A0n(A022, A022);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public AnonymousClass0Qt(AnonymousClass0H5 r1, C27069DRu dRu, C26227CvJ cvJ, EBT ebt, long j) {
        this.A05 = dRu;
        this.A03 = j;
        this.A06 = cvJ;
        this.A07 = ebt;
        this.A02 = r1;
        this.A00 = j;
        this.A01 = dRu;
    }

    /* access modifiers changed from: private */
    public final int A09(C26227CvJ cvJ, int i) {
        return this.A07.CPo(cvJ.A0D(cvJ.A0E(i)));
    }

    /* access modifiers changed from: private */
    public final int A0A(C26227CvJ cvJ, int i) {
        return this.A07.CPo(cvJ.A0F(cvJ.A0E(i)));
    }

    private final int A0D(C26227CvJ cvJ, int i) {
        int A002 = A00();
        AnonymousClass0H5 r1 = this.A02;
        if (r1.A00 == null) {
            r1.A00 = Float.valueOf(cvJ.A0K(A002).A01);
        }
        int A0E = cvJ.A0E(A002) + i;
        if (A0E < 0) {
            return 0;
        }
        if (A0E >= cvJ.A0B()) {
            return A0S().length();
        }
        float A062 = cvJ.A06(A0E) - 1.0f;
        Float f = r1.A00;
        C18070vi.A0b(f);
        float floatValue = f.floatValue();
        if ((A0I() && floatValue >= cvJ.A08(A0E)) || (!A0I() && floatValue <= cvJ.A07(A0E))) {
            return cvJ.A0D(A0E);
        }
        long A0p = AnonymousClass001.A0p(floatValue, A062);
        long j = AnonymousClass0QY.A03;
        return this.A07.CPo(cvJ.A0G(A0p));
    }

    private final void A0E() {
        int A0J;
        if (A04(this) > 0 && (A0J = A0J()) != -1) {
            A0n(A0J, A0J);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    private final void A0F() {
        Integer A0Q;
        if (A04(this) > 0 && (A0Q = A0Q()) != null) {
            int intValue = A0Q.intValue();
            A0n(intValue, intValue);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    private final void A0G() {
        int A0K;
        if (A04(this) > 0 && (A0K = A0K()) != -1) {
            A0n(A0K, A0K);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    private final void A0H() {
        Integer A0R;
        if (A04(this) > 0 && (A0R = A0R()) != null) {
            int intValue = A0R.intValue();
            A0n(intValue, intValue);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final C27069DRu A0L() {
        return this.A01;
    }

    public final EBT A0M() {
        return this.A07;
    }

    public final void A0U() {
        if (A04(this) > 0) {
            int A0H = AnonymousClass000.A0H(this.A00);
            A0n(A0H, A0H);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0V() {
        C26227CvJ cvJ;
        if (A0S().length() > 0 && (cvJ = this.A06) != null) {
            int A0D = A0D(cvJ, 1);
            A0n(A0D, A0D);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0W() {
        AnonymousClass0NM r1;
        if (A0S().length() > 0 && (r1 = this.A04) != null) {
            int A032 = A03(r1, 1);
            A0n(A032, A032);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0X() {
        if (A04(this) > 0) {
            if (A0I()) {
                A0G();
            } else {
                A0E();
            }
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0Y() {
        if (A04(this) > 0) {
            if (A0I()) {
                A0H();
            } else {
                A0F();
            }
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0b() {
        if (A04(this) > 0) {
            if (A0I()) {
                A0E();
            } else {
                A0G();
            }
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0c() {
        if (A04(this) > 0) {
            if (A0I()) {
                A0F();
            } else {
                A0H();
            }
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0d() {
        int A042 = A04(this);
        if (A042 > 0) {
            A0n(A042, A042);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0e() {
        if (A04(this) > 0) {
            A0n(0, 0);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0f() {
        Integer A0O;
        if (A04(this) > 0 && (A0O = A0O()) != null) {
            int intValue = A0O.intValue();
            A0n(intValue, intValue);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0g() {
        if (A04(this) > 0) {
            if (A0I()) {
                A0i();
            } else {
                A0f();
            }
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0h() {
        if (A04(this) > 0) {
            if (A0I()) {
                A0f();
            } else {
                A0i();
            }
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0i() {
        Integer A0P;
        if (A04(this) > 0 && (A0P = A0P()) != null) {
            int intValue = A0P.intValue();
            A0n(intValue, intValue);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0j() {
        C26227CvJ cvJ;
        if (A0S().length() > 0 && (cvJ = this.A06) != null) {
            int A0D = A0D(cvJ, -1);
            A0n(A0D, A0D);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0k() {
        AnonymousClass0NM r1;
        if (A0S().length() > 0 && (r1 = this.A04) != null) {
            int A032 = A03(r1, -1);
            A0n(A032, A032);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0l() {
        int A042 = A04(this);
        if (A042 > 0) {
            A0n(0, A042);
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0m() {
        if (A0S().length() > 0) {
            this.A00 = C25858CnM.A01(AnonymousClass000.A0G(this.A03), AnonymousClass000.A0H(this.A00));
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0n(int i, int i2) {
        this.A00 = C25858CnM.A01(i, i2);
    }

    public final void A0o(C22821Di r4) {
        int A012;
        if (A04(this) > 0) {
            if (C26260Cw5.A04(this.A00)) {
                C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                r4.invoke(this);
            } else {
                boolean A0I = A0I();
                long j = this.A00;
                if (A0I) {
                    A012 = C26260Cw5.A02(j);
                } else {
                    A012 = C26260Cw5.A01(j);
                }
                A0n(A012, A012);
            }
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void A0p(C22821Di r4) {
        int A022;
        if (A04(this) > 0) {
            if (C26260Cw5.A04(this.A00)) {
                C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                r4.invoke(this);
            } else {
                boolean A0I = A0I();
                long j = this.A00;
                if (A0I) {
                    A022 = C26260Cw5.A01(j);
                } else {
                    A022 = C26260Cw5.A02(j);
                }
                A0n(A022, A022);
            }
        }
        C18070vi.A0z(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0Qt(X.AnonymousClass0NM r9, X.AnonymousClass0H5 r10, X.EBT r11, X.C26224CvE r12) {
        /*
            r8 = this;
            X.DRu r2 = r12.A02()
            long r6 = r12.A01()
            if (r9 == 0) goto L_0x001a
            X.CvJ r3 = r9.A03()
        L_0x000e:
            r5 = 0
            r0 = r8
            r1 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.A08 = r12
            r8.A04 = r9
            return
        L_0x001a:
            r3 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qt.<init>(X.0NM, X.0H5, X.EBT, X.CvE):void");
    }
}
