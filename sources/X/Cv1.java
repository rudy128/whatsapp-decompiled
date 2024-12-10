package X;

import java.util.Arrays;

public final class Cv1 {
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
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public static short[] A04(Cv1 cv1, short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = cv1.A0G;
        int i4 = length / i3;
        if (i + i2 > i4) {
            return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
        }
        return sArr;
    }

    private int A00(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.A0G;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += C108945cZ.A05(sArr[i4 + i10], sArr[i4 + i2 + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.A02 = i6 / i7;
        this.A01 = i8 / i5;
        return i7;
    }

    public static void A01(Cv1 cv1) {
        int i;
        int A002;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Cv1 cv12 = cv1;
        int i10 = cv12.A05;
        float f = cv12.A0F;
        float f2 = cv12.A0D;
        float f3 = f / f2;
        float f4 = cv12.A0E * f2;
        double d = (double) f3;
        double d2 = d;
        if (d > 1.00001d || d2 < 0.99999d) {
            int i11 = cv12.A00;
            int i12 = cv12.A0J;
            int i13 = i12;
            if (i11 >= i12) {
                int i14 = 0;
                do {
                    int i15 = cv12.A09;
                    if (i15 > 0) {
                        i4 = Math.min(i13, i15);
                        cv12.A02(cv12.A0A, i14, i4);
                        cv12.A09 -= i4;
                    } else {
                        short[] sArr = cv12.A0A;
                        int i16 = cv12.A0H;
                        if (i16 > 4000) {
                            i = i16 / 4000;
                        } else {
                            i = 1;
                        }
                        int i17 = cv12.A0G;
                        if (i17 == 1 && i == 1) {
                            A002 = cv12.A00(sArr, i14, cv12.A0K, cv12.A0I);
                        } else {
                            cv12.A03(sArr, i14, i);
                            short[] sArr2 = cv12.A0L;
                            int i18 = cv12.A0K;
                            int i19 = cv12.A0I;
                            A002 = cv12.A00(sArr2, 0, i18 / i, i19 / i);
                            if (i != 1) {
                                int i20 = A002 * i;
                                int i21 = i * 4;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                if (i22 < i18) {
                                    i22 = i18;
                                }
                                if (i23 > i19) {
                                    i23 = i19;
                                }
                                if (i17 == 1) {
                                    A002 = cv12.A00(sArr, i14, i22, i23);
                                } else {
                                    cv12.A03(sArr, i14, 1);
                                    A002 = cv12.A00(sArr2, 0, i22, i23);
                                }
                            }
                        }
                        int i24 = cv12.A02;
                        int i25 = cv12.A01;
                        if (i24 == 0 || (i2 = cv12.A08) == 0 || i25 > i24 * 3 || i24 * 2 <= cv12.A07 * 3) {
                            i2 = A002;
                        }
                        cv12.A07 = i24;
                        cv12.A08 = A002;
                        if (d2 > 1.0d) {
                            float f5 = (float) i2;
                            if (f3 >= 2.0f) {
                                i5 = (int) (f5 / (f3 - 1.0f));
                            } else {
                                cv12.A09 = (int) ((f5 * (2.0f - f3)) / (f3 - 1.0f));
                                i5 = i2;
                            }
                            short[] A042 = A04(cv12, cv12.A0B, cv12.A05, i5);
                            cv12.A0B = A042;
                            int i26 = cv12.A05;
                            int i27 = i14 + i2;
                            for (int i28 = 0; i28 < i17; i28++) {
                                int i29 = (i26 * i17) + i28;
                                int i30 = (i27 * i17) + i28;
                                int i31 = (i14 * i17) + i28;
                                for (int i32 = 0; i32 < i5; i32++) {
                                    A042[i29] = BEA.A0y(sArr, i31, i5, i32, i30);
                                    i29 += i17;
                                    i31 += i17;
                                    i30 += i17;
                                }
                            }
                            cv12.A05 = i26 + i5;
                            i4 = i2 + i5;
                        } else {
                            float f6 = (float) i2;
                            if (f3 < 0.5f) {
                                i3 = (int) ((f6 * f3) / (1.0f - f3));
                            } else {
                                cv12.A09 = (int) ((f6 * ((2.0f * f3) - 1.0f)) / (1.0f - f3));
                                i3 = i2;
                            }
                            int i33 = i2 + i3;
                            short[] A043 = A04(cv12, cv12.A0B, cv12.A05, i33);
                            cv12.A0B = A043;
                            int i34 = i14 * i17;
                            System.arraycopy(sArr, i34, A043, cv12.A05 * i17, i17 * i2);
                            short[] sArr3 = cv12.A0B;
                            int i35 = cv12.A05;
                            int i36 = i35 + i2;
                            int i37 = i14 + i2;
                            for (int i38 = 0; i38 < i17; i38++) {
                                int i39 = (i36 * i17) + i38;
                                int i40 = i34 + i38;
                                int i41 = (i37 * i17) + i38;
                                for (int i42 = 0; i42 < i3; i42++) {
                                    sArr3[i39] = BEA.A0y(sArr, i41, i3, i42, i40);
                                    i39 += i17;
                                    i41 += i17;
                                    i40 += i17;
                                }
                            }
                            cv12.A05 = i35 + i33;
                            i4 = i3;
                        }
                    }
                    i14 += i4;
                } while (i13 + i14 <= i11);
                int i43 = cv12.A00 - i14;
                short[] sArr4 = cv12.A0A;
                int i44 = cv12.A0G;
                System.arraycopy(sArr4, i14 * i44, sArr4, 0, i44 * i43);
                cv12.A00 = i43;
            }
        } else {
            cv12.A02(cv12.A0A, 0, cv12.A00);
            cv12.A00 = 0;
        }
        if (f4 != 1.0f && (i6 = cv12.A05) != i10) {
            int i45 = cv12.A0H;
            int i46 = (int) (((float) i45) / f4);
            while (true) {
                if (i46 <= 16384 && i45 <= 16384) {
                    break;
                }
                i46 /= 2;
                i45 /= 2;
            }
            int i47 = i6 - i10;
            short[] A044 = A04(cv12, cv12.A0C, cv12.A06, i47);
            cv12.A0C = A044;
            short[] sArr5 = cv12.A0B;
            int i48 = cv12.A0G;
            System.arraycopy(sArr5, i10 * i48, A044, cv12.A06 * i48, i48 * i47);
            cv12.A05 = i10;
            cv12.A06 += i47;
            int i49 = 0;
            while (true) {
                i7 = cv12.A06;
                boolean z = true;
                if (i49 >= i7 - 1) {
                    break;
                }
                while (true) {
                    i8 = cv12.A04 + 1;
                    int i50 = i8 * i46;
                    i9 = cv12.A03;
                    if (i50 <= i9 * i45) {
                        break;
                    }
                    short[] A045 = A04(cv12, cv12.A0B, i10, 1);
                    cv12.A0B = A045;
                    for (int i51 = 0; i51 < i48; i51++) {
                        short[] sArr6 = cv12.A0C;
                        int i52 = (i48 * i49) + i51;
                        short s = sArr6[i52];
                        short s2 = sArr6[i52 + i48];
                        int i53 = cv12.A04;
                        int i54 = i53 * i46;
                        int i55 = (i53 + 1) * i46;
                        int i56 = i55 - (cv12.A03 * i45);
                        int i57 = i55 - i54;
                        A045[(cv12.A05 * i48) + i51] = (short) (((s * i56) + ((i57 - i56) * s2)) / i57);
                    }
                    cv12.A03++;
                    i10 = cv12.A05 + 1;
                    cv12.A05 = i10;
                }
                cv12.A04 = i8;
                if (i8 == i45) {
                    cv12.A04 = 0;
                    if (i9 != i46) {
                        z = false;
                    }
                    C26056CrS.A03(z);
                    cv12.A03 = 0;
                }
                i49++;
            }
            int i58 = i7 - 1;
            if (i58 != 0) {
                short[] sArr7 = cv12.A0C;
                System.arraycopy(sArr7, i58 * i48, sArr7, 0, (i7 - i58) * i48);
                cv12.A06 -= i58;
            }
        }
    }

    private void A02(short[] sArr, int i, int i2) {
        short[] A042 = A04(this, this.A0B, this.A05, i2);
        this.A0B = A042;
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, A042, this.A05 * i3, i3 * i2);
        this.A05 += i2;
    }

    private void A03(short[] sArr, int i, int i2) {
        int i3 = this.A0J / i2;
        int i4 = this.A0G;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.A0L[i7] = (short) (i8 / i5);
        }
    }

    public Cv1(float f, float f2, int i, int i2, int i3) {
        this.A0H = i;
        this.A0G = i2;
        this.A0F = f;
        this.A0D = f2;
        this.A0E = ((float) i) / ((float) i3);
        this.A0K = i / 400;
        int i4 = i / 65;
        this.A0I = i4;
        int i5 = i4 * 2;
        this.A0J = i5;
        this.A0L = new short[i5];
        int i6 = i5 * i2;
        this.A0A = new short[i6];
        this.A0B = new short[i6];
        this.A0C = new short[i6];
    }
}
