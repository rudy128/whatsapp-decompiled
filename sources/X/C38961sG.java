package X;

import java.util.Arrays;

/* renamed from: X.1sG  reason: invalid class name and case insensitive filesystem */
public class C38961sG {
    public static int A0E = 1000;
    public static boolean A0F = true;
    public static long A0G;
    public static long A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C38981sI A04;
    public boolean A05;
    public C38991sJ[] A06;
    public int A07;
    public int A08;
    public int A09;
    public C38981sI A0A;
    public C38971sH[] A0B;
    public boolean[] A0C;
    public final C39001sK A0D;

    public static final void A05(C38981sI r13, C38961sG r14) {
        C38971sH r6;
        for (int i = 0; i < r14.A01; i++) {
            r14.A0C[i] = false;
        }
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 < r14.A01 * 2) {
                C38991sJ r8 = (C38991sJ) r13;
                C38971sH r0 = r8.A02;
                if (r0 != null) {
                    r14.A0C[r0.A02] = true;
                }
                boolean[] zArr = r14.A0C;
                if (r8 instanceof C39031sN) {
                    C39031sN r82 = (C39031sN) r8;
                    int i3 = -1;
                    for (int i4 = 0; i4 < r82.A00; i4++) {
                        C38971sH[] r1 = r82.A03;
                        C38971sH r10 = r1[i4];
                        if (!zArr[r10.A02]) {
                            r82.A02.A01 = r10;
                            if (i3 == -1) {
                                int i5 = 8;
                                while (true) {
                                    float f = r10.A09[i5];
                                    if (f <= 0.0f) {
                                        if (f < 0.0f) {
                                            break;
                                        }
                                        i5--;
                                        if (i5 < 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                C38971sH r11 = r1[i3];
                                int i6 = 8;
                                while (true) {
                                    float f2 = r11.A09[i6];
                                    float f3 = r10.A09[i6];
                                    if (f3 == f2) {
                                        i6--;
                                        if (i6 < 0) {
                                            break;
                                        }
                                    } else if (f3 >= f2) {
                                    }
                                }
                            }
                            i3 = i4;
                        }
                    }
                    if (i3 != -1) {
                        r6 = r82.A03[i3];
                    } else {
                        return;
                    }
                } else {
                    r6 = C38991sJ.A00(r8, (C38971sH) null, zArr);
                }
                if (r6 != null) {
                    int i7 = r6.A02;
                    if (!zArr[i7]) {
                        zArr[i7] = true;
                        float f4 = Float.MAX_VALUE;
                        int i8 = -1;
                        for (int i9 = 0; i9 < r14.A02; i9++) {
                            C38991sJ r12 = r14.A06[i9];
                            if (r12.A02.A06 != AnonymousClass00R.A00 && !r12.A04 && r12.A01.BFk(r6)) {
                                float BLx = r12.A01.BLx(r6);
                                if (BLx < 0.0f) {
                                    float f5 = (-r12.A00) / BLx;
                                    if (f5 < f4) {
                                        i8 = i9;
                                        f4 = f5;
                                    }
                                }
                            }
                        }
                        if (i8 > -1) {
                            C38991sJ r15 = r14.A06[i8];
                            r15.A02.A01 = -1;
                            r15.A04(r6);
                            C38971sH r02 = r15.A02;
                            r02.A01 = i8;
                            r02.A04(r15);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public C38971sH A09(Object obj) {
        C38971sH r2 = null;
        if (obj != null) {
            if (this.A01 + 1 >= this.A00) {
                A02();
            }
            if (obj instanceof C38921sC) {
                C38921sC r4 = (C38921sC) obj;
                r2 = r4.A02;
                if (r2 == null) {
                    r4.A03();
                    r2 = r4.A02;
                }
                int i = r2.A02;
                if (i != -1) {
                    if (i > this.A03 || this.A0D.A03[i] == null) {
                        r2.A00();
                    }
                }
                int i2 = this.A03 + 1;
                this.A03 = i2;
                this.A01++;
                r2.A02 = i2;
                r2.A06 = AnonymousClass00R.A00;
                this.A0D.A03[i2] = r2;
            }
        }
        return r2;
    }

    public void A0A() {
        C39001sK r2;
        C38971sH[] r10;
        C39031sN r1;
        C38981sI r0;
        int i = 0;
        while (true) {
            r2 = this.A0D;
            r10 = r2.A03;
            if (i >= r10.length) {
                break;
            }
            C38971sH r02 = r10[i];
            if (r02 != null) {
                r02.A00();
            }
            i++;
        }
        C39011sL r9 = r2.A02;
        C38971sH[] r8 = this.A0B;
        int i2 = this.A09;
        C39021sM r92 = (C39021sM) r9;
        int length = r8.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C38971sH r5 = r8[i3];
            int i4 = r92.A00;
            Object[] objArr = r92.A01;
            if (i4 < 256) {
                objArr[i4] = r5;
                r92.A00 = i4 + 1;
            }
        }
        this.A09 = 0;
        Arrays.fill(r10, (Object) null);
        this.A03 = 0;
        C38991sJ r12 = (C38991sJ) this.A04;
        if (r12 instanceof C39031sN) {
            C39031sN r13 = (C39031sN) r12;
            r13.A00 = 0;
            r1 = r13;
        } else {
            r12.A01.clear();
            r12.A02 = null;
            r1 = r12;
        }
        r1.A00 = 0.0f;
        this.A01 = 1;
        for (int i5 = 0; i5 < this.A02; i5++) {
        }
        A03();
        this.A02 = 0;
        if (A0F) {
            r0 = new C39071sR(r2, this);
        } else {
            r0 = new C38991sJ(r2);
        }
        this.A0A = r0;
    }

    public static int A00(Object obj) {
        C38971sH r0 = ((C38921sC) obj).A02;
        if (r0 != null) {
            return (int) (r0.A00 + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.1sH} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C38971sH A01(java.lang.Integer r6) {
        /*
            r5 = this;
            X.1sK r0 = r5.A0D
            X.1sL r4 = r0.A02
            X.1sM r4 = (X.C39021sM) r4
            int r0 = r4.A00
            r2 = 0
            if (r0 <= 0) goto L_0x0043
            int r1 = r0 + -1
            java.lang.Object[] r0 = r4.A01
            r3 = r0[r1]
            r0[r1] = r2
            r4.A00 = r1
        L_0x0015:
            X.1sH r3 = (X.C38971sH) r3
            if (r3 != 0) goto L_0x003f
            X.1sH r3 = new X.1sH
            r3.<init>(r6)
        L_0x001e:
            r3.A06 = r6
            int r1 = r5.A09
            int r0 = A0E
            if (r1 < r0) goto L_0x0034
            int r1 = r0 * 2
            A0E = r1
            X.1sH[] r0 = r5.A0B
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            X.1sH[] r0 = (X.C38971sH[]) r0
            r5.A0B = r0
        L_0x0034:
            X.1sH[] r2 = r5.A0B
            int r1 = r5.A09
            int r0 = r1 + 1
            r5.A09 = r0
            r2[r1] = r3
            return r3
        L_0x003f:
            r3.A00()
            goto L_0x001e
        L_0x0043:
            r3 = r2
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38961sG.A01(java.lang.Integer):X.1sH");
    }

    private void A02() {
        int i = this.A07 * 2;
        this.A07 = i;
        this.A06 = (C38991sJ[]) Arrays.copyOf(this.A06, i);
        C39001sK r2 = this.A0D;
        r2.A03 = (C38971sH[]) Arrays.copyOf(r2.A03, this.A07);
        int i2 = this.A07;
        this.A0C = new boolean[i2];
        this.A00 = i2;
        this.A08 = i2;
    }

    private void A03() {
        int i = 0;
        if (A0F) {
            while (true) {
                C38991sJ[] r5 = this.A06;
                if (i < r5.length) {
                    C38991sJ r4 = r5[i];
                    if (r4 != null) {
                        C39021sM r3 = (C39021sM) this.A0D.A01;
                        int i2 = r3.A00;
                        Object[] objArr = r3.A01;
                        if (i2 < 256) {
                            objArr[i2] = r4;
                            r3.A00 = i2 + 1;
                        }
                    }
                    r5[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C38991sJ[] r52 = this.A06;
                if (i < r52.length) {
                    C38991sJ r42 = r52[i];
                    if (r42 != null) {
                        C39021sM r32 = (C39021sM) this.A0D.A00;
                        int i3 = r32.A00;
                        Object[] objArr2 = r32.A01;
                        if (i3 < 256) {
                            objArr2[i3] = r42;
                            r32.A00 = i3 + 1;
                        }
                    }
                    r52[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final void A04(C38991sJ r8) {
        C39011sL r3;
        boolean z = A0F;
        C38991sJ[] r6 = this.A06;
        int i = this.A02;
        C38991sJ r4 = r6[i];
        if (z) {
            if (r4 != null) {
                r3 = this.A0D.A01;
            }
            r6[i] = r8;
            C38971sH r1 = r8.A02;
            r1.A01 = i;
            this.A02 = i + 1;
            r1.A04(r8);
        }
        if (r4 != null) {
            r3 = this.A0D.A00;
        }
        r6[i] = r8;
        C38971sH r12 = r8.A02;
        r12.A01 = i;
        this.A02 = i + 1;
        r12.A04(r8);
        C39021sM r32 = (C39021sM) r3;
        int i2 = r32.A00;
        Object[] objArr = r32.A01;
        if (i2 < 256) {
            objArr[i2] = r4;
            r32.A00 = i2 + 1;
        }
        r6[i] = r8;
        C38971sH r122 = r8.A02;
        r122.A01 = i;
        this.A02 = i + 1;
        r122.A04(r8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.1sJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.1sJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.1sJ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C38991sJ A06() {
        /*
            r8 = this;
            boolean r0 = A0F
            r6 = 1
            X.1sK r5 = r8.A0D
            if (r0 == 0) goto L_0x0032
            X.1sL r3 = r5.A01
            X.1sM r3 = (X.C39021sM) r3
            int r0 = r3.A00
            r2 = 0
            if (r0 <= 0) goto L_0x0030
            int r1 = r0 + -1
            java.lang.Object[] r0 = r3.A01
            r4 = r0[r1]
            r0[r1] = r2
            r3.A00 = r1
        L_0x001b:
            X.1sJ r4 = (X.C38991sJ) r4
            if (r4 != 0) goto L_0x0056
            X.1sR r4 = new X.1sR
            r4.<init>(r5, r8)
            long r0 = A0H
            long r0 = r0 + r6
            A0H = r0
        L_0x0029:
            int r0 = X.C38971sH.A0C
            int r0 = r0 + 1
            X.C38971sH.A0C = r0
            return r4
        L_0x0030:
            r4 = r2
            goto L_0x001b
        L_0x0032:
            X.1sL r3 = r5.A00
            X.1sM r3 = (X.C39021sM) r3
            int r0 = r3.A00
            r2 = 0
            if (r0 <= 0) goto L_0x0054
            int r1 = r0 + -1
            java.lang.Object[] r0 = r3.A01
            r4 = r0[r1]
            r0[r1] = r2
            r3.A00 = r1
        L_0x0045:
            X.1sJ r4 = (X.C38991sJ) r4
            if (r4 != 0) goto L_0x0056
            X.1sJ r4 = new X.1sJ
            r4.<init>(r5)
            long r0 = A0G
            long r0 = r0 + r6
            A0G = r0
            goto L_0x0029
        L_0x0054:
            r4 = r2
            goto L_0x0045
        L_0x0056:
            r0 = 0
            r4.A02 = r0
            X.1sO r0 = r4.A01
            r0.clear()
            r0 = 0
            r4.A00 = r0
            r0 = 0
            r4.A04 = r0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38961sG.A06():X.1sJ");
    }

    public C38971sH A07() {
        if (this.A01 + 1 >= this.A00) {
            A02();
        }
        C38971sH A012 = A01(AnonymousClass00R.A0C);
        int i = this.A03 + 1;
        this.A03 = i;
        this.A01++;
        A012.A02 = i;
        this.A0D.A03[i] = A012;
        return A012;
    }

    public C38971sH A08(int i) {
        if (this.A01 + 1 >= this.A00) {
            A02();
        }
        C38971sH A012 = A01(AnonymousClass00R.A0N);
        int i2 = this.A03 + 1;
        this.A03 = i2;
        this.A01++;
        A012.A02 = i2;
        A012.A04 = i;
        this.A0D.A03[i2] = A012;
        C38991sJ r4 = (C38991sJ) this.A04;
        if (r4 instanceof C39031sN) {
            C39031sN r42 = (C39031sN) r4;
            r42.A02.A01 = A012;
            float[] fArr = A012.A09;
            Arrays.fill(fArr, 0.0f);
            fArr[A012.A04] = 1.0f;
            C39031sN.A01(r42, A012);
            return A012;
        }
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        r4.A01.CCz(A012, f);
        return A012;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.C38991sJ r18) {
        /*
            r17 = this;
            r3 = r17
            int r0 = r3.A02
            r2 = 1
            int r1 = r0 + 1
            int r0 = r3.A08
            if (r1 >= r0) goto L_0x0013
            int r0 = r3.A01
            int r1 = r0 + 1
            int r0 = r3.A00
            if (r1 < r0) goto L_0x0016
        L_0x0013:
            r3.A02()
        L_0x0016:
            r4 = r18
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x019c
            X.1sJ[] r0 = r3.A06
            int r0 = r0.length
            if (r0 != 0) goto L_0x012c
        L_0x0021:
            X.1sH r0 = r4.A02
            if (r0 != 0) goto L_0x0035
            float r1 = r4.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            X.1sO r0 = r4.A01
            int r0 = r0.BQ2()
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            return
        L_0x0035:
            float r1 = r4.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r1 * r0
            r4.A00 = r1
            X.1sO r0 = r4.A01
            r0.Bdo()
        L_0x0046:
            X.1sO r8 = r4.A01
            int r7 = r8.BQ2()
            r9 = 0
            r16 = 0
            r15 = r9
            r6 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
        L_0x0055:
            if (r6 >= r7) goto L_0x009f
            float r10 = r8.BbH(r6)
            X.1sH r5 = r8.BbG(r6)
            java.lang.Integer r1 = r5.A06
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0080
            if (r9 == 0) goto L_0x0077
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0077
            if (r14 != 0) goto L_0x0074
            int r0 = r5.A05
            if (r0 > r2) goto L_0x0074
            r12 = r10
            r9 = r5
            r14 = 1
        L_0x0074:
            int r6 = r6 + 1
            goto L_0x0055
        L_0x0077:
            int r0 = r5.A05
            r14 = 1
            if (r0 <= r2) goto L_0x007d
            r14 = 0
        L_0x007d:
            r12 = r10
            r9 = r5
            goto L_0x0074
        L_0x0080:
            if (r9 != 0) goto L_0x0074
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            if (r15 == 0) goto L_0x0096
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0096
            if (r13 != 0) goto L_0x0074
            int r0 = r5.A05
            if (r0 > r2) goto L_0x0074
            r11 = r10
            r15 = r5
            r13 = 1
            goto L_0x0074
        L_0x0096:
            int r0 = r5.A05
            r13 = 1
            if (r0 <= r2) goto L_0x009c
            r13 = 0
        L_0x009c:
            r11 = r10
            r15 = r5
            goto L_0x0074
        L_0x009f:
            if (r9 != 0) goto L_0x0100
            r9 = r15
            if (r15 != 0) goto L_0x0100
            r1 = 1
        L_0x00a5:
            X.1sO r0 = r4.A01
            int r0 = r0.BQ2()
            if (r0 != 0) goto L_0x00af
            r4.A04 = r2
        L_0x00af:
            if (r1 == 0) goto L_0x0189
            int r0 = r3.A01
            int r1 = r0 + 1
            int r0 = r3.A00
            if (r1 < r0) goto L_0x00bc
            r3.A02()
        L_0x00bc:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            X.1sH r7 = r3.A01(r0)
            int r0 = r3.A03
            int r1 = r0 + 1
            r3.A03 = r1
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            r7.A02 = r1
            X.1sK r0 = r3.A0D
            X.1sH[] r0 = r0.A03
            r0[r1] = r7
            r4.A02 = r7
            r3.A04(r4)
            X.1sI r8 = r3.A0A
            X.1sJ r8 = (X.C38991sJ) r8
            r0 = 0
            r8.A02 = r0
            X.1sO r0 = r8.A01
            r0.clear()
            r6 = 0
        L_0x00e8:
            X.1sO r1 = r4.A01
            int r0 = r1.BQ2()
            if (r6 >= r0) goto L_0x0105
            X.1sH r5 = r1.BbG(r6)
            float r1 = r1.BbH(r6)
            X.1sO r0 = r8.A01
            r0.BAn(r5, r1, r2)
            int r6 = r6 + 1
            goto L_0x00e8
        L_0x0100:
            r4.A04(r9)
            r1 = 0
            goto L_0x00a5
        L_0x0105:
            X.1sI r0 = r3.A0A
            A05(r0, r3)
            int r1 = r7.A01
            r0 = -1
            if (r1 != r0) goto L_0x018a
            X.1sH r0 = r4.A02
            if (r0 != r7) goto L_0x011d
            r0 = 0
            X.1sH r0 = X.C38991sJ.A00(r4, r7, r0)
            if (r0 == 0) goto L_0x011d
            r4.A04(r0)
        L_0x011d:
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0126
            X.1sH r0 = r4.A02
            r0.A04(r4)
        L_0x0126:
            int r0 = r3.A02
            int r0 = r0 - r2
            r3.A02 = r0
            goto L_0x018a
        L_0x012c:
            X.1sO r8 = r4.A01
            int r7 = r8.BQ2()
            r6 = 0
        L_0x0133:
            if (r6 >= r7) goto L_0x014a
            X.1sH r5 = r8.BbG(r6)
            int r1 = r5.A01
            r0 = -1
            if (r1 != r0) goto L_0x0142
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0147
        L_0x0142:
            java.util.ArrayList r0 = r4.A03
            r0.add(r5)
        L_0x0147:
            int r6 = r6 + 1
            goto L_0x0133
        L_0x014a:
            java.util.ArrayList r9 = r4.A03
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x0021
            java.util.Iterator r8 = r9.iterator()
        L_0x0156:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0185
            java.lang.Object r7 = r8.next()
            X.1sH r7 = (X.C38971sH) r7
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x017b
            X.1sO r6 = r4.A01
            float r5 = r6.BLx(r7)
            float r1 = r4.A00
            float r0 = r7.A00
            float r0 = r0 * r5
            float r1 = r1 + r0
            r4.A00 = r1
            r6.CET(r7, r2)
            r7.A03(r4)
            goto L_0x0156
        L_0x017b:
            X.1sJ[] r1 = r3.A06
            int r0 = r7.A01
            r0 = r1[r0]
            r4.A03(r0, r2)
            goto L_0x0156
        L_0x0185:
            r9.clear()
            goto L_0x012c
        L_0x0189:
            r2 = 0
        L_0x018a:
            X.1sH r0 = r4.A02
            if (r0 == 0) goto L_0x0034
            java.lang.Integer r1 = r0.A06
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x019a
            float r0 = r4.A00
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
        L_0x019a:
            if (r2 != 0) goto L_0x0034
        L_0x019c:
            r3.A04(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38961sG.A0B(X.1sJ):void");
    }

    public void A0C(C38971sH r4, int i) {
        C39041sO r1;
        float f;
        int i2 = r4.A01;
        if (i2 == -1) {
            r4.A01((float) i);
            return;
        }
        C38991sJ r12 = this.A06[i2];
        if (!r12.A04) {
            if (r12.A01.BQ2() == 0) {
                r12.A04 = true;
            } else {
                C38991sJ A062 = A06();
                if (i < 0) {
                    A062.A00 = (float) (-i);
                    r1 = A062.A01;
                    f = 1.0f;
                } else {
                    A062.A00 = (float) i;
                    r1 = A062.A01;
                    f = -1.0f;
                }
                r1.CCz(r4, f);
                A0B(A062);
                return;
            }
        }
        r12.A00 = (float) i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C38971sH r7, X.C38971sH r8, int r9, int r10) {
        /*
            r6 = this;
            r5 = 8
            if (r10 != r5) goto L_0x0015
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x0015
            int r1 = r7.A01
            r0 = -1
            if (r1 != r0) goto L_0x0015
            float r1 = r8.A00
            float r0 = (float) r9
            float r1 = r1 + r0
            r7.A01(r1)
            return
        L_0x0015:
            X.1sJ r3 = r6.A06()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x004b
            r1 = 0
            if (r9 >= 0) goto L_0x0024
            int r9 = -r9
            r1 = 1
        L_0x0024:
            float r0 = (float) r9
            r3.A00 = r0
            if (r1 == 0) goto L_0x004b
            X.1sO r0 = r3.A01
            r0.CCz(r7, r4)
            X.1sO r0 = r3.A01
            r0.CCz(r8, r2)
        L_0x0033:
            if (r10 == r5) goto L_0x0047
            X.1sO r1 = r3.A01
            X.1sH r0 = r6.A08(r10)
            r1.CCz(r0, r4)
            X.1sO r1 = r3.A01
            X.1sH r0 = r6.A08(r10)
            r1.CCz(r0, r2)
        L_0x0047:
            r6.A0B(r3)
            return
        L_0x004b:
            X.1sO r0 = r3.A01
            r0.CCz(r7, r2)
            X.1sO r0 = r3.A01
            r0.CCz(r8, r4)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38961sG.A0D(X.1sH, X.1sH, int, int):void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.1sN, X.1sI, X.1sJ] */
    public C38961sG() {
        C38981sI r0;
        this.A03 = 0;
        this.A07 = 32;
        this.A00 = 32;
        this.A06 = null;
        this.A05 = false;
        this.A0C = new boolean[32];
        this.A01 = 1;
        this.A02 = 0;
        this.A08 = 32;
        this.A0B = new C38971sH[A0E];
        this.A09 = 0;
        this.A06 = new C38991sJ[32];
        A03();
        C39001sK r3 = new C39001sK();
        this.A0D = r3;
        ? r2 = new C38991sJ(r3);
        r2.A03 = new C38971sH[128];
        r2.A04 = new C38971sH[128];
        r2.A00 = 0;
        r2.A02 = new C39061sQ(r2, r2);
        r2.A01 = r3;
        this.A04 = r2;
        if (A0F) {
            r0 = new C39071sR(r3, this);
        } else {
            r0 = new C38991sJ(r3);
        }
        this.A0A = r0;
    }

    public void A0E(C38971sH r5, C38971sH r6, int i, int i2) {
        C38991sJ A062 = A06();
        C38971sH A072 = A07();
        A072.A04 = 0;
        A062.A05(r5, r6, A072, i);
        if (i2 != 8) {
            int BLx = (int) (A062.A01.BLx(A072) * -1.0f);
            A062.A01.CCz(A08(i2), (float) BLx);
        }
        A0B(A062);
    }

    public void A0F(C38971sH r5, C38971sH r6, int i, int i2) {
        C38991sJ A062 = A06();
        C38971sH A072 = A07();
        A072.A04 = 0;
        A062.A06(r5, r6, A072, i);
        if (i2 != 8) {
            int BLx = (int) (A062.A01.BLx(A072) * -1.0f);
            A062.A01.CCz(A08(i2), (float) BLx);
        }
        A0B(A062);
    }

    public void A0G(C38971sH r7, C38971sH r8, C38971sH r9, C38971sH r10, float f, int i, int i2, int i3) {
        float f2;
        int i4;
        C38991sJ A062 = A06();
        if (r8 == r9) {
            A062.A01.CCz(r7, 1.0f);
            A062.A01.CCz(r10, 1.0f);
            A062.A01.CCz(r8, -2.0f);
        } else {
            if (f == 0.5f) {
                A062.A01.CCz(r7, 1.0f);
                A062.A01.CCz(r8, -1.0f);
                A062.A01.CCz(r9, -1.0f);
                A062.A01.CCz(r10, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                }
            } else {
                if (f <= 0.0f) {
                    A062.A01.CCz(r7, -1.0f);
                    A062.A01.CCz(r8, 1.0f);
                    f2 = (float) i;
                } else if (f >= 1.0f) {
                    A062.A01.CCz(r10, -1.0f);
                    A062.A01.CCz(r9, 1.0f);
                    i4 = -i2;
                } else {
                    float f3 = 1.0f - f;
                    A062.A01.CCz(r7, f3 * 1.0f);
                    A062.A01.CCz(r8, f3 * -1.0f);
                    A062.A01.CCz(r9, -1.0f * f);
                    A062.A01.CCz(r10, f * 1.0f);
                    if (i > 0 || i2 > 0) {
                        f2 = (((float) (-i)) * f3) + (((float) i2) * f);
                    }
                }
                A062.A00 = f2;
            }
            f2 = (float) i4;
            A062.A00 = f2;
        }
        if (i3 != 8) {
            A062.A01.CCz(A08(i3), 1.0f);
            A062.A01.CCz(A08(i3), -1.0f);
        }
        A0B(A062);
    }
}
