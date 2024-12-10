package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0Qu  reason: invalid class name */
public final class AnonymousClass0Qu {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public AnonymousClass0N8 A0C;
    public ArrayList A0D;
    public HashMap A0E;
    public boolean A0F;
    public int[] A0G;
    public Object[] A0H;
    public final C04330Mt A0I = new C04330Mt();
    public final C04330Mt A0J = new C04330Mt();
    public final C04330Mt A0K = new C04330Mt();
    public final C06390Yd A0L;

    public static final boolean A0L(AnonymousClass0Qu r9, int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = r9.A0D;
            A0B(r9, i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = r9.A0E;
                int i3 = r9.A04;
                int i4 = i + i2;
                ArrayList arrayList2 = r9.A0D;
                int A062 = A06(arrayList2, i4, (r9.A0G.length / 5) - i3);
                if (A062 >= arrayList2.size()) {
                    A062--;
                }
                int i5 = A062 + 1;
                int i6 = 0;
                while (A062 >= 0) {
                    C02090Cr r2 = (C02090Cr) r9.A0D.get(A062);
                    int i7 = r2.A00;
                    if (i7 < 0) {
                        i7 += A00(r9);
                    }
                    if (i7 < i) {
                        break;
                    }
                    if (i7 < i4) {
                        r2.A00 = Integer.MIN_VALUE;
                        if (hashMap != null) {
                            hashMap.remove(r2);
                        }
                        if (i6 == 0) {
                            i6 = A062 + 1;
                        }
                        i5 = A062;
                    }
                    A062--;
                }
                if (i5 < i6) {
                    z = true;
                    r9.A0D.subList(i5, i6).clear();
                }
            }
            r9.A05 = i;
            r9.A04 += i2;
            int i8 = r9.A0A;
            if (i8 > i) {
                r9.A0A = Math.max(i, i8 - i2);
            }
            int i9 = r9.A01;
            if (i9 >= i) {
                r9.A01 = i9 - i2;
            }
            int i10 = r9.A08;
            if (i10 >= 0 && (r9.A0G[(A01(r9, i10) * 5) + 1] & 67108864) != 0) {
                A0D(r9, i10);
            }
        }
        return z;
    }

    public final void A0R() {
        this.A0F = true;
        if (this.A0K.A00 == 0) {
            A0B(this, A00(this));
            A0F(this, this.A0H.length - this.A09, this.A05);
            A07();
            A09(this);
        }
        C06390Yd r1 = this.A0L;
        int[] iArr = this.A0G;
        int i = this.A05;
        r1.A0A(this, this.A0D, this.A0E, iArr, this.A0H, i, this.A0B);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        r5 = r14.A0G();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0W(X.C06390Yd r14, int r15) {
        /*
            r13 = this;
            r11 = 0
            int r0 = r13.A06
            boolean r0 = X.AnonymousClass000.A1R(r0)
            X.C05020Qb.A08(r0)
            r6 = r14
            if (r15 != 0) goto L_0x005b
            int r0 = r13.A00
            if (r0 != 0) goto L_0x005b
            X.0Yd r0 = r13.A0L
            int r0 = r0.A00()
            if (r0 != 0) goto L_0x005b
            int[] r5 = r14.A0G()
            r0 = 3
            r0 = r5[r0]
            int r4 = r14.A00()
            if (r0 != r4) goto L_0x005b
            int[] r9 = r13.A0G
            java.lang.Object[] r10 = r13.A0H
            java.util.ArrayList r7 = r13.A0D
            java.util.HashMap r8 = r13.A0E
            java.lang.Object[] r3 = r14.A0H()
            int r2 = r14.A01()
            java.util.HashMap r1 = r14.A07()
            r13.A0G = r5
            r13.A0H = r3
            java.util.ArrayList r0 = r14.A06()
            r13.A0D = r0
            r13.A05 = r4
            int r0 = r5.length
            int r0 = r0 / 5
            int r0 = r0 - r4
            r13.A04 = r0
            r13.A0B = r2
            int r0 = r3.length
            int r0 = r0 - r2
            r13.A09 = r0
            r13.A0A = r4
            r13.A0E = r1
            r12 = r11
            r6.A0B(r7, r8, r9, r10, r11, r12)
            return
        L_0x005b:
            X.0Qu r1 = r14.A05()
            A0H(r1, r13, r15)     // Catch:{ all -> 0x0066 }
            r1.A0R()
            return
        L_0x0066:
            r0 = move-exception
            r1.A0R()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qu.A0W(X.0Yd, int):void");
    }

    public static int A00(AnonymousClass0Qu r2) {
        return (r2.A0G.length / 5) - r2.A04;
    }

    public static final int A01(AnonymousClass0Qu r1, int i) {
        if (i >= r1.A05) {
            return i + r1.A04;
        }
        return i;
    }

    public static final int A03(AnonymousClass0Qu r3, int[] iArr, int i) {
        if (i >= r3.A0G.length / 5) {
            return r3.A0H.length - r3.A09;
        }
        int i2 = iArr[(i * 5) + 4];
        int i3 = r3.A09;
        int length = r3.A0H.length;
        if (i2 < 0) {
            return (length - i3) + i2 + 1;
        }
        return i2;
    }

    public static final int A05(AnonymousClass0Qu r3, int[] iArr, int i) {
        if (i >= r3.A0G.length / 5) {
            return r3.A0H.length - r3.A09;
        }
        int A022 = C04780Ot.A02(iArr, i);
        int i2 = r3.A09;
        int length = r3.A0H.length;
        if (A022 < 0) {
            return (length - i2) + A022 + 1;
        }
        return A022;
    }

    private final void A07() {
        int i = this.A0B;
        C200310o.A06(this.A0H, i, this.A09 + i);
    }

    private final void A08(int i, int i2, int i3) {
        if (i >= this.A05) {
            i = -((A00(this) - i) + 2);
        }
        while (i3 < i2) {
            int[] iArr = this.A0G;
            int A012 = A01(this, i3) * 5;
            iArr[A012 + 2] = i;
            int i4 = iArr[A012 + 3] + i3;
            A08(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public static final void A09(AnonymousClass0Qu r9) {
        boolean z;
        int i;
        AnonymousClass0N8 r6 = r9.A0C;
        if (r6 != null) {
            while (AnonymousClass000.A1a(r6.A00)) {
                int A012 = r6.A01();
                int A013 = A01(r9, A012);
                int i2 = A012 + 1;
                int[] iArr = r9.A0G;
                int i3 = A013 * 5;
                int i4 = A012 + iArr[i3 + 3];
                while (true) {
                    if (i2 >= i4) {
                        z = false;
                        break;
                    } else if ((iArr[(A01(r9, i2) * 5) + 1] & 201326592) != 0) {
                        z = true;
                        break;
                    } else {
                        i2 += AnonymousClass000.A0S(iArr, A01(r9, i2));
                    }
                }
                boolean z2 = true;
                int i5 = i3 + 1;
                int i6 = iArr[i5];
                if ((67108864 & i6) == 0) {
                    z2 = false;
                }
                if (z2 != z) {
                    if (z) {
                        i = i6 | 67108864;
                    } else {
                        i = i6 & -67108865;
                    }
                    iArr[i5] = i;
                    int A042 = A04(r9, iArr, A012);
                    if (A042 >= 0) {
                        r6.A02(A042);
                    }
                }
            }
        }
    }

    public static final void A0A(AnonymousClass0Qu r12, int i) {
        int i2;
        if (i > 0) {
            int i3 = r12.A00;
            A0B(r12, i3);
            int i4 = r12.A05;
            int i5 = r12.A04;
            int[] iArr = r12.A0G;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[(max * 5)];
                int i8 = max - i6;
                C200310o.A02(0, 0, i4 * 5, iArr, iArr2);
                C200310o.A02((i4 + i8) * 5, (i5 + i4) * 5, length * 5, iArr, iArr2);
                r12.A0G = iArr2;
                iArr = iArr2;
                i5 = i8;
            }
            int i9 = r12.A01;
            if (i9 >= i4) {
                r12.A01 = i9 + i;
            }
            int i10 = i4 + i;
            r12.A05 = i10;
            r12.A04 = i5 - i;
            if (i6 > 0) {
                i2 = A02(r12, iArr, i3 + i);
            } else {
                i2 = 0;
            }
            int i11 = r12.A0A;
            if (i11 >= i4) {
                i7 = r12.A0B;
            }
            int i12 = r12.A09;
            int length2 = r12.A0H.length;
            if (i2 > i7) {
                i2 = -(((length2 - i12) - i2) + 1);
            }
            for (int i13 = i4; i13 < i10; i13++) {
                iArr[(i13 * 5) + 4] = i2;
            }
            if (i11 >= i4) {
                r12.A0A = i11 + i;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r1 = (X.C02090Cr) r5.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        r1 = (X.C02090Cr) r5.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0B(X.AnonymousClass0Qu r8, int r9) {
        /*
            int r4 = r8.A04
            int r3 = r8.A05
            if (r3 == r9) goto L_0x00ac
            java.util.ArrayList r0 = r8.A0D
            boolean r0 = r0.isEmpty()
            r7 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0055
            int r1 = r8.A04
            int[] r0 = r8.A0G
            int r0 = r0.length
            int r6 = r0 / 5
            int r6 = r6 - r1
            java.util.ArrayList r5 = r8.A0D
            if (r3 >= r9) goto L_0x0039
            int r2 = A06(r5, r3, r6)
        L_0x0021:
            int r0 = r5.size()
            if (r2 >= r0) goto L_0x0055
            java.lang.Object r1 = r5.get(r2)
            X.0Cr r1 = (X.C02090Cr) r1
            int r0 = r1.A00
            if (r0 >= 0) goto L_0x0055
            int r0 = r0 + r6
            if (r0 >= r9) goto L_0x0055
            r1.A00 = r0
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0039:
            int r2 = A06(r5, r9, r6)
        L_0x003d:
            int r0 = r5.size()
            if (r2 >= r0) goto L_0x0055
            java.lang.Object r1 = r5.get(r2)
            X.0Cr r1 = (X.C02090Cr) r1
            int r0 = r1.A00
            if (r0 < 0) goto L_0x0055
            int r0 = r6 - r0
            int r0 = -r0
            r1.A00 = r0
            int r2 = r2 + 1
            goto L_0x003d
        L_0x0055:
            if (r4 <= 0) goto L_0x0065
            int[] r6 = r8.A0G
            int r5 = r9 * 5
            int r2 = r4 * 5
            int r1 = r3 * 5
            if (r9 >= r3) goto L_0x00a5
            int r2 = r2 + r5
            X.C200310o.A02(r2, r5, r1, r6, r6)
        L_0x0065:
            if (r9 >= r3) goto L_0x0069
            int r3 = r9 + r4
        L_0x0069:
            int[] r0 = r8.A0G
            int r0 = r0.length
            int r5 = r0 / 5
            if (r3 < r5) goto L_0x0071
            r7 = 0
        L_0x0071:
            X.C05020Qb.A08(r7)
        L_0x0074:
            if (r3 >= r5) goto L_0x00ac
            int[] r2 = r8.A0G
            int r0 = r3 * 5
            int r0 = r0 + 2
            r7 = r2[r0]
            r6 = r7
            r0 = -2
            if (r7 > r0) goto L_0x008b
            int r0 = r2.length
            int r1 = r0 / 5
            int r0 = r8.A04
            int r1 = r1 - r0
            int r1 = r1 + r7
            int r6 = r1 + 2
        L_0x008b:
            if (r6 < r9) goto L_0x0097
            int r0 = r2.length
            int r1 = r0 / 5
            int r0 = r8.A04
            int r1 = r1 - r0
            int r1 = r1 - r6
            int r0 = r1 + 2
            int r6 = -r0
        L_0x0097:
            if (r6 == r7) goto L_0x009f
            int r0 = r3 * 5
            int r0 = r0 + 2
            r2[r0] = r6
        L_0x009f:
            int r3 = r3 + 1
            if (r3 != r9) goto L_0x0074
            int r3 = r3 + r4
            goto L_0x0074
        L_0x00a5:
            int r0 = r1 + r2
            int r5 = r5 + r2
            X.C200310o.A02(r1, r0, r5, r6, r6)
            goto L_0x0065
        L_0x00ac:
            r8.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qu.A0B(X.0Qu, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r1 = r3.A0D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0C(X.AnonymousClass0Qu r3, int r4) {
        /*
            java.util.HashMap r2 = r3.A0E
            if (r2 == 0) goto L_0x001d
            if (r4 < 0) goto L_0x001d
            int r0 = A00(r3)
            if (r4 >= r0) goto L_0x001d
            java.util.ArrayList r1 = r3.A0D
            int r0 = X.C04780Ot.A01(r1, r4, r0)
            if (r0 < 0) goto L_0x001d
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x001d
            r2.get(r0)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qu.A0C(X.0Qu, int):void");
    }

    public static final void A0D(AnonymousClass0Qu r3, int i) {
        if (i >= 0) {
            AnonymousClass0N8 r2 = r3.A0C;
            if (r2 == null) {
                r2 = new AnonymousClass0N8((List) null, 1, (AnonymousClass1Y1) null);
                r3.A0C = r2;
            }
            r2.A02(i);
        }
    }

    public static final void A0E(AnonymousClass0Qu r10, int i, int i2) {
        if (i > 0) {
            A0F(r10, r10.A02, i2);
            int i3 = r10.A0B;
            int i4 = r10.A09;
            if (i4 < i) {
                Object[] objArr = r10.A0H;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                C200310o.A07(objArr, 0, objArr2, 0, i3);
                C200310o.A07(objArr, i3 + i7, objArr2, i4 + i3, length);
                r10.A0H = objArr2;
                i4 = i7;
            }
            int i8 = r10.A03;
            if (i8 >= i3) {
                r10.A03 = i8 + i;
            }
            r10.A0B = i3 + i;
            r10.A09 = i4 - i;
        }
    }

    public static final void A0F(AnonymousClass0Qu r9, int i, int i2) {
        String str;
        int i3 = r9.A09;
        int i4 = r9.A0B;
        int i5 = r9.A0A;
        if (i4 != i) {
            Object[] objArr = r9.A0H;
            if (i < i4) {
                C200310o.A07(objArr, i + i3, objArr, i, i4);
            } else {
                C200310o.A07(objArr, i4, objArr, i4 + i3, i + i3);
            }
        }
        int[] iArr = r9.A0G;
        int i6 = r9.A04;
        int min = Math.min(i2 + 1, (iArr.length / 5) - i6);
        if (i5 != min) {
            int length = r9.A0H.length - i3;
            if (min < i5) {
                int A012 = A01(r9, min);
                int A013 = A01(r9, i5);
                int i7 = r9.A05;
                while (A012 < A013) {
                    int i8 = (A012 * 5) + 4;
                    int i9 = iArr[i8];
                    if (i9 >= 0) {
                        iArr[i8] = -((length - i9) + 1);
                        A012++;
                        if (A012 == i7) {
                            A012 += i6;
                        }
                    } else {
                        str = "Unexpected anchor value, expected a positive anchor";
                    }
                }
                r9.A0A = min;
            } else {
                int A014 = A01(r9, i5);
                int A015 = A01(r9, min);
                while (A014 < A015) {
                    int i10 = iArr[(A014 * 5) + 4];
                    if (i10 < 0) {
                        iArr[(A014 * 5) + 4] = i10 + length + 1;
                        A014++;
                        if (A014 == r9.A05) {
                            A014 += i6;
                        }
                    } else {
                        str = "Unexpected anchor value, expected a negative anchor";
                    }
                }
                r9.A0A = min;
            }
            C05020Qb.A06(str);
            throw null;
        }
        r9.A0B = i;
    }

    public static final void A0G(AnonymousClass0Qu r2, int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = r2.A09;
            int i5 = i + i2;
            A0F(r2, i5, i3);
            r2.A0B = i;
            r2.A09 = i4 + i2;
            C200310o.A06(r2.A0H, i, i5);
            int i6 = r2.A03;
            if (i6 >= i) {
                r2.A03 = i6 - i2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r13v5, types: [java.util.AbstractCollection, java.util.Collection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if ((r7[r1 + 1] & 201326592) == 0) goto L_0x0029;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0H(X.AnonymousClass0Qu r18, X.AnonymousClass0Qu r19, int r20) {
        /*
            r12 = r18
            int[] r7 = r12.A0G
            r3 = r20
            int r5 = A01(r12, r3)
            int r1 = r5 * 5
            int r0 = r1 + 3
            r4 = r7[r0]
            int r2 = r20 + r4
            int r13 = A03(r12, r7, r5)
            int r6 = A02(r12, r7, r2)
            int r8 = r6 - r13
            if (r20 < 0) goto L_0x0029
            int r0 = r1 + 1
            r1 = r7[r0]
            r0 = 201326592(0xc000000, float:9.8607613E-32)
            r1 = r1 & r0
            r20 = 1
            if (r1 != 0) goto L_0x002b
        L_0x0029:
            r20 = 0
        L_0x002b:
            r9 = r19
            A0A(r9, r4)
            int r0 = r9.A00
            A0E(r9, r8, r0)
            int r0 = r12.A05
            if (r0 >= r2) goto L_0x003c
            A0B(r12, r2)
        L_0x003c:
            int r0 = r12.A0B
            if (r0 >= r6) goto L_0x0043
            A0F(r12, r6, r2)
        L_0x0043:
            int[] r10 = r9.A0G
            int r11 = r9.A00
            int[] r7 = r12.A0G
            int r5 = r11 * 5
            int r1 = r3 * 5
            int r0 = r2 * 5
            X.C200310o.A02(r5, r1, r0, r7, r10)
            java.lang.Object[] r1 = r9.A0H
            int r7 = r9.A02
            java.lang.Object[] r0 = r12.A0H
            X.C200310o.A07(r0, r7, r1, r13, r6)
            int r6 = r9.A08
            int r5 = r11 * 5
            int r0 = r5 + 2
            r10[r0] = r6
            int r19 = r11 - r3
            int r4 = r4 + r11
            int r0 = A03(r9, r10, r11)
            int r18 = r7 - r0
            int r14 = r9.A0A
            int r0 = r9.A09
            r17 = r0
            int r15 = r1.length
            r13 = r11
        L_0x0074:
            r0 = 0
            if (r13 >= r4) goto L_0x00a2
            if (r13 == r11) goto L_0x0083
            int r1 = r13 * 5
            int r16 = r1 + 2
            r1 = r10[r16]
            int r1 = r1 + r19
            r10[r16] = r1
        L_0x0083:
            int r1 = A03(r9, r10, r13)
            int r1 = r1 + r18
            if (r14 < r13) goto L_0x008d
            int r0 = r9.A0B
        L_0x008d:
            if (r1 <= r0) goto L_0x0095
            int r0 = r15 - r17
            int r0 = r0 - r1
            int r0 = r0 + 1
            int r1 = -r0
        L_0x0095:
            int r0 = r13 * 5
            int r0 = r0 + 4
            r10[r0] = r1
            if (r13 != r14) goto L_0x009f
            int r14 = r14 + 1
        L_0x009f:
            int r13 = r13 + 1
            goto L_0x0074
        L_0x00a2:
            r9.A0A = r14
            java.util.ArrayList r14 = r12.A0D
            int r0 = A00(r12)
            int r3 = A06(r14, r3, r0)
            int r2 = A06(r14, r2, r0)
            if (r3 >= r2) goto L_0x00d0
            int r0 = r2 - r3
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r0)
            r15 = r3
        L_0x00bc:
            if (r15 >= r2) goto L_0x00d5
            java.lang.Object r1 = r14.get(r15)
            X.0Cr r1 = (X.C02090Cr) r1
            int r0 = r1.A00
            int r0 = r0 + r19
            r1.A00 = r0
            r13.add(r1)
            int r15 = r15 + 1
            goto L_0x00bc
        L_0x00d0:
            X.0wS r13 = X.AnonymousClass1ZU.A09()
            goto L_0x00eb
        L_0x00d5:
            java.util.ArrayList r1 = r9.A0D
            int r15 = r9.A00
            int r0 = A00(r9)
            int r0 = A06(r1, r15, r0)
            r1.addAll(r0, r13)
            java.util.List r0 = r14.subList(r3, r2)
            r0.clear()
        L_0x00eb:
            boolean r0 = X.AnonymousClass000.A1a(r13)
            if (r0 == 0) goto L_0x010f
            java.util.HashMap r3 = r12.A0E
            if (r3 == 0) goto L_0x010f
            int r2 = r13.size()
            r1 = 0
        L_0x00fa:
            if (r1 >= r2) goto L_0x0106
            java.lang.Object r0 = r13.get(r1)
            r3.get(r0)
            int r1 = r1 + 1
            goto L_0x00fa
        L_0x0106:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x010f
            r0 = 0
            r12.A0E = r0
        L_0x010f:
            A0C(r9, r6)
            int r1 = r9.A07
            boolean r0 = X.C04780Ot.A03(r10, r11)
            if (r0 == 0) goto L_0x0129
            r0 = 1
        L_0x011b:
            int r1 = r1 + r0
            r9.A07 = r1
            r9.A00 = r4
            int r7 = r7 + r8
            r9.A02 = r7
            if (r20 == 0) goto L_0x0128
            A0D(r9, r6)
        L_0x0128:
            return
        L_0x0129:
            int r0 = X.AnonymousClass000.A0R(r10, r5)
            goto L_0x011b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qu.A0H(X.0Qu, X.0Qu, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r15 == r0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0J(X.AnonymousClass0Qu r13, java.lang.Object r14, java.lang.Object r15, int r16, boolean r17) {
        /*
            int r4 = r13.A08
            int r0 = r13.A06
            r3 = 0
            r5 = 1
            boolean r2 = X.AnonymousClass000.A1R(r0)
            X.0Mt r1 = r13.A0J
            int r0 = r13.A07
            r1.A01(r0)
            if (r2 == 0) goto L_0x0088
            A0A(r13, r5)
            int r5 = r13.A00
            int r1 = A01(r13, r5)
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            r12 = 0
            if (r14 == r0) goto L_0x0022
            r12 = 1
        L_0x0022:
            if (r17 != 0) goto L_0x0027
            r11 = 1
            if (r15 != r0) goto L_0x0028
        L_0x0027:
            r11 = 0
        L_0x0028:
            int[] r7 = r13.A0G
            int r9 = r13.A08
            int r6 = r13.A02
            r10 = 0
            if (r17 == 0) goto L_0x0033
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x0033:
            r8 = 0
            if (r12 == 0) goto L_0x0038
            r8 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0038:
            r2 = 0
            if (r11 == 0) goto L_0x003d
            r2 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x003d:
            int r1 = r1 * 5
            r7[r1] = r16
            int r0 = r1 + 1
            r10 = r10 | r8
            r10 = r10 | r2
            r7[r0] = r10
            int r0 = r1 + 2
            r7[r0] = r9
            int r0 = r1 + 3
            r7[r0] = r3
            int r0 = r1 + 4
            r7[r0] = r6
            r13.A03 = r6
            int r0 = r17 + r12
            int r0 = r0 + r11
            if (r0 <= 0) goto L_0x0078
            A0E(r13, r0, r5)
            java.lang.Object[] r2 = r13.A0H
            int r1 = r13.A02
            if (r17 == 0) goto L_0x0068
            int r0 = r1 + 1
            r2[r1] = r15
            r1 = r0
        L_0x0068:
            if (r12 == 0) goto L_0x006f
            int r0 = r1 + 1
            r2[r1] = r14
            r1 = r0
        L_0x006f:
            if (r11 == 0) goto L_0x0076
            int r0 = r1 + 1
            r2[r1] = r15
            r1 = r0
        L_0x0076:
            r13.A02 = r1
        L_0x0078:
            r13.A07 = r3
            int r3 = r5 + 1
            r13.A08 = r5
            r13.A00 = r3
            if (r4 < 0) goto L_0x0085
            A0C(r13, r4)
        L_0x0085:
            r13.A01 = r3
            return
        L_0x0088:
            X.0Mt r0 = r13.A0K
            r0.A01(r4)
            X.0Mt r2 = r13.A0I
            int r1 = A00(r13)
            int r0 = r13.A01
            int r1 = r1 - r0
            r2.A01(r1)
            int r3 = r13.A00
            int r1 = A01(r13, r3)
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            boolean r0 = X.C18070vi.A18(r15, r0)
            if (r0 != 0) goto L_0x00ae
            if (r17 == 0) goto L_0x00d4
            int r0 = r13.A00
            A0I(r13, r15, r0)
        L_0x00ae:
            int[] r2 = r13.A0G
            int r0 = A05(r13, r2, r1)
            r13.A02 = r0
            int r0 = r13.A00
            int r0 = r0 + 1
            int r0 = A02(r13, r2, r0)
            r13.A03 = r0
            int r1 = r1 * 5
            int r0 = X.AnonymousClass000.A0R(r2, r1)
            r13.A07 = r0
            r13.A08 = r3
            int r0 = r3 + 1
            r13.A00 = r0
            int r0 = r1 + 3
            r0 = r2[r0]
            int r3 = r3 + r0
            goto L_0x0085
        L_0x00d4:
            r13.A0X(r15)
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qu.A0J(X.0Qu, java.lang.Object, java.lang.Object, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r5 >= 67108863) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0K(int[] r3, int r4, int r5) {
        /*
            if (r5 < 0) goto L_0x0008
            r1 = 67108863(0x3ffffff, float:1.5046327E-36)
            r0 = 1
            if (r5 < r1) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            X.C05020Qb.A08(r0)
            int r0 = r4 * 5
            int r2 = r0 + 1
            r1 = r3[r2]
            r0 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r1 = r1 & r0
            r1 = r1 | r5
            r3[r2] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qu.A0K(int[], int, int):void");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.0Cr, java.lang.Object] */
    public final C02090Cr A0M(int i) {
        ArrayList arrayList = this.A0D;
        int A002 = A00(this);
        int A012 = C04780Ot.A01(arrayList, i, A002);
        if (A012 >= 0) {
            return (C02090Cr) arrayList.get(A012);
        }
        if (i > this.A05) {
            i = -(A002 - i);
        }
        ? obj = new Object();
        obj.A00 = i;
        arrayList.add(-(A012 + 1), obj);
        return obj;
    }

    public final C06760Zo A0O() {
        int[] iArr = this.A0G;
        int i = this.A00;
        int A012 = A01(this, i);
        return new C06760Zo(this, A03(this, iArr, A012), A02(this, iArr, i + AnonymousClass000.A0S(iArr, A012)));
    }

    public final void A0Q() {
        int i = this.A06;
        this.A06 = i + 1;
        if (i == 0) {
            this.A0I.A01(A00(this) - this.A01);
        }
    }

    public final void A0S() {
        int i;
        int i2 = 1;
        int i3 = 0;
        boolean A1R = AnonymousClass000.A1R(this.A06);
        int i4 = this.A00;
        int i5 = this.A01;
        int i6 = this.A08;
        int A012 = A01(this, i6);
        int i7 = this.A07;
        int i8 = i4 - i6;
        int[] iArr = this.A0G;
        boolean A032 = C04780Ot.A03(iArr, A012);
        if (A1R) {
            C05020Qb.A08(AnonymousClass000.A1Q(i8));
            iArr[(A012 * 5) + 3] = i8;
            A0K(iArr, A012, i7);
            int A002 = C04330Mt.A00(this.A0J);
            if (!A032) {
                i2 = i7;
            }
            this.A07 = A002 + i2;
            this.A08 = A04(this, iArr, i6);
        } else if (i4 == i5) {
            int i9 = A012 * 5;
            int i10 = i9 + 3;
            int i11 = iArr[i10];
            int A0R = AnonymousClass000.A0R(iArr, i9);
            C05020Qb.A08(AnonymousClass000.A1Q(i8));
            iArr[i10] = i8;
            A0K(iArr, A012, i7);
            int A003 = C04330Mt.A00(this.A0K);
            this.A01 = A00(this) - C04330Mt.A00(this.A0I);
            this.A08 = A003;
            int A042 = A04(this, iArr, i6);
            int A004 = C04330Mt.A00(this.A0J);
            this.A07 = A004;
            if (A042 == A003) {
                if (!A032) {
                    i3 = i7 - A0R;
                }
                i = A004 + i3;
            } else {
                int i12 = i8 - i11;
                int i13 = i7 - A0R;
                if (A032) {
                    i13 = 0;
                }
                if (!(i12 == 0 && i13 == 0)) {
                    while (A042 != 0 && A042 != A003 && (i13 != 0 || i12 != 0)) {
                        int A013 = A01(this, A042);
                        if (i12 != 0) {
                            int A0S = AnonymousClass000.A0S(iArr, A013) + i12;
                            C05020Qb.A08(AnonymousClass000.A1Q(A0S));
                            iArr[(A013 * 5) + 3] = A0S;
                        }
                        if (i13 != 0) {
                            A0K(iArr, A013, AnonymousClass000.A0R(iArr, A013 * 5) + i13);
                        }
                        if (C04780Ot.A03(iArr, A013)) {
                            i13 = 0;
                        }
                        A042 = A04(this, iArr, A042);
                    }
                }
                i = A004 + i13;
            }
            this.A07 = i;
        } else {
            C05020Qb.A06("Expected to be at the end of a group");
            throw null;
        }
    }

    public final void A0T() {
        int i = this.A06;
        if (i > 0) {
            int i2 = i - 1;
            this.A06 = i2;
            if (i2 != 0) {
                return;
            }
            if (this.A0J.A00 == this.A0K.A00) {
                this.A01 = A00(this) - C04330Mt.A00(this.A0I);
            } else {
                C05020Qb.A06("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        } else {
            throw AnonymousClass000.A0n("Unbalanced begin/end insert");
        }
    }

    public final void A0U(int i) {
        String str;
        int i2 = this.A06;
        if (i2 <= 0) {
            int i3 = this.A08;
            if (i3 == i) {
                return;
            }
            if (i < i3 || i >= this.A01) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Started group at ");
                A10.append(i);
                str = AnonymousClass001.A1I(" must be a subgroup of the group at ", A10, i3);
            } else {
                int i4 = this.A00;
                int i5 = this.A02;
                int i6 = this.A03;
                this.A00 = i;
                if (i2 == 0) {
                    Object obj = AnonymousClass0MH.A00;
                    A0J(this, obj, obj, 0, false);
                    this.A00 = i4;
                    this.A02 = i5;
                    this.A03 = i6;
                    return;
                }
                str = "Key must be supplied when inserting";
            }
        } else {
            str = "Cannot call ensureStarted() while inserting";
        }
        C05020Qb.A06(str);
        throw null;
    }

    public final void A0V(int i) {
        String str;
        if (this.A06 == 0) {
            str = "Parameter offset is out of bounds";
            if (AnonymousClass000.A1Q(i)) {
                if (i != 0) {
                    int i2 = this.A00;
                    int i3 = this.A08;
                    int i4 = this.A01;
                    int i5 = i2;
                    while (true) {
                        int[] iArr = this.A0G;
                        int A012 = A01(this, i5);
                        if (i > 0) {
                            i5 += AnonymousClass000.A0S(iArr, A012);
                            if (i5 > i4) {
                                break;
                            }
                            i--;
                        } else {
                            int A0S = AnonymousClass000.A0S(iArr, A012);
                            int i6 = this.A02;
                            int A032 = A03(this, iArr, A012);
                            int i7 = i5 + A0S;
                            int A022 = A02(this, iArr, i7);
                            int i8 = A022 - A032;
                            A0E(this, i8, Math.max(i2 - 1, 0));
                            A0A(this, A0S);
                            int[] iArr2 = this.A0G;
                            int A013 = A01(this, i7) * 5;
                            C200310o.A02(A01(this, i2) * 5, A013, (A0S * 5) + A013, iArr2, iArr2);
                            if (i8 > 0) {
                                Object[] objArr = this.A0H;
                                int i9 = A032 + i8;
                                int i10 = this.A0B;
                                if (i9 >= i10) {
                                    i9 += this.A09;
                                }
                                int i11 = A022 + i8;
                                if (i11 >= i10) {
                                    i11 += this.A09;
                                }
                                C200310o.A07(objArr, i6, objArr, i9, i11);
                            }
                            int i12 = A032 + i8;
                            int i13 = i12 - i6;
                            int i14 = this.A0B;
                            int i15 = this.A09;
                            int length = this.A0H.length;
                            int i16 = this.A0A;
                            int i17 = i2 + A0S;
                            for (int i18 = i2; i18 < i17; i18++) {
                                int A014 = A01(this, i18);
                                int A033 = A03(this, iArr2, A014) - i13;
                                int i19 = i14;
                                if (i16 < A014) {
                                    i19 = 0;
                                }
                                if (A033 > i19) {
                                    A033 = -(((length - i15) - A033) + 1);
                                }
                                if (A033 > i14) {
                                    A033 = -(((length - i15) - A033) + 1);
                                }
                                iArr2[(A014 * 5) + 4] = A033;
                            }
                            int i20 = A0S + i7;
                            int A002 = A00(this);
                            ArrayList arrayList = this.A0D;
                            int A062 = A06(arrayList, i7, A002);
                            ArrayList A13 = AnonymousClass000.A13();
                            if (A062 >= 0) {
                                while (A062 < arrayList.size()) {
                                    C02090Cr r2 = (C02090Cr) arrayList.get(A062);
                                    int i21 = r2.A00;
                                    if (i21 < 0) {
                                        i21 += A00(this);
                                    }
                                    if (i21 < i7 || i21 >= i20) {
                                        break;
                                    }
                                    A13.add(r2);
                                    arrayList = this.A0D;
                                    arrayList.remove(A062);
                                }
                            }
                            int i22 = i2 - i7;
                            int size = A13.size();
                            for (int i23 = 0; i23 < size; i23++) {
                                C02090Cr r22 = (C02090Cr) A13.get(i23);
                                int i24 = r22.A00;
                                if (i24 < 0) {
                                    i24 += A00(this);
                                }
                                int i25 = i24 + i22;
                                if (i25 >= this.A05) {
                                    r22.A00 = -(A002 - i25);
                                } else {
                                    r22.A00 = i25;
                                }
                                ArrayList arrayList2 = this.A0D;
                                arrayList2.add(A06(arrayList2, i25, A002), r22);
                            }
                            if (!A0L(this, i7, A0S)) {
                                A08(i3, this.A01, i2);
                                if (i8 > 0) {
                                    A0G(this, i12, i8, i7 - 1);
                                    return;
                                }
                                return;
                            }
                            str = "Unexpectedly removed anchors";
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            str = "Cannot move a group while inserting";
        }
        C05020Qb.A06(str);
        throw null;
    }

    public final void A0X(Object obj) {
        int A012 = A01(this, this.A00);
        int[] iArr = this.A0G;
        int i = iArr[(A012 * 5) + 1];
        if ((268435456 & i) != 0) {
            Object[] objArr = this.A0H;
            int A032 = A03(this, iArr, A012) + C04780Ot.A00(i >> 29);
            if (A032 >= this.A0B) {
                A032 += this.A09;
            }
            objArr[A032] = obj;
            return;
        }
        C05020Qb.A06("Updating the data of a group that was not created with a data slot");
        throw null;
    }

    public AnonymousClass0Qu(C06390Yd r5) {
        this.A0L = r5;
        int[] A0G2 = r5.A0G();
        this.A0G = A0G2;
        Object[] A0H2 = r5.A0H();
        this.A0H = A0H2;
        this.A0D = r5.A06();
        this.A0E = r5.A07();
        int A002 = r5.A00();
        this.A05 = A002;
        this.A04 = (A0G2.length / 5) - A002;
        int A012 = r5.A01();
        this.A0B = A012;
        this.A09 = A0H2.length - A012;
        this.A0A = A002;
        this.A01 = A002;
        this.A08 = -1;
    }

    public static int A02(AnonymousClass0Qu r1, int[] iArr, int i) {
        return A03(r1, iArr, A01(r1, i));
    }

    public static final int A04(AnonymousClass0Qu r2, int[] iArr, int i) {
        int i2 = iArr[(A01(r2, i) * 5) + 2];
        if (i2 <= -2) {
            return A00(r2) + i2 + 2;
        }
        return i2;
    }

    public static int A06(ArrayList arrayList, int i, int i2) {
        int A012 = C04780Ot.A01(arrayList, i, i2);
        if (A012 < 0) {
            return -(A012 + 1);
        }
        return A012;
    }

    public static final void A0I(AnonymousClass0Qu r4, Object obj, int i) {
        int A012 = A01(r4, i);
        int[] iArr = r4.A0G;
        if (A012 >= iArr.length || !C04780Ot.A03(iArr, A012)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Updating the node of a group at ");
            A10.append(i);
            C05020Qb.A06(AnonymousClass000.A0y(" that was not created with as a node group", A10));
            throw null;
        }
        Object[] objArr = r4.A0H;
        int A032 = A03(r4, iArr, A012);
        if (A032 >= r4.A0B) {
            A032 += r4.A09;
        }
        objArr[A032] = obj;
    }

    public final C06390Yd A0N() {
        return this.A0L;
    }

    public final Object A0P(Object obj, int i, int i2) {
        int A012 = A01(this, i);
        int[] iArr = this.A0G;
        int A052 = A05(this, iArr, A012);
        int A022 = A02(this, iArr, i + 1);
        int i3 = A052 + i2;
        if (i3 < A052 || i3 >= A022) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Write to an invalid slot index ");
            A10.append(i2);
            C05020Qb.A06(AnonymousClass001.A1I(" for group ", A10, i));
            throw null;
        }
        if (i3 >= this.A0B) {
            i3 += this.A09;
        }
        Object[] objArr = this.A0H;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SlotWriter(current = ");
        A10.append(this.A00);
        A10.append(" end=");
        A10.append(this.A01);
        A10.append(" size = ");
        int i = this.A04;
        A10.append((this.A0G.length / 5) - i);
        A10.append(" gap=");
        int i2 = this.A05;
        A10.append(i2);
        A10.append('-');
        return AnonymousClass001.A1L(A10, i2 + i);
    }
}
