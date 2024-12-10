package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;

/* renamed from: X.0AK  reason: invalid class name */
public final class AnonymousClass0AK extends AnonymousClass0XJ implements C17500ul, C17490uk {
    public float A00;
    public float A01;
    public int A02 = Integer.MAX_VALUE;
    public int A03 = Integer.MAX_VALUE;
    public long A04;
    public Integer A05 = AnonymousClass00R.A0C;
    public Object A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public float A0C;
    public long A0D;
    public C22821Di A0E;
    public C22821Di A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final C04670Oh A0L;
    public final C06970a9 A0M;
    public final C18090vk A0N;
    public final C18090vk A0O;
    public final /* synthetic */ C04700Ok A0P;

    public void A0Z(C22821Di r6, float f, long j) {
        this.A09 = true;
        if (j != this.A0D) {
            C04700Ok r1 = this.A0P;
            if (r1.A06 || r1.A07) {
                r1.A09 = true;
            }
            A0d();
        }
        C04700Ok r4 = this.A0P;
        AnonymousClass0XV r12 = r4.A0F;
        if (AnonymousClass0F5.A00(r12)) {
            C01850Ad A0x = r4.A02().A0x();
            if (A0x == null || A0x.A0d() == null) {
                AnonymousClass0O0.A00(r12);
            }
            AnonymousClass0AL r3 = r4.A04;
            C18070vi.A0b(r3);
            AnonymousClass0XV A0I2 = r12.A0I();
            if (A0I2 != null) {
                A0I2.A0Q.A01 = 0;
            }
            r3.A00 = Integer.MAX_VALUE;
            AnonymousClass0QZ.A03(r3, 0.0f, AnonymousClass000.A0G(j), AnonymousClass000.A0H(j));
        }
        AnonymousClass0AL r0 = r4.A04;
        if (r0 == null || r0.A08) {
            A04(r6, f, j);
            return;
        }
        throw AnonymousClass000.A0k("Error: Placement happened before lookahead.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        if (r4 != null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0e() {
        /*
            r5 = this;
            r0 = 1
            r5.A0I = r0
            X.0Ok r0 = r5.A0P
            X.0XV r1 = r0.A0F
            X.0XV r4 = r1.A0I()
            X.0BQ r0 = r5.BT2()
            float r3 = r0.A0l()
            X.0Ad r2 = r1.A0K()
            X.0BQ r1 = r1.A0H()
        L_0x001b:
            if (r2 == r1) goto L_0x002c
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"
            X.C18070vi.A0z(r2, r0)
            float r0 = r2.A0l()
            float r3 = r3 + r0
            X.0Ad r2 = r2.A0w()
            goto L_0x001b
        L_0x002c:
            float r0 = r5.A01
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x003c
            r5.A01 = r3
            if (r4 == 0) goto L_0x003c
            r4.A0Y()
            r4.A0T()
        L_0x003c:
            boolean r0 = r5.A08
            r1 = 0
            if (r0 != 0) goto L_0x0071
            if (r4 == 0) goto L_0x0046
            r4.A0T()
        L_0x0046:
            r5.A01()
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0074
            r4.A0k(r1)
        L_0x0052:
            boolean r0 = r5.A0K
            if (r0 != 0) goto L_0x006d
            X.0Ok r2 = r4.A0Q
            java.lang.Integer r1 = r2.A05
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x006d
            int r1 = r5.A02
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x0077
            int r0 = r2.A02
            r5.A02 = r0
            int r0 = r0 + 1
            r2.A02 = r0
        L_0x006d:
            r5.BhP()
            return
        L_0x0071:
            if (r4 == 0) goto L_0x0074
            goto L_0x0052
        L_0x0074:
            r5.A02 = r1
            goto L_0x006d
        L_0x0077:
            java.lang.String r0 = "Place was called on a node which was placed already"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AK.A0e():void");
    }

    /* JADX INFO: finally extract failed */
    public final void A0f() {
        AnonymousClass0XV A0I2;
        try {
            this.A0K = true;
            if (this.A0J) {
                boolean z = this.A08;
                long j = this.A0D;
                A04(this.A0E, this.A0C, j);
                if (z && !this.A0I && (A0I2 = this.A0P.A0F.A0I()) != null) {
                    A0I2.A0k(false);
                }
                this.A0K = false;
                return;
            }
            throw AnonymousClass000.A0n("replace called on unplaced item");
        } catch (Throwable th) {
            this.A0K = false;
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r8 = r7.A0F;
        r0 = r8.A0F();
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BhP() {
        /*
            r10 = this;
            r6 = 1
            r10.A0A = r6
            X.0Oh r5 = r10.A0L
            r5.A07()
            X.0Ok r7 = r10.A0P
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x003d
            X.0XV r8 = r7.A0F
            X.0a9 r0 = r8.A0F()
            int r4 = r0.A00
            if (r4 <= 0) goto L_0x003d
            java.lang.Object[] r3 = r0.A01
            r2 = 0
        L_0x001b:
            r9 = r3[r2]
            X.0XV r9 = (X.AnonymousClass0XV) r9
            X.0Ok r0 = r9.A0Q
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0039
            X.0Ok r0 = r9.A0Q
            X.0AK r0 = r0.A0G
            java.lang.Integer r1 = r0.A05
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0039
            boolean r0 = r9.A0p(r9.A0Q.A03())
            if (r0 == 0) goto L_0x0039
            r0 = 0
            r8.A0m(r0, r6)
        L_0x0039:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x001b
        L_0x003d:
            boolean r0 = r7.A0A
            r4 = 0
            if (r0 != 0) goto L_0x0054
            boolean r0 = r10.A0G
            if (r0 != 0) goto L_0x0083
            X.0BQ r0 = r10.BT2()
            boolean r0 = r0.A0i()
            if (r0 != 0) goto L_0x0083
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0083
        L_0x0054:
            r7.A09 = r4
            java.lang.Integer r3 = r7.A05
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r7.A05 = r0
            r7.A08(r4)
            X.0XV r2 = r7.A0F
            X.0to r0 = X.AnonymousClass0O0.A00(r2)
            X.0PW r1 = r0.getSnapshotObserver()
            X.0vk r0 = r10.A0N
            r1.A06(r2, r0, r4)
            r7.A05 = r3
            X.0BQ r0 = r10.BT2()
            boolean r0 = r0.A0i()
            if (r0 == 0) goto L_0x0081
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0081
            r10.requestLayout()
        L_0x0081:
            r7.A0A = r4
        L_0x0083:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0089
            r5.A02 = r6
        L_0x0089:
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0097
            r5.A07()
            X.0uk r0 = r5.A00
            if (r0 == 0) goto L_0x0097
            r5.A06()
        L_0x0097:
            r10.A0A = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AK.BhP():void");
    }

    public AnonymousClass0AK(C04700Ok r5) {
        this.A0P = r5;
        long A002 = C79.A00();
        this.A0D = A002;
        this.A0B = true;
        this.A0L = new C04670Oh(this);
        this.A0M = C06970a9.A02(new AnonymousClass0AK[16]);
        this.A07 = true;
        this.A0N = new C08560fI(this);
        this.A04 = A002;
        this.A0O = new C08690fV(this, r5);
    }

    private final void A01() {
        boolean z = this.A08;
        this.A08 = true;
        AnonymousClass0XV r3 = this.A0P.A0F;
        int i = 0;
        if (!z) {
            C04700Ok r1 = r3.A0Q;
            if (r1.A0E) {
                r3.A0m(true, true);
            } else if (r1.A0D) {
                r3.A0l(true, true);
            }
        }
        C01850Ad A0K2 = r3.A0K();
        C01850Ad A0w = r3.A0H().A0w();
        while (!C18070vi.A18(A0K2, A0w) && A0K2 != null) {
            if (A0K2.A1K()) {
                A0K2.A10();
            }
            A0K2 = A0K2.A0w();
        }
        C06970a9 A0F2 = r3.A0F();
        int i2 = A0F2.A00;
        if (i2 > 0) {
            Object[] objArr = A0F2.A01;
            do {
                AnonymousClass0XV r2 = (AnonymousClass0XV) objArr[i];
                if (r2.A0Q.A0G.A02 != Integer.MAX_VALUE) {
                    r2.A0Q.A0G.A01();
                    AnonymousClass0XV.A0A(r2);
                }
                i++;
            } while (i < i2);
        }
    }

    private final void A02() {
        Integer num;
        AnonymousClass0XV r3 = this.A0P.A0F;
        AnonymousClass000.A1D(r3);
        AnonymousClass0XV A0I2 = r3.A0I();
        if (A0I2 != null && r3.A0A == AnonymousClass00R.A0C) {
            int intValue = A0I2.A0Q.A05.intValue();
            if (intValue == 0) {
                num = AnonymousClass00R.A00;
            } else if (intValue != 2) {
                num = A0I2.A0A;
            } else {
                num = AnonymousClass00R.A01;
            }
            r3.A0A = num;
        }
    }

    public static final void A03(AnonymousClass0AK r4) {
        if (r4.A08) {
            int i = 0;
            r4.A08 = false;
            C06970a9 A0F2 = r4.A0P.A0F.A0F();
            int i2 = A0F2.A00;
            if (i2 > 0) {
                Object[] objArr = A0F2.A01;
                do {
                    A03(((AnonymousClass0XV) objArr[i]).A0Q.A0G);
                    i++;
                } while (i < i2);
            }
        }
    }

    private final void A04(C22821Di r6, float f, long j) {
        C04700Ok r3 = this.A0P;
        AnonymousClass0XV r4 = r3.A0F;
        if (!r4.A0E) {
            r3.A05 = AnonymousClass00R.A0C;
            this.A0D = j;
            this.A0C = f;
            this.A0E = r6;
            this.A0J = true;
            this.A0I = false;
            C17140to A002 = AnonymousClass0O0.A00(r4);
            if (r3.A09 || !this.A08) {
                this.A0L.A03 = false;
                r3.A07(false);
                this.A0F = r6;
                this.A04 = j;
                this.A00 = f;
                A002.getSnapshotObserver().A05(r4, this.A0O, false);
                this.A0F = null;
            } else {
                r3.A02().A1I(r6, f, j);
                A0e();
            }
            r3.A05 = AnonymousClass00R.A0Y;
            return;
        }
        throw AnonymousClass000.A0k("place is called on a deactivated node");
    }

    public int A0V() {
        return this.A0P.A02().A0V();
    }

    public int A0W() {
        return this.A0P.A02().A0W();
    }

    public final Constraints A0a() {
        if (this.A0H) {
            return Constraints.A05(this.A04);
        }
        return null;
    }

    public final List A0b() {
        AnonymousClass0XV r8 = this.A0P.A0F;
        r8.A0c();
        if (!this.A07) {
            return this.A0M.A07();
        }
        C06970a9 r7 = this.A0M;
        C06970a9 A0F2 = r8.A0F();
        int i = A0F2.A00;
        if (i > 0) {
            Object[] objArr = A0F2.A01;
            int i2 = 0;
            do {
                int i3 = r7.A00;
                AnonymousClass0AK r1 = ((AnonymousClass0XV) objArr[i2]).A0Q.A0G;
                if (i3 <= i2) {
                    r7.A0F(r1);
                } else {
                    r7.A01[i2] = r1;
                }
                i2++;
            } while (i2 < i);
        }
        r7.A0A(C06970a9.A00(r8.A0F()), r7.A00);
        this.A07 = false;
        return r7.A07();
    }

    public Map A0c() {
        if (!this.A0G) {
            C04700Ok r3 = this.A0P;
            Integer num = r3.A05;
            Integer num2 = AnonymousClass00R.A00;
            C04670Oh r0 = this.A0L;
            if (num == num2) {
                r0.A04 = true;
                if (r0.A01) {
                    r3.A09 = true;
                    r3.A0A = true;
                }
            } else {
                r0.A03 = true;
            }
        }
        AnonymousClass0BQ BT2 = BT2();
        BT2.A0g(true);
        BhP();
        BT2.A0g(false);
        return this.A0L.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.A0F.A0F();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0d() {
        /*
            r6 = this;
            X.0Ok r1 = r6.A0P
            int r0 = r1.A00
            if (r0 <= 0) goto L_0x0032
            X.0XV r0 = r1.A0F
            X.0a9 r0 = r0.A0F()
            int r5 = r0.A00
            if (r5 <= 0) goto L_0x0032
            java.lang.Object[] r4 = r0.A01
            r3 = 0
        L_0x0013:
            r2 = r4[r3]
            X.0XV r2 = (X.AnonymousClass0XV) r2
            X.0Ok r1 = r2.A0Q
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0021
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x0029
        L_0x0021:
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x0029
            r0 = 0
            r2.A0k(r0)
        L_0x0029:
            X.0AK r0 = r1.A0G
            r0.A0d()
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x0013
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AK.A0d():void");
    }

    public final boolean A0g() {
        if ((this.A06 == null && this.A0P.A02().BWC() == null) || !this.A0B) {
            return false;
        }
        this.A0B = false;
        this.A06 = this.A0P.A02().BWC();
        return true;
    }

    public final boolean A0h(long j) {
        boolean z;
        C04700Ok r6 = this.A0P;
        AnonymousClass0XV r7 = r6.A0F;
        boolean z2 = true;
        if (!r7.A0E) {
            C17140to A002 = AnonymousClass0O0.A00(r7);
            AnonymousClass0XV A0I2 = r7.A0I();
            if (r7.A0B || (A0I2 != null && A0I2.A0B)) {
                z = true;
            } else {
                z = false;
            }
            r7.A0B = z;
            if (r7.A0Q.A0E || this.A04 != j) {
                this.A0L.A04 = false;
                BLV(C12210lO.A00);
                this.A0H = true;
                long j2 = r6.A02().A03;
                A0X(j);
                C04700Ok.A01(r6, j);
                C01850Ad A022 = r6.A02();
                if (A022.A03 == j2 && A022.A01 == this.A01 && A022.A00 == this.A00) {
                    z2 = false;
                }
                A0Y(C25293Ccv.A00(A022.A01, A022.A00));
                return z2;
            }
            A002.BLW(r7, false);
            r7.A0b();
            return false;
        }
        throw AnonymousClass000.A0k("measure is called on a deactivated node");
    }

    public void BLV(C22821Di r5) {
        C06970a9 A0F2 = this.A0P.A0F.A0F();
        int i = A0F2.A00;
        if (i > 0) {
            Object[] objArr = A0F2.A01;
            int i2 = 0;
            do {
                r5.invoke(((AnonymousClass0XV) objArr[i2]).A0Q.A0G);
                i2++;
            } while (i2 < i);
        }
    }

    public int BLy(C04280Mo r7) {
        Integer num;
        C04700Ok r5 = this.A0P;
        AnonymousClass0XV A0I2 = r5.A0F.A0I();
        Integer num2 = null;
        if (A0I2 != null) {
            num = A0I2.A0Q.A05;
        } else {
            num = null;
        }
        if (num == AnonymousClass00R.A00) {
            this.A0L.A06 = true;
        } else {
            if (A0I2 != null) {
                num2 = A0I2.A0Q.A05;
            }
            if (num2 == AnonymousClass00R.A0C) {
                this.A0L.A05 = true;
            }
        }
        this.A0G = true;
        int BLy = r5.A02().BLy(r7);
        this.A0G = false;
        return BLy;
    }

    public AnonymousClass0BQ BT2() {
        return this.A0P.A0F.A0H();
    }

    public C17490uk BWB() {
        C04700Ok r0;
        AnonymousClass0XV A0I2 = this.A0P.A0F.A0I();
        if (A0I2 == null || (r0 = A0I2.A0Q) == null) {
            return null;
        }
        return r0.A0G;
    }

    public AnonymousClass0XJ Bjb(long j) {
        C04700Ok r1 = this.A0P;
        AnonymousClass0XV r3 = r1.A0F;
        Integer num = r3.A0A;
        Integer num2 = AnonymousClass00R.A0C;
        if (num == num2) {
            r3.A0Q();
        }
        if (AnonymousClass0F5.A00(r3)) {
            AnonymousClass0AL r0 = r1.A04;
            C18070vi.A0b(r0);
            r0.A02 = num2;
            r0.Bjb(j);
        }
        AnonymousClass0XV A0I2 = r3.A0I();
        if (A0I2 != null) {
            if (this.A05 == num2 || r3.A0B) {
                Integer num3 = A0I2.A0Q.A05;
                int intValue = num3.intValue();
                if (intValue == 0) {
                    num2 = AnonymousClass00R.A00;
                } else if (intValue == 2) {
                    num2 = AnonymousClass00R.A01;
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    throw AnonymousClass000.A0o(AnonymousClass0F4.A00(num3), A10);
                }
            } else {
                throw AnonymousClass000.A0n("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
        }
        this.A05 = num2;
        A0h(j);
        return this;
    }

    public void CFV() {
        AnonymousClass000.A1D(this.A0P.A0F);
    }

    public void requestLayout() {
        this.A0P.A0F.A0k(false);
    }

    public C04670Oh BMo() {
        return this.A0L;
    }

    public Object BWC() {
        return this.A06;
    }

    public boolean Bft() {
        return this.A08;
    }

    public int Bj9(int i) {
        A02();
        return this.A0P.A02().Bj9(i);
    }

    public int BjC(int i) {
        A02();
        return this.A0P.A02().BjC(i);
    }

    public int Bjv(int i) {
        A02();
        return this.A0P.A02().Bjv(i);
    }

    public int Bjy(int i) {
        A02();
        return this.A0P.A02().Bjy(i);
    }
}
