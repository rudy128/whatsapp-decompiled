package X;

/* renamed from: X.Cwv  reason: case insensitive filesystem */
public class C26290Cwv {
    public final int A00;
    public final int A01;
    @Deprecated
    public final byte[] A02;
    public final byte[] A03;
    public final int[] A04;
    public final int[] A05;
    public final String[] A06;
    public final C25212Cb8[] A07;

    public static String A08(C26290Cwv cwv, char[] cArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = i2 + i;
        byte[] bArr = cwv.A03;
        int i6 = 0;
        while (i < i5) {
            int i7 = i + 1;
            byte b = bArr[i];
            if ((b & 128) == 0) {
                i3 = i6 + 1;
                i4 = b & Byte.MAX_VALUE;
            } else {
                i3 = i6 + 1;
                if ((b & 224) == 192) {
                    i = i7 + 1;
                    cArr[i6] = (char) (((b & 31) << 6) + (bArr[i7] & 63));
                    i6 = i3;
                } else {
                    int i8 = i7 + 1;
                    i7 = i8 + 1;
                    i4 = ((b & 15) << 12) + ((bArr[i7] & 63) << 6) + (bArr[i8] & 63);
                }
            }
            cArr[i6] = (char) i4;
            i = i7;
            i6 = i3;
        }
        return new String(cArr, 0, i6);
    }

    public static C26007CqO A09(String str, C26290Cwv cwv, C26007CqO[] cqOArr, int i, int i2) {
        C26007CqO cqO;
        int length = cqOArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                cqO = new C26007CqO(str);
                break;
            }
            cqO = cqOArr[i3];
            if (cqO.A02.equals(str)) {
                break;
            }
            i3++;
        }
        C26007CqO cqO2 = new C26007CqO(cqO.A02);
        byte[] bArr = new byte[i2];
        cqO2.A01 = bArr;
        System.arraycopy(cwv.A03, i, bArr, 0, i2);
        return cqO2;
    }

    public static int A00(String str, C26245Cvj cvj, C26290Cwv cwv, char[] cArr, int i) {
        C26245Cvj cvj2;
        int i2;
        Object obj;
        int i3 = 0;
        byte[] bArr = cwv.A03;
        if (cvj == null) {
            byte b = bArr[i] & 255;
            cvj2 = null;
            if (b == 64) {
                return A01((C26245Cvj) null, cwv, cArr, i + 3, true);
            }
            if (b != 91) {
                int i4 = i + 5;
                if (b != 101) {
                    return i + 3;
                }
                return i4;
            }
            i2 = i + 1;
        } else {
            int i5 = i + 1;
            byte b2 = bArr[i] & 255;
            if (b2 != 64) {
                if (b2 != 70) {
                    if (b2 == 83) {
                        obj = Short.valueOf((short) cwv.A0F(cwv.A05[BEA.A0D(bArr, i5)]));
                    } else if (b2 == 99) {
                        String A0J = cwv.A0J(cArr, i5);
                        obj = C26263Cw8.A04(A0J, 0, A0J.length());
                    } else if (b2 == 101) {
                        String A0J2 = cwv.A0J(cArr, i5);
                        String A0J3 = cwv.A0J(cArr, i5 + 2);
                        cvj.A00++;
                        if (cvj.A04) {
                            C26280Cwb.A07(str, cvj.A02, cvj.A03);
                        }
                        C26151CtI ctI = cvj.A02;
                        C26280Cwb cwb = cvj.A03;
                        ctI.A07(101, cwb.A0A(A0J2));
                        C26280Cwb.A07(A0J3, ctI, cwb);
                        return i5 + 4;
                    } else if (b2 == 115) {
                        obj = cwv.A0J(cArr, i5);
                    } else if (!(b2 == 73 || b2 == 74)) {
                        if (b2 != 90) {
                            if (b2 != 91) {
                                switch (b2) {
                                    case 66:
                                        obj = Byte.valueOf((byte) cwv.A0F(cwv.A05[BEA.A0D(bArr, i5)]));
                                        break;
                                    case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                                        obj = Character.valueOf((char) cwv.A0F(cwv.A05[BEA.A0D(bArr, i5)]));
                                        break;
                                    case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER:
                                        break;
                                    default:
                                        throw BE6.A0j();
                                }
                            } else {
                                int A0D = BEA.A0D(bArr, i5);
                                int i6 = i5 + 2;
                                if (A0D == 0) {
                                    cvj2 = cvj.A07(str);
                                    i2 = i6 - 2;
                                } else {
                                    byte b3 = bArr[i6] & 255;
                                    if (b3 == 70) {
                                        float[] fArr = new float[A0D];
                                        while (i3 < A0D) {
                                            fArr[i3] = Float.intBitsToFloat(A03(cwv, i6));
                                            i6 += 3;
                                            i3++;
                                        }
                                        cvj.A09(str, fArr);
                                        return i6;
                                    } else if (b3 == 83) {
                                        short[] sArr = new short[A0D];
                                        while (i3 < A0D) {
                                            sArr[i3] = (short) A03(cwv, i6);
                                            i6 += 3;
                                            i3++;
                                        }
                                        cvj.A09(str, sArr);
                                        return i6;
                                    } else if (b3 == 90) {
                                        boolean[] zArr = new boolean[A0D];
                                        for (int i7 = 0; i7 < A0D; i7++) {
                                            zArr[i7] = AnonymousClass000.A1O(A03(cwv, i6));
                                            i6 += 3;
                                        }
                                        cvj.A09(str, zArr);
                                        return i6;
                                    } else if (b3 == 73) {
                                        int[] iArr = new int[A0D];
                                        while (i3 < A0D) {
                                            iArr[i3] = A03(cwv, i6);
                                            i6 += 3;
                                            i3++;
                                        }
                                        cvj.A09(str, iArr);
                                        return i6;
                                    } else if (b3 != 74) {
                                        switch (b3) {
                                            case 66:
                                                byte[] bArr2 = new byte[A0D];
                                                while (i3 < A0D) {
                                                    bArr2[i3] = (byte) A03(cwv, i6);
                                                    i6 += 3;
                                                    i3++;
                                                }
                                                cvj.A09(str, bArr2);
                                                return i6;
                                            case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                                                char[] cArr2 = new char[A0D];
                                                while (i3 < A0D) {
                                                    cArr2[i3] = (char) A03(cwv, i6);
                                                    i6 += 3;
                                                    i3++;
                                                }
                                                cvj.A09(str, cArr2);
                                                return i6;
                                            case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER:
                                                double[] dArr = new double[A0D];
                                                while (i3 < A0D) {
                                                    dArr[i3] = Double.longBitsToDouble(cwv.A0H(cwv.A05[BEA.A0D(bArr, i6 + 1)]));
                                                    i6 += 3;
                                                    i3++;
                                                }
                                                cvj.A09(str, dArr);
                                                return i6;
                                            default:
                                                return A01(cvj.A07(str), cwv, cArr, i6 - 2, false);
                                        }
                                    } else {
                                        long[] jArr = new long[A0D];
                                        while (i3 < A0D) {
                                            jArr[i3] = cwv.A0H(cwv.A05[BEA.A0D(bArr, i6 + 1)]);
                                            i6 += 3;
                                            i3++;
                                        }
                                        cvj.A09(str, jArr);
                                        return i6;
                                    }
                                }
                            }
                        } else if (cwv.A0F(cwv.A05[BEA.A0D(bArr, i5)]) == 0) {
                            obj = Boolean.FALSE;
                        } else {
                            obj = Boolean.TRUE;
                        }
                    }
                    cvj.A09(str, obj);
                    return i5 + 2;
                }
                obj = cwv.A0I(cArr, BEA.A0D(bArr, i5));
                cvj.A09(str, obj);
                return i5 + 2;
            }
            String A0J4 = cwv.A0J(cArr, i5);
            cvj.A00++;
            if (cvj.A04) {
                C26280Cwb.A07(str, cvj.A02, cvj.A03);
            }
            C26151CtI ctI2 = cvj.A02;
            C26280Cwb cwb2 = cvj.A03;
            ctI2.A07(64, cwb2.A0A(A0J4));
            ctI2.A05(0);
            return A01(new C26245Cvj((C26245Cvj) null, ctI2, cwb2, true), cwv, cArr, i5 + 2, true);
        }
        return A01(cvj2, cwv, cArr, i2, false);
    }

    public static int A01(C26245Cvj cvj, C26290Cwv cwv, char[] cArr, int i, boolean z) {
        int A0D = BEA.A0D(cwv.A03, i);
        int i2 = i + 2;
        if (!z) {
            while (true) {
                int i3 = A0D - 1;
                if (A0D <= 0) {
                    break;
                }
                i2 = A00((String) null, cvj, cwv, cArr, i2);
                A0D = i3;
            }
        } else {
            while (true) {
                int i4 = A0D - 1;
                if (A0D <= 0) {
                    break;
                }
                i2 = A00(cwv.A0J(cArr, i2), cvj, cwv, cArr, i2 + 2);
                A0D = i4;
            }
        }
        if (cvj != null) {
            cvj.A08();
        }
        return i2;
    }

    public static int A02(C26290Cwv cwv, int i) {
        return cwv.A0G(i + 2);
    }

    public static int A03(C26290Cwv cwv, int i) {
        return cwv.A0F(cwv.A05[cwv.A0G(i + 1)]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r5[r8] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r5[r8] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        return r1 + 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A05(X.C26290Cwv r3, char[] r4, java.lang.Object[] r5, X.C26026Cqk[] r6, int r7, int r8) {
        /*
            byte[] r2 = r3.A03
            int r1 = r7 + 1
            byte r0 = r2[r7]
            r0 = r0 & 255(0xff, float:3.57E-43)
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x001c;
                case 2: goto L_0x001f;
                case 3: goto L_0x0022;
                case 4: goto L_0x0025;
                case 5: goto L_0x0028;
                case 6: goto L_0x002b;
                case 7: goto L_0x0030;
                case 8: goto L_0x0010;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()
            throw r0
        L_0x0010:
            int r0 = X.BEA.A0D(r2, r1)
            X.Cqk r0 = A0A(r6, r0)
            goto L_0x0034
        L_0x0019:
            java.lang.Integer r0 = X.EB6.A05
            goto L_0x002d
        L_0x001c:
            java.lang.Integer r0 = X.EB6.A02
            goto L_0x002d
        L_0x001f:
            java.lang.Integer r0 = X.EB6.A01
            goto L_0x002d
        L_0x0022:
            java.lang.Integer r0 = X.EB6.A00
            goto L_0x002d
        L_0x0025:
            java.lang.Integer r0 = X.EB6.A03
            goto L_0x002d
        L_0x0028:
            java.lang.Integer r0 = X.EB6.A04
            goto L_0x002d
        L_0x002b:
            java.lang.Integer r0 = X.EB6.A06
        L_0x002d:
            r5[r8] = r0
            return r1
        L_0x0030:
            java.lang.String r0 = A07(r3, r4, r1)
        L_0x0034:
            r5[r8] = r0
            int r1 = r1 + 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26290Cwv.A05(X.Cwv, char[], java.lang.Object[], X.Cqk[], int, int):int");
    }

    public static int A06(C26290Cwv cwv, int[] iArr, int i) {
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        int i2 = iArr[i];
        byte[] bArr = cwv.A03;
        if ((bArr[i2] & 255) >= 67) {
            return BEA.A0D(bArr, i2 + 1);
        }
        return -1;
    }

    public static String A07(C26290Cwv cwv, char[] cArr, int i) {
        return cwv.A0J(cArr, cwv.A05[BEA.A0D(cwv.A03, i)]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C26026Cqk A0A(X.C26026Cqk[] r1, int r2) {
        /*
            r0 = r1[r2]
            if (r0 != 0) goto L_0x000b
            X.Cqk r0 = new X.Cqk
            r0.<init>()
            r1[r2] = r0
        L_0x000b:
            r1 = r1[r2]
            short r0 = r1.A05
            r0 = r0 & -2
            short r0 = (short) r0
            r1.A05 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26290Cwv.A0A(X.Cqk[], int):X.Cqk");
    }

    public static void A0B(C26290Cwv cwv, CUP cup, C26250Cvp cvp, int i, boolean z) {
        C26245Cvj[] cvjArr;
        byte[] bArr = cwv.A03;
        int i2 = i + 1;
        byte b = bArr[i] & 255;
        if (z) {
            cvp.A0B = b;
        } else {
            cvp.A00 = b;
        }
        char[] cArr = cup.A0B;
        for (int i3 = 0; i3 < b; i3++) {
            int A0D = BEA.A0D(bArr, i2);
            i2 += 2;
            while (true) {
                int i4 = A0D - 1;
                if (A0D <= 0) {
                    break;
                }
                String A0J = cwv.A0J(cArr, i2);
                int i5 = i2 + 2;
                if (z) {
                    cvjArr = cvp.A0Z;
                    if (cvjArr == null) {
                        cvjArr = new C26245Cvj[C26263Cw8.A00(cvp.A0j)];
                        cvp.A0Z = cvjArr;
                    }
                } else {
                    cvjArr = cvp.A0Y;
                    if (cvjArr == null) {
                        cvjArr = new C26245Cvj[C26263Cw8.A00(cvp.A0j)];
                        cvp.A0Y = cvjArr;
                    }
                }
                C26245Cvj A012 = C26245Cvj.A01(A0J, cvjArr[i3], cvp.A0m);
                cvjArr[i3] = A012;
                i2 = A01(A012, cwv, cArr, i5, true);
                A0D = i4;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.C26026Cqk[] r1, int r2) {
        /*
            r0 = r1[r2]
            if (r0 != 0) goto L_0x0014
            X.Cqk r0 = new X.Cqk
            r0.<init>()
            r1[r2] = r0
            r1 = r1[r2]
            short r0 = r1.A05
            r0 = r0 | 1
            short r0 = (short) r0
            r1.A05 = r0
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26290Cwv.A0C(X.Cqk[], int):void");
    }

    public static int[] A0D(C26290Cwv cwv, CUP cup, C26250Cvp cvp, int i, boolean z) {
        int i2;
        C26245Cvj A022;
        char[] cArr = cup.A0B;
        byte[] bArr = cwv.A03;
        int A0D = BEA.A0D(bArr, i);
        int[] iArr = new int[A0D];
        int i3 = i + 2;
        for (int i4 = 0; i4 < A0D; i4++) {
            iArr[i4] = i3;
            int A0F = cwv.A0F(i3);
            int i5 = A0F >>> 24;
            if (i5 != 23) {
                switch (i5) {
                    case 16:
                    case 17:
                    case 18:
                        break;
                    default:
                        switch (i5) {
                            case 64:
                            case 65:
                                int A0D2 = BEA.A0D(bArr, i3 + 1);
                                i2 = i3 + 3;
                                while (true) {
                                    int i6 = A0D2 - 1;
                                    if (A0D2 <= 0) {
                                        break;
                                    } else {
                                        int A0D3 = BEA.A0D(bArr, i2);
                                        int A023 = A02(cwv, i2);
                                        i2 += 6;
                                        C26026Cqk[] cqkArr = cup.A0I;
                                        A0A(cqkArr, A0D3);
                                        A0A(cqkArr, A0D3 + A023);
                                        A0D2 = i6;
                                    }
                                }
                            case 66:
                            case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                            case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case 72:
                            case 73:
                            case C166418cr.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                            case C166418cr.EVENT_MESSAGE_FIELD_NUMBER:
                                i2 = i3 + 4;
                                break;
                            default:
                                throw BE6.A0j();
                        }
                        break;
                }
            }
            i2 = i3 + 3;
            byte b = bArr[i2] & 255;
            CW2 cw2 = null;
            if ((A0F >>> 24) == 66) {
                if (b != 0) {
                    cw2 = new CW2(bArr, i2);
                }
                int i7 = i2 + (b * 2) + 1;
                String A0J = cwv.A0J(cArr, i7);
                int i8 = i7 + 2;
                int i9 = A0F & -256;
                C26280Cwb cwb = cvp.A0m;
                if (z) {
                    A022 = C26245Cvj.A02(A0J, cvp.A0D, cwb, cw2, i9);
                    cvp.A0D = A022;
                } else {
                    A022 = C26245Cvj.A02(A0J, cvp.A0C, cwb, cw2, i9);
                    cvp.A0C = A022;
                }
                i3 = A01(A022, cwv, cArr, i8, true);
            } else {
                i3 = A01((C26245Cvj) null, cwv, cArr, i2 + (b * 2) + 3, true);
            }
        }
        return iArr;
    }

    public final int A0E() {
        int i = this.A00;
        byte[] bArr = this.A03;
        int A0D = i + 8 + (BEA.A0D(bArr, i + 6) * 2);
        int A0D2 = BEA.A0D(bArr, A0D);
        int i2 = A0D + 2;
        while (true) {
            int i3 = A0D2 - 1;
            if (A0D2 <= 0) {
                break;
            }
            int A0D3 = BEA.A0D(bArr, i2 + 6);
            i2 += 8;
            while (true) {
                int i4 = A0D3 - 1;
                A0D2 = i3;
                if (A0D3 > 0) {
                    i2 += A0F(i2 + 2) + 6;
                    A0D3 = i4;
                }
            }
        }
        int A0D4 = BEA.A0D(bArr, i2);
        int i5 = i2 + 2;
        while (true) {
            int i6 = A0D4 - 1;
            if (A0D4 <= 0) {
                return i5 + 2;
            }
            int A0D5 = BEA.A0D(bArr, i5 + 6);
            i5 += 8;
            while (true) {
                int i7 = A0D5 - 1;
                A0D4 = i6;
                if (A0D5 > 0) {
                    i5 += A0F(i5 + 2) + 6;
                    A0D5 = i7;
                }
            }
        }
    }

    public int A0F(int i) {
        byte[] bArr = this.A03;
        return (bArr[i + 3] & 255) | BE7.A09(bArr, i + 2, BE7.A0A(bArr, i + 1, (bArr[i] & 255) << 24));
    }

    public int A0G(int i) {
        return BEA.A0D(this.A03, i);
    }

    public Object A0I(char[] cArr, int i) {
        int[] iArr = this.A05;
        int i2 = iArr[i];
        byte[] bArr = this.A03;
        byte b = bArr[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(A0F(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(A0F(i2)));
            case 5:
                return Long.valueOf(A0H(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(A0H(i2)));
            case 7:
                String A0J = A0J(cArr, i2);
                int i3 = 12;
                if (A0J.charAt(0) == '[') {
                    i3 = 9;
                }
                return new C26263Cw8(i3, 0, A0J, A0J.length());
            case 8:
                return A0J(cArr, i2);
            default:
                switch (b) {
                    case 15:
                        byte b2 = bArr[i2] & 255;
                        int i4 = iArr[BEA.A0D(bArr, i2 + 1)];
                        int i5 = iArr[A02(this, i4)];
                        return new C25221CbH(A07(this, cArr, i4), A0J(cArr, i5), A0J(cArr, i5 + 2), b2, AnonymousClass000.A1T(bArr[i4 - 1], 11));
                    case 16:
                        String A0J2 = A0J(cArr, i2);
                        return new C26263Cw8(11, 0, A0J2, A0J2.length());
                    case 17:
                        C25212Cb8[] cb8Arr = this.A07;
                        C25212Cb8 cb8 = cb8Arr[i];
                        if (cb8 != null) {
                            return cb8;
                        }
                        int i6 = iArr[A02(this, i2)];
                        String A0J3 = A0J(cArr, i6);
                        String A0J4 = A0J(cArr, i6 + 2);
                        int i7 = this.A04[BEA.A0D(bArr, i2)];
                        C25221CbH cbH = (C25221CbH) A0I(cArr, BEA.A0D(bArr, i7));
                        int A022 = A02(this, i7);
                        Object[] objArr = new Object[A022];
                        int i8 = i7 + 4;
                        for (int i9 = 0; i9 < A022; i9++) {
                            objArr[i9] = A0I(cArr, BEA.A0D(bArr, i8));
                            i8 += 2;
                        }
                        C25212Cb8 cb82 = new C25212Cb8(A0J3, A0J4, cbH, objArr);
                        cb8Arr[i] = cb82;
                        return cb82;
                    default:
                        throw BE6.A0j();
                }
        }
    }

    public String A0J(char[] cArr, int i) {
        byte[] bArr = this.A03;
        int A0D = BEA.A0D(bArr, i);
        if (i == 0 || A0D == 0) {
            return null;
        }
        String[] strArr = this.A06;
        String str = strArr[A0D];
        if (str != null) {
            return str;
        }
        int i2 = this.A05[A0D];
        String A08 = A08(this, cArr, i2 + 2, BEA.A0D(bArr, i2));
        strArr[A0D] = A08;
        return A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        r4 = r4 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26290Cwv(byte[] r11) {
        /*
            r10 = this;
            r10.<init>()
            r10.A03 = r11
            r10.A02 = r11
            r0 = 8
            int r8 = X.BEA.A0D(r11, r0)
            int[] r9 = new int[r8]
            r10.A05 = r9
            java.lang.String[] r0 = new java.lang.String[r8]
            r10.A06 = r0
            r4 = 10
            r7 = 0
            r6 = 0
            r5 = 0
            r1 = 1
        L_0x001b:
            if (r1 >= r8) goto L_0x004d
            int r3 = r1 + 1
            int r0 = r4 + 1
            r9[r1] = r0
            byte r0 = r11[r4]
            r2 = 3
            switch(r0) {
                case 1: goto L_0x0038;
                case 2: goto L_0x0029;
                case 3: goto L_0x0036;
                case 4: goto L_0x0036;
                case 5: goto L_0x0031;
                case 6: goto L_0x0031;
                case 7: goto L_0x0046;
                case 8: goto L_0x0046;
                case 9: goto L_0x0036;
                case 10: goto L_0x0036;
                case 11: goto L_0x0036;
                case 12: goto L_0x0036;
                case 13: goto L_0x0029;
                case 14: goto L_0x0029;
                case 15: goto L_0x0045;
                case 16: goto L_0x0046;
                case 17: goto L_0x002e;
                case 18: goto L_0x0048;
                case 19: goto L_0x0046;
                case 20: goto L_0x0046;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()
            throw r0
        L_0x002e:
            r1 = r3
            r6 = 1
            goto L_0x0049
        L_0x0031:
            int r3 = r3 + 1
            r2 = 9
            goto L_0x0046
        L_0x0036:
            r1 = r3
            goto L_0x004a
        L_0x0038:
            int r1 = r4 + 1
            byte[] r0 = r10.A03
            int r0 = X.BEA.A0D(r0, r1)
            int r2 = r2 + r0
            if (r2 <= r7) goto L_0x0046
            r7 = r2
            goto L_0x0046
        L_0x0045:
            r2 = 4
        L_0x0046:
            r1 = r3
            goto L_0x004b
        L_0x0048:
            r1 = r3
        L_0x0049:
            r5 = 1
        L_0x004a:
            r2 = 5
        L_0x004b:
            int r4 = r4 + r2
            goto L_0x001b
        L_0x004d:
            r10.A01 = r7
            r10.A00 = r4
            r4 = 0
            if (r6 == 0) goto L_0x009d
            X.Cb8[] r0 = new X.C25212Cb8[r8]
        L_0x0056:
            r10.A07 = r0
            if (r5 == 0) goto L_0x00a4
            char[] r5 = new char[r7]
            int r1 = r10.A0E()
            int r2 = r1 + -2
            byte[] r0 = r10.A03
            int r4 = X.BEA.A0D(r0, r2)
        L_0x0068:
            if (r4 <= 0) goto L_0x009f
            java.lang.String r3 = r10.A0J(r5, r1)
            int r0 = r1 + 2
            int r2 = r10.A0F(r0)
            int r1 = r1 + 6
            java.lang.String r0 = "BootstrapMethods"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0099
            byte[] r0 = r10.A03
            int r3 = X.BEA.A0D(r0, r1)
            int[] r4 = new int[r3]
            int r2 = r1 + 2
            r1 = 0
        L_0x0089:
            if (r1 >= r3) goto L_0x00a4
            r4[r1] = r2
            int r0 = A02(r10, r2)
            int r0 = r0 * 2
            int r0 = r0 + 4
            int r2 = r2 + r0
            int r1 = r1 + 1
            goto L_0x0089
        L_0x0099:
            int r1 = r1 + r2
            int r4 = r4 + -1
            goto L_0x0068
        L_0x009d:
            r0 = r4
            goto L_0x0056
        L_0x009f:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()
            throw r0
        L_0x00a4:
            r10.A04 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26290Cwv.<init>(byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        r9 = r9 & -256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r7 = r15 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A04(X.C26290Cwv r13, X.CUP r14, int r15) {
        /*
            int r9 = r13.A0F(r15)
            int r1 = r9 >>> 24
            r0 = 1
            if (r1 == 0) goto L_0x0061
            if (r1 == r0) goto L_0x0061
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L_0x0056;
                case 17: goto L_0x0056;
                case 18: goto L_0x0056;
                case 19: goto L_0x005d;
                case 20: goto L_0x005d;
                case 21: goto L_0x005d;
                case 22: goto L_0x0061;
                case 23: goto L_0x0056;
                default: goto L_0x0010;
            }
        L_0x0010:
            switch(r1) {
                case 64: goto L_0x0018;
                case 65: goto L_0x0018;
                case 66: goto L_0x0056;
                case 67: goto L_0x0059;
                case 68: goto L_0x0059;
                case 69: goto L_0x0059;
                case 70: goto L_0x0059;
                case 71: goto L_0x0067;
                case 72: goto L_0x0067;
                case 73: goto L_0x0067;
                case 74: goto L_0x0067;
                case 75: goto L_0x0067;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()
            throw r0
        L_0x0018:
            r9 = r9 & r0
            int r0 = r15 + 1
            byte[] r10 = r13.A03
            int r8 = X.BEA.A0D(r10, r0)
            int r7 = r15 + 3
            X.Cqk[] r11 = new X.C26026Cqk[r8]
            r14.A0H = r11
            X.Cqk[] r6 = new X.C26026Cqk[r8]
            r14.A0G = r6
            int[] r5 = new int[r8]
            r14.A0C = r5
            r4 = 0
        L_0x0030:
            if (r4 >= r8) goto L_0x006d
            int r12 = X.BEA.A0D(r10, r7)
            int r3 = A02(r13, r7)
            int r0 = r7 + 4
            int r2 = X.BEA.A0D(r10, r0)
            int r7 = r7 + 6
            X.Cqk[] r1 = r14.A0I
            X.Cqk r0 = A0A(r1, r12)
            r11[r4] = r0
            int r12 = r12 + r3
            X.Cqk r0 = A0A(r1, r12)
            r6[r4] = r0
            r5[r4] = r2
            int r4 = r4 + 1
            goto L_0x0030
        L_0x0056:
            r9 = r9 & -256(0xffffffffffffff00, float:NaN)
            goto L_0x005a
        L_0x0059:
            r9 = r9 & r0
        L_0x005a:
            int r7 = r15 + 3
            goto L_0x006d
        L_0x005d:
            r9 = r9 & r0
            int r7 = r15 + 1
            goto L_0x006d
        L_0x0061:
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r9 = r9 & r0
            int r7 = r15 + 2
            goto L_0x006d
        L_0x0067:
            r0 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r9 = r9 & r0
            int r7 = r15 + 4
        L_0x006d:
            r14.A06 = r9
            byte[] r1 = r13.A03
            byte r0 = r1[r7]
            r2 = r0 & 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L_0x0080
            r0 = 0
        L_0x0078:
            r14.A0A = r0
            int r1 = r7 + 1
            int r0 = r2 * 2
            int r1 = r1 + r0
            return r1
        L_0x0080:
            X.CW2 r0 = new X.CW2
            r0.<init>(r1, r7)
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26290Cwv.A04(X.Cwv, X.CUP, int):int");
    }

    public long A0H(int i) {
        return (((long) A0F(i)) << 32) | BE7.A0C(A0F(i + 4));
    }
}
