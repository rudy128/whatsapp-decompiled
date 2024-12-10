package X;

import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import java.util.List;

/* renamed from: X.CvJ  reason: case insensitive filesystem */
public final class C26227CvJ {
    public final long A00;
    public final C26222CvC A01;
    public final C25283Ccg A02;
    public final float A03;
    public final float A04;
    public final List A05;

    public /* synthetic */ C26227CvJ(C26222CvC cvC, C25283Ccg ccg, AnonymousClass1Y1 r3, long j) {
        this(cvC, ccg, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26227CvJ) {
                C26227CvJ cvJ = (C26227CvJ) obj;
                if (!C18070vi.A18(this.A02, cvJ.A02) || !C18070vi.A18(this.A01, cvJ.A01) || this.A00 != cvJ.A00 || this.A03 != cvJ.A03 || this.A04 != cvJ.A04 || !C18070vi.A18(this.A05, cvJ.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static C25227CbO A02(C26227CvJ cvJ, int i) {
        C26222CvC cvC = cvJ.A01;
        C26222CvC.A04(cvC, i);
        List list = cvC.A05;
        return (C25227CbO) list.get(A01(list, i));
    }

    public final float A04() {
        return this.A03;
    }

    public final float A05() {
        return this.A04;
    }

    public final float A0A(int i, boolean z) {
        int A002;
        C26222CvC cvC = this.A01;
        C26222CvC.A03(cvC, i);
        int length = cvC.A04.A00.length();
        List list = cvC.A05;
        if (i == length) {
            A002 = AnonymousClass1ZU.A04(list);
        } else {
            A002 = C25285Ccn.A00(list, i);
        }
        C25227CbO A0S = BE6.A0S(list, A002);
        EA0 ea0 = A0S.A06;
        int A07 = BE6.A07(i, A0S.A05, A0S.A04);
        C26043Cr7 cr7 = ((C26594D5i) ea0).A01;
        if (z) {
            return cr7.A04(A07, false);
        }
        return cr7.A05(A07, false);
    }

    public final int A0B() {
        return this.A01.A02;
    }

    public final int A0C(float f) {
        int i;
        C26222CvC cvC = this.A01;
        if (f > 0.0f) {
            int i2 = (f > cvC.A00 ? 1 : (f == cvC.A00 ? 0 : -1));
            List list = cvC.A05;
            if (i2 < 0) {
                int size = list.size() - 1;
                int i3 = 0;
                while (true) {
                    if (i3 > size) {
                        i = -(i3 + 1);
                        break;
                    }
                    i = (i3 + size) >>> 1;
                    C25227CbO A0S = BE6.A0S(list, i);
                    if (A0S.A01 <= f) {
                        if (A0S.A00 > f) {
                            break;
                        }
                        i3 = i + 1;
                    } else {
                        size = i - 1;
                    }
                }
            } else {
                i = AnonymousClass1ZU.A04(list);
            }
        } else {
            i = 0;
        }
        C25227CbO A0S2 = BE6.A0S(cvC.A05, i);
        if (A0S2.A04 - A0S2.A05 == 0) {
            return A0S2.A03;
        }
        EA0 ea0 = A0S2.A06;
        float f2 = f - A0S2.A01;
        C26043Cr7 cr7 = ((C26594D5i) ea0).A01;
        return cr7.A08.getLineForVertical(((int) f2) - cr7.A05) + A0S2.A03;
    }

    public final int A0E(int i) {
        int A002;
        C26222CvC cvC = this.A01;
        if (i >= cvC.A04.A00.length()) {
            A002 = AnonymousClass1ZU.A04(cvC.A05);
        } else if (i < 0) {
            A002 = 0;
        } else {
            A002 = C25285Ccn.A00(cvC.A05, i);
        }
        C25227CbO A0S = BE6.A0S(cvC.A05, A002);
        EA0 ea0 = A0S.A06;
        return ((C26594D5i) ea0).A01.A08.getLineForOffset(BE6.A07(i, A0S.A05, A0S.A04)) + A0S.A03;
    }

    public final int A0G(long j) {
        int i;
        float f;
        C26222CvC cvC = this.A01;
        if (AnonymousClass0QY.A02(j) > 0.0f) {
            int i2 = (AnonymousClass0QY.A02(j) > cvC.A00 ? 1 : (AnonymousClass0QY.A02(j) == cvC.A00 ? 0 : -1));
            List list = cvC.A05;
            if (i2 < 0) {
                float A022 = AnonymousClass0QY.A02(j);
                int size = list.size() - 1;
                int i3 = 0;
                while (true) {
                    if (i3 > size) {
                        i = -(i3 + 1);
                        break;
                    }
                    i = (i3 + size) >>> 1;
                    C25227CbO A0S = BE6.A0S(list, i);
                    if (A0S.A01 <= A022) {
                        if (A0S.A00 > A022) {
                            break;
                        }
                        i3 = i + 1;
                    } else {
                        size = i - 1;
                    }
                }
            } else {
                i = AnonymousClass1ZU.A04(list);
            }
        } else {
            i = 0;
        }
        C25227CbO A0S2 = BE6.A0S(cvC.A05, i);
        int i4 = A0S2.A04;
        int i5 = A0S2.A05;
        if (i4 - i5 == 0) {
            return i5;
        }
        EA0 ea0 = A0S2.A06;
        long A0p = AnonymousClass001.A0p(AnonymousClass0QY.A01(j), AnonymousClass0QY.A02(j) - A0S2.A01);
        C26043Cr7 cr7 = ((C26594D5i) ea0).A01;
        Layout layout = cr7.A08;
        int lineForVertical = layout.getLineForVertical(((int) AnonymousClass0QY.A02(A0p)) - cr7.A05);
        float A012 = AnonymousClass0QY.A01(A0p);
        if (lineForVertical == cr7.A04 - 1) {
            f = cr7.A00 + cr7.A01;
        } else {
            f = 0.0f;
        }
        return layout.getOffsetForHorizontal(lineForVertical, A012 + (-1.0f * f)) + i5;
    }

    public final long A0H() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        if (X.C26191CuJ.A03(r7, r3) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e1, code lost:
        if (X.C26191CuJ.A03(r7, r3) != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0101, code lost:
        if (X.C26191CuJ.A02(r9, r3) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010d, code lost:
        if (X.C26191CuJ.A02(r9, r3) != false) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A0I(int r13) {
        /*
            r12 = this;
            X.CvC r1 = r12.A01
            X.C26222CvC.A03(r1, r13)
            X.D5j r0 = r1.A04
            X.DRu r0 = r0.A00
            int r0 = r0.length()
            java.util.List r1 = r1.A05
            if (r13 != r0) goto L_0x0110
            int r0 = X.AnonymousClass1ZU.A04(r1)
        L_0x0015:
            X.CbO r0 = X.BE6.A0S(r1, r0)
            X.EA0 r1 = r0.A06
            int r4 = r0.A05
            int r0 = r0.A04
            int r3 = X.BE6.A07(r13, r4, r0)
            r2 = r3
            X.D5i r1 = (X.C26594D5i) r1
            X.0vl r6 = r1.A05
            java.lang.Object r0 = r6.getValue()
            X.CIW r0 = (X.CIW) r0
            r1 = r3
            X.CuJ r9 = r0.A00
            X.C26191CuJ.A00(r9, r3)
            java.text.BreakIterator r7 = r9.A03
            int r0 = r7.preceding(r3)
            int r11 = r9.A01
            int r10 = r9.A00
            if (r0 >= r10) goto L_0x00ed
            if (r11 > r0) goto L_0x00ed
            java.lang.CharSequence r8 = r9.A02
            int r0 = java.lang.Character.codePointAt(r8, r0)
            boolean r0 = X.C26191CuJ.A01(r0)
            if (r0 == 0) goto L_0x00ed
            r5 = r3
            X.C26191CuJ.A00(r9, r3)
        L_0x0052:
            r0 = -1
            if (r5 == r0) goto L_0x006d
            if (r5 >= r10) goto L_0x00e4
            if (r11 > r5) goto L_0x00e4
            int r0 = java.lang.Character.codePointAt(r8, r5)
            boolean r0 = X.C26191CuJ.A01(r0)
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r9.A04(r5)
            if (r0 != 0) goto L_0x00e4
        L_0x0069:
            r0 = -1
            if (r5 == r0) goto L_0x006d
            r1 = r5
        L_0x006d:
            java.lang.Object r0 = r6.getValue()
            X.CIW r0 = (X.CIW) r0
            X.CuJ r7 = r0.A00
            X.C26191CuJ.A00(r7, r3)
            java.text.BreakIterator r6 = r7.A03
            int r0 = r6.following(r3)
            boolean r0 = r7.A04(r0)
            if (r0 == 0) goto L_0x00c3
            X.C26191CuJ.A00(r7, r3)
        L_0x0087:
            r0 = -1
            if (r3 == r0) goto L_0x00a8
            int r5 = r7.A01
            int r0 = r7.A00
            if (r3 >= r0) goto L_0x009e
            if (r5 > r3) goto L_0x009e
            java.lang.CharSequence r0 = r7.A02
            int r0 = java.lang.Character.codePointAt(r0, r3)
            boolean r0 = X.C26191CuJ.A01(r0)
            if (r0 != 0) goto L_0x00bb
        L_0x009e:
            boolean r0 = r7.A04(r3)
            if (r0 == 0) goto L_0x00bb
        L_0x00a4:
            r0 = -1
            if (r3 == r0) goto L_0x00a8
            r2 = r3
        L_0x00a8:
            long r2 = X.C25858CnM.A02(r1, r2)
            int r1 = X.AnonymousClass000.A0G(r2)
            int r1 = r1 + r4
            int r0 = X.AnonymousClass000.A0H(r2)
            int r0 = r0 + r4
            long r0 = X.C25858CnM.A02(r1, r0)
            return r0
        L_0x00bb:
            X.C26191CuJ.A00(r7, r3)
            int r3 = r6.following(r3)
            goto L_0x0087
        L_0x00c3:
            X.C26191CuJ.A00(r7, r3)
            boolean r0 = X.C26191CuJ.A02(r7, r3)
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r6.isBoundary(r3)
            if (r0 == 0) goto L_0x00d8
            boolean r0 = X.C26191CuJ.A03(r7, r3)
            if (r0 == 0) goto L_0x00a4
        L_0x00d8:
            int r3 = r6.following(r3)
            goto L_0x00a4
        L_0x00dd:
            boolean r0 = X.C26191CuJ.A03(r7, r3)
            if (r0 == 0) goto L_0x00a8
            goto L_0x00d8
        L_0x00e4:
            X.C26191CuJ.A00(r9, r5)
            int r5 = r7.preceding(r5)
            goto L_0x0052
        L_0x00ed:
            r5 = r3
            X.C26191CuJ.A00(r9, r3)
            boolean r0 = X.C26191CuJ.A03(r9, r3)
            if (r0 == 0) goto L_0x0109
            boolean r0 = r7.isBoundary(r3)
            if (r0 == 0) goto L_0x0103
            boolean r0 = X.C26191CuJ.A02(r9, r3)
            if (r0 == 0) goto L_0x0069
        L_0x0103:
            int r5 = r7.preceding(r3)
            goto L_0x0069
        L_0x0109:
            boolean r0 = X.C26191CuJ.A02(r9, r3)
            if (r0 == 0) goto L_0x006d
            goto L_0x0103
        L_0x0110:
            int r0 = X.C25285Ccn.A00(r1, r13)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26227CvJ.A0I(int):long");
    }

    public final AnonymousClass0NU A0J(int i) {
        float A052;
        float A053;
        C26222CvC cvC = this.A01;
        C26222CvC.A02(cvC, i);
        List list = cvC.A05;
        C25227CbO A0S = BE6.A0S(list, C25285Ccn.A00(list, i));
        EA0 ea0 = A0S.A06;
        int A07 = BE6.A07(i, A0S.A05, A0S.A04);
        C26594D5i d5i = (C26594D5i) ea0;
        if (A07 < 0 || A07 >= d5i.A03.length()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("offset(");
            A10.append(A07);
            A10.append(") is out of bounds [0,");
            throw AnonymousClass000.A0k(AnonymousClass001.A1L(A10, d5i.A03.length()));
        }
        C26043Cr7 cr7 = d5i.A01;
        Layout layout = cr7.A08;
        int lineForOffset = layout.getLineForOffset(A07);
        float A032 = cr7.A03(lineForOffset);
        float A022 = cr7.A02(lineForOffset);
        boolean A1T = AnonymousClass000.A1T(layout.getParagraphDirection(lineForOffset), 1);
        boolean isRtlCharAt = layout.isRtlCharAt(A07);
        if (A1T) {
            if (!isRtlCharAt) {
                A052 = cr7.A04(A07, false);
                A053 = cr7.A04(A07 + 1, true);
            } else {
                A053 = cr7.A05(A07, false);
                A052 = cr7.A05(A07 + 1, true);
            }
        } else if (isRtlCharAt) {
            A053 = cr7.A04(A07, false);
            A052 = cr7.A04(A07 + 1, true);
        } else {
            A052 = cr7.A05(A07, false);
            A053 = cr7.A05(A07 + 1, true);
        }
        RectF rectF = new RectF(A052, A032, A053, A022);
        AnonymousClass0NU r4 = new AnonymousClass0NU(rectF.left, rectF.top, rectF.right, rectF.bottom);
        long A0p = AnonymousClass001.A0p(0.0f, A0S.A01);
        long j = AnonymousClass0QY.A03;
        return r4.A02(A0p);
    }

    public final AnonymousClass0NU A0K(int i) {
        int A002;
        C26222CvC cvC = this.A01;
        C26222CvC.A03(cvC, i);
        int length = cvC.A04.A00.length();
        List list = cvC.A05;
        if (i == length) {
            A002 = AnonymousClass1ZU.A04(list);
        } else {
            A002 = C25285Ccn.A00(list, i);
        }
        C25227CbO A0S = BE6.A0S(list, A002);
        EA0 ea0 = A0S.A06;
        int A07 = BE6.A07(i, A0S.A05, A0S.A04);
        C26594D5i d5i = (C26594D5i) ea0;
        if (A07 < 0 || A07 > d5i.A03.length()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("offset(");
            A10.append(A07);
            A10.append(") is out of bounds [0,");
            A10.append(d5i.A03.length());
            A10.append(']');
            throw AnonymousClass000.A0j(A10);
        }
        C26043Cr7 cr7 = d5i.A01;
        float A042 = cr7.A04(A07, false);
        int lineForOffset = cr7.A08.getLineForOffset(A07);
        AnonymousClass0NU r4 = new AnonymousClass0NU(A042, cr7.A03(lineForOffset), A042, cr7.A02(lineForOffset));
        long A0p = AnonymousClass001.A0p(0.0f, A0S.A01);
        long j = AnonymousClass0QY.A03;
        return r4.A02(A0p);
    }

    public final AnonymousClass0WS A0L(int i, int i2) {
        AnonymousClass0WS r4;
        C26222CvC cvC = this.A01;
        if (i < 0 || i > i2 || i2 > cvC.A04.A00.A00.length()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Start(");
            A10.append(i);
            A10.append(") or End(");
            A10.append(i2);
            A10.append(") is out of range [0..");
            A10.append(cvC.A04.A00.A00.length());
            throw AnonymousClass001.A12("), or start > end!", A10);
        }
        Path A0L = C108945cZ.A0L();
        if (i == i2) {
            return r4;
        }
        r4 = new AnonymousClass0WS(A0L);
        C25285Ccn.A01(cvC.A05, new C28067Dqh(r4, i, i2), C25858CnM.A02(i, i2));
        return r4;
    }

    public final C26222CvC A0M() {
        return this.A01;
    }

    public final C25283Ccg A0N() {
        return this.A02;
    }

    public final C26227CvJ A0O(C25283Ccg ccg, long j) {
        return new C26227CvJ(this.A01, ccg, j);
    }

    public final C24245By3 A0P(int i) {
        int A002;
        C26222CvC cvC = this.A01;
        C26222CvC.A03(cvC, i);
        int length = cvC.A04.A00.length();
        List list = cvC.A05;
        if (i == length) {
            A002 = AnonymousClass1ZU.A04(list);
        } else {
            A002 = C25285Ccn.A00(list, i);
        }
        C25227CbO A0S = BE6.A0S(list, A002);
        EA0 ea0 = A0S.A06;
        if (((C26594D5i) ea0).A01.A08.isRtlCharAt(BE6.A07(i, A0S.A05, A0S.A04))) {
            return C24245By3.Rtl;
        }
        return C24245By3.Ltr;
    }

    public final C24245By3 A0Q(int i) {
        int A002;
        C26222CvC cvC = this.A01;
        C26222CvC.A03(cvC, i);
        int length = cvC.A04.A00.length();
        List list = cvC.A05;
        if (i == length) {
            A002 = AnonymousClass1ZU.A04(list);
        } else {
            A002 = C25285Ccn.A00(list, i);
        }
        C25227CbO A0S = BE6.A0S(list, A002);
        EA0 ea0 = A0S.A06;
        int A07 = BE6.A07(i, A0S.A05, A0S.A04);
        Layout layout = ((C26594D5i) ea0).A01.A08;
        if (layout.getParagraphDirection(layout.getLineForOffset(A07)) == 1) {
            return C24245By3.Ltr;
        }
        return C24245By3.Rtl;
    }

    public final List A0R() {
        return this.A05;
    }

    public final boolean A0S() {
        long j = this.A00;
        C26222CvC cvC = this.A01;
        if (((float) AnonymousClass000.A0G(j)) < cvC.A01 || cvC.A07 || ((float) AnonymousClass000.A0H(j)) < cvC.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A05, AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass001.A0K(this.A00, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02))), this.A03), this.A04));
    }

    public C26227CvJ(C26222CvC cvC, C25283Ccg ccg, long j) {
        float BTo;
        this.A02 = ccg;
        this.A01 = cvC;
        this.A00 = j;
        List list = cvC.A05;
        this.A03 = !list.isEmpty() ? ((C25227CbO) C108955ca.A0p(list)).A06.BRl() : 0.0f;
        if (list.isEmpty()) {
            BTo = 0.0f;
        } else {
            C25227CbO cbO = (C25227CbO) C29431cG.A0d(list);
            BTo = cbO.A06.BTo() + cbO.A01;
        }
        this.A04 = BTo;
        this.A05 = cvC.A06;
    }

    public static /* synthetic */ int A00(C26227CvJ cvJ, int i) {
        C25227CbO A022 = A02(cvJ, i);
        EA0 ea0 = A022.A06;
        return ((C26594D5i) ea0).A01.A06(i - A022.A03) + A022.A05;
    }

    public static final int A01(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C25227CbO A0S = BE6.A0S(list, i3);
            if (A0S.A03 > i) {
                size = i3 - 1;
            } else if (A0S.A02 > i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    public final float A06(int i) {
        C25227CbO A022 = A02(this, i);
        EA0 ea0 = A022.A06;
        return ((C26594D5i) ea0).A01.A02(i - A022.A03) + A022.A01;
    }

    public final float A07(int i) {
        float f;
        C25227CbO A022 = A02(this, i);
        EA0 ea0 = A022.A06;
        int i2 = i - A022.A03;
        C26043Cr7 cr7 = ((C26594D5i) ea0).A01;
        float lineLeft = cr7.A08.getLineLeft(i2);
        if (i2 == cr7.A04 - 1) {
            f = cr7.A00;
        } else {
            f = 0.0f;
        }
        return lineLeft + f;
    }

    public final float A08(int i) {
        float f;
        C25227CbO A022 = A02(this, i);
        EA0 ea0 = A022.A06;
        int i2 = i - A022.A03;
        C26043Cr7 cr7 = ((C26594D5i) ea0).A01;
        float lineRight = cr7.A08.getLineRight(i2);
        if (i2 == cr7.A04 - 1) {
            f = cr7.A01;
        } else {
            f = 0.0f;
        }
        return lineRight + f;
    }

    public final float A09(int i) {
        C25227CbO A022 = A02(this, i);
        EA0 ea0 = A022.A06;
        return ((C26594D5i) ea0).A01.A03(i - A022.A03) + A022.A01;
    }

    public final int A0D(int i) {
        int ellipsisStart;
        C25227CbO A022 = A02(this, i);
        EA0 ea0 = A022.A06;
        int i2 = i - A022.A03;
        C26043Cr7 cr7 = ((C26594D5i) ea0).A01;
        Layout layout = cr7.A08;
        if (layout.getEllipsisStart(i2) == 0) {
            C25673Ck4 ck4 = (C25673Ck4) cr7.A09.getValue();
            Layout layout2 = ck4.A01;
            ellipsisStart = C25673Ck4.A00(ck4, layout2.getLineEnd(i2), layout2.getLineStart(i2));
        } else {
            ellipsisStart = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
        }
        return ellipsisStart + A022.A05;
    }

    public final int A0F(int i) {
        C25227CbO A022 = A02(this, i);
        EA0 ea0 = A022.A06;
        return ((C26594D5i) ea0).A01.A08.getLineStart(i - A022.A03) + A022.A05;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextLayoutResult(layoutInput=");
        A10.append(this.A02);
        A10.append(", multiParagraph=");
        A10.append(this.A01);
        A10.append(", size=");
        A10.append(C26142Ct5.A01(this.A00));
        A10.append(", firstBaseline=");
        A10.append(this.A03);
        A10.append(", lastBaseline=");
        A10.append(this.A04);
        A10.append(", placeholderRects=");
        return AnonymousClass001.A1F(this.A05, A10);
    }
}
