package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

public final class DKD implements EAD {
    public static final Unsafe A0E = C26277CwW.A05();
    public static final int[] A0F = new int[0];
    public final int A00;
    public final int A01;
    public final E28 A02;
    public final int[] A03;
    public final Object[] A04;
    public final int A05;
    public final int A06;
    public final CBH A07;
    public final CHJ A08;
    public final C28663EDa A09;
    public final E2A A0A;
    public final CBJ A0B;
    public final boolean A0C;
    public final int[] A0D;

    public static int A03(C25572CiB ciB, EAD ead, byte[] bArr, int i, int i2, int i3) {
        DKD dkd = (DKD) ead;
        Object CT0 = dkd.CT0();
        int A0R = dkd.A0R(ciB, CT0, bArr, i, i2, i3);
        dkd.CTR(CT0);
        ciB.A02 = CT0;
        return A0R;
    }

    public static int A04(C25572CiB ciB, C25840Cmu cmu, byte[] bArr, int i, int i2, int i3) {
        Object bhH;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            C25572CiB ciB2 = ciB;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A082 = A08(ciB, bArr, i2);
                cmu.A01(i, Long.valueOf(ciB.A01));
                return A082;
            } else if (i5 == 1) {
                cmu.A01(i, Long.valueOf(BEB.A0G(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A072 = A07(ciB, bArr, i2);
                int i6 = ciB.A00;
                if (i6 >= 0) {
                    int length = bArr.length;
                    if (i6 <= length - A072) {
                        if (i6 == 0) {
                            bhH = DSO.A00;
                        } else {
                            DSO.A00(A072, A072 + i6, length);
                            bhH = new C23452BhH(DSO.A01.CT6(bArr, A072, i6));
                        }
                        cmu.A01(i, bhH);
                        return A072 + i6;
                    }
                    throw new C24204BxG("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                throw new C24204BxG("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            } else if (i5 == 3) {
                C25840Cmu cmu2 = new C25840Cmu();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A07(ciB2, bArr, i4);
                    i8 = ciB2.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A04(ciB2, cmu2, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw new C24204BxG("Failed to parse the message.");
                }
                cmu.A01(i, cmu2);
                return i4;
            } else if (i5 == 5) {
                cmu.A01(i, Integer.valueOf(BEB.A08(bArr, i2)));
                return i2 + 4;
            }
        }
        throw new C24204BxG("Protocol message contained an invalid tag (zero).");
    }

    private final int A00(int i) {
        if (i >= this.A00 && i <= this.A01) {
            int i2 = 0;
            int[] iArr = this.A03;
            int length = (iArr.length / 3) - 1;
            while (i2 <= length) {
                int i3 = (length + i2) >>> 1;
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                if (i == i5) {
                    return i4;
                }
                if (i < i5) {
                    length = i3 - 1;
                } else {
                    i2 = i3 + 1;
                }
            }
        }
        return -1;
    }

    public static int A01(int i, int i2, int i3) {
        return i3 + (i2 * C23450BhF.A00(i << 3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.C25572CiB r6, X.EAD r7, byte[] r8, int r9, int r10) {
        /*
            int r5 = r9 + 1
            r4 = r8
            byte r0 = r8[r9]
            r2 = r6
            if (r0 >= 0) goto L_0x0010
            int r5 = A0C(r6, r8, r0, r5)
            int r0 = r6.A00
            if (r0 < 0) goto L_0x0023
        L_0x0010:
            int r10 = r10 - r5
            if (r0 > r10) goto L_0x0023
            r1 = r7
            java.lang.Object r3 = r7.CT0()
            int r6 = r5 + r0
            r1.CT8(r2, r3, r4, r5, r6)
            r7.CTR(r3)
            r2.A02 = r3
            return r6
        L_0x0023:
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxG r0 = new X.BxG
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKD.A02(X.CiB, X.EAD, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        r6.putObject(r8, r0, r4);
        r7 = r25 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        r6.putObject(r8, r0, r4);
        r7 = r25 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0179, code lost:
        r6.putObject(r8, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017c, code lost:
        r6.putInt(r8, r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017f, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A05(X.C25572CiB r22, java.lang.Object r23, byte[] r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, long r33) {
        /*
            r21 = this;
            r7 = r25
            sun.misc.Unsafe r6 = A0E
            r9 = r21
            int[] r0 = r9.A03
            r12 = r32
            long r2 = X.BE9.A0O(r0, r12)
            r5 = 5
            r4 = 2
            r11 = r22
            r10 = r24
            r17 = r26
            r15 = r27
            r14 = r28
            r13 = r29
            r0 = r33
            r8 = r23
            switch(r31) {
                case 51: goto L_0x0024;
                case 52: goto L_0x0034;
                case 53: goto L_0x0043;
                case 54: goto L_0x0043;
                case 55: goto L_0x0051;
                case 56: goto L_0x005f;
                case 57: goto L_0x0071;
                case 58: goto L_0x0082;
                case 59: goto L_0x0098;
                case 60: goto L_0x00cd;
                case 61: goto L_0x00f3;
                case 62: goto L_0x0051;
                case 63: goto L_0x00ff;
                case 64: goto L_0x0071;
                case 65: goto L_0x005f;
                case 66: goto L_0x012f;
                case 67: goto L_0x0140;
                case 68: goto L_0x0151;
                default: goto L_0x0023;
            }
        L_0x0023:
            return r7
        L_0x0024:
            r4 = 1
            if (r13 != r4) goto L_0x0023
            long r4 = X.BEB.A0G(r10, r7)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            goto L_0x006a
        L_0x0034:
            if (r13 != r5) goto L_0x0023
            int r4 = X.BEB.A08(r10, r7)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x007b
        L_0x0043:
            if (r29 != 0) goto L_0x0023
            int r7 = A08(r11, r10, r7)
            long r4 = r11.A01
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0179
        L_0x0051:
            if (r29 != 0) goto L_0x0023
            int r7 = A07(r11, r10, r7)
            int r4 = r11.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0179
        L_0x005f:
            r4 = 1
            if (r13 != r4) goto L_0x0023
            long r4 = X.BEB.A0G(r10, r7)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L_0x006a:
            r6.putObject(r8, r0, r4)
            int r7 = r25 + 8
            goto L_0x017c
        L_0x0071:
            if (r13 != r5) goto L_0x0023
            int r4 = X.BEB.A08(r10, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x007b:
            r6.putObject(r8, r0, r4)
            int r7 = r25 + 4
            goto L_0x017c
        L_0x0082:
            if (r29 != 0) goto L_0x0023
            int r7 = A08(r11, r10, r7)
            long r4 = r11.A01
            r10 = 0
            int r9 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1O(r9)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x0179
        L_0x0098:
            if (r13 != r4) goto L_0x0023
            int r7 = A07(r11, r10, r7)
            int r9 = r11.A00
            if (r9 != 0) goto L_0x00a9
            java.lang.String r4 = ""
            r6.putObject(r8, r0, r4)
            goto L_0x017c
        L_0x00a9:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r30 = r30 & r4
            if (r30 == 0) goto L_0x00c1
            int r5 = r7 + r9
            X.C6H r4 = X.C25406Cf8.A00
            int r4 = r4.A01(r10, r7, r5)
            if (r4 == 0) goto L_0x00c1
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.BxG r0 = new X.BxG
            r0.<init>(r1)
            throw r0
        L_0x00c1:
            java.nio.charset.Charset r4 = X.C25462CgF.A00
            java.lang.String r4 = X.BE6.A0r(r4, r10, r7, r9)
            r6.putObject(r8, r0, r4)
            int r7 = r7 + r9
            goto L_0x017c
        L_0x00cd:
            if (r13 != r4) goto L_0x0023
            X.EAD r5 = r9.A0H(r12)
            r4 = r17
            int r7 = A02(r11, r5, r10, r7, r4)
            int r4 = r6.getInt(r8, r2)
            if (r4 != r14) goto L_0x00f0
            java.lang.Object r5 = r6.getObject(r8, r0)
            if (r5 == 0) goto L_0x00f0
            java.lang.Object r4 = r11.A02
            X.Bho r4 = X.C25462CgF.A00(r5, r4)
        L_0x00eb:
            r6.putObject(r8, r0, r4)
            goto L_0x017c
        L_0x00f0:
            java.lang.Object r4 = r11.A02
            goto L_0x00eb
        L_0x00f3:
            if (r13 != r4) goto L_0x0023
            int r7 = A0B(r11, r10, r7)
            java.lang.Object r4 = r11.A02
            r6.putObject(r8, r0, r4)
            goto L_0x017c
        L_0x00ff:
            if (r29 != 0) goto L_0x0023
            int r7 = A07(r11, r10, r7)
            int r5 = r11.A00
            java.lang.Object[] r9 = r9.A04
            int r4 = r32 / 3
            int r4 = r4 << 1
            int r4 = r4 + 1
            r4 = r9[r4]
            X.E5T r4 = (X.E5T) r4
            if (r4 == 0) goto L_0x0127
            boolean r4 = r4.zza(r5)
            if (r4 != 0) goto L_0x0127
            X.Cmu r1 = A0I(r8)
            java.lang.Long r0 = X.C17880vN.A0n(r5)
            r1.A01(r15, r0)
            return r7
        L_0x0127:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r6.putObject(r8, r0, r4)
            goto L_0x017c
        L_0x012f:
            if (r29 != 0) goto L_0x0023
            int r7 = A07(r11, r10, r7)
            int r4 = r11.A00
            int r4 = X.BE7.A05(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0179
        L_0x0140:
            if (r29 != 0) goto L_0x0023
            int r7 = A08(r11, r10, r7)
            long r4 = r11.A01
            long r4 = X.BEA.A0G(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0179
        L_0x0151:
            r4 = 3
            if (r13 != r4) goto L_0x0023
            r4 = r27 & -8
            r20 = r4 | 4
            X.EAD r16 = r9.A0H(r12)
            r19 = r17
            r17 = r10
            r18 = r7
            r15 = r11
            int r7 = A03(r15, r16, r17, r18, r19, r20)
            int r4 = r6.getInt(r8, r2)
            if (r4 != r14) goto L_0x0180
            java.lang.Object r5 = r6.getObject(r8, r0)
            if (r5 == 0) goto L_0x0180
            java.lang.Object r4 = r11.A02
            X.Bho r4 = X.C25462CgF.A00(r5, r4)
        L_0x0179:
            r6.putObject(r8, r0, r4)
        L_0x017c:
            r6.putInt(r8, r2, r14)
            return r7
        L_0x0180:
            java.lang.Object r4 = r11.A02
            r6.putObject(r8, r0, r4)
            goto L_0x017c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKD.A05(X.CiB, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0251, code lost:
        throw new X.C24204BxG("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02e3, code lost:
        if (r8 == r0) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02e5, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x032a, code lost:
        if (r8 != r1) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x032c, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0334, code lost:
        throw new X.C24204BxG("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x033c, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A06(X.C25572CiB r20, java.lang.Object r21, byte[] r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, long r30, long r32) {
        /*
            r19 = this;
            r7 = r21
            r4 = r23
            sun.misc.Unsafe r8 = A0E
            r0 = r32
            java.lang.Object r3 = r8.getObject(r7, r0)
            X.EE8 r3 = (X.EE8) r3
            r2 = r3
            X.DbN r2 = (X.C27294DbN) r2
            boolean r5 = r2.A00
            r2 = 1
            if (r5 != 0) goto L_0x0027
            int r6 = r3.size()
            int r5 = r6 << r2
            if (r6 != 0) goto L_0x0020
            r5 = 10
        L_0x0020:
            X.EE8 r3 = r3.CSz(r5)
            r8.putObject(r7, r0, r3)
        L_0x0027:
            r8 = 5
            r11 = 0
            r1 = 2
            r0 = r19
            r13 = r20
            r15 = r22
            r6 = r24
            r5 = r25
            r9 = r27
            r10 = r28
            switch(r29) {
                case 18: goto L_0x031a;
                case 19: goto L_0x0303;
                case 20: goto L_0x02e6;
                case 21: goto L_0x02e6;
                case 22: goto L_0x02a6;
                case 23: goto L_0x003c;
                case 24: goto L_0x0277;
                case 25: goto L_0x025a;
                case 26: goto L_0x01f1;
                case 27: goto L_0x01d3;
                case 28: goto L_0x0195;
                case 29: goto L_0x02a6;
                case 30: goto L_0x00ce;
                case 31: goto L_0x0277;
                case 32: goto L_0x003c;
                case 33: goto L_0x0093;
                case 34: goto L_0x0076;
                case 35: goto L_0x031a;
                case 36: goto L_0x0303;
                case 37: goto L_0x02e6;
                case 38: goto L_0x02e6;
                case 39: goto L_0x02a6;
                case 40: goto L_0x003c;
                case 41: goto L_0x0277;
                case 42: goto L_0x025a;
                case 43: goto L_0x02a6;
                case 44: goto L_0x00ce;
                case 45: goto L_0x0277;
                case 46: goto L_0x003c;
                case 47: goto L_0x0093;
                case 48: goto L_0x0076;
                case 49: goto L_0x0053;
                default: goto L_0x003c;
            }
        L_0x003c:
            if (r9 != r1) goto L_0x004c
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
            if (r8 >= r1) goto L_0x032a
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        L_0x004c:
            if (r9 != r2) goto L_0x033c
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        L_0x0053:
            r1 = 3
            if (r9 != r1) goto L_0x033c
            X.EAD r14 = r0.A0H(r10)
            r0 = r25 & -8
            r18 = r0 | 4
            r16 = r4
        L_0x0060:
            r17 = r6
            int r4 = A03(r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r13.A02
            r3.add(r0)
            if (r4 >= r6) goto L_0x033c
            int r16 = A07(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x033c
            goto L_0x0060
        L_0x0076:
            if (r9 != r1) goto L_0x0089
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
            if (r8 >= r1) goto L_0x032a
            A08(r13, r15, r8)
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        L_0x0089:
            if (r27 != 0) goto L_0x033c
            A08(r13, r15, r4)
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        L_0x0093:
            if (r9 != r1) goto L_0x00ae
            X.BhC r3 = (X.C23447BhC) r3
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
        L_0x009e:
            if (r8 >= r1) goto L_0x032a
            int r8 = A07(r13, r15, r8)
            int r0 = r13.A00
            int r0 = X.BE7.A05(r0)
            r3.A02(r0)
            goto L_0x009e
        L_0x00ae:
            if (r27 != 0) goto L_0x033c
            X.BhC r3 = (X.C23447BhC) r3
            int r8 = A07(r13, r15, r4)
        L_0x00b6:
            int r0 = r13.A00
            int r0 = X.BE7.A05(r0)
            r3.A02(r0)
            if (r8 >= r6) goto L_0x02e5
            int r1 = A07(r13, r15, r8)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02e5
            int r8 = A07(r13, r15, r1)
            goto L_0x00b6
        L_0x00ce:
            if (r9 != r1) goto L_0x00f0
            r5 = r3
            X.BhC r5 = (X.C23447BhC) r5
            int r8 = A07(r13, r15, r4)
            int r2 = r13.A00
            int r2 = r2 + r8
        L_0x00da:
            if (r8 >= r2) goto L_0x00e6
            int r8 = A07(r13, r15, r8)
            int r1 = r13.A00
            r5.A02(r1)
            goto L_0x00da
        L_0x00e6:
            if (r8 == r2) goto L_0x010d
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxG r0 = new X.BxG
            r0.<init>(r1)
            throw r0
        L_0x00f0:
            if (r27 != 0) goto L_0x033c
            r9 = r3
            X.BhC r9 = (X.C23447BhC) r9
            int r8 = A07(r13, r15, r4)
        L_0x00f9:
            int r1 = r13.A00
            r9.A02(r1)
            if (r8 >= r6) goto L_0x010d
            int r2 = A07(r13, r15, r8)
            int r1 = r13.A00
            if (r5 != r1) goto L_0x010d
            int r8 = A07(r13, r15, r2)
            goto L_0x00f9
        L_0x010d:
            X.Bho r7 = (X.C23484Bho) r7
            X.Cmu r5 = r7.zzb
            X.Cmu r1 = X.C25840Cmu.A05
            if (r5 != r1) goto L_0x0116
            r5 = 0
        L_0x0116:
            java.lang.Object[] r1 = r0.A04
            int r0 = r28 / 3
            int r0 = r0 << 1
            int r0 = r0 + 1
            r6 = r1[r0]
            X.E5T r6 = (X.E5T) r6
            java.lang.Class r0 = X.C26301CxE.A03
            if (r6 == 0) goto L_0x0190
            boolean r0 = r3 instanceof java.util.RandomAccess
            if (r0 == 0) goto L_0x015e
            int r10 = r3.size()
            r9 = 0
            r4 = 0
        L_0x0130:
            if (r9 >= r10) goto L_0x0187
            java.lang.Object r2 = r3.get(r9)
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            boolean r0 = r6.zza(r1)
            if (r0 == 0) goto L_0x014c
            if (r9 == r4) goto L_0x0147
            r3.set(r4, r2)
        L_0x0147:
            int r4 = r4 + 1
        L_0x0149:
            int r9 = r9 + 1
            goto L_0x0130
        L_0x014c:
            if (r5 != 0) goto L_0x0153
            X.Cmu r5 = new X.Cmu
            r5.<init>()
        L_0x0153:
            long r0 = (long) r1
            int r2 = r26 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A01(r2, r0)
            goto L_0x0149
        L_0x015e:
            java.util.Iterator r4 = r3.iterator()
        L_0x0162:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0190
            int r1 = X.C72453Mb.A0H(r4)
            boolean r0 = r6.zza(r1)
            if (r0 != 0) goto L_0x0162
            if (r5 != 0) goto L_0x0179
            X.Cmu r5 = new X.Cmu
            r5.<init>()
        L_0x0179:
            long r2 = (long) r1
            int r1 = r26 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A01(r1, r0)
            r4.remove()
            goto L_0x0162
        L_0x0187:
            if (r4 == r10) goto L_0x0190
            java.util.List r0 = r3.subList(r4, r10)
            r0.clear()
        L_0x0190:
            if (r5 == 0) goto L_0x02e5
            r7.zzb = r5
            return r8
        L_0x0195:
            if (r9 != r1) goto L_0x033c
            int r8 = A07(r13, r15, r4)
            int r4 = r13.A00
            if (r4 < 0) goto L_0x024a
            int r2 = r15.length
        L_0x01a0:
            int r0 = r2 - r8
            if (r4 > r0) goto L_0x032d
            if (r4 != 0) goto L_0x01be
            X.DSO r0 = X.DSO.A00
            r3.add(r0)
        L_0x01ab:
            if (r8 >= r6) goto L_0x02e5
            int r1 = A07(r13, r15, r8)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02e5
            int r8 = A07(r13, r15, r1)
            int r4 = r13.A00
            if (r4 < 0) goto L_0x024a
            goto L_0x01a0
        L_0x01be:
            int r0 = r8 + r4
            X.DSO.A00(r8, r0, r2)
            X.E5S r0 = X.DSO.A01
            byte[] r1 = r0.CT6(r15, r8, r4)
            X.BhH r0 = new X.BhH
            r0.<init>(r1)
            r3.add(r0)
            int r8 = r8 + r4
            goto L_0x01ab
        L_0x01d3:
            if (r9 != r1) goto L_0x033c
            X.EAD r2 = r0.A0H(r10)
            int r8 = A02(r13, r2, r15, r4, r6)
        L_0x01dd:
            java.lang.Object r0 = r13.A02
            r3.add(r0)
            if (r8 >= r6) goto L_0x02e5
            int r1 = A07(r13, r15, r8)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02e5
            int r8 = A02(r13, r2, r15, r1, r6)
            goto L_0x01dd
        L_0x01f1:
            if (r9 != r1) goto L_0x033c
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r30 = r30 & r0
            java.lang.String r7 = ""
            int r0 = (r30 > r11 ? 1 : (r30 == r11 ? 0 : -1))
            int r4 = A07(r13, r15, r4)
            if (r0 != 0) goto L_0x0234
        L_0x0202:
            int r1 = r13.A00
            if (r1 < 0) goto L_0x024a
            if (r1 != 0) goto L_0x021a
            r3.add(r7)
        L_0x020b:
            if (r4 >= r6) goto L_0x033c
            int r1 = A07(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x033c
            int r4 = A07(r13, r15, r1)
            goto L_0x0202
        L_0x021a:
            java.nio.charset.Charset r0 = X.C25462CgF.A00
            X.BE8.A1H(r0, r3, r15, r4, r1)
            int r4 = r4 + r1
            goto L_0x020b
        L_0x0221:
            if (r2 != 0) goto L_0x0239
            r3.add(r7)
        L_0x0226:
            if (r4 >= r6) goto L_0x033c
            int r1 = A07(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x033c
            int r4 = A07(r13, r15, r1)
        L_0x0234:
            int r2 = r13.A00
            if (r2 < 0) goto L_0x024a
            goto L_0x0221
        L_0x0239:
            int r1 = r4 + r2
            X.C6H r0 = X.C25406Cf8.A00
            int r0 = r0.A01(r15, r4, r1)
            if (r0 != 0) goto L_0x0252
            java.nio.charset.Charset r0 = X.C25462CgF.A00
            X.BE8.A1H(r0, r3, r15, r4, r2)
            int r4 = r4 + r2
            goto L_0x0226
        L_0x024a:
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            X.BxG r0 = new X.BxG
            r0.<init>(r1)
            throw r0
        L_0x0252:
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.BxG r0 = new X.BxG
            r0.<init>(r1)
            throw r0
        L_0x025a:
            if (r9 != r1) goto L_0x026d
            int r8 = A07(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r8
            if (r8 >= r0) goto L_0x02e3
            A08(r13, r15, r8)
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        L_0x026d:
            if (r27 != 0) goto L_0x033c
            A08(r13, r15, r4)
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        L_0x0277:
            if (r9 != r1) goto L_0x028e
            X.BhC r3 = (X.C23447BhC) r3
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
        L_0x0282:
            if (r8 >= r1) goto L_0x032a
            int r0 = X.BEB.A08(r15, r8)
            r3.A02(r0)
            int r8 = r8 + 4
            goto L_0x0282
        L_0x028e:
            if (r9 != r8) goto L_0x033c
            X.BhC r3 = (X.C23447BhC) r3
        L_0x0292:
            int r0 = X.BEB.A08(r15, r4)
            r3.A02(r0)
            int r8 = r4 + 4
            if (r8 >= r6) goto L_0x02e5
            int r4 = A07(r13, r15, r8)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02e5
            goto L_0x0292
        L_0x02a6:
            if (r9 != r1) goto L_0x02c7
            X.BhC r3 = (X.C23447BhC) r3
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
        L_0x02b1:
            if (r8 >= r1) goto L_0x02bd
            int r8 = A07(r13, r15, r8)
            int r0 = r13.A00
            r3.A02(r0)
            goto L_0x02b1
        L_0x02bd:
            if (r8 == r1) goto L_0x02e5
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxG r0 = new X.BxG
            r0.<init>(r1)
            throw r0
        L_0x02c7:
            if (r27 != 0) goto L_0x033c
            X.BhC r3 = (X.C23447BhC) r3
            int r8 = A07(r13, r15, r4)
        L_0x02cf:
            int r0 = r13.A00
            r3.A02(r0)
            if (r8 >= r6) goto L_0x02e5
            int r1 = A07(r13, r15, r8)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02e5
            int r8 = A07(r13, r15, r1)
            goto L_0x02cf
        L_0x02e3:
            if (r8 != r0) goto L_0x032d
        L_0x02e5:
            return r8
        L_0x02e6:
            if (r9 != r1) goto L_0x02f9
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
            if (r8 >= r1) goto L_0x032a
            A08(r13, r15, r8)
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        L_0x02f9:
            if (r27 != 0) goto L_0x033c
            A08(r13, r15, r4)
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        L_0x0303:
            if (r9 != r1) goto L_0x0313
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
            if (r8 >= r1) goto L_0x032a
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        L_0x0313:
            if (r9 != r8) goto L_0x033c
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        L_0x031a:
            if (r9 != r1) goto L_0x0335
            int r8 = A07(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r8
            if (r8 >= r1) goto L_0x032a
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        L_0x032a:
            if (r8 != r1) goto L_0x032d
            return r8
        L_0x032d:
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxG r0 = new X.BxG
            r0.<init>(r1)
            throw r0
        L_0x0335:
            if (r9 != r2) goto L_0x033c
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        L_0x033c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKD.A06(X.CiB, java.lang.Object, byte[], int, int, int, int, int, int, int, long, long):int");
    }

    public static int A07(C25572CiB ciB, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A0C(ciB, bArr, b, i2);
        }
        ciB.A00 = b;
        return i2;
    }

    public static int A08(C25572CiB ciB, byte[] bArr, int i) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            ciB.A01 = j;
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
        ciB.A01 = j2;
        return i3;
    }

    public static int A0A(C25572CiB ciB, byte[] bArr, int i) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int A072 = A07(ciB, bArr, i);
        int i8 = ciB.A00;
        if (i8 < 0) {
            throw new C24204BxG("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i8 == 0) {
            ciB.A02 = "";
            return A072;
        } else {
            int i9 = A072;
            boolean z = C25406Cf8.A00 instanceof C23492Bhw;
            int length = bArr.length;
            int i10 = A072 | i8 | ((length - A072) - i8);
            if (z) {
                if (i10 >= 0) {
                    int i11 = A072 + i8;
                    char[] cArr = new char[i8];
                    int i12 = 0;
                    while (i5 < i11) {
                        byte A002 = C26277CwW.A00(bArr, (long) i5);
                        if (A002 < 0) {
                            break;
                        }
                        i9 = i5 + 1;
                        cArr[i6] = (char) A002;
                        i12 = i6 + 1;
                    }
                    while (i5 < i11) {
                        int i13 = i5 + 1;
                        byte A003 = C26277CwW.A00(bArr, (long) i5);
                        if (A003 >= 0) {
                            i7 = i6 + 1;
                            cArr[i6] = (char) A003;
                            while (i13 < i11) {
                                byte A004 = C26277CwW.A00(bArr, (long) i13);
                                if (A004 < 0) {
                                    break;
                                }
                                i13++;
                                cArr[i7] = (char) A004;
                                i7++;
                            }
                            i5 = i13;
                        } else {
                            if (A003 < -32) {
                                if (i13 < i11) {
                                    i5 = i13 + 1;
                                    byte A005 = C26277CwW.A00(bArr, (long) i13);
                                    i7 = i6 + 1;
                                    if (A003 < -62 || A005 > -65) {
                                        throw new C24204BxG("Protocol message had invalid UTF-8.");
                                    }
                                    BE9.A14(A003, A005, cArr, i6);
                                }
                            } else if (A003 < -16) {
                                if (i13 < i11 - 1) {
                                    int i14 = i13 + 1;
                                    i5 = i14 + 1;
                                    i7 = i6 + 1;
                                    CBK.A00(A003, C26277CwW.A00(bArr, (long) i13), C26277CwW.A00(bArr, (long) i14), cArr, i6);
                                }
                            } else if (i13 < i11 - 2) {
                                int i15 = i13 + 1;
                                byte A006 = C26277CwW.A00(bArr, (long) i13);
                                int i16 = i15 + 1;
                                byte A007 = C26277CwW.A00(bArr, (long) i15);
                                i5 = i16 + 1;
                                byte A008 = C26277CwW.A00(bArr, (long) i16);
                                int i17 = i6 + 1;
                                if (A006 > -65 || BE8.A05(A003, A006) != 0 || A007 > -65 || A008 > -65) {
                                    throw new C24204BxG("Protocol message had invalid UTF-8.");
                                }
                                BEB.A0j(((A003 & 7) << 18) | ((A006 & 63) << 12) | ((A007 & 63) << 6), A008 & 63, cArr, i6);
                                i6 = i17 + 1;
                            }
                            throw new C24204BxG("Protocol message had invalid UTF-8.");
                        }
                        i6 = i7;
                    }
                    str = new String(cArr, 0, i6);
                } else {
                    Object[] A1a = AnonymousClass8BR.A1a();
                    BEA.A1V(A1a, length, 0, A072, 1);
                    AnonymousClass3Ma.A1S(A1a, i8);
                    throw BE8.A0U("buffer length=%d, index=%d, size=%d", A1a);
                }
            } else if (i10 >= 0) {
                int i18 = A072 + i8;
                char[] cArr2 = new char[i8];
                int i19 = 0;
                while (i2 < i18) {
                    byte b = bArr[i2];
                    if (b < 0) {
                        break;
                    }
                    i9 = i2 + 1;
                    cArr2[i3] = (char) b;
                    i19 = i3 + 1;
                }
                while (i2 < i18) {
                    int i20 = i2 + 1;
                    byte b2 = bArr[i2];
                    if (b2 >= 0) {
                        int i21 = i3 + 1;
                        cArr2[i3] = (char) b2;
                        while (i20 < i18) {
                            byte b3 = bArr[i20];
                            if (b3 < 0) {
                                break;
                            }
                            i20++;
                            cArr2[i21] = (char) b3;
                            i21++;
                        }
                        i2 = i20;
                        i3 = i21;
                    } else {
                        if (b2 >= -32) {
                            if (b2 < -16) {
                                if (i20 < i18 - 1) {
                                    int i22 = i20 + 1;
                                    i2 = i22 + 1;
                                    i4 = i3 + 1;
                                    CBK.A00(b2, bArr[i20], bArr[i22], cArr2, i3);
                                }
                            } else if (i20 < i18 - 2) {
                                int i23 = i20 + 1;
                                byte b4 = bArr[i20];
                                int i24 = i23 + 1;
                                byte b5 = bArr[i23];
                                i2 = i24 + 1;
                                byte b6 = bArr[i24];
                                int i25 = i3 + 1;
                                if (b4 > -65 || BE8.A05(b2, b4) != 0 || b5 > -65 || b6 > -65) {
                                    throw new C24204BxG("Protocol message had invalid UTF-8.");
                                }
                                BEB.A0j(((b2 & 7) << 18) | ((b4 & 63) << 12) | ((b5 & 63) << 6), b6 & 63, cArr2, i3);
                                i3 = i25 + 1;
                            }
                            throw new C24204BxG("Protocol message had invalid UTF-8.");
                        } else if (i20 < i18) {
                            i2 = i20 + 1;
                            byte b7 = bArr[i20];
                            i4 = i3 + 1;
                            if (b2 < -62 || b7 > -65) {
                                throw new C24204BxG("Protocol message had invalid UTF-8.");
                            }
                            BE9.A14(b2, b7, cArr2, i3);
                        } else {
                            throw new C24204BxG("Protocol message had invalid UTF-8.");
                        }
                        i3 = i4;
                    }
                }
                str = new String(cArr2, 0, i3);
            } else {
                Object[] A1a2 = AnonymousClass8BR.A1a();
                BEA.A1V(A1a2, length, 0, A072, 1);
                AnonymousClass3Ma.A1S(A1a2, i8);
                throw BE8.A0U("buffer length=%d, index=%d, size=%d", A1a2);
            }
            ciB.A02 = str;
            return A072 + i8;
        }
    }

    public static int A0C(C25572CiB ciB, byte[] bArr, int i, int i2) {
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
                        ciB.A00 = i3;
                        return i7;
                    }
                }
            }
            ciB.A00 = i8 | i4;
            return i9;
        }
        i3 = i6 | i5;
        ciB.A00 = i3;
        return i7;
    }

    public static int A0D(Object obj) {
        Class cls = C26301CxE.A03;
        return ((List) obj).size();
    }

    public static int A0E(Object obj, int i) {
        if (obj instanceof DSO) {
            return C23450BhF.A03((DSO) obj, i);
        }
        return C23450BhF.A01(i, (String) obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d9, code lost:
        if (r31 == false) goto L_0x01db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.DKD A0G(X.CBH r32, X.CHJ r33, X.E28 r34, X.E29 r35, X.E2A r36, X.CBJ r37) {
        /*
            r5 = r35
            boolean r0 = r5 instanceof X.DK5
            if (r0 == 0) goto L_0x0373
            X.DK5 r5 = (X.DK5) r5
            int r0 = r5.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 == r1) goto L_0x0010
            r1 = 2
        L_0x0010:
            r0 = 2
            r4 = 0
            r15 = 1
            boolean r31 = X.AnonymousClass000.A1T(r1, r0)
            java.lang.String r14 = r5.A02
            int r27 = r14.length()
            r2 = 1
            char r0 = r14.charAt(r4)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r12) goto L_0x0031
        L_0x0027:
            int r1 = r2 + 1
            char r0 = r14.charAt(r2)
            r2 = r1
            if (r0 < r12) goto L_0x0031
            goto L_0x0027
        L_0x0031:
            int r13 = r2 + 1
            char r3 = r14.charAt(r2)
            if (r3 < r12) goto L_0x0050
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x003d:
            int r1 = r13 + 1
            char r0 = r14.charAt(r13)
            if (r0 < r12) goto L_0x004d
            int r3 = X.BE6.A08(r0, r2, r3)
            int r2 = r2 + 13
            r13 = r1
            goto L_0x003d
        L_0x004d:
            int r0 = r0 << r2
            r3 = r3 | r0
            r13 = r1
        L_0x0050:
            if (r3 != 0) goto L_0x0253
            int[] r16 = A0F
            r0 = 0
            r3 = 0
            r2 = 0
            r7 = 0
            r6 = 0
            r1 = 0
        L_0x005a:
            sun.misc.Unsafe r26 = A0E
            java.lang.Object[] r12 = r5.A03
            X.EDa r5 = r5.A01
            r28 = r5
            java.lang.Class r25 = r28.getClass()
            int r5 = r7 * 3
            int[] r5 = new int[r5]
            r24 = r5
            int r7 = r7 << r15
            java.lang.Object[] r11 = new java.lang.Object[r7]
            int r23 = r1 + r6
            r30 = r23
            r22 = r1
            r21 = 0
            r20 = 0
        L_0x0079:
            r5 = r27
            if (r13 >= r5) goto L_0x0357
            int r5 = r13 + 1
            char r10 = r14.charAt(r13)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r10 < r6) goto L_0x009f
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x008c:
            int r7 = r5 + 1
            char r5 = r14.charAt(r5)
            if (r5 < r6) goto L_0x009c
            int r10 = X.BE6.A08(r5, r8, r10)
            int r8 = r8 + 13
            r5 = r7
            goto L_0x008c
        L_0x009c:
            int r5 = r5 << r8
            r10 = r10 | r5
            r5 = r7
        L_0x009f:
            int r13 = r5 + 1
            char r9 = r14.charAt(r5)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r9 < r6) goto L_0x00c1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x00ae:
            int r8 = r13 + 1
            char r5 = r14.charAt(r13)
            if (r5 < r7) goto L_0x00be
            int r9 = X.BE6.A08(r5, r6, r9)
            int r6 = r6 + 13
            r13 = r8
            goto L_0x00ae
        L_0x00be:
            int r5 = r5 << r6
            r9 = r9 | r5
            r13 = r8
        L_0x00c1:
            r8 = r9 & 255(0xff, float:3.57E-43)
            r5 = r9 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x00cd
            int r5 = r21 + 1
            r16[r21] = r20
            r21 = r5
        L_0x00cd:
            r5 = 51
            if (r8 < r5) goto L_0x0159
            int r17 = r13 + 1
            char r7 = r14.charAt(r13)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r13) goto L_0x00f7
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x00e0:
            int r15 = r17 + 1
            r5 = r17
            char r5 = r14.charAt(r5)
            if (r5 < r13) goto L_0x00f3
            int r7 = X.BE6.A08(r5, r6, r7)
            int r6 = r6 + 13
            r17 = r15
            goto L_0x00e0
        L_0x00f3:
            int r5 = r5 << r6
            r7 = r7 | r5
            r17 = r15
        L_0x00f7:
            int r6 = r8 + -51
            r5 = 9
            if (r6 == r5) goto L_0x0150
            r5 = 17
            if (r6 == r5) goto L_0x0150
            r5 = 12
            if (r6 != r5) goto L_0x010f
            if (r31 != 0) goto L_0x010f
            int r6 = r20 / 3
            r5 = 1
            int r6 = r6 << r5
            int r0 = X.BE7.A0B(r12, r11, r6, r0)
        L_0x010f:
            r5 = 1
        L_0x0110:
            int r7 = r7 << r5
            r6 = r12[r7]
            boolean r5 = r6 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L_0x0145
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
        L_0x0119:
            r5 = r26
            long r5 = r5.objectFieldOffset(r6)
            int r13 = (int) r5
            r19 = r13
            int r7 = r7 + 1
            r6 = r12[r7]
            boolean r5 = r6 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L_0x013a
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
        L_0x012c:
            r5 = r26
            long r5 = r5.objectFieldOffset(r6)
            int r7 = (int) r5
            r18 = r7
            r13 = r17
            r5 = 0
            goto L_0x0222
        L_0x013a:
            java.lang.String r6 = (java.lang.String) r6
            r5 = r25
            java.lang.reflect.Field r6 = A0K(r5, r6)
            r12[r7] = r6
            goto L_0x012c
        L_0x0145:
            java.lang.String r6 = (java.lang.String) r6
            r5 = r25
            java.lang.reflect.Field r6 = A0K(r5, r6)
            r12[r7] = r6
            goto L_0x0119
        L_0x0150:
            int r6 = r20 / 3
            r5 = 1
            int r6 = r6 << r5
            int r0 = X.BE7.A0B(r12, r11, r6, r0)
            goto L_0x0110
        L_0x0159:
            int r15 = r0 + 1
            r5 = r12[r0]
            java.lang.String r5 = (java.lang.String) r5
            r0 = r25
            java.lang.reflect.Field r5 = A0K(r0, r5)
            r0 = 9
            if (r8 == r0) goto L_0x01e5
            r0 = 17
            if (r8 == r0) goto L_0x01e5
            r0 = 27
            if (r8 == r0) goto L_0x01db
            r0 = 49
            if (r8 == r0) goto L_0x01db
            r0 = 12
            if (r8 == r0) goto L_0x01d9
            r0 = 30
            if (r8 == r0) goto L_0x01d9
            r0 = 44
            if (r8 == r0) goto L_0x01d9
            r0 = 50
            if (r8 != r0) goto L_0x01a1
            int r17 = r22 + 1
            r16[r22] = r20
            int r0 = r20 / 3
            int r7 = r0 << 1
            int r0 = r15 + 1
            r6 = r12[r15]
            r11[r7] = r6
            r6 = r9 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x01d6
            int r6 = r20 / 3
            int r6 = r6 << 1
            int r15 = X.BE7.A0B(r12, r11, r6, r0)
            r22 = r17
        L_0x01a1:
            r0 = r26
            long r5 = r0.objectFieldOffset(r5)
            int r0 = (int) r5
            r19 = r0
            r5 = r9 & 4096(0x1000, float:5.74E-42)
            r0 = 4096(0x1000, float:5.74E-42)
            if (r5 != r0) goto L_0x01f5
            r0 = 17
            if (r8 > r0) goto L_0x01f5
            int r0 = r13 + 1
            char r7 = r14.charAt(r13)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r5) goto L_0x0208
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x01c3:
            int r13 = r0 + 1
            char r5 = r14.charAt(r0)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r0) goto L_0x01f2
            int r7 = X.BE6.A08(r5, r6, r7)
            int r6 = r6 + 13
            r0 = r13
            goto L_0x01c3
        L_0x01d6:
            r22 = r17
            goto L_0x01e3
        L_0x01d9:
            if (r31 != 0) goto L_0x01a1
        L_0x01db:
            int r0 = r20 / 3
            int r0 = r0 << 1
            int r0 = X.BE7.A0B(r12, r11, r0, r15)
        L_0x01e3:
            r15 = r0
            goto L_0x01a1
        L_0x01e5:
            int r0 = r20 / 3
            int r0 = r0 << 1
            int r6 = r0 + 1
            java.lang.Class r0 = r5.getType()
            r11[r6] = r0
            goto L_0x01a1
        L_0x01f2:
            int r5 = r5 << r6
            r7 = r7 | r5
            goto L_0x0209
        L_0x01f5:
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r0 = 18
            if (r8 < r0) goto L_0x0221
            r0 = 49
            if (r8 > r0) goto L_0x0221
            int r0 = r23 + 1
            r16[r23] = r19
            r23 = r0
            goto L_0x0221
        L_0x0208:
            r13 = r0
        L_0x0209:
            int r6 = r4 << 1
            int r0 = r7 / 32
            int r6 = r6 + r0
            r5 = r12[r6]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0248
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x0216:
            r0 = r26
            long r5 = r0.objectFieldOffset(r5)
            int r0 = (int) r5
            r18 = r0
            int r5 = r7 % 32
        L_0x0221:
            r0 = r15
        L_0x0222:
            int r17 = r20 + 1
            r24[r20] = r10
            int r15 = r17 + 1
            r6 = r9 & 512(0x200, float:7.175E-43)
            r10 = 0
            if (r6 == 0) goto L_0x022f
            r10 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x022f:
            r7 = r9 & 256(0x100, float:3.59E-43)
            r6 = 0
            if (r7 == 0) goto L_0x0236
            r6 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0236:
            r10 = r10 | r6
            int r6 = r8 << 20
            r10 = r10 | r6
            r10 = r10 | r19
            r24[r17] = r10
            int r20 = r15 + 1
            int r5 = r5 << 20
            r5 = r5 | r18
            r24[r15] = r5
            goto L_0x0079
        L_0x0248:
            java.lang.String r5 = (java.lang.String) r5
            r0 = r25
            java.lang.reflect.Field r5 = A0K(r0, r5)
            r12[r6] = r5
            goto L_0x0216
        L_0x0253:
            int r0 = r13 + 1
            char r4 = r14.charAt(r13)
            if (r4 < r12) goto L_0x0272
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x025f:
            int r1 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r12) goto L_0x026f
            int r4 = X.BE6.A08(r0, r2, r4)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x025f
        L_0x026f:
            int r0 = r0 << r2
            r4 = r4 | r0
            r0 = r1
        L_0x0272:
            int r3 = r0 + 1
            char r8 = r14.charAt(r0)
            if (r8 < r12) goto L_0x0291
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x027e:
            int r1 = r3 + 1
            char r0 = r14.charAt(r3)
            if (r0 < r12) goto L_0x028e
            int r8 = X.BE6.A08(r0, r2, r8)
            int r2 = r2 + 13
            r3 = r1
            goto L_0x027e
        L_0x028e:
            int r0 = r0 << r2
            r8 = r8 | r0
            r3 = r1
        L_0x0291:
            int r0 = r3 + 1
            char r3 = r14.charAt(r3)
            if (r3 < r12) goto L_0x02b0
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x029d:
            int r1 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r12) goto L_0x02ad
            int r3 = X.BE6.A08(r0, r2, r3)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x029d
        L_0x02ad:
            int r0 = r0 << r2
            r3 = r3 | r0
            r0 = r1
        L_0x02b0:
            int r7 = r0 + 1
            char r2 = r14.charAt(r0)
            if (r2 < r12) goto L_0x02cf
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x02bc:
            int r1 = r7 + 1
            char r0 = r14.charAt(r7)
            if (r0 < r12) goto L_0x02cc
            int r2 = X.BE6.A08(r0, r6, r2)
            int r6 = r6 + 13
            r7 = r1
            goto L_0x02bc
        L_0x02cc:
            int r0 = r0 << r6
            r2 = r2 | r0
            r7 = r1
        L_0x02cf:
            int r0 = r7 + 1
            char r7 = r14.charAt(r7)
            if (r7 < r12) goto L_0x02ee
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x02db:
            int r1 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r12) goto L_0x02eb
            int r7 = X.BE6.A08(r0, r6, r7)
            int r6 = r6 + 13
            r0 = r1
            goto L_0x02db
        L_0x02eb:
            int r0 = r0 << r6
            r7 = r7 | r0
            r0 = r1
        L_0x02ee:
            int r10 = r0 + 1
            char r6 = r14.charAt(r0)
            if (r6 < r12) goto L_0x030d
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x02fa:
            int r1 = r10 + 1
            char r0 = r14.charAt(r10)
            if (r0 < r12) goto L_0x030a
            int r6 = X.BE6.A08(r0, r9, r6)
            int r9 = r9 + 13
            r10 = r1
            goto L_0x02fa
        L_0x030a:
            int r0 = r0 << r9
            r6 = r6 | r0
            r10 = r1
        L_0x030d:
            int r0 = r10 + 1
            char r11 = r14.charAt(r10)
            if (r11 < r12) goto L_0x032c
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0319:
            int r1 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r12) goto L_0x0329
            int r11 = X.BE6.A08(r0, r9, r11)
            int r9 = r9 + 13
            r0 = r1
            goto L_0x0319
        L_0x0329:
            int r0 = r0 << r9
            r11 = r11 | r0
            r0 = r1
        L_0x032c:
            int r13 = r0 + 1
            char r1 = r14.charAt(r0)
            if (r1 < r12) goto L_0x034b
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0338:
            int r9 = r13 + 1
            char r0 = r14.charAt(r13)
            if (r0 < r12) goto L_0x0348
            int r1 = X.BE6.A08(r0, r10, r1)
            int r10 = r10 + 13
            r13 = r9
            goto L_0x0338
        L_0x0348:
            int r0 = r0 << r10
            r1 = r1 | r0
            r13 = r9
        L_0x034b:
            int r0 = r1 + r6
            int r0 = r0 + r11
            int[] r0 = new int[r0]
            r16 = r0
            int r0 = r4 << 1
            int r0 = r0 + r8
            goto L_0x005a
        L_0x0357:
            X.DKD r17 = new X.DKD
            r18 = r32
            r19 = r33
            r20 = r34
            r22 = r36
            r23 = r37
            r21 = r28
            r25 = r16
            r26 = r11
            r27 = r3
            r28 = r2
            r29 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r17
        L_0x0373:
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKD.A0G(X.CBH, X.CHJ, X.E28, X.E29, X.E2A, X.CBJ):X.DKD");
    }

    private final EAD A0H(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.A04;
        EAD ead = (EAD) objArr[i2];
        if (ead != null) {
            return ead;
        }
        EAD A002 = C25660Cjq.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = A002;
        return A002;
    }

    public static C25840Cmu A0I(Object obj) {
        C23484Bho bho = (C23484Bho) obj;
        C25840Cmu cmu = bho.zzb;
        if (cmu != C25840Cmu.A05) {
            return cmu;
        }
        C25840Cmu cmu2 = new C25840Cmu();
        bho.zzb = cmu2;
        return cmu2;
    }

    public static void A0M(E9H e9h, Object obj, int i) {
        if (obj instanceof String) {
            ((DKF) e9h).A00.A08(i, (String) obj);
            return;
        }
        ((DKF) e9h).A00.A0B((DSO) obj, i);
    }

    public static void A0N(Object obj, int i, int i2) {
        C23450BhF bhF = ((DKF) obj).A00;
        bhF.A05(i2 << 3);
        bhF.A05((i >> 31) ^ (i << 1));
    }

    public static void A0O(Object obj, int i, int i2) {
        C23450BhF bhF = ((DKF) obj).A00;
        bhF.A05(i << 3);
        bhF.A04((byte) i2);
    }

    private final boolean A0P(Object obj, int i) {
        int[] iArr = this.A03;
        int i2 = iArr[i + 2];
        long j = (long) (i2 & 1048575);
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = (long) (i3 & 1048575);
            switch (BE7.A04(i3)) {
                case 0:
                    if (C26277CwW.A00.A02(obj, j2) != 0.0d) {
                        return true;
                    }
                    break;
                case 1:
                    if (C26277CwW.A00.A03(obj, j2) != 0.0f) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C26277CwW.A00.A05(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (C26277CwW.A00.A04(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return C26277CwW.A00.A0C(obj, j2);
                case 8:
                    Object A032 = C26277CwW.A03(obj, j2);
                    if (A032 instanceof String) {
                        if (!((String) A032).isEmpty()) {
                            return true;
                        }
                    } else if (!(A032 instanceof DSO)) {
                        throw BE6.A0j();
                    } else if (!DSO.A00.equals(A032)) {
                        return true;
                    }
                    break;
                case 9:
                case 17:
                    if (C26277CwW.A03(obj, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!DSO.A00.equals(C26277CwW.A03(obj, j2))) {
                        return true;
                    }
                    break;
                default:
                    throw BE6.A0j();
            }
        } else {
            if ((C26277CwW.A00.A04(obj, j) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0Q(Object obj, int i, int i2) {
        return AnonymousClass000.A1T(C26277CwW.A00.A04(obj, BE9.A0O(this.A03, i2)), i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        r13 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0182, code lost:
        r11.putInt(r10, r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0197, code lost:
        r5 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0199, code lost:
        r15 = r15 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019b, code lost:
        r1 = r22;
        r13 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b0, code lost:
        r11.putLong(r10, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d5, code lost:
        if ((r15 & r16) == 0) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d7, code lost:
        r0 = X.C25462CgF.A00(r11.getObject(r10, r7), r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e9, code lost:
        r0 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01eb, code lost:
        r11.putObject(r10, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ee, code lost:
        r15 = r15 | r16;
        r13 = r18;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0R(X.C25572CiB r40, java.lang.Object r41, byte[] r42, int r43, int r44, int r45) {
        /*
            r39 = this;
            r5 = r43
            sun.misc.Unsafe r11 = A0E
            r1 = -1
            r9 = 0
            r12 = 0
            r15 = 0
            r13 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000b:
            r6 = r39
            r29 = r44
            r10 = r41
            r23 = r45
            r0 = r29
            if (r5 >= r0) goto L_0x0093
            int r2 = r5 + 1
            r3 = r42
            byte r12 = r42[r5]
            r4 = r40
            if (r12 >= 0) goto L_0x0027
            int r2 = A0C(r4, r3, r12, r2)
            int r12 = r4.A00
        L_0x0027:
            int r22 = r12 >>> 3
            r5 = r12 & 7
            r7 = 3
            r0 = r22
            if (r0 <= r1) goto L_0x02ac
            int r9 = r9 / r7
            int r1 = r6.A00
            if (r0 < r1) goto L_0x02a9
            int r1 = r6.A01
            if (r0 > r1) goto L_0x02a9
            int[] r8 = r6.A03
            int r0 = r8.length
            int r0 = r0 / 3
            int r7 = r0 + -1
        L_0x0040:
            if (r9 > r7) goto L_0x02a9
            int r0 = r7 + r9
            int r16 = r0 >>> 1
            int r14 = r16 * 3
            r1 = r8[r14]
            r0 = r22
            if (r0 != r1) goto L_0x029f
            r9 = r14
        L_0x004f:
            r20 = 0
            r0 = -1
            if (r9 == r0) goto L_0x02a9
            int[] r1 = r6.A03
            int r0 = r9 + 1
            r19 = r1[r0]
            int r14 = X.BE7.A04(r19)
            long r7 = X.BE6.A0M(r19)
            r0 = 17
            if (r14 > r0) goto L_0x01f8
            int r0 = r9 + 2
            r18 = r1[r0]
            int r0 = r18 >>> 20
            r17 = 1
            int r16 = r17 << r0
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r18 = r18 & r1
            r0 = r18
            if (r0 == r13) goto L_0x01f4
            if (r13 == r1) goto L_0x007f
            long r0 = (long) r13
            r11.putInt(r10, r0, r15)
        L_0x007f:
            r0 = r18
            long r0 = (long) r0
            int r15 = r11.getInt(r10, r0)
        L_0x0086:
            r0 = 5
            switch(r14) {
                case 0: goto L_0x00d1;
                case 1: goto L_0x00e8;
                case 2: goto L_0x00c7;
                case 3: goto L_0x00c7;
                case 4: goto L_0x00fb;
                case 5: goto L_0x0186;
                case 6: goto L_0x0108;
                case 7: goto L_0x0115;
                case 8: goto L_0x012a;
                case 9: goto L_0x013f;
                case 10: goto L_0x01e2;
                case 11: goto L_0x00fb;
                case 12: goto L_0x014e;
                case 13: goto L_0x0108;
                case 14: goto L_0x0186;
                case 15: goto L_0x0176;
                case 16: goto L_0x01a1;
                case 17: goto L_0x01bc;
                default: goto L_0x008a;
            }
        L_0x008a:
            r13 = r18
        L_0x008c:
            r0 = r23
            if (r12 != r0) goto L_0x0289
            if (r45 == 0) goto L_0x0289
            r5 = r2
        L_0x0093:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r13 == r0) goto L_0x009c
            long r0 = (long) r13
            r11.putInt(r10, r0, r15)
        L_0x009c:
            int r3 = r6.A05
        L_0x009e:
            int r0 = r6.A06
            if (r3 >= r0) goto L_0x02b2
            int[] r0 = r6.A0D
            r2 = r0[r3]
            int[] r0 = r6.A03
            long r0 = X.BE9.A0N(r0, r2)
            java.lang.Object r0 = X.C26277CwW.A03(r10, r0)
            if (r0 == 0) goto L_0x00c4
            java.lang.Object[] r1 = r6.A04
            int r0 = r2 / 3
            int r0 = r0 << 1
            int r0 = r0 + 1
            r0 = r1[r0]
            if (r0 == 0) goto L_0x00c4
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        L_0x00c4:
            int r3 = r3 + 1
            goto L_0x009e
        L_0x00c7:
            if (r5 != 0) goto L_0x008a
            int r5 = A08(r4, r3, r2)
            long r0 = r4.A01
            goto L_0x01b0
        L_0x00d1:
            r0 = r17
            if (r5 != r0) goto L_0x008a
            long r0 = X.BEB.A0G(r3, r2)
            double r27 = java.lang.Double.longBitsToDouble(r0)
            X.CnD r23 = X.C26277CwW.A00
            r24 = r10
            r25 = r7
            r23.A07(r24, r25, r27)
            goto L_0x0197
        L_0x00e8:
            if (r5 != r0) goto L_0x008a
            int r0 = X.BEB.A08(r3, r2)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.CnD r0 = X.C26277CwW.A00
            r0.A08(r10, r7, r1)
            int r5 = r2 + 4
            goto L_0x0199
        L_0x00fb:
            if (r5 != 0) goto L_0x008a
            int r5 = A07(r4, r3, r2)
            int r0 = r4.A00
            r11.putInt(r10, r7, r0)
            goto L_0x0199
        L_0x0108:
            if (r5 != r0) goto L_0x008a
            int r0 = X.BEB.A08(r3, r2)
            r11.putInt(r10, r7, r0)
            int r5 = r2 + 4
            goto L_0x01ee
        L_0x0115:
            if (r5 != 0) goto L_0x008a
            int r5 = A08(r4, r3, r2)
            long r0 = r4.A01
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r2)
            X.CnD r0 = X.C26277CwW.A00
            r0.A0B(r10, r7, r1)
            goto L_0x01ee
        L_0x012a:
            r0 = 2
            if (r5 != r0) goto L_0x008a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r19
            if (r0 != 0) goto L_0x0139
            int r5 = A09(r4, r3, r2)
            goto L_0x01e9
        L_0x0139:
            int r5 = A0A(r4, r3, r2)
            goto L_0x01e9
        L_0x013f:
            r0 = 2
            if (r5 != r0) goto L_0x008a
            X.EAD r1 = r6.A0H(r9)
            r0 = r29
            int r5 = A02(r4, r1, r3, r2, r0)
            goto L_0x01d3
        L_0x014e:
            if (r5 != 0) goto L_0x008a
            int r5 = A07(r4, r3, r2)
            int r2 = r4.A00
            java.lang.Object[] r1 = r6.A04
            int r0 = r9 / 3
            int r0 = r0 << 1
            int r0 = r0 + 1
            r0 = r1[r0]
            X.E5T r0 = (X.E5T) r0
            if (r0 == 0) goto L_0x0182
            boolean r0 = r0.zza(r2)
            if (r0 != 0) goto L_0x0182
            X.Cmu r1 = A0I(r10)
            java.lang.Long r0 = X.C17880vN.A0n(r2)
            r1.A01(r12, r0)
            goto L_0x019b
        L_0x0176:
            if (r5 != 0) goto L_0x008a
            int r5 = A07(r4, r3, r2)
            int r0 = r4.A00
            int r2 = X.BE7.A05(r0)
        L_0x0182:
            r11.putInt(r10, r7, r2)
            goto L_0x01ee
        L_0x0186:
            r0 = r17
            if (r5 != r0) goto L_0x008a
            long r27 = X.BEB.A0G(r3, r2)
            r24 = r10
            r23 = r11
            r25 = r7
            r23.putLong(r24, r25, r27)
        L_0x0197:
            int r5 = r2 + 8
        L_0x0199:
            r15 = r15 | r16
        L_0x019b:
            r1 = r22
            r13 = r18
            goto L_0x000b
        L_0x01a1:
            if (r5 != 0) goto L_0x008a
            int r5 = A08(r4, r3, r2)
            long r2 = r4.A01
            long r13 = r2 >>> r17
            r0 = 1
            long r2 = r2 & r0
            long r0 = -r2
            long r0 = r0 ^ r13
        L_0x01b0:
            r24 = r10
            r23 = r11
            r25 = r7
            r27 = r0
            r23.putLong(r24, r25, r27)
            goto L_0x01ee
        L_0x01bc:
            r0 = 3
            if (r5 != r0) goto L_0x008a
            int r0 = r22 << 3
            r28 = r0 | 4
            X.EAD r24 = r6.A0H(r9)
            r23 = r4
            r25 = r3
            r26 = r2
            r27 = r29
            int r5 = A03(r23, r24, r25, r26, r27, r28)
        L_0x01d3:
            r0 = r15 & r16
            if (r0 == 0) goto L_0x01e9
            java.lang.Object r1 = r11.getObject(r10, r7)
            java.lang.Object r0 = r4.A02
            X.Bho r0 = X.C25462CgF.A00(r1, r0)
            goto L_0x01eb
        L_0x01e2:
            r0 = 2
            if (r5 != r0) goto L_0x008a
            int r5 = A0B(r4, r3, r2)
        L_0x01e9:
            java.lang.Object r0 = r4.A02
        L_0x01eb:
            r11.putObject(r10, r7, r0)
        L_0x01ee:
            r15 = r15 | r16
            r13 = r18
            goto L_0x029b
        L_0x01f4:
            r18 = r13
            goto L_0x0086
        L_0x01f8:
            r0 = 27
            if (r14 != r0) goto L_0x0233
            r0 = 2
            if (r5 != r0) goto L_0x008c
            java.lang.Object r1 = r11.getObject(r10, r7)
            X.EE8 r1 = (X.EE8) r1
            r0 = r1
            X.DbN r0 = (X.C27294DbN) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0217
            int r0 = X.BEA.A0C(r1)
            X.EE8 r1 = r1.CSz(r0)
            r11.putObject(r10, r7, r1)
        L_0x0217:
            X.EAD r6 = r6.A0H(r9)
        L_0x021b:
            r0 = r29
            int r5 = A02(r4, r6, r3, r2, r0)
            java.lang.Object r0 = r4.A02
            r1.add(r0)
            r0 = r29
            if (r5 >= r0) goto L_0x029b
            int r2 = A07(r4, r3, r5)
            int r0 = r4.A00
            if (r12 != r0) goto L_0x029b
            goto L_0x021b
        L_0x0233:
            r0 = 49
            if (r14 > r0) goto L_0x025b
            r0 = r19
            long r0 = (long) r0
            r25 = r4
            r26 = r10
            r27 = r3
            r33 = r9
            r34 = r14
            r35 = r0
            r37 = r7
            r24 = r6
            r28 = r2
            r30 = r12
            r31 = r22
            r32 = r5
            int r5 = r24.A06(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37)
        L_0x0256:
            if (r5 != r2) goto L_0x029b
            r2 = r5
            goto L_0x008c
        L_0x025b:
            r0 = 50
            if (r14 != r0) goto L_0x026c
            r0 = 2
            if (r5 != r0) goto L_0x008c
            r11.getObject(r10, r7)
            java.lang.String r0 = "zzd"
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0s(r0)
            throw r1
        L_0x026c:
            r25 = r4
            r26 = r10
            r27 = r3
            r33 = r19
            r34 = r14
            r35 = r9
            r36 = r7
            r24 = r6
            r28 = r2
            r30 = r12
            r31 = r22
            r32 = r5
            int r5 = r24.A05(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x0256
        L_0x0289:
            X.Cmu r17 = A0I(r10)
            r16 = r4
            r18 = r3
            r19 = r12
            r20 = r2
            r21 = r29
            int r5 = A04(r16, r17, r18, r19, r20, r21)
        L_0x029b:
            r1 = r22
            goto L_0x000b
        L_0x029f:
            if (r0 >= r1) goto L_0x02a5
            int r7 = r16 + -1
            goto L_0x0040
        L_0x02a5:
            int r9 = r16 + 1
            goto L_0x0040
        L_0x02a9:
            r9 = 0
            goto L_0x008c
        L_0x02ac:
            int r9 = r6.A00(r0)
            goto L_0x004f
        L_0x02b2:
            r0 = r29
            if (r45 != 0) goto L_0x02b9
            if (r5 != r0) goto L_0x02c0
            return r5
        L_0x02b9:
            if (r5 > r0) goto L_0x02c0
            r0 = r23
            if (r12 != r0) goto L_0x02c0
            return r5
        L_0x02c0:
            java.lang.String r0 = "Failed to parse the message."
            X.BxG r1 = new X.BxG
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKD.A0R(X.CiB, java.lang.Object, byte[], int, int, int):int");
    }

    public final Object CT0() {
        return ((C23484Bho) this.A09).A06(4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007f, code lost:
        if (r4 == r0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0081, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00db, code lost:
        if (r8 == r1) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CT5(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            int[] r7 = r11.A03
            int r6 = r7.length
            r10 = 0
            r5 = 0
        L_0x0005:
            if (r5 >= r6) goto L_0x00b5
            int r0 = r5 + 1
            r4 = r7[r0]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r4 & r1
            long r2 = (long) r0
            int r0 = X.BE7.A04(r4)
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0039;
                case 2: goto L_0x00c5;
                case 3: goto L_0x00c5;
                case 4: goto L_0x006b;
                case 5: goto L_0x00c5;
                case 6: goto L_0x006b;
                case 7: goto L_0x0056;
                case 8: goto L_0x0082;
                case 9: goto L_0x0082;
                case 10: goto L_0x0082;
                case 11: goto L_0x006b;
                case 12: goto L_0x006b;
                case 13: goto L_0x006b;
                case 14: goto L_0x00c5;
                case 15: goto L_0x006b;
                case 16: goto L_0x00c5;
                case 17: goto L_0x0082;
                case 18: goto L_0x009f;
                case 19: goto L_0x009f;
                case 20: goto L_0x009f;
                case 21: goto L_0x009f;
                case 22: goto L_0x009f;
                case 23: goto L_0x009f;
                case 24: goto L_0x009f;
                case 25: goto L_0x009f;
                case 26: goto L_0x009f;
                case 27: goto L_0x009f;
                case 28: goto L_0x009f;
                case 29: goto L_0x009f;
                case 30: goto L_0x009f;
                case 31: goto L_0x009f;
                case 32: goto L_0x009f;
                case 33: goto L_0x009f;
                case 34: goto L_0x009f;
                case 35: goto L_0x009f;
                case 36: goto L_0x009f;
                case 37: goto L_0x009f;
                case 38: goto L_0x009f;
                case 39: goto L_0x009f;
                case 40: goto L_0x009f;
                case 41: goto L_0x009f;
                case 42: goto L_0x009f;
                case 43: goto L_0x009f;
                case 44: goto L_0x009f;
                case 45: goto L_0x009f;
                case 46: goto L_0x009f;
                case 47: goto L_0x009f;
                case 48: goto L_0x009f;
                case 49: goto L_0x009f;
                case 50: goto L_0x009f;
                case 51: goto L_0x008d;
                case 52: goto L_0x008d;
                case 53: goto L_0x008d;
                case 54: goto L_0x008d;
                case 55: goto L_0x008d;
                case 56: goto L_0x008d;
                case 57: goto L_0x008d;
                case 58: goto L_0x008d;
                case 59: goto L_0x008d;
                case 60: goto L_0x008d;
                case 61: goto L_0x008d;
                case 62: goto L_0x008d;
                case 63: goto L_0x008d;
                case 64: goto L_0x008d;
                case 65: goto L_0x008d;
                case 66: goto L_0x008d;
                case 67: goto L_0x008d;
                case 68: goto L_0x008d;
                default: goto L_0x0018;
            }
        L_0x0018:
            int r5 = r5 + 3
            goto L_0x0005
        L_0x001b:
            boolean r1 = r11.A0P(r12, r5)
            boolean r0 = r11.A0P(r13, r5)
            if (r1 != r0) goto L_0x00dd
            X.CnD r4 = X.C26277CwW.A00
            double r0 = r4.A02(r12, r2)
            long r8 = java.lang.Double.doubleToLongBits(r0)
            double r0 = r4.A02(r13, r2)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x00d9
        L_0x0039:
            boolean r1 = r11.A0P(r12, r5)
            boolean r0 = r11.A0P(r13, r5)
            if (r1 != r0) goto L_0x00dd
            X.CnD r1 = X.C26277CwW.A00
            float r0 = r1.A03(r12, r2)
            int r4 = java.lang.Float.floatToIntBits(r0)
            float r0 = r1.A03(r13, r2)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x007f
        L_0x0056:
            boolean r1 = r11.A0P(r12, r5)
            boolean r0 = r11.A0P(r13, r5)
            if (r1 != r0) goto L_0x00dd
            X.CnD r0 = X.C26277CwW.A00
            boolean r4 = r0.A0C(r12, r2)
            boolean r0 = r0.A0C(r13, r2)
            goto L_0x007f
        L_0x006b:
            boolean r1 = r11.A0P(r12, r5)
            boolean r0 = r11.A0P(r13, r5)
            if (r1 != r0) goto L_0x00dd
            X.CnD r0 = X.C26277CwW.A00
            int r4 = r0.A04(r12, r2)
            int r0 = r0.A04(r13, r2)
        L_0x007f:
            if (r4 == r0) goto L_0x0018
            return r10
        L_0x0082:
            boolean r1 = r11.A0P(r12, r5)
            boolean r0 = r11.A0P(r13, r5)
            if (r1 != r0) goto L_0x00dd
            goto L_0x009f
        L_0x008d:
            int r0 = r5 + 2
            r0 = r7[r0]
            r0 = r0 & r1
            long r0 = (long) r0
            X.CnD r8 = X.C26277CwW.A00
            int r4 = r8.A04(r12, r0)
            int r0 = r8.A04(r13, r0)
            if (r4 != r0) goto L_0x00dd
        L_0x009f:
            java.lang.Object r4 = X.C26277CwW.A03(r12, r2)
            java.lang.Object r1 = X.C26277CwW.A03(r13, r2)
            java.lang.Class r0 = X.C26301CxE.A03
            if (r4 == r1) goto L_0x0018
            if (r4 == 0) goto L_0x00dd
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x00dd
            goto L_0x0018
        L_0x00b5:
            X.Bho r12 = (X.C23484Bho) r12
            X.Cmu r1 = r12.zzb
            X.Bho r13 = (X.C23484Bho) r13
            X.Cmu r0 = r13.zzb
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 1
            return r0
        L_0x00c5:
            boolean r1 = r11.A0P(r12, r5)
            boolean r0 = r11.A0P(r13, r5)
            if (r1 != r0) goto L_0x00dd
            X.CnD r0 = X.C26277CwW.A00
            long r8 = r0.A05(r12, r2)
            long r1 = r0.A05(r13, r2)
        L_0x00d9:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0018
        L_0x00dd:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKD.CT5(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x037f, code lost:
        X.DKF.A02(r6, r7, A0F(r5, (long) (r1 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0422, code lost:
        ((X.DKF) r6).A00.A07(r7, X.AnonymousClass000.A0M(X.C26277CwW.A03(r5, (long) (r1 & 1048575))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0453, code lost:
        X.DKF.A01(r6, r7, A0F(r5, (long) (r1 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x080f, code lost:
        X.DKF.A02(r6, r7, A0F(r5, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x08a9, code lost:
        ((X.DKF) r6).A00.A07(r7, X.AnonymousClass000.A0M(X.C26277CwW.A03(r5, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x08d4, code lost:
        X.DKF.A01(r6, r7, A0F(r5, r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CT7(X.E9H r21, java.lang.Object r22) {
        /*
            r20 = this;
            r5 = r22
            r17 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 1
            r3 = 0
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r20
            boolean r0 = r2.A0C
            r6 = r21
            if (r0 == 0) goto L_0x04a8
            int[] r9 = r2.A03
            int r10 = r9.length
            r8 = 0
        L_0x0015:
            if (r8 >= r10) goto L_0x0923
            int r0 = r8 + 1
            r1 = r9[r0]
            r7 = r9[r8]
            r0 = r1 & r17
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x003a;
                case 2: goto L_0x004d;
                case 3: goto L_0x0060;
                case 4: goto L_0x0073;
                case 5: goto L_0x008b;
                case 6: goto L_0x009e;
                case 7: goto L_0x00b2;
                case 8: goto L_0x00c6;
                case 9: goto L_0x00d5;
                case 10: goto L_0x00e8;
                case 11: goto L_0x00fe;
                case 12: goto L_0x011c;
                case 13: goto L_0x0135;
                case 14: goto L_0x0149;
                case 15: goto L_0x015d;
                case 16: goto L_0x0171;
                case 17: goto L_0x0193;
                case 18: goto L_0x01a6;
                case 19: goto L_0x01b1;
                case 20: goto L_0x01bc;
                case 21: goto L_0x01c7;
                case 22: goto L_0x01d2;
                case 23: goto L_0x01dd;
                case 24: goto L_0x01e8;
                case 25: goto L_0x01f3;
                case 26: goto L_0x01fe;
                case 27: goto L_0x0209;
                case 28: goto L_0x0231;
                case 29: goto L_0x023c;
                case 30: goto L_0x0247;
                case 31: goto L_0x0252;
                case 32: goto L_0x025d;
                case 33: goto L_0x0268;
                case 34: goto L_0x0273;
                case 35: goto L_0x027e;
                case 36: goto L_0x0289;
                case 37: goto L_0x0294;
                case 38: goto L_0x029f;
                case 39: goto L_0x02aa;
                case 40: goto L_0x02b5;
                case 41: goto L_0x02c0;
                case 42: goto L_0x02cb;
                case 43: goto L_0x02d6;
                case 44: goto L_0x02e1;
                case 45: goto L_0x02ec;
                case 46: goto L_0x02f7;
                case 47: goto L_0x0302;
                case 48: goto L_0x030d;
                case 49: goto L_0x0318;
                case 50: goto L_0x0340;
                case 51: goto L_0x034c;
                case 52: goto L_0x035f;
                case 53: goto L_0x0372;
                case 54: goto L_0x0379;
                case 55: goto L_0x038b;
                case 56: goto L_0x0393;
                case 57: goto L_0x039b;
                case 58: goto L_0x03b1;
                case 59: goto L_0x03c4;
                case 60: goto L_0x03d3;
                case 61: goto L_0x03e6;
                case 62: goto L_0x03fc;
                case 63: goto L_0x041c;
                case 64: goto L_0x0437;
                case 65: goto L_0x044d;
                case 66: goto L_0x045f;
                case 67: goto L_0x0475;
                case 68: goto L_0x0495;
                default: goto L_0x0024;
            }
        L_0x0024:
            int r8 = r8 + 3
            goto L_0x0015
        L_0x0027:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            double r0 = r11.A02(r5, r0)
            r6.CT1(r7, r0)
            goto L_0x0024
        L_0x003a:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            float r0 = r11.A03(r5, r0)
            r6.CT2(r7, r0)
            goto L_0x0024
        L_0x004d:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            long r0 = r11.A05(r5, r0)
            X.DKF.A02(r6, r7, r0)
            goto L_0x0024
        L_0x0060:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            long r0 = r11.A05(r5, r0)
            X.DKF.A02(r6, r7, r0)
            goto L_0x0024
        L_0x0073:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            int r1 = r11.A04(r5, r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r0 = r0.A00
            r0.A07(r7, r1)
            goto L_0x0024
        L_0x008b:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            long r0 = r11.A05(r5, r0)
            X.DKF.A01(r6, r7, r0)
            goto L_0x0024
        L_0x009e:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            int r0 = r11.A04(r5, r0)
            X.DKF.A00(r6, r7, r0)
            goto L_0x0024
        L_0x00b2:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            boolean r0 = r11.A0C(r5, r0)
            A0O(r6, r7, r0)
            goto L_0x0024
        L_0x00c6:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0J(r5, r1)
            A0M(r6, r0, r7)
            goto L_0x0024
        L_0x00d5:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0J(r5, r1)
            X.EAD r0 = r2.A0H(r8)
            r6.CTB(r0, r1, r7)
            goto L_0x0024
        L_0x00e8:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0J(r5, r1)
            X.DSO r1 = (X.DSO) r1
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r0 = r0.A00
            r0.A0B(r1, r7)
            goto L_0x0024
        L_0x00fe:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            int r11 = r11.A04(r5, r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r1 = r0.A00
            int r0 = r7 << 3
            r1.A05(r0)
            r1.A05(r11)
            goto L_0x0024
        L_0x011c:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            int r1 = r11.A04(r5, r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r0 = r0.A00
            r0.A07(r7, r1)
            goto L_0x0024
        L_0x0135:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            int r0 = r11.A04(r5, r0)
            X.DKF.A00(r6, r7, r0)
            goto L_0x0024
        L_0x0149:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            long r0 = r11.A05(r5, r0)
            X.DKF.A01(r6, r7, r0)
            goto L_0x0024
        L_0x015d:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            int r0 = r11.A04(r5, r0)
            A0N(r6, r0, r7)
            goto L_0x0024
        L_0x0171:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.CnD r11 = X.C26277CwW.A00
            long r12 = r11.A05(r5, r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r11 = r0.A00
            long r0 = X.BE9.A0L(r12)
            int r7 = r7 << 3
            r11.A05(r7)
            r11.A09(r0)
            goto L_0x0024
        L_0x0193:
            boolean r0 = r2.A0P(r5, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0J(r5, r1)
            X.EAD r0 = r2.A0H(r8)
            r6.CTM(r0, r1, r7)
            goto L_0x0024
        L_0x01a6:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0E(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01b1:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0F(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01bc:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0G(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01c7:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0H(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01d2:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0L(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01dd:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0J(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01e8:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0O(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01f3:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0R(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01fe:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0C(r6, r0, r7)
            goto L_0x0024
        L_0x0209:
            r12 = r9[r8]
            java.util.List r13 = A0L(r1, r5)
            X.EAD r11 = r2.A0H(r8)
            java.lang.Class r0 = X.C26301CxE.A03
            if (r13 == 0) goto L_0x0024
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0024
            r7 = r6
            X.DKF r7 = (X.DKF) r7
            r1 = 0
        L_0x0221:
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x0024
            java.lang.Object r0 = r13.get(r1)
            r7.CTB(r11, r0, r12)
            int r1 = r1 + 1
            goto L_0x0221
        L_0x0231:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0D(r6, r0, r7)
            goto L_0x0024
        L_0x023c:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0M(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0247:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0Q(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0252:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0P(r6, r0, r7, r3)
            goto L_0x0024
        L_0x025d:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0K(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0268:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0N(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0273:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0I(r6, r0, r7, r3)
            goto L_0x0024
        L_0x027e:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0E(r6, r0, r7, r4)
            goto L_0x0024
        L_0x0289:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0F(r6, r0, r7, r4)
            goto L_0x0024
        L_0x0294:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0G(r6, r0, r7, r4)
            goto L_0x0024
        L_0x029f:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0H(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02aa:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0L(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02b5:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0J(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02c0:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0O(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02cb:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0R(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02d6:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0M(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02e1:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0Q(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02ec:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0P(r6, r0, r7, r4)
            goto L_0x0024
        L_0x02f7:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0K(r6, r0, r7, r4)
            goto L_0x0024
        L_0x0302:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0N(r6, r0, r7, r4)
            goto L_0x0024
        L_0x030d:
            r7 = r9[r8]
            java.util.List r0 = A0L(r1, r5)
            X.C26301CxE.A0I(r6, r0, r7, r4)
            goto L_0x0024
        L_0x0318:
            r12 = r9[r8]
            java.util.List r13 = A0L(r1, r5)
            X.EAD r11 = r2.A0H(r8)
            java.lang.Class r0 = X.C26301CxE.A03
            if (r13 == 0) goto L_0x0024
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0024
            r7 = r6
            X.DKF r7 = (X.DKF) r7
            r1 = 0
        L_0x0330:
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x0024
            java.lang.Object r0 = r13.get(r1)
            r7.CTM(r11, r0, r12)
            int r1 = r1 + 1
            goto L_0x0330
        L_0x0340:
            java.lang.Object r0 = A0J(r5, r1)
            if (r0 == 0) goto L_0x0024
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x034c:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0J(r5, r1)
            double r0 = X.AnonymousClass8BR.A00(r0)
            r6.CT1(r7, r0)
            goto L_0x0024
        L_0x035f:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0J(r5, r1)
            float r0 = X.AnonymousClass000.A04(r0)
            r6.CT2(r7, r0)
            goto L_0x0024
        L_0x0372:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            goto L_0x037f
        L_0x0379:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
        L_0x037f:
            r1 = r1 & r16
            long r0 = (long) r1
            long r0 = A0F(r5, r0)
            X.DKF.A02(r6, r7, r0)
            goto L_0x0024
        L_0x038b:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            goto L_0x0422
        L_0x0393:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            goto L_0x0453
        L_0x039b:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C26277CwW.A03(r5, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            X.DKF.A00(r6, r7, r0)
            goto L_0x0024
        L_0x03b1:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0J(r5, r1)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            A0O(r6, r7, r0)
            goto L_0x0024
        L_0x03c4:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0J(r5, r1)
            A0M(r6, r0, r7)
            goto L_0x0024
        L_0x03d3:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0J(r5, r1)
            X.EAD r0 = r2.A0H(r8)
            r6.CTB(r0, r1, r7)
            goto L_0x0024
        L_0x03e6:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0J(r5, r1)
            X.DSO r1 = (X.DSO) r1
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r0 = r0.A00
            r0.A0B(r1, r7)
            goto L_0x0024
        L_0x03fc:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C26277CwW.A03(r5, r0)
            int r11 = X.AnonymousClass000.A0M(r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r1 = r0.A00
            int r0 = r7 << 3
            r1.A05(r0)
            r1.A05(r11)
            goto L_0x0024
        L_0x041c:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
        L_0x0422:
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C26277CwW.A03(r5, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r0 = r0.A00
            r0.A07(r7, r1)
            goto L_0x0024
        L_0x0437:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C26277CwW.A03(r5, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            X.DKF.A00(r6, r7, r0)
            goto L_0x0024
        L_0x044d:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
        L_0x0453:
            r1 = r1 & r16
            long r0 = (long) r1
            long r0 = A0F(r5, r0)
            X.DKF.A01(r6, r7, r0)
            goto L_0x0024
        L_0x045f:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C26277CwW.A03(r5, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            A0N(r6, r0, r7)
            goto L_0x0024
        L_0x0475:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            long r12 = A0F(r5, r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r11 = r0.A00
            long r0 = X.BE9.A0L(r12)
            int r7 = r7 << 3
            r11.A05(r7)
            r11.A09(r0)
            goto L_0x0024
        L_0x0495:
            boolean r0 = r2.A0Q(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0J(r5, r1)
            X.EAD r0 = r2.A0H(r8)
            r6.CTM(r0, r1, r7)
            goto L_0x0024
        L_0x04a8:
            int[] r10 = r2.A03
            int r12 = r10.length
            sun.misc.Unsafe r9 = A0E
            r8 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r19 = 0
        L_0x04b3:
            if (r8 >= r12) goto L_0x0923
            int r0 = r8 + 1
            r15 = r10[r0]
            r7 = r10[r8]
            r0 = r15 & r17
            int r13 = r0 >>> 20
            r0 = 17
            if (r13 > r0) goto L_0x0920
            int r0 = r8 + 2
            r18 = r10[r0]
            r14 = r18 & r16
            if (r14 == r11) goto L_0x04d1
            long r0 = (long) r14
            int r19 = r9.getInt(r5, r0)
            r11 = r14
        L_0x04d1:
            int r0 = r18 >>> 20
            int r14 = r4 << r0
        L_0x04d5:
            r15 = r15 & r16
            long r0 = (long) r15
            switch(r13) {
                case 0: goto L_0x04de;
                case 1: goto L_0x04ec;
                case 2: goto L_0x04fa;
                case 3: goto L_0x0506;
                case 4: goto L_0x0512;
                case 5: goto L_0x0523;
                case 6: goto L_0x052f;
                case 7: goto L_0x053b;
                case 8: goto L_0x0549;
                case 9: goto L_0x0555;
                case 10: goto L_0x0566;
                case 11: goto L_0x057a;
                case 12: goto L_0x0591;
                case 13: goto L_0x05a3;
                case 14: goto L_0x05b0;
                case 15: goto L_0x05bd;
                case 16: goto L_0x05ca;
                case 17: goto L_0x05e5;
                case 18: goto L_0x05f6;
                case 19: goto L_0x0603;
                case 20: goto L_0x0610;
                case 21: goto L_0x061d;
                case 22: goto L_0x062a;
                case 23: goto L_0x0637;
                case 24: goto L_0x0644;
                case 25: goto L_0x0651;
                case 26: goto L_0x065e;
                case 27: goto L_0x066b;
                case 28: goto L_0x0695;
                case 29: goto L_0x06a2;
                case 30: goto L_0x06af;
                case 31: goto L_0x06bc;
                case 32: goto L_0x06c9;
                case 33: goto L_0x06d6;
                case 34: goto L_0x06e3;
                case 35: goto L_0x06f0;
                case 36: goto L_0x06fd;
                case 37: goto L_0x070a;
                case 38: goto L_0x0717;
                case 39: goto L_0x0724;
                case 40: goto L_0x0731;
                case 41: goto L_0x073e;
                case 42: goto L_0x074b;
                case 43: goto L_0x0758;
                case 44: goto L_0x0765;
                case 45: goto L_0x0772;
                case 46: goto L_0x077f;
                case 47: goto L_0x078c;
                case 48: goto L_0x0799;
                case 49: goto L_0x07a6;
                case 50: goto L_0x07d0;
                case 51: goto L_0x07dc;
                case 52: goto L_0x07ef;
                case 53: goto L_0x0802;
                case 54: goto L_0x0809;
                case 55: goto L_0x0818;
                case 56: goto L_0x0820;
                case 57: goto L_0x0828;
                case 58: goto L_0x083b;
                case 59: goto L_0x084e;
                case 60: goto L_0x085d;
                case 61: goto L_0x0870;
                case 62: goto L_0x0886;
                case 63: goto L_0x08a3;
                case 64: goto L_0x08bb;
                case 65: goto L_0x08ce;
                case 66: goto L_0x08dd;
                case 67: goto L_0x08f0;
                case 68: goto L_0x090d;
                default: goto L_0x04db;
            }
        L_0x04db:
            int r8 = r8 + 3
            goto L_0x04b3
        L_0x04de:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            X.CnD r13 = X.C26277CwW.A00
            double r0 = r13.A02(r5, r0)
            r6.CT1(r7, r0)
            goto L_0x04db
        L_0x04ec:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            X.CnD r13 = X.C26277CwW.A00
            float r0 = r13.A03(r5, r0)
            r6.CT2(r7, r0)
            goto L_0x04db
        L_0x04fa:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            long r0 = r9.getLong(r5, r0)
            X.DKF.A02(r6, r7, r0)
            goto L_0x04db
        L_0x0506:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            long r0 = r9.getLong(r5, r0)
            X.DKF.A02(r6, r7, r0)
            goto L_0x04db
        L_0x0512:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            int r1 = r9.getInt(r5, r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r0 = r0.A00
            r0.A07(r7, r1)
            goto L_0x04db
        L_0x0523:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            long r0 = r9.getLong(r5, r0)
            X.DKF.A01(r6, r7, r0)
            goto L_0x04db
        L_0x052f:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            int r0 = r9.getInt(r5, r0)
            X.DKF.A00(r6, r7, r0)
            goto L_0x04db
        L_0x053b:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            X.CnD r13 = X.C26277CwW.A00
            boolean r0 = r13.A0C(r5, r0)
            A0O(r6, r7, r0)
            goto L_0x04db
        L_0x0549:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            java.lang.Object r0 = r9.getObject(r5, r0)
            A0M(r6, r0, r7)
            goto L_0x04db
        L_0x0555:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            java.lang.Object r1 = r9.getObject(r5, r0)
            X.EAD r0 = r2.A0H(r8)
            r6.CTB(r0, r1, r7)
            goto L_0x04db
        L_0x0566:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            java.lang.Object r1 = r9.getObject(r5, r0)
            X.DSO r1 = (X.DSO) r1
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r0 = r0.A00
            r0.A0B(r1, r7)
            goto L_0x04db
        L_0x057a:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            int r13 = r9.getInt(r5, r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r1 = r0.A00
            int r0 = r7 << 3
            r1.A05(r0)
            r1.A05(r13)
            goto L_0x04db
        L_0x0591:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            int r1 = r9.getInt(r5, r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r0 = r0.A00
            r0.A07(r7, r1)
            goto L_0x04db
        L_0x05a3:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            int r0 = r9.getInt(r5, r0)
            X.DKF.A00(r6, r7, r0)
            goto L_0x04db
        L_0x05b0:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            long r0 = r9.getLong(r5, r0)
            X.DKF.A01(r6, r7, r0)
            goto L_0x04db
        L_0x05bd:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            int r0 = r9.getInt(r5, r0)
            A0N(r6, r0, r7)
            goto L_0x04db
        L_0x05ca:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            long r14 = r9.getLong(r5, r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r13 = r0.A00
            long r0 = X.BE9.A0L(r14)
            int r7 = r7 << 3
            r13.A05(r7)
            r13.A09(r0)
            goto L_0x04db
        L_0x05e5:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04db
            java.lang.Object r1 = r9.getObject(r5, r0)
            X.EAD r0 = r2.A0H(r8)
            r6.CTM(r0, r1, r7)
            goto L_0x04db
        L_0x05f6:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0E(r6, r0, r7, r3)
            goto L_0x04db
        L_0x0603:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0F(r6, r0, r7, r3)
            goto L_0x04db
        L_0x0610:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0G(r6, r0, r7, r3)
            goto L_0x04db
        L_0x061d:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0H(r6, r0, r7, r3)
            goto L_0x04db
        L_0x062a:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0L(r6, r0, r7, r3)
            goto L_0x04db
        L_0x0637:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0J(r6, r0, r7, r3)
            goto L_0x04db
        L_0x0644:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0O(r6, r0, r7, r3)
            goto L_0x04db
        L_0x0651:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0R(r6, r0, r7, r3)
            goto L_0x04db
        L_0x065e:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0C(r6, r0, r7)
            goto L_0x04db
        L_0x066b:
            r13 = r10[r8]
            java.lang.Object r15 = r9.getObject(r5, r0)
            java.util.List r15 = (java.util.List) r15
            X.EAD r14 = r2.A0H(r8)
            java.lang.Class r0 = X.C26301CxE.A03
            if (r15 == 0) goto L_0x04db
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x04db
            r7 = r6
            X.DKF r7 = (X.DKF) r7
            r1 = 0
        L_0x0685:
            int r0 = r15.size()
            if (r1 >= r0) goto L_0x04db
            java.lang.Object r0 = r15.get(r1)
            r7.CTB(r14, r0, r13)
            int r1 = r1 + 1
            goto L_0x0685
        L_0x0695:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0D(r6, r0, r7)
            goto L_0x04db
        L_0x06a2:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0M(r6, r0, r7, r3)
            goto L_0x04db
        L_0x06af:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0Q(r6, r0, r7, r3)
            goto L_0x04db
        L_0x06bc:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0P(r6, r0, r7, r3)
            goto L_0x04db
        L_0x06c9:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0K(r6, r0, r7, r3)
            goto L_0x04db
        L_0x06d6:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0N(r6, r0, r7, r3)
            goto L_0x04db
        L_0x06e3:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0I(r6, r0, r7, r3)
            goto L_0x04db
        L_0x06f0:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0E(r6, r0, r7, r4)
            goto L_0x04db
        L_0x06fd:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0F(r6, r0, r7, r4)
            goto L_0x04db
        L_0x070a:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0G(r6, r0, r7, r4)
            goto L_0x04db
        L_0x0717:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0H(r6, r0, r7, r4)
            goto L_0x04db
        L_0x0724:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0L(r6, r0, r7, r4)
            goto L_0x04db
        L_0x0731:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0J(r6, r0, r7, r4)
            goto L_0x04db
        L_0x073e:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0O(r6, r0, r7, r4)
            goto L_0x04db
        L_0x074b:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0R(r6, r0, r7, r4)
            goto L_0x04db
        L_0x0758:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0M(r6, r0, r7, r4)
            goto L_0x04db
        L_0x0765:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0Q(r6, r0, r7, r4)
            goto L_0x04db
        L_0x0772:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0P(r6, r0, r7, r4)
            goto L_0x04db
        L_0x077f:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0K(r6, r0, r7, r4)
            goto L_0x04db
        L_0x078c:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0N(r6, r0, r7, r4)
            goto L_0x04db
        L_0x0799:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26301CxE.A0I(r6, r0, r7, r4)
            goto L_0x04db
        L_0x07a6:
            r13 = r10[r8]
            java.lang.Object r15 = r9.getObject(r5, r0)
            java.util.List r15 = (java.util.List) r15
            X.EAD r14 = r2.A0H(r8)
            java.lang.Class r0 = X.C26301CxE.A03
            if (r15 == 0) goto L_0x04db
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x04db
            r7 = r6
            X.DKF r7 = (X.DKF) r7
            r1 = 0
        L_0x07c0:
            int r0 = r15.size()
            if (r1 >= r0) goto L_0x04db
            java.lang.Object r0 = r15.get(r1)
            r7.CTM(r14, r0, r13)
            int r1 = r1 + 1
            goto L_0x07c0
        L_0x07d0:
            java.lang.Object r0 = r9.getObject(r5, r0)
            if (r0 == 0) goto L_0x04db
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x07dc:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C26277CwW.A03(r5, r0)
            double r0 = X.AnonymousClass8BR.A00(r0)
            r6.CT1(r7, r0)
            goto L_0x04db
        L_0x07ef:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C26277CwW.A03(r5, r0)
            float r0 = X.AnonymousClass000.A04(r0)
            r6.CT2(r7, r0)
            goto L_0x04db
        L_0x0802:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            goto L_0x080f
        L_0x0809:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
        L_0x080f:
            long r0 = A0F(r5, r0)
            X.DKF.A02(r6, r7, r0)
            goto L_0x04db
        L_0x0818:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            goto L_0x08a9
        L_0x0820:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            goto L_0x08d4
        L_0x0828:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C26277CwW.A03(r5, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            X.DKF.A00(r6, r7, r0)
            goto L_0x04db
        L_0x083b:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C26277CwW.A03(r5, r0)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            A0O(r6, r7, r0)
            goto L_0x04db
        L_0x084e:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = r9.getObject(r5, r0)
            A0M(r6, r0, r7)
            goto L_0x04db
        L_0x085d:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r1 = r9.getObject(r5, r0)
            X.EAD r0 = r2.A0H(r8)
            r6.CTB(r0, r1, r7)
            goto L_0x04db
        L_0x0870:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r1 = r9.getObject(r5, r0)
            X.DSO r1 = (X.DSO) r1
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r0 = r0.A00
            r0.A0B(r1, r7)
            goto L_0x04db
        L_0x0886:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C26277CwW.A03(r5, r0)
            int r13 = X.AnonymousClass000.A0M(r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r1 = r0.A00
            int r0 = r7 << 3
            r1.A05(r0)
            r1.A05(r13)
            goto L_0x04db
        L_0x08a3:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
        L_0x08a9:
            java.lang.Object r0 = X.C26277CwW.A03(r5, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r0 = r0.A00
            r0.A07(r7, r1)
            goto L_0x04db
        L_0x08bb:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C26277CwW.A03(r5, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            X.DKF.A00(r6, r7, r0)
            goto L_0x04db
        L_0x08ce:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
        L_0x08d4:
            long r0 = A0F(r5, r0)
            X.DKF.A01(r6, r7, r0)
            goto L_0x04db
        L_0x08dd:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r0 = X.C26277CwW.A03(r5, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            A0N(r6, r0, r7)
            goto L_0x04db
        L_0x08f0:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            long r14 = A0F(r5, r0)
            r0 = r6
            X.DKF r0 = (X.DKF) r0
            X.BhF r13 = r0.A00
            long r0 = X.BE9.A0L(r14)
            int r7 = r7 << 3
            r13.A05(r7)
            r13.A09(r0)
            goto L_0x04db
        L_0x090d:
            boolean r13 = r2.A0Q(r5, r7, r8)
            if (r13 == 0) goto L_0x04db
            java.lang.Object r1 = r9.getObject(r5, r0)
            X.EAD r0 = r2.A0H(r8)
            r6.CTM(r0, r1, r7)
            goto L_0x04db
        L_0x0920:
            r14 = 0
            goto L_0x04d5
        L_0x0923:
            X.Bho r5 = (X.C23484Bho) r5
            X.Cmu r0 = r5.zzb
            r0.A02(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKD.CT7(X.E9H, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0100, code lost:
        r7 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010d, code lost:
        r7 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015b, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015d, code lost:
        r10.putObject(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0176, code lost:
        r10.putInt(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0186, code lost:
        r10.putLong(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018c, code lost:
        r19 = r19 | r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CT8(X.C25572CiB r38, java.lang.Object r39, byte[] r40, int r41, int r42) {
        /*
            r37 = this;
            r7 = r41
            r35 = r37
            r0 = r35
            boolean r0 = r0.A0C
            r6 = r38
            r8 = r39
            r5 = r40
            r36 = r42
            if (r0 == 0) goto L_0x0244
            sun.misc.Unsafe r10 = A0E
            r3 = -1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = -1
            r9 = 0
            r19 = 0
            r18 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001f:
            r0 = r36
            if (r7 >= r0) goto L_0x022e
            int r4 = r7 + 1
            byte r12 = r40[r7]
            if (r12 >= 0) goto L_0x002f
            int r4 = A0C(r6, r5, r12, r4)
            int r12 = r6.A00
        L_0x002f:
            int r17 = r12 >>> 3
            r7 = r12 & 7
            r0 = r17
            if (r0 <= r2) goto L_0x0068
            int r2 = r9 / 3
            r0 = r35
            int r9 = r0.A00
            r0 = r17
            if (r0 < r9) goto L_0x022b
            r0 = r35
            int r9 = r0.A01
            r0 = r17
            if (r0 > r9) goto L_0x022b
            r0 = r35
            int[] r14 = r0.A03
            int r0 = r14.length
            int r0 = r0 / 3
            int r13 = r0 + -1
        L_0x0052:
            if (r2 > r13) goto L_0x022b
            int r0 = r13 + r2
            int r15 = r0 >>> 1
            int r9 = r15 * 3
            r11 = r14[r9]
            r0 = r17
            if (r0 == r11) goto L_0x006e
            if (r0 >= r11) goto L_0x0065
            int r13 = r15 + -1
            goto L_0x0052
        L_0x0065:
            int r2 = r15 + 1
            goto L_0x0052
        L_0x0068:
            r2 = r35
            int r9 = r2.A00(r0)
        L_0x006e:
            if (r9 == r3) goto L_0x022b
            r0 = r35
            int[] r0 = r0.A03
            r11 = r0
            int r0 = r9 + 1
            r13 = r11[r0]
            int r14 = X.BE7.A04(r13)
            r0 = r13 & r1
            long r2 = (long) r0
            r0 = 17
            if (r14 > r0) goto L_0x0190
            int r0 = r9 + 2
            r11 = r11[r0]
            int r0 = r11 >>> 20
            r16 = 1
            int r16 = r16 << r0
            r11 = r11 & r1
            r0 = r18
            if (r11 == r0) goto L_0x00a7
            if (r0 == r1) goto L_0x009b
            long r0 = (long) r0
            r15 = r19
            r10.putInt(r8, r0, r15)
        L_0x009b:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r11 == r0) goto L_0x00a5
            long r0 = (long) r11
            int r19 = r10.getInt(r8, r0)
        L_0x00a5:
            r18 = r11
        L_0x00a7:
            r0 = 5
            switch(r14) {
                case 0: goto L_0x00c5;
                case 1: goto L_0x00da;
                case 2: goto L_0x00ea;
                case 3: goto L_0x00ea;
                case 4: goto L_0x0161;
                case 5: goto L_0x00f4;
                case 6: goto L_0x0104;
                case 7: goto L_0x0110;
                case 8: goto L_0x0126;
                case 9: goto L_0x0138;
                case 10: goto L_0x0154;
                case 11: goto L_0x0161;
                case 12: goto L_0x0161;
                case 13: goto L_0x0104;
                case 14: goto L_0x00f4;
                case 15: goto L_0x016a;
                case 16: goto L_0x017a;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            X.Cmu r21 = A0I(r8)
            r20 = r6
            r22 = r5
            r23 = r12
            r24 = r4
            r25 = r36
            int r7 = A04(r20, r21, r22, r23, r24, r25)
        L_0x00bd:
            r2 = r17
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = -1
            goto L_0x001f
        L_0x00c5:
            r0 = 1
            if (r7 != r0) goto L_0x00ab
            long r0 = X.BEB.A0G(r5, r4)
            double r24 = java.lang.Double.longBitsToDouble(r0)
            X.CnD r20 = X.C26277CwW.A00
            r21 = r8
            r22 = r2
            r20.A07(r21, r22, r24)
            goto L_0x0100
        L_0x00da:
            if (r7 != r0) goto L_0x00ab
            int r0 = X.BEB.A08(r5, r4)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.CnD r0 = X.C26277CwW.A00
            r0.A08(r8, r2, r1)
            goto L_0x010d
        L_0x00ea:
            if (r7 != 0) goto L_0x00ab
            int r7 = A08(r6, r5, r4)
            long r0 = r6.A01
            goto L_0x0186
        L_0x00f4:
            r0 = 1
            if (r7 != r0) goto L_0x00ab
            long r14 = X.BEB.A0G(r5, r4)
            r11 = r8
            r12 = r2
            r10.putLong(r11, r12, r14)
        L_0x0100:
            int r7 = r4 + 8
            goto L_0x018c
        L_0x0104:
            if (r7 != r0) goto L_0x00ab
            int r0 = X.BEB.A08(r5, r4)
            r10.putInt(r8, r2, r0)
        L_0x010d:
            int r7 = r4 + 4
            goto L_0x018c
        L_0x0110:
            if (r7 != 0) goto L_0x00ab
            int r7 = A08(r6, r5, r4)
            long r0 = r6.A01
            r11 = 0
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r4)
            X.CnD r0 = X.C26277CwW.A00
            r0.A0B(r8, r2, r1)
            goto L_0x018c
        L_0x0126:
            r0 = 2
            if (r7 != r0) goto L_0x00ab
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r13 = r13 & r0
            if (r13 != 0) goto L_0x0133
            int r7 = A09(r6, r5, r4)
            goto L_0x015b
        L_0x0133:
            int r7 = A0A(r6, r5, r4)
            goto L_0x015b
        L_0x0138:
            r0 = 2
            if (r7 != r0) goto L_0x00ab
            r0 = r35
            X.EAD r1 = r0.A0H(r9)
            r0 = r36
            int r7 = A02(r6, r1, r5, r4, r0)
            java.lang.Object r1 = r10.getObject(r8, r2)
            if (r1 == 0) goto L_0x015b
            java.lang.Object r0 = r6.A02
            X.Bho r0 = X.C25462CgF.A00(r1, r0)
            goto L_0x015d
        L_0x0154:
            r0 = 2
            if (r7 != r0) goto L_0x00ab
            int r7 = A0B(r6, r5, r4)
        L_0x015b:
            java.lang.Object r0 = r6.A02
        L_0x015d:
            r10.putObject(r8, r2, r0)
            goto L_0x018c
        L_0x0161:
            if (r7 != 0) goto L_0x00ab
            int r7 = A07(r6, r5, r4)
            int r0 = r6.A00
            goto L_0x0176
        L_0x016a:
            if (r7 != 0) goto L_0x00ab
            int r7 = A07(r6, r5, r4)
            int r0 = r6.A00
            int r0 = X.BE7.A05(r0)
        L_0x0176:
            r10.putInt(r8, r2, r0)
            goto L_0x018c
        L_0x017a:
            if (r7 != 0) goto L_0x00ab
            int r7 = A08(r6, r5, r4)
            long r0 = r6.A01
            long r0 = X.BEA.A0G(r0)
        L_0x0186:
            r11 = r8
            r12 = r2
            r14 = r0
            r10.putLong(r11, r12, r14)
        L_0x018c:
            r19 = r19 | r16
            goto L_0x00bd
        L_0x0190:
            r0 = 27
            if (r14 != r0) goto L_0x01d3
            r0 = 2
            if (r7 != r0) goto L_0x00ab
            java.lang.Object r1 = r10.getObject(r8, r2)
            X.EE8 r1 = (X.EE8) r1
            r0 = r1
            X.DbN r0 = (X.C27294DbN) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01af
            int r0 = X.BEA.A0C(r1)
            X.EE8 r1 = r1.CSz(r0)
            r10.putObject(r8, r2, r1)
        L_0x01af:
            r0 = r35
            X.EAD r3 = r0.A0H(r9)
            r0 = r36
            int r7 = A02(r6, r3, r5, r4, r0)
        L_0x01bb:
            java.lang.Object r0 = r6.A02
            r1.add(r0)
            r0 = r36
            if (r7 >= r0) goto L_0x00bd
            int r2 = A07(r6, r5, r7)
            int r0 = r6.A00
            if (r12 != r0) goto L_0x00bd
            r0 = r36
            int r7 = A02(r6, r3, r5, r2, r0)
            goto L_0x01bb
        L_0x01d3:
            r0 = 49
            if (r14 > r0) goto L_0x01fb
            long r0 = (long) r13
            r27 = r17
            r28 = r7
            r29 = r9
            r30 = r14
            r31 = r0
            r33 = r2
            r21 = r6
            r22 = r8
            r23 = r5
            r24 = r4
            r25 = r36
            r26 = r12
            r20 = r35
            int r7 = r20.A06(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33)
        L_0x01f6:
            if (r7 != r4) goto L_0x00bd
            r4 = r7
            goto L_0x00ab
        L_0x01fb:
            r0 = 50
            if (r14 != r0) goto L_0x020c
            r0 = 2
            if (r7 != r0) goto L_0x00ab
            r10.getObject(r8, r2)
            java.lang.String r0 = "zzd"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x020c:
            r27 = r17
            r28 = r7
            r29 = r13
            r30 = r14
            r31 = r9
            r32 = r2
            r21 = r6
            r22 = r8
            r23 = r5
            r24 = r4
            r25 = r36
            r26 = r12
            r20 = r35
            int r7 = r20.A05(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x01f6
        L_0x022b:
            r9 = 0
            goto L_0x00ab
        L_0x022e:
            r0 = r18
            if (r0 == r1) goto L_0x0238
            long r1 = (long) r0
            r0 = r19
            r10.putInt(r8, r1, r0)
        L_0x0238:
            r0 = r36
            if (r7 == r0) goto L_0x0250
            java.lang.String r1 = "Failed to parse the message."
            X.BxG r0 = new X.BxG
            r0.<init>(r1)
            throw r0
        L_0x0244:
            r15 = 0
            r9 = r35
            r10 = r6
            r11 = r8
            r12 = r5
            r13 = r7
            r14 = r36
            r9.A0R(r10, r11, r12, r13, r14, r15)
        L_0x0250:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKD.CT8(X.CiB, java.lang.Object, byte[], int, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
        r6 = r3[r2 + 2];
        r0 = (long) (1048575 & r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        if (r0 == 1048575) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e5, code lost:
        r4 = X.C26277CwW.A00;
        r4.A09(r13, r0, (1 << (r6 >>> 20)) | r4.A04(r13, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c3, code lost:
        X.C26277CwW.A07(r13, r8, X.C26277CwW.A03(r14, r8));
        X.C26277CwW.A00.A09(r13, X.BE9.A0O(r3, r2), r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CTK(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x01e8
            r2 = 0
        L_0x0003:
            int[] r3 = r12.A03
            int r0 = r3.length
            r7 = r13
            if (r2 >= r0) goto L_0x01e4
            int r0 = r2 + 1
            r1 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r8 = (long) r0
            r4 = r3[r2]
            int r0 = X.BE7.A04(r1)
            switch(r0) {
                case 0: goto L_0x0078;
                case 1: goto L_0x0088;
                case 2: goto L_0x00c6;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00b6;
                case 5: goto L_0x00c6;
                case 6: goto L_0x00b6;
                case 7: goto L_0x0098;
                case 8: goto L_0x00a8;
                case 9: goto L_0x001e;
                case 10: goto L_0x00a8;
                case 11: goto L_0x00b6;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00b6;
                case 14: goto L_0x00c6;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00c6;
                case 17: goto L_0x001e;
                case 18: goto L_0x00f5;
                case 19: goto L_0x00f5;
                case 20: goto L_0x00f5;
                case 21: goto L_0x00f5;
                case 22: goto L_0x00f5;
                case 23: goto L_0x00f5;
                case 24: goto L_0x00f5;
                case 25: goto L_0x00f5;
                case 26: goto L_0x00f5;
                case 27: goto L_0x00f5;
                case 28: goto L_0x00f5;
                case 29: goto L_0x00f5;
                case 30: goto L_0x00f5;
                case 31: goto L_0x00f5;
                case 32: goto L_0x00f5;
                case 33: goto L_0x00f5;
                case 34: goto L_0x00f5;
                case 35: goto L_0x00f5;
                case 36: goto L_0x00f5;
                case 37: goto L_0x00f5;
                case 38: goto L_0x00f5;
                case 39: goto L_0x00f5;
                case 40: goto L_0x00f5;
                case 41: goto L_0x00f5;
                case 42: goto L_0x00f5;
                case 43: goto L_0x00f5;
                case 44: goto L_0x00f5;
                case 45: goto L_0x00f5;
                case 46: goto L_0x00f5;
                case 47: goto L_0x00f5;
                case 48: goto L_0x00f5;
                case 49: goto L_0x00f5;
                case 50: goto L_0x01d5;
                case 51: goto L_0x01b6;
                case 52: goto L_0x01b6;
                case 53: goto L_0x01b6;
                case 54: goto L_0x01b6;
                case 55: goto L_0x01b6;
                case 56: goto L_0x01b6;
                case 57: goto L_0x01b6;
                case 58: goto L_0x01b6;
                case 59: goto L_0x01b6;
                case 60: goto L_0x0040;
                case 61: goto L_0x01bd;
                case 62: goto L_0x01bd;
                case 63: goto L_0x01bd;
                case 64: goto L_0x01bd;
                case 65: goto L_0x01bd;
                case 66: goto L_0x01bd;
                case 67: goto L_0x01bd;
                case 68: goto L_0x0040;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r2 = r2 + 3
            goto L_0x0003
        L_0x001e:
            long r0 = X.BE9.A0N(r3, r2)
            boolean r4 = r12.A0P(r14, r2)
            if (r4 == 0) goto L_0x001b
            java.lang.Object r5 = X.C26277CwW.A03(r13, r0)
            java.lang.Object r4 = X.C26277CwW.A03(r14, r0)
            if (r5 == 0) goto L_0x003d
            if (r4 == 0) goto L_0x001b
            X.Bho r4 = X.C25462CgF.A00(r5, r4)
        L_0x0038:
            X.C26277CwW.A07(r13, r0, r4)
            goto L_0x00d5
        L_0x003d:
            if (r4 == 0) goto L_0x001b
            goto L_0x0038
        L_0x0040:
            int r0 = r2 + 1
            r0 = r3[r0]
            r6 = r3[r2]
            long r0 = X.BE6.A0M(r0)
            boolean r4 = r12.A0Q(r14, r6, r2)
            if (r4 == 0) goto L_0x001b
            boolean r4 = r12.A0Q(r13, r6, r2)
            if (r4 == 0) goto L_0x0076
            java.lang.Object r5 = X.C26277CwW.A03(r13, r0)
        L_0x005a:
            java.lang.Object r4 = X.C26277CwW.A03(r14, r0)
            if (r5 == 0) goto L_0x0073
            if (r4 == 0) goto L_0x001b
            X.Bho r4 = X.C25462CgF.A00(r5, r4)
        L_0x0066:
            X.C26277CwW.A07(r13, r0, r4)
            long r0 = X.BE9.A0O(r3, r2)
            X.CnD r3 = X.C26277CwW.A00
            r3.A09(r13, r0, r6)
            goto L_0x001b
        L_0x0073:
            if (r4 == 0) goto L_0x001b
            goto L_0x0066
        L_0x0076:
            r5 = 0
            goto L_0x005a
        L_0x0078:
            boolean r0 = r12.A0P(r14, r2)
            if (r0 == 0) goto L_0x001b
            X.CnD r6 = X.C26277CwW.A00
            double r10 = r6.A02(r14, r8)
            r6.A07(r7, r8, r10)
            goto L_0x00d5
        L_0x0088:
            boolean r0 = r12.A0P(r14, r2)
            if (r0 == 0) goto L_0x001b
            X.CnD r1 = X.C26277CwW.A00
            float r0 = r1.A03(r14, r8)
            r1.A08(r13, r8, r0)
            goto L_0x00d5
        L_0x0098:
            boolean r0 = r12.A0P(r14, r2)
            if (r0 == 0) goto L_0x001b
            X.CnD r1 = X.C26277CwW.A00
            boolean r0 = r1.A0C(r14, r8)
            r1.A0B(r13, r8, r0)
            goto L_0x00d5
        L_0x00a8:
            boolean r0 = r12.A0P(r14, r2)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = X.C26277CwW.A03(r14, r8)
            X.C26277CwW.A07(r13, r8, r0)
            goto L_0x00d5
        L_0x00b6:
            boolean r0 = r12.A0P(r14, r2)
            if (r0 == 0) goto L_0x001b
            X.CnD r1 = X.C26277CwW.A00
            int r0 = r1.A04(r14, r8)
            r1.A09(r13, r8, r0)
            goto L_0x00d5
        L_0x00c6:
            boolean r0 = r12.A0P(r14, r2)
            if (r0 == 0) goto L_0x001b
            X.CnD r6 = X.C26277CwW.A00
            long r10 = r6.A05(r14, r8)
            r6.A0A(r7, r8, r10)
        L_0x00d5:
            int r0 = r2 + 2
            r6 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r6
            long r0 = (long) r0
            r4 = 1048575(0xfffff, double:5.18065E-318)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x001b
            int r3 = r6 >>> 20
            r5 = 1
            int r5 = r5 << r3
            X.CnD r4 = X.C26277CwW.A00
            int r3 = r4.A04(r13, r0)
            r5 = r5 | r3
            r4.A09(r13, r0, r5)
            goto L_0x001b
        L_0x00f5:
            X.CHJ r0 = r12.A08
            boolean r0 = r0 instanceof X.C23486Bhq
            if (r0 == 0) goto L_0x0126
            java.lang.Object r5 = X.C26277CwW.A03(r13, r8)
            X.EE8 r5 = (X.EE8) r5
            java.util.List r4 = X.BE6.A12(r14, r8)
            int r3 = r5.size()
            int r1 = r4.size()
            if (r3 <= 0) goto L_0x0121
            if (r1 <= 0) goto L_0x0120
            r0 = r5
            X.DbN r0 = (X.C27294DbN) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x011d
            int r1 = r1 + r3
            X.EE8 r5 = r5.CSz(r1)
        L_0x011d:
            r5.addAll(r4)
        L_0x0120:
            r4 = r5
        L_0x0121:
            X.C26277CwW.A07(r13, r8, r4)
            goto L_0x001b
        L_0x0126:
            java.util.List r4 = X.BE6.A12(r14, r8)
            int r5 = r4.size()
            java.util.List r3 = X.BE6.A12(r13, r8)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0173
            boolean r0 = r3 instanceof X.EE3
            if (r0 == 0) goto L_0x015f
            X.BhD r0 = X.C23448BhD.A01
            java.util.ArrayList r0 = X.C17880vN.A0z(r5)
            X.BhD r3 = new X.BhD
            r3.<init>(r0)
        L_0x0147:
            X.C26277CwW.A07(r13, r8, r3)
        L_0x014a:
            int r1 = r3.size()
            int r0 = r4.size()
            if (r1 <= 0) goto L_0x015a
            if (r0 <= 0) goto L_0x0159
            r3.addAll(r4)
        L_0x0159:
            r4 = r3
        L_0x015a:
            X.C26277CwW.A07(r13, r8, r4)
            goto L_0x001b
        L_0x015f:
            boolean r0 = r3 instanceof X.E2B
            if (r0 == 0) goto L_0x016e
            boolean r0 = r3 instanceof X.EE8
            if (r0 == 0) goto L_0x016e
            X.EE8 r3 = (X.EE8) r3
            X.EE8 r3 = r3.CSz(r5)
            goto L_0x0147
        L_0x016e:
            java.util.ArrayList r3 = X.C17880vN.A0z(r5)
            goto L_0x0147
        L_0x0173:
            java.lang.Class r0 = X.C23487Bhr.A00
            boolean r0 = X.BE7.A1W(r0, r3)
            if (r0 == 0) goto L_0x0187
            java.util.ArrayList r1 = X.BE9.A0y(r3, r5)
        L_0x017f:
            r1.addAll(r3)
            X.C26277CwW.A07(r13, r8, r1)
            r3 = r1
            goto L_0x014a
        L_0x0187:
            boolean r0 = r3 instanceof X.C27295DbO
            if (r0 == 0) goto L_0x0197
            X.BhD r0 = X.C23448BhD.A01
            java.util.ArrayList r0 = X.BE9.A0y(r3, r5)
            X.BhD r1 = new X.BhD
            r1.<init>(r0)
            goto L_0x017f
        L_0x0197:
            boolean r0 = r3 instanceof X.E2B
            if (r0 == 0) goto L_0x014a
            boolean r0 = r3 instanceof X.EE8
            if (r0 == 0) goto L_0x014a
            r1 = r3
            X.EE8 r1 = (X.EE8) r1
            r0 = r1
            X.DbN r0 = (X.C27294DbN) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x014a
            int r0 = r3.size()
            int r0 = r0 + r5
            X.EE8 r3 = r1.CSz(r0)
            X.C26277CwW.A07(r13, r8, r3)
            goto L_0x014a
        L_0x01b6:
            boolean r0 = r12.A0Q(r14, r4, r2)
            if (r0 == 0) goto L_0x001b
            goto L_0x01c3
        L_0x01bd:
            boolean r0 = r12.A0Q(r14, r4, r2)
            if (r0 == 0) goto L_0x001b
        L_0x01c3:
            java.lang.Object r0 = X.C26277CwW.A03(r14, r8)
            X.C26277CwW.A07(r13, r8, r0)
            long r0 = X.BE9.A0O(r3, r2)
            X.CnD r3 = X.C26277CwW.A00
            r3.A09(r13, r0, r4)
            goto L_0x001b
        L_0x01d5:
            java.lang.Class r0 = X.C26301CxE.A03
            X.C26277CwW.A03(r13, r8)
            X.C26277CwW.A03(r14, r8)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01e4:
            X.C26301CxE.A0S(r13, r14)
            return
        L_0x01e8:
            java.lang.NullPointerException r0 = X.BE6.A0m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKD.CTK(java.lang.Object, java.lang.Object):void");
    }

    public final void CTR(Object obj) {
        Object unmodifiableList;
        C27294DbN dbN;
        int i = this.A05;
        while (true) {
            int i2 = this.A06;
            if (i < i2) {
                if (C26277CwW.A03(obj, BE9.A0N(this.A03, this.A0D[i])) != null) {
                    throw AnonymousClass000.A0s("zzc");
                }
                i++;
            } else {
                int[] iArr = this.A0D;
                int length = iArr.length;
                while (i2 < length) {
                    CHJ chj = this.A08;
                    long j = (long) iArr[i2];
                    if (chj instanceof C23486Bhq) {
                        dbN = (C27294DbN) ((EE8) C26277CwW.A03(obj, j));
                    } else {
                        List A12 = BE6.A12(obj, j);
                        if (A12 instanceof EE3) {
                            unmodifiableList = ((EE3) A12).CTa();
                        } else {
                            if (!BE7.A1W(C23487Bhr.A00, A12)) {
                                if (!(A12 instanceof E2B) || !(A12 instanceof EE8)) {
                                    unmodifiableList = Collections.unmodifiableList(A12);
                                } else {
                                    dbN = (C27294DbN) ((EE8) A12);
                                    if (!dbN.A00) {
                                    }
                                }
                            }
                            i2++;
                        }
                        C26277CwW.A07(obj, j, unmodifiableList);
                        i2++;
                    }
                    dbN.A00 = false;
                    i2++;
                }
                ((C23484Bho) obj).zzb.A02 = false;
                return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        r0 = X.C25462CgF.A00;
        r0 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dd, code lost:
        if (r1 == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00df, code lost:
        r0 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e8, code lost:
        r6 = r6 * 53;
        r0 = ((java.lang.String) X.C26277CwW.A03(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0125, code lost:
        r6 = r6 * 53;
        r0 = X.AnonymousClass000.A0M(X.C26277CwW.A03(r10, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0136, code lost:
        r6 = r6 * 53;
        r1 = A0F(r10, r1);
        r0 = X.C25462CgF.A00;
        r0 = X.AnonymousClass000.A0I(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0149, code lost:
        r6 = r6 * 53;
        r0 = X.C26277CwW.A03(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0153, code lost:
        r6 = r6 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r5 = r9.A03
            int r4 = r5.length
            r3 = 0
            r6 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x0156
            int r0 = r3 + 1
            r7 = r5[r0]
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r1 = (long) r0
            int r0 = X.BE7.A04(r7)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0032;
                case 2: goto L_0x0054;
                case 3: goto L_0x0054;
                case 4: goto L_0x004a;
                case 5: goto L_0x0054;
                case 6: goto L_0x004a;
                case 7: goto L_0x0040;
                case 8: goto L_0x00e8;
                case 9: goto L_0x0064;
                case 10: goto L_0x0149;
                case 11: goto L_0x004a;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x0054;
                case 15: goto L_0x004a;
                case 16: goto L_0x0054;
                case 17: goto L_0x0064;
                case 18: goto L_0x0149;
                case 19: goto L_0x0149;
                case 20: goto L_0x0149;
                case 21: goto L_0x0149;
                case 22: goto L_0x0149;
                case 23: goto L_0x0149;
                case 24: goto L_0x0149;
                case 25: goto L_0x0149;
                case 26: goto L_0x0149;
                case 27: goto L_0x0149;
                case 28: goto L_0x0149;
                case 29: goto L_0x0149;
                case 30: goto L_0x0149;
                case 31: goto L_0x0149;
                case 32: goto L_0x0149;
                case 33: goto L_0x0149;
                case 34: goto L_0x0149;
                case 35: goto L_0x0149;
                case 36: goto L_0x0149;
                case 37: goto L_0x0149;
                case 38: goto L_0x0149;
                case 39: goto L_0x0149;
                case 40: goto L_0x0149;
                case 41: goto L_0x0149;
                case 42: goto L_0x0149;
                case 43: goto L_0x0149;
                case 44: goto L_0x0149;
                case 45: goto L_0x0149;
                case 46: goto L_0x0149;
                case 47: goto L_0x0149;
                case 48: goto L_0x0149;
                case 49: goto L_0x0149;
                case 50: goto L_0x0149;
                case 51: goto L_0x0072;
                case 52: goto L_0x008e;
                case 53: goto L_0x00a4;
                case 54: goto L_0x00ac;
                case 55: goto L_0x00b4;
                case 56: goto L_0x00bb;
                case 57: goto L_0x00c2;
                case 58: goto L_0x00c9;
                case 59: goto L_0x00e2;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00fc;
                case 62: goto L_0x0103;
                case 63: goto L_0x010a;
                case 64: goto L_0x0111;
                case 65: goto L_0x0118;
                case 66: goto L_0x011f;
                case 67: goto L_0x0130;
                case 68: goto L_0x0143;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x001e:
            int r6 = r6 * 53
            X.CnD r0 = X.C26277CwW.A00
            double r0 = r0.A02(r10, r1)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            java.nio.charset.Charset r0 = X.C25462CgF.A00
            int r0 = X.AnonymousClass000.A0I(r1)
            goto L_0x0153
        L_0x0032:
            int r6 = r6 * 53
            X.CnD r0 = X.C26277CwW.A00
            float r0 = r0.A03(r10, r1)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0153
        L_0x0040:
            int r6 = r6 * 53
            X.CnD r0 = X.C26277CwW.A00
            boolean r1 = r0.A0C(r10, r1)
            goto L_0x00d9
        L_0x004a:
            int r6 = r6 * 53
            X.CnD r0 = X.C26277CwW.A00
            int r0 = r0.A04(r10, r1)
            goto L_0x0153
        L_0x0054:
            int r6 = r6 * 53
            X.CnD r0 = X.C26277CwW.A00
            long r1 = r0.A05(r10, r1)
            java.nio.charset.Charset r0 = X.C25462CgF.A00
            int r0 = X.AnonymousClass000.A0I(r1)
            goto L_0x0153
        L_0x0064:
            java.lang.Object r0 = X.C26277CwW.A03(r10, r1)
            if (r0 == 0) goto L_0x006e
            int r7 = r0.hashCode()
        L_0x006e:
            int r6 = r6 * 53
            int r6 = r6 + r7
            goto L_0x001b
        L_0x0072:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C26277CwW.A03(r10, r1)
            double r0 = X.AnonymousClass8BR.A00(r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            java.nio.charset.Charset r0 = X.C25462CgF.A00
            int r0 = X.AnonymousClass000.A0I(r1)
            goto L_0x0153
        L_0x008e:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C26277CwW.A03(r10, r1)
            float r0 = X.AnonymousClass000.A04(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0153
        L_0x00a4:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0136
        L_0x00ac:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0136
        L_0x00b4:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0125
        L_0x00bb:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0136
        L_0x00c2:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0125
        L_0x00c9:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C26277CwW.A03(r10, r1)
            boolean r1 = X.AnonymousClass000.A1Y(r0)
        L_0x00d9:
            java.nio.charset.Charset r0 = X.C25462CgF.A00
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0153
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L_0x0153
        L_0x00e2:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00e8:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C26277CwW.A03(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x0153
        L_0x00f5:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0149
        L_0x00fc:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0149
        L_0x0103:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0125
        L_0x010a:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0125
        L_0x0111:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0125
        L_0x0118:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0136
        L_0x011f:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0125:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C26277CwW.A03(r10, r1)
            int r0 = X.AnonymousClass000.A0M(r0)
            goto L_0x0153
        L_0x0130:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0136:
            int r6 = r6 * 53
            long r1 = A0F(r10, r1)
            java.nio.charset.Charset r0 = X.C25462CgF.A00
            int r0 = X.AnonymousClass000.A0I(r1)
            goto L_0x0153
        L_0x0143:
            boolean r0 = r9.A0Q(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0149:
            java.lang.Object r0 = X.C26277CwW.A03(r10, r1)
            int r6 = r6 * 53
            int r0 = r0.hashCode()
        L_0x0153:
            int r6 = r6 + r0
            goto L_0x001b
        L_0x0156:
            int r1 = r6 * 53
            X.Bho r10 = (X.C23484Bho) r10
            X.Cmu r0 = r10.zzb
            int r0 = X.AnonymousClass000.A0O(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKD.zza(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x041a, code lost:
        r12 = (r12 + r0) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0447, code lost:
        r12 = X.C25876Cnk.A04(r4) + X.C23450BhF.A02(A0F(r6, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0468, code lost:
        if (r1 >= 0) goto L_0x050b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0509, code lost:
        if (r1 >= 0) goto L_0x050b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x050b, code lost:
        r0 = X.C23450BhF.A05;
        r0 = X.BEB.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0511, code lost:
        r12 = r12 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0513, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x06a0, code lost:
        if (r1 >= 0) goto L_0x0a99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0845, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x09a8, code lost:
        r7 = (r7 + r0) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x09d5, code lost:
        r13 = X.C25876Cnk.A04(r7) + X.C23450BhF.A02(A0F(r6, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x09f6, code lost:
        if (r1 >= 0) goto L_0x0a99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0a97, code lost:
        if (r1 >= 0) goto L_0x0a99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0a99, code lost:
        r0 = X.C23450BhF.A05;
        r0 = X.BEB.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0a9f, code lost:
        r13 = r13 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0aa1, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0ab0, code lost:
        r15 = r15 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0150, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c6, code lost:
        if (r1 >= 0) goto L_0x050b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0263, code lost:
        if (r1 >= 0) goto L_0x050b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r18
            r5 = r17
            boolean r0 = r5.A0C
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 1
            r4 = 0
            sun.misc.Unsafe r3 = A0E
            if (r0 == 0) goto L_0x0593
            r7 = 0
            r13 = 0
        L_0x0013:
            int[] r2 = r5.A03
            int r0 = r2.length
            if (r7 >= r0) goto L_0x0589
            int r0 = r7 + 1
            r1 = r2[r0]
            r0 = r1 & r8
            int r8 = r0 >>> 20
            r4 = r2[r7]
            r1 = r1 & r16
            long r0 = (long) r1
            X.C01[] r2 = X.C01.A00
            switch(r8) {
                case 0: goto L_0x016c;
                case 1: goto L_0x017a;
                case 2: goto L_0x0188;
                case 3: goto L_0x019f;
                case 4: goto L_0x01b6;
                case 5: goto L_0x01ca;
                case 6: goto L_0x01d8;
                case 7: goto L_0x01e6;
                case 8: goto L_0x01f4;
                case 9: goto L_0x0204;
                case 10: goto L_0x0228;
                case 11: goto L_0x023a;
                case 12: goto L_0x0253;
                case 13: goto L_0x0267;
                case 14: goto L_0x0275;
                case 15: goto L_0x0283;
                case 16: goto L_0x0299;
                case 17: goto L_0x02b4;
                case 18: goto L_0x002f;
                case 19: goto L_0x0039;
                case 20: goto L_0x0043;
                case 21: goto L_0x005d;
                case 22: goto L_0x0073;
                case 23: goto L_0x0089;
                case 24: goto L_0x0093;
                case 25: goto L_0x009d;
                case 26: goto L_0x00b0;
                case 27: goto L_0x00ba;
                case 28: goto L_0x00c8;
                case 29: goto L_0x00d2;
                case 30: goto L_0x00e8;
                case 31: goto L_0x00fe;
                case 32: goto L_0x0108;
                case 33: goto L_0x0112;
                case 34: goto L_0x0128;
                case 35: goto L_0x02d3;
                case 36: goto L_0x02eb;
                case 37: goto L_0x0303;
                case 38: goto L_0x031b;
                case 39: goto L_0x0333;
                case 40: goto L_0x034b;
                case 41: goto L_0x0363;
                case 42: goto L_0x037b;
                case 43: goto L_0x0391;
                case 44: goto L_0x03a8;
                case 45: goto L_0x03bf;
                case 46: goto L_0x03d6;
                case 47: goto L_0x03ed;
                case 48: goto L_0x0404;
                case 49: goto L_0x013e;
                case 50: goto L_0x057f;
                case 51: goto L_0x041e;
                case 52: goto L_0x042c;
                case 53: goto L_0x043a;
                case 54: goto L_0x0441;
                case 55: goto L_0x0456;
                case 56: goto L_0x046c;
                case 57: goto L_0x047a;
                case 58: goto L_0x0488;
                case 59: goto L_0x0496;
                case 60: goto L_0x04a6;
                case 61: goto L_0x04ca;
                case 62: goto L_0x04dc;
                case 63: goto L_0x04f7;
                case 64: goto L_0x0516;
                case 65: goto L_0x0523;
                case 66: goto L_0x0530;
                case 67: goto L_0x0547;
                case 68: goto L_0x055f;
                default: goto L_0x002a;
            }
        L_0x002a:
            int r7 = r7 + 3
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0013
        L_0x002f:
            java.util.List r0 = X.BE6.A12(r6, r0)
            int r12 = X.C26301CxE.A0B(r0, r4)
            goto L_0x057c
        L_0x0039:
            java.util.List r0 = X.BE6.A12(r6, r0)
            int r12 = X.C26301CxE.A0A(r0, r4)
            goto L_0x057c
        L_0x0043:
            java.util.List r2 = X.BE6.A12(r6, r0)
            java.lang.Class r0 = X.C26301CxE.A03
            int r0 = r2.size()
            if (r0 == 0) goto L_0x0150
            int r1 = X.C26301CxE.A01(r2)
            int r0 = r2.size()
            int r12 = A01(r4, r0, r1)
            goto L_0x057c
        L_0x005d:
            java.util.List r2 = X.BE6.A12(r6, r0)
            java.lang.Class r0 = X.C26301CxE.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0150
            int r0 = X.C26301CxE.A02(r2)
            int r12 = A01(r4, r1, r0)
            goto L_0x057c
        L_0x0073:
            java.util.List r2 = X.BE6.A12(r6, r0)
            java.lang.Class r0 = X.C26301CxE.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0150
            int r0 = X.C26301CxE.A05(r2)
            int r12 = A01(r4, r1, r0)
            goto L_0x057c
        L_0x0089:
            java.util.List r0 = X.BE6.A12(r6, r0)
            int r12 = X.C26301CxE.A0B(r0, r4)
            goto L_0x057c
        L_0x0093:
            java.util.List r0 = X.BE6.A12(r6, r0)
            int r12 = X.C26301CxE.A0A(r0, r4)
            goto L_0x057c
        L_0x009d:
            java.lang.Object r0 = X.C26277CwW.A03(r6, r0)
            int r12 = A0D(r0)
            if (r12 == 0) goto L_0x0150
            int r0 = X.C25876Cnk.A04(r4)
            int r0 = r0 + 1
            int r12 = r12 * r0
            goto L_0x057c
        L_0x00b0:
            java.util.List r0 = X.BE6.A12(r6, r0)
            int r12 = X.C26301CxE.A08(r0, r4)
            goto L_0x057c
        L_0x00ba:
            java.util.List r1 = X.BE6.A12(r6, r0)
            X.EAD r0 = r5.A0H(r7)
            int r12 = X.C26301CxE.A00(r0, r1, r4)
            goto L_0x057c
        L_0x00c8:
            java.util.List r0 = X.BE6.A12(r6, r0)
            int r12 = X.C26301CxE.A09(r0, r4)
            goto L_0x057c
        L_0x00d2:
            java.util.List r2 = X.BE6.A12(r6, r0)
            java.lang.Class r0 = X.C26301CxE.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0150
            int r0 = X.C26301CxE.A06(r2)
            int r12 = A01(r4, r1, r0)
            goto L_0x057c
        L_0x00e8:
            java.util.List r2 = X.BE6.A12(r6, r0)
            java.lang.Class r0 = X.C26301CxE.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0150
            int r0 = X.C26301CxE.A04(r2)
            int r12 = A01(r4, r1, r0)
            goto L_0x057c
        L_0x00fe:
            java.util.List r0 = X.BE6.A12(r6, r0)
            int r12 = X.C26301CxE.A0A(r0, r4)
            goto L_0x057c
        L_0x0108:
            java.util.List r0 = X.BE6.A12(r6, r0)
            int r12 = X.C26301CxE.A0B(r0, r4)
            goto L_0x057c
        L_0x0112:
            java.util.List r2 = X.BE6.A12(r6, r0)
            java.lang.Class r0 = X.C26301CxE.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0150
            int r0 = X.C26301CxE.A07(r2)
            int r12 = A01(r4, r1, r0)
            goto L_0x057c
        L_0x0128:
            java.util.List r2 = X.BE6.A12(r6, r0)
            java.lang.Class r0 = X.C26301CxE.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0150
            int r0 = X.C26301CxE.A03(r2)
            int r12 = A01(r4, r1, r0)
            goto L_0x057c
        L_0x013e:
            java.util.List r11 = X.BE6.A12(r6, r0)
            X.EAD r10 = r5.A0H(r7)
            java.lang.Class r0 = X.C26301CxE.A03
            int r9 = r11.size()
            r8 = 0
            r12 = 0
            if (r9 != 0) goto L_0x0153
        L_0x0150:
            r12 = 0
            goto L_0x057c
        L_0x0153:
            if (r8 >= r9) goto L_0x057c
            java.lang.Object r2 = r11.get(r8)
            X.EDa r2 = (X.C28663EDa) r2
            boolean r0 = X.C23450BhF.A05
            int r0 = X.C25876Cnk.A04(r4)
            int r1 = r0 << 1
            int r0 = X.DK6.A06(r10, r2)
            int r1 = r1 + r0
            int r12 = r12 + r1
            int r8 = r8 + 1
            goto L_0x0153
        L_0x016c:
            boolean r0 = r5.A0P(r6, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 8
            goto L_0x057c
        L_0x017a:
            boolean r0 = r5.A0P(r6, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 4
            goto L_0x057c
        L_0x0188:
            boolean r2 = r5.A0P(r6, r7)
            if (r2 == 0) goto L_0x002a
            X.CnD r2 = X.C26277CwW.A00
            long r0 = r2.A05(r6, r0)
            int r12 = X.C25876Cnk.A04(r4)
            int r0 = X.C23450BhF.A02(r0)
            int r12 = r12 + r0
            goto L_0x057c
        L_0x019f:
            boolean r2 = r5.A0P(r6, r7)
            if (r2 == 0) goto L_0x002a
            X.CnD r2 = X.C26277CwW.A00
            long r0 = r2.A05(r6, r0)
            int r12 = X.C25876Cnk.A04(r4)
            int r0 = X.C23450BhF.A02(r0)
            int r12 = r12 + r0
            goto L_0x057c
        L_0x01b6:
            boolean r2 = r5.A0P(r6, r7)
            if (r2 == 0) goto L_0x002a
            X.CnD r2 = X.C26277CwW.A00
            int r1 = r2.A04(r6, r0)
            int r12 = X.C25876Cnk.A04(r4)
            if (r1 < 0) goto L_0x0513
            goto L_0x050b
        L_0x01ca:
            boolean r0 = r5.A0P(r6, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 8
            goto L_0x057c
        L_0x01d8:
            boolean r0 = r5.A0P(r6, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 4
            goto L_0x057c
        L_0x01e6:
            boolean r0 = r5.A0P(r6, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 1
            goto L_0x057c
        L_0x01f4:
            boolean r2 = r5.A0P(r6, r7)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C26277CwW.A03(r6, r0)
            int r12 = A0E(r0, r4)
            goto L_0x057c
        L_0x0204:
            boolean r2 = r5.A0P(r6, r7)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = X.C26277CwW.A03(r6, r0)
            X.EAD r1 = r5.A0H(r7)
            java.lang.Class r0 = X.C26301CxE.A03
            X.EDa r2 = (X.C28663EDa) r2
            boolean r0 = X.C23450BhF.A05
            int r12 = X.C25876Cnk.A04(r4)
            int r1 = X.DK6.A06(r1, r2)
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            int r12 = r12 + r0
            goto L_0x057c
        L_0x0228:
            boolean r2 = r5.A0P(r6, r7)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C26277CwW.A03(r6, r0)
            X.DSO r0 = (X.DSO) r0
            int r12 = X.C23450BhF.A03(r0, r4)
            goto L_0x057c
        L_0x023a:
            boolean r2 = r5.A0P(r6, r7)
            if (r2 == 0) goto L_0x002a
            X.CnD r2 = X.C26277CwW.A00
            int r1 = r2.A04(r6, r0)
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            int r12 = r12 + r0
            goto L_0x057c
        L_0x0253:
            boolean r2 = r5.A0P(r6, r7)
            if (r2 == 0) goto L_0x002a
            X.CnD r2 = X.C26277CwW.A00
            int r1 = r2.A04(r6, r0)
            int r12 = X.C25876Cnk.A04(r4)
            if (r1 < 0) goto L_0x0513
            goto L_0x050b
        L_0x0267:
            boolean r0 = r5.A0P(r6, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 4
            goto L_0x057c
        L_0x0275:
            boolean r0 = r5.A0P(r6, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 8
            goto L_0x057c
        L_0x0283:
            boolean r2 = r5.A0P(r6, r7)
            if (r2 == 0) goto L_0x002a
            X.CnD r2 = X.C26277CwW.A00
            int r1 = r2.A04(r6, r0)
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = X.C25876Cnk.A05(r1, r0)
            goto L_0x057c
        L_0x0299:
            boolean r2 = r5.A0P(r6, r7)
            if (r2 == 0) goto L_0x002a
            X.CnD r2 = X.C26277CwW.A00
            long r0 = r2.A05(r6, r0)
            int r12 = X.C25876Cnk.A04(r4)
            long r0 = X.BE9.A0L(r0)
            int r0 = X.C23450BhF.A02(r0)
            int r12 = r12 + r0
            goto L_0x057c
        L_0x02b4:
            boolean r2 = r5.A0P(r6, r7)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = X.C26277CwW.A03(r6, r0)
            X.EDa r2 = (X.C28663EDa) r2
            X.EAD r1 = r5.A0H(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 << 1
            int r0 = X.DK6.A06(r1, r2)
            int r12 = r12 + r0
            goto L_0x057c
        L_0x02d3:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x041a
        L_0x02eb:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x041a
        L_0x0303:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A01(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x041a
        L_0x031b:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A02(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x041a
        L_0x0333:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A05(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x041a
        L_0x034b:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x041a
        L_0x0363:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x041a
        L_0x037b:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r1 = A0D(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x041a
        L_0x0391:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A06(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x041a
        L_0x03a8:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A04(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x041a
        L_0x03bf:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x041a
        L_0x03d6:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x041a
        L_0x03ed:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A07(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x041a
        L_0x0404:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A03(r0)
            if (r1 <= 0) goto L_0x002a
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
        L_0x041a:
            int r12 = r12 + r0
            int r12 = r12 + r1
            goto L_0x057c
        L_0x041e:
            boolean r0 = r5.A0Q(r6, r4, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 8
            goto L_0x057c
        L_0x042c:
            boolean r0 = r5.A0Q(r6, r4, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 4
            goto L_0x057c
        L_0x043a:
            boolean r2 = r5.A0Q(r6, r4, r7)
            if (r2 == 0) goto L_0x002a
            goto L_0x0447
        L_0x0441:
            boolean r2 = r5.A0Q(r6, r4, r7)
            if (r2 == 0) goto L_0x002a
        L_0x0447:
            long r0 = A0F(r6, r0)
            int r12 = X.C25876Cnk.A04(r4)
            int r0 = X.C23450BhF.A02(r0)
            int r12 = r12 + r0
            goto L_0x057c
        L_0x0456:
            boolean r2 = r5.A0Q(r6, r4, r7)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C26277CwW.A03(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r12 = X.C25876Cnk.A04(r4)
            if (r1 < 0) goto L_0x0513
            goto L_0x050b
        L_0x046c:
            boolean r0 = r5.A0Q(r6, r4, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 8
            goto L_0x057c
        L_0x047a:
            boolean r0 = r5.A0Q(r6, r4, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 4
            goto L_0x057c
        L_0x0488:
            boolean r0 = r5.A0Q(r6, r4, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 1
            goto L_0x057c
        L_0x0496:
            boolean r2 = r5.A0Q(r6, r4, r7)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C26277CwW.A03(r6, r0)
            int r12 = A0E(r0, r4)
            goto L_0x057c
        L_0x04a6:
            boolean r2 = r5.A0Q(r6, r4, r7)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = X.C26277CwW.A03(r6, r0)
            X.EAD r1 = r5.A0H(r7)
            java.lang.Class r0 = X.C26301CxE.A03
            X.EDa r2 = (X.C28663EDa) r2
            boolean r0 = X.C23450BhF.A05
            int r12 = X.C25876Cnk.A04(r4)
            int r1 = X.DK6.A06(r1, r2)
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            int r12 = r12 + r0
            goto L_0x057c
        L_0x04ca:
            boolean r2 = r5.A0Q(r6, r4, r7)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C26277CwW.A03(r6, r0)
            X.DSO r0 = (X.DSO) r0
            int r12 = X.C23450BhF.A03(r0, r4)
            goto L_0x057c
        L_0x04dc:
            boolean r2 = r5.A0Q(r6, r4, r7)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C26277CwW.A03(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r12 = X.C25876Cnk.A04(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            int r12 = r12 + r0
            goto L_0x057c
        L_0x04f7:
            boolean r2 = r5.A0Q(r6, r4, r7)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C26277CwW.A03(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r12 = X.C25876Cnk.A04(r4)
            if (r1 < 0) goto L_0x0513
        L_0x050b:
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
        L_0x0511:
            int r12 = r12 + r0
            goto L_0x057c
        L_0x0513:
            r0 = 10
            goto L_0x0511
        L_0x0516:
            boolean r0 = r5.A0Q(r6, r4, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 4
            goto L_0x057c
        L_0x0523:
            boolean r0 = r5.A0Q(r6, r4, r7)
            if (r0 == 0) goto L_0x002a
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 + 8
            goto L_0x057c
        L_0x0530:
            boolean r2 = r5.A0Q(r6, r4, r7)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r0 = X.C26277CwW.A03(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = X.C25876Cnk.A05(r1, r0)
            goto L_0x057c
        L_0x0547:
            boolean r2 = r5.A0Q(r6, r4, r7)
            if (r2 == 0) goto L_0x002a
            long r0 = A0F(r6, r0)
            int r12 = X.C25876Cnk.A04(r4)
            long r0 = X.BE9.A0L(r0)
            int r0 = X.C23450BhF.A02(r0)
            int r12 = r12 + r0
            goto L_0x057c
        L_0x055f:
            boolean r2 = r5.A0Q(r6, r4, r7)
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = X.C26277CwW.A03(r6, r0)
            X.EDa r2 = (X.C28663EDa) r2
            X.EAD r1 = r5.A0H(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.C25876Cnk.A04(r4)
            int r12 = r0 << 1
            int r0 = X.DK6.A06(r1, r2)
            int r12 = r12 + r0
        L_0x057c:
            int r13 = r13 + r12
            goto L_0x002a
        L_0x057f:
            X.C26277CwW.A03(r6, r0)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0589:
            X.Bho r6 = (X.C23484Bho) r6
            X.Cmu r0 = r6.zzb
            int r0 = r0.A00()
            int r13 = r13 + r0
            return r13
        L_0x0593:
            r15 = 0
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r14 = 0
        L_0x0598:
            int[] r1 = r5.A03
            int r0 = r1.length
            if (r4 >= r0) goto L_0x0b1c
            int r0 = r4 + 1
            r10 = r1[r0]
            r7 = r1[r4]
            int r9 = X.BE7.A04(r10)
            r0 = 17
            if (r9 > r0) goto L_0x0b0f
            int r0 = r4 + 2
            r0 = r1[r0]
            r8 = r0 & r16
            int r0 = r0 >>> 20
            int r11 = r11 << r0
            if (r8 == r2) goto L_0x05bc
            long r0 = (long) r8
            int r14 = r3.getInt(r6, r0)
            r2 = r8
        L_0x05bc:
            r10 = r10 & r16
            long r0 = (long) r10
            switch(r9) {
                case 0: goto L_0x05d2;
                case 1: goto L_0x05c6;
                case 2: goto L_0x05de;
                case 3: goto L_0x05f0;
                case 4: goto L_0x0602;
                case 5: goto L_0x061b;
                case 6: goto L_0x0627;
                case 7: goto L_0x0633;
                case 8: goto L_0x063f;
                case 9: goto L_0x064d;
                case 10: goto L_0x066f;
                case 11: goto L_0x067f;
                case 12: goto L_0x0694;
                case 13: goto L_0x06a4;
                case 14: goto L_0x06b0;
                case 15: goto L_0x06bc;
                case 16: goto L_0x06ce;
                case 17: goto L_0x06e5;
                case 18: goto L_0x0702;
                case 19: goto L_0x070e;
                case 20: goto L_0x071a;
                case 21: goto L_0x0736;
                case 22: goto L_0x074e;
                case 23: goto L_0x0766;
                case 24: goto L_0x0772;
                case 25: goto L_0x077e;
                case 26: goto L_0x0791;
                case 27: goto L_0x079d;
                case 28: goto L_0x07ad;
                case 29: goto L_0x07b9;
                case 30: goto L_0x07d1;
                case 31: goto L_0x07e9;
                case 32: goto L_0x07f5;
                case 33: goto L_0x0801;
                case 34: goto L_0x0819;
                case 35: goto L_0x0861;
                case 36: goto L_0x0879;
                case 37: goto L_0x0891;
                case 38: goto L_0x08a9;
                case 39: goto L_0x08c1;
                case 40: goto L_0x08d9;
                case 41: goto L_0x08f1;
                case 42: goto L_0x0909;
                case 43: goto L_0x091f;
                case 44: goto L_0x0936;
                case 45: goto L_0x094d;
                case 46: goto L_0x0964;
                case 47: goto L_0x097b;
                case 48: goto L_0x0992;
                case 49: goto L_0x0831;
                case 50: goto L_0x0b12;
                case 51: goto L_0x09ac;
                case 52: goto L_0x09ba;
                case 53: goto L_0x09c8;
                case 54: goto L_0x09cf;
                case 55: goto L_0x09e4;
                case 56: goto L_0x09fa;
                case 57: goto L_0x0a08;
                case 58: goto L_0x0a16;
                case 59: goto L_0x0a24;
                case 60: goto L_0x0a34;
                case 61: goto L_0x0a58;
                case 62: goto L_0x0a6a;
                case 63: goto L_0x0a85;
                case 64: goto L_0x0aa4;
                case 65: goto L_0x0ab3;
                case 66: goto L_0x0ac0;
                case 67: goto L_0x0ad7;
                case 68: goto L_0x0aef;
                default: goto L_0x05c2;
            }
        L_0x05c2:
            int r4 = r4 + 3
            r11 = 1
            goto L_0x0598
        L_0x05c6:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r13 = r0 + 4
            goto L_0x0b0c
        L_0x05d2:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r13 = r0 + 8
            goto L_0x0b0c
        L_0x05de:
            r11 = r11 & r14
            if (r11 == 0) goto L_0x05c2
            long r0 = r3.getLong(r6, r0)
            int r7 = X.C25876Cnk.A04(r7)
            int r0 = X.C23450BhF.A02(r0)
            int r7 = r7 + r0
            goto L_0x0ab0
        L_0x05f0:
            r11 = r11 & r14
            if (r11 == 0) goto L_0x05c2
            long r0 = r3.getLong(r6, r0)
            int r7 = X.C25876Cnk.A04(r7)
            int r0 = X.C23450BhF.A02(r0)
            int r7 = r7 + r0
            goto L_0x0ab0
        L_0x0602:
            r11 = r11 & r14
            if (r11 == 0) goto L_0x05c2
            int r1 = r3.getInt(r6, r0)
            int r7 = X.C25876Cnk.A04(r7)
            if (r1 < 0) goto L_0x0618
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
        L_0x0615:
            int r7 = r7 + r0
            goto L_0x0ab0
        L_0x0618:
            r0 = 10
            goto L_0x0615
        L_0x061b:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r7 = r0 + 8
            goto L_0x0ab0
        L_0x0627:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r7 = r0 + 4
            goto L_0x0ab0
        L_0x0633:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r7 = r0 + 1
            goto L_0x0ab0
        L_0x063f:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x05c2
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r13 = A0E(r0, r7)
            goto L_0x0b0c
        L_0x064d:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x05c2
            java.lang.Object r8 = r3.getObject(r6, r0)
            X.EAD r1 = r5.A0H(r4)
            java.lang.Class r0 = X.C26301CxE.A03
            X.EDa r8 = (X.C28663EDa) r8
            boolean r0 = X.C23450BhF.A05
            int r13 = X.C25876Cnk.A04(r7)
            int r1 = X.DK6.A06(r1, r8)
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            int r13 = r13 + r0
            goto L_0x0b0c
        L_0x066f:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x05c2
            java.lang.Object r0 = r3.getObject(r6, r0)
            X.DSO r0 = (X.DSO) r0
            int r13 = X.C23450BhF.A03(r0, r7)
            goto L_0x0b0c
        L_0x067f:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x05c2
            int r1 = r3.getInt(r6, r0)
            int r13 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            int r13 = r13 + r0
            goto L_0x0b0c
        L_0x0694:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x05c2
            int r1 = r3.getInt(r6, r0)
            int r13 = X.C25876Cnk.A04(r7)
            if (r1 < 0) goto L_0x0aa1
            goto L_0x0a99
        L_0x06a4:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r7 = r0 + 4
            goto L_0x0ab0
        L_0x06b0:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r13 = r0 + 8
            goto L_0x0b0c
        L_0x06bc:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x05c2
            int r1 = r3.getInt(r6, r0)
            int r0 = X.C25876Cnk.A04(r7)
            int r13 = X.C25876Cnk.A05(r1, r0)
            goto L_0x0b0c
        L_0x06ce:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x05c2
            long r0 = r3.getLong(r6, r0)
            int r13 = X.C25876Cnk.A04(r7)
            long r0 = X.BE9.A0L(r0)
            int r0 = X.C23450BhF.A02(r0)
            int r13 = r13 + r0
            goto L_0x0b0c
        L_0x06e5:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x05c2
            java.lang.Object r8 = r3.getObject(r6, r0)
            X.EDa r8 = (X.C28663EDa) r8
            X.EAD r1 = r5.A0H(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.C25876Cnk.A04(r7)
            int r13 = r0 << 1
            int r0 = X.DK6.A06(r1, r8)
            int r13 = r13 + r0
            goto L_0x0b0c
        L_0x0702:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C26301CxE.A0B(r0, r7)
            goto L_0x0b0c
        L_0x070e:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C26301CxE.A0A(r0, r7)
            goto L_0x0b0c
        L_0x071a:
            java.lang.Object r8 = r3.getObject(r6, r0)
            java.util.List r8 = (java.util.List) r8
            java.lang.Class r0 = X.C26301CxE.A03
            int r0 = r8.size()
            if (r0 == 0) goto L_0x0845
            int r1 = X.C26301CxE.A01(r8)
            int r0 = r8.size()
            int r13 = A01(r7, r0, r1)
            goto L_0x0b0c
        L_0x0736:
            java.lang.Object r8 = r3.getObject(r6, r0)
            java.util.List r8 = (java.util.List) r8
            java.lang.Class r0 = X.C26301CxE.A03
            int r1 = r8.size()
            if (r1 == 0) goto L_0x0845
            int r0 = X.C26301CxE.A02(r8)
            int r13 = A01(r7, r1, r0)
            goto L_0x0b0c
        L_0x074e:
            java.lang.Object r8 = r3.getObject(r6, r0)
            java.util.List r8 = (java.util.List) r8
            java.lang.Class r0 = X.C26301CxE.A03
            int r1 = r8.size()
            if (r1 == 0) goto L_0x0845
            int r0 = X.C26301CxE.A05(r8)
            int r13 = A01(r7, r1, r0)
            goto L_0x0b0c
        L_0x0766:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C26301CxE.A0B(r0, r7)
            goto L_0x0b0c
        L_0x0772:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C26301CxE.A0A(r0, r7)
            goto L_0x0b0c
        L_0x077e:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r13 = A0D(r0)
            if (r13 == 0) goto L_0x0845
            int r0 = X.C25876Cnk.A04(r7)
            int r0 = r0 + 1
            int r13 = r13 * r0
            goto L_0x0b0c
        L_0x0791:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C26301CxE.A08(r0, r7)
            goto L_0x0b0c
        L_0x079d:
            java.lang.Object r1 = r3.getObject(r6, r0)
            java.util.List r1 = (java.util.List) r1
            X.EAD r0 = r5.A0H(r4)
            int r13 = X.C26301CxE.A00(r0, r1, r7)
            goto L_0x0b0c
        L_0x07ad:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C26301CxE.A09(r0, r7)
            goto L_0x0b0c
        L_0x07b9:
            java.lang.Object r8 = r3.getObject(r6, r0)
            java.util.List r8 = (java.util.List) r8
            java.lang.Class r0 = X.C26301CxE.A03
            int r1 = r8.size()
            if (r1 == 0) goto L_0x0845
            int r0 = X.C26301CxE.A06(r8)
            int r13 = A01(r7, r1, r0)
            goto L_0x0b0c
        L_0x07d1:
            java.lang.Object r8 = r3.getObject(r6, r0)
            java.util.List r8 = (java.util.List) r8
            java.lang.Class r0 = X.C26301CxE.A03
            int r1 = r8.size()
            if (r1 == 0) goto L_0x0845
            int r0 = X.C26301CxE.A04(r8)
            int r13 = A01(r7, r1, r0)
            goto L_0x0b0c
        L_0x07e9:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C26301CxE.A0A(r0, r7)
            goto L_0x0b0c
        L_0x07f5:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C26301CxE.A0B(r0, r7)
            goto L_0x0b0c
        L_0x0801:
            java.lang.Object r8 = r3.getObject(r6, r0)
            java.util.List r8 = (java.util.List) r8
            java.lang.Class r0 = X.C26301CxE.A03
            int r1 = r8.size()
            if (r1 == 0) goto L_0x0845
            int r0 = X.C26301CxE.A07(r8)
            int r13 = A01(r7, r1, r0)
            goto L_0x0b0c
        L_0x0819:
            java.lang.Object r8 = r3.getObject(r6, r0)
            java.util.List r8 = (java.util.List) r8
            java.lang.Class r0 = X.C26301CxE.A03
            int r1 = r8.size()
            if (r1 == 0) goto L_0x0845
            int r0 = X.C26301CxE.A03(r8)
            int r13 = A01(r7, r1, r0)
            goto L_0x0b0c
        L_0x0831:
            java.lang.Object r12 = r3.getObject(r6, r0)
            java.util.List r12 = (java.util.List) r12
            X.EAD r11 = r5.A0H(r4)
            java.lang.Class r0 = X.C26301CxE.A03
            int r10 = r12.size()
            r9 = 0
            r13 = 0
            if (r10 != 0) goto L_0x0848
        L_0x0845:
            r13 = 0
            goto L_0x0b0c
        L_0x0848:
            if (r9 >= r10) goto L_0x0b0c
            java.lang.Object r8 = r12.get(r9)
            X.EDa r8 = (X.C28663EDa) r8
            boolean r0 = X.C23450BhF.A05
            int r0 = X.C25876Cnk.A04(r7)
            int r1 = r0 << 1
            int r0 = X.DK6.A06(r11, r8)
            int r1 = r1 + r0
            int r13 = r13 + r1
            int r9 = r9 + 1
            goto L_0x0848
        L_0x0861:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x09a8
        L_0x0879:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x09a8
        L_0x0891:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A01(r0)
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x09a8
        L_0x08a9:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A02(r0)
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x09a8
        L_0x08c1:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A05(r0)
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x09a8
        L_0x08d9:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x09a8
        L_0x08f1:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x09a8
        L_0x0909:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r1 = A0D(r0)
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x09a8
        L_0x091f:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A06(r0)
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x09a8
        L_0x0936:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A04(r0)
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x09a8
        L_0x094d:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x09a8
        L_0x0964:
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x09a8
        L_0x097b:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A07(r0)
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            goto L_0x09a8
        L_0x0992:
            java.lang.Object r0 = r3.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26301CxE.A03(r0)
            if (r1 <= 0) goto L_0x05c2
            int r7 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
        L_0x09a8:
            int r7 = r7 + r0
            int r7 = r7 + r1
            goto L_0x0ab0
        L_0x09ac:
            boolean r0 = r5.A0Q(r6, r7, r4)
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r13 = r0 + 8
            goto L_0x0b0c
        L_0x09ba:
            boolean r0 = r5.A0Q(r6, r7, r4)
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r7 = r0 + 4
            goto L_0x0ab0
        L_0x09c8:
            boolean r8 = r5.A0Q(r6, r7, r4)
            if (r8 == 0) goto L_0x05c2
            goto L_0x09d5
        L_0x09cf:
            boolean r8 = r5.A0Q(r6, r7, r4)
            if (r8 == 0) goto L_0x05c2
        L_0x09d5:
            long r0 = A0F(r6, r0)
            int r13 = X.C25876Cnk.A04(r7)
            int r0 = X.C23450BhF.A02(r0)
            int r13 = r13 + r0
            goto L_0x0b0c
        L_0x09e4:
            boolean r8 = r5.A0Q(r6, r7, r4)
            if (r8 == 0) goto L_0x05c2
            java.lang.Object r0 = X.C26277CwW.A03(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r13 = X.C25876Cnk.A04(r7)
            if (r1 < 0) goto L_0x0aa1
            goto L_0x0a99
        L_0x09fa:
            boolean r0 = r5.A0Q(r6, r7, r4)
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r13 = r0 + 8
            goto L_0x0b0c
        L_0x0a08:
            boolean r0 = r5.A0Q(r6, r7, r4)
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r7 = r0 + 4
            goto L_0x0ab0
        L_0x0a16:
            boolean r0 = r5.A0Q(r6, r7, r4)
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r7 = r0 + 1
            goto L_0x0ab0
        L_0x0a24:
            boolean r8 = r5.A0Q(r6, r7, r4)
            if (r8 == 0) goto L_0x05c2
            java.lang.Object r0 = r3.getObject(r6, r0)
            int r13 = A0E(r0, r7)
            goto L_0x0b0c
        L_0x0a34:
            boolean r8 = r5.A0Q(r6, r7, r4)
            if (r8 == 0) goto L_0x05c2
            java.lang.Object r8 = r3.getObject(r6, r0)
            X.EAD r1 = r5.A0H(r4)
            java.lang.Class r0 = X.C26301CxE.A03
            X.EDa r8 = (X.C28663EDa) r8
            boolean r0 = X.C23450BhF.A05
            int r13 = X.C25876Cnk.A04(r7)
            int r1 = X.DK6.A06(r1, r8)
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            int r13 = r13 + r0
            goto L_0x0b0c
        L_0x0a58:
            boolean r8 = r5.A0Q(r6, r7, r4)
            if (r8 == 0) goto L_0x05c2
            java.lang.Object r0 = r3.getObject(r6, r0)
            X.DSO r0 = (X.DSO) r0
            int r13 = X.C23450BhF.A03(r0, r7)
            goto L_0x0b0c
        L_0x0a6a:
            boolean r8 = r5.A0Q(r6, r7, r4)
            if (r8 == 0) goto L_0x05c2
            java.lang.Object r0 = X.C26277CwW.A03(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r13 = X.C25876Cnk.A04(r7)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            int r13 = r13 + r0
            goto L_0x0b0c
        L_0x0a85:
            boolean r8 = r5.A0Q(r6, r7, r4)
            if (r8 == 0) goto L_0x05c2
            java.lang.Object r0 = X.C26277CwW.A03(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r13 = X.C25876Cnk.A04(r7)
            if (r1 < 0) goto L_0x0aa1
        L_0x0a99:
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
        L_0x0a9f:
            int r13 = r13 + r0
            goto L_0x0b0c
        L_0x0aa1:
            r0 = 10
            goto L_0x0a9f
        L_0x0aa4:
            boolean r0 = r5.A0Q(r6, r7, r4)
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r7 = r0 + 4
        L_0x0ab0:
            int r15 = r15 + r7
            goto L_0x05c2
        L_0x0ab3:
            boolean r0 = r5.A0Q(r6, r7, r4)
            if (r0 == 0) goto L_0x05c2
            int r0 = X.C25876Cnk.A04(r7)
            int r13 = r0 + 8
            goto L_0x0b0c
        L_0x0ac0:
            boolean r8 = r5.A0Q(r6, r7, r4)
            if (r8 == 0) goto L_0x05c2
            java.lang.Object r0 = X.C26277CwW.A03(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r0 = X.C25876Cnk.A04(r7)
            int r13 = X.C25876Cnk.A05(r1, r0)
            goto L_0x0b0c
        L_0x0ad7:
            boolean r8 = r5.A0Q(r6, r7, r4)
            if (r8 == 0) goto L_0x05c2
            long r0 = A0F(r6, r0)
            int r13 = X.C25876Cnk.A04(r7)
            long r0 = X.BE9.A0L(r0)
            int r0 = X.C23450BhF.A02(r0)
            int r13 = r13 + r0
            goto L_0x0b0c
        L_0x0aef:
            boolean r8 = r5.A0Q(r6, r7, r4)
            if (r8 == 0) goto L_0x05c2
            java.lang.Object r8 = r3.getObject(r6, r0)
            X.EDa r8 = (X.C28663EDa) r8
            X.EAD r1 = r5.A0H(r4)
            boolean r0 = X.C23450BhF.A05
            int r0 = X.C25876Cnk.A04(r7)
            int r13 = r0 << 1
            int r0 = X.DK6.A06(r1, r8)
            int r13 = r13 + r0
        L_0x0b0c:
            int r15 = r15 + r13
            goto L_0x05c2
        L_0x0b0f:
            r11 = 0
            goto L_0x05bc
        L_0x0b12:
            r3.getObject(r6, r0)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0b1c:
            X.Bho r6 = (X.C23484Bho) r6
            X.Cmu r0 = r6.zzb
            int r0 = r0.A00()
            int r15 = r15 + r0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKD.zzb(java.lang.Object):int");
    }

    public DKD(CBH cbh, CHJ chj, E28 e28, C28663EDa eDa, E2A e2a, CBJ cbj, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
        this.A03 = iArr;
        this.A04 = objArr;
        this.A00 = i;
        this.A01 = i2;
        this.A0C = z;
        this.A0D = iArr2;
        this.A05 = i3;
        this.A06 = i4;
        this.A0A = e2a;
        this.A08 = chj;
        this.A0B = cbj;
        this.A07 = cbh;
        this.A09 = eDa;
        this.A02 = e28;
    }

    public static int A09(C25572CiB ciB, byte[] bArr, int i) {
        int A072 = A07(ciB, bArr, i);
        int i2 = ciB.A00;
        if (i2 < 0) {
            throw new C24204BxG("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i2 == 0) {
            ciB.A02 = "";
            return A072;
        } else {
            ciB.A02 = BE6.A0r(C25462CgF.A00, bArr, A072, i2);
            return A072 + i2;
        }
    }

    public static int A0B(C25572CiB ciB, byte[] bArr, int i) {
        int A072 = A07(ciB, bArr, i);
        int i2 = ciB.A00;
        if (i2 >= 0) {
            int length = bArr.length;
            if (i2 > length - A072) {
                throw new C24204BxG("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } else if (i2 == 0) {
                ciB.A02 = DSO.A00;
                return A072;
            } else {
                DSO.A00(A072, A072 + i2, length);
                ciB.A02 = new C23452BhH(DSO.A01.CT6(bArr, A072, i2));
                return A072 + i2;
            }
        } else {
            throw new C24204BxG("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public static long A0F(Object obj, long j) {
        return ((Number) C26277CwW.A03(obj, j)).longValue();
    }

    public static Object A0J(Object obj, int i) {
        return C26277CwW.A03(obj, (long) (i & 1048575));
    }

    public static Field A0K(Class cls, String str) {
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
            StringBuilder A0s = BEA.A0s(arrays, BE8.A0C(str) + 40 + BE8.A0C(name));
            BEA.A1S(A0s, str);
            A0s.append(name);
            throw BEA.A0g(" not found. Known fields are ", arrays, A0s);
        }
    }

    public static List A0L(int i, Object obj) {
        return (List) C26277CwW.A03(obj, (long) (i & 1048575));
    }

    public final boolean CTY(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A05) {
            int i4 = this.A0D[i3];
            int[] iArr = this.A03;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i) {
                i8 = i;
            } else if (i8 != 1048575) {
                i2 = A0E.getInt(obj, (long) i8);
            }
            if ((268435456 & i6) != 0) {
                if (i8 == 1048575) {
                    if (!A0P(obj, i4)) {
                        return false;
                    }
                } else if ((i2 & i9) == 0) {
                    return false;
                }
            }
            int i10 = (267386880 & i6) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        z = A0Q(obj, i5, i4);
                    } else if (i10 != 49) {
                        if (i10 == 50) {
                            C26277CwW.A03(obj, (long) (i6 & 1048575));
                            throw AnonymousClass000.A0s("isEmpty");
                        }
                        i3++;
                        i = i8;
                    }
                }
                List A0L = A0L(i6, obj);
                if (!A0L.isEmpty()) {
                    EAD A0H = A0H(i4);
                    for (int i11 = 0; i11 < A0L.size(); i11++) {
                        if (!A0H.CTY(A0L.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
                i3++;
                i = i8;
            } else if (i8 == 1048575) {
                z = A0P(obj, i4);
            } else {
                z = i2 & i9;
            }
            if (z && !A0H(i4).CTY(A0J(obj, i6))) {
                return false;
            }
            i3++;
            i = i8;
        }
        return true;
    }
}
