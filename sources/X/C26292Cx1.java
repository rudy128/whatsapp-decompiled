package X;

/* renamed from: X.Cx1  reason: case insensitive filesystem */
public abstract class C26292Cx1 {
    public static final int[] A00 = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    public static final int[] A01 = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};

    public static void A00(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        iArr2[i2] = i3 & 67108863;
        iArr2[i2 + 1] = ((i3 >>> 26) | (i4 << 6)) & 67108863;
        iArr2[i2 + 2] = ((i5 << 12) | (i4 >>> 20)) & 33554431;
        iArr2[i2 + 3] = ((i6 << 19) | (i5 >>> 13)) & 67108863;
        iArr2[i2 + 4] = i6 >>> 7;
    }

    public static void A01(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        iArr2[i2] = i3 | (i4 << 26);
        iArr2[i2 + 1] = (i4 >>> 6) | (i5 << 20);
        iArr2[i2 + 2] = (i5 >>> 12) | (i6 << 13);
        iArr2[i2 + 3] = (i7 << 7) | (i6 >>> 19);
    }

    public static void A04(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = i3 + (i2 >> 26);
        int i11 = i5 + (i4 >> 26);
        int i12 = i8 + (i7 >> 26);
        int i13 = iArr[9] + (i9 >> 26);
        int i14 = (i4 & 67108863) + (i10 >> 25);
        int i15 = i6 + (i11 >> 25);
        int i16 = (i9 & 67108863) + (i12 >> 25);
        int i17 = i + ((i13 >> 25) * 38);
        int i18 = (i2 & 67108863) + (i17 >> 26);
        int i19 = (i7 & 67108863) + (i15 >> 26);
        iArr[0] = i17 & 67108863;
        iArr[1] = i18 & 67108863;
        iArr[2] = (i10 & 33554431) + (i18 >> 26);
        iArr[3] = i14 & 67108863;
        iArr[4] = (i11 & 33554431) + (i14 >> 26);
        iArr[5] = i15 & 67108863;
        iArr[6] = i19 & 67108863;
        iArr[7] = (i12 & 33554431) + (i19 >> 26);
        iArr[8] = i16 & 67108863;
        iArr[9] = (i13 & 33554431) + (i16 >> 26);
    }

    public static void A05(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        A07(iArr, i);
        A07(iArr, -i);
    }

    public static void A06(int[] iArr) {
        int i = 1;
        iArr[0] = 1;
        do {
            iArr[i] = 0;
            i++;
        } while (i < 10);
    }

    public static void A07(int[] iArr, int i) {
        int i2 = iArr[9];
        long j = ((long) (((i2 >> 24) + i) * 19)) + ((long) iArr[0]);
        iArr[0] = ((int) j) & 67108863;
        long j2 = (j >> 26) + ((long) iArr[1]);
        iArr[1] = ((int) j2) & 67108863;
        long j3 = (j2 >> 26) + ((long) iArr[2]);
        iArr[2] = ((int) j3) & 33554431;
        long j4 = (j3 >> 25) + ((long) iArr[3]);
        iArr[3] = ((int) j4) & 67108863;
        long j5 = (j4 >> 26) + ((long) iArr[4]);
        iArr[4] = ((int) j5) & 33554431;
        long j6 = (j5 >> 25) + ((long) iArr[5]);
        iArr[5] = ((int) j6) & 67108863;
        long j7 = (j6 >> 26) + ((long) iArr[6]);
        iArr[6] = ((int) j7) & 67108863;
        long j8 = (j7 >> 26) + ((long) iArr[7]);
        iArr[7] = 33554431 & ((int) j8);
        long j9 = (j8 >> 25) + ((long) iArr[8]);
        iArr[8] = 67108863 & ((int) j9);
        iArr[9] = (16777215 & i2) + ((int) (j9 >> 26));
    }

    public static void A0B(int[] iArr, int[] iArr2, int i) {
        A0A(iArr, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                A0A(iArr2, iArr2);
            } else {
                return;
            }
        }
    }

    public static void A0C(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        do {
            BE6.A1A(i, iArr[i], iArr2, iArr3);
            i++;
        } while (i < 10);
    }

    public static void A0D(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = iArr2[9];
        long j = (long) i;
        long j2 = (long) i2;
        long j3 = j2;
        long j4 = j * j2;
        long j5 = (long) i4;
        long j6 = (long) i3;
        long j7 = (j * j5) + (j6 * j3);
        long j8 = (long) i6;
        long j9 = (long) i5;
        long j10 = (j * j8) + (j6 * j5) + (j9 * j3);
        long j11 = (long) i8;
        long j12 = (long) i7;
        long j13 = j12;
        long j14 = (((j6 * j8) + (j9 * j5)) << 1) + (j * j11) + (j12 * j3);
        long j15 = (long) i10;
        long j16 = (long) i9;
        long j17 = j16;
        long j18 = ((j9 * j8) << 1) + (j * j15) + (j6 * j11) + (j13 * j5) + (j16 * j3);
        long j19 = (((j9 * j15) + (j17 * j8)) << 1) + (j13 * j11);
        long j20 = (j13 * j15) + (j17 * j11);
        long j21 = (long) i11;
        long j22 = (long) i12;
        long j23 = j22;
        long j24 = j21 * j22;
        long j25 = (long) i14;
        long j26 = j25;
        long j27 = (long) i13;
        long j28 = (j21 * j25) + (j27 * j23);
        long j29 = (long) i16;
        long j30 = j29;
        long j31 = (long) i15;
        long j32 = (j21 * j29) + (j27 * j26) + (j31 * j23);
        long j33 = (long) i18;
        long j34 = j33;
        long j35 = (long) i17;
        long j36 = (((j27 * j30) + (j31 * j26)) << 1) + (j21 * j33) + (j35 * j23);
        long j37 = (long) i20;
        long j38 = (long) i19;
        long j39 = ((j31 * j30) << 1) + (j21 * j37) + (j27 * j34) + (j35 * j26) + (j38 * j23);
        long j40 = (j27 * j37) + (j31 * j34) + (j35 * j30) + (j38 * j26);
        long j41 = j4 - (j40 * 76);
        long j42 = j7 - (((((j31 * j37) + (j38 * j30)) << 1) + (j35 * j34)) * 38);
        long j43 = j10 - (((j35 * j37) + (j38 * j34)) * 38);
        long j44 = j14 - ((j38 * j37) * 76);
        long j45 = (((((j6 * j15) + (j9 * j11)) + (j13 * j8)) + (j17 * j5)) << 1) - j24;
        long j46 = j19 - j28;
        long j47 = j20 - j32;
        long j48 = ((j17 * j15) << 1) - j36;
        int i21 = i10 + i20;
        long j49 = (long) (i + i11);
        long j50 = (long) (i2 + i12);
        long j51 = j50;
        long j52 = j49 * j50;
        long j53 = (long) (i4 + i14);
        long j54 = j53;
        long j55 = j49 * j53;
        long j56 = (long) (i3 + i13);
        long j57 = j55 + (j56 * j51);
        long j58 = (long) (i6 + i16);
        long j59 = j58;
        long j60 = (long) (i5 + i15);
        long j61 = (j49 * j58) + (j56 * j54) + (j60 * j51);
        long j62 = (long) (i8 + i18);
        long j63 = j62;
        long j64 = (long) (i7 + i17);
        long j65 = (((j56 * j59) + (j60 * j54)) << 1) + (j49 * j62) + (j64 * j51);
        long j66 = (long) i21;
        long j67 = (long) (i9 + i19);
        long j68 = ((j60 * j59) << 1) + (j49 * j66) + (j56 * j63) + (j64 * j54) + (j67 * j51);
        long j69 = (((j60 * j66) + (j67 * j59)) << 1) + (j64 * j63);
        long j70 = j48 + (j65 - j44);
        long j71 = (j70 >> 26) + ((j68 - j18) - j39);
        long j72 = j41 + ((((j71 >> 25) + (((((j56 * j66) + (j60 * j63)) + (j64 * j59)) + (j67 * j54)) << 1)) - j45) * 38);
        iArr3[0] = ((int) j72) & 67108863;
        long j73 = (j72 >> 26) + ((j69 - j46) * 38) + j42;
        iArr3[1] = ((int) j73) & 67108863;
        long j74 = (j73 >> 26) + j43 + ((((j64 * j66) + (j67 * j63)) - j47) * 38);
        iArr3[2] = ((int) j74) & 33554431;
        long j75 = (j74 >> 25) + j44 + ((((j67 * j66) << 1) - j48) * 38);
        iArr3[3] = ((int) j75) & 67108863;
        long j76 = (j75 >> 26) + j18 + (j39 * 38);
        iArr3[4] = ((int) j76) & 33554431;
        long j77 = (j76 >> 25) + j45 + (j52 - j41);
        iArr3[5] = ((int) j77) & 67108863;
        long j78 = (j77 >> 26) + j46 + (j57 - j42);
        iArr3[6] = ((int) j78) & 67108863;
        long j79 = (j78 >> 26) + j47 + (j61 - j43);
        iArr3[7] = 33554431 & ((int) j79);
        long j80 = (j79 >> 25) + ((long) (((int) j70) & 67108863));
        iArr3[8] = ((int) j80) & 67108863;
        iArr3[9] = (((int) j71) & 33554431) + ((int) (j80 >> 26));
    }

    public static void A0E(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        do {
            iArr3[i] = iArr[i] - iArr2[i];
            i++;
        } while (i < 10);
    }

    public static void A0F(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i = 0;
        do {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
            i++;
        } while (i < 10);
    }

    public static void A03(byte[] bArr, int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        BEB.A1T(bArr, (i4 << 26) | i3, i2);
        BEB.A1T(bArr, (i4 >>> 6) | (i5 << 20), i2 + 4);
        BEB.A1T(bArr, (i5 >>> 12) | (i6 << 13), i2 + 8);
        BEB.A1T(bArr, (i7 << 7) | (i6 >>> 19), i2 + 12);
    }

    public static void A08(int[] iArr, int[] iArr2) {
        int i;
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[8];
        int i2 = 0;
        do {
            i2 = BE6.A0L(iArr, iArr3, i2);
        } while (i2 < 10);
        A05(iArr3);
        A01(0, 0, iArr3, iArr4);
        A01(5, 4, iArr3, iArr4);
        int[] iArr5 = A00;
        int numberOfLeadingZeros = 256 - Integer.numberOfLeadingZeros(iArr5[7]);
        int i3 = (numberOfLeadingZeros + 29) / 30;
        int[] iArr6 = new int[4];
        int[] iArr7 = new int[i3];
        int[] iArr8 = new int[i3];
        int[] iArr9 = new int[i3];
        int[] iArr10 = new int[i3];
        int[] iArr11 = new int[i3];
        iArr8[0] = 1;
        C25897Co8.A00(iArr4, iArr10, numberOfLeadingZeros);
        C25897Co8.A00(iArr5, iArr11, numberOfLeadingZeros);
        System.arraycopy(iArr11, 0, iArr9, 0, i3);
        int i4 = iArr11[0];
        int i5 = (2 - (i4 * i4)) * i4;
        int i6 = i5 * (2 - (i4 * i5));
        int i7 = i6 * (2 - (i4 * i6));
        int i8 = i7 * (2 - (i4 * i7));
        int i9 = numberOfLeadingZeros * 49;
        int i10 = 47;
        if (numberOfLeadingZeros < 46) {
            i10 = 80;
        }
        int i11 = (i9 + i10) / 17;
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13 += 30) {
            int i14 = iArr9[0];
            int i15 = iArr10[0];
            int i16 = 1;
            int i17 = 0;
            int i18 = 0;
            int i19 = 1;
            for (int i20 = 0; i20 < 30; i20++) {
                int i21 = i12 >> 31;
                int i22 = -(i15 & 1);
                int i23 = i15 + (((i14 ^ i21) - i21) & i22);
                i18 += ((i16 ^ i21) - i21) & i22;
                i19 += ((i17 ^ i21) - i21) & i22;
                int i24 = i21 & i22;
                i12 = (i12 ^ i24) - (i24 + 1);
                i14 += i23 & i24;
                i15 = i23 >> 1;
                i16 = (i16 + (i18 & i24)) << 1;
                i17 = (i17 + (i24 & i19)) << 1;
            }
            iArr6[0] = i16;
            iArr6[1] = i17;
            iArr6[2] = i18;
            iArr6[3] = i19;
            C25897Co8.A02(iArr7, iArr8, iArr6, iArr11, i3, i8);
            C25897Co8.A01(iArr9, iArr10, iArr6, i3);
        }
        int i25 = i3 - 1;
        int i26 = iArr9[i25] >> 31;
        int i27 = 0;
        for (int i28 = 0; i28 < i25; i28++) {
            int i29 = i27 + ((iArr9[i28] ^ i26) - i26);
            iArr9[i28] = 1073741823 & i29;
            i27 = i29 >> 30;
        }
        iArr9[i25] = i27 + ((iArr9[i25] ^ i26) - i26);
        int i30 = iArr7[i25] >> 31;
        int i31 = 0;
        for (int i32 = 0; i32 < i25; i32++) {
            int i33 = i31 + (((iArr7[i32] + (iArr11[i32] & i30)) ^ i26) - i26);
            iArr7[i32] = 1073741823 & i33;
            i31 = i33 >> 30;
        }
        int i34 = i31 + (((iArr7[i25] + (i30 & iArr11[i25])) ^ i26) - i26);
        iArr7[i25] = i34;
        int i35 = i34 >> 31;
        int i36 = 0;
        for (int i37 = 0; i37 < i25; i37++) {
            int i38 = i36 + iArr7[i37] + (iArr11[i37] & i35);
            iArr7[i37] = i38 & 1073741823;
            i36 = i38 >> 30;
        }
        iArr7[i25] = i36 + iArr7[i25] + (i35 & iArr11[i25]);
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        long j = 0;
        while (numberOfLeadingZeros > 0) {
            while (i41 < Math.min(32, numberOfLeadingZeros)) {
                j |= ((long) iArr7[i39]) << i41;
                i41 += 30;
                i39++;
            }
            iArr4[i40] = (int) j;
            j >>>= 32;
            i41 -= 32;
            numberOfLeadingZeros -= 32;
            i40++;
        }
        int i42 = 1;
        do {
            i = i42;
            i42++;
        } while (i < i3);
        for (int i43 = 0; i43 < i3; i43++) {
        }
        int[] iArr12 = iArr2;
        A00(0, 0, iArr4, iArr12);
        A00(4, 5, iArr4, iArr12);
        iArr2[9] = iArr2[9] & 16777215;
    }

    public static void A02(byte[] bArr, int[] iArr, int i, int i2) {
        int A0A = BEB.A0A(bArr, i);
        int A0A2 = BEB.A0A(bArr, i + 4);
        int A0A3 = BEB.A0A(bArr, i + 8);
        int A0A4 = BEB.A0A(bArr, i + 12);
        iArr[i2] = A0A & 67108863;
        iArr[i2 + 1] = ((A0A >>> 26) | (A0A2 << 6)) & 67108863;
        iArr[i2 + 2] = ((A0A3 << 12) | (A0A2 >>> 20)) & 33554431;
        iArr[i2 + 3] = ((A0A4 << 19) | (A0A3 >>> 13)) & 67108863;
        iArr[i2 + 4] = A0A4 >>> 7;
    }

    public static void A09(int[] iArr, int[] iArr2) {
        int A0I = BE6.A0I(iArr);
        int i = iArr[1];
        int i2 = iArr[2];
        int i3 = iArr[3];
        int i4 = iArr[4];
        int i5 = iArr[5];
        int i6 = iArr[6];
        int i7 = iArr[7];
        int i8 = iArr[8];
        long j = ((long) i2) * 121666;
        long j2 = ((long) i4) * 121666;
        long j3 = ((long) i7) * 121666;
        long j4 = ((long) iArr[9]) * 121666;
        long j5 = ((j4 >> 25) * 38) + (((long) A0I) * 121666);
        iArr2[0] = ((int) j5) & 67108863;
        long j6 = (j2 >> 25) + (((long) i5) * 121666);
        iArr2[5] = ((int) j6) & 67108863;
        long j7 = (j5 >> 26) + (((long) i) * 121666);
        iArr2[1] = ((int) j7) & 67108863;
        long j8 = (j >> 25) + (((long) i3) * 121666);
        iArr2[3] = ((int) j8) & 67108863;
        long j9 = (j6 >> 26) + (((long) i6) * 121666);
        iArr2[6] = ((int) j9) & 67108863;
        long j10 = (j3 >> 25) + (((long) i8) * 121666);
        iArr2[8] = ((int) j10) & 67108863;
        iArr2[2] = (((int) j) & 33554431) + ((int) (j7 >> 26));
        iArr2[4] = (((int) j2) & 33554431) + ((int) (j8 >> 26));
        iArr2[7] = ((int) (j9 >> 26)) + (((int) j3) & 33554431);
        iArr2[9] = (((int) j4) & 33554431) + ((int) (j10 >> 26));
    }

    public static void A0A(int[] iArr, int[] iArr2) {
        int A0I = BE6.A0I(iArr);
        int i = iArr[1];
        int i2 = iArr[2];
        int i3 = iArr[3];
        int i4 = iArr[4];
        int i5 = iArr[5];
        int i6 = iArr[6];
        int i7 = iArr[7];
        int i8 = iArr[8];
        int i9 = iArr[9];
        long j = (long) A0I;
        long j2 = (long) (i * 2);
        long j3 = j2;
        long j4 = j * j2;
        long j5 = (long) (i2 * 2);
        long j6 = (long) i;
        long j7 = (j * j5) + (j6 * j6);
        long j8 = (long) (i3 * 2);
        long j9 = (j3 * j5) + (j * j8);
        long j10 = (long) (i4 * 2);
        long j11 = (((long) i2) * j5) + (j * j10) + (j6 * j8);
        long j12 = (j3 * j10) + (j5 * j8);
        long j13 = (long) i3;
        long j14 = (j5 * j10) + (j13 * j13);
        long j15 = j13 * j10;
        long j16 = ((long) i4) * j10;
        long j17 = (long) i5;
        long j18 = j17 * j17;
        long j19 = (long) (i6 * 2);
        long j20 = j17 * j19;
        long j21 = (long) (i7 * 2);
        long j22 = (long) i6;
        long j23 = (long) (i8 * 2);
        long j24 = (j19 * j21) + (j17 * j23);
        long j25 = (long) (i9 * 2);
        long j26 = (((long) i7) * j21) + (j17 * j25) + (j22 * j23);
        long j27 = (j19 * j25) + (j21 * j23);
        long j28 = (long) i8;
        long j29 = (j * j) - (j27 * 38);
        long j30 = j4 - (((j21 * j25) + (j28 * j28)) * 38);
        long j31 = j7 - ((j28 * j25) * 38);
        long j32 = j9 - ((((long) i9) * j25) * 38);
        long j33 = j12 - j18;
        long j34 = j14 - j20;
        long j35 = j15 - ((j17 * j21) + (j22 * j22));
        long j36 = j16 - j24;
        int i10 = i + i6;
        int i11 = i2 + i7;
        int i12 = i3 + i8;
        int i13 = i4 + i9;
        long j37 = (long) (A0I + i5);
        long j38 = j37 * j37;
        long j39 = (long) (i10 * 2);
        long j40 = j37 * j39;
        long j41 = (long) (i11 * 2);
        long j42 = (long) i10;
        long j43 = (j37 * j41) + (j42 * j42);
        long j44 = (long) (i12 * 2);
        long j45 = (j39 * j41) + (j37 * j44);
        long j46 = (long) (i13 * 2);
        long j47 = (((long) i11) * j41) + (j37 * j46) + (j42 * j44);
        long j48 = (j39 * j46) + (j41 * j44);
        long j49 = (long) i12;
        long j50 = (j41 * j46) + (j49 * j49);
        long j51 = j36 + (j45 - j32);
        long j52 = (j51 >> 26) + ((j47 - j11) - j26);
        long j53 = j29 + ((((j52 >> 25) + j48) - j33) * 38);
        iArr2[0] = ((int) j53) & 67108863;
        long j54 = (j53 >> 26) + j30 + ((j50 - j34) * 38);
        iArr2[1] = ((int) j54) & 67108863;
        long j55 = (j54 >> 26) + j31 + (((j49 * j46) - j35) * 38);
        iArr2[2] = ((int) j55) & 33554431;
        long j56 = (j55 >> 25) + j32 + (((((long) i13) * j46) - j36) * 38);
        iArr2[3] = ((int) j56) & 67108863;
        long j57 = (j56 >> 26) + j11 + (j26 * 38);
        iArr2[4] = ((int) j57) & 33554431;
        long j58 = (j57 >> 25) + j33 + (j38 - j29);
        iArr2[5] = ((int) j58) & 67108863;
        long j59 = (j58 >> 26) + j34 + (j40 - j30);
        iArr2[6] = ((int) j59) & 67108863;
        long j60 = (j59 >> 26) + j35 + (j43 - j31);
        iArr2[7] = 33554431 & ((int) j60);
        long j61 = (j60 >> 25) + ((long) (((int) j51) & 67108863));
        iArr2[8] = ((int) j61) & 67108863;
        iArr2[9] = (((int) j52) & 33554431) + ((int) (j61 >> 26));
    }
}
