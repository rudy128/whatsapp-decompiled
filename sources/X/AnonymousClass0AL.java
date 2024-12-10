package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;

/* renamed from: X.0AL  reason: invalid class name */
public final class AnonymousClass0AL extends AnonymousClass0XJ implements C17500ul, C17490uk {
    public int A00 = Integer.MAX_VALUE;
    public int A01 = Integer.MAX_VALUE;
    public Integer A02 = AnonymousClass00R.A0C;
    public Object A03;
    public boolean A04 = true;
    public boolean A05;
    public boolean A06;
    public boolean A07 = true;
    public boolean A08;
    public long A09 = C79.A00();
    public Constraints A0A;
    public C22821Di A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final C04670Oh A0G = new C04670Oh(this);
    public final C06970a9 A0H = C06970a9.A02(new AnonymousClass0AL[16]);
    public final /* synthetic */ C04700Ok A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r2 != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r2 = r2.A0Q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0e() {
        /*
            r3 = this;
            r0 = 1
            r3.A0E = r0
            X.0Ok r0 = r3.A0I
            X.0XV r0 = r0.A0F
            X.0XV r2 = r0.A0I()
            boolean r0 = r3.A05
            r1 = 0
            if (r0 != 0) goto L_0x003f
            r3.A00()
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x003f
            if (r2 == 0) goto L_0x0042
            r2.A0j(r1)
        L_0x001c:
            boolean r0 = r3.A0F
            if (r0 != 0) goto L_0x003b
            X.0Ok r2 = r2.A0Q
            java.lang.Integer r1 = r2.A05
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x002c
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 != r0) goto L_0x003b
        L_0x002c:
            int r1 = r3.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x0045
            int r0 = r2.A01
            r3.A00 = r0
            int r0 = r0 + 1
            r2.A01 = r0
        L_0x003b:
            r3.BhP()
            return
        L_0x003f:
            if (r2 == 0) goto L_0x0042
            goto L_0x001c
        L_0x0042:
            r3.A00 = r1
            goto L_0x003b
        L_0x0045:
            java.lang.String r0 = "Place was called on a node which was placed already"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AL.A0e():void");
    }

    /* JADX INFO: finally extract failed */
    public final void A0f() {
        AnonymousClass0XV A0I2;
        try {
            this.A0F = true;
            if (this.A08) {
                this.A0E = false;
                boolean z = this.A05;
                A0Z((C22821Di) null, 0.0f, this.A09);
                if (z && !this.A0E && (A0I2 = this.A0I.A0F.A0I()) != null) {
                    A0I2.A0j(false);
                }
                this.A0F = false;
                return;
            }
            throw AnonymousClass000.A0n("replace() called on item that was not placed");
        } catch (Throwable th) {
            this.A0F = false;
            throw th;
        }
    }

    public void BhP() {
        this.A06 = true;
        C04670Oh r5 = this.A0G;
        r5.A07();
        C04700Ok r7 = this.A0I;
        if (r7.A0B) {
            A02();
        }
        C01880Ag A0v = BT2().A0v();
        C18070vi.A0b(A0v);
        if (r7.A0C || (!this.A0C && !A0v.A0i() && r7.A0B)) {
            r7.A0B = false;
            Integer num = r7.A05;
            r7.A05 = AnonymousClass00R.A0N;
            AnonymousClass0XV r2 = r7.A0F;
            C17140to A002 = AnonymousClass0O0.A00(r2);
            r7.A08(false);
            A002.getSnapshotObserver().A06(r2, new C08750fb(this, r7, A0v), true);
            r7.A05 = num;
            if (r7.A07 && A0v.A0i()) {
                requestLayout();
            }
            r7.A0C = false;
        }
        if (r5.A05) {
            r5.A02 = true;
        }
        if (r5.A01) {
            r5.A07();
            if (r5.A00 != null) {
                r5.A06();
            }
        }
        this.A06 = false;
    }

    public AnonymousClass0AL(C04700Ok r3) {
        this.A0I = r3;
        this.A03 = r3.A0G.A06;
    }

    private final void A00() {
        boolean z = this.A05;
        this.A05 = true;
        int i = 0;
        if (!z) {
            C04700Ok r1 = this.A0I;
            if (r1.A0D) {
                r1.A0F.A0l(true, true);
            }
        }
        C06970a9 A0F2 = this.A0I.A0F.A0F();
        int i2 = A0F2.A00;
        if (i2 > 0) {
            Object[] objArr = A0F2.A01;
            do {
                AnonymousClass0XV r2 = (AnonymousClass0XV) objArr[i];
                if (r2.A0Q.A0G.A02 != Integer.MAX_VALUE) {
                    AnonymousClass0AL r0 = r2.A0Q.A04;
                    C18070vi.A0b(r0);
                    r0.A00();
                    AnonymousClass0XV.A0A(r2);
                }
                i++;
            } while (i < i2);
        }
    }

    private final void A01() {
        if (this.A05) {
            int i = 0;
            this.A05 = false;
            C06970a9 A0F2 = this.A0I.A0F.A0F();
            int i2 = A0F2.A00;
            if (i2 > 0) {
                Object[] objArr = A0F2.A01;
                do {
                    AnonymousClass0AL r0 = ((AnonymousClass0XV) objArr[i]).A0Q.A04;
                    C18070vi.A0b(r0);
                    r0.A01();
                    i++;
                } while (i < i2);
            }
        }
    }

    private final void A02() {
        Integer num;
        AnonymousClass0XV r6 = this.A0I.A0F;
        C06970a9 A0F2 = r6.A0F();
        int i = A0F2.A00;
        if (i > 0) {
            Object[] objArr = A0F2.A01;
            int i2 = 0;
            do {
                AnonymousClass0XV r2 = (AnonymousClass0XV) objArr[i2];
                if (r2.A0Q.A0D) {
                    AnonymousClass0AL r0 = r2.A0Q.A04;
                    if (r0 != null) {
                        num = r0.A02;
                    } else {
                        num = AnonymousClass00R.A0C;
                    }
                    if (num == AnonymousClass00R.A00) {
                        C04700Ok r02 = r2.A0Q;
                        AnonymousClass0AL r22 = r02.A04;
                        C18070vi.A0b(r22);
                        Constraints A042 = r02.A04();
                        C18070vi.A0b(A042);
                        if (r22.A0h(A042.A0B())) {
                            r6.A0l(false, true);
                        }
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    private final void A03() {
        Integer num;
        AnonymousClass0XV r4 = this.A0I.A0F;
        r4.A0l(false, true);
        AnonymousClass0XV A0I2 = r4.A0I();
        if (A0I2 != null && r4.A0A == AnonymousClass00R.A0C) {
            int intValue = A0I2.A0Q.A05.intValue();
            if (intValue == 0) {
                num = AnonymousClass00R.A00;
            } else if (intValue != 2) {
                num = A0I2.A0A;
            } else {
                num = AnonymousClass00R.A01;
            }
            r4.A0A = num;
        }
    }

    public static final void A04(AnonymousClass0AL r5) {
        C06970a9 A0F2 = r5.A0I.A0F.A0F();
        int i = A0F2.A00;
        if (i > 0) {
            Object[] objArr = A0F2.A01;
            int i2 = 0;
            do {
                AnonymousClass0AL r2 = ((AnonymousClass0XV) objArr[i2]).A0Q.A04;
                C18070vi.A0b(r2);
                int i3 = r2.A01;
                int i4 = r2.A00;
                if (i3 != i4 && i4 == Integer.MAX_VALUE) {
                    r2.A01();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public static final void A05(AnonymousClass0AL r5) {
        C04700Ok r0 = r5.A0I;
        int i = 0;
        r0.A01 = 0;
        C06970a9 A0F2 = r0.A0F.A0F();
        int i2 = A0F2.A00;
        if (i2 > 0) {
            Object[] objArr = A0F2.A01;
            do {
                AnonymousClass0AL r2 = ((AnonymousClass0XV) objArr[i]).A0Q.A04;
                C18070vi.A0b(r2);
                r2.A01 = r2.A00;
                r2.A00 = Integer.MAX_VALUE;
                if (r2.A02 == AnonymousClass00R.A01) {
                    r2.A02 = AnonymousClass00R.A0C;
                }
                i++;
            } while (i < i2);
        }
    }

    public int A0V() {
        C01880Ag A0v = this.A0I.A02().A0v();
        C18070vi.A0b(A0v);
        return A0v.A0V();
    }

    public int A0W() {
        C01880Ag A0v = this.A0I.A02().A0v();
        C18070vi.A0b(A0v);
        return A0v.A0W();
    }

    public void A0Z(C22821Di r8, float f, long j) {
        C04700Ok r3 = this.A0I;
        AnonymousClass0XV r4 = r3.A0F;
        if (!r4.A0E) {
            r3.A05 = AnonymousClass00R.A0N;
            this.A08 = true;
            this.A0E = false;
            if (j != this.A09) {
                if (r3.A06 || r3.A07) {
                    r3.A0B = true;
                }
                A0d();
            }
            C17140to A002 = AnonymousClass0O0.A00(r4);
            if (r3.A0B || !this.A05) {
                r3.A07(false);
                this.A0G.A03 = false;
                A002.getSnapshotObserver().A05(r4, new C08760fc(r3, A002, j), true);
            } else {
                C01880Ag A0v = r3.A02().A0v();
                C18070vi.A0b(A0v);
                A0v.A0u(j);
                A0e();
            }
            this.A09 = j;
            this.A0B = r8;
            r3.A05 = AnonymousClass00R.A0Y;
            return;
        }
        throw AnonymousClass000.A0k("place is called on a deactivated node");
    }

    public final List A0b() {
        AnonymousClass0XV r8 = this.A0I.A0F;
        r8.A0F().A07();
        if (!this.A04) {
            return this.A0H.A07();
        }
        C06970a9 r7 = this.A0H;
        C06970a9 A0F2 = r8.A0F();
        int i = A0F2.A00;
        if (i > 0) {
            Object[] objArr = A0F2.A01;
            int i2 = 0;
            do {
                int i3 = r7.A00;
                AnonymousClass0AL r1 = ((AnonymousClass0XV) objArr[i2]).A0Q.A04;
                if (i3 <= i2) {
                    C18070vi.A0b(r1);
                    r7.A0F(r1);
                } else {
                    C18070vi.A0b(r1);
                    r7.A01[i2] = r1;
                }
                i2++;
            } while (i2 < i);
        }
        r7.A0A(C06970a9.A00(r8.A0F()), r7.A00);
        this.A04 = false;
        return r7.A07();
    }

    public Map A0c() {
        if (!this.A0C) {
            C04700Ok r3 = this.A0I;
            Integer num = r3.A05;
            Integer num2 = AnonymousClass00R.A01;
            C04670Oh r0 = this.A0G;
            if (num == num2) {
                r0.A04 = true;
                if (r0.A01) {
                    r3.A0B = true;
                    r3.A0C = true;
                }
            } else {
                r0.A03 = true;
            }
        }
        AnonymousClass0BQ BT2 = BT2();
        C01880Ag A0v = BT2.A0v();
        if (A0v != null) {
            A0v.A0g(true);
        }
        BhP();
        C01880Ag A0v2 = BT2.A0v();
        if (A0v2 != null) {
            A0v2.A0g(false);
        }
        return this.A0G.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.A0F.A0F();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0d() {
        /*
            r6 = this;
            X.0Ok r1 = r6.A0I
            int r0 = r1.A00
            if (r0 <= 0) goto L_0x0034
            X.0XV r0 = r1.A0F
            X.0a9 r0 = r0.A0F()
            int r5 = r0.A00
            if (r5 <= 0) goto L_0x0034
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
            r2.A0j(r0)
        L_0x0029:
            X.0AL r0 = r1.A04
            if (r0 == 0) goto L_0x0030
            r0.A0d()
        L_0x0030:
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x0013
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AL.A0d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r0.BWC() == null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0g() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.A03
            r1 = 0
            if (r0 != 0) goto L_0x0019
            X.0Ok r0 = r2.A0I
            X.0Ad r0 = r0.A02()
            X.0Ag r0 = r0.A0v()
            X.C18070vi.A0b(r0)
            java.lang.Object r0 = r0.BWC()
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            return r1
        L_0x0019:
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0018
            r2.A07 = r1
            X.0Ok r0 = r2.A0I
            X.0Ad r0 = r0.A02()
            X.0Ag r0 = r0.A0v()
            X.C18070vi.A0b(r0)
            java.lang.Object r0 = r0.BWC()
            r2.A03 = r0
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AL.A0g():boolean");
    }

    public final boolean A0h(long j) {
        boolean z;
        long A002;
        Constraints constraints;
        C04700Ok r6 = this.A0I;
        AnonymousClass0XV r5 = r6.A0F;
        if (!r5.A0E) {
            AnonymousClass0XV A0I2 = r5.A0I();
            if (r5.A0B || (A0I2 != null && A0I2.A0B)) {
                z = true;
            } else {
                z = false;
            }
            r5.A0B = z;
            if (r5.A0Q.A0D || (constraints = this.A0A) == null || constraints.A0B() != j) {
                this.A0A = Constraints.A05(j);
                A0X(j);
                this.A0G.A04 = false;
                BLV(C12180lL.A00);
                if (this.A0D) {
                    A002 = this.A03;
                } else {
                    A002 = C25293Ccv.A00(Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
                this.A0D = true;
                C01880Ag A0v = r6.A02().A0v();
                if (A0v != null) {
                    C04700Ok.A00(r6, j);
                    A0Y(C25293Ccv.A00(A0v.A01, A0v.A00));
                    if (AnonymousClass000.A0G(A002) == A0v.A01 && AnonymousClass000.A0H(A002) == A0v.A00) {
                        return false;
                    }
                    return true;
                }
                throw AnonymousClass000.A0n("Lookahead result from lookaheadRemeasure cannot be null");
            }
            C17140to r0 = r5.A08;
            if (r0 != null) {
                r0.BLW(r5, true);
            }
            r5.A0b();
            return false;
        }
        throw AnonymousClass000.A0k("measure is called on a deactivated node");
    }

    public void BLV(C22821Di r5) {
        C06970a9 A0F2 = this.A0I.A0F.A0F();
        int i = A0F2.A00;
        if (i > 0) {
            Object[] objArr = A0F2.A01;
            int i2 = 0;
            do {
                AnonymousClass0AL r0 = ((AnonymousClass0XV) objArr[i2]).A0Q.A04;
                C18070vi.A0b(r0);
                r5.invoke(r0);
                i2++;
            } while (i2 < i);
        }
    }

    public int BLy(C04280Mo r7) {
        Integer num;
        C04700Ok r5 = this.A0I;
        AnonymousClass0XV A0I2 = r5.A0F.A0I();
        Integer num2 = null;
        if (A0I2 != null) {
            num = A0I2.A0Q.A05;
        } else {
            num = null;
        }
        if (num == AnonymousClass00R.A01) {
            this.A0G.A06 = true;
        } else {
            if (A0I2 != null) {
                num2 = A0I2.A0Q.A05;
            }
            if (num2 == AnonymousClass00R.A0N) {
                this.A0G.A05 = true;
            }
        }
        this.A0C = true;
        C01880Ag A0v = r5.A02().A0v();
        C18070vi.A0b(A0v);
        int BLy = A0v.BLy(r7);
        this.A0C = false;
        return BLy;
    }

    public AnonymousClass0BQ BT2() {
        return this.A0I.A0F.A0H();
    }

    public C17490uk BWB() {
        C04700Ok r0;
        AnonymousClass0XV A0I2 = this.A0I.A0F.A0I();
        if (A0I2 == null || (r0 = A0I2.A0Q) == null) {
            return null;
        }
        return r0.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r1 == X.AnonymousClass00R.A0N) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0XJ Bjb(long r7) {
        /*
            r6 = this;
            X.0Ok r3 = r6.A0I
            X.0XV r4 = r3.A0F
            X.0XV r2 = r4.A0I()
            r1 = 0
            if (r2 == 0) goto L_0x0033
            X.0Ok r0 = r2.A0Q
            java.lang.Integer r0 = r0.A05
        L_0x000f:
            java.lang.Integer r5 = X.AnonymousClass00R.A01
            if (r0 == r5) goto L_0x001d
            if (r2 == 0) goto L_0x0019
            X.0Ok r0 = r2.A0Q
            java.lang.Integer r1 = r0.A05
        L_0x0019:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 != r0) goto L_0x0020
        L_0x001d:
            r0 = 0
            r3.A08 = r0
        L_0x0020:
            if (r2 == 0) goto L_0x005e
            java.lang.Integer r0 = r6.A02
            java.lang.Integer r3 = X.AnonymousClass00R.A0C
            if (r0 == r3) goto L_0x0035
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0033:
            r0 = r1
            goto L_0x000f
        L_0x0035:
            X.0Ok r0 = r2.A0Q
            java.lang.Integer r2 = r0.A05
            int r1 = r2.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x005b
            r0 = 0
            if (r1 == r0) goto L_0x005b
            r0 = 2
            if (r1 == r0) goto L_0x0061
            r0 = 3
            if (r1 == r0) goto L_0x0061
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass0F4.A00(r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        L_0x005b:
            java.lang.Integer r5 = X.AnonymousClass00R.A00
            goto L_0x0061
        L_0x005e:
            java.lang.Integer r5 = X.AnonymousClass00R.A0C
            r3 = r5
        L_0x0061:
            r6.A02 = r5
            java.lang.Integer r0 = r4.A0A
            if (r0 != r3) goto L_0x006a
            r4.A0Q()
        L_0x006a:
            r6.A0h(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AL.Bjb(long):X.0XJ");
    }

    public void CFV() {
        this.A0I.A0F.A0l(false, true);
    }

    public void requestLayout() {
        this.A0I.A0F.A0j(false);
    }

    public final Constraints A0a() {
        return this.A0A;
    }

    public C04670Oh BMo() {
        return this.A0G;
    }

    public Object BWC() {
        return this.A03;
    }

    public boolean Bft() {
        return this.A05;
    }

    public int Bj9(int i) {
        A03();
        C01880Ag A0v = this.A0I.A02().A0v();
        C18070vi.A0b(A0v);
        return A0v.Bj9(i);
    }

    public int BjC(int i) {
        A03();
        C01880Ag A0v = this.A0I.A02().A0v();
        C18070vi.A0b(A0v);
        return A0v.BjC(i);
    }

    public int Bjv(int i) {
        A03();
        C01880Ag A0v = this.A0I.A02().A0v();
        C18070vi.A0b(A0v);
        return A0v.Bjv(i);
    }

    public int Bjy(int i) {
        A03();
        C01880Ag A0v = this.A0I.A02().A0v();
        C18070vi.A0b(A0v);
        return A0v.Bjy(i);
    }
}
