package X;

/* renamed from: X.Cvp  reason: case insensitive filesystem */
public final class C26250Cvp {
    public static final int[] A0o = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
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
    public C26245Cvj A0C;
    public C26245Cvj A0D;
    public C26245Cvj A0E;
    public C26245Cvj A0F;
    public C26245Cvj A0G;
    public C26245Cvj A0H;
    public C26007CqO A0I;
    public C26151CtI A0J;
    public C26151CtI A0K;
    public C26151CtI A0L;
    public C26151CtI A0M;
    public C26151CtI A0N;
    public C26151CtI A0O;
    public C24980CSf A0P;
    public C24980CSf A0Q;
    public C26026Cqk A0R;
    public C26026Cqk A0S;
    public C26250Cvp A0T = null;
    public boolean A0U;
    public boolean A0V;
    public int[] A0W;
    public int[] A0X;
    public C26245Cvj[] A0Y;
    public C26245Cvj[] A0Z;
    public int A0a;
    public int A0b;
    public C26026Cqk A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final int A0h;
    public final int A0i;
    public final String A0j;
    public final String A0k;
    public final C26151CtI A0l = new C26151CtI();
    public final C26280Cwb A0m;
    public final int[] A0n;

    /* JADX WARNING: type inference failed for: r0v11, types: [X.Cqk, java.lang.Object] */
    public C26250Cvp(String str, String str2, String str3, C26280Cwb cwb, String[] strArr, int i, int i2) {
        int A0A2;
        int length;
        this.A0m = cwb;
        this.A0d = "<init>".equals(str) ? 262144 | i : i;
        this.A0g = cwb.A0A(str);
        this.A0k = str;
        this.A0f = cwb.A0A(str2);
        this.A0j = str2;
        if (str3 == null) {
            A0A2 = 0;
        } else {
            A0A2 = cwb.A0A(str3);
        }
        this.A0i = A0A2;
        if (strArr != null && (length = strArr.length) > 0) {
            this.A0h = length;
            this.A0n = new int[length];
            for (int i3 = 0; i3 < this.A0h; i3++) {
                this.A0n[i3] = C26280Cwb.A03(strArr[i3], cwb, 7).A02;
            }
        }
        this.A0e = i2;
        if (i2 != 0) {
            int A012 = C26263Cw8.A01(str2) >> 2;
            A012 = (i & 8) != 0 ? A012 - 1 : A012;
            this.A05 = A012;
            this.A0a = A012;
            ? obj = new Object();
            this.A0S = obj;
            A0G(obj);
        }
    }

    private void A00() {
        if (this.A0e == 1) {
            this.A0R.A08 = (short) this.A06;
            this.A0R = null;
        }
    }

    private void A01(int i, int i2) {
        String str;
        int i3;
        char c;
        while (i < i2) {
            C26280Cwb cwb = this.A0m;
            int i4 = this.A0W[i];
            C26151CtI ctI = this.A0O;
            int i5 = (-67108864 & i4) >> 26;
            if (i5 == 0) {
                int i6 = 1048575 & i4;
                int i7 = i4 & 62914560;
                if (i7 == 4194304) {
                    ctI.A03(i6);
                    i++;
                } else if (i7 == 8388608) {
                    ctI.A03(7);
                    str = cwb.A09[i6].A08;
                    i3 = C26280Cwb.A03(str, cwb, 7).A02;
                } else if (i7 == 12582912) {
                    ctI.A03(8);
                    i3 = (int) cwb.A09[i6].A05;
                } else if (i7 == 16777216) {
                    ctI.A03(8);
                    C26026Cqk cqk = cwb.A0B[(int) cwb.A09[i6].A05].A02;
                    if ((cqk.A05 & 4) == 0) {
                        C26026Cqk.A00(cqk, 0, 805306368, ctI.A00);
                    }
                    i3 = cqk.A00;
                } else {
                    throw new AssertionError();
                }
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                while (true) {
                    int i8 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    A10.append('[');
                    i5 = i8;
                }
                if ((i4 & 62914560) == 8388608) {
                    A10.append('L');
                    A10.append(cwb.A09[i4 & 1048575].A08);
                    c = ';';
                } else {
                    int i9 = i4 & 1048575;
                    c = 'I';
                    if (i9 != 1) {
                        c = 'F';
                        if (i9 != 2) {
                            c = 'D';
                            if (i9 != 3) {
                                if (i9 != 4) {
                                    switch (i9) {
                                        case 9:
                                            c = 'Z';
                                            break;
                                        case 10:
                                            c = 'B';
                                            break;
                                        case 11:
                                            c = 'C';
                                            break;
                                        case 12:
                                            c = 'S';
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {
                                    c = 'J';
                                }
                            }
                        }
                    }
                }
                A10.append(c);
                ctI.A03(7);
                str = A10.toString();
                i3 = C26280Cwb.A03(str, cwb, 7).A02;
            }
            ctI.A05(i3);
            i++;
        }
    }

    private void A02(Object obj) {
        if (obj instanceof Integer) {
            this.A0O.A03(AnonymousClass000.A0M(obj));
            return;
        }
        boolean z = obj instanceof String;
        C26151CtI ctI = this.A0O;
        if (z) {
            ctI.A03(7);
            C26280Cwb.A08((String) obj, ctI, this.A0m, 7);
            return;
        }
        ctI.A03(8);
        C26026Cqk cqk = (C26026Cqk) obj;
        C26151CtI ctI2 = this.A0O;
        if ((cqk.A05 & 4) == 0) {
            C26026Cqk.A00(cqk, 0, 805306368, ctI2.A00);
        }
        ctI2.A05(cqk.A00);
    }

    private void A03(C26026Cqk cqk, int i) {
        C26026Cqk cqk2 = this.A0R;
        cqk2.A01 = new C24938CQo(cqk2.A01, cqk, i);
    }

    public static void A04(C26026Cqk cqk, C26250Cvp cvp, C26026Cqk[] cqkArr) {
        if (cvp.A0R != null) {
            if (cvp.A0e == 1) {
                int i = cvp.A09 - 1;
                cvp.A09 = i;
                cvp.A03(cqk, i);
                for (C26026Cqk A032 : cqkArr) {
                    cvp.A03(A032, i);
                }
            }
            cvp.A00();
        }
    }

    public C26245Cvj A05(String str, CW2 cw2, int[] iArr, C26026Cqk[] cqkArr, C26026Cqk[] cqkArr2, int i, boolean z) {
        C26151CtI ctI = new C26151CtI();
        ctI.A03(i >>> 24);
        int length = cqkArr.length;
        ctI.A05(length);
        for (int i2 = 0; i2 < length; i2++) {
            ctI.A05(cqkArr[i2].A00);
            ctI.A05(cqkArr2[i2].A00 - cqkArr[i2].A00);
            ctI.A05(iArr[i2]);
        }
        if (cw2 == null) {
            ctI.A03(0);
        } else {
            byte[] bArr = cw2.A01;
            int i3 = cw2.A00;
            ctI.A0A(bArr, i3, (bArr[i3] * 2) + 1);
        }
        C26280Cwb cwb = this.A0m;
        C26280Cwb.A07(str, ctI, cwb);
        ctI.A05(0);
        if (z) {
            C26245Cvj cvj = new C26245Cvj(this.A0D, ctI, cwb, true);
            this.A0D = cvj;
            return cvj;
        }
        C26245Cvj cvj2 = new C26245Cvj(this.A0C, ctI, cwb, true);
        this.A0C = cvj2;
        return cvj2;
    }

    public void A06() {
        char c;
        int i;
        int[] iArr = this.A0X;
        if (iArr != null) {
            C26151CtI ctI = this.A0O;
            if (ctI == null) {
                ctI = new C26151CtI();
                this.A0O = ctI;
            }
            int[] iArr2 = this.A0W;
            int i2 = iArr2[1];
            int i3 = iArr2[2];
            int i4 = 0;
            if (this.A0m.A03 < 50) {
                ctI.A05(iArr2[0]);
                ctI.A05(i2);
                int i5 = i2 + 3;
                A01(3, i5);
                this.A0O.A05(i3);
                A01(i5, i5 + i3);
            } else {
                int i6 = this.A0A;
                int i7 = iArr2[0];
                if (i6 != 0) {
                    i7 = (i7 - iArr[0]) - 1;
                }
                int i8 = iArr[1];
                int i9 = i2 - i8;
                if (i3 == 0) {
                    switch (i9) {
                        case -3:
                        case -2:
                        case -1:
                            c = 248;
                            break;
                        case 0:
                            c = 251;
                            if (i7 < 64) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1:
                        case 2:
                        case 3:
                            c = 252;
                            break;
                    }
                    i = 3;
                    while (true) {
                        if (i4 < i8 || i4 >= i2) {
                            if (c != 0) {
                                if (c == '@') {
                                    ctI.A03(i7 + 64);
                                } else if (c == 247) {
                                    ctI.A03(247);
                                    ctI.A05(i7);
                                } else if (c == 248) {
                                    ctI.A03(i9 + 251);
                                    ctI.A05(i7);
                                } else if (c == 251) {
                                    ctI.A03(251);
                                    ctI.A05(i7);
                                } else if (c == 252) {
                                    ctI.A03(i9 + 251);
                                    ctI.A05(i7);
                                    A01(i8 + 3, i2 + 3);
                                }
                                A01(i2 + 3, i2 + 4);
                            } else {
                                ctI.A03(i7);
                            }
                        } else if (iArr2[i] == iArr[i]) {
                            i++;
                            i4++;
                        }
                    }
                } else if (i9 == 0 && i3 == 1) {
                    c = 247;
                    if (i7 < 63) {
                        c = '@';
                    }
                    i = 3;
                    while (true) {
                        if (i4 < i8) {
                        }
                        i++;
                        i4++;
                    }
                }
                ctI.A03(255);
                ctI.A05(i7);
                ctI.A05(i2);
                int i10 = i2 + 3;
                A01(3, i10);
                this.A0O.A05(i3);
                A01(i10, i10 + i3);
            }
            this.A0A++;
        }
        this.A0X = this.A0W;
        this.A0W = null;
    }

    public void A07(int i) {
        C26151CtI ctI = this.A0l;
        this.A01 = ctI.A00;
        ctI.A03(i);
        C26026Cqk cqk = this.A0R;
        if (cqk != null) {
            if (this.A0e == 3) {
                cqk.A02.A0D((C26184Cu8) null, (C26280Cwb) null, i, 0);
            } else {
                int i2 = this.A09 + A0o[i];
                if (i2 > this.A06) {
                    this.A06 = i2;
                }
                this.A09 = i2;
            }
            if (i < 172) {
                return;
            }
            if (i <= 177 || i == 191) {
                A00();
            }
        }
    }

    public void A08(int i, int i2) {
        int i3;
        C26151CtI ctI = this.A0l;
        this.A01 = ctI.A00;
        if (i > 255 || i2 > 127 || i2 < -128) {
            ctI.A03(196);
            ctI.A07(132, i);
            ctI.A05(i2);
        } else {
            ctI.A03(132);
            ctI.A06(i, i2);
        }
        C26026Cqk cqk = this.A0R;
        if (cqk != null && this.A0e == 3) {
            cqk.A02.A0D((C26184Cu8) null, (C26280Cwb) null, 132, i);
        }
        if (this.A0e != 0 && (i3 = i + 1) > this.A05) {
            this.A05 = i3;
        }
    }

    public void A09(int i, int i2) {
        C26151CtI ctI = this.A0l;
        this.A01 = ctI.A00;
        if (i == 17) {
            ctI.A07(i, i2);
        } else {
            ctI.A06(i, i2);
        }
        C26026Cqk cqk = this.A0R;
        if (cqk == null) {
            return;
        }
        if (this.A0e == 3) {
            cqk.A02.A0D((C26184Cu8) null, (C26280Cwb) null, i, i2);
        } else if (i != 188) {
            int i3 = this.A09 + 1;
            if (i3 > this.A06) {
                this.A06 = i3;
            }
            this.A09 = i3;
        }
    }

    public void A0A(int i, int i2) {
        int i3 = this.A0e;
        short s = 1;
        if (i3 == 1) {
            for (C24980CSf cSf = this.A0P; cSf != null; cSf = cSf.A00) {
                C26026Cqk cqk = cSf.A03;
                C26026Cqk cqk2 = cSf.A02;
                for (C26026Cqk cqk3 = cSf.A04; cqk3 != cqk2; cqk3 = cqk3.A03) {
                    if ((cqk3.A05 & 16) == 0) {
                        cqk3.A01 = new C24938CQo(cqk3.A01, cqk, Integer.MAX_VALUE);
                    } else {
                        C24938CQo cQo = cqk3.A01.A00;
                        cQo.A00 = new C24938CQo(cQo.A00, cqk, Integer.MAX_VALUE);
                    }
                }
            }
            if (this.A0V) {
                C26026Cqk cqk4 = this.A0S;
                cqk4.A02(1);
                short s2 = 1;
                do {
                    C26026Cqk cqk5 = cqk4;
                    do {
                        if ((cqk5.A05 & 16) != 0 && cqk5.A0A == s) {
                            C26026Cqk cqk6 = cqk5.A01.A00.A02;
                            if (cqk6.A0A == 0) {
                                s2 = (short) (s2 + 1);
                                cqk6.A02(s2);
                            }
                        }
                        cqk5 = cqk5.A03;
                    } while (cqk5 != null);
                    s = (short) (s + 1);
                } while (s <= s2);
                do {
                    if ((cqk4.A05 & 16) != 0) {
                        C26026Cqk cqk7 = cqk4.A01.A00.A02;
                        C26026Cqk cqk8 = C26026Cqk.A0D;
                        cqk7.A04 = cqk8;
                        C26026Cqk cqk9 = cqk8;
                        while (cqk7 != cqk8) {
                            C26026Cqk cqk10 = cqk7.A04;
                            cqk7.A04 = cqk9;
                            if (!((cqk7.A05 & 64) == 0 || cqk7.A0A == cqk4.A0A)) {
                                short s3 = cqk7.A09;
                                cqk7.A01 = new C24938CQo(cqk7.A01, cqk4.A01.A02, s3);
                            }
                            C24938CQo cQo2 = cqk7.A01;
                            C24938CQo cQo3 = cQo2;
                            while (cQo2 != null) {
                                if (((cqk7.A05 & 16) == 0 || cQo2 != cQo3.A00) && cQo2.A02.A04 == null) {
                                    C26026Cqk cqk11 = cQo2.A02;
                                    cqk11.A04 = cqk10;
                                    cqk10 = cqk11;
                                }
                                cQo2 = cQo2.A00;
                            }
                            cqk9 = cqk7;
                            cqk7 = cqk10;
                        }
                        while (cqk9 != cqk8) {
                            C26026Cqk cqk12 = cqk9.A04;
                            cqk9.A04 = null;
                            cqk9 = cqk12;
                        }
                    }
                    cqk4 = cqk4.A03;
                } while (cqk4 != null);
            }
            C26026Cqk cqk13 = this.A0S;
            C26026Cqk cqk14 = C26026Cqk.A0D;
            cqk13.A04 = cqk14;
            int i4 = this.A07;
            while (cqk13 != cqk14) {
                C26026Cqk cqk15 = cqk13.A04;
                short s4 = cqk13.A06;
                int i5 = cqk13.A08 + s4;
                if (i5 > i4) {
                    i4 = i5;
                }
                C24938CQo cQo4 = cqk13.A01;
                if ((cqk13.A05 & 16) != 0) {
                    cQo4 = cQo4.A00;
                }
                cqk13 = cqk15;
                while (cQo4 != null) {
                    C26026Cqk cqk16 = cQo4.A02;
                    if (cqk16.A04 == null) {
                        int i6 = cQo4.A01;
                        int i7 = i6 + s4;
                        if (i6 == Integer.MAX_VALUE) {
                            i7 = 1;
                        }
                        cqk16.A06 = (short) i7;
                        cqk16.A04 = cqk13;
                        cqk13 = cqk16;
                    }
                    cQo4 = cQo4.A00;
                }
            }
            this.A07 = i4;
        } else if (i3 == 2) {
            this.A07 = this.A06;
        } else {
            this.A07 = i;
            this.A05 = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r5 == 57) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(int r5, int r6) {
        /*
            r4 = this;
            X.CtI r2 = r4.A0l
            int r0 = r2.A00
            r4.A01 = r0
            r3 = 169(0xa9, float:2.37E-43)
            r1 = 54
            r0 = 4
            if (r6 >= r0) goto L_0x0071
            if (r5 == r3) goto L_0x007e
            int r0 = r5 + -54
            int r0 = r0 << 2
            int r0 = r0 + 59
            if (r5 >= r1) goto L_0x001d
            int r0 = r5 + -21
            int r0 = r0 << 2
            int r0 = r0 + 26
        L_0x001d:
            int r0 = r0 + r6
            r2.A03(r0)
        L_0x0021:
            X.Cqk r2 = r4.A0R
            if (r2 == 0) goto L_0x0030
            int r1 = r4.A0e
            r0 = 3
            if (r1 != r0) goto L_0x004f
            X.CwY r1 = r2.A02
            r0 = 0
            r1.A0D(r0, r0, r5, r6)
        L_0x0030:
            int r0 = r4.A0e
            if (r0 == 0) goto L_0x004e
            r0 = 22
            if (r5 == r0) goto L_0x0046
            r0 = 24
            if (r5 == r0) goto L_0x0046
            r0 = 55
            if (r5 == r0) goto L_0x0046
            r0 = 57
            int r1 = r6 + 1
            if (r5 != r0) goto L_0x0048
        L_0x0046:
            int r1 = r6 + 2
        L_0x0048:
            int r0 = r4.A05
            if (r1 <= r0) goto L_0x004e
            r4.A05 = r1
        L_0x004e:
            return
        L_0x004f:
            if (r5 != r3) goto L_0x0061
            short r0 = r2.A05
            r0 = r0 | 64
            short r0 = (short) r0
            r2.A05 = r0
            int r0 = r4.A09
            short r0 = (short) r0
            r2.A09 = r0
            r4.A00()
            goto L_0x0030
        L_0x0061:
            int r1 = r4.A09
            int[] r0 = A0o
            r0 = r0[r5]
            int r1 = r1 + r0
            int r0 = r4.A06
            if (r1 <= r0) goto L_0x006e
            r4.A06 = r1
        L_0x006e:
            r4.A09 = r1
            goto L_0x0030
        L_0x0071:
            r0 = 256(0x100, float:3.59E-43)
            if (r6 < r0) goto L_0x007e
            r0 = 196(0xc4, float:2.75E-43)
            r2.A03(r0)
            r2.A07(r5, r6)
            goto L_0x0021
        L_0x007e:
            r2.A06(r5, r6)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26250Cvp.A0B(int, int):void");
    }

    public void A0C(int i, String str) {
        C26151CtI ctI = this.A0l;
        this.A01 = ctI.A00;
        C26280Cwb cwb = this.A0m;
        C26184Cu8 A032 = C26280Cwb.A03(str, cwb, 7);
        ctI.A07(i, A032.A02);
        C26026Cqk cqk = this.A0R;
        if (cqk == null) {
            return;
        }
        if (this.A0e == 3) {
            cqk.A02.A0D(A032, cwb, i, this.A01);
        } else if (i == 187) {
            int i2 = this.A09 + 1;
            if (i2 > this.A06) {
                this.A06 = i2;
            }
            this.A09 = i2;
        }
    }

    public void A0D(int i, String str, String str2, String str3) {
        int i2;
        C26151CtI ctI = this.A0l;
        this.A01 = ctI.A00;
        C26280Cwb cwb = this.A0m;
        C26184Cu8 A012 = C26280Cwb.A01(str, str2, str3, cwb, 9);
        ctI.A07(i, A012.A02);
        C26026Cqk cqk = this.A0R;
        if (cqk != null) {
            int i3 = 0;
            if (this.A0e == 3) {
                cqk.A02.A0D(A012, cwb, i, 0);
                return;
            }
            char charAt = str3.charAt(0);
            int i4 = 1;
            int i5 = -2;
            int i6 = this.A09;
            switch (i) {
                case 178:
                    if (charAt == 'D' || charAt == 'J') {
                        i4 = 2;
                    }
                    i2 = i6 + i4;
                    break;
                case 179:
                    if (!(charAt == 'D' || charAt == 'J')) {
                        i5 = -1;
                        break;
                    }
                case 180:
                    if (charAt == 'D' || charAt == 'J') {
                        i3 = 1;
                    }
                    i2 = i6 + i3;
                    break;
                default:
                    if (charAt == 'D' || charAt == 'J') {
                        i5 = -3;
                        break;
                    }
            }
            i2 = i6 + i5;
            if (i2 > this.A06) {
                this.A06 = i2;
            }
            this.A09 = i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(java.lang.Object r11) {
        /*
            r10 = this;
            X.CtI r2 = r10.A0l
            int r0 = r2.A00
            r10.A01 = r0
            X.Cwb r6 = r10.A0m
            X.Cu8 r7 = r6.A0E(r11)
            int r8 = r7.A02
            int r1 = r7.A03
            r0 = 5
            r9 = 1
            r5 = 0
            if (r1 == r0) goto L_0x002a
            r0 = 6
            if (r1 == r0) goto L_0x002a
            r0 = 17
            if (r1 != r0) goto L_0x004d
            java.lang.String r0 = r7.A08
            char r1 = r0.charAt(r5)
            r0 = 74
            if (r1 == r0) goto L_0x002a
            r0 = 68
            if (r1 != r0) goto L_0x004d
        L_0x002a:
            r4 = 1
        L_0x002b:
            r3 = 18
            r0 = 20
            if (r4 != 0) goto L_0x0037
            r0 = 256(0x100, float:3.59E-43)
            if (r8 < r0) goto L_0x0049
            r0 = 19
        L_0x0037:
            r2.A07(r0, r8)
        L_0x003a:
            X.Cqk r2 = r10.A0R
            if (r2 == 0) goto L_0x0048
            int r1 = r10.A0e
            r0 = 3
            if (r1 != r0) goto L_0x004f
            X.CwY r0 = r2.A02
            r0.A0D(r7, r6, r3, r5)
        L_0x0048:
            return
        L_0x0049:
            r2.A06(r3, r8)
            goto L_0x003a
        L_0x004d:
            r4 = 0
            goto L_0x002b
        L_0x004f:
            int r1 = r10.A09
            if (r4 == 0) goto L_0x0054
            r9 = 2
        L_0x0054:
            int r1 = r1 + r9
            int r0 = r10.A06
            if (r1 <= r0) goto L_0x005b
            r10.A06 = r1
        L_0x005b:
            r10.A09 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26250Cvp.A0E(java.lang.Object):void");
    }

    public void A0F(String str, String str2, String str3, int i, boolean z) {
        C26151CtI ctI = this.A0l;
        this.A01 = ctI.A00;
        C26280Cwb cwb = this.A0m;
        int i2 = 10;
        if (z) {
            i2 = 11;
        }
        C26184Cu8 A012 = C26280Cwb.A01(str, str2, str3, cwb, i2);
        int i3 = A012.A02;
        if (i == 185) {
            ctI.A07(185, i3);
            int i4 = A012.A00;
            if (i4 == 0) {
                i4 = C26263Cw8.A01(A012.A08);
                A012.A00 = i4;
            }
            ctI.A06(i4 >> 2, 0);
        } else {
            ctI.A07(i, i3);
        }
        C26026Cqk cqk = this.A0R;
        if (cqk == null) {
            return;
        }
        if (this.A0e == 3) {
            cqk.A02.A0D(A012, cwb, i, 0);
            return;
        }
        int i5 = A012.A00;
        if (i5 == 0) {
            i5 = C26263Cw8.A01(A012.A08);
            A012.A00 = i5;
        }
        int i6 = this.A09 + ((i5 & 3) - (i5 >> 2));
        if (i == 184) {
            i6++;
        }
        if (i6 > this.A06) {
            this.A06 = i6;
        }
        this.A09 = i6;
    }

    public void A0G(C26026Cqk cqk) {
        int A0A2;
        boolean z = this.A0U;
        C26151CtI ctI = this.A0l;
        byte[] bArr = ctI.A01;
        C26151CtI ctI2 = this.A0O;
        int i = ctI.A00;
        C26026Cqk cqk2 = cqk;
        short s = (short) (cqk2.A05 | 4);
        cqk2.A05 = s;
        cqk2.A00 = i;
        int[] iArr = cqk2.A0B;
        boolean z2 = false;
        if (iArr != null) {
            for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
                int i3 = iArr[i2 - 1];
                int i4 = iArr[i2];
                int i5 = i - i3;
                int i6 = 268435455 & i4;
                if ((i4 & -268435456) == 268435456) {
                    if (i5 < -32768 || i5 > 32767) {
                        byte b = bArr[i3] & 255;
                        int i7 = b + 20;
                        if (b < 198) {
                            i7 = b + 49;
                        }
                        bArr[i3] = (byte) i7;
                        z2 = true;
                    }
                    A0A2 = i6 + 1;
                    bArr[i6] = (byte) (i5 >>> 8);
                } else if ((i4 & -268435456) == 536870912) {
                    int i8 = i6 + 1;
                    int A0A3 = BE6.A0A(i5 >>> 24, bArr, i6, i8);
                    A0A2 = BE6.A0A(i5 >>> 16, bArr, i8, A0A3);
                    bArr[A0A3] = (byte) (i5 >>> 8);
                } else {
                    byte[] bArr2 = ctI2.A01;
                    bArr2[i6] = (byte) (i >>> 8);
                    bArr2[i6 + 1] = (byte) i;
                }
                bArr[A0A2] = (byte) i5;
            }
        }
        this.A0U = z | z2;
        if ((s & 1) == 0) {
            int i9 = this.A0e;
            if (i9 == 3) {
                C26026Cqk cqk3 = this.A0R;
                if (cqk3 != null) {
                    cqk3.A02.A01 = cqk2;
                    return;
                }
            } else if (i9 == 1) {
                C26026Cqk cqk4 = this.A0R;
                if (cqk4 != null) {
                    cqk4.A08 = (short) this.A06;
                    A03(cqk2, this.A09);
                }
                this.A0R = cqk2;
                this.A09 = 0;
                this.A06 = 0;
                C26026Cqk cqk5 = this.A0c;
                if (cqk5 != null) {
                    cqk5.A03 = cqk2;
                }
                this.A0c = cqk2;
                return;
            } else if (!(i9 == 2 && this.A0R == null)) {
                return;
            }
            this.A0R = cqk2;
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.Cqk, java.lang.Object] */
    public void A0H(C26026Cqk cqk, int i) {
        boolean z;
        C26151CtI ctI = this.A0l;
        int i2 = ctI.A00;
        this.A01 = i2;
        int i3 = 200;
        int i4 = i;
        if (i >= 200) {
            i4 = i - 33;
        }
        if ((cqk.A05 & 4) == 0 || cqk.A00 - i2 >= -32768) {
            if (i4 != i) {
                ctI.A03(i);
                cqk.A01(ctI, ctI.A00 - 1, true);
            } else {
                ctI.A03(i4);
                cqk.A01(ctI, ctI.A00 - 1, false);
            }
            z = false;
        } else {
            if (i4 != 167) {
                if (i4 == 168) {
                    i3 = 201;
                } else {
                    int i5 = ((i4 + 1) ^ 1) - 1;
                    if (i4 >= 198) {
                        i5 = i4 ^ 1;
                    }
                    ctI.A03(i5);
                    ctI.A05(8);
                    ctI.A03(220);
                    this.A0U = true;
                    z = true;
                    cqk.A01(ctI, ctI.A00 - 1, true);
                }
            }
            ctI.A03(i3);
            z = false;
            cqk.A01(ctI, ctI.A00 - 1, true);
        }
        C26026Cqk cqk2 = this.A0R;
        if (cqk2 != null) {
            int i6 = this.A0e;
            if (i6 == 3) {
                cqk2.A02.A0D((C26184Cu8) null, (C26280Cwb) null, i4, 0);
            } else if (i6 == 2) {
                this.A09 += A0o[i4];
            } else if (i4 == 168) {
                short s = cqk.A05;
                if ((s & 32) == 0) {
                    cqk.A05 = (short) (s | 32);
                    this.A0V = true;
                }
                cqk2.A05 = (short) (cqk2.A05 | 16);
                A03(cqk, this.A09 + 1);
                ? obj = new Object();
                if (z) {
                    obj.A05 = (short) (obj.A05 | 2);
                }
                A0G(obj);
                return;
            } else {
                int i7 = this.A09 + A0o[i4];
                this.A09 = i7;
                A03(cqk, i7);
            }
            if (i4 == 167) {
                A00();
            }
        }
    }

    public void A0I(C26026Cqk cqk, C26026Cqk[] cqkArr, int i, int i2) {
        C26151CtI ctI = this.A0l;
        this.A01 = ctI.A00;
        ctI.A03(170);
        ctI.A0A((byte[]) null, 0, (4 - (ctI.A00 % 4)) % 4);
        cqk.A01(ctI, this.A01, true);
        ctI.A04(i);
        ctI.A04(i2);
        for (C26026Cqk A012 : cqkArr) {
            A012.A01(ctI, this.A01, true);
        }
        A04(cqk, this, cqkArr);
    }

    /* JADX WARNING: type inference failed for: r0v34, types: [X.Cqk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v11, types: [X.CwY, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.CwY, java.lang.Object] */
    public void A0J(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        C26151CtI ctI;
        int i4;
        int i5 = this.A0e;
        if (i5 == 3) {
            C26026Cqk cqk = this.A0R;
            C26278CwY cwY = cqk.A02;
            if (cwY == null) {
                ? obj = new Object();
                obj.A01 = cqk;
                cqk.A02 = obj;
                obj.A0B(this.A0j, this.A0m, this.A0d, i2);
            } else if (i == -1) {
                C26280Cwb cwb = this.A0m;
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    int i8 = i6 + 1;
                    cwY.A05[i6] = C26278CwY.A01(objArr[i7], cwb);
                    if (objArr[i7] == EB6.A03 || objArr[i7] == EB6.A00) {
                        i6 = i8 + 1;
                        cwY.A05[i8] = 4194304;
                    } else {
                        i6 = i8;
                    }
                }
                while (true) {
                    int[] iArr = cwY.A05;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    iArr[i6] = 4194304;
                    i6++;
                }
                int i9 = 0;
                for (int i10 = 0; i10 < i3; i10++) {
                    if (objArr2[i10] == EB6.A03 || objArr2[i10] == EB6.A00) {
                        i9++;
                    }
                }
                cwY.A06 = new int[(i9 + i3)];
                int i11 = 0;
                for (int i12 = 0; i12 < i3; i12++) {
                    int i13 = i11 + 1;
                    cwY.A06[i11] = C26278CwY.A01(objArr2[i12], cwb);
                    if (objArr2[i12] == EB6.A03 || objArr2[i12] == EB6.A00) {
                        i11 = i13 + 1;
                        cwY.A06[i13] = 4194304;
                    } else {
                        i11 = i13;
                    }
                }
                cwY.A03 = 0;
                cwY.A00 = 0;
            }
            this.A0R.A02.A0C(this);
        } else {
            if (i == -1) {
                if (this.A0X == null) {
                    String str = this.A0j;
                    ? obj2 = new Object();
                    ? obj3 = new Object();
                    obj3.A01 = obj2;
                    obj3.A0B(str, this.A0m, this.A0d, C26263Cw8.A01(str) >> 2);
                    obj3.A0C(this);
                }
                this.A0a = i2;
                int i14 = this.A0l.A00;
                int i15 = i2 + 3 + i3;
                int[] iArr2 = this.A0W;
                if (iArr2 == null || iArr2.length < i15) {
                    iArr2 = new int[i15];
                    this.A0W = iArr2;
                }
                iArr2[0] = i14;
                iArr2[1] = i2;
                iArr2[2] = i3;
                int i16 = 3;
                int i17 = 0;
                while (i17 < i2) {
                    this.A0W[i16] = C26278CwY.A01(objArr[i17], this.A0m);
                    i17++;
                    i16++;
                }
                int i18 = 0;
                while (i18 < i3) {
                    this.A0W[i16] = C26278CwY.A01(objArr2[i18], this.A0m);
                    i18++;
                    i16++;
                }
                A06();
            } else if (this.A0m.A03 >= 50) {
                C26151CtI ctI2 = this.A0O;
                if (ctI2 == null) {
                    ctI2 = new C26151CtI();
                    this.A0O = ctI2;
                    ctI = this.A0l;
                    i4 = ctI.A00;
                } else {
                    ctI = this.A0l;
                    i4 = (ctI.A00 - this.A0b) - 1;
                    if (i4 < 0) {
                        if (i != 3) {
                            throw BE6.A0k();
                        }
                        return;
                    }
                }
                if (i == 0) {
                    this.A0a = i2;
                    ctI2.A03(255);
                    ctI2.A05(i4);
                    ctI2.A05(i2);
                    for (int i19 = 0; i19 < i2; i19++) {
                        A02(objArr[i19]);
                    }
                    this.A0O.A05(i3);
                    for (int i20 = 0; i20 < i3; i20++) {
                        A02(objArr2[i20]);
                    }
                } else if (i != 1) {
                    int i21 = 251;
                    if (i == 2) {
                        this.A0a -= i2;
                        i21 = 251 - i2;
                    } else if (i != 3) {
                        if (i == 4) {
                            if (i4 < 64) {
                                ctI2.A03(i4 + 64);
                            } else {
                                ctI2.A03(247);
                                ctI2.A05(i4);
                            }
                            A02(objArr2[0]);
                        } else {
                            throw BE6.A0j();
                        }
                    } else if (i4 < 64) {
                        ctI2.A03(i4);
                    }
                    ctI2.A03(i21);
                    ctI2.A05(i4);
                } else {
                    this.A0a += i2;
                    ctI2.A03(i2 + 251);
                    ctI2.A05(i4);
                    for (int i22 = 0; i22 < i2; i22++) {
                        A02(objArr[i22]);
                    }
                }
                this.A0b = ctI.A00;
                this.A0A++;
            } else {
                throw AnonymousClass000.A0k("Class versions V1_5 or less must use F_NEW frames.");
            }
            if (i5 == 2) {
                this.A09 = i3;
                int i23 = i3;
                for (int i24 = 0; i24 < i3; i24++) {
                    if (objArr2[i24] == EB6.A03 || objArr2[i24] == EB6.A00) {
                        i23++;
                        this.A09 = i23;
                    }
                }
                if (i23 > this.A06) {
                    this.A06 = i23;
                }
            }
        }
        this.A07 = Math.max(this.A07, i3);
        this.A05 = Math.max(this.A05, this.A0a);
    }
}
