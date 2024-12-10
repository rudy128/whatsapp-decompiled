package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.0Qe  reason: invalid class name */
public final class AnonymousClass0Qe {
    public boolean A00;
    public Constraints A01;
    public final C06970a9 A02 = C06970a9.A02(new C16480sK[16]);
    public final C03650Je A03 = new C03650Je();
    public final AnonymousClass0XV A04;
    public final C04340Mu A05 = new C04340Mu();
    public final C06970a9 A06 = C06970a9.A02(new C03250Hf[16]);

    private final void A02(AnonymousClass0XV r3, boolean z) {
        boolean z2;
        C04700Ok r0 = r3.A0Q;
        if (z) {
            z2 = r0.A0D;
        } else {
            z2 = r0.A0E;
        }
        if (z2) {
            C03650Je r1 = this.A03;
            boolean contains = r1.A00.A00.contains(r3);
            if (!z) {
                if (!contains) {
                    contains = r1.A01.A00.contains(r3);
                }
                A08(r3, z, false);
            }
            if (!contains) {
                return;
            }
            A08(r3, z, false);
        }
    }

    private final void A03(AnonymousClass0XV r2, boolean z) {
        Constraints constraints;
        if (r2 == this.A04) {
            constraints = this.A01;
            C18070vi.A0b(constraints);
        } else {
            constraints = null;
        }
        if (z) {
            A06(r2, constraints);
        } else {
            A07(r2, constraints);
        }
    }

    public static final boolean A04(AnonymousClass0XV r2) {
        AnonymousClass0AK r22 = r2.A0Q.A0G;
        if (r22.A05 != AnonymousClass00R.A00) {
            C04670Oh r0 = r22.A0L;
            r0.A07();
            if (r0.A00 != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A05(AnonymousClass0XV r3) {
        Integer num;
        C04670Oh r0;
        AnonymousClass0AL r32 = r3.A0Q.A04;
        if (r32 != null) {
            num = r32.A02;
        } else {
            num = AnonymousClass00R.A0C;
        }
        if (num != AnonymousClass00R.A00) {
            if (r32 == null || (r0 = r32.A0G) == null) {
                return false;
            }
            r0.A07();
            if (r0.A00 != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    private final boolean A06(AnonymousClass0XV r6, Constraints constraints) {
        boolean A0C;
        Integer num;
        if (r6.A07 == null) {
            return false;
        }
        if (constraints != null) {
            A0C = r6.A0o(constraints);
        } else {
            A0C = r6.A0o(r6.A0Q.A04());
        }
        AnonymousClass0XV A0I = r6.A0I();
        if (A0C && A0I != null) {
            if (A0I.A07 == null) {
                A0G(A0I, false);
            } else {
                AnonymousClass0AL r0 = r6.A0Q.A04;
                if (r0 != null) {
                    num = r0.A02;
                } else {
                    num = AnonymousClass00R.A0C;
                }
                if (num == AnonymousClass00R.A00) {
                    A0E(A0I, false);
                    return A0C;
                } else if (num == AnonymousClass00R.A01) {
                    A0D(A0I, false);
                    return A0C;
                }
            }
        }
        return A0C;
    }

    private final boolean A07(AnonymousClass0XV r5, Constraints constraints) {
        boolean A0D;
        if (constraints != null) {
            A0D = r5.A0p(constraints);
        } else {
            A0D = r5.A0p(r5.A0Q.A03());
        }
        AnonymousClass0XV A0I = r5.A0I();
        if (A0D && A0I != null) {
            Integer num = r5.A0Q.A0G.A05;
            if (num == AnonymousClass00R.A00) {
                A0G(A0I, false);
            } else if (num == AnonymousClass00R.A01) {
                A0F(A0I, false);
                return A0D;
            }
        }
        return A0D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ee, code lost:
        if (r0.A00 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A08(X.AnonymousClass0XV r10, boolean r11, boolean r12) {
        /*
            r9 = this;
            boolean r0 = r10.A0E
            r4 = 0
            if (r0 != 0) goto L_0x00f2
            X.0Ok r3 = r10.A0Q
            X.0AK r2 = r3.A0G
            boolean r0 = r2.A08
            r1 = 1
            if (r0 != 0) goto L_0x001c
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x001c
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x00be
            boolean r0 = A04(r10)
            if (r0 == 0) goto L_0x00be
        L_0x001c:
            boolean r0 = r3.A0D
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x00a1
            r8 = 0
            r0 = 0
        L_0x0026:
            if (r12 == 0) goto L_0x0069
            if (r0 != 0) goto L_0x002e
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0041
        L_0x002e:
            java.lang.Boolean r5 = r10.A0O()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 == 0) goto L_0x0041
            if (r11 == 0) goto L_0x0041
            r10.A0X()
        L_0x0041:
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0069
            X.0XV r3 = r9.A04
            if (r10 == r3) goto L_0x005b
            X.0XV r0 = r10.A0I()
            if (r0 == 0) goto L_0x0069
            X.0Ok r0 = r0.A0Q
            X.0AK r0 = r0.A0G
            boolean r0 = r0.A08
            if (r0 != r1) goto L_0x0069
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0069
        L_0x005b:
            if (r10 != r3) goto L_0x0094
            r10.A0Z()
        L_0x0060:
            X.0Mu r0 = r9.A05
            X.0a9 r0 = r0.A01
            r0.A0F(r10)
            r10.A0F = r1
        L_0x0069:
            X.0a9 r7 = r9.A06
            int r6 = r7.A00
            if (r6 == 0) goto L_0x008f
            if (r6 <= 0) goto L_0x008c
            java.lang.Object[] r5 = r7.A01
        L_0x0073:
            r3 = r5[r4]
            X.0Hf r3 = (X.C03250Hf) r3
            X.0XV r0 = r3.A00
            X.0to r0 = r0.A08
            if (r0 == 0) goto L_0x0088
            boolean r2 = r3.A02
            X.0XV r1 = r3.A00
            boolean r0 = r3.A01
            if (r2 != 0) goto L_0x0090
            r9.A0G(r1, r0)
        L_0x0088:
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x0073
        L_0x008c:
            r7.A08()
        L_0x008f:
            return r8
        L_0x0090:
            r9.A0E(r1, r0)
            goto L_0x0088
        L_0x0094:
            java.lang.Integer r3 = r10.A0A
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r3 != r0) goto L_0x009d
            X.AnonymousClass0XV.A09(r10)
        L_0x009d:
            r2.A0f()
            goto L_0x0060
        L_0x00a1:
            X.0XV r0 = r9.A04
            if (r10 != r0) goto L_0x00bc
            androidx.compose.ui.unit.Constraints r5 = r9.A01
            X.C18070vi.A0b(r5)
        L_0x00aa:
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x00ba
            if (r11 == 0) goto L_0x00ba
            boolean r0 = r9.A06(r10, r5)
        L_0x00b4:
            boolean r8 = r9.A07(r10, r5)
            goto L_0x0026
        L_0x00ba:
            r0 = 0
            goto L_0x00b4
        L_0x00bc:
            r5 = 0
            goto L_0x00aa
        L_0x00be:
            java.lang.Boolean r5 = r10.A0O()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 != 0) goto L_0x001c
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x00d8
            boolean r0 = A05(r10)
            if (r0 == 0) goto L_0x00d8
            goto L_0x001c
        L_0x00d8:
            X.0Oh r0 = r2.A0L
            r0.A07()
            X.0uk r0 = r0.A00
            if (r0 != 0) goto L_0x001c
            X.0AL r0 = r3.A04
            if (r0 == 0) goto L_0x00f2
            X.0Oh r0 = r0.A0G
            if (r0 == 0) goto L_0x00f2
            r0.A07()
            X.0uk r0 = r0.A00
            if (r0 == 0) goto L_0x00f2
            goto L_0x001c
        L_0x00f2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qe.A08(X.0XV, boolean, boolean):boolean");
    }

    public final void A09() {
        C03650Je r4 = this.A03;
        if (!r4.A02()) {
            AnonymousClass0XV r3 = this.A04;
            if (r3.A08 == null) {
                throw AnonymousClass000.A0k("performMeasureAndLayout called with unattached root");
            } else if (!r3.A0Q.A0G.A08) {
                throw AnonymousClass000.A0k("performMeasureAndLayout called with unplaced root");
            } else if (!(!this.A00)) {
                throw AnonymousClass000.A0k("performMeasureAndLayout called during measure layout");
            } else if (this.A01 != null) {
                this.A00 = true;
                try {
                    if (!r4.A00.A00.isEmpty()) {
                        if (r3.A07 != null) {
                            A03(r3, true);
                        } else {
                            A00(r3);
                        }
                    }
                    A03(r3, false);
                } finally {
                    this.A00 = false;
                }
            }
        }
    }

    public final void A0A(long j) {
        Constraints constraints = this.A01;
        if (constraints == null || constraints.A0B() != j) {
            boolean z = true;
            if (!this.A00) {
                this.A01 = Constraints.A05(j);
                AnonymousClass0XV r2 = this.A04;
                AnonymousClass0XV r1 = r2.A07;
                if (r1 != null) {
                    r2.A0Q.A0D = true;
                }
                r2.A0Q.A0E = true;
                C03650Je r0 = this.A03;
                if (r1 == null) {
                    z = false;
                }
                r0.A01(r2, z);
                return;
            }
            throw AnonymousClass000.A0k("updateRootConstraints called while measuring");
        }
    }

    public final void A0B(AnonymousClass0XV r6, long j) {
        if (!r6.A0E) {
            AnonymousClass0XV r1 = this.A04;
            if (!(!r6.equals(r1))) {
                throw AnonymousClass000.A0k("measureAndLayout called on root");
            } else if (r1.A08 == null) {
                throw AnonymousClass000.A0k("performMeasureAndLayout called with unattached root");
            } else if (!r1.A0Q.A0G.A08) {
                throw AnonymousClass000.A0k("performMeasureAndLayout called with unplaced root");
            } else if (!this.A00) {
                if (this.A01 != null) {
                    this.A00 = true;
                    try {
                        this.A03.A00(r6);
                        boolean A062 = A06(r6, Constraints.A05(j));
                        A07(r6, Constraints.A05(j));
                        if ((A062 || r6.A0Q.A0B) && C18070vi.A18(r6.A0O(), true)) {
                            r6.A0X();
                        }
                        C04700Ok r12 = r6.A0Q;
                        if (r12.A09) {
                            AnonymousClass0AK r2 = r12.A0G;
                            if (r2.A08) {
                                if (r6.A0A == AnonymousClass00R.A0C) {
                                    AnonymousClass0XV.A09(r6);
                                }
                                r2.A0f();
                                this.A05.A01.A0F(r6);
                                r6.A0F = true;
                            }
                        }
                    } finally {
                        this.A00 = false;
                    }
                }
                C06970a9 r4 = this.A02;
                int i = r4.A00;
                if (i > 0) {
                    Object[] objArr = r4.A01;
                    int i2 = 0;
                    do {
                        ((C16480sK) objArr[i2]).Bwa();
                        i2++;
                    } while (i2 < i);
                }
                r4.A08();
            } else {
                throw AnonymousClass000.A0k("performMeasureAndLayout called during measure layout");
            }
        }
    }

    public final void A0C(AnonymousClass0XV r2, boolean z) {
        AnonymousClass0IM r0;
        boolean z2;
        C03650Je r02 = this.A03;
        if (z) {
            r0 = r02.A00;
        } else {
            r0 = r02.A01;
        }
        if (r0.A00.isEmpty()) {
            return;
        }
        if (this.A00) {
            C04700Ok r03 = r2.A0Q;
            if (z) {
                z2 = r03.A0D;
            } else {
                z2 = r03.A0E;
            }
            if (!z2) {
                A01(r2, z);
                return;
            }
            throw AnonymousClass000.A0k("node not yet measured");
        }
        throw AnonymousClass000.A0n("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r1.A0B != true) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        if (r1.A0E != true) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0D(X.AnonymousClass0XV r7, boolean r8) {
        /*
            r6 = this;
            X.0Ok r5 = r7.A0Q
            java.lang.Integer r0 = r5.A05
            int r1 = r0.intValue()
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L_0x0027
            if (r1 == r2) goto L_0x001d
            r0 = 3
            if (r1 == r0) goto L_0x0027
            r0 = 2
            if (r1 == r0) goto L_0x001d
            r0 = 4
            if (r1 == r0) goto L_0x001d
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        L_0x001d:
            boolean r0 = r5.A0D
            if (r0 != 0) goto L_0x0025
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0028
        L_0x0025:
            if (r8 != 0) goto L_0x0028
        L_0x0027:
            return r2
        L_0x0028:
            r5.A0B = r3
            r5.A0C = r3
            r5.A09 = r3
            r5.A0A = r3
            boolean r0 = r7.A0E
            if (r0 != 0) goto L_0x0027
            X.0XV r4 = r7.A0I()
            java.lang.Boolean r1 = r7.A0O()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0052
            if (r4 == 0) goto L_0x0070
            X.0Ok r1 = r4.A0Q
            boolean r0 = r1.A0D
            if (r0 == r3) goto L_0x0052
            boolean r0 = r1.A0B
            if (r0 != r3) goto L_0x0070
        L_0x0052:
            X.0AK r0 = r5.A0G
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0064
            if (r4 == 0) goto L_0x006a
            X.0Ok r1 = r4.A0Q
            boolean r0 = r1.A09
            if (r0 == r3) goto L_0x0064
            boolean r0 = r1.A0E
            if (r0 != r3) goto L_0x006a
        L_0x0064:
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0027
            r2 = 1
            return r2
        L_0x006a:
            X.0Je r0 = r6.A03
            r0.A01(r7, r2)
            goto L_0x0064
        L_0x0070:
            X.0Je r0 = r6.A03
            r0.A01(r7, r3)
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qe.A0D(X.0XV, boolean):boolean");
    }

    public final boolean A0E(AnonymousClass0XV r6, boolean z) {
        AnonymousClass0XV A0I;
        AnonymousClass0XV A0I2;
        if (r6.A07 != null) {
            C04700Ok r4 = r6.A0Q;
            int intValue = r4.A05.intValue();
            if (intValue != 1) {
                if (intValue == 0 || intValue == 3 || intValue == 2) {
                    this.A06.A0F(new C03250Hf(r6, true, z));
                    return false;
                } else if (intValue != 4) {
                    throw new AnonymousClass3EW();
                } else if (!r4.A0D || z) {
                    r4.A0D = true;
                    r4.A0E = true;
                    if (!r6.A0E) {
                        if ((C18070vi.A18(r6.A0O(), true) || (r4.A0D && A05(r6))) && ((A0I2 = r6.A0I()) == null || !A0I2.A0Q.A0D)) {
                            this.A03.A01(r6, true);
                        } else if ((r4.A0G.A08 || (r4.A0E && A04(r6))) && ((A0I = r6.A0I()) == null || !A0I.A0Q.A0E)) {
                            this.A03.A01(r6, false);
                        }
                        if (!this.A00) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw AnonymousClass000.A0n("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r1.A0E != true) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0F(X.AnonymousClass0XV r6, boolean r7) {
        /*
            r5 = this;
            X.0Ok r4 = r6.A0Q
            java.lang.Integer r0 = r4.A05
            int r1 = r0.intValue()
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L_0x0029
            if (r1 == r3) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x0029
            r0 = 2
            if (r1 == r0) goto L_0x0029
            r0 = 4
            if (r1 != r0) goto L_0x0054
            if (r7 != 0) goto L_0x002b
            X.0AK r0 = r4.A0G
            boolean r1 = r0.A08
            boolean r0 = r0.A09
            if (r1 != r0) goto L_0x002b
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x0029
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x002b
        L_0x0029:
            r2 = 0
            return r2
        L_0x002b:
            r4.A09 = r2
            r4.A0A = r2
            boolean r0 = r6.A0E
            if (r0 != 0) goto L_0x0029
            X.0AK r0 = r4.A0G
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0049
            X.0XV r0 = r6.A0I()
            if (r0 == 0) goto L_0x004e
            X.0Ok r1 = r0.A0Q
            boolean r0 = r1.A09
            if (r0 == r2) goto L_0x0049
            boolean r0 = r1.A0E
            if (r0 != r2) goto L_0x004e
        L_0x0049:
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0029
            return r2
        L_0x004e:
            X.0Je r0 = r5.A03
            r0.A01(r6, r3)
            goto L_0x0049
        L_0x0054:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qe.A0F(X.0XV, boolean):boolean");
    }

    public final boolean A0G(AnonymousClass0XV r6, boolean z) {
        AnonymousClass0XV A0I;
        C04700Ok r4 = r6.A0Q;
        int intValue = r4.A05.intValue();
        if (intValue == 1 || intValue == 0) {
            return false;
        }
        if (intValue == 3 || intValue == 2) {
            this.A06.A0F(new C03250Hf(r6, false, z));
            return false;
        } else if (intValue != 4) {
            throw new AnonymousClass3EW();
        } else if (r4.A0E && !z) {
            return false;
        } else {
            r4.A0E = true;
            if (r6.A0E) {
                return false;
            }
            if ((r4.A0G.A08 || A04(r6)) && ((A0I = r6.A0I()) == null || !A0I.A0Q.A0E)) {
                this.A03.A01(r6, false);
            }
            if (!this.A00) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean A0H(C18090vk r10) {
        AnonymousClass0XV r7 = this.A04;
        if (r7.A08 == null) {
            throw AnonymousClass000.A0k("performMeasureAndLayout called with unattached root");
        } else if (!r7.A0Q.A0G.A08) {
            throw AnonymousClass000.A0k("performMeasureAndLayout called with unplaced root");
        } else if (!this.A00) {
            boolean z = false;
            if (this.A01 != null) {
                this.A00 = true;
                try {
                    C03650Je r4 = this.A03;
                    boolean z2 = false;
                    if (!r4.A02()) {
                        while (!r4.A02()) {
                            AnonymousClass0IM r1 = r4.A00;
                            boolean z3 = !r1.A00.isEmpty();
                            if (!z3) {
                                r1 = r4.A01;
                            }
                            C07220aa r2 = r1.A00;
                            AnonymousClass0XV r12 = (AnonymousClass0XV) r2.first();
                            if (r12.A08 != null) {
                                r2.remove(r12);
                                boolean A08 = A08(r12, z3, true);
                                if (r12 == r7 && A08) {
                                    z2 = true;
                                }
                            } else {
                                throw AnonymousClass000.A0n("DepthSortedSet.remove called on an unattached node");
                            }
                        }
                        if (r10 != null) {
                            r10.invoke();
                        }
                    }
                    this.A00 = false;
                    z = z2;
                } catch (Throwable th) {
                    this.A00 = false;
                    throw th;
                }
            }
            C06970a9 r42 = this.A02;
            int i = r42.A00;
            if (i > 0) {
                Object[] objArr = r42.A01;
                int i2 = 0;
                do {
                    ((C16480sK) objArr[i2]).Bwa();
                    i2++;
                } while (i2 < i);
            }
            r42.A08();
            return z;
        } else {
            throw AnonymousClass000.A0k("performMeasureAndLayout called during measure layout");
        }
    }

    public AnonymousClass0Qe(AnonymousClass0XV r3) {
        this.A04 = r3;
    }

    private final void A00(AnonymousClass0XV r6) {
        C06970a9 A0F = r6.A0F();
        int i = A0F.A00;
        if (i > 0) {
            Object[] objArr = A0F.A01;
            int i2 = 0;
            do {
                AnonymousClass0XV r1 = (AnonymousClass0XV) objArr[i2];
                if (A04(r1)) {
                    if (AnonymousClass0F5.A00(r1)) {
                        A03(r1, true);
                    } else {
                        A00(r1);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    private final void A01(AnonymousClass0XV r8, boolean z) {
        boolean z2;
        C06970a9 A0F = r8.A0F();
        int i = A0F.A00;
        if (i > 0) {
            Object[] objArr = A0F.A01;
            int i2 = 0;
            do {
                AnonymousClass0XV r2 = (AnonymousClass0XV) objArr[i2];
                if (z ? A05(r2) : A04(r2)) {
                    if (AnonymousClass0F5.A00(r2) && !z) {
                        if (!r2.A0Q.A0D || !this.A03.A00.A00.contains(r2)) {
                            A0C(r2, true);
                        } else {
                            A08(r2, true, false);
                        }
                    }
                    A02(r2, z);
                    C04700Ok r0 = r2.A0Q;
                    if (z) {
                        z2 = r0.A0D;
                    } else {
                        z2 = r0.A0E;
                    }
                    if (!z2) {
                        A01(r2, z);
                    }
                }
                i2++;
            } while (i2 < i);
        }
        A02(r8, z);
    }
}
