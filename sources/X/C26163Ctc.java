package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.Ctc  reason: case insensitive filesystem */
public abstract class C26163Ctc {
    public static int A00(CQ8 cq8, C25839Cmt cmt, byte[] bArr, int i, int i2, int i3) {
        Object ber;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            CQ8 cq82 = cq8;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A02 = A02(cq8, bArr, i2);
                cmt.A01(i, Long.valueOf(cq8.A01));
                return A02;
            } else if (i5 == 1) {
                cmt.A01(i, Long.valueOf(BEB.A0G(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A01 = A01(cq8, bArr, i2);
                int i6 = cq8.A00;
                if (i6 == 0) {
                    ber = DSP.A00;
                } else {
                    ber = new C23303Ber(DSP.A01.CTT(bArr, A01, i6));
                }
                cmt.A01(i, ber);
                return A01 + i6;
            } else if (i5 == 3) {
                C25839Cmt cmt2 = new C25839Cmt();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A01(cq82, bArr, i4);
                    i8 = cq82.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A00(cq82, cmt2, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw new C24203BxF("Failed to parse the message.");
                }
                cmt.A01(i, cmt2);
                return i4;
            } else if (i5 == 5) {
                cmt.A01(i, Integer.valueOf(BEB.A08(bArr, i2)));
                return i2 + 4;
            }
        }
        throw new C24203BxF("Protocol message contained an invalid tag (zero).");
    }

    public static int A01(CQ8 cq8, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A04(cq8, bArr, b, i2);
        }
        cq8.A00 = b;
        return i2;
    }

    public static int A02(CQ8 cq8, byte[] bArr, int i) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            cq8.A01 = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b & Byte.MAX_VALUE)) << i4;
            i3++;
        }
        cq8.A01 = j2;
        return i3;
    }

    public static int A04(CQ8 cq8, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i & StringTreeSet.OFFSET_BASE_ENCODING;
        int i7 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i5 = b << 7;
        } else {
            int i8 = i6 | ((b & Byte.MAX_VALUE) << 7);
            int i9 = i7 + 1;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i6 = i8 | ((b2 & Byte.MAX_VALUE) << 14);
                i7 = i9 + 1;
                byte b3 = bArr[i9];
                if (b3 >= 0) {
                    i5 = b3 << 21;
                } else {
                    i8 = i6 | ((b3 & Byte.MAX_VALUE) << 21);
                    i9 = i7 + 1;
                    byte b4 = bArr[i7];
                    if (b4 >= 0) {
                        i4 = b4 << 28;
                    } else {
                        i3 = i8 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            i7 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                break;
                            }
                            i9 = i7;
                        }
                        cq8.A00 = i3;
                        return i7;
                    }
                }
            }
            cq8.A00 = i8 | i4;
            return i9;
        }
        i3 = i6 | i5;
        cq8.A00 = i3;
        return i7;
    }

    public static int A03(CQ8 cq8, byte[] bArr, int i) {
        int A01 = A01(cq8, bArr, i);
        int i2 = cq8.A00;
        if (i2 == 0) {
            cq8.A02 = DSP.A00;
            return A01;
        }
        cq8.A02 = new C23303Ber(DSP.A01.CTT(bArr, A01, i2));
        return A01 + i2;
    }
}
