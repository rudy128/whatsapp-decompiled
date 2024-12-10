package X;

/* renamed from: X.0Qi  reason: invalid class name and case insensitive filesystem */
public abstract class C05080Qi {
    public static final long A00(AnonymousClass0NU r6, AnonymousClass0NU r7, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            f = r6.A01;
            f2 = r7.A02;
        } else if (i == 4) {
            f = r7.A01;
            f2 = r6.A02;
        } else if (i == 5) {
            f = r6.A03;
            f2 = r7.A00;
        } else if (i == 6) {
            f = r7.A03;
            f2 = r6.A00;
        } else {
            throw AnonymousClass000.A0n("This function should only be used for 2-D focus search");
        }
        long abs = (long) Math.abs(Math.max(0.0f, f - f2));
        if (i == 3 || i == 4) {
            float f7 = r6.A03;
            f3 = 2.0f;
            f4 = f7 + ((r6.A00 - f7) / 2.0f);
            f5 = r7.A03;
            f6 = r7.A00;
        } else {
            float f8 = r6.A01;
            f3 = 2.0f;
            f4 = f8 + ((r6.A02 - f8) / 2.0f);
            f5 = r7.A01;
            f6 = r7.A02;
        }
        long abs2 = (long) Math.abs(f4 - (f5 + ((f6 - f5) / f3)));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    public static final C015408x A01(C06970a9 r12, AnonymousClass0NU r13, int i) {
        AnonymousClass0NU A01;
        if (AnonymousClass000.A1T(i, 3)) {
            A01 = r13.A01((r13.A02 - r13.A01) + 1.0f, 0.0f);
        } else if (i == 4) {
            A01 = r13.A01(-((r13.A02 - r13.A01) + 1.0f), 0.0f);
        } else if (i == 5) {
            A01 = r13.A01(0.0f, (r13.A00 - r13.A03) + 1.0f);
        } else if (i == 6) {
            A01 = r13.A01(0.0f, -((r13.A00 - r13.A03) + 1.0f));
        } else {
            throw AnonymousClass000.A0n("This function should only be used for 2-D focus search");
        }
        int i2 = r12.A00;
        C015408x r11 = null;
        if (i2 > 0) {
            Object[] objArr = r12.A01;
            int i3 = 0;
            do {
                C015408x r6 = (C015408x) objArr[i3];
                if (C04800Ox.A03(r6)) {
                    AnonymousClass0NU A02 = C04800Ox.A02(r6);
                    if (A09(A02, r13, i) && (!A09(A01, r13, i) || A0A(r13, A02, A01, i) || (!A0A(r13, A01, A02, i) && A00(r13, A02, i) < A00(r13, A01, i)))) {
                        r11 = r6;
                        A01 = A02;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return r11;
    }

    public static final boolean A08(AnonymousClass0NU r3, AnonymousClass0NU r4, int i) {
        float f;
        float f2;
        if (AnonymousClass000.A1T(i, 3) || i == 4) {
            if (r3.A00 <= r4.A03) {
                return false;
            }
            f = r3.A03;
            f2 = r4.A00;
        } else if (i != 5 && i != 6) {
            throw AnonymousClass000.A0n("This function should only be used for 2-D focus search");
        } else if (r3.A02 <= r4.A01) {
            return false;
        } else {
            f = r3.A01;
            f2 = r4.A02;
        }
        if (f < f2) {
            return true;
        }
        return false;
    }

    public static final boolean A09(AnonymousClass0NU r3, AnonymousClass0NU r4, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (AnonymousClass000.A1T(i, 3)) {
            float f5 = r4.A02;
            float f6 = r3.A02;
            if (f5 <= f6 && r4.A01 < f6) {
                return false;
            }
            f3 = r4.A01;
            f4 = r3.A01;
        } else {
            if (i == 4) {
                float f7 = r4.A01;
                float f8 = r3.A01;
                if (f7 >= f8 && r4.A02 > f8) {
                    return false;
                }
                f = r4.A02;
                f2 = r3.A02;
            } else if (i == 5) {
                float f9 = r4.A00;
                float f10 = r3.A00;
                if (f9 <= f10 && r4.A03 < f10) {
                    return false;
                }
                f3 = r4.A03;
                f4 = r3.A03;
            } else if (i == 6) {
                float f11 = r4.A03;
                float f12 = r3.A03;
                if (f11 >= f12 && r4.A00 > f12) {
                    return false;
                }
                f = r4.A00;
                f2 = r3.A00;
            } else {
                throw AnonymousClass000.A0n("This function should only be used for 2-D focus search");
            }
            if (f < f2) {
                return true;
            }
            return false;
        }
        if (f3 > f4) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    public static final void A03(X.C06970a9 r8, X.C15830rH r9) {
        /*
            r7 = 1024(0x400, float:1.435E-42)
            X.0XW r9 = (X.AnonymousClass0XW) r9
            X.0XW r6 = r9.A03
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0080
            X.0a9 r5 = X.C06970a9.A01()
            X.0XW r0 = r6.A02
            if (r0 == 0) goto L_0x0023
            r5.A0F(r0)
        L_0x0015:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x007f
            r4 = 1
            X.0XW r6 = X.C06970a9.A03(r5, r0)
            int r0 = r6.A00
            r0 = r0 & r7
            if (r0 != 0) goto L_0x0029
        L_0x0023:
            X.AnonymousClass0QV.A06(r5, r6)
            goto L_0x0015
        L_0x0027:
            if (r6 == 0) goto L_0x0015
        L_0x0029:
            int r0 = r6.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x007c
            r3 = 0
        L_0x002f:
            boolean r0 = r6 instanceof X.C015408x
            if (r0 == 0) goto L_0x004f
            X.08x r6 = (X.C015408x) r6
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0044
            X.0WL r0 = r6.A0N()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x004b
            r8.A0F(r6)
        L_0x0044:
            X.0XW r6 = X.AnonymousClass0QV.A00(r3)
        L_0x0048:
            if (r6 == 0) goto L_0x0015
            goto L_0x002f
        L_0x004b:
            A03(r8, r6)
            goto L_0x0044
        L_0x004f:
            int r0 = r6.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0044
            boolean r0 = r6 instanceof X.C014308l
            if (r0 == 0) goto L_0x0044
            r0 = r6
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x0079
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x006a
            int r1 = r1 + 1
            if (r1 != r4) goto L_0x006d
            r6 = r2
        L_0x006a:
            X.0XW r2 = r2.A02
            goto L_0x005e
        L_0x006d:
            X.0a9 r3 = X.AnonymousClass001.A10(r3)
            X.0XW r6 = X.AnonymousClass000.A0d(r3, r6)
            r3.A0F(r2)
            goto L_0x006a
        L_0x0079:
            if (r1 != r4) goto L_0x0044
            goto L_0x0048
        L_0x007c:
            X.0XW r6 = r6.A02
            goto L_0x0027
        L_0x007f:
            return
        L_0x0080:
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05080Qi.A03(X.0a9, X.0rH):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    public static final boolean A05(X.C015408x r10, X.C015408x r11, X.C22821Di r12, int r13) {
        /*
            r0 = 16
            X.08x[] r0 = new X.C015408x[r0]
            r9 = 0
            X.0a9 r3 = X.C06970a9.A02(r0)
            r8 = 1024(0x400, float:1.435E-42)
            X.0XW r7 = r10.A03
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x00a2
            X.0a9 r6 = X.C06970a9.A01()
            X.0XW r0 = r7.A02
            if (r0 == 0) goto L_0x002e
            r6.A0F(r0)
        L_0x001c:
            int r1 = r6.A00
            boolean r0 = X.AnonymousClass000.A1O(r1)
            r4 = 1
            if (r0 == 0) goto L_0x007b
            X.0XW r7 = X.C06970a9.A03(r6, r1)
            int r0 = r7.A00
            r0 = r0 & r8
            if (r0 != 0) goto L_0x0034
        L_0x002e:
            X.AnonymousClass0QV.A06(r6, r7)
            goto L_0x001c
        L_0x0032:
            if (r7 == 0) goto L_0x001c
        L_0x0034:
            int r0 = r7.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0075
            r5 = 0
        L_0x003a:
            boolean r0 = r7 instanceof X.C015408x
            if (r0 == 0) goto L_0x0048
            r3.A0F(r7)
        L_0x0041:
            X.0XW r7 = X.AnonymousClass0QV.A00(r5)
        L_0x0045:
            if (r7 == 0) goto L_0x001c
            goto L_0x003a
        L_0x0048:
            int r0 = r7.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0041
            boolean r0 = r7 instanceof X.C014308l
            if (r0 == 0) goto L_0x0041
            r0 = r7
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x0057:
            if (r2 == 0) goto L_0x0072
            int r0 = r2.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0063
            int r1 = r1 + 1
            if (r1 != r4) goto L_0x0066
            r7 = r2
        L_0x0063:
            X.0XW r2 = r2.A02
            goto L_0x0057
        L_0x0066:
            X.0a9 r5 = X.AnonymousClass001.A10(r5)
            X.0XW r7 = X.AnonymousClass000.A0d(r5, r7)
            r5.A0F(r2)
            goto L_0x0063
        L_0x0072:
            if (r1 != r4) goto L_0x0041
            goto L_0x0045
        L_0x0075:
            X.0XW r7 = r7.A02
            goto L_0x0032
        L_0x0078:
            r3.A0H(r1)
        L_0x007b:
            int r0 = r3.A00
            if (r0 == 0) goto L_0x00a1
            X.0NU r0 = X.C04800Ox.A02(r11)
            X.08x r1 = A01(r3, r0, r13)
            if (r1 == 0) goto L_0x00a1
            X.0WL r0 = r1.A0N()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r12.invoke(r1)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            return r0
        L_0x009a:
            boolean r0 = A04(r1, r11, r12, r13)
            if (r0 == 0) goto L_0x0078
            return r4
        L_0x00a1:
            return r9
        L_0x00a2:
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05080Qi.A05(X.08x, X.08x, X.1Di, int):boolean");
    }

    public static final boolean A07(C015408x r5, C22821Di r6, int i) {
        float f;
        float f2;
        Object A01;
        C06970a9 A02 = C06970a9.A02(new C015408x[16]);
        A03(A02, r5);
        int i2 = A02.A00;
        if (i2 > 1) {
            if (i == 7) {
                i = 4;
            } else if (!(i == 4 || i == 6)) {
                if (i == 3 || i == 5) {
                    AnonymousClass0NU A022 = C04800Ox.A02(r5);
                    f = A022.A02;
                    f2 = A022.A00;
                    A01 = A01(A02, new AnonymousClass0NU(f, f2, f, f2), i);
                } else {
                    throw AnonymousClass000.A0n("This function should only be used for 2-D focus search");
                }
            }
            AnonymousClass0NU A023 = C04800Ox.A02(r5);
            f = A023.A01;
            f2 = A023.A03;
            A01 = A01(A02, new AnonymousClass0NU(f, f2, f, f2), i);
        } else if (i2 == 0) {
            return false;
        } else {
            A01 = A02.A01[0];
        }
        if (A01 != null) {
            return AnonymousClass000.A1Y(r6.invoke(A01));
        }
        return false;
    }

    public static final Boolean A02(C015408x r7, C22821Di r8, int i) {
        boolean z;
        int A00 = C015408x.A00(r7);
        if (A00 == 1) {
            C015408x A01 = C04800Ox.A01(r7);
            if (A01 != null) {
                int A002 = C015408x.A00(A01);
                if (A002 == 1) {
                    Boolean A02 = A02(A01, r8, i);
                    if (!C18070vi.A18(A02, false)) {
                        return A02;
                    }
                    if (A01.A0O() == AnonymousClass0CW.ActiveParent) {
                        A01 = C04800Ox.A00(A01);
                        if (A01 == null) {
                            throw AnonymousClass000.A0n("ActiveParent must have a focusedChild");
                        }
                    } else {
                        throw AnonymousClass000.A0n("Searching for active node in inactive hierarchy");
                    }
                } else if (!(A002 == 0 || A002 == 2)) {
                    if (A002 != 3) {
                        throw new AnonymousClass3EW();
                    }
                    throw AnonymousClass000.A0n("ActiveParent must have a focusedChild");
                }
                z = A04(r7, A01, r8, i);
            } else {
                throw AnonymousClass000.A0n("ActiveParent must have a focusedChild");
            }
        } else if (A00 == 0 || A00 == 2) {
            z = A07(r7, r8, i);
        } else if (A00 != 3) {
            throw new AnonymousClass3EW();
        } else if (r7.A0N().A08) {
            return (Boolean) r8.invoke(r7);
        } else {
            return false;
        }
        return Boolean.valueOf(z);
    }

    public static final boolean A04(C015408x r1, C015408x r2, C22821Di r3, int i) {
        if (A05(r1, r2, r3, i)) {
            return true;
        }
        Boolean bool = (Boolean) C02440Ea.A00(r1, new C11410jz(r1, r2, r3, i), i);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r7 != 3) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r1 <= r0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        if (r7 == 4) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        if (r7 != 5) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        r1 = r4.A03;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        r2 = java.lang.Math.max(0.0f, r1 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        if (r7 != 5) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        r1 = r4.A03;
        r0 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r2 >= java.lang.Math.max(1.0f, r1 - r0)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        r1 = r6.A00;
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        r1 = r5.A03;
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0A(X.AnonymousClass0NU r4, X.AnonymousClass0NU r5, X.AnonymousClass0NU r6, int r7) {
        /*
            boolean r0 = A08(r6, r4, r7)
            r3 = 0
            if (r0 != 0) goto L_0x001c
            boolean r0 = A08(r5, r4, r7)
            if (r0 == 0) goto L_0x001c
            r0 = 3
            if (r7 != r0) goto L_0x001d
            float r1 = r4.A01
            float r0 = r6.A02
        L_0x0014:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            r0 = 3
            if (r7 != r0) goto L_0x0028
        L_0x001b:
            r3 = 1
        L_0x001c:
            return r3
        L_0x001d:
            r0 = 4
            if (r7 != r0) goto L_0x0055
            float r1 = r4.A02
            float r0 = r6.A01
        L_0x0024:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x001b
        L_0x0028:
            r0 = 4
            if (r7 == r0) goto L_0x001b
            r0 = 5
            if (r7 != r0) goto L_0x0050
            float r1 = r4.A03
            float r0 = r5.A00
        L_0x0032:
            float r1 = r1 - r0
            r0 = 0
            float r2 = java.lang.Math.max(r0, r1)
            r0 = 5
            if (r7 != r0) goto L_0x004b
            float r1 = r4.A03
            float r0 = r6.A03
        L_0x003f:
            float r1 = r1 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r0, r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x001c
            goto L_0x001b
        L_0x004b:
            float r1 = r6.A00
            float r0 = r4.A00
            goto L_0x003f
        L_0x0050:
            float r1 = r5.A03
            float r0 = r4.A00
            goto L_0x0032
        L_0x0055:
            r0 = 5
            if (r7 != r0) goto L_0x005d
            float r1 = r4.A03
            float r0 = r6.A00
            goto L_0x0014
        L_0x005d:
            r0 = 6
            if (r7 != r0) goto L_0x0065
            float r1 = r4.A00
            float r0 = r6.A03
            goto L_0x0024
        L_0x0065:
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05080Qi.A0A(X.0NU, X.0NU, X.0NU, int):boolean");
    }
}
