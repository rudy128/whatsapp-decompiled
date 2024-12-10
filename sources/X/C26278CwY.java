package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.CwY  reason: case insensitive filesystem */
public class C26278CwY {
    public int A00;
    public C26026Cqk A01;
    public short A02;
    public short A03;
    public int[] A04;
    public int[] A05;
    public int[] A06;
    public int[] A07;
    public int[] A08;

    private void A09(String str, C26280Cwb cwb) {
        int i = 0;
        if (str.charAt(0) == '(') {
            int i2 = 1;
            while (str.charAt(i2) != ')') {
                while (str.charAt(i2) == '[') {
                    i2++;
                }
                int i3 = i2 + 1;
                if (str.charAt(i2) == 'L') {
                    i2 = Math.max(i3, str.indexOf(59, i3) + 1);
                } else {
                    i2 = i3;
                }
            }
            i = i2 + 1;
        }
        int A022 = A02(str, cwb, i);
        if (A022 != 0) {
            A06(A022);
            if (A022 == 4194308 || A022 == 4194307) {
                A06(4194304);
            }
        }
    }

    private int A00() {
        short s = this.A03;
        if (s > 0) {
            int[] iArr = this.A08;
            short s2 = (short) (s - 1);
            this.A03 = s2;
            return iArr[s2];
        }
        short s3 = (short) (this.A02 - 1);
        this.A02 = s3;
        return (-s3) | 25165824;
    }

    public static int A01(Object obj, C26280Cwb cwb) {
        int i;
        int A002;
        Object obj2 = obj;
        if (!(obj2 instanceof Integer)) {
            C26280Cwb cwb2 = cwb;
            if (!(obj2 instanceof String)) {
                C26026Cqk cqk = (C26026Cqk) obj2;
                if ((cqk.A05 & 4) == 0) {
                    i = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                    C24939CQp[] cQpArr = cwb2.A0A;
                    if (cQpArr == null) {
                        cQpArr = new C24939CQp[16];
                        cwb2.A0A = cQpArr;
                        cwb2.A0B = new C24939CQp[16];
                    }
                    int identityHashCode = System.identityHashCode(cqk);
                    int length = cQpArr.length;
                    C24939CQp cQp = cQpArr[identityHashCode % length];
                    while (true) {
                        if (cQp != null) {
                            if (cQp.A02 == cqk) {
                                break;
                            }
                            cQp = cQp.A00;
                        } else {
                            int i2 = cwb2.A02;
                            if (i2 > (length * 3) / 4) {
                                int i3 = (length * 2) + 1;
                                C24939CQp[] cQpArr2 = new C24939CQp[i3];
                                for (int i4 = length - 1; i4 >= 0; i4--) {
                                    C24939CQp cQp2 = cQpArr[i4];
                                    while (cQp2 != null) {
                                        int identityHashCode2 = System.identityHashCode(cQp2.A02) % i3;
                                        C24939CQp cQp3 = cQp2.A00;
                                        cQp2.A00 = cQpArr2[identityHashCode2];
                                        cQpArr2[identityHashCode2] = cQp2;
                                        cQp2 = cQp3;
                                    }
                                }
                                cwb2.A0A = cQpArr2;
                            }
                            C24939CQp[] cQpArr3 = cwb2.A0B;
                            int length2 = cQpArr3.length;
                            if (i2 == length2) {
                                C24939CQp[] cQpArr4 = new C24939CQp[(length2 * 2)];
                                System.arraycopy(cQpArr3, 0, cQpArr4, 0, length2);
                                cwb2.A0B = cQpArr4;
                                cQpArr3 = cQpArr4;
                            }
                            int i5 = cwb2.A02;
                            cQp = new C24939CQp(cqk, i5);
                            C24939CQp[] cQpArr5 = cwb2.A0A;
                            int length3 = identityHashCode % cQpArr5.length;
                            cQp.A00 = cQpArr5[length3];
                            cQpArr5[length3] = cQp;
                            cwb2.A02 = i5 + 1;
                            cQpArr3[i5] = cQp;
                        }
                    }
                    int i6 = cQp.A01;
                    int i7 = (130 + i6) & Integer.MAX_VALUE;
                    C26184Cu8 A042 = C26280Cwb.A04(cwb2, i7);
                    while (true) {
                        if (A042 != null) {
                            if (A042.A03 == 130 && A042.A04 == i7 && A042.A05 == ((long) i6) && A042.A08.equals("")) {
                                A002 = A042.A02;
                                break;
                            }
                            A042 = A042.A01;
                        } else {
                            A002 = C26280Cwb.A00(new C26184Cu8("", cwb2.A04, 130, i7, (long) i6), cwb2);
                            break;
                        }
                    }
                } else {
                    A002 = cwb2.A0C("", cqk.A00);
                    i = 12582912;
                }
            } else {
                String str = (String) obj2;
                int i8 = 12;
                if (str.charAt(0) == '[') {
                    i8 = 9;
                }
                return A02(new C26263Cw8(i8, 0, str, str.length()).A06(), cwb2, 0);
            }
        } else {
            A002 = AnonymousClass000.A0M(obj2);
            i = 4194304;
        }
        return A002 | i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if ((r9 & 1048576) != 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if ((r9 & 1048576) != 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A03(X.C26278CwY r8, int r9, int r10) {
        /*
            r7 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r7 = r7 & r9
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r1 = r1 & r9
            r0 = 20971520(0x1400000, float:3.526483E-38)
            r6 = 4194307(0x400003, float:5.877476E-39)
            r5 = 4194304(0x400000, float:5.877472E-39)
            r4 = 4194308(0x400004, float:5.877477E-39)
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != r0) goto L_0x0026
            int[] r1 = r8.A05
            r0 = r9 & r2
            r0 = r1[r0]
            int r7 = r7 + r0
            r9 = r9 & r3
            if (r9 == 0) goto L_0x0036
        L_0x0021:
            if (r7 == r4) goto L_0x0025
            if (r7 != r6) goto L_0x0036
        L_0x0025:
            return r5
        L_0x0026:
            r0 = 25165824(0x1800000, float:4.7019774E-38)
            if (r1 != r0) goto L_0x0037
            int[] r1 = r8.A06
            r0 = r9 & r2
            int r10 = r10 - r0
            r0 = r1[r10]
            int r7 = r7 + r0
            r9 = r9 & r3
            if (r9 == 0) goto L_0x0036
            goto L_0x0021
        L_0x0036:
            return r7
        L_0x0037:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26278CwY.A03(X.CwY, int, int):int");
    }

    private void A05(int i) {
        short s;
        short s2 = this.A03;
        if (s2 >= i) {
            s = (short) (s2 - i);
        } else {
            this.A02 = (short) (this.A02 - (i - s2));
            s = 0;
        }
        this.A03 = s;
    }

    private void A06(int i) {
        int[] iArr = this.A08;
        if (iArr == null) {
            iArr = new int[10];
            this.A08 = iArr;
        }
        int length = iArr.length;
        short s = this.A03;
        if (s >= length) {
            int[] iArr2 = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A08 = iArr2;
            iArr = iArr2;
        }
        short s2 = this.A03;
        short s3 = (short) (s2 + 1);
        this.A03 = s3;
        iArr[s2] = i;
        short s4 = (short) (this.A02 + s3);
        C26026Cqk cqk = this.A01;
        if (s4 > cqk.A08) {
            cqk.A08 = s4;
        }
    }

    private void A07(int i, int i2) {
        int[] iArr = this.A07;
        if (iArr == null) {
            iArr = new int[10];
            this.A07 = iArr;
        }
        int length = iArr.length;
        if (i >= length) {
            int[] iArr2 = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A07 = iArr2;
            iArr = iArr2;
        }
        iArr[i] = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f1, code lost:
        if (r6 == 8388608) goto L_0x00f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.C26280Cwb r15, int[] r16, int r17, int r18) {
        /*
            r6 = r17
            r3 = r16[r18]
            r4 = 0
            if (r3 == r6) goto L_0x001a
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r0 = r0 & r17
            r1 = 4194309(0x400005, float:5.877479E-39)
            if (r0 != r1) goto L_0x0016
            if (r3 == r1) goto L_0x001a
            r6 = 4194309(0x400005, float:5.877479E-39)
        L_0x0016:
            if (r3 != 0) goto L_0x001b
            r16[r18] = r6
        L_0x001a:
            return
        L_0x001b:
            r9 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r8 = r3 & r9
            r2 = 4194304(0x400000, float:5.877472E-39)
            r7 = 62914560(0x3c00000, float:1.1284746E-36)
            r5 = 8388608(0x800000, float:1.17549435E-38)
            if (r8 != 0) goto L_0x003d
            r0 = r3 & r7
            if (r0 == r5) goto L_0x003d
            if (r3 != r1) goto L_0x0038
            r0 = r6 & r9
            if (r0 != 0) goto L_0x0037
            r0 = r6 & r7
            if (r0 == r5) goto L_0x0037
            r6 = 4194304(0x400000, float:5.877472E-39)
        L_0x0037:
            r2 = r6
        L_0x0038:
            if (r2 == r3) goto L_0x001a
            r16[r18] = r2
            return
        L_0x003d:
            if (r6 == r1) goto L_0x001a
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r0 = r6 & r1
            r1 = r1 & r3
            java.lang.String r10 = "java/lang/Object"
            if (r0 != r1) goto L_0x00ec
            r0 = r3 & r7
            if (r0 != r5) goto L_0x0103
            r2 = r6 & r9
            r2 = r2 | r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r5
            r5 = r5 & r3
            r7 = 32
            if (r6 >= r5) goto L_0x00e8
            long r12 = (long) r6
            long r0 = (long) r5
        L_0x005a:
            long r0 = r0 << r7
            long r12 = r12 | r0
            int r1 = r6 + r5
            r11 = 131(0x83, float:1.84E-43)
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r14 = r11 + r1
            r14 = r14 & r0
            X.Cu8 r7 = X.C26280Cwb.A04(r15, r14)
        L_0x006a:
            if (r7 == 0) goto L_0x0081
            int r0 = r7.A03
            if (r0 != r11) goto L_0x007e
            int r0 = r7.A04
            if (r0 != r14) goto L_0x007e
            long r0 = r7.A05
            int r8 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x007e
            int r0 = r7.A00
        L_0x007c:
            r2 = r2 | r0
            goto L_0x0038
        L_0x007e:
            X.Cu8 r7 = r7.A01
            goto L_0x006a
        L_0x0081:
            X.Cu8[] r1 = r15.A09
            r0 = r1[r6]
            java.lang.String r8 = r0.A08
            r0 = r1[r5]
            java.lang.String r7 = r0.A08
            X.ClN r0 = r15.A0D
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r6 = r0.getClassLoader()
            r5 = 46
            r1 = 47
            java.lang.String r0 = r8.replace(r1, r5)     // Catch:{ ClassNotFoundException -> 0x0115 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r4, r6)     // Catch:{ ClassNotFoundException -> 0x0115 }
            java.lang.String r9 = r7.replace(r1, r5)     // Catch:{ ClassNotFoundException -> 0x010e }
            java.lang.Class r4 = java.lang.Class.forName(r9, r4, r6)     // Catch:{ ClassNotFoundException -> 0x010e }
            boolean r6 = r0.isAssignableFrom(r4)
            if (r6 != 0) goto L_0x00b6
            boolean r6 = r4.isAssignableFrom(r0)
            if (r6 == 0) goto L_0x00c7
            r8 = r7
        L_0x00b6:
            int r0 = r15.A0B(r8)
            int r10 = r15.A04
            X.Cu8 r9 = new X.Cu8
            r9.<init>((int) r10, (int) r11, (long) r12, (int) r14)
            X.C26280Cwb.A09(r9, r15)
            r9.A00 = r0
            goto L_0x007c
        L_0x00c7:
            boolean r6 = r0.isInterface()
            if (r6 != 0) goto L_0x00d3
            boolean r6 = r4.isInterface()
            if (r6 == 0) goto L_0x00d5
        L_0x00d3:
            r8 = r10
            goto L_0x00b6
        L_0x00d5:
            java.lang.Class r0 = r0.getSuperclass()
            boolean r6 = r0.isAssignableFrom(r4)
            if (r6 == 0) goto L_0x00d5
            java.lang.String r0 = r0.getName()
            java.lang.String r8 = r0.replace(r5, r1)
            goto L_0x00b6
        L_0x00e8:
            long r12 = (long) r5
            long r0 = (long) r6
            goto L_0x005a
        L_0x00ec:
            r1 = r6 & r9
            r6 = r6 & r7
            if (r1 != 0) goto L_0x00ff
            if (r6 != r5) goto L_0x0038
        L_0x00f3:
            if (r8 == 0) goto L_0x00fa
            r0 = r3 & r7
            if (r0 == r5) goto L_0x00fa
            int r8 = r8 + r9
        L_0x00fa:
            int r6 = java.lang.Math.min(r1, r8)
            goto L_0x0105
        L_0x00ff:
            if (r6 == r5) goto L_0x00f3
            int r1 = r1 + r9
            goto L_0x00f3
        L_0x0103:
            r6 = r6 & r9
            int r6 = r6 + r9
        L_0x0105:
            r6 = r6 | r5
            int r0 = r15.A0B(r10)
            r2 = r6 | r0
            goto L_0x0038
        L_0x010e:
            r0 = move-exception
            java.lang.TypeNotPresentException r1 = new java.lang.TypeNotPresentException
            r1.<init>(r7, r0)
            throw r1
        L_0x0115:
            r0 = move-exception
            java.lang.TypeNotPresentException r1 = new java.lang.TypeNotPresentException
            r1.<init>(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26278CwY.A0A(X.Cwb, int[], int, int):void");
    }

    public final void A0B(String str, C26280Cwb cwb, int i, int i2) {
        int i3;
        int i4;
        int[] iArr = new int[i2];
        this.A05 = iArr;
        this.A06 = new int[0];
        int i5 = 0;
        if ((i & 8) == 0) {
            i5 = 1;
            if ((i & 262144) == 0) {
                i4 = cwb.A0B(cwb.A05) | 8388608;
            } else {
                i4 = 4194310;
            }
            iArr[0] = i4;
        }
        int A002 = C26263Cw8.A00(str);
        C26263Cw8[] cw8Arr = new C26263Cw8[A002];
        int i6 = 0;
        int i7 = 1;
        while (str.charAt(i7) != ')') {
            int i8 = i7;
            while (str.charAt(i8) == '[') {
                i8++;
            }
            int i9 = i8 + 1;
            if (str.charAt(i8) == 'L') {
                i9 = Math.max(i9, str.indexOf(59, i9) + 1);
            }
            cw8Arr[i6] = C26263Cw8.A04(str, i7, i9);
            i6++;
            i7 = i9;
        }
        for (int i10 = 0; i10 < A002; i10++) {
            int A022 = A02(cw8Arr[i10].A06(), cwb, 0);
            int[] iArr2 = this.A05;
            int i11 = i3 + 1;
            iArr2[i3] = A022;
            if (A022 != 4194308) {
                i3 = i11;
                if (A022 != 4194307) {
                }
            }
            i3 = i11 + 1;
            iArr2[i11] = 4194304;
        }
        while (i3 < i2) {
            this.A05[i3] = 4194304;
            i3++;
        }
    }

    public final void A0C(C26250Cvp cvp) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = this.A05;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        loop0:
        while (true) {
            int i8 = 0;
            do {
                int i9 = 2;
                if (i6 >= iArr.length) {
                    break loop0;
                }
                i4 = iArr[i6];
                if (!(i4 == 4194308 || i4 == 4194307)) {
                    i9 = 1;
                }
                i6 += i9;
                i8++;
            } while (i4 == 4194304);
            i7 += i8;
        }
        int[] iArr2 = this.A06;
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArr2.length) {
            int i12 = iArr2[i10];
            if (i12 != 4194308) {
                i3 = 1;
                if (i12 != 4194307) {
                    i10 += i3;
                    i11++;
                }
            }
            i3 = 2;
            i10 += i3;
            i11++;
        }
        int i13 = this.A01.A00;
        int i14 = i7 + 3 + i11;
        int[] iArr3 = cvp.A0W;
        if (iArr3 == null || iArr3.length < i14) {
            iArr3 = new int[i14];
            cvp.A0W = iArr3;
        }
        iArr3[0] = i13;
        iArr3[1] = i7;
        iArr3[2] = i11;
        int i15 = 3;
        int i16 = 0;
        while (true) {
            int i17 = i7 - 1;
            if (i7 <= 0) {
                break;
            }
            int i18 = iArr[i16];
            if (i18 != 4194308) {
                i2 = 1;
                if (i18 != 4194307) {
                    i16 += i2;
                    iArr3[i15] = i18;
                    i7 = i17;
                    i15++;
                }
            }
            i2 = 2;
            i16 += i2;
            iArr3[i15] = i18;
            i7 = i17;
            i15++;
        }
        while (true) {
            int i19 = i11 - 1;
            if (i11 > 0) {
                int i20 = iArr2[i5];
                if (i20 != 4194308) {
                    i = 1;
                    if (i20 != 4194307) {
                        i5 += i;
                        iArr3[i15] = i20;
                        i15++;
                        i11 = i19;
                    }
                }
                i = 2;
                i5 += i;
                iArr3[i15] = i20;
                i15++;
                i11 = i19;
            } else {
                cvp.A06();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ed, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ee, code lost:
        A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0220, code lost:
        r1 = r15.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0222, code lost:
        A09(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0226, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0227, code lost:
        A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x022a, code lost:
        A06(4194305);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x022d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0231, code lost:
        A06(4194306);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0234, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0238, code lost:
        A06(4194308);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x023f, code lost:
        A06(4194307);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0242, code lost:
        A06(4194304);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0245, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x024e, code lost:
        r4 = r2.A0B(r1) | 8388608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0257, code lost:
        A06(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x025a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        A05(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        A06(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        A06(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
        A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00af, code lost:
        A06(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0147, code lost:
        r4 = r4 | r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0153, code lost:
        if (r1.charAt(0) == '[') goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018c, code lost:
        A05(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0192, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0193, code lost:
        A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c0, code lost:
        if (r18 <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c2, code lost:
        r3 = r18 - 1;
        r2 = r14.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c6, code lost:
        if (r2 == null) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c9, code lost:
        if (r3 >= r2.length) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01cb, code lost:
        r1 = r2[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01cd, code lost:
        if (r1 != 0) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01cf, code lost:
        r1 = r3 | 20971520;
        r2[r3] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d3, code lost:
        if (r1 == 4194308) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d5, code lost:
        if (r1 == 4194307) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d7, code lost:
        r0 = r1 & 62914560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d9, code lost:
        if (r0 == 20971520) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01db, code lost:
        if (r0 != 25165824) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01dd, code lost:
        r4 = r18 - 1;
        r1 = r1 | 1048576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e2, code lost:
        A07(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e6, code lost:
        r1 = r3 | 20971520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e9, code lost:
        A07(r3, 4194304);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C26184Cu8 r15, X.C26280Cwb r16, int r17, int r18) {
        /*
            r14 = this;
            r4 = r18
            r11 = 4194306(0x400002, float:5.877475E-39)
            r13 = 8388608(0x800000, float:1.17549435E-38)
            r1 = 4194305(0x400001, float:5.877473E-39)
            r10 = 4194307(0x400003, float:5.877476E-39)
            r9 = 4194308(0x400004, float:5.877477E-39)
            r8 = 4194304(0x400000, float:5.877472E-39)
            r2 = r16
            r3 = r17
            switch(r17) {
                case 0: goto L_0x0225;
                case 1: goto L_0x0208;
                case 2: goto L_0x022a;
                case 3: goto L_0x022a;
                case 4: goto L_0x022a;
                case 5: goto L_0x022a;
                case 6: goto L_0x022a;
                case 7: goto L_0x022a;
                case 8: goto L_0x022a;
                case 9: goto L_0x0238;
                case 10: goto L_0x0238;
                case 11: goto L_0x0231;
                case 12: goto L_0x0231;
                case 13: goto L_0x0231;
                case 14: goto L_0x023f;
                case 15: goto L_0x023f;
                case 16: goto L_0x022a;
                case 17: goto L_0x022a;
                case 18: goto L_0x020c;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r17) {
                case 21: goto L_0x022a;
                case 22: goto L_0x0238;
                case 23: goto L_0x0231;
                case 24: goto L_0x023f;
                case 25: goto L_0x01f2;
                default: goto L_0x001c;
            }
        L_0x001c:
            r7 = 25165824(0x1800000, float:4.7019774E-38)
            r6 = 20971520(0x1400000, float:3.526483E-38)
            r12 = 62914560(0x3c00000, float:1.1284746E-36)
            r5 = 1
            switch(r17) {
                case 46: goto L_0x0226;
                case 47: goto L_0x01ed;
                case 48: goto L_0x018c;
                case 49: goto L_0x0192;
                case 50: goto L_0x0198;
                case 51: goto L_0x0226;
                case 52: goto L_0x0226;
                case 53: goto L_0x0226;
                case 54: goto L_0x01a9;
                case 55: goto L_0x01b1;
                case 56: goto L_0x01a9;
                case 57: goto L_0x01b1;
                case 58: goto L_0x01a9;
                default: goto L_0x0026;
            }
        L_0x0026:
            r7 = 91
            r12 = 3
            r6 = 0
            r0 = 4
            switch(r17) {
                case 79: goto L_0x004e;
                case 80: goto L_0x0057;
                case 81: goto L_0x004e;
                case 82: goto L_0x0057;
                case 83: goto L_0x004e;
                case 84: goto L_0x004e;
                case 85: goto L_0x004e;
                case 86: goto L_0x004e;
                case 87: goto L_0x0052;
                case 88: goto L_0x0056;
                case 89: goto L_0x0036;
                case 90: goto L_0x005b;
                case 91: goto L_0x0064;
                case 92: goto L_0x0071;
                case 93: goto L_0x0080;
                case 94: goto L_0x0093;
                case 95: goto L_0x00b4;
                case 96: goto L_0x0226;
                case 97: goto L_0x01ee;
                case 98: goto L_0x018c;
                case 99: goto L_0x0193;
                case 100: goto L_0x0226;
                case 101: goto L_0x01ee;
                case 102: goto L_0x018c;
                case 103: goto L_0x0193;
                case 104: goto L_0x0226;
                case 105: goto L_0x01ee;
                case 106: goto L_0x018c;
                case 107: goto L_0x0193;
                case 108: goto L_0x0226;
                case 109: goto L_0x01ee;
                case 110: goto L_0x018c;
                case 111: goto L_0x0193;
                case 112: goto L_0x0226;
                case 113: goto L_0x01ee;
                case 114: goto L_0x018c;
                case 115: goto L_0x0193;
                case 116: goto L_0x0225;
                case 117: goto L_0x0225;
                case 118: goto L_0x0225;
                case 119: goto L_0x0225;
                case 120: goto L_0x0226;
                case 121: goto L_0x0044;
                case 122: goto L_0x0226;
                case 123: goto L_0x0044;
                case 124: goto L_0x0226;
                case 125: goto L_0x0044;
                case 126: goto L_0x0226;
                case 127: goto L_0x01ee;
                case 128: goto L_0x0226;
                case 129: goto L_0x01ee;
                case 130: goto L_0x0226;
                case 131: goto L_0x01ee;
                case 132: goto L_0x01e2;
                case 133: goto L_0x0235;
                case 134: goto L_0x022e;
                case 135: goto L_0x023c;
                case 136: goto L_0x0226;
                case 137: goto L_0x018c;
                case 138: goto L_0x0192;
                case 139: goto L_0x003f;
                case 140: goto L_0x0235;
                case 141: goto L_0x023c;
                case 142: goto L_0x0226;
                case 143: goto L_0x01ed;
                case 144: goto L_0x018c;
                case 145: goto L_0x0225;
                case 146: goto L_0x0225;
                case 147: goto L_0x0225;
                case 148: goto L_0x0227;
                case 149: goto L_0x0226;
                case 150: goto L_0x0226;
                case 151: goto L_0x0227;
                case 152: goto L_0x0227;
                case 153: goto L_0x0052;
                case 154: goto L_0x0052;
                case 155: goto L_0x0052;
                case 156: goto L_0x0052;
                case 157: goto L_0x0052;
                case 158: goto L_0x0052;
                case 159: goto L_0x0056;
                case 160: goto L_0x0056;
                case 161: goto L_0x0056;
                case 162: goto L_0x0056;
                case 163: goto L_0x0056;
                case 164: goto L_0x0056;
                case 165: goto L_0x0056;
                case 166: goto L_0x0056;
                case 167: goto L_0x0225;
                case 168: goto L_0x0157;
                case 169: goto L_0x0157;
                case 170: goto L_0x0052;
                case 171: goto L_0x0052;
                case 172: goto L_0x0052;
                case 173: goto L_0x0056;
                case 174: goto L_0x0052;
                case 175: goto L_0x0056;
                case 176: goto L_0x0052;
                case 177: goto L_0x0225;
                case 178: goto L_0x0220;
                case 179: goto L_0x00c3;
                case 180: goto L_0x0049;
                case 181: goto L_0x00c9;
                case 182: goto L_0x00d2;
                case 183: goto L_0x00d2;
                case 184: goto L_0x00d2;
                case 185: goto L_0x00d2;
                case 186: goto L_0x0118;
                case 187: goto L_0x0121;
                case 188: goto L_0x015e;
                case 189: goto L_0x012a;
                case 190: goto L_0x003f;
                case 191: goto L_0x0052;
                case 192: goto L_0x014a;
                case 193: goto L_0x003f;
                case 194: goto L_0x0052;
                case 195: goto L_0x0052;
                default: goto L_0x002e;
            }
        L_0x002e:
            switch(r17) {
                case 197: goto L_0x021d;
                case 198: goto L_0x0052;
                case 199: goto L_0x0052;
                default: goto L_0x0031;
            }
        L_0x0031:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()
            throw r0
        L_0x0036:
            int r4 = r14.A00()
            r14.A06(r4)
            goto L_0x0257
        L_0x003f:
            r14.A05(r5)
            goto L_0x022a
        L_0x0044:
            r14.A05(r12)
            goto L_0x0238
        L_0x0049:
            r14.A05(r5)
            goto L_0x0220
        L_0x004e:
            r14.A05(r12)
            return
        L_0x0052:
            r14.A05(r5)
            return
        L_0x0056:
            r0 = 2
        L_0x0057:
            r14.A05(r0)
            return
        L_0x005b:
            int r4 = r14.A00()
            int r2 = r14.A00()
            goto L_0x007c
        L_0x0064:
            int r4 = r14.A00()
            int r2 = r14.A00()
            int r1 = r14.A00()
            goto L_0x008f
        L_0x0071:
            int r4 = r14.A00()
            int r2 = r14.A00()
            r14.A06(r2)
        L_0x007c:
            r14.A06(r4)
            goto L_0x00af
        L_0x0080:
            int r4 = r14.A00()
            int r2 = r14.A00()
            int r1 = r14.A00()
            r14.A06(r2)
        L_0x008f:
            r14.A06(r4)
            goto L_0x00ac
        L_0x0093:
            int r4 = r14.A00()
            int r2 = r14.A00()
            int r1 = r14.A00()
            int r0 = r14.A00()
            r14.A06(r2)
            r14.A06(r4)
            r14.A06(r0)
        L_0x00ac:
            r14.A06(r1)
        L_0x00af:
            r14.A06(r2)
            goto L_0x0257
        L_0x00b4:
            int r1 = r14.A00()
            int r0 = r14.A00()
            r14.A06(r1)
            r14.A06(r0)
            return
        L_0x00c3:
            java.lang.String r0 = r15.A08
            r14.A08(r0)
            return
        L_0x00c9:
            java.lang.String r0 = r15.A08
            r14.A08(r0)
            r14.A00()
            return
        L_0x00d2:
            java.lang.String r5 = r15.A08
            r14.A08(r5)
            r0 = 184(0xb8, float:2.58E-43)
            if (r3 == r0) goto L_0x0114
            int r7 = r14.A00()
            r0 = 183(0xb7, float:2.56E-43)
            if (r3 != r0) goto L_0x0114
            java.lang.String r0 = r15.A06
            char r1 = r0.charAt(r6)
            r0 = 60
            if (r1 != r0) goto L_0x0114
            int[] r4 = r14.A04
            if (r4 != 0) goto L_0x00f7
            int[] r4 = X.C108945cZ.A1W()
            r14.A04 = r4
        L_0x00f7:
            int r3 = r4.length
            int r0 = r14.A00
            if (r0 < r3) goto L_0x010c
            int r1 = r0 + 1
            int r0 = r3 * 2
            int r0 = java.lang.Math.max(r1, r0)
            int[] r0 = new int[r0]
            java.lang.System.arraycopy(r4, r6, r0, r6, r3)
            r14.A04 = r0
            r4 = r0
        L_0x010c:
            int r1 = r14.A00
            int r0 = r1 + 1
            r14.A00 = r0
            r4[r1] = r7
        L_0x0114:
            r14.A09(r5, r2)
            return
        L_0x0118:
            java.lang.String r0 = r15.A08
            r14.A08(r0)
            r14.A09(r0, r2)
            return
        L_0x0121:
            java.lang.String r0 = r15.A08
            int r4 = r2.A0C(r0, r4)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x0147
        L_0x012a:
            java.lang.String r3 = r15.A08
            r14.A00()
            char r0 = r3.charAt(r6)
            if (r0 != r7) goto L_0x0141
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "["
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r3, r1)
            goto L_0x0222
        L_0x0141:
            r0 = 75497472(0x4800000, float:3.0092655E-36)
            int r4 = r2.A0B(r3)
        L_0x0147:
            r4 = r4 | r0
            goto L_0x0257
        L_0x014a:
            java.lang.String r1 = r15.A08
            r14.A00()
            char r0 = r1.charAt(r6)
            if (r0 != r7) goto L_0x024e
            goto L_0x0222
        L_0x0157:
            java.lang.String r0 = "JSR/RET are not supported with computeFrames option"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x015e:
            r14.A00()
            switch(r18) {
                case 4: goto L_0x0169;
                case 5: goto L_0x016e;
                case 6: goto L_0x0173;
                case 7: goto L_0x0178;
                case 8: goto L_0x017d;
                case 9: goto L_0x0182;
                case 10: goto L_0x0187;
                case 11: goto L_0x0254;
                default: goto L_0x0164;
            }
        L_0x0164:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()
            throw r0
        L_0x0169:
            r4 = 71303177(0x4400009, float:2.2569508E-36)
            goto L_0x0257
        L_0x016e:
            r4 = 71303179(0x440000b, float:2.2569511E-36)
            goto L_0x0257
        L_0x0173:
            r4 = 71303170(0x4400002, float:2.2569495E-36)
            goto L_0x0257
        L_0x0178:
            r4 = 71303171(0x4400003, float:2.2569497E-36)
            goto L_0x0257
        L_0x017d:
            r4 = 71303178(0x440000a, float:2.256951E-36)
            goto L_0x0257
        L_0x0182:
            r4 = 71303180(0x440000c, float:2.2569513E-36)
            goto L_0x0257
        L_0x0187:
            r4 = 71303169(0x4400001, float:2.2569493E-36)
            goto L_0x0257
        L_0x018c:
            r0 = 2
            r14.A05(r0)
            goto L_0x0231
        L_0x0192:
            r0 = 2
        L_0x0193:
            r14.A05(r0)
            goto L_0x023f
        L_0x0198:
            r14.A05(r5)
            int r4 = r14.A00()
            r0 = 4194309(0x400005, float:5.877479E-39)
            if (r4 == r0) goto L_0x0257
            r0 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            int r4 = r4 + r0
            goto L_0x0257
        L_0x01a9:
            int r0 = r14.A00()
            r14.A07(r4, r0)
            goto L_0x01c0
        L_0x01b1:
            r14.A05(r5)
            int r0 = r14.A00()
            r14.A07(r4, r0)
            int r0 = r18 + 1
            r14.A07(r0, r8)
        L_0x01c0:
            if (r18 <= 0) goto L_0x0225
            int r3 = r18 + -1
            int[] r2 = r14.A07
            if (r2 == 0) goto L_0x01e6
            int r0 = r2.length
            if (r3 >= r0) goto L_0x01e6
            r1 = r2[r3]
            if (r1 != 0) goto L_0x01d3
            r1 = r3 | r6
            r2[r3] = r1
        L_0x01d3:
            if (r1 == r9) goto L_0x01e9
            if (r1 == r10) goto L_0x01e9
            r0 = r1 & r12
            if (r0 == r6) goto L_0x01dd
            if (r0 != r7) goto L_0x0225
        L_0x01dd:
            int r4 = r18 - r5
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
        L_0x01e2:
            r14.A07(r4, r1)
            return
        L_0x01e6:
            r1 = r3 | r6
            goto L_0x01d3
        L_0x01e9:
            r14.A07(r3, r8)
            return
        L_0x01ed:
            r0 = 2
        L_0x01ee:
            r14.A05(r0)
            goto L_0x0238
        L_0x01f2:
            int[] r2 = r14.A07
            r1 = 20971520(0x1400000, float:3.526483E-38)
            if (r2 == 0) goto L_0x0205
            int r0 = r2.length
            if (r4 >= r0) goto L_0x0205
            r0 = r2[r18]
            if (r0 != 0) goto L_0x0203
            r0 = r18 | r1
            r2[r18] = r0
        L_0x0203:
            r4 = r0
            goto L_0x0257
        L_0x0205:
            r4 = r18 | r1
            goto L_0x0257
        L_0x0208:
            r4 = 4194309(0x400005, float:5.877479E-39)
            goto L_0x0257
        L_0x020c:
            int r0 = r15.A03
            switch(r0) {
                case 3: goto L_0x022a;
                case 4: goto L_0x0231;
                case 5: goto L_0x0238;
                case 6: goto L_0x023f;
                case 7: goto L_0x0246;
                case 8: goto L_0x0249;
                default: goto L_0x0211;
            }
        L_0x0211:
            switch(r0) {
                case 15: goto L_0x021a;
                case 16: goto L_0x024c;
                case 17: goto L_0x0220;
                default: goto L_0x0214;
            }
        L_0x0214:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x021a:
            java.lang.String r1 = "java/lang/invoke/MethodHandle"
            goto L_0x024e
        L_0x021d:
            r14.A05(r4)
        L_0x0220:
            java.lang.String r1 = r15.A08
        L_0x0222:
            r14.A09(r1, r2)
        L_0x0225:
            return
        L_0x0226:
            r0 = 2
        L_0x0227:
            r14.A05(r0)
        L_0x022a:
            r14.A06(r1)
            return
        L_0x022e:
            r14.A05(r5)
        L_0x0231:
            r14.A06(r11)
            return
        L_0x0235:
            r14.A05(r5)
        L_0x0238:
            r14.A06(r9)
            goto L_0x0242
        L_0x023c:
            r14.A05(r5)
        L_0x023f:
            r14.A06(r10)
        L_0x0242:
            r14.A06(r8)
            return
        L_0x0246:
            java.lang.String r1 = "java/lang/Class"
            goto L_0x024e
        L_0x0249:
            java.lang.String r1 = "java/lang/String"
            goto L_0x024e
        L_0x024c:
            java.lang.String r1 = "java/lang/invoke/MethodType"
        L_0x024e:
            int r4 = r2.A0B(r1)
            r4 = r4 | r13
            goto L_0x0257
        L_0x0254:
            r4 = 71303172(0x4400004, float:2.2569499E-36)
        L_0x0257:
            r14.A06(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26278CwY.A0D(X.Cu8, X.Cwb, int, int):void");
    }

    public static int A02(String str, C26280Cwb cwb, int i) {
        char charAt = str.charAt(i);
        int i2 = 4194306;
        if (charAt == 'F') {
            return 4194306;
        }
        if (charAt == 'L') {
            return cwb.A0B(str.substring(i + 1, str.length() - 1)) | 8388608;
        }
        if (charAt != 'S') {
            if (charAt == 'V') {
                return 0;
            }
            if (charAt != 'I') {
                if (charAt == 'J') {
                    return 4194308;
                }
                if (charAt != 'Z') {
                    if (charAt != '[') {
                        switch (charAt) {
                            case 'B':
                            case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                                break;
                            case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER:
                                return 4194307;
                            default:
                                String substring = str.substring(i);
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("Invalid descriptor: ");
                                throw AnonymousClass001.A12(substring, A10);
                        }
                    } else {
                        int i3 = i + 1;
                        while (str.charAt(i3) == '[') {
                            i3++;
                        }
                        char charAt2 = str.charAt(i3);
                        if (charAt2 != 'F') {
                            if (charAt2 == 'L') {
                                i2 = cwb.A0B(str.substring(i3 + 1, str.length() - 1)) | 8388608;
                            } else if (charAt2 == 'S') {
                                i2 = 4194316;
                            } else if (charAt2 == 'Z') {
                                i2 = 4194313;
                            } else if (charAt2 == 'I') {
                                i2 = 4194305;
                            } else if (charAt2 != 'J') {
                                switch (charAt2) {
                                    case 'B':
                                        i2 = 4194314;
                                        break;
                                    case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                                        i2 = 4194315;
                                        break;
                                    case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER:
                                        i2 = 4194307;
                                        break;
                                    default:
                                        String substring2 = str.substring(i3);
                                        StringBuilder A102 = AnonymousClass000.A10();
                                        A102.append("Invalid descriptor fragment: ");
                                        throw AnonymousClass001.A12(substring2, A102);
                                }
                            } else {
                                i2 = 4194308;
                            }
                        }
                        return ((i3 - i) << 26) | i2;
                    }
                }
            }
        }
        return 4194305;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044 A[LOOP:0: B:7:0x0012->B:20:0x0044, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0030 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A04(X.C26278CwY r8, X.C26280Cwb r9, int r10) {
        /*
            r6 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r6) goto L_0x0011
            r0 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r10 & r0
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == r0) goto L_0x0011
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r0) goto L_0x0052
        L_0x0011:
            r7 = 0
        L_0x0012:
            int r0 = r8.A00
            if (r7 >= r0) goto L_0x0052
            int[] r0 = r8.A04
            r1 = r0[r7]
            r5 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r5 = r5 & r1
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r1
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r1 & r3
            r0 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r0) goto L_0x0047
            int[] r0 = r8.A05
            r1 = r0[r2]
        L_0x002d:
            int r1 = r1 + r5
        L_0x002e:
            if (r10 != r1) goto L_0x0044
            r1 = 8388608(0x800000, float:1.17549435E-38)
            if (r10 != r6) goto L_0x003c
            java.lang.String r0 = r9.A05
        L_0x0036:
            int r0 = r9.A0B(r0)
            r0 = r0 | r1
            return r0
        L_0x003c:
            r10 = r10 & r3
            X.Cu8[] r0 = r9.A09
            r0 = r0[r10]
            java.lang.String r0 = r0.A08
            goto L_0x0036
        L_0x0044:
            int r7 = r7 + 1
            goto L_0x0012
        L_0x0047:
            r0 = 25165824(0x1800000, float:4.7019774E-38)
            if (r4 != r0) goto L_0x002e
            int[] r1 = r8.A06
            int r0 = r1.length
            int r0 = r0 - r2
            r1 = r1[r0]
            goto L_0x002d
        L_0x0052:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26278CwY.A04(X.CwY, X.Cwb, int):int");
    }

    private void A08(String str) {
        char A002 = BE7.A00(str);
        if (A002 == '(') {
            A05((C26263Cw8.A01(str) >> 2) - 1);
        } else if (A002 == 'J' || A002 == 'D') {
            A05(2);
        } else {
            A05(1);
        }
    }
}
