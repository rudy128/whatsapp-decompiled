package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

public final class DJP implements E9l {
    public static final Unsafe A0D = C26291Cwy.A03();
    public static final int[] A0E = new int[0];
    public final int[] A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final CB2 A05;
    public final CH2 A06;
    public final CB3 A07;
    public final C28454E1u A08;
    public final CB4 A09;
    public final CB6 A0A;
    public final int[] A0B;
    public final Object[] A0C;

    public DJP(CB2 cb2, CH2 ch2, CB3 cb3, C28454E1u e1u, CB4 cb4, CB6 cb6, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4) {
        this.A00 = iArr;
        this.A0C = objArr;
        this.A01 = i;
        this.A02 = i2;
        this.A0B = iArr2;
        this.A03 = i3;
        this.A04 = i4;
        this.A09 = cb4;
        this.A06 = ch2;
        this.A0A = cb6;
        this.A05 = cb2;
        this.A08 = e1u;
        this.A07 = cb3;
    }

    public static int A01(C25571CiA ciA, C26136Csz csz, byte[] bArr, int i, int i2, int i3) {
        Object beL;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            C25571CiA ciA2 = ciA;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A042 = A04(ciA, bArr, i2);
                csz.A02(i, Long.valueOf(ciA.A01));
                return A042;
            } else if (i5 == 1) {
                csz.A02(i, Long.valueOf(BEB.A0E(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A032 = A03(ciA, bArr, i2);
                int i6 = ciA.A00;
                if (i6 >= 0) {
                    int length = bArr.length;
                    if (i6 <= length - A032) {
                        if (i6 == 0) {
                            beL = DSN.A00;
                        } else {
                            DSN.A00(A032, A032 + i6, length);
                            beL = new C23271BeL(BE7.A1Z(bArr, i6, A032));
                        }
                        csz.A02(i, beL);
                        return A032 + i6;
                    }
                    throw new C24209BxL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                throw new C24209BxL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            } else if (i5 == 3) {
                int i7 = (i & -8) | 4;
                C26136Csz A002 = C26136Csz.A00();
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A03(ciA2, bArr, i4);
                    i8 = ciA2.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A01(ciA2, A002, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw new C24209BxL("Failed to parse the message.");
                }
                csz.A02(i, A002);
                return i4;
            } else if (i5 == 5) {
                csz.A02(i, Integer.valueOf(BEB.A09(bArr, i2)));
                return i2 + 4;
            }
        }
        throw new C24209BxL("Protocol message contained an invalid tag (zero).");
    }

    public final void CTf(C25571CiA ciA, Object obj, byte[] bArr, int i, int i2) {
        A0G(ciA, obj, bArr, i, i2, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C25571CiA r6, X.E9l r7, java.lang.Object r8, byte[] r9, int r10, int r11) {
        /*
            int r4 = r10 + 1
            r3 = r9
            byte r5 = r9[r10]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = A05(r6, r9, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x001c
        L_0x0010:
            int r11 = r11 - r4
            if (r5 > r11) goto L_0x001c
            int r5 = r5 + r4
            r0 = r7
            r2 = r8
            r0.CTf(r1, r2, r3, r4, r5)
            r6.A02 = r8
            return r5
        L_0x001c:
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxL r0 = new X.BxL
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DJP.A00(X.CiA, X.E9l, java.lang.Object, byte[], int, int):int");
    }

    public static int A03(C25571CiA ciA, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A05(ciA, bArr, b, i2);
        }
        ciA.A00 = b;
        return i2;
    }

    public static int A04(C25571CiA ciA, byte[] bArr, int i) {
        long j = (long) bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            ciA.A01 = j;
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
        ciA.A01 = j2;
        return i3;
    }

    public static int A05(C25571CiA ciA, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        byte b = bArr[i2];
        int i6 = i2 + 1;
        int i7 = i & StringTreeSet.OFFSET_BASE_ENCODING;
        if (b >= 0) {
            i5 = b << 7;
        } else {
            int i8 = i7 | ((b & Byte.MAX_VALUE) << 7);
            int i9 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i7 = i8 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i9 + 1;
                byte b3 = bArr[i9];
                if (b3 >= 0) {
                    i5 = b3 << 21;
                } else {
                    i8 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
                    i9 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i4 = b4 << 28;
                    } else {
                        i3 = i8 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            i6 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                break;
                            }
                            i9 = i6;
                        }
                        ciA.A00 = i3;
                        return i6;
                    }
                }
            }
            ciA.A00 = i8 | i4;
            return i9;
        }
        i3 = i7 | i5;
        ciA.A00 = i3;
        return i6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0169, code lost:
        if ((r8 & 2048) == 0) goto L_0x0127;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.DJP A06(X.CB2 r37, X.CH2 r38, X.CB3 r39, X.C28453E1t r40, X.CB4 r41, X.CB6 r42) {
        /*
            r12 = r40
            boolean r0 = r12 instanceof X.DJJ
            if (r0 == 0) goto L_0x036e
            X.DJJ r12 = (X.DJJ) r12
            java.lang.String r11 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"
            int r29 = r11.length()
            char r0 = X.BE7.A00(r11)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r1) goto L_0x0022
            r0 = 1
        L_0x0018:
            int r2 = r0 + 1
            char r0 = r11.charAt(r0)
            if (r0 < r1) goto L_0x0023
            r0 = r2
            goto L_0x0018
        L_0x0022:
            r2 = 1
        L_0x0023:
            int r14 = r2 + 1
            char r4 = r11.charAt(r2)
            if (r4 < r1) goto L_0x0042
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x002f:
            int r2 = r14 + 1
            char r0 = r11.charAt(r14)
            if (r0 < r1) goto L_0x003f
            int r4 = X.BE6.A08(r0, r3, r4)
            int r3 = r3 + 13
            r14 = r2
            goto L_0x002f
        L_0x003f:
            int r0 = r0 << r3
            r4 = r4 | r0
            r14 = r2
        L_0x0042:
            if (r4 != 0) goto L_0x024e
            int[] r17 = A0E
            r6 = 0
            r7 = 0
            r8 = 0
            r5 = 0
            r4 = 0
            r0 = 0
            r3 = 0
        L_0x004d:
            sun.misc.Unsafe r28 = A0D
            java.lang.Object[] r10 = r12.A02
            X.E1u r2 = r12.A01
            r31 = r2
            java.lang.Class r27 = r31.getClass()
            int r40 = r3 + r8
            int r8 = r7 + r7
            int r2 = r7 * 3
            int[] r2 = new int[r2]
            r26 = r2
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r25 = r2
            r24 = r3
            r23 = r40
            r22 = 0
            r21 = 0
        L_0x006f:
            r2 = r29
            if (r14 >= r2) goto L_0x0352
            int r2 = r14 + 1
            char r9 = r11.charAt(r14)
            if (r9 < r1) goto L_0x008f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x007f:
            int r8 = r2 + 1
            char r2 = r11.charAt(r2)
            if (r2 < r1) goto L_0x0091
            int r9 = X.BE6.A08(r2, r7, r9)
            int r7 = r7 + 13
            r2 = r8
            goto L_0x007f
        L_0x008f:
            r8 = r2
            goto L_0x0093
        L_0x0091:
            int r2 = r2 << r7
            r9 = r9 | r2
        L_0x0093:
            int r7 = r8 + 1
            char r8 = r11.charAt(r8)
            if (r8 < r1) goto L_0x00af
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x009f:
            int r2 = r7 + 1
            char r7 = r11.charAt(r7)
            if (r7 < r1) goto L_0x00b1
            int r8 = X.BE6.A08(r7, r13, r8)
            int r13 = r13 + 13
            r7 = r2
            goto L_0x009f
        L_0x00af:
            r2 = r7
            goto L_0x00b3
        L_0x00b1:
            int r7 = r7 << r13
            r8 = r8 | r7
        L_0x00b3:
            r7 = r8 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x00bd
            int r7 = r22 + 1
            r17[r22] = r21
            r22 = r7
        L_0x00bd:
            r7 = r8 & 255(0xff, float:3.57E-43)
            r13 = 51
            if (r7 < r13) goto L_0x00e2
            int r14 = r2 + 1
            char r2 = r11.charAt(r2)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r1) goto L_0x01c0
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r1 = 13
        L_0x00d2:
            int r15 = r14 + 1
            char r14 = r11.charAt(r14)
            if (r14 < r13) goto L_0x01bd
            int r2 = X.BE6.A08(r14, r1, r2)
            int r1 = r1 + 13
            r14 = r15
            goto L_0x00d2
        L_0x00e2:
            int r15 = r0 + 1
            r1 = r10[r0]
            java.lang.String r1 = (java.lang.String) r1
            r0 = r27
            java.lang.reflect.Field r13 = A0B(r0, r1)
            r0 = 9
            if (r7 == r0) goto L_0x0175
            r0 = 17
            if (r7 == r0) goto L_0x0175
            r0 = 27
            if (r7 == r0) goto L_0x016b
            r0 = 49
            if (r7 == r0) goto L_0x016b
            r0 = 12
            if (r7 == r0) goto L_0x0161
            r0 = 30
            if (r7 == r0) goto L_0x0161
            r0 = 44
            if (r7 == r0) goto L_0x0161
            r0 = 50
            if (r7 != r0) goto L_0x0127
            int r16 = r24 + 1
            r17[r24] = r21
            int r1 = r21 / 3
            int r0 = r15 + 1
            r14 = r10[r15]
            int r1 = r1 + r1
            r25[r1] = r14
            r14 = r8 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x015d
            r14 = r25
            int r15 = X.BE7.A0B(r10, r14, r1, r0)
            r24 = r16
        L_0x0127:
            r0 = r28
            long r13 = r0.objectFieldOffset(r13)
            int r13 = (int) r13
            r20 = r13
            r0 = r8 & 4096(0x1000, float:5.74E-42)
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 == 0) goto L_0x0183
            r0 = 17
            if (r7 > r0) goto L_0x0183
            int r0 = r2 + 1
            char r13 = r11.charAt(r2)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r1) goto L_0x0181
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x014a:
            int r14 = r0 + 1
            char r1 = r11.charAt(r0)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r0) goto L_0x0194
            int r13 = X.BE6.A08(r1, r2, r13)
            int r2 = r2 + 13
            r0 = r14
            goto L_0x014a
        L_0x015d:
            r24 = r16
            r15 = r0
            goto L_0x0127
        L_0x0161:
            int r0 = r12.A00
            r0 = r0 & 1
            if (r0 != 0) goto L_0x016b
            r0 = r8 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0127
        L_0x016b:
            int r1 = r21 / 3
            int r1 = r1 + r1
            r0 = r25
            int r15 = X.BE7.A0B(r10, r0, r1, r15)
            goto L_0x0127
        L_0x0175:
            int r0 = r21 / 3
            int r0 = r0 + r0
            int r1 = r0 + 1
            java.lang.Class r0 = r13.getType()
            r25[r1] = r0
            goto L_0x0127
        L_0x0181:
            r14 = r0
            goto L_0x0196
        L_0x0183:
            r14 = r2
            r1 = 0
            r0 = 18
            if (r7 < r0) goto L_0x01b0
            r0 = 49
            if (r7 > r0) goto L_0x01b0
            int r0 = r23 + 1
            r17[r23] = r13
            r23 = r0
            goto L_0x01b0
        L_0x0194:
            int r1 = r1 << r2
            r13 = r13 | r1
        L_0x0196:
            int r2 = r6 + r6
            int r0 = r13 / 32
            int r2 = r2 + r0
            r1 = r10[r2]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x01b2
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x01a3:
            r0 = r28
            long r18 = r0.objectFieldOffset(r1)
            r1 = r18
            int r0 = (int) r1
            r18 = r0
            int r1 = r13 % 32
        L_0x01b0:
            r0 = r15
            goto L_0x0207
        L_0x01b2:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r27
            java.lang.reflect.Field r1 = A0B(r0, r1)
            r10[r2] = r1
            goto L_0x01a3
        L_0x01bd:
            int r14 = r14 << r1
            r2 = r2 | r14
            r14 = r15
        L_0x01c0:
            int r13 = r7 + -51
            r1 = 9
            if (r13 == r1) goto L_0x01d8
            r1 = 17
            if (r13 == r1) goto L_0x01d8
            r1 = 12
            if (r13 != r1) goto L_0x01e1
            int r1 = r12.A00
            r1 = r1 & 1
            if (r1 != 0) goto L_0x01d8
            r1 = r8 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x01e1
        L_0x01d8:
            int r13 = r21 / 3
            int r13 = r13 + r13
            r1 = r25
            int r0 = X.BE7.A0B(r10, r1, r13, r0)
        L_0x01e1:
            int r2 = r2 + r2
            r13 = r10[r2]
            boolean r1 = r13 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0243
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
        L_0x01ea:
            r1 = r28
            long r15 = r1.objectFieldOffset(r13)
            int r1 = (int) r15
            r20 = r1
            int r13 = r2 + 1
            r2 = r10[r13]
            boolean r1 = r2 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0238
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
        L_0x01fd:
            r1 = r28
            long r1 = r1.objectFieldOffset(r2)
            int r13 = (int) r1
            r18 = r13
            r1 = 0
        L_0x0207:
            int r16 = r21 + 1
            r26[r21] = r9
            int r15 = r16 + 1
            r2 = r8 & 512(0x200, float:7.175E-43)
            r13 = 0
            if (r2 == 0) goto L_0x0214
            r13 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0214:
            r2 = r8 & 256(0x100, float:3.59E-43)
            r9 = 0
            if (r2 == 0) goto L_0x021b
            r9 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x021b:
            r2 = r8 & 2048(0x800, float:2.87E-42)
            r8 = 0
            if (r2 == 0) goto L_0x0222
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0222:
            int r2 = r7 << 20
            r13 = r13 | r9
            r8 = r8 | r13
            r8 = r8 | r2
            r20 = r20 | r8
            r26[r16] = r20
            int r21 = r15 + 1
            int r1 = r1 << 20
            r1 = r1 | r18
            r26[r15] = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            goto L_0x006f
        L_0x0238:
            java.lang.String r2 = (java.lang.String) r2
            r1 = r27
            java.lang.reflect.Field r2 = A0B(r1, r2)
            r10[r13] = r2
            goto L_0x01fd
        L_0x0243:
            java.lang.String r13 = (java.lang.String) r13
            r1 = r27
            java.lang.reflect.Field r13 = A0B(r1, r13)
            r10[r2] = r13
            goto L_0x01ea
        L_0x024e:
            int r0 = r14 + 1
            char r6 = r11.charAt(r14)
            if (r6 < r1) goto L_0x026d
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x025a:
            int r2 = r0 + 1
            char r0 = r11.charAt(r0)
            if (r0 < r1) goto L_0x026a
            int r6 = X.BE6.A08(r0, r3, r6)
            int r3 = r3 + 13
            r0 = r2
            goto L_0x025a
        L_0x026a:
            int r0 = r0 << r3
            r6 = r6 | r0
            r0 = r2
        L_0x026d:
            int r4 = r0 + 1
            char r10 = r11.charAt(r0)
            if (r10 < r1) goto L_0x028c
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x0279:
            int r2 = r4 + 1
            char r0 = r11.charAt(r4)
            if (r0 < r1) goto L_0x0289
            int r10 = X.BE6.A08(r0, r3, r10)
            int r3 = r3 + 13
            r4 = r2
            goto L_0x0279
        L_0x0289:
            int r0 = r0 << r3
            r10 = r10 | r0
            r4 = r2
        L_0x028c:
            int r0 = r4 + 1
            char r5 = r11.charAt(r4)
            if (r5 < r1) goto L_0x02ab
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x0298:
            int r2 = r0 + 1
            char r0 = r11.charAt(r0)
            if (r0 < r1) goto L_0x02a8
            int r5 = X.BE6.A08(r0, r3, r5)
            int r3 = r3 + 13
            r0 = r2
            goto L_0x0298
        L_0x02a8:
            int r0 = r0 << r3
            r5 = r5 | r0
            r0 = r2
        L_0x02ab:
            int r7 = r0 + 1
            char r4 = r11.charAt(r0)
            if (r4 < r1) goto L_0x02ca
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x02b7:
            int r2 = r7 + 1
            char r0 = r11.charAt(r7)
            if (r0 < r1) goto L_0x02c7
            int r4 = X.BE6.A08(r0, r3, r4)
            int r3 = r3 + 13
            r7 = r2
            goto L_0x02b7
        L_0x02c7:
            int r0 = r0 << r3
            r4 = r4 | r0
            r7 = r2
        L_0x02ca:
            int r0 = r7 + 1
            char r7 = r11.charAt(r7)
            if (r7 < r1) goto L_0x02e9
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x02d6:
            int r2 = r0 + 1
            char r0 = r11.charAt(r0)
            if (r0 < r1) goto L_0x02e6
            int r7 = X.BE6.A08(r0, r3, r7)
            int r3 = r3 + 13
            r0 = r2
            goto L_0x02d6
        L_0x02e6:
            int r0 = r0 << r3
            r7 = r7 | r0
            r0 = r2
        L_0x02e9:
            int r9 = r0 + 1
            char r8 = r11.charAt(r0)
            if (r8 < r1) goto L_0x0308
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x02f5:
            int r2 = r9 + 1
            char r0 = r11.charAt(r9)
            if (r0 < r1) goto L_0x0305
            int r8 = X.BE6.A08(r0, r3, r8)
            int r3 = r3 + 13
            r9 = r2
            goto L_0x02f5
        L_0x0305:
            int r0 = r0 << r3
            r8 = r8 | r0
            r9 = r2
        L_0x0308:
            int r0 = r9 + 1
            char r13 = r11.charAt(r9)
            if (r13 < r1) goto L_0x0327
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x0314:
            int r2 = r0 + 1
            char r0 = r11.charAt(r0)
            if (r0 < r1) goto L_0x0324
            int r13 = X.BE6.A08(r0, r3, r13)
            int r3 = r3 + 13
            r0 = r2
            goto L_0x0314
        L_0x0324:
            int r0 = r0 << r3
            r13 = r13 | r0
            r0 = r2
        L_0x0327:
            int r14 = r0 + 1
            char r3 = r11.charAt(r0)
            if (r3 < r1) goto L_0x0346
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0333:
            int r2 = r14 + 1
            char r0 = r11.charAt(r14)
            if (r0 < r1) goto L_0x0343
            int r3 = X.BE6.A08(r0, r9, r3)
            int r9 = r9 + 13
            r14 = r2
            goto L_0x0333
        L_0x0343:
            int r0 = r0 << r9
            r3 = r3 | r0
            r14 = r2
        L_0x0346:
            int r2 = r3 + r8
            int r2 = r2 + r13
            int r0 = r6 + r6
            int r0 = r0 + r10
            int[] r2 = new int[r2]
            r17 = r2
            goto L_0x004d
        L_0x0352:
            X.DJP r27 = new X.DJP
            r28 = r37
            r29 = r38
            r30 = r39
            r32 = r41
            r33 = r42
            r34 = r26
            r35 = r17
            r36 = r25
            r37 = r5
            r38 = r4
            r39 = r3
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r27
        L_0x036e:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DJP.A06(X.CB2, X.CH2, X.CB3, X.E1t, X.CB4, X.CB6):X.DJP");
    }

    private final E9l A07(int i) {
        Object[] objArr = this.A0C;
        int i2 = i / 3;
        int i3 = i2 + i2;
        E9l e9l = (E9l) objArr[i3];
        if (e9l != null) {
            return e9l;
        }
        E9l A002 = C25658Cjo.A02.A00((Class) objArr[i3 + 1]);
        objArr[i3] = A002;
        return A002;
    }

    public static NullPointerException A08() {
        return new NullPointerException("zze");
    }

    private final void A0C(Object obj, int i) {
        int i2 = this.A00[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            C26291Cwy.A07(obj, j, (1 << (i2 >>> 20)) | C26291Cwy.A00(obj, j));
        }
    }

    public static boolean A0D(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof C23267BeH) || (((C23267BeH) obj).zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    private final boolean A0E(Object obj, int i) {
        int[] iArr = this.A00;
        int i2 = iArr[i + 2];
        long j = (long) (i2 & 1048575);
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = (long) (1048575 & i3);
            switch ((i3 >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(C26291Cwy.A00.A00(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(C26291Cwy.A00.A01(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C26291Cwy.A01(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (C26291Cwy.A00(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    if (C26291Cwy.A02) {
                        return AnonymousClass000.A1O((byte) (BEA.A06(j2 ^ -1, C26291Cwy.A00.A00.getInt(obj, -4 & j2)) & 255));
                    }
                    return AnonymousClass000.A1O((byte) (BEA.A06(j2, C26291Cwy.A00.A00.getInt(obj, -4 & j2)) & 255));
                case 8:
                    Object A022 = C26291Cwy.A02(obj, j2);
                    if (A022 instanceof String) {
                        if (!((String) A022).isEmpty()) {
                            return true;
                        }
                    } else if (!(A022 instanceof DSN)) {
                        throw BE6.A0j();
                    } else if (!DSN.A00.equals(A022)) {
                        return true;
                    }
                    break;
                case 9:
                case 17:
                    if (C26291Cwy.A02(obj, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!DSN.A00.equals(C26291Cwy.A02(obj, j2))) {
                        return true;
                    }
                    break;
                default:
                    throw BE6.A0j();
            }
        } else {
            if ((C26291Cwy.A00(obj, j) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0F(Object obj, int i, int i2) {
        return AnonymousClass000.A1T(C26291Cwy.A00(obj, BE9.A0O(this.A00, i2)), i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v123, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v152, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v86, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v226, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01de, code lost:
        r0 = r41[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e0, code lost:
        if (r0 < 0) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01e2, code lost:
        r7 = r7 + 1;
        r4[r1] = (char) r0;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01eb, code lost:
        if (r7 >= r9) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ed, code lost:
        r12 = r7 + 1;
        r10 = r41[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f1, code lost:
        if (r10 < 0) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f3, code lost:
        r13 = r1 + 1;
        r4[r1] = (char) r10;
        r7 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f9, code lost:
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01fa, code lost:
        if (r7 >= r9) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01fc, code lost:
        r0 = r41[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fe, code lost:
        if (r0 < 0) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0200, code lost:
        r7 = r7 + 1;
        r13 = r13 + 1;
        r4[r1] = (char) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x020a, code lost:
        if (r10 >= -32) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020c, code lost:
        if (r12 >= r9) goto L_0x0764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020e, code lost:
        r7 = r12 + 1;
        r12 = r41[r12];
        r16 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0216, code lost:
        if (r10 < -62) goto L_0x070f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x021a, code lost:
        if (r12 > -65) goto L_0x070f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x021c, code lost:
        r10 = ((r10 & 31) << 6) | (r12 & 63);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0223, code lost:
        r4[r1] = (char) r10;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x022b, code lost:
        if (r10 >= -16) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x022f, code lost:
        if (r12 >= (r9 - 1)) goto L_0x0764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0231, code lost:
        r0 = r12 + 1;
        r12 = r41[r12];
        r7 = r0 + 1;
        r15 = r41[r0];
        r16 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x023d, code lost:
        if (r12 > -65) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0243, code lost:
        if (r10 != -32) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0245, code lost:
        if (r12 < -96) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0247, code lost:
        r10 = -32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0249, code lost:
        if (r15 > -65) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x024b, code lost:
        r10 = (((r10 & 15) << 12) | ((r12 & 63) << 6)) | (r15 & 63);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x025a, code lost:
        if (r10 != -19) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x025c, code lost:
        if (r12 >= -96) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x025e, code lost:
        r10 = -19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0263, code lost:
        if (r12 >= (r9 - 2)) goto L_0x0764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0265, code lost:
        r7 = r12 + 1;
        r13 = r41[r12];
        r0 = r7 + 1;
        r15 = r41[r7];
        r7 = r0 + 1;
        r12 = r41[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0273, code lost:
        if (r13 > -65) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0279, code lost:
        if (X.BE8.A05(r10, r13) != 0) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x027b, code lost:
        if (r15 > -65) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x027d, code lost:
        if (r12 > -65) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x027f, code lost:
        X.BEB.A0j((((r10 & 7) << 18) | ((r13 & 63) << 12)) | ((r15 & 63) << 6), r12 & 63, r4, r1);
        r1 = r1 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0296, code lost:
        r12 = new java.lang.String(r4, 0, r1);
        r6.A02 = r12;
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02a0, code lost:
        if (r4 < 0) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02a2, code lost:
        if (r4 == 0) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02a4, code lost:
        r12 = X.BE6.A0r(X.CI7.A03, r5, r7, r4);
        r6.A02 = r12;
        r7 = r7 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02ad, code lost:
        r11.putObject(r8, r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02b1, code lost:
        r6.A02 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02b5, code lost:
        if (r7 != 2) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02b7, code lost:
        r2 = A09(r8, r9);
        r7 = A00(r6, A07(r9), r2, r5, r4, r37);
        r11.putObject(r8, (long) (r13[r28] & 1048575), r2);
        A0C(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02d4, code lost:
        if (r7 != 2) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02d6, code lost:
        r7 = A02(r6, r5, r4);
        r11.putObject(r8, r2, r6.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02e0, code lost:
        if (r7 != 0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02e2, code lost:
        r7 = A03(r6, r5, r4);
        r1 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02e9, code lost:
        if (r7 != 0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02eb, code lost:
        r7 = A03(r6, r5, r4);
        r1 = r6.A00;
        r1 = (r1 >>> 1) ^ (-(r1 & 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02f7, code lost:
        r11.putInt(r8, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02fb, code lost:
        if (r7 != 0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02fd, code lost:
        r7 = A04(r6, r5, r4);
        r0 = X.BEA.A0H(r6.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0307, code lost:
        r11.putLong(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x030d, code lost:
        r18 = r18 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0313, code lost:
        if (r1 != 27) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0316, code lost:
        if (r7 != 2) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0318, code lost:
        r1 = (X.EE6) r11.getObject(r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0323, code lost:
        if (((X.C27290DbJ) r1).A00 != false) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0325, code lost:
        r1 = r1.CTV(X.BEA.A0B(r1));
        r11.putObject(r8, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0330, code lost:
        r9 = A07(r9);
        r2 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0336, code lost:
        r0 = r9.CTU();
        r7 = A00(r6, r9, r0, r5, r4, r37);
        r9.CTb(r0);
        r6.A02 = r0;
        r1.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0354, code lost:
        if (r7 >= r37) goto L_0x06f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0356, code lost:
        r4 = A03(r6, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x035e, code lost:
        if (r17 == r6.A00) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0364, code lost:
        if (r1 > 49) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0366, code lost:
        r13 = (long) r14;
        r0 = (X.EE6) r11.getObject(r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0372, code lost:
        if (((X.C27290DbJ) r0).A00 != false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0374, code lost:
        r0 = r0.CTV(X.BEA.A0B(r0));
        r11.putObject(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x037f, code lost:
        switch(r27) {
            case 18: goto L_0x03dc;
            case 19: goto L_0x03f6;
            case 20: goto L_0x0410;
            case 21: goto L_0x0410;
            case 22: goto L_0x03be;
            case 23: goto L_0x0433;
            case 24: goto L_0x044c;
            case 25: goto L_0x0465;
            case 26: goto L_0x0483;
            case 27: goto L_0x0382;
            case 28: goto L_0x04e2;
            case 29: goto L_0x03be;
            case 30: goto L_0x0562;
            case 31: goto L_0x044c;
            case 32: goto L_0x0433;
            case 33: goto L_0x0523;
            case 34: goto L_0x0541;
            case 35: goto L_0x03dc;
            case 36: goto L_0x03f6;
            case 37: goto L_0x0410;
            case 38: goto L_0x0410;
            case 39: goto L_0x03be;
            case 40: goto L_0x0433;
            case 41: goto L_0x044c;
            case 42: goto L_0x0465;
            case 43: goto L_0x03be;
            case 44: goto L_0x0562;
            case 45: goto L_0x044c;
            case 46: goto L_0x0433;
            case 47: goto L_0x0523;
            case 48: goto L_0x0541;
            default: goto L_0x0382;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0382, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0384, code lost:
        if (r7 != 3) goto L_0x0581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0386, code lost:
        r3 = A07(r9);
        r28 = (r17 & -8) | 4;
        r26 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0390, code lost:
        r2 = r3.CTU();
        r7 = ((X.DJP) r3).A0G(r6, r2, r5, r26, r37, r28);
        r6.A02 = r2;
        r3.CTb(r2);
        r6.A02 = r2;
        r0.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03b1, code lost:
        if (r7 >= r37) goto L_0x0589;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03b3, code lost:
        r26 = A03(r6, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03bb, code lost:
        if (r17 != r6.A00) goto L_0x0589;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03bf, code lost:
        if (r7 != 2) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03c1, code lost:
        r7 = A03(r6, r5, r4);
        r0 = r6.A00 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03c8, code lost:
        if (r7 >= r0) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03ca, code lost:
        A03(r6, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03d1, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03d2, code lost:
        if (r7 == r0) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03db, code lost:
        throw new X.C24209BxL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03dc, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03de, code lost:
        if (r7 != 2) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03e0, code lost:
        r7 = A03(r6, r5, r4);
        r0 = r6.A00 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03e7, code lost:
        if (r7 >= r0) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03ed, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03ef, code lost:
        if (r7 != 1) goto L_0x0581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03f5, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03f6, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03f8, code lost:
        if (r7 != 2) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03fa, code lost:
        r7 = A03(r6, r5, r4);
        r0 = r6.A00 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0401, code lost:
        if (r7 >= r0) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0407, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0409, code lost:
        if (r7 != 5) goto L_0x0581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x040f, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0410, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0412, code lost:
        if (r7 != 2) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0414, code lost:
        r7 = A03(r6, r5, r4);
        r0 = r6.A00 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x041b, code lost:
        if (r7 >= r0) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x041d, code lost:
        A04(r6, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0424, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0425, code lost:
        if (r7 != r0) goto L_0x0754;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0429, code lost:
        if (r7 != 0) goto L_0x0581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x042b, code lost:
        A04(r6, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0432, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0434, code lost:
        if (r7 != 2) goto L_0x0444;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0436, code lost:
        r7 = A03(r6, r5, r4);
        r0 = r6.A00 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x043d, code lost:
        if (r7 >= r0) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0443, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0445, code lost:
        if (r7 != 1) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x044b, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x044d, code lost:
        if (r7 != 2) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x044f, code lost:
        r7 = A03(r6, r5, r4);
        r0 = r6.A00 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0456, code lost:
        if (r7 >= r0) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x045c, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x045e, code lost:
        if (r7 != 5) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0464, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0466, code lost:
        if (r7 != 2) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0468, code lost:
        r7 = A03(r6, r5, r4);
        r0 = r6.A00 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x046f, code lost:
        if (r7 >= r0) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0471, code lost:
        A04(r6, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0478, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0479, code lost:
        if (r7 != 0) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x047b, code lost:
        A04(r6, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0482, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0484, code lost:
        if (r7 != 2) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0486, code lost:
        r1 = ((r13 & 536870912) > 0 ? 1 : ((r13 & 536870912) == 0 ? 0 : -1));
        r7 = A03(r6, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0490, code lost:
        if (r1 != 0) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0492, code lost:
        r2 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0494, code lost:
        if (r2 < 0) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0496, code lost:
        if (r2 != 0) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0498, code lost:
        r0.add(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x049d, code lost:
        if (r7 >= r37) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x049f, code lost:
        r3 = A03(r6, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x04a7, code lost:
        if (r17 != r6.A00) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x04a9, code lost:
        r7 = A03(r6, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x04ae, code lost:
        X.BE8.A1H(X.CI7.A03, r0, r5, r7, r2);
        r7 = r7 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x04b5, code lost:
        if (r3 != 0) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x04b7, code lost:
        r0.add(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x04bc, code lost:
        if (r7 >= r37) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x04be, code lost:
        r3 = A03(r6, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x04c6, code lost:
        if (r17 != r6.A00) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x04c8, code lost:
        r7 = A03(r6, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x04cc, code lost:
        r3 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x04ce, code lost:
        if (r3 < 0) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x04d1, code lost:
        r2 = r7 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x04d9, code lost:
        if (X.CF4.A00.A00(r5, r7, r2) == false) goto L_0x0764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x04db, code lost:
        X.BE8.A1H(X.CI7.A03, r0, r5, r7, r3);
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x04e3, code lost:
        if (r7 != 2) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x04e5, code lost:
        r7 = A03(r6, r5, r4);
        r3 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x04eb, code lost:
        if (r3 < 0) goto L_0x074c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x04ed, code lost:
        r9 = r5.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x04f0, code lost:
        if (r3 > (r9 - r7)) goto L_0x0744;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x04f2, code lost:
        if (r3 != 0) goto L_0x0510;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x04f4, code lost:
        r0.add(X.DSN.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x04fb, code lost:
        if (r7 >= r37) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x04fd, code lost:
        r3 = A03(r6, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0505, code lost:
        if (r17 != r6.A00) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0507, code lost:
        r7 = A03(r6, r5, r3);
        r3 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x050d, code lost:
        if (r3 < 0) goto L_0x074c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0510, code lost:
        X.DSN.A00(r7, r7 + r3, r9);
        r0.add(new X.C23271BeL(X.BE7.A1Z(r5, r3, r7)));
        r7 = r7 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0524, code lost:
        if (r7 != 2) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0526, code lost:
        r7 = A03(r6, r5, r4);
        r0 = r6.A00 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x052d, code lost:
        if (r7 >= r0) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x052f, code lost:
        A03(r6, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0536, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0537, code lost:
        if (r7 != 0) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0539, code lost:
        A03(r6, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0540, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0542, code lost:
        if (r7 != 2) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0544, code lost:
        r7 = A03(r6, r5, r4);
        r0 = r6.A00 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x054b, code lost:
        if (r7 >= r0) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x054d, code lost:
        A04(r6, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0554, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0555, code lost:
        if (r7 != r0) goto L_0x0754;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0558, code lost:
        if (r7 != 0) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x055a, code lost:
        A04(r6, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0561, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0563, code lost:
        if (r7 != 2) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0565, code lost:
        r7 = A03(r6, r5, r4);
        r0 = r6.A00 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x056c, code lost:
        if (r7 >= r0) goto L_0x0583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x056e, code lost:
        A03(r6, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0575, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0576, code lost:
        if (r7 != 0) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0578, code lost:
        A03(r6, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x057f, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0580, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0581, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0583, code lost:
        if (r7 != r0) goto L_0x075c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0585, code lost:
        r0 = X.C25451Cg2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0587, code lost:
        r12 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0589, code lost:
        if (r7 != r4) goto L_0x06f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x058b, code lost:
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0590, code lost:
        if (r1 != 50) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        r15 = r9 + 2;
        r30 = (long) (r13[r15] & 1048575);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0593, code lost:
        if (r7 != 2) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0595, code lost:
        r11.getObject(r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x059c, code lost:
        throw A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x059d, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x05a1, code lost:
        if (r7 != 1) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x05a3, code lost:
        r0 = java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(X.BEB.A0E(r5, r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x05b1, code lost:
        if (r7 != 5) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x05b3, code lost:
        r0 = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(X.BEB.A09(r5, r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        switch(r27) {
            case 51: goto L_0x05a0;
            case 52: goto L_0x05b0;
            case 53: goto L_0x05c0;
            case 54: goto L_0x05c0;
            case 55: goto L_0x05cd;
            case 56: goto L_0x05da;
            case 57: goto L_0x05ec;
            case 58: goto L_0x05fe;
            case 59: goto L_0x0615;
            case 60: goto L_0x063d;
            case 61: goto L_0x0659;
            case 62: goto L_0x05cd;
            case 63: goto L_0x0666;
            case 64: goto L_0x05ec;
            case 65: goto L_0x05da;
            case 66: goto L_0x066f;
            case X.8cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER :int: goto L_0x0682;
            case X.8co.MESSAGE_ADD_ONS_FIELD_NUMBER :int: goto L_0x069e;
            default: goto L_0x0097;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x05c0, code lost:
        if (r7 != 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x05c2, code lost:
        r7 = A04(r6, r5, r4);
        r0 = java.lang.Long.valueOf(r6.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x05cd, code lost:
        if (r7 != 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x05cf, code lost:
        r7 = A03(r6, r5, r4);
        r0 = java.lang.Integer.valueOf(r6.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x05db, code lost:
        if (r7 != 1) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x05dd, code lost:
        r0 = java.lang.Long.valueOf(X.BEB.A0E(r5, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x05e5, code lost:
        r11.putObject(r8, r2, r0);
        r7 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x05ed, code lost:
        if (r7 != 5) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x05ef, code lost:
        r0 = java.lang.Integer.valueOf(X.BEB.A09(r5, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x05f7, code lost:
        r11.putObject(r8, r2, r0);
        r7 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x05fe, code lost:
        if (r7 != 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0600, code lost:
        r7 = A04(r6, r5, r4);
        r0 = java.lang.Boolean.valueOf(X.AnonymousClass000.A1O((r6.A01 > 0 ? 1 : (r6.A01 == 0 ? 0 : -1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0610, code lost:
        r11.putObject(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0616, code lost:
        if (r7 != 2) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0618, code lost:
        r7 = A03(r6, r5, r4);
        r9 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x061e, code lost:
        if (r9 != 0) goto L_0x0624;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0620, code lost:
        r11.putObject(r8, r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        if (r7 != r4) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0626, code lost:
        if ((r14 & 536870912) == 0) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0630, code lost:
        if (X.CF4.A00.A00(r5, r7, r7 + r9) == false) goto L_0x0764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0632, code lost:
        r11.putObject(r8, r2, X.BE6.A0r(X.CI7.A03, r5, r7, r9));
        r7 = r7 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x063e, code lost:
        if (r7 != 2) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0640, code lost:
        r2 = A0A(r8, r21, r9);
        r7 = A00(r6, A07(r9), r2, r5, r4, r37);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x065a, code lost:
        if (r7 != 2) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x065c, code lost:
        r7 = A02(r6, r5, r4);
        r11.putObject(r8, r2, r6.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0666, code lost:
        if (r7 != 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0668, code lost:
        r7 = A03(r6, r5, r4);
        r1 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x066f, code lost:
        if (r7 != 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0671, code lost:
        r7 = A03(r6, r5, r4);
        r1 = r6.A00;
        r1 = (r1 >>> 1) ^ (-(r1 & 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x067d, code lost:
        r0 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0682, code lost:
        if (r7 != 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0684, code lost:
        r7 = A04(r6, r5, r4);
        r0 = java.lang.Long.valueOf(X.BEA.A0H(r6.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0692, code lost:
        r11.putObject(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0695, code lost:
        r11.putInt(r8, r30, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009b, code lost:
        r12 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x069f, code lost:
        if (r7 != 3) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x06a1, code lost:
        r2 = A0A(r8, r21, r9);
        r7 = ((X.DJP) A07(r9)).A0G(r6, r2, r5, r4, r37, (r17 & -8) | 4);
        r6.A02 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x06c3, code lost:
        r11.putObject(r8, (long) (r13[r28] & 1048575), r2);
        X.C26291Cwy.A07(r8, (long) (r13[r15] & 1048575), r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x06f7, code lost:
        r0 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x06f9, code lost:
        if (r44 != 0) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x06fb, code lost:
        if (r7 != r0) goto L_0x0707;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x06fd, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x06fe, code lost:
        if (r7 > r0) goto L_0x0707;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0704, code lost:
        if (r17 != r29) goto L_0x0707;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0706, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x070e, code lost:
        throw new X.C24209BxL("Failed to parse the message.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0716, code lost:
        throw new X.C24209BxL("Protocol message had invalid UTF-8.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x071e, code lost:
        throw new X.C24209BxL("Protocol message had invalid UTF-8.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0726, code lost:
        throw new X.C24209BxL("Protocol message had invalid UTF-8.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0727, code lost:
        r1 = X.AnonymousClass8BR.A1a();
        X.C17880vN.A1T(r1, r9, 0);
        X.AnonymousClass000.A1M(r1, r7);
        X.AnonymousClass3Ma.A1S(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x073b, code lost:
        throw X.BE8.A0U("buffer length=%d, index=%d, size=%d", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x074b, code lost:
        throw new X.C24209BxL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0753, code lost:
        throw new X.C24209BxL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x075b, code lost:
        throw new X.C24209BxL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0763, code lost:
        throw new X.C24209BxL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x076b, code lost:
        throw new X.C24209BxL("Protocol message had invalid UTF-8.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r0 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        if (r0 == 1048575) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        r11.putInt(r8, (long) r0, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b3, code lost:
        r2 = r10.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        if (r2 >= r10.A04) goto L_0x06f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b9, code lost:
        X.C26291Cwy.A02(r8, X.BE9.A0N(r10.A00, r10.A0B[r2]));
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c9, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cc, code lost:
        if (r9 == -1) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ce, code lost:
        r7 = r17 & 7;
        r28 = r9 + 1;
        r14 = r13[r28];
        r27 = (r14 >>> 20) & 255;
        r2 = (long) (r14 & 1048575);
        r12 = "";
        r1 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ea, code lost:
        if (r1 > 17) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ec, code lost:
        r16 = r13[r9 + 2];
        r22 = 1 << (r16 >>> 20);
        r16 = r16 & 1048575;
        r0 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fc, code lost:
        if (r16 == r0) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fe, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0101, code lost:
        if (r1 == 1048575) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0103, code lost:
        r11.putInt(r8, (long) r1, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0109, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010d, code lost:
        if (r1 != 1048575) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010f, code lost:
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0111, code lost:
        r19 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0113, code lost:
        switch(r27) {
            case 0: goto L_0x0151;
            case 1: goto L_0x0166;
            case 2: goto L_0x0177;
            case 3: goto L_0x0177;
            case 4: goto L_0x02e0;
            case 5: goto L_0x0181;
            case 6: goto L_0x0191;
            case 7: goto L_0x019f;
            case 8: goto L_0x01bb;
            case 9: goto L_0x02b4;
            case 10: goto L_0x02d3;
            case 11: goto L_0x02e0;
            case 12: goto L_0x02e0;
            case 13: goto L_0x0191;
            case 14: goto L_0x0181;
            case 15: goto L_0x02e9;
            case 16: goto L_0x02fb;
            default: goto L_0x0116;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0117, code lost:
        if (r7 != 3) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0119, code lost:
        r2 = A09(r8, r9);
        r7 = ((X.DJP) A07(r9)).A0G(r6, r2, r5, r4, r37, (r21 << 3) | 4);
        r6.A02 = r2;
        r11.putObject(r8, (long) (r13[r28] & 1048575), r2);
        A0C(r8, r9);
        r18 = r18 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0146, code lost:
        r12 = 0;
        r2 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014b, code lost:
        r18 = r11.getInt(r8, (long) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0152, code lost:
        if (r7 != 1) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0154, code lost:
        X.C26291Cwy.A00.A02(r8, r2, java.lang.Double.longBitsToDouble(X.BEB.A0E(r5, r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0167, code lost:
        if (r7 != 5) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0169, code lost:
        X.C26291Cwy.A00.A03(r8, r2, java.lang.Float.intBitsToFloat(X.BEB.A09(r5, r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0177, code lost:
        if (r7 != 0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0179, code lost:
        r7 = A04(r6, r5, r4);
        r0 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0182, code lost:
        if (r7 != 1) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0184, code lost:
        r11.putLong(r8, r2, X.BEB.A0E(r5, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018d, code lost:
        r7 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0192, code lost:
        if (r7 != 5) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0194, code lost:
        r11.putInt(r8, r2, X.BEB.A09(r5, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x019b, code lost:
        r7 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019f, code lost:
        if (r7 != 0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a1, code lost:
        r7 = A04(r6, r5, r4);
        r1 = X.AnonymousClass000.A1O((r6.A01 > 0 ? 1 : (r6.A01 == 0 ? 0 : -1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01af, code lost:
        if (X.C26291Cwy.A02 == false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b1, code lost:
        X.C26291Cwy.A0A(r8, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b6, code lost:
        X.C26291Cwy.A0B(r8, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01bc, code lost:
        if (r7 != 2) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01be, code lost:
        r14 = r14 & 536870912;
        r7 = A03(r6, r5, r4);
        r4 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c6, code lost:
        if (r14 == 0) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01c8, code lost:
        if (r4 < 0) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ca, code lost:
        if (r4 == 0) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01cc, code lost:
        r0 = X.CF4.A00;
        r9 = r5.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d5, code lost:
        if ((((r9 - r7) - r4) | (r7 | r4)) < 0) goto L_0x0727;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d7, code lost:
        r9 = r7 + r4;
        r4 = new char[r4];
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01dc, code lost:
        if (r7 >= r9) goto L_0x01eb;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r10v1, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r17v3, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0G(X.C25571CiA r39, java.lang.Object r40, byte[] r41, int r42, int r43, int r44) {
        /*
            r38 = this;
            r8 = r40
            r7 = r42
            boolean r0 = A0D(r8)
            if (r0 == 0) goto L_0x076c
            sun.misc.Unsafe r11 = A0D
            r12 = 0
            r2 = -1
            r20 = 0
            r17 = 0
            r18 = 0
            r19 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0017:
            r10 = r38
            r37 = r43
            r0 = r37
            r29 = r44
            if (r7 >= r0) goto L_0x00a6
            int r4 = r7 + 1
            r5 = r41
            byte r17 = r41[r7]
            r6 = r39
            if (r17 >= 0) goto L_0x0035
            r0 = r17
            int r4 = A05(r6, r5, r0, r4)
            int r0 = r6.A00
            r17 = r0
        L_0x0035:
            int r21 = r17 >>> 3
            r1 = 3
            r0 = r21
            if (r0 <= r2) goto L_0x0065
            int r20 = r20 / r1
            int r1 = r10.A01
            if (r0 < r1) goto L_0x009d
            int r1 = r10.A02
            if (r0 > r1) goto L_0x009d
            int[] r13 = r10.A00
            int r0 = r13.length
            int r0 = r0 / 3
            int r2 = r0 + -1
        L_0x004d:
            r0 = r20
            if (r0 > r2) goto L_0x009d
            int r0 = r2 + r20
            int r3 = r0 >>> 1
            int r9 = r3 * 3
            r1 = r13[r9]
            r0 = r21
            if (r0 == r1) goto L_0x00c9
            if (r0 >= r1) goto L_0x0062
            int r2 = r3 + -1
            goto L_0x004d
        L_0x0062:
            int r20 = r3 + 1
            goto L_0x004d
        L_0x0065:
            int r1 = r10.A01
            if (r0 < r1) goto L_0x009d
            int r1 = r10.A02
            if (r0 > r1) goto L_0x009d
            r7 = 0
            int[] r13 = r10.A00
            int r0 = r13.length
            int r0 = r0 / 3
            int r3 = r0 + -1
        L_0x0075:
            if (r7 > r3) goto L_0x009d
            int r0 = r3 + r7
            int r2 = r0 >>> 1
            int r9 = r2 * 3
            r1 = r13[r9]
            r0 = r21
            if (r0 == r1) goto L_0x00c9
            if (r0 >= r1) goto L_0x0088
            int r3 = r2 + -1
            goto L_0x0075
        L_0x0088:
            int r7 = r2 + 1
            goto L_0x0075
        L_0x008b:
            int r15 = r9 + 2
            r0 = r13[r15]
            r0 = r0 & r26
            long r0 = (long) r0
            r30 = r0
            switch(r27) {
                case 51: goto L_0x05a0;
                case 52: goto L_0x05b0;
                case 53: goto L_0x05c0;
                case 54: goto L_0x05c0;
                case 55: goto L_0x05cd;
                case 56: goto L_0x05da;
                case 57: goto L_0x05ec;
                case 58: goto L_0x05fe;
                case 59: goto L_0x0615;
                case 60: goto L_0x063d;
                case 61: goto L_0x0659;
                case 62: goto L_0x05cd;
                case 63: goto L_0x0666;
                case 64: goto L_0x05ec;
                case 65: goto L_0x05da;
                case 66: goto L_0x066f;
                case 67: goto L_0x0682;
                case 68: goto L_0x069e;
                default: goto L_0x0097;
            }
        L_0x0097:
            r7 = r4
        L_0x0098:
            if (r7 != r4) goto L_0x0146
            r4 = r7
        L_0x009b:
            r12 = r20
        L_0x009d:
            r1 = r29
            r0 = r17
            if (r0 != r1) goto L_0x06d7
            if (r44 == 0) goto L_0x06d7
            r7 = r4
        L_0x00a6:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r19
            if (r0 == r1) goto L_0x00b3
            long r0 = (long) r0
            r2 = r18
            r11.putInt(r8, r0, r2)
        L_0x00b3:
            int r2 = r10.A03
        L_0x00b5:
            int r0 = r10.A04
            if (r2 >= r0) goto L_0x06f7
            int[] r0 = r10.A0B
            r1 = r0[r2]
            int[] r0 = r10.A00
            long r0 = X.BE9.A0N(r0, r1)
            X.C26291Cwy.A02(r8, r0)
            int r2 = r2 + 1
            goto L_0x00b5
        L_0x00c9:
            r20 = r9
            r0 = -1
            if (r9 == r0) goto L_0x009d
            r7 = r17 & 7
            int r28 = r9 + 1
            r14 = r13[r28]
            int r0 = r14 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r27 = r0
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r14 & r26
            long r2 = (long) r0
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            r23 = 0
            java.lang.String r12 = ""
            r0 = 17
            r1 = r27
            if (r1 > r0) goto L_0x0311
            int r0 = r9 + 2
            r16 = r13[r0]
            int r0 = r16 >>> 20
            r22 = 1
            int r22 = r22 << r0
            r16 = r16 & r26
            r1 = r16
            r0 = r19
            if (r1 == r0) goto L_0x0113
            r1 = r0
            r0 = r26
            if (r1 == r0) goto L_0x0109
            long r0 = (long) r1
            r15 = r18
            r11.putInt(r8, r0, r15)
        L_0x0109:
            r1 = r16
            r0 = r26
            if (r1 != r0) goto L_0x014b
            r18 = 0
        L_0x0111:
            r19 = r16
        L_0x0113:
            switch(r27) {
                case 0: goto L_0x0151;
                case 1: goto L_0x0166;
                case 2: goto L_0x0177;
                case 3: goto L_0x0177;
                case 4: goto L_0x02e0;
                case 5: goto L_0x0181;
                case 6: goto L_0x0191;
                case 7: goto L_0x019f;
                case 8: goto L_0x01bb;
                case 9: goto L_0x02b4;
                case 10: goto L_0x02d3;
                case 11: goto L_0x02e0;
                case 12: goto L_0x02e0;
                case 13: goto L_0x0191;
                case 14: goto L_0x0181;
                case 15: goto L_0x02e9;
                case 16: goto L_0x02fb;
                default: goto L_0x0116;
            }
        L_0x0116:
            r0 = 3
            if (r7 != r0) goto L_0x009b
            java.lang.Object r2 = r10.A09(r8, r9)
            int r0 = r21 << 3
            r35 = r0 | 4
            X.E9l r0 = r10.A07(r9)
            X.DJP r0 = (X.DJP) r0
            r30 = r6
            r32 = r5
            r34 = r37
            r29 = r0
            r31 = r2
            r33 = r4
            int r7 = r29.A0G(r30, r31, r32, r33, r34, r35)
            r6.A02 = r2
            r0 = r13[r28]
            r0 = r0 & r26
            long r0 = (long) r0
            r11.putObject(r8, r0, r2)
            r10.A0C(r8, r9)
            r18 = r18 | r22
        L_0x0146:
            r12 = 0
            r2 = r21
            goto L_0x0017
        L_0x014b:
            long r0 = (long) r1
            int r18 = r11.getInt(r8, r0)
            goto L_0x0111
        L_0x0151:
            r0 = 1
            if (r7 != r0) goto L_0x009b
            long r0 = X.BEB.A0E(r5, r4)
            double r27 = java.lang.Double.longBitsToDouble(r0)
            X.Cbi r23 = X.C26291Cwy.A00
            r24 = r8
            r25 = r2
            r23.A02(r24, r25, r27)
            goto L_0x018d
        L_0x0166:
            r0 = 5
            if (r7 != r0) goto L_0x009b
            int r0 = X.BEB.A09(r5, r4)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.Cbi r0 = X.C26291Cwy.A00
            r0.A03(r8, r2, r1)
            goto L_0x019b
        L_0x0177:
            if (r7 != 0) goto L_0x009b
            int r7 = A04(r6, r5, r4)
            long r0 = r6.A01
            goto L_0x0307
        L_0x0181:
            r0 = 1
            if (r7 != r0) goto L_0x009b
            long r15 = X.BEB.A0E(r5, r4)
            r12 = r8
            r13 = r2
            r11.putLong(r12, r13, r15)
        L_0x018d:
            int r7 = r4 + 8
            goto L_0x030d
        L_0x0191:
            r0 = 5
            if (r7 != r0) goto L_0x009b
            int r0 = X.BEB.A09(r5, r4)
            r11.putInt(r8, r2, r0)
        L_0x019b:
            int r7 = r4 + 4
            goto L_0x030d
        L_0x019f:
            if (r7 != 0) goto L_0x009b
            int r7 = A04(r6, r5, r4)
            long r4 = r6.A01
            int r0 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r0)
            boolean r0 = X.C26291Cwy.A02
            if (r0 == 0) goto L_0x01b6
            X.C26291Cwy.A0A(r8, r2, r1)
            goto L_0x030d
        L_0x01b6:
            X.C26291Cwy.A0B(r8, r2, r1)
            goto L_0x030d
        L_0x01bb:
            r0 = 2
            if (r7 != r0) goto L_0x009b
            r14 = r14 & r25
            int r7 = A03(r6, r5, r4)
            int r4 = r6.A00
            if (r14 == 0) goto L_0x02a0
            if (r4 < 0) goto L_0x073c
            if (r4 == 0) goto L_0x02b1
            X.CUi r0 = X.CF4.A00
            int r9 = r5.length
            int r1 = r9 - r7
            r0 = r7 | r4
            int r1 = r1 - r4
            r1 = r1 | r0
            if (r1 < 0) goto L_0x0727
            int r9 = r7 + r4
            char[] r4 = new char[r4]
            r1 = 0
        L_0x01dc:
            if (r7 >= r9) goto L_0x01eb
            byte r0 = r41[r7]
            if (r0 < 0) goto L_0x01eb
            int r7 = r7 + 1
            int r10 = r1 + 1
            char r0 = (char) r0
            r4[r1] = r0
            r1 = r10
            goto L_0x01dc
        L_0x01eb:
            if (r7 >= r9) goto L_0x0296
            int r12 = r7 + 1
            byte r10 = r41[r7]
            if (r10 < 0) goto L_0x0208
            int r13 = r1 + 1
            char r0 = (char) r10
            r4[r1] = r0
            r7 = r12
        L_0x01f9:
            r1 = r13
            if (r7 >= r9) goto L_0x01eb
            byte r0 = r41[r7]
            if (r0 < 0) goto L_0x01eb
            int r7 = r7 + 1
            int r13 = r13 + 1
            char r0 = (char) r0
            r4[r1] = r0
            goto L_0x01f9
        L_0x0208:
            r0 = -32
            if (r10 >= r0) goto L_0x0229
            if (r12 >= r9) goto L_0x0764
            int r7 = r12 + 1
            byte r12 = r41[r12]
            int r16 = r1 + 1
            r0 = -62
            if (r10 < r0) goto L_0x070f
            r0 = -65
            if (r12 > r0) goto L_0x070f
            r0 = r10 & 31
            int r10 = r0 << 6
            r0 = r12 & 63
            r10 = r10 | r0
        L_0x0223:
            char r0 = (char) r10
            r4[r1] = r0
            r1 = r16
            goto L_0x01eb
        L_0x0229:
            r0 = -16
            if (r10 >= r0) goto L_0x0261
            int r0 = r9 + -1
            if (r12 >= r0) goto L_0x0764
            int r0 = r12 + 1
            byte r12 = r41[r12]
            int r7 = r0 + 1
            byte r15 = r41[r0]
            int r16 = r1 + 1
            r13 = -65
            if (r12 > r13) goto L_0x0717
            r14 = -96
            r0 = -32
            if (r10 != r0) goto L_0x0258
            if (r12 < r14) goto L_0x0717
            r10 = -32
        L_0x0249:
            if (r15 > r13) goto L_0x0717
            r10 = r10 & 15
            r0 = r12 & 63
            r12 = r15 & 63
            int r10 = r10 << 12
            int r0 = r0 << 6
            r10 = r10 | r0
            r10 = r10 | r12
            goto L_0x0223
        L_0x0258:
            r0 = -19
            if (r10 != r0) goto L_0x0249
            if (r12 >= r14) goto L_0x0717
            r10 = -19
            goto L_0x0249
        L_0x0261:
            int r0 = r9 + -2
            if (r12 >= r0) goto L_0x0764
            int r7 = r12 + 1
            byte r13 = r41[r12]
            int r0 = r7 + 1
            byte r15 = r41[r7]
            int r7 = r0 + 1
            byte r12 = r41[r0]
            r14 = -65
            if (r13 > r14) goto L_0x071f
            int r0 = X.BE8.A05(r10, r13)
            if (r0 != 0) goto L_0x071f
            if (r15 > r14) goto L_0x071f
            if (r12 > r14) goto L_0x071f
            r10 = r10 & 7
            r0 = r13 & 63
            r13 = r15 & 63
            r12 = r12 & 63
            int r10 = r10 << 18
            int r0 = r0 << 12
            r10 = r10 | r0
            int r0 = r13 << 6
            r10 = r10 | r0
            X.BEB.A0j(r10, r12, r4, r1)
            int r1 = r1 + 2
            goto L_0x01eb
        L_0x0296:
            r0 = 0
            java.lang.String r12 = new java.lang.String
            r12.<init>(r4, r0, r1)
            r6.A02 = r12
            r7 = r9
            goto L_0x02ad
        L_0x02a0:
            if (r4 < 0) goto L_0x073c
            if (r4 == 0) goto L_0x02b1
            java.nio.charset.Charset r0 = X.CI7.A03
            java.lang.String r12 = X.BE6.A0r(r0, r5, r7, r4)
            r6.A02 = r12
            int r7 = r7 + r4
        L_0x02ad:
            r11.putObject(r8, r2, r12)
            goto L_0x030d
        L_0x02b1:
            r6.A02 = r12
            goto L_0x02ad
        L_0x02b4:
            r0 = 2
            if (r7 != r0) goto L_0x009b
            java.lang.Object r2 = r10.A09(r8, r9)
            X.E9l r1 = r10.A07(r9)
            r0 = r6
            r3 = r5
            r5 = r37
            int r7 = A00(r0, r1, r2, r3, r4, r5)
            r0 = r13[r28]
            r0 = r0 & r26
            long r0 = (long) r0
            r11.putObject(r8, r0, r2)
            r10.A0C(r8, r9)
            goto L_0x030d
        L_0x02d3:
            r0 = 2
            if (r7 != r0) goto L_0x009b
            int r7 = A02(r6, r5, r4)
            java.lang.Object r0 = r6.A02
            r11.putObject(r8, r2, r0)
            goto L_0x030d
        L_0x02e0:
            if (r7 != 0) goto L_0x009b
            int r7 = A03(r6, r5, r4)
            int r1 = r6.A00
            goto L_0x02f7
        L_0x02e9:
            if (r7 != 0) goto L_0x009b
            int r7 = A03(r6, r5, r4)
            int r1 = r6.A00
            r0 = r1 & 1
            int r1 = r1 >>> 1
            int r0 = -r0
            r1 = r1 ^ r0
        L_0x02f7:
            r11.putInt(r8, r2, r1)
            goto L_0x030d
        L_0x02fb:
            if (r7 != 0) goto L_0x009b
            int r7 = A04(r6, r5, r4)
            long r0 = r6.A01
            long r0 = X.BEA.A0H(r0)
        L_0x0307:
            r12 = r8
            r13 = r2
            r15 = r0
            r11.putLong(r12, r13, r15)
        L_0x030d:
            r18 = r18 | r22
            goto L_0x06f2
        L_0x0311:
            r0 = 27
            if (r1 != r0) goto L_0x0362
            r0 = 2
            if (r7 != r0) goto L_0x059d
            java.lang.Object r1 = r11.getObject(r8, r2)
            X.EE6 r1 = (X.EE6) r1
            r0 = r1
            X.DbJ r0 = (X.C27290DbJ) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0330
            int r0 = X.BEA.A0B(r1)
            X.EE6 r1 = r1.CTV(r0)
            r11.putObject(r8, r2, r1)
        L_0x0330:
            X.E9l r9 = r10.A07(r9)
            r2 = r21
        L_0x0336:
            X.BeH r0 = r9.CTU()
            r21 = r6
            r24 = r5
            r26 = r37
            r22 = r9
            r23 = r0
            r25 = r4
            int r7 = A00(r21, r22, r23, r24, r25, r26)
            r9.CTb(r0)
            r6.A02 = r0
            r1.add(r0)
            r0 = r37
            if (r7 >= r0) goto L_0x06f4
            int r4 = A03(r6, r5, r7)
            int r3 = r6.A00
            r0 = r17
            if (r0 == r3) goto L_0x0336
            goto L_0x06f4
        L_0x0362:
            r0 = 49
            if (r1 > r0) goto L_0x058e
            long r13 = (long) r14
            java.lang.Object r0 = r11.getObject(r8, r2)
            X.EE6 r0 = (X.EE6) r0
            r1 = r0
            X.DbJ r1 = (X.C27290DbJ) r1
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x037f
            int r1 = X.BEA.A0B(r0)
            X.EE6 r0 = r0.CTV(r1)
            r11.putObject(r8, r2, r0)
        L_0x037f:
            switch(r27) {
                case 18: goto L_0x03dc;
                case 19: goto L_0x03f6;
                case 20: goto L_0x0410;
                case 21: goto L_0x0410;
                case 22: goto L_0x03be;
                case 23: goto L_0x0433;
                case 24: goto L_0x044c;
                case 25: goto L_0x0465;
                case 26: goto L_0x0483;
                case 27: goto L_0x0382;
                case 28: goto L_0x04e2;
                case 29: goto L_0x03be;
                case 30: goto L_0x0562;
                case 31: goto L_0x044c;
                case 32: goto L_0x0433;
                case 33: goto L_0x0523;
                case 34: goto L_0x0541;
                case 35: goto L_0x03dc;
                case 36: goto L_0x03f6;
                case 37: goto L_0x0410;
                case 38: goto L_0x0410;
                case 39: goto L_0x03be;
                case 40: goto L_0x0433;
                case 41: goto L_0x044c;
                case 42: goto L_0x0465;
                case 43: goto L_0x03be;
                case 44: goto L_0x0562;
                case 45: goto L_0x044c;
                case 46: goto L_0x0433;
                case 47: goto L_0x0523;
                case 48: goto L_0x0541;
                default: goto L_0x0382;
            }
        L_0x0382:
            r12 = r9
            r1 = 3
            if (r7 != r1) goto L_0x0581
            X.E9l r3 = r10.A07(r9)
            r1 = r17 & -8
            r28 = r1 | 4
            r26 = r4
        L_0x0390:
            X.BeH r2 = r3.CTU()
            r1 = r3
            X.DJP r1 = (X.DJP) r1
            r23 = r6
            r25 = r5
            r27 = r37
            r24 = r2
            r22 = r1
            int r7 = r22.A0G(r23, r24, r25, r26, r27, r28)
            r6.A02 = r2
            r3.CTb(r2)
            r6.A02 = r2
            r0.add(r2)
            r1 = r37
            if (r7 >= r1) goto L_0x0589
            int r26 = A03(r6, r5, r7)
            int r2 = r6.A00
            r1 = r17
            if (r1 != r2) goto L_0x0589
            goto L_0x0390
        L_0x03be:
            r0 = 2
            if (r7 != r0) goto L_0x0576
            int r7 = A03(r6, r5, r4)
            int r0 = r6.A00
            int r0 = r0 + r7
            if (r7 >= r0) goto L_0x03d2
            A03(r6, r5, r7)
            java.lang.NullPointerException r1 = A08()
            throw r1
        L_0x03d2:
            if (r7 == r0) goto L_0x0587
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxL r1 = new X.BxL
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x03dc:
            r12 = r9
            r0 = 2
            if (r7 != r0) goto L_0x03ee
            int r7 = A03(r6, r5, r4)
            int r0 = r6.A00
            int r0 = r0 + r7
            if (r7 >= r0) goto L_0x0425
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x03ee:
            r0 = 1
            if (r7 != r0) goto L_0x0581
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x03f6:
            r12 = r9
            r0 = 2
            if (r7 != r0) goto L_0x0408
            int r7 = A03(r6, r5, r4)
            int r0 = r6.A00
            int r0 = r0 + r7
            if (r7 >= r0) goto L_0x0425
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x0408:
            r0 = 5
            if (r7 != r0) goto L_0x0581
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x0410:
            r12 = r9
            r0 = 2
            if (r7 != r0) goto L_0x0429
            int r7 = A03(r6, r5, r4)
            int r0 = r6.A00
            int r0 = r0 + r7
            if (r7 >= r0) goto L_0x0425
            A04(r6, r5, r7)
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x0425:
            if (r7 != r0) goto L_0x0754
            goto L_0x0589
        L_0x0429:
            if (r7 != 0) goto L_0x0581
            A04(r6, r5, r4)
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x0433:
            r0 = 2
            if (r7 != r0) goto L_0x0444
            int r7 = A03(r6, r5, r4)
            int r0 = r6.A00
            int r0 = r0 + r7
            if (r7 >= r0) goto L_0x0555
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x0444:
            r0 = 1
            if (r7 != r0) goto L_0x0580
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x044c:
            r0 = 2
            if (r7 != r0) goto L_0x045d
            int r7 = A03(r6, r5, r4)
            int r0 = r6.A00
            int r0 = r0 + r7
            if (r7 >= r0) goto L_0x0555
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x045d:
            r0 = 5
            if (r7 != r0) goto L_0x0580
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x0465:
            r0 = 2
            if (r7 != r0) goto L_0x0479
            int r7 = A03(r6, r5, r4)
            int r0 = r6.A00
            int r0 = r0 + r7
            if (r7 >= r0) goto L_0x0555
            A04(r6, r5, r7)
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x0479:
            if (r7 != 0) goto L_0x0580
            A04(r6, r5, r4)
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x0483:
            r1 = 2
            if (r7 != r1) goto L_0x0580
            r1 = 536870912(0x20000000, double:2.652494739E-315)
            long r13 = r13 & r1
            int r1 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            int r7 = A03(r6, r5, r4)
            if (r1 != 0) goto L_0x04cc
        L_0x0492:
            int r2 = r6.A00
            if (r2 < 0) goto L_0x073c
            if (r2 != 0) goto L_0x04ae
            r0.add(r12)
        L_0x049b:
            r1 = r37
            if (r7 >= r1) goto L_0x0587
            int r3 = A03(r6, r5, r7)
            int r2 = r6.A00
            r1 = r17
            if (r1 != r2) goto L_0x0587
            int r7 = A03(r6, r5, r3)
            goto L_0x0492
        L_0x04ae:
            java.nio.charset.Charset r1 = X.CI7.A03
            X.BE8.A1H(r1, r0, r5, r7, r2)
            int r7 = r7 + r2
            goto L_0x049b
        L_0x04b5:
            if (r3 != 0) goto L_0x04d1
            r0.add(r12)
        L_0x04ba:
            r1 = r37
            if (r7 >= r1) goto L_0x0587
            int r3 = A03(r6, r5, r7)
            int r2 = r6.A00
            r1 = r17
            if (r1 != r2) goto L_0x0587
            int r7 = A03(r6, r5, r3)
        L_0x04cc:
            int r3 = r6.A00
            if (r3 < 0) goto L_0x073c
            goto L_0x04b5
        L_0x04d1:
            int r2 = r7 + r3
            X.CUi r1 = X.CF4.A00
            boolean r1 = r1.A00(r5, r7, r2)
            if (r1 == 0) goto L_0x0764
            java.nio.charset.Charset r1 = X.CI7.A03
            X.BE8.A1H(r1, r0, r5, r7, r3)
            r7 = r2
            goto L_0x04ba
        L_0x04e2:
            r1 = 2
            if (r7 != r1) goto L_0x0580
            int r7 = A03(r6, r5, r4)
            int r3 = r6.A00
            if (r3 < 0) goto L_0x074c
            int r9 = r5.length
        L_0x04ee:
            int r1 = r9 - r7
            if (r3 > r1) goto L_0x0744
            if (r3 != 0) goto L_0x0510
            X.DSN r1 = X.DSN.A00
            r0.add(r1)
        L_0x04f9:
            r1 = r37
            if (r7 >= r1) goto L_0x0587
            int r3 = A03(r6, r5, r7)
            int r2 = r6.A00
            r1 = r17
            if (r1 != r2) goto L_0x0587
            int r7 = A03(r6, r5, r3)
            int r3 = r6.A00
            if (r3 < 0) goto L_0x074c
            goto L_0x04ee
        L_0x0510:
            int r1 = r7 + r3
            X.DSN.A00(r7, r1, r9)
            byte[] r2 = X.BE7.A1Z(r5, r3, r7)
            X.BeL r1 = new X.BeL
            r1.<init>(r2)
            r0.add(r1)
            int r7 = r7 + r3
            goto L_0x04f9
        L_0x0523:
            r0 = 2
            if (r7 != r0) goto L_0x0537
            int r7 = A03(r6, r5, r4)
            int r0 = r6.A00
            int r0 = r0 + r7
            if (r7 >= r0) goto L_0x0555
            A03(r6, r5, r7)
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x0537:
            if (r7 != 0) goto L_0x0580
            A03(r6, r5, r4)
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x0541:
            r0 = 2
            if (r7 != r0) goto L_0x0558
            int r7 = A03(r6, r5, r4)
            int r0 = r6.A00
            int r0 = r0 + r7
            if (r7 >= r0) goto L_0x0555
            A04(r6, r5, r7)
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x0555:
            if (r7 != r0) goto L_0x0754
            goto L_0x0587
        L_0x0558:
            if (r7 != 0) goto L_0x0580
            A04(r6, r5, r4)
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x0562:
            r0 = 2
            if (r7 != r0) goto L_0x0576
            int r7 = A03(r6, r5, r4)
            int r0 = r6.A00
            int r0 = r0 + r7
            if (r7 >= r0) goto L_0x0583
            A03(r6, r5, r7)
            java.lang.NullPointerException r1 = A08()
            throw r1
        L_0x0576:
            if (r7 != 0) goto L_0x0580
            A03(r6, r5, r4)
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x0580:
            r12 = r9
        L_0x0581:
            r7 = r4
            goto L_0x0589
        L_0x0583:
            if (r7 != r0) goto L_0x075c
            X.CB6 r0 = X.C25451Cg2.A01
        L_0x0587:
            r12 = r20
        L_0x0589:
            if (r7 != r4) goto L_0x06f2
            r4 = r7
            goto L_0x009d
        L_0x058e:
            r0 = 50
            if (r1 != r0) goto L_0x008b
            r0 = 2
            if (r7 != r0) goto L_0x059d
            r11.getObject(r8, r2)
            java.lang.NullPointerException r0 = A08()
            throw r0
        L_0x059d:
            r12 = r9
            goto L_0x009d
        L_0x05a0:
            r0 = 1
            if (r7 != r0) goto L_0x0097
            long r0 = X.BEB.A0E(r5, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x05e5
        L_0x05b0:
            r0 = 5
            if (r7 != r0) goto L_0x0097
            int r0 = X.BEB.A09(r5, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x05f7
        L_0x05c0:
            if (r7 != 0) goto L_0x0097
            int r7 = A04(r6, r5, r4)
            long r0 = r6.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0610
        L_0x05cd:
            if (r7 != 0) goto L_0x0097
            int r7 = A03(r6, r5, r4)
            int r0 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0610
        L_0x05da:
            r0 = 1
            if (r7 != r0) goto L_0x0097
            long r0 = X.BEB.A0E(r5, r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x05e5:
            r11.putObject(r8, r2, r0)
            int r7 = r4 + 8
            goto L_0x0695
        L_0x05ec:
            r0 = 5
            if (r7 != r0) goto L_0x0097
            int r0 = X.BEB.A09(r5, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x05f7:
            r11.putObject(r8, r2, r0)
            int r7 = r4 + 4
            goto L_0x0695
        L_0x05fe:
            if (r7 != 0) goto L_0x0097
            int r7 = A04(r6, r5, r4)
            long r0 = r6.A01
            int r9 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0610:
            r11.putObject(r8, r2, r0)
            goto L_0x0695
        L_0x0615:
            r0 = 2
            if (r7 != r0) goto L_0x0097
            int r7 = A03(r6, r5, r4)
            int r9 = r6.A00
            if (r9 != 0) goto L_0x0624
            r11.putObject(r8, r2, r12)
            goto L_0x0695
        L_0x0624:
            r14 = r14 & r25
            if (r14 == 0) goto L_0x0632
            int r1 = r7 + r9
            X.CUi r0 = X.CF4.A00
            boolean r0 = r0.A00(r5, r7, r1)
            if (r0 == 0) goto L_0x0764
        L_0x0632:
            java.nio.charset.Charset r0 = X.CI7.A03
            java.lang.String r0 = X.BE6.A0r(r0, r5, r7, r9)
            r11.putObject(r8, r2, r0)
            int r7 = r7 + r9
            goto L_0x0695
        L_0x063d:
            r0 = 2
            if (r7 != r0) goto L_0x0097
            r0 = r21
            java.lang.Object r2 = r10.A0A(r8, r0, r9)
            X.E9l r31 = r10.A07(r9)
            r30 = r6
            r33 = r5
            r35 = r37
            r32 = r2
            r34 = r4
            int r7 = A00(r30, r31, r32, r33, r34, r35)
            goto L_0x06c3
        L_0x0659:
            r0 = 2
            if (r7 != r0) goto L_0x0097
            int r7 = A02(r6, r5, r4)
            java.lang.Object r0 = r6.A02
            r11.putObject(r8, r2, r0)
            goto L_0x0695
        L_0x0666:
            if (r7 != 0) goto L_0x0097
            int r7 = A03(r6, r5, r4)
            int r1 = r6.A00
            goto L_0x067d
        L_0x066f:
            if (r7 != 0) goto L_0x0097
            int r7 = A03(r6, r5, r4)
            int r1 = r6.A00
            r0 = r1 & 1
            int r1 = r1 >>> 1
            int r0 = -r0
            r1 = r1 ^ r0
        L_0x067d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0692
        L_0x0682:
            if (r7 != 0) goto L_0x0097
            int r7 = A04(r6, r5, r4)
            long r0 = r6.A01
            long r0 = X.BEA.A0H(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0692:
            r11.putObject(r8, r2, r0)
        L_0x0695:
            r0 = r30
            r2 = r21
            r11.putInt(r8, r0, r2)
            goto L_0x0098
        L_0x069e:
            r0 = 3
            if (r7 != r0) goto L_0x0097
            r0 = r21
            java.lang.Object r2 = r10.A0A(r8, r0, r9)
            r0 = r17 & -8
            r36 = r0 | 4
            X.E9l r0 = r10.A07(r9)
            X.DJP r0 = (X.DJP) r0
            r31 = r6
            r33 = r5
            r35 = r37
            r30 = r0
            r32 = r2
            r34 = r4
            int r7 = r30.A0G(r31, r32, r33, r34, r35, r36)
            r6.A02 = r2
        L_0x06c3:
            r0 = r13[r28]
            r0 = r0 & r26
            long r0 = (long) r0
            r11.putObject(r8, r0, r2)
            r0 = r13[r15]
            r0 = r0 & r26
            long r0 = (long) r0
            r2 = r21
            X.C26291Cwy.A07(r8, r0, r2)
            goto L_0x0098
        L_0x06d7:
            r2 = r8
            X.BeH r2 = (X.C23267BeH) r2
            X.Csz r1 = r2.zzc
            X.Csz r0 = X.C26136Csz.A04
            if (r1 != r0) goto L_0x06e6
            X.Csz r1 = X.C26136Csz.A00()
            r2.zzc = r1
        L_0x06e6:
            r0 = r6
            r2 = r5
            r5 = r37
            r3 = r17
            int r7 = A01(r0, r1, r2, r3, r4, r5)
            r20 = r12
        L_0x06f2:
            r2 = r21
        L_0x06f4:
            r12 = 0
            goto L_0x0017
        L_0x06f7:
            r0 = r37
            if (r44 != 0) goto L_0x06fe
            if (r7 != r0) goto L_0x0707
            return r7
        L_0x06fe:
            if (r7 > r0) goto L_0x0707
            r1 = r29
            r0 = r17
            if (r0 != r1) goto L_0x0707
            return r7
        L_0x0707:
            java.lang.String r0 = "Failed to parse the message."
            X.BxL r1 = new X.BxL
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x070f:
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.BxL r0 = new X.BxL
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0717:
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.BxL r0 = new X.BxL
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x071f:
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.BxL r0 = new X.BxL
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0727:
            r0 = 0
            java.lang.Object[] r1 = X.AnonymousClass8BR.A1a()
            X.C17880vN.A1T(r1, r9, r0)
            X.AnonymousClass000.A1M(r1, r7)
            X.AnonymousClass3Ma.A1S(r1, r4)
            java.lang.String r0 = "buffer length=%d, index=%d, size=%d"
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BE8.A0U(r0, r1)
            throw r0
        L_0x073c:
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            X.BxL r1 = new X.BxL
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0744:
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxL r0 = new X.BxL
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x074c:
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            X.BxL r0 = new X.BxL
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0754:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxL r1 = new X.BxL
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x075c:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxL r1 = new X.BxL
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0764:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.BxL r1 = new X.BxL
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x076c:
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Mutating immutable message: "
            java.lang.String r0 = r0.concat(r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DJP.A0G(X.CiA, java.lang.Object, byte[], int, int, int):int");
    }

    public final C23267BeH CTU() {
        return new C23273BeN();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r3 = r8.getObject(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (A0D(r3) != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        r0 = r6.CTU();
        r6.CTd(r0, r3);
        r8.putObject(r10, r1, r0);
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b3, code lost:
        r6.CTd(r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c8, code lost:
        X.C26291Cwy.A09(r10, r11, X.C26291Cwy.A02(r4, r11));
        X.C26291Cwy.A07(r10, X.BE9.A0O(r3, r5), r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CTd(java.lang.Object r16, java.lang.Object r17) {
        /*
            r15 = this;
            r10 = r16
            boolean r0 = A0D(r10)
            if (r0 == 0) goto L_0x020b
            r4 = r17
            if (r17 == 0) goto L_0x0209
            r5 = 0
        L_0x000d:
            int[] r3 = r15.A00
            int r0 = r3.length
            if (r5 >= r0) goto L_0x0205
            int r0 = r5 + 1
            r0 = r3[r0]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            r2 = r3[r5]
            int r0 = r0 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r11 = (long) r1
            switch(r0) {
                case 0: goto L_0x00b8;
                case 1: goto L_0x00c8;
                case 2: goto L_0x010e;
                case 3: goto L_0x010e;
                case 4: goto L_0x0100;
                case 5: goto L_0x010e;
                case 6: goto L_0x0100;
                case 7: goto L_0x00d8;
                case 8: goto L_0x00f2;
                case 9: goto L_0x0027;
                case 10: goto L_0x00f2;
                case 11: goto L_0x0100;
                case 12: goto L_0x0100;
                case 13: goto L_0x0100;
                case 14: goto L_0x010e;
                case 15: goto L_0x0100;
                case 16: goto L_0x010e;
                case 17: goto L_0x0027;
                case 18: goto L_0x0120;
                case 19: goto L_0x0120;
                case 20: goto L_0x0120;
                case 21: goto L_0x0120;
                case 22: goto L_0x0120;
                case 23: goto L_0x0120;
                case 24: goto L_0x0120;
                case 25: goto L_0x0120;
                case 26: goto L_0x0120;
                case 27: goto L_0x0120;
                case 28: goto L_0x0120;
                case 29: goto L_0x0120;
                case 30: goto L_0x0120;
                case 31: goto L_0x0120;
                case 32: goto L_0x0120;
                case 33: goto L_0x0120;
                case 34: goto L_0x0120;
                case 35: goto L_0x0120;
                case 36: goto L_0x0120;
                case 37: goto L_0x0120;
                case 38: goto L_0x0120;
                case 39: goto L_0x0120;
                case 40: goto L_0x0120;
                case 41: goto L_0x0120;
                case 42: goto L_0x0120;
                case 43: goto L_0x0120;
                case 44: goto L_0x0120;
                case 45: goto L_0x0120;
                case 46: goto L_0x0120;
                case 47: goto L_0x0120;
                case 48: goto L_0x0120;
                case 49: goto L_0x0120;
                case 50: goto L_0x01d8;
                case 51: goto L_0x01bb;
                case 52: goto L_0x01bb;
                case 53: goto L_0x01bb;
                case 54: goto L_0x01bb;
                case 55: goto L_0x01bb;
                case 56: goto L_0x01bb;
                case 57: goto L_0x01bb;
                case 58: goto L_0x01bb;
                case 59: goto L_0x01bb;
                case 60: goto L_0x005f;
                case 61: goto L_0x01c2;
                case 62: goto L_0x01c2;
                case 63: goto L_0x01c2;
                case 64: goto L_0x01c2;
                case 65: goto L_0x01c2;
                case 66: goto L_0x01c2;
                case 67: goto L_0x01c2;
                case 68: goto L_0x005f;
                default: goto L_0x0024;
            }
        L_0x0024:
            int r5 = r5 + 3
            goto L_0x000d
        L_0x0027:
            boolean r0 = r15.A0E(r4, r5)
            if (r0 == 0) goto L_0x0024
            int r0 = r5 + 1
            r1 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            sun.misc.Unsafe r8 = A0D
            long r1 = (long) r1
            java.lang.Object r7 = r8.getObject(r4, r1)
            if (r7 == 0) goto L_0x01e7
            X.E9l r6 = r15.A07(r5)
            boolean r0 = r15.A0E(r10, r5)
            if (r0 != 0) goto L_0x009e
            boolean r0 = A0D(r7)
            if (r0 != 0) goto L_0x0053
            r8.putObject(r10, r1, r7)
            goto L_0x011b
        L_0x0053:
            X.BeH r0 = r6.CTU()
            r6.CTd(r0, r7)
            r8.putObject(r10, r1, r0)
            goto L_0x011b
        L_0x005f:
            r9 = r3[r5]
            boolean r0 = r15.A0F(r4, r9, r5)
            if (r0 == 0) goto L_0x0024
            int r0 = r5 + 1
            r1 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            sun.misc.Unsafe r8 = A0D
            long r1 = (long) r1
            java.lang.Object r7 = r8.getObject(r4, r1)
            if (r7 == 0) goto L_0x01f6
            X.E9l r6 = r15.A07(r5)
            boolean r0 = r15.A0F(r10, r9, r5)
            if (r0 != 0) goto L_0x009e
            boolean r0 = A0D(r7)
            if (r0 != 0) goto L_0x0093
            r8.putObject(r10, r1, r7)
        L_0x008b:
            long r0 = X.BE9.A0O(r3, r5)
            X.C26291Cwy.A07(r10, r0, r9)
            goto L_0x0024
        L_0x0093:
            X.BeH r0 = r6.CTU()
            r6.CTd(r0, r7)
            r8.putObject(r10, r1, r0)
            goto L_0x008b
        L_0x009e:
            java.lang.Object r3 = r8.getObject(r10, r1)
            boolean r0 = A0D(r3)
            if (r0 != 0) goto L_0x00b3
            X.BeH r0 = r6.CTU()
            r6.CTd(r0, r3)
            r8.putObject(r10, r1, r0)
            r3 = r0
        L_0x00b3:
            r6.CTd(r3, r7)
            goto L_0x0024
        L_0x00b8:
            boolean r0 = r15.A0E(r4, r5)
            if (r0 == 0) goto L_0x0024
            X.Cbi r9 = X.C26291Cwy.A00
            double r13 = r9.A00(r4, r11)
            r9.A02(r10, r11, r13)
            goto L_0x011b
        L_0x00c8:
            boolean r0 = r15.A0E(r4, r5)
            if (r0 == 0) goto L_0x0024
            X.Cbi r1 = X.C26291Cwy.A00
            float r0 = r1.A01(r4, r11)
            r1.A03(r10, r11, r0)
            goto L_0x011b
        L_0x00d8:
            boolean r0 = r15.A0E(r4, r5)
            if (r0 == 0) goto L_0x0024
            boolean r0 = X.C26291Cwy.A02
            if (r0 == 0) goto L_0x00ea
            boolean r0 = X.AnonymousClass000.A1O((byte) (X.BEA.A06(r11 ^ -1, X.C26291Cwy.A00.A00.getInt(r4, -4 & r11)) & 255))
            X.C26291Cwy.A0A(r10, r11, r0)
            goto L_0x011b
        L_0x00ea:
            boolean r0 = X.AnonymousClass000.A1O((byte) (X.BEA.A06(r11, X.C26291Cwy.A00.A00.getInt(r4, -4 & r11)) & 255))
            X.C26291Cwy.A0B(r10, r11, r0)
            goto L_0x011b
        L_0x00f2:
            boolean r0 = r15.A0E(r4, r5)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = X.C26291Cwy.A02(r4, r11)
            X.C26291Cwy.A09(r10, r11, r0)
            goto L_0x011b
        L_0x0100:
            boolean r0 = r15.A0E(r4, r5)
            if (r0 == 0) goto L_0x0024
            int r0 = X.C26291Cwy.A00(r4, r11)
            X.C26291Cwy.A07(r10, r11, r0)
            goto L_0x011b
        L_0x010e:
            boolean r0 = r15.A0E(r4, r5)
            if (r0 == 0) goto L_0x0024
            long r0 = X.C26291Cwy.A01(r4, r11)
            X.C26291Cwy.A08(r10, r11, r0)
        L_0x011b:
            r15.A0C(r10, r5)
            goto L_0x0024
        L_0x0120:
            X.CH2 r0 = r15.A06
            boolean r0 = r0 instanceof X.C23274BeO
            if (r0 == 0) goto L_0x0153
            java.lang.Object r6 = X.C26291Cwy.A02(r10, r11)
            X.EE6 r6 = (X.EE6) r6
            java.lang.Object r3 = X.C26291Cwy.A02(r4, r11)
            java.util.List r3 = (java.util.List) r3
            int r2 = r6.size()
            int r1 = r3.size()
            if (r2 <= 0) goto L_0x014e
            if (r1 <= 0) goto L_0x014d
            r0 = r6
            X.DbJ r0 = (X.C27290DbJ) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x014a
            int r1 = r1 + r2
            X.EE6 r6 = r6.CTV(r1)
        L_0x014a:
            r6.addAll(r3)
        L_0x014d:
            r3 = r6
        L_0x014e:
            X.C26291Cwy.A09(r10, r11, r3)
            goto L_0x0024
        L_0x0153:
            java.lang.Object r3 = X.C26291Cwy.A02(r4, r11)
            java.util.List r3 = (java.util.List) r3
            int r1 = r3.size()
            java.lang.Object r2 = X.C26291Cwy.A02(r10, r11)
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x018f
            boolean r0 = r2 instanceof X.EE1
            if (r0 == 0) goto L_0x018a
            X.BeI r2 = new X.BeI
            r2.<init>((int) r1)
        L_0x0172:
            X.C26291Cwy.A09(r10, r11, r2)
        L_0x0175:
            int r1 = r2.size()
            int r0 = r3.size()
            if (r1 <= 0) goto L_0x0185
            if (r0 <= 0) goto L_0x0184
            r2.addAll(r3)
        L_0x0184:
            r3 = r2
        L_0x0185:
            X.C26291Cwy.A09(r10, r11, r3)
            goto L_0x0024
        L_0x018a:
            java.util.ArrayList r2 = X.C17880vN.A0z(r1)
            goto L_0x0172
        L_0x018f:
            java.lang.Class r0 = X.C23275BeP.A00
            boolean r0 = X.BE7.A1W(r0, r2)
            if (r0 == 0) goto L_0x01a3
            java.util.ArrayList r1 = X.BE9.A0y(r2, r1)
            r1.addAll(r2)
        L_0x019e:
            X.C26291Cwy.A09(r10, r11, r1)
            r2 = r1
            goto L_0x0175
        L_0x01a3:
            boolean r0 = r2 instanceof X.C27291DbK
            if (r0 == 0) goto L_0x0175
            X.EE1 r0 = X.C23268BeI.A01
            int r0 = r2.size()
            int r0 = r0 + r1
            X.BeI r1 = new X.BeI
            r1.<init>((int) r0)
            int r0 = r1.size()
            r1.addAll(r0, r2)
            goto L_0x019e
        L_0x01bb:
            boolean r0 = r15.A0F(r4, r2, r5)
            if (r0 == 0) goto L_0x0024
            goto L_0x01c8
        L_0x01c2:
            boolean r0 = r15.A0F(r4, r2, r5)
            if (r0 == 0) goto L_0x0024
        L_0x01c8:
            java.lang.Object r0 = X.C26291Cwy.A02(r4, r11)
            X.C26291Cwy.A09(r10, r11, r0)
            long r0 = X.BE9.A0O(r3, r5)
            X.C26291Cwy.A07(r10, r0, r2)
            goto L_0x0024
        L_0x01d8:
            X.CB6 r0 = X.C25451Cg2.A01
            X.C26291Cwy.A02(r10, r11)
            X.C26291Cwy.A02(r4, r11)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01e7:
            r0 = r3[r5]
            java.lang.String r1 = r4.toString()
            java.lang.StringBuilder r0 = X.BEA.A0q(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r1, r0)
            throw r0
        L_0x01f6:
            r0 = r3[r5]
            java.lang.String r1 = r4.toString()
            java.lang.StringBuilder r0 = X.BEA.A0q(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r1, r0)
            throw r0
        L_0x0205:
            X.C25451Cg2.A00(r10, r4)
            return
        L_0x0209:
            r0 = 0
            throw r0
        L_0x020b:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Mutating immutable message: "
            java.lang.String r0 = r0.concat(r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DJP.CTd(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (r4 != r0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009e, code lost:
        if (r8 != r1) goto L_0x00e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CTg(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            int[] r7 = r11.A00
            int r6 = r7.length
            r10 = 0
            r5 = 0
        L_0x0005:
            if (r5 >= r6) goto L_0x00d3
            int r0 = r5 + 1
            r0 = r7[r0]
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r0 & r4
            int r0 = r0 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r2 = (long) r1
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0038;
                case 2: goto L_0x008a;
                case 3: goto L_0x008a;
                case 4: goto L_0x0075;
                case 5: goto L_0x008a;
                case 6: goto L_0x0075;
                case 7: goto L_0x0055;
                case 8: goto L_0x00a2;
                case 9: goto L_0x00a2;
                case 10: goto L_0x00a2;
                case 11: goto L_0x0075;
                case 12: goto L_0x0075;
                case 13: goto L_0x0075;
                case 14: goto L_0x008a;
                case 15: goto L_0x0075;
                case 16: goto L_0x008a;
                case 17: goto L_0x00a2;
                case 18: goto L_0x00bd;
                case 19: goto L_0x00bd;
                case 20: goto L_0x00bd;
                case 21: goto L_0x00bd;
                case 22: goto L_0x00bd;
                case 23: goto L_0x00bd;
                case 24: goto L_0x00bd;
                case 25: goto L_0x00bd;
                case 26: goto L_0x00bd;
                case 27: goto L_0x00bd;
                case 28: goto L_0x00bd;
                case 29: goto L_0x00bd;
                case 30: goto L_0x00bd;
                case 31: goto L_0x00bd;
                case 32: goto L_0x00bd;
                case 33: goto L_0x00bd;
                case 34: goto L_0x00bd;
                case 35: goto L_0x00bd;
                case 36: goto L_0x00bd;
                case 37: goto L_0x00bd;
                case 38: goto L_0x00bd;
                case 39: goto L_0x00bd;
                case 40: goto L_0x00bd;
                case 41: goto L_0x00bd;
                case 42: goto L_0x00bd;
                case 43: goto L_0x00bd;
                case 44: goto L_0x00bd;
                case 45: goto L_0x00bd;
                case 46: goto L_0x00bd;
                case 47: goto L_0x00bd;
                case 48: goto L_0x00bd;
                case 49: goto L_0x00bd;
                case 50: goto L_0x00bd;
                case 51: goto L_0x00ad;
                case 52: goto L_0x00ad;
                case 53: goto L_0x00ad;
                case 54: goto L_0x00ad;
                case 55: goto L_0x00ad;
                case 56: goto L_0x00ad;
                case 57: goto L_0x00ad;
                case 58: goto L_0x00ad;
                case 59: goto L_0x00ad;
                case 60: goto L_0x00ad;
                case 61: goto L_0x00ad;
                case 62: goto L_0x00ad;
                case 63: goto L_0x00ad;
                case 64: goto L_0x00ad;
                case 65: goto L_0x00ad;
                case 66: goto L_0x00ad;
                case 67: goto L_0x00ad;
                case 68: goto L_0x00ad;
                default: goto L_0x0018;
            }
        L_0x0018:
            int r5 = r5 + 3
            goto L_0x0005
        L_0x001b:
            boolean r1 = r11.A0E(r12, r5)
            boolean r0 = r11.A0E(r13, r5)
            if (r1 != r0) goto L_0x00e3
            X.Cbi r4 = X.C26291Cwy.A00
            double r0 = r4.A00(r12, r2)
            long r8 = java.lang.Double.doubleToLongBits(r0)
            double r0 = r4.A00(r13, r2)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x009c
        L_0x0038:
            boolean r1 = r11.A0E(r12, r5)
            boolean r0 = r11.A0E(r13, r5)
            if (r1 != r0) goto L_0x00e3
            X.Cbi r1 = X.C26291Cwy.A00
            float r0 = r1.A01(r12, r2)
            int r4 = java.lang.Float.floatToIntBits(r0)
            float r0 = r1.A01(r13, r2)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0087
        L_0x0055:
            boolean r1 = r11.A0E(r12, r5)
            boolean r0 = r11.A0E(r13, r5)
            if (r1 != r0) goto L_0x00e3
            boolean r0 = X.C26291Cwy.A02
            if (r0 == 0) goto L_0x006c
            boolean r4 = X.AnonymousClass000.A1O((byte) (X.BEA.A06(r2 ^ -1, X.C26291Cwy.A00.A00.getInt(r12, -4 & r2)) & 255))
            boolean r0 = X.AnonymousClass000.A1O((byte) (X.BEA.A06(r2 ^ -1, X.C26291Cwy.A00.A00.getInt(r13, -4 & r2)) & 255))
            goto L_0x0087
        L_0x006c:
            boolean r4 = X.AnonymousClass000.A1O((byte) (X.BEA.A06(r2, X.C26291Cwy.A00.A00.getInt(r12, -4 & r2)) & 255))
            boolean r0 = X.AnonymousClass000.A1O((byte) (X.BEA.A06(r2, X.C26291Cwy.A00.A00.getInt(r13, -4 & r2)) & 255))
            goto L_0x0087
        L_0x0075:
            boolean r1 = r11.A0E(r12, r5)
            boolean r0 = r11.A0E(r13, r5)
            if (r1 != r0) goto L_0x00e3
            int r4 = X.C26291Cwy.A00(r12, r2)
            int r0 = X.C26291Cwy.A00(r13, r2)
        L_0x0087:
            if (r4 != r0) goto L_0x00e3
            goto L_0x0018
        L_0x008a:
            boolean r1 = r11.A0E(r12, r5)
            boolean r0 = r11.A0E(r13, r5)
            if (r1 != r0) goto L_0x00e3
            long r8 = X.C26291Cwy.A01(r12, r2)
            long r1 = X.C26291Cwy.A01(r13, r2)
        L_0x009c:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00e3
            goto L_0x0018
        L_0x00a2:
            boolean r1 = r11.A0E(r12, r5)
            boolean r0 = r11.A0E(r13, r5)
            if (r1 != r0) goto L_0x00e3
            goto L_0x00bd
        L_0x00ad:
            int r0 = r5 + 2
            r0 = r7[r0]
            r0 = r0 & r4
            long r0 = (long) r0
            int r4 = X.C26291Cwy.A00(r12, r0)
            int r0 = X.C26291Cwy.A00(r13, r0)
            if (r4 != r0) goto L_0x00e3
        L_0x00bd:
            java.lang.Object r4 = X.C26291Cwy.A02(r12, r2)
            java.lang.Object r1 = X.C26291Cwy.A02(r13, r2)
            X.CB6 r0 = X.C25451Cg2.A01
            if (r4 == r1) goto L_0x0018
            if (r4 == 0) goto L_0x00e3
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x00e3
            goto L_0x0018
        L_0x00d3:
            X.BeH r12 = (X.C23267BeH) r12
            X.Csz r1 = r12.zzc
            X.BeH r13 = (X.C23267BeH) r13
            X.Csz r0 = r13.zzc
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e3
            r0 = 1
            return r0
        L_0x00e3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DJP.CTg(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        r2 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c8, code lost:
        r0 = X.CI7.A02;
        r0 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        if (r1 == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ce, code lost:
        r0 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        r7 = r7 * 53;
        r0 = ((java.lang.String) X.C26291Cwy.A02(r11, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0114, code lost:
        r7 = r7 * 53;
        r0 = X.AnonymousClass000.A0M(X.C26291Cwy.A02(r11, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0125, code lost:
        r7 = r7 * 53;
        r2 = X.C17880vN.A05(X.C26291Cwy.A02(r11, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012f, code lost:
        r0 = X.CI7.A02;
        r0 = (int) (r2 ^ (r2 >>> 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013c, code lost:
        r7 = r7 * 53;
        r0 = X.C26291Cwy.A02(r11, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0146, code lost:
        r7 = r7 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r11) {
        /*
            r10 = this;
            int[] r6 = r10.A00
            int r5 = r6.length
            r4 = 0
            r7 = 0
        L_0x0005:
            if (r4 >= r5) goto L_0x0149
            int r0 = r4 + 1
            r0 = r6[r0]
            r9 = r6[r4]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            int r0 = r0 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r1 = (long) r1
            r3 = 37
            r8 = 32
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0029;
                case 2: goto L_0x0051;
                case 3: goto L_0x0051;
                case 4: goto L_0x0049;
                case 5: goto L_0x0051;
                case 6: goto L_0x0049;
                case 7: goto L_0x0037;
                case 8: goto L_0x00d7;
                case 9: goto L_0x0059;
                case 10: goto L_0x013c;
                case 11: goto L_0x0049;
                case 12: goto L_0x0049;
                case 13: goto L_0x0049;
                case 14: goto L_0x0051;
                case 15: goto L_0x0049;
                case 16: goto L_0x0051;
                case 17: goto L_0x0059;
                case 18: goto L_0x013c;
                case 19: goto L_0x013c;
                case 20: goto L_0x013c;
                case 21: goto L_0x013c;
                case 22: goto L_0x013c;
                case 23: goto L_0x013c;
                case 24: goto L_0x013c;
                case 25: goto L_0x013c;
                case 26: goto L_0x013c;
                case 27: goto L_0x013c;
                case 28: goto L_0x013c;
                case 29: goto L_0x013c;
                case 30: goto L_0x013c;
                case 31: goto L_0x013c;
                case 32: goto L_0x013c;
                case 33: goto L_0x013c;
                case 34: goto L_0x013c;
                case 35: goto L_0x013c;
                case 36: goto L_0x013c;
                case 37: goto L_0x013c;
                case 38: goto L_0x013c;
                case 39: goto L_0x013c;
                case 40: goto L_0x013c;
                case 41: goto L_0x013c;
                case 42: goto L_0x013c;
                case 43: goto L_0x013c;
                case 44: goto L_0x013c;
                case 45: goto L_0x013c;
                case 46: goto L_0x013c;
                case 47: goto L_0x013c;
                case 48: goto L_0x013c;
                case 49: goto L_0x013c;
                case 50: goto L_0x013c;
                case 51: goto L_0x0067;
                case 52: goto L_0x007d;
                case 53: goto L_0x0093;
                case 54: goto L_0x009b;
                case 55: goto L_0x00a3;
                case 56: goto L_0x00aa;
                case 57: goto L_0x00b1;
                case 58: goto L_0x00b8;
                case 59: goto L_0x00d1;
                case 60: goto L_0x00e4;
                case 61: goto L_0x00eb;
                case 62: goto L_0x00f2;
                case 63: goto L_0x00f9;
                case 64: goto L_0x0100;
                case 65: goto L_0x0107;
                case 66: goto L_0x010e;
                case 67: goto L_0x011f;
                case 68: goto L_0x0136;
                default: goto L_0x001d;
            }
        L_0x001d:
            int r4 = r4 + 3
            goto L_0x0005
        L_0x0020:
            int r7 = r7 * 53
            X.Cbi r0 = X.C26291Cwy.A00
            double r0 = r0.A00(r11, r1)
            goto L_0x0077
        L_0x0029:
            int r7 = r7 * 53
            X.Cbi r0 = X.C26291Cwy.A00
            float r0 = r0.A01(r11, r1)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0146
        L_0x0037:
            int r7 = r7 * 53
            boolean r0 = X.C26291Cwy.A02
            if (r0 == 0) goto L_0x0043
            boolean r1 = X.AnonymousClass000.A1O((byte) (X.BEA.A06(r1 ^ -1, X.C26291Cwy.A00.A00.getInt(r11, -4 & r1)) & 255))
            goto L_0x00c8
        L_0x0043:
            boolean r1 = X.AnonymousClass000.A1O((byte) (X.BEA.A06(r1, X.C26291Cwy.A00.A00.getInt(r11, -4 & r1)) & 255))
            goto L_0x00c8
        L_0x0049:
            int r7 = r7 * 53
            int r0 = X.C26291Cwy.A00(r11, r1)
            goto L_0x0146
        L_0x0051:
            int r7 = r7 * 53
            long r2 = X.C26291Cwy.A01(r11, r1)
            goto L_0x012f
        L_0x0059:
            java.lang.Object r0 = X.C26291Cwy.A02(r11, r1)
            if (r0 == 0) goto L_0x0063
            int r3 = r0.hashCode()
        L_0x0063:
            int r7 = r7 * 53
            int r7 = r7 + r3
            goto L_0x001d
        L_0x0067:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            int r7 = r7 * 53
            java.lang.Object r0 = X.C26291Cwy.A02(r11, r1)
            double r0 = X.AnonymousClass8BR.A00(r0)
        L_0x0077:
            long r2 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x012f
        L_0x007d:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            int r7 = r7 * 53
            java.lang.Object r0 = X.C26291Cwy.A02(r11, r1)
            float r0 = X.AnonymousClass000.A04(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0146
        L_0x0093:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x0125
        L_0x009b:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x0125
        L_0x00a3:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x0114
        L_0x00aa:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x0125
        L_0x00b1:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x0114
        L_0x00b8:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            int r7 = r7 * 53
            java.lang.Object r0 = X.C26291Cwy.A02(r11, r1)
            boolean r1 = X.AnonymousClass000.A1Y(r0)
        L_0x00c8:
            java.nio.charset.Charset r0 = X.CI7.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0146
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L_0x0146
        L_0x00d1:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
        L_0x00d7:
            int r7 = r7 * 53
            java.lang.Object r0 = X.C26291Cwy.A02(r11, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x0146
        L_0x00e4:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x013c
        L_0x00eb:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x013c
        L_0x00f2:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x0114
        L_0x00f9:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x0114
        L_0x0100:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x0114
        L_0x0107:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
            goto L_0x0125
        L_0x010e:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
        L_0x0114:
            int r7 = r7 * 53
            java.lang.Object r0 = X.C26291Cwy.A02(r11, r1)
            int r0 = X.AnonymousClass000.A0M(r0)
            goto L_0x0146
        L_0x011f:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
        L_0x0125:
            int r7 = r7 * 53
            java.lang.Object r0 = X.C26291Cwy.A02(r11, r1)
            long r2 = X.C17880vN.A05(r0)
        L_0x012f:
            java.nio.charset.Charset r0 = X.CI7.A02
            long r0 = r2 >>> r8
            long r2 = r2 ^ r0
            int r0 = (int) r2
            goto L_0x0146
        L_0x0136:
            boolean r0 = r10.A0F(r11, r9, r4)
            if (r0 == 0) goto L_0x001d
        L_0x013c:
            java.lang.Object r0 = X.C26291Cwy.A02(r11, r1)
            int r7 = r7 * 53
            int r0 = r0.hashCode()
        L_0x0146:
            int r7 = r7 + r0
            goto L_0x001d
        L_0x0149:
            int r1 = r7 * 53
            X.BeH r11 = (X.C23267BeH) r11
            X.Csz r0 = r11.zzc
            int r0 = X.AnonymousClass000.A0O(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DJP.zza(java.lang.Object):int");
    }

    public static int A02(C25571CiA ciA, byte[] bArr, int i) {
        int A032 = A03(ciA, bArr, i);
        int i2 = ciA.A00;
        if (i2 >= 0) {
            int length = bArr.length;
            if (i2 > length - A032) {
                throw new C24209BxL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } else if (i2 == 0) {
                ciA.A02 = DSN.A00;
                return A032;
            } else {
                DSN.A00(A032, A032 + i2, length);
                ciA.A02 = new C23271BeL(BE7.A1Z(bArr, i2, A032));
                return A032 + i2;
            }
        } else {
            throw new C24209BxL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    private final Object A09(Object obj, int i) {
        E9l A072 = A07(i);
        int i2 = this.A00[i + 1] & 1048575;
        if (!A0E(obj, i)) {
            return A072.CTU();
        }
        Object object = A0D.getObject(obj, (long) i2);
        if (A0D(object)) {
            return object;
        }
        C23267BeH CTU = A072.CTU();
        if (object != null) {
            A072.CTd(CTU, object);
        }
        return CTU;
    }

    private final Object A0A(Object obj, int i, int i2) {
        E9l A072 = A07(i2);
        if (!A0F(obj, i, i2)) {
            return A072.CTU();
        }
        Object object = A0D.getObject(obj, BE9.A0N(this.A00, i2));
        if (A0D(object)) {
            return object;
        }
        C23267BeH CTU = A072.CTU();
        if (object != null) {
            A072.CTd(CTU, object);
        }
        return CTU;
    }

    public static Field A0B(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder A10 = AnonymousClass000.A10();
            BEA.A1S(A10, str);
            A10.append(name);
            throw BEA.A0g(" not found. Known fields are ", arrays, A10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x003f, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CTb(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = A0D(r8)
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r8 instanceof X.C23267BeH
            r6 = 0
            if (r0 == 0) goto L_0x001e
            r2 = r8
            X.BeH r2 = (X.C23267BeH) r2
            int r1 = r2.zzd
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 | r0
            r2.zzd = r1
            r2.zza = r6
            r1 = r1 & r0
            r2.zzd = r1
        L_0x001e:
            int[] r5 = r7.A00
            int r4 = r5.length
        L_0x0021:
            if (r6 >= r4) goto L_0x009f
            int r0 = r6 + 1
            r0 = r5[r0]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            int r0 = r0 >>> 20
            r1 = r0 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r0 = 9
            if (r1 == r0) goto L_0x0084
            r0 = 60
            if (r1 == r0) goto L_0x0089
            r0 = 68
            if (r1 == r0) goto L_0x0089
            switch(r1) {
                case 17: goto L_0x0084;
                case 18: goto L_0x0042;
                case 19: goto L_0x0042;
                case 20: goto L_0x0042;
                case 21: goto L_0x0042;
                case 22: goto L_0x0042;
                case 23: goto L_0x0042;
                case 24: goto L_0x0042;
                case 25: goto L_0x0042;
                case 26: goto L_0x0042;
                case 27: goto L_0x0042;
                case 28: goto L_0x0042;
                case 29: goto L_0x0042;
                case 30: goto L_0x0042;
                case 31: goto L_0x0042;
                case 32: goto L_0x0042;
                case 33: goto L_0x0042;
                case 34: goto L_0x0042;
                case 35: goto L_0x0042;
                case 36: goto L_0x0042;
                case 37: goto L_0x0042;
                case 38: goto L_0x0042;
                case 39: goto L_0x0042;
                case 40: goto L_0x0042;
                case 41: goto L_0x0042;
                case 42: goto L_0x0042;
                case 43: goto L_0x0042;
                case 44: goto L_0x0042;
                case 45: goto L_0x0042;
                case 46: goto L_0x0042;
                case 47: goto L_0x0042;
                case 48: goto L_0x0042;
                case 49: goto L_0x0042;
                case 50: goto L_0x0075;
                default: goto L_0x003f;
            }
        L_0x003f:
            int r6 = r6 + 3
            goto L_0x0021
        L_0x0042:
            X.CH2 r0 = r7.A06
            boolean r0 = r0 instanceof X.C23274BeO
            java.lang.Object r1 = X.C26291Cwy.A02(r8, r2)
            if (r0 == 0) goto L_0x0058
            X.EE6 r1 = (X.EE6) r1
            X.DbJ r1 = (X.C27290DbJ) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x003f
            r0 = 0
            r1.A00 = r0
            goto L_0x003f
        L_0x0058:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1 instanceof X.EE1
            if (r0 == 0) goto L_0x0068
            X.EE1 r1 = (X.EE1) r1
            X.EE1 r0 = r1.CTZ()
        L_0x0064:
            X.C26291Cwy.A09(r8, r2, r0)
            goto L_0x003f
        L_0x0068:
            java.lang.Class r0 = X.C23275BeP.A00
            boolean r0 = X.BE7.A1W(r0, r1)
            if (r0 != 0) goto L_0x003f
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L_0x0064
        L_0x0075:
            sun.misc.Unsafe r0 = A0D
            java.lang.Object r0 = r0.getObject(r8, r2)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "zzc"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0084:
            boolean r0 = r7.A0E(r8, r6)
            goto L_0x008f
        L_0x0089:
            r0 = r5[r6]
            boolean r0 = r7.A0F(r8, r0, r6)
        L_0x008f:
            if (r0 == 0) goto L_0x003f
            X.E9l r1 = r7.A07(r6)
            sun.misc.Unsafe r0 = A0D
            java.lang.Object r0 = r0.getObject(r8, r2)
            r1.CTb(r0)
            goto L_0x003f
        L_0x009f:
            X.BeH r8 = (X.C23267BeH) r8
            X.Csz r1 = r8.zzc
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x00aa
            r0 = 0
            r1.A01 = r0
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DJP.CTb(java.lang.Object):void");
    }
}
