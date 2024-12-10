package X;

import java.lang.reflect.Array;

public final class CYN {
    public DS5 A00;
    public final CLV A01;

    public DS5 A00() {
        int[] iArr;
        int i;
        DS5 ds5 = this.A00;
        DS5 ds52 = ds5;
        if (ds5 == null) {
            C23669Bnc bnc = (C23669Bnc) this.A01;
            DS5 ds53 = bnc.A00;
            ds52 = ds53;
            if (ds53 == null) {
                C25162CaD caD = bnc.A00;
                int i2 = caD.A01;
                int i3 = caD.A00;
                if (i2 < 40 || i3 < 40) {
                    ds52 = new DS5(i2, i3);
                    if (bnc.A01.length < i2) {
                        bnc.A01 = new byte[i2];
                    }
                    int i4 = 0;
                    int i5 = 0;
                    do {
                        iArr = bnc.A02;
                        iArr[i5] = 0;
                        i5++;
                    } while (i5 < 32);
                    for (int i6 = 1; i6 < 5; i6++) {
                        byte[] A012 = caD.A01(bnc.A01, (i3 * i6) / 5);
                        int i7 = (i2 << 2) / 5;
                        for (int i8 = i2 / 5; i8 < i7; i8++) {
                            BE6.A1R(iArr, (A012[i8] & 255) >> 3);
                        }
                    }
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    do {
                        int i13 = iArr[i9];
                        if (i13 > i10) {
                            i12 = i9;
                            i10 = i13;
                        }
                        if (i13 > i11) {
                            i11 = i13;
                        }
                        i9++;
                    } while (i9 < 32);
                    int i14 = 0;
                    int i15 = 0;
                    do {
                        int i16 = i4 - i12;
                        int i17 = iArr[i4] * i16 * i16;
                        if (i17 > i15) {
                            i14 = i4;
                            i15 = i17;
                        }
                        i4++;
                    } while (i4 < 32);
                    if (i12 <= i14) {
                        int i18 = i12;
                        i12 = i14;
                        i14 = i18;
                    }
                    if (i12 - i14 > 2) {
                        int i19 = i12 - 1;
                        int i20 = -1;
                        for (int i21 = i19; i21 > i14; i21--) {
                            int i22 = i21 - i14;
                            int i23 = i22 * i22 * (i12 - i21) * (i11 - iArr[i21]);
                            if (i23 > i20) {
                                i19 = i21;
                                i20 = i23;
                            }
                        }
                        int i24 = i19 << 3;
                        byte[] A002 = caD.A00();
                        for (int i25 = 0; i25 < i3; i25++) {
                            int i26 = i25 * i2;
                            for (int i27 = 0; i27 < i2; i27++) {
                                if ((A002[i26 + i27] & 255) < i24) {
                                    ds52.A01(i27, i25);
                                }
                            }
                        }
                    } else {
                        throw C23674Bnh.A00;
                    }
                } else {
                    byte[] A003 = caD.A00();
                    int i28 = i2 >> 3;
                    if ((i2 & 7) != 0) {
                        i28++;
                    }
                    int i29 = i3 >> 3;
                    if ((i3 & 7) != 0) {
                        i29++;
                    }
                    int i30 = i3 - 8;
                    int i31 = i2 - 8;
                    int[] A1W = C108945cZ.A1W();
                    A1W[1] = i28;
                    A1W[0] = i29;
                    int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, A1W);
                    for (int i32 = 0; i32 < i29; i32++) {
                        int i33 = i32 << 3;
                        int i34 = i30;
                        if (i33 > i34) {
                            i33 = i34;
                        }
                        for (int i35 = 0; i35 < i28; i35++) {
                            int i36 = i35 << 3;
                            int i37 = i31;
                            if (i36 > i37) {
                                i36 = i37;
                            }
                            int i38 = (i33 * i2) + i36;
                            byte b = 255;
                            int i39 = 0;
                            int i40 = 0;
                            byte b2 = 0;
                            do {
                                int i41 = 0;
                                do {
                                    byte b3 = A003[i38 + i41] & 255;
                                    i40 += b3;
                                    if (b3 < b) {
                                        b = b3;
                                    }
                                    if (b3 > b2) {
                                        b2 = b3;
                                    }
                                    i41++;
                                } while (i41 < 8);
                                i = b2 - b;
                                if (i > 24) {
                                    while (true) {
                                        i39++;
                                        i38 += i2;
                                        if (i39 >= 8) {
                                            break;
                                        }
                                        int i42 = 0;
                                        do {
                                            i40 += A003[i38 + i42] & 255;
                                            i42++;
                                        } while (i42 < 8);
                                    }
                                }
                                i39++;
                                i38 += i2;
                            } while (i39 < 8);
                            int i43 = i40 >> 6;
                            if (i <= 24) {
                                i43 = b / 2;
                                if (i32 > 0 && i35 > 0) {
                                    int[] iArr3 = iArr2[i32 - 1];
                                    int i44 = i35 - 1;
                                    int i45 = ((iArr3[i35] + (iArr2[i32][i44] * 2)) + iArr3[i44]) / 4;
                                    if (b < i45) {
                                        i43 = i45;
                                    }
                                }
                            }
                            iArr2[i32][i35] = i43;
                        }
                    }
                    ds52 = new DS5(i2, i3);
                    for (int i46 = 0; i46 < i29; i46++) {
                        int i47 = i46 << 3;
                        int i48 = i30;
                        if (i47 > i48) {
                            i47 = i48;
                        }
                        int i49 = i29 - 3;
                        if (i46 < 2) {
                            i49 = 2;
                        } else if (i46 <= i49) {
                            i49 = i46;
                        }
                        for (int i50 = 0; i50 < i28; i50++) {
                            int i51 = i50 << 3;
                            int i52 = i31;
                            if (i51 > i52) {
                                i51 = i52;
                            }
                            int i53 = i28 - 3;
                            if (i50 < 2) {
                                i53 = 2;
                            } else if (i50 <= i53) {
                                i53 = i50;
                            }
                            int i54 = -2;
                            int i55 = 0;
                            do {
                                int[] iArr4 = iArr2[i49 + i54];
                                i55 = BE6.A0J(iArr4, i53 + 2, iArr4[i53 - 2] + iArr4[i53 - 1] + iArr4[i53] + iArr4[i53 + 1], i55);
                                i54++;
                            } while (i54 <= 2);
                            int i56 = i55 / 25;
                            int i57 = (i47 * i2) + i51;
                            int i58 = 0;
                            do {
                                int i59 = 0;
                                do {
                                    if ((A003[i57 + i59] & 255) <= i56) {
                                        ds52.A01(i51 + i59, i47 + i58);
                                    }
                                    i59++;
                                } while (i59 < 8);
                                i58++;
                                i57 += i2;
                            } while (i58 < 8);
                        }
                    }
                }
                ds53 = ds52;
                bnc.A00 = ds53;
            }
            this.A00 = ds53;
        }
        return ds52;
    }

    public CYN(CLV clv) {
        this.A01 = clv;
    }

    public String toString() {
        try {
            return A00().toString();
        } catch (C23674Bnh unused) {
            return "";
        }
    }
}
