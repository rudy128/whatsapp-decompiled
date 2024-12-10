package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

public final class DNG implements EAO {
    public static final Unsafe A0F = UnsafeUtil.A02();
    public static final int[] A0G = new int[0];
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C25037CUq A04;
    public final int[] A05;
    public final int[] A06;
    public final Object[] A07;
    public final C24609CBn A08;
    public final C25879Cnq A09;
    public final C28668EDk A0A;
    public final C24611CBp A0B;
    public final C25096CXo A0C;
    public final boolean A0D;
    public final boolean A0E;

    public static int A04(C25573CiD ciD, EAO eao, Object obj, byte[] bArr, int i, int i2, int i3) {
        Object obj2 = obj;
        int A0f = ((DNG) eao).A0f(ciD, obj2, bArr, i, i2, i3);
        ciD.A02 = obj2;
        return A0f;
    }

    public static int A05(C25573CiD ciD, EAO eao, byte[] bArr, int i, int i2, int i3) {
        EAO eao2 = eao;
        C23577Bm6 BkG = eao.BkG();
        C25573CiD ciD2 = ciD;
        int A042 = A04(ciD2, eao2, BkG, bArr, i, i2, i3);
        eao2.Bih(BkG);
        ciD2.A02 = BkG;
        return A042;
    }

    public static int A06(C25573CiD ciD, C26042Cr6 cr6, byte[] bArr, int i, int i2, int i3) {
        Object A012;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            C25573CiD ciD2 = ciD;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A0E2 = A0E(ciD, bArr, i2);
                cr6.A02(i, Long.valueOf(ciD.A01));
                return A0E2;
            } else if (i5 == 1) {
                cr6.A02(i, Long.valueOf(BEB.A0G(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A0D2 = A0D(ciD, bArr, i2);
                int i6 = ciD.A00;
                if (i6 < 0) {
                    throw BE7.A0N();
                } else if (i6 <= bArr.length - A0D2) {
                    if (i6 == 0) {
                        A012 = DSQ.A00;
                    } else {
                        A012 = DSQ.A01(bArr, A0D2, i6);
                    }
                    cr6.A02(i, A012);
                    return A0D2 + i6;
                } else {
                    throw BE7.A0M();
                }
            } else if (i5 == 3) {
                C26042Cr6 cr62 = new C26042Cr6();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A0D(ciD2, bArr, i4);
                    i8 = ciD2.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A06(ciD2, cr62, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw BE6.A0c("Failed to parse the message.");
                }
                cr6.A02(i, cr62);
                return i4;
            } else if (i5 == 5) {
                cr6.A02(i, Integer.valueOf(BEB.A08(bArr, i2)));
                return i2 + 4;
            }
        }
        throw BE6.A0c("Protocol message contained an invalid tag (zero).");
    }

    private int A00(int i) {
        if (i >= this.A02 && i <= this.A01) {
            int i2 = 0;
            int[] iArr = this.A05;
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
        return i3 + (i2 * CodedOutputStream.A02(i << 3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A03(X.C25573CiD r5, X.EAO r6, java.lang.Object r7, byte[] r8, int r9, int r10) {
        /*
            int r4 = r9 + 1
            r3 = r8
            byte r0 = r8[r9]
            r1 = r5
            if (r0 >= 0) goto L_0x0010
            int r4 = A0F(r5, r8, r0, r4)
            int r0 = r5.A00
            if (r0 < 0) goto L_0x001d
        L_0x0010:
            int r10 = r10 - r4
            if (r0 > r10) goto L_0x001d
            int r5 = r4 + r0
            r0 = r6
            r2 = r7
            r0.Bjm(r1, r2, r3, r4, r5)
            r1.A02 = r7
            return r5
        L_0x001d:
            X.1PN r0 = X.BE7.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.A03(X.CiD, X.EAO, java.lang.Object, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        r6.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        return r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        r6.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r6.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        return r10 + 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A07(X.C25573CiD r6, X.C24362Bzx r7, java.lang.Class r8, byte[] r9, int r10, int r11) {
        /*
            int[] r0 = X.CFp.A00
            int r0 = X.BE6.A0E(r7, r0)
            switch(r0) {
                case 1: goto L_0x0044;
                case 2: goto L_0x0057;
                case 3: goto L_0x0010;
                case 4: goto L_0x002a;
                case 5: goto L_0x002a;
                case 6: goto L_0x0037;
                case 7: goto L_0x0037;
                case 8: goto L_0x001d;
                case 9: goto L_0x005c;
                case 10: goto L_0x005c;
                case 11: goto L_0x005c;
                case 12: goto L_0x0067;
                case 13: goto L_0x0067;
                case 14: goto L_0x0097;
                case 15: goto L_0x0072;
                case 16: goto L_0x0081;
                case 17: goto L_0x0092;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "unsupported field type."
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x0010:
            long r0 = X.BEB.A0G(r9, r10)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x003f
        L_0x001d:
            int r0 = X.BEB.A08(r9, r10)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0032
        L_0x002a:
            int r0 = X.BEB.A08(r9, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0032:
            r6.A02 = r0
            int r5 = r10 + 4
            return r5
        L_0x0037:
            long r0 = X.BEB.A0G(r9, r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x003f:
            r6.A02 = r0
            int r5 = r10 + 8
            return r5
        L_0x0044:
            int r5 = A0E(r6, r9, r10)
            long r3 = r6.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x008f
        L_0x0057:
            int r5 = A0B(r6, r9, r10)
            return r5
        L_0x005c:
            int r5 = A0D(r6, r9, r10)
            int r0 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x008f
        L_0x0067:
            int r5 = A0E(r6, r9, r10)
            long r0 = r6.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x008f
        L_0x0072:
            int r5 = A0D(r6, r9, r10)
            int r0 = r6.A00
            int r0 = X.BE7.A05(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x008f
        L_0x0081:
            int r5 = A0E(r6, r9, r10)
            long r0 = r6.A01
            long r0 = X.BEA.A0G(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x008f:
            r6.A02 = r0
            return r5
        L_0x0092:
            int r5 = A0C(r6, r9, r10)
            return r5
        L_0x0097:
            X.Cjr r0 = X.C25661Cjr.A02
            X.EAO r7 = r0.A00(r8)
            X.Bm6 r8 = r7.BkG()
            int r5 = A03(r6, r7, r8, r9, r10, r11)
            r7.Bih(r8)
            r6.A02 = r8
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.A07(X.CiD, X.Bzx, java.lang.Class, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0027, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0147, code lost:
        r5.putObject(r8, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014a, code lost:
        r5.putInt(r8, r15, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014e, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016a, code lost:
        r5.putObject(r8, X.BE9.A0N(r2, r1), r3);
        com.google.protobuf.UnsafeUtil.A04(r8, X.BE6.A0M(r2[r17]), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017a, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A08(X.C25573CiD r26, java.lang.Object r27, byte[] r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, long r37) {
        /*
            r25 = this;
            r7 = r29
            sun.misc.Unsafe r5 = A0F
            r12 = r25
            int[] r2 = r12.A05
            r1 = r36
            int r17 = r36 + 2
            r0 = r2[r17]
            long r15 = X.BE6.A0M(r0)
            r11 = 5
            r0 = 2
            r10 = r26
            r8 = r27
            r9 = r28
            r23 = r30
            r14 = r31
            r6 = r32
            r13 = r33
            r3 = r37
            switch(r35) {
                case 51: goto L_0x0028;
                case 52: goto L_0x003e;
                case 53: goto L_0x0053;
                case 54: goto L_0x0053;
                case 55: goto L_0x0061;
                case 56: goto L_0x006f;
                case 57: goto L_0x0081;
                case 58: goto L_0x0092;
                case 59: goto L_0x00a8;
                case 60: goto L_0x00db;
                case 61: goto L_0x00f2;
                case 62: goto L_0x0061;
                case 63: goto L_0x00fe;
                case 64: goto L_0x0081;
                case 65: goto L_0x006f;
                case 66: goto L_0x0126;
                case 67: goto L_0x0137;
                case 68: goto L_0x014f;
                default: goto L_0x0027;
            }
        L_0x0027:
            return r7
        L_0x0028:
            r0 = 1
            if (r13 != r0) goto L_0x0027
            long r0 = X.BEB.A0G(r9, r7)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.putObject(r8, r3, r0)
            int r7 = r29 + 8
            goto L_0x014a
        L_0x003e:
            if (r13 != r11) goto L_0x0027
            int r0 = X.BEB.A08(r9, r7)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.putObject(r8, r3, r0)
            int r7 = r29 + 4
            goto L_0x014a
        L_0x0053:
            if (r33 != 0) goto L_0x0027
            int r7 = A0E(r10, r9, r7)
            long r0 = r10.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0147
        L_0x0061:
            if (r33 != 0) goto L_0x0027
            int r7 = A0D(r10, r9, r7)
            int r0 = r10.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0147
        L_0x006f:
            r0 = 1
            if (r13 != r0) goto L_0x0027
            long r0 = X.BEB.A0G(r9, r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.putObject(r8, r3, r0)
            int r7 = r29 + 8
            goto L_0x014a
        L_0x0081:
            if (r13 != r11) goto L_0x0027
            int r0 = X.BEB.A08(r9, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.putObject(r8, r3, r0)
            int r7 = r29 + 4
            goto L_0x014a
        L_0x0092:
            if (r33 != 0) goto L_0x0027
            int r7 = A0E(r10, r9, r7)
            long r0 = r10.A01
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0147
        L_0x00a8:
            if (r13 != r0) goto L_0x0027
            int r7 = A0D(r10, r9, r7)
            int r2 = r10.A00
            if (r2 != 0) goto L_0x00b9
            java.lang.String r0 = ""
            r5.putObject(r8, r3, r0)
            goto L_0x014a
        L_0x00b9:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r34 = r34 & r0
            if (r34 == 0) goto L_0x00d0
            int r1 = r7 + r2
            X.CZV r0 = X.C25412CfK.A00
            int r0 = r0.A02(r9, r7, r1)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.1PN r0 = X.BE6.A0c(r0)
            throw r0
        L_0x00d0:
            java.nio.charset.Charset r0 = X.CIC.A04
            java.lang.String r0 = X.BE6.A0r(r0, r9, r7, r2)
            r5.putObject(r8, r3, r0)
            int r7 = r7 + r2
            goto L_0x014a
        L_0x00db:
            if (r13 != r0) goto L_0x0027
            java.lang.Object r3 = r12.A0S(r8, r6, r1)
            X.EAO r19 = r12.A0N(r1)
            r20 = r3
            r21 = r9
            r22 = r7
            r18 = r10
            int r7 = A03(r18, r19, r20, r21, r22, r23)
            goto L_0x016a
        L_0x00f2:
            if (r13 != r0) goto L_0x0027
            int r7 = A0B(r10, r9, r7)
            java.lang.Object r0 = r10.A02
            r5.putObject(r8, r3, r0)
            goto L_0x014a
        L_0x00fe:
            if (r33 != 0) goto L_0x0027
            int r7 = A0D(r10, r9, r7)
            int r2 = r10.A00
            X.E69 r0 = A0L(r12, r1)
            if (r0 == 0) goto L_0x011e
            boolean r0 = r0.Bf4(r2)
            if (r0 != 0) goto L_0x011e
            X.Cr6 r1 = A0O(r8)
            java.lang.Long r0 = X.C17880vN.A0n(r2)
            r1.A02(r14, r0)
            return r7
        L_0x011e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.putObject(r8, r3, r0)
            goto L_0x014a
        L_0x0126:
            if (r33 != 0) goto L_0x0027
            int r7 = A0D(r10, r9, r7)
            int r0 = r10.A00
            int r0 = X.BE7.A05(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0147
        L_0x0137:
            if (r33 != 0) goto L_0x0027
            int r7 = A0E(r10, r9, r7)
            long r0 = r10.A01
            long r0 = X.BEA.A0G(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0147:
            r5.putObject(r8, r3, r0)
        L_0x014a:
            r0 = r15
            r5.putInt(r8, r0, r6)
            return r7
        L_0x014f:
            r0 = 3
            if (r13 != r0) goto L_0x0027
            java.lang.Object r3 = r12.A0S(r8, r6, r1)
            r0 = r31 & -8
            r24 = r0 | 4
            X.EAO r19 = r12.A0N(r1)
            r20 = r3
            r21 = r9
            r22 = r7
            r18 = r10
            int r7 = A04(r18, r19, r20, r21, r22, r23, r24)
        L_0x016a:
            long r0 = X.BE9.A0N(r2, r1)
            r5.putObject(r8, r0, r3)
            r0 = r2[r17]
            long r0 = X.BE6.A0M(r0)
            com.google.protobuf.UnsafeUtil.A04(r8, r0, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.A08(X.CiD, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x028e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x031a, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A09(X.C25573CiD r23, java.lang.Object r24, byte[] r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, long r33, long r35) {
        /*
            r22 = this;
            r10 = r26
            sun.misc.Unsafe r5 = A0F
            r13 = r24
            r0 = r35
            java.lang.Object r15 = r5.getObject(r13, r0)
            X.EE9 r15 = (X.EE9) r15
            r2 = r15
            X.DbR r2 = (X.C27296DbR) r2
            boolean r2 = r2.A00
            r4 = 2
            if (r2 != 0) goto L_0x0027
            int r3 = r15.size()
            int r2 = r3 * 2
            if (r3 != 0) goto L_0x0020
            r2 = 10
        L_0x0020:
            X.EE9 r15 = r15.Bk8(r2)
            r5.putObject(r13, r0, r15)
        L_0x0027:
            r6 = 5
            r0 = 1
            r3 = r22
            r7 = r23
            r9 = r25
            r11 = r27
            r2 = r28
            r1 = r30
            r5 = r31
            switch(r32) {
                case 18: goto L_0x005c;
                case 19: goto L_0x007e;
                case 20: goto L_0x00a0;
                case 21: goto L_0x00a0;
                case 22: goto L_0x01ca;
                case 23: goto L_0x003a;
                case 24: goto L_0x0204;
                case 25: goto L_0x00c8;
                case 26: goto L_0x00f0;
                case 27: goto L_0x0243;
                case 28: goto L_0x0166;
                case 29: goto L_0x01ca;
                case 30: goto L_0x028f;
                case 31: goto L_0x0204;
                case 32: goto L_0x003a;
                case 33: goto L_0x02d8;
                case 34: goto L_0x01a2;
                case 35: goto L_0x005c;
                case 36: goto L_0x007e;
                case 37: goto L_0x00a0;
                case 38: goto L_0x00a0;
                case 39: goto L_0x01ca;
                case 40: goto L_0x003a;
                case 41: goto L_0x0204;
                case 42: goto L_0x00c8;
                case 43: goto L_0x01ca;
                case 44: goto L_0x028f;
                case 45: goto L_0x0204;
                case 46: goto L_0x003a;
                case 47: goto L_0x02d8;
                case 48: goto L_0x01a2;
                case 49: goto L_0x0270;
                default: goto L_0x003a;
            }
        L_0x003a:
            if (r1 != r4) goto L_0x0053
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = r0 + r10
            if (r10 >= r0) goto L_0x004c
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x004c:
            if (r10 == r0) goto L_0x031a
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x0053:
            if (r1 != r0) goto L_0x031a
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x005c:
            if (r1 != r4) goto L_0x0075
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = r0 + r10
            if (r10 >= r0) goto L_0x006e
            java.lang.String r0 = "addDouble"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x006e:
            if (r10 == r0) goto L_0x031a
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x0075:
            if (r1 != r0) goto L_0x031a
            java.lang.String r0 = "addDouble"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x007e:
            if (r1 != r4) goto L_0x0097
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = r0 + r10
            if (r10 >= r0) goto L_0x0090
            java.lang.String r0 = "addFloat"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0090:
            if (r10 == r0) goto L_0x031a
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x0097:
            if (r1 != r6) goto L_0x031a
            java.lang.String r0 = "addFloat"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00a0:
            if (r1 != r4) goto L_0x00bc
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = r0 + r10
            if (r10 >= r0) goto L_0x00b5
            A0E(r7, r9, r10)
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00b5:
            if (r10 == r0) goto L_0x031a
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x00bc:
            if (r30 != 0) goto L_0x031a
            A0E(r7, r9, r10)
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00c8:
            if (r1 != r4) goto L_0x00e4
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = r0 + r10
            if (r10 >= r0) goto L_0x00dd
            A0E(r7, r9, r10)
            java.lang.String r0 = "addBoolean"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00dd:
            if (r10 == r0) goto L_0x031a
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x00e4:
            if (r30 != 0) goto L_0x031a
            A0E(r7, r9, r10)
            java.lang.String r0 = "addBoolean"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00f0:
            if (r1 != r4) goto L_0x031a
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r33 = r33 & r0
            r3 = 0
            int r0 = (r33 > r3 ? 1 : (r33 == r3 ? 0 : -1))
            int r10 = A0D(r7, r9, r10)
            if (r0 != 0) goto L_0x012b
            int r1 = r7.A00
            if (r1 < 0) goto L_0x0126
            java.lang.String r3 = ""
        L_0x0107:
            if (r1 != 0) goto L_0x011f
            r15.add(r3)
        L_0x010c:
            if (r10 >= r11) goto L_0x031a
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x031a
            int r10 = A0D(r7, r9, r1)
            int r1 = r7.A00
            if (r1 < 0) goto L_0x0126
            goto L_0x0107
        L_0x011f:
            java.nio.charset.Charset r0 = X.CIC.A04
            X.BE8.A1H(r0, r15, r9, r10, r1)
            int r10 = r10 + r1
            goto L_0x010c
        L_0x0126:
            X.1PN r0 = X.BE7.A0N()
            throw r0
        L_0x012b:
            int r4 = r7.A00
            if (r4 < 0) goto L_0x0161
            java.lang.String r3 = ""
        L_0x0131:
            if (r4 != 0) goto L_0x0149
            r15.add(r3)
        L_0x0136:
            if (r10 >= r11) goto L_0x031a
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x031a
            int r10 = A0D(r7, r9, r1)
            int r4 = r7.A00
            if (r4 < 0) goto L_0x0161
            goto L_0x0131
        L_0x0149:
            int r1 = r10 + r4
            X.CZV r0 = X.C25412CfK.A00
            int r0 = r0.A02(r9, r10, r1)
            if (r0 != 0) goto L_0x015a
            java.nio.charset.Charset r0 = X.CIC.A04
            X.BE8.A1H(r0, r15, r9, r10, r4)
            int r10 = r10 + r4
            goto L_0x0136
        L_0x015a:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.1PN r0 = X.BE6.A0c(r0)
            throw r0
        L_0x0161:
            X.1PN r0 = X.BE7.A0N()
            throw r0
        L_0x0166:
            if (r1 != r4) goto L_0x031a
            int r10 = A0D(r7, r9, r10)
            int r1 = r7.A00
            if (r1 < 0) goto L_0x019d
            int r3 = r9.length
        L_0x0171:
            int r0 = r3 - r10
            if (r1 > r0) goto L_0x0198
            if (r1 != 0) goto L_0x018f
            X.DSQ r0 = X.DSQ.A00
            r15.add(r0)
        L_0x017c:
            if (r10 >= r11) goto L_0x031a
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x031a
            int r10 = A0D(r7, r9, r1)
            int r1 = r7.A00
            if (r1 < 0) goto L_0x019d
            goto L_0x0171
        L_0x018f:
            X.BmB r0 = X.DSQ.A01(r9, r10, r1)
            r15.add(r0)
            int r10 = r10 + r1
            goto L_0x017c
        L_0x0198:
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x019d:
            X.1PN r0 = X.BE7.A0N()
            throw r0
        L_0x01a2:
            if (r1 != r4) goto L_0x01be
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = r0 + r10
            if (r10 >= r0) goto L_0x01b7
            A0E(r7, r9, r10)
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01b7:
            if (r10 == r0) goto L_0x031a
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x01be:
            if (r30 != 0) goto L_0x031a
            A0E(r7, r9, r10)
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01ca:
            if (r1 != r4) goto L_0x01e8
            X.Bm7 r15 = (X.Bm7) r15
            int r10 = A0D(r7, r9, r10)
            int r1 = r7.A00
            int r1 = r1 + r10
        L_0x01d5:
            if (r10 >= r1) goto L_0x01e1
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            r15.BBE(r0)
            goto L_0x01d5
        L_0x01e1:
            if (r10 == r1) goto L_0x031a
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x01e8:
            if (r30 != 0) goto L_0x031a
            X.Bm7 r15 = (X.Bm7) r15
            int r10 = A0D(r7, r9, r10)
        L_0x01f0:
            int r0 = r7.A00
            r15.BBE(r0)
            if (r10 >= r11) goto L_0x031a
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x031a
            int r10 = A0D(r7, r9, r1)
            goto L_0x01f0
        L_0x0204:
            if (r1 != r4) goto L_0x0222
            X.Bm7 r15 = (X.Bm7) r15
            int r10 = A0D(r7, r9, r10)
            int r1 = r7.A00
            int r1 = r1 + r10
        L_0x020f:
            if (r10 >= r1) goto L_0x021b
            int r0 = X.BEB.A08(r9, r10)
            r15.BBE(r0)
            int r10 = r10 + 4
            goto L_0x020f
        L_0x021b:
            if (r10 == r1) goto L_0x031a
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x0222:
            if (r1 != r6) goto L_0x031a
            X.Bm7 r15 = (X.Bm7) r15
            int r0 = X.BEB.A08(r9, r10)
            r15.BBE(r0)
            int r10 = r26 + 4
        L_0x022f:
            if (r10 >= r11) goto L_0x031a
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x031a
            int r0 = X.BEB.A08(r9, r1)
            r15.BBE(r0)
            int r10 = r1 + 4
            goto L_0x022f
        L_0x0243:
            if (r1 != r4) goto L_0x031a
            X.EAO r1 = r3.A0N(r5)
        L_0x0249:
            X.Bm6 r0 = r1.BkG()
            r16 = r7
            r18 = r0
            r19 = r9
            r20 = r10
            r21 = r11
            r17 = r1
            int r3 = A03(r16, r17, r18, r19, r20, r21)
            r1.Bih(r0)
            r7.A02 = r0
            r15.add(r0)
            if (r3 >= r11) goto L_0x028e
            int r10 = A0D(r7, r9, r3)
            int r0 = r7.A00
            if (r2 == r0) goto L_0x0249
            return r3
        L_0x0270:
            r0 = 3
            if (r1 != r0) goto L_0x031a
            X.EAO r8 = r3.A0N(r5)
            r0 = r28 & -8
            r12 = r0 | 4
        L_0x027b:
            int r3 = A05(r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r7.A02
            r15.add(r0)
            if (r3 >= r11) goto L_0x028e
            int r10 = A0D(r7, r9, r3)
            int r0 = r7.A00
            if (r2 == r0) goto L_0x027b
        L_0x028e:
            return r3
        L_0x028f:
            if (r1 != r4) goto L_0x02ae
            r2 = r15
            X.Bm7 r2 = (X.Bm7) r2
            int r10 = A0D(r7, r9, r10)
            int r1 = r7.A00
            int r1 = r1 + r10
        L_0x029b:
            if (r10 >= r1) goto L_0x02a7
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            r2.BBE(r0)
            goto L_0x029b
        L_0x02a7:
            if (r10 == r1) goto L_0x02cb
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x02ae:
            if (r30 != 0) goto L_0x031a
            r4 = r15
            X.Bm7 r4 = (X.Bm7) r4
            int r10 = A0D(r7, r9, r10)
        L_0x02b7:
            int r0 = r7.A00
            r4.BBE(r0)
            if (r10 >= r11) goto L_0x02cb
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x02cb
            int r10 = A0D(r7, r9, r1)
            goto L_0x02b7
        L_0x02cb:
            X.E69 r11 = A0L(r3, r5)
            r14 = 0
            X.CXo r12 = r3.A0C
            r16 = r29
            X.C26298CxB.A0A(r11, r12, r13, r14, r15, r16)
            return r10
        L_0x02d8:
            if (r1 != r4) goto L_0x02fa
            X.Bm7 r15 = (X.Bm7) r15
            int r10 = A0D(r7, r9, r10)
            int r1 = r7.A00
            int r1 = r1 + r10
        L_0x02e3:
            if (r10 >= r1) goto L_0x02f3
            int r10 = A0D(r7, r9, r10)
            int r0 = r7.A00
            int r0 = X.BE7.A05(r0)
            r15.BBE(r0)
            goto L_0x02e3
        L_0x02f3:
            if (r10 == r1) goto L_0x031a
            X.1PN r0 = X.BE7.A0M()
            throw r0
        L_0x02fa:
            if (r30 != 0) goto L_0x031a
            X.Bm7 r15 = (X.Bm7) r15
            int r10 = A0D(r7, r9, r10)
        L_0x0302:
            int r0 = r7.A00
            int r0 = X.BE7.A05(r0)
            r15.BBE(r0)
            if (r10 >= r11) goto L_0x031a
            int r1 = A0D(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x031a
            int r10 = A0D(r7, r9, r1)
            goto L_0x0302
        L_0x031a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.A09(X.CiD, java.lang.Object, byte[], int, int, int, int, int, int, int, long, long):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A0A(X.C25573CiD r17, java.lang.Object r18, byte[] r19, int r20, int r21, int r22, long r23) {
        /*
            r16 = this;
            sun.misc.Unsafe r4 = A0F
            r0 = r16
            java.lang.Object[] r1 = r0.A07
            int r0 = r22 / 3
            int r0 = r0 * 2
            r3 = r1[r0]
            r5 = r18
            r1 = r23
            java.lang.Object r6 = r4.getObject(r5, r1)
            r0 = r6
            X.Dbz r0 = (X.C27328Dbz) r0
            boolean r0 = r0.isMutable
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002a
            X.Dbz r0 = X.C27328Dbz.A00
            X.Dbz r0 = r0.A01()
            X.C25879Cnq.A01(r0, r6)
            r4.putObject(r5, r1, r0)
            r6 = r0
        L_0x002a:
            X.CQE r3 = (X.CQE) r3
            X.CRc r5 = r3.A00
            java.util.AbstractMap r6 = (java.util.AbstractMap) r6
            r10 = r17
            r13 = r19
            r0 = r20
            int r8 = A0D(r10, r13, r0)
            int r1 = r10.A00
            if (r1 < 0) goto L_0x0094
            r15 = r21
            int r0 = r21 - r8
            if (r1 > r0) goto L_0x0094
            int r4 = r8 + r1
            java.lang.Object r7 = r5.A02
            java.lang.Object r3 = r5.A03
            r2 = r3
        L_0x004b:
            if (r8 >= r4) goto L_0x0087
            int r14 = r8 + 1
            byte r8 = r19[r8]
            if (r8 >= 0) goto L_0x0059
            int r14 = A0F(r10, r13, r8, r14)
            int r8 = r10.A00
        L_0x0059:
            int r9 = r8 >>> 3
            r1 = r8 & 7
            r0 = 1
            if (r9 == r0) goto L_0x0074
            r0 = 2
            if (r9 != r0) goto L_0x0082
            X.Bzx r11 = r5.A01
            int r0 = r11.wireType
            if (r1 != r0) goto L_0x0082
            java.lang.Class r12 = r3.getClass()
            int r8 = A07(r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r10.A02
            goto L_0x004b
        L_0x0074:
            X.Bzx r11 = r5.A00
            int r0 = r11.wireType
            if (r1 != r0) goto L_0x0082
            r12 = 0
            int r8 = A07(r10, r11, r12, r13, r14, r15)
            java.lang.Object r7 = r10.A02
            goto L_0x004b
        L_0x0082:
            int r8 = A0G(r10, r13, r8, r14, r15)
            goto L_0x004b
        L_0x0087:
            if (r8 != r4) goto L_0x008d
            r6.put(r7, r2)
            return r4
        L_0x008d:
            java.lang.String r0 = "Failed to parse the message."
            X.1PN r0 = X.BE6.A0c(r0)
            throw r0
        L_0x0094:
            X.1PN r0 = X.BE7.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.A0A(X.CiD, java.lang.Object, byte[], int, int, int, long):int");
    }

    public static int A0D(C25573CiD ciD, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A0F(ciD, bArr, b, i2);
        }
        ciD.A00 = b;
        return i2;
    }

    public static int A0E(C25573CiD ciD, byte[] bArr, int i) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            ciD.A01 = j;
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
        ciD.A01 = j2;
        return i3;
    }

    public static int A0F(C25573CiD ciD, byte[] bArr, int i, int i2) {
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
                        ciD.A00 = i3;
                        return i7;
                    }
                }
            }
            ciD.A00 = i8 | i4;
            return i9;
        }
        i3 = i6 | i5;
        ciD.A00 = i3;
        return i7;
    }

    public static int A0G(C25573CiD ciD, byte[] bArr, int i, int i2, int i3) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return A0E(ciD, bArr, i2);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return A0D(ciD, bArr, i2) + ciD.A00;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = A0D(ciD, bArr, i2);
                    i6 = ciD.A00;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = A0G(ciD, bArr, i6, i2, i3);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw BE6.A0c("Failed to parse the message.");
            } else if (i4 == 5) {
                return i2 + 4;
            }
        }
        throw BE6.A0c("Protocol message contained an invalid tag (zero).");
    }

    public static int A0H(Object obj) {
        C25096CXo cXo = C26298CxB.A02;
        return ((List) obj).size();
    }

    public static E69 A0L(DNG dng, int i) {
        return (E69) dng.A07[((i / 3) * 2) + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0170, code lost:
        if (r32 == false) goto L_0x0172;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.DNG A0M(X.C24609CBn r33, X.C25037CUq r34, X.C25879Cnq r35, X.C24611CBp r36, X.C24953CRd r37, X.C25096CXo r38) {
        /*
            r1 = r37
            int r0 = r1.A00
            r2 = 1
            r0 = r0 & 1
            if (r0 != r2) goto L_0x002c
            java.lang.Integer r3 = X.AnonymousClass00R.A00
        L_0x000b:
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            r0 = 0
            boolean r32 = X.AnonymousClass000.A1Z(r3, r2)
            java.lang.String r13 = r1.A02
            int r28 = r13.length()
            r3 = 1
            char r0 = r13.charAt(r0)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r6) goto L_0x002f
        L_0x0022:
            int r2 = r3 + 1
            char r0 = r13.charAt(r3)
            r3 = r2
            if (r0 < r6) goto L_0x002f
            goto L_0x0022
        L_0x002c:
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            goto L_0x000b
        L_0x002f:
            int r12 = r3 + 1
            char r4 = r13.charAt(r3)
            if (r4 < r6) goto L_0x004e
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x003b:
            int r2 = r12 + 1
            char r0 = r13.charAt(r12)
            if (r0 < r6) goto L_0x004b
            int r4 = X.BE6.A08(r0, r3, r4)
            int r3 = r3 + 13
            r12 = r2
            goto L_0x003b
        L_0x004b:
            int r0 = r0 << r3
            r4 = r4 | r0
            r12 = r2
        L_0x004e:
            if (r4 != 0) goto L_0x0247
            int[] r17 = A0G
            r5 = 0
            r4 = 0
            r3 = 0
            r8 = 0
            r7 = 0
            r2 = 0
            r0 = 0
        L_0x0059:
            sun.misc.Unsafe r27 = A0F
            java.lang.Object[] r11 = r1.A03
            X.EDk r1 = r1.A01
            r29 = r1
            java.lang.Class r26 = r29.getClass()
            int r1 = r8 * 3
            int[] r1 = new int[r1]
            r25 = r1
            int r1 = r8 * 2
            java.lang.Object[] r10 = new java.lang.Object[r1]
            int r24 = r2 + r7
            r31 = r24
            r23 = r2
            r22 = 0
            r21 = 0
        L_0x0079:
            r1 = r28
            if (r12 >= r1) goto L_0x034b
            int r1 = r12 + 1
            char r9 = r13.charAt(r12)
            if (r9 < r6) goto L_0x009c
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0089:
            int r7 = r1 + 1
            char r1 = r13.charAt(r1)
            if (r1 < r6) goto L_0x0099
            int r9 = X.BE6.A08(r1, r8, r9)
            int r8 = r8 + 13
            r1 = r7
            goto L_0x0089
        L_0x0099:
            int r1 = r1 << r8
            r9 = r9 | r1
            r1 = r7
        L_0x009c:
            int r12 = r1 + 1
            char r8 = r13.charAt(r1)
            if (r8 < r6) goto L_0x00be
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x00a8:
            int r14 = r12 + 1
            char r6 = r13.charAt(r12)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r1) goto L_0x00bb
            int r8 = X.BE6.A08(r6, r7, r8)
            int r7 = r7 + 13
            r12 = r14
            goto L_0x00a8
        L_0x00bb:
            int r6 = r6 << r7
            r8 = r8 | r6
            r12 = r14
        L_0x00be:
            r7 = r8 & 255(0xff, float:3.57E-43)
            r1 = r8 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x00ca
            int r1 = r22 + 1
            r17[r22] = r21
            r22 = r1
        L_0x00ca:
            r1 = 51
            if (r7 < r1) goto L_0x00f0
            int r18 = r12 + 1
            char r12 = r13.charAt(r12)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r14) goto L_0x01c8
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x00dd:
            int r15 = r18 + 1
            r1 = r18
            char r1 = r13.charAt(r1)
            if (r1 < r14) goto L_0x01c4
            int r12 = X.BE6.A08(r1, r6, r12)
            int r6 = r6 + 13
            r18 = r15
            goto L_0x00dd
        L_0x00f0:
            int r15 = r0 + 1
            r1 = r11[r0]
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r1 = A0T(r0, r1)
            r0 = 9
            if (r7 == r0) goto L_0x017c
            r0 = 17
            if (r7 == r0) goto L_0x017c
            r0 = 27
            if (r7 == r0) goto L_0x0172
            r0 = 49
            if (r7 == r0) goto L_0x0172
            r0 = 12
            if (r7 == r0) goto L_0x0170
            r0 = 30
            if (r7 == r0) goto L_0x0170
            r0 = 44
            if (r7 == r0) goto L_0x0170
            r0 = 50
            if (r7 != r0) goto L_0x0138
            int r16 = r23 + 1
            r17[r23] = r21
            int r0 = r21 / 3
            int r14 = r0 * 2
            int r0 = r15 + 1
            r6 = r11[r15]
            r10[r14] = r6
            r6 = r8 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x016d
            int r6 = r21 / 3
            int r6 = r6 * 2
            int r15 = X.BE7.A0B(r11, r10, r6, r0)
            r23 = r16
        L_0x0138:
            r0 = r27
            long r0 = r0.objectFieldOffset(r1)
            int r6 = (int) r0
            r20 = r6
            r1 = r8 & 4096(0x1000, float:5.74E-42)
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 != r0) goto L_0x01b1
            r0 = 17
            if (r7 > r0) goto L_0x01b1
            int r0 = r12 + 1
            char r6 = r13.charAt(r12)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r1) goto L_0x0189
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x015a:
            int r12 = r0 + 1
            char r1 = r13.charAt(r0)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r0) goto L_0x018b
            int r6 = X.BE6.A08(r1, r14, r6)
            int r14 = r14 + 13
            r0 = r12
            goto L_0x015a
        L_0x016d:
            r23 = r16
            goto L_0x017a
        L_0x0170:
            if (r32 != 0) goto L_0x0138
        L_0x0172:
            int r0 = r21 / 3
            int r0 = r0 * 2
            int r0 = X.BE7.A0B(r11, r10, r0, r15)
        L_0x017a:
            r15 = r0
            goto L_0x0138
        L_0x017c:
            int r0 = r21 / 3
            int r0 = r0 * 2
            int r6 = r0 + 1
            java.lang.Class r0 = r1.getType()
            r10[r6] = r0
            goto L_0x0138
        L_0x0189:
            r12 = r0
            goto L_0x018d
        L_0x018b:
            int r1 = r1 << r14
            r6 = r6 | r1
        L_0x018d:
            int r14 = r5 * 2
            int r0 = r6 / 32
            int r14 = r14 + r0
            r1 = r11[r14]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x01a6
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x019a:
            r0 = r27
            long r18 = r0.objectFieldOffset(r1)
            r0 = r18
            int r14 = (int) r0
            int r1 = r6 % 32
            goto L_0x0208
        L_0x01a6:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r1 = A0T(r0, r1)
            r11[r14] = r1
            goto L_0x019a
        L_0x01b1:
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r0 = 18
            if (r7 < r0) goto L_0x0208
            r0 = 49
            if (r7 > r0) goto L_0x0208
            int r0 = r24 + 1
            r17[r24] = r6
            r24 = r0
            goto L_0x0208
        L_0x01c4:
            int r1 = r1 << r6
            r12 = r12 | r1
            r18 = r15
        L_0x01c8:
            int r6 = r7 + -51
            r1 = 9
            if (r6 == r1) goto L_0x01d8
            r1 = 17
            if (r6 == r1) goto L_0x01d8
            r1 = 12
            if (r6 != r1) goto L_0x01e0
            if (r32 != 0) goto L_0x01e0
        L_0x01d8:
            int r1 = r21 / 3
            int r1 = r1 * 2
            int r0 = X.BE7.A0B(r11, r10, r1, r0)
        L_0x01e0:
            int r12 = r12 * 2
            r6 = r11[r12]
            boolean r1 = r6 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x023c
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
        L_0x01ea:
            r1 = r27
            long r14 = r1.objectFieldOffset(r6)
            int r1 = (int) r14
            r20 = r1
            int r12 = r12 + 1
            r6 = r11[r12]
            boolean r1 = r6 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0231
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
        L_0x01fd:
            r1 = r27
            long r15 = r1.objectFieldOffset(r6)
            int r14 = (int) r15
            r12 = r18
            r15 = r0
            r1 = 0
        L_0x0208:
            int r18 = r21 + 1
            r25[r21] = r9
            int r16 = r18 + 1
            r0 = r8 & 512(0x200, float:7.175E-43)
            r9 = 0
            if (r0 == 0) goto L_0x0215
            r9 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0215:
            r0 = r8 & 256(0x100, float:3.59E-43)
            r6 = 0
            if (r0 == 0) goto L_0x021c
            r6 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x021c:
            r6 = r6 | r9
            int r0 = r7 << 20
            r6 = r6 | r0
            r6 = r6 | r20
            r25[r18] = r6
            int r21 = r16 + 1
            int r0 = r1 << 20
            r0 = r0 | r14
            r25[r16] = r0
            r0 = r15
            r6 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0079
        L_0x0231:
            java.lang.String r6 = (java.lang.String) r6
            r1 = r26
            java.lang.reflect.Field r6 = A0T(r1, r6)
            r11[r12] = r6
            goto L_0x01fd
        L_0x023c:
            java.lang.String r6 = (java.lang.String) r6
            r1 = r26
            java.lang.reflect.Field r6 = A0T(r1, r6)
            r11[r12] = r6
            goto L_0x01ea
        L_0x0247:
            int r0 = r12 + 1
            char r5 = r13.charAt(r12)
            if (r5 < r6) goto L_0x0266
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x0253:
            int r2 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r6) goto L_0x0263
            int r5 = X.BE6.A08(r0, r3, r5)
            int r3 = r3 + 13
            r0 = r2
            goto L_0x0253
        L_0x0263:
            int r0 = r0 << r3
            r5 = r5 | r0
            r0 = r2
        L_0x0266:
            int r4 = r0 + 1
            char r9 = r13.charAt(r0)
            if (r9 < r6) goto L_0x0285
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x0272:
            int r2 = r4 + 1
            char r0 = r13.charAt(r4)
            if (r0 < r6) goto L_0x0282
            int r9 = X.BE6.A08(r0, r3, r9)
            int r3 = r3 + 13
            r4 = r2
            goto L_0x0272
        L_0x0282:
            int r0 = r0 << r3
            r9 = r9 | r0
            r4 = r2
        L_0x0285:
            int r0 = r4 + 1
            char r4 = r13.charAt(r4)
            if (r4 < r6) goto L_0x02a4
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x0291:
            int r2 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r6) goto L_0x02a1
            int r4 = X.BE6.A08(r0, r3, r4)
            int r3 = r3 + 13
            r0 = r2
            goto L_0x0291
        L_0x02a1:
            int r0 = r0 << r3
            r4 = r4 | r0
            r0 = r2
        L_0x02a4:
            int r8 = r0 + 1
            char r3 = r13.charAt(r0)
            if (r3 < r6) goto L_0x02c3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x02b0:
            int r2 = r8 + 1
            char r0 = r13.charAt(r8)
            if (r0 < r6) goto L_0x02c0
            int r3 = X.BE6.A08(r0, r7, r3)
            int r7 = r7 + 13
            r8 = r2
            goto L_0x02b0
        L_0x02c0:
            int r0 = r0 << r7
            r3 = r3 | r0
            r8 = r2
        L_0x02c3:
            int r0 = r8 + 1
            char r8 = r13.charAt(r8)
            if (r8 < r6) goto L_0x02e2
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x02cf:
            int r2 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r6) goto L_0x02df
            int r8 = X.BE6.A08(r0, r7, r8)
            int r7 = r7 + 13
            r0 = r2
            goto L_0x02cf
        L_0x02df:
            int r0 = r0 << r7
            r8 = r8 | r0
            r0 = r2
        L_0x02e2:
            int r11 = r0 + 1
            char r7 = r13.charAt(r0)
            if (r7 < r6) goto L_0x0301
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x02ee:
            int r2 = r11 + 1
            char r0 = r13.charAt(r11)
            if (r0 < r6) goto L_0x02fe
            int r7 = X.BE6.A08(r0, r10, r7)
            int r10 = r10 + 13
            r11 = r2
            goto L_0x02ee
        L_0x02fe:
            int r0 = r0 << r10
            r7 = r7 | r0
            r11 = r2
        L_0x0301:
            int r0 = r11 + 1
            char r11 = r13.charAt(r11)
            if (r11 < r6) goto L_0x0320
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x030d:
            int r2 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r6) goto L_0x031d
            int r11 = X.BE6.A08(r0, r10, r11)
            int r10 = r10 + 13
            r0 = r2
            goto L_0x030d
        L_0x031d:
            int r0 = r0 << r10
            r11 = r11 | r0
            r0 = r2
        L_0x0320:
            int r12 = r0 + 1
            char r2 = r13.charAt(r0)
            if (r2 < r6) goto L_0x033f
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x032c:
            int r10 = r12 + 1
            char r0 = r13.charAt(r12)
            if (r0 < r6) goto L_0x033c
            int r2 = X.BE6.A08(r0, r14, r2)
            int r14 = r14 + 13
            r12 = r10
            goto L_0x032c
        L_0x033c:
            int r0 = r0 << r14
            r2 = r2 | r0
            r12 = r10
        L_0x033f:
            int r0 = r2 + r7
            int r0 = r0 + r11
            int[] r0 = new int[r0]
            r17 = r0
            int r0 = r5 * 2
            int r0 = r0 + r9
            goto L_0x0059
        L_0x034b:
            X.DNG r18 = new X.DNG
            r19 = r33
            r20 = r34
            r21 = r35
            r23 = r36
            r24 = r38
            r22 = r29
            r26 = r17
            r27 = r10
            r28 = r4
            r29 = r3
            r30 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.A0M(X.CBn, X.CUq, X.Cnq, X.CBp, X.CRd, X.CXo):X.DNG");
    }

    private EAO A0N(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.A07;
        EAO eao = (EAO) objArr[i2];
        if (eao != null) {
            return eao;
        }
        EAO A002 = C25661Cjr.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = A002;
        return A002;
    }

    public static C26042Cr6 A0O(Object obj) {
        C23577Bm6 bm6 = (C23577Bm6) obj;
        C26042Cr6 cr6 = bm6.unknownFields;
        if (cr6 != C26042Cr6.A04) {
            return cr6;
        }
        C26042Cr6 cr62 = new C26042Cr6();
        bm6.unknownFields = cr62;
        return cr62;
    }

    private Object A0Q(C25096CXo cXo, Object obj, Object obj2, Object obj3, int i) {
        int[] iArr = this.A05;
        int i2 = iArr[i];
        Object A002 = C25856CnK.A00(obj, BE9.A0N(iArr, i));
        if (A002 != null) {
            Object[] objArr = this.A07;
            int i3 = (i / 3) * 2;
            E69 e69 = (E69) objArr[i3 + 1];
            if (e69 != null) {
                C24952CRc cRc = ((CQE) objArr[i3]).A00;
                Iterator A0i = C17890vO.A0i((AbstractMap) A002);
                while (A0i.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A0i);
                    if (!e69.Bf4(BE9.A0J(A16))) {
                        if (obj2 == null) {
                            obj2 = cXo.A00(obj3);
                        }
                        Object key = A16.getKey();
                        Object value = A16.getValue();
                        C24362Bzx bzx = cRc.A00;
                        int A003 = C26201CuW.A00(bzx, key, 1);
                        C24362Bzx bzx2 = cRc.A01;
                        int A004 = A003 + C26201CuW.A00(bzx2, value, 2);
                        E67 e67 = DSQ.A01;
                        byte[] bArr = new byte[A004];
                        C23586BmG bmG = new C23586BmG(bArr, A004);
                        try {
                            Object key2 = A16.getKey();
                            Object value2 = A16.getValue();
                            C26201CuW.A01(bmG, bzx, key2, 1);
                            C26201CuW.A01(bmG, bzx2, value2, 2);
                            bmG.A05();
                            ((C26042Cr6) obj2).A02((i2 << 3) | 2, new C23581BmB(bArr));
                            A0i.remove();
                        } catch (IOException e) {
                            throw AnonymousClass8BR.A0x(e);
                        }
                    }
                }
            }
        }
        return obj2;
    }

    public static List A0V(DNG dng, Object obj, int i) {
        return dng.A04.A01(obj, (long) (i & 1048575));
    }

    public static List A0W(Object obj, long j) {
        List list = (List) UnsafeUtil.A02.A09(obj, j);
        C25096CXo cXo = C26298CxB.A02;
        return list;
    }

    private void A0X(C26282Cwd cwd, Object obj, int i) {
        long A0M;
        Object A0O;
        if ((536870912 & i) != 0) {
            A0M = BE6.A0M(i);
            A0O = C26282Cwd.A03(cwd).A0Q();
        } else {
            boolean z = this.A0D;
            A0M = BE6.A0M(i);
            C25857CnL A032 = C26282Cwd.A03(cwd);
            if (z) {
                A0O = A032.A0P();
            } else {
                A0O = A032.A0O();
            }
        }
        UnsafeUtil.A05(obj, A0M, A0O);
    }

    private void A0Y(CVN cvn, Object obj, int i, int i2) {
        if (obj != null) {
            C24952CRc cRc = ((CQE) this.A07[(i2 / 3) * 2]).A00;
            CodedOutputStream codedOutputStream = cvn.A00;
            Iterator A0i = C17890vO.A0i((AbstractMap) obj);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                C25878Cnp.A07(codedOutputStream, i);
                Object key = A16.getKey();
                Object value = A16.getValue();
                C24362Bzx bzx = cRc.A00;
                int A002 = C26201CuW.A00(bzx, key, 1);
                C24362Bzx bzx2 = cRc.A01;
                codedOutputStream.A08(A002 + C26201CuW.A00(bzx2, value, 2));
                Object key2 = A16.getKey();
                Object value2 = A16.getValue();
                C26201CuW.A01(codedOutputStream, bzx, key2, 1);
                C26201CuW.A01(codedOutputStream, bzx2, value2, 2);
            }
        }
    }

    private void A0a(Object obj, int i) {
        int i2 = this.A05[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            UnsafeUtil.A04(obj, j, (1 << (i2 >>> 20)) | UnsafeUtil.A02.A06(obj, j));
        }
    }

    private void A0b(Object obj, int i, Object obj2) {
        A0F.putObject(obj, BE9.A0N(this.A05, i), obj2);
        A0a(obj, i);
    }

    public static boolean A0c(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C23577Bm6) {
            return AnonymousClass000.A1O(((C23577Bm6) obj).memoizedSerializedSize & Integer.MIN_VALUE);
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        return !r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0d(java.lang.Object r11, int r12) {
        /*
            r10 = this;
            int[] r9 = r10.A05
            int r0 = r12 + 2
            r8 = r9[r0]
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r8 & r4
            long r1 = (long) r0
            r6 = 1048575(0xfffff, double:5.18065E-318)
            r5 = 0
            r3 = 1
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0089
            int r0 = r12 + 1
            r3 = r9[r0]
            r0 = r3 & r4
            long r1 = (long) r0
            int r0 = X.BE7.A04(r3)
            r3 = 0
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x0039;
                case 2: goto L_0x0071;
                case 3: goto L_0x0071;
                case 4: goto L_0x0068;
                case 5: goto L_0x0071;
                case 6: goto L_0x0068;
                case 7: goto L_0x0046;
                case 8: goto L_0x004d;
                case 9: goto L_0x0096;
                case 10: goto L_0x007c;
                case 11: goto L_0x0068;
                case 12: goto L_0x0068;
                case 13: goto L_0x0068;
                case 14: goto L_0x0071;
                case 15: goto L_0x0068;
                case 16: goto L_0x0071;
                case 17: goto L_0x0096;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()
            throw r0
        L_0x002a:
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            double r0 = r0.A03(r11, r1)
            long r1 = java.lang.Double.doubleToRawLongBits(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0039:
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r0.A04(r11, r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0046:
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            boolean r0 = r0.A0L(r11, r1)
            return r0
        L_0x004d:
            java.lang.Object r1 = X.C25856CnK.A00(r11, r1)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x005c
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.isEmpty()
            goto L_0x0086
        L_0x005c:
            boolean r0 = r1 instanceof X.DSQ
            if (r0 == 0) goto L_0x0063
            X.DSQ r0 = X.DSQ.A00
            goto L_0x0082
        L_0x0063:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()
            throw r0
        L_0x0068:
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r0.A06(r11, r1)
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0071:
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            long r1 = r0.A07(r11, r1)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x007c:
            X.DSQ r0 = X.DSQ.A00
            java.lang.Object r1 = X.C25856CnK.A00(r11, r1)
        L_0x0082:
            boolean r0 = r0.equals(r1)
        L_0x0086:
            r0 = r0 ^ 1
            return r0
        L_0x0089:
            int r0 = r8 >>> 20
            int r3 = r3 << r0
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r0.A06(r11, r1)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0096:
            java.lang.Object r0 = X.C25856CnK.A00(r11, r1)
            if (r0 == 0) goto L_0x009d
        L_0x009c:
            r5 = 1
        L_0x009d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.A0d(java.lang.Object, int):boolean");
    }

    private boolean A0e(Object obj, int i, int i2) {
        return AnonymousClass000.A1T(UnsafeUtil.A02.A06(obj, BE9.A0O(this.A05, i2)), i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
        r14 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0111, code lost:
        r7 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011e, code lost:
        r7 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0184, code lost:
        r13.putObject(r8, r9, r6.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r13.putInt(r8, r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c6, code lost:
        r13.putLong(r8, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d1, code lost:
        r15 = r15 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d3, code lost:
        r9 = r19;
        r14 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0f(X.C25573CiD r38, java.lang.Object r39, byte[] r40, int r41, int r42, int r43) {
        /*
            r37 = this;
            r8 = r39
            r7 = r41
            A0Z(r8)
            sun.misc.Unsafe r13 = A0F
            r9 = -1
            r3 = 0
            r11 = 0
            r15 = 0
            r14 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0010:
            r2 = r7
            r4 = r37
            r36 = r42
            r0 = r36
            r20 = r43
            if (r7 >= r0) goto L_0x0094
            int r2 = r7 + 1
            r5 = r40
            byte r11 = r40[r7]
            r6 = r38
            if (r11 >= 0) goto L_0x002b
            int r2 = A0F(r6, r5, r11, r2)
            int r11 = r6.A00
        L_0x002b:
            int r19 = r11 >>> 3
            r7 = r11 & 7
            r1 = 3
            r0 = r19
            if (r0 <= r9) goto L_0x02ca
            int r3 = r3 / r1
            int r1 = r4.A02
            if (r0 < r1) goto L_0x02c7
            int r1 = r4.A01
            if (r0 > r1) goto L_0x02c7
            int[] r10 = r4.A05
            int r0 = r10.length
            int r0 = r0 / 3
            int r9 = r0 + -1
        L_0x0044:
            if (r3 > r9) goto L_0x02c7
            int r0 = r9 + r3
            int r16 = r0 >>> 1
            int r12 = r16 * 3
            r1 = r10[r12]
            r0 = r19
            if (r0 != r1) goto L_0x02bd
            r3 = r12
        L_0x0053:
            r0 = -1
            if (r3 == r0) goto L_0x02c7
            int[] r1 = r4.A05
            int r0 = r3 + 1
            r18 = r1[r0]
            int r12 = X.BE7.A04(r18)
            long r9 = X.BE6.A0M(r18)
            r0 = 17
            if (r12 > r0) goto L_0x01dd
            int r0 = r3 + 2
            r17 = r1[r0]
            int r0 = r17 >>> 20
            r16 = 1
            int r16 = r16 << r0
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r17 = r17 & r1
            r0 = r17
            if (r0 == r14) goto L_0x01d9
            if (r14 == r1) goto L_0x0081
            long r0 = (long) r14
            r13.putInt(r8, r0, r15)
        L_0x0081:
            r0 = r17
            long r0 = (long) r0
            int r15 = r13.getInt(r8, r0)
        L_0x0088:
            r0 = 5
            switch(r12) {
                case 0: goto L_0x00c8;
                case 1: goto L_0x00dd;
                case 2: goto L_0x00ed;
                case 3: goto L_0x00ed;
                case 4: goto L_0x00f7;
                case 5: goto L_0x0101;
                case 6: goto L_0x0115;
                case 7: goto L_0x0122;
                case 8: goto L_0x0139;
                case 9: goto L_0x0160;
                case 10: goto L_0x017d;
                case 11: goto L_0x00f7;
                case 12: goto L_0x018a;
                case 13: goto L_0x0115;
                case 14: goto L_0x0101;
                case 15: goto L_0x01aa;
                case 16: goto L_0x01ba;
                case 17: goto L_0x0295;
                default: goto L_0x008c;
            }
        L_0x008c:
            r14 = r17
        L_0x008e:
            r0 = r20
            if (r11 != r0) goto L_0x00b4
            if (r43 == 0) goto L_0x00b4
        L_0x0094:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r14 == r0) goto L_0x009d
            long r0 = (long) r14
            r13.putInt(r8, r0, r15)
        L_0x009d:
            int r3 = r4.A00
            r1 = 0
        L_0x00a0:
            int r0 = r4.A03
            if (r3 >= r0) goto L_0x02d0
            int[] r0 = r4.A06
            r9 = r0[r3]
            X.CXo r0 = r4.A0C
            r5 = r0
            r6 = r8
            r7 = r1
            java.lang.Object r1 = r4.A0Q(r5, r6, r7, r8, r9)
            int r3 = r3 + 1
            goto L_0x00a0
        L_0x00b4:
            X.Cr6 r21 = A0O(r8)
            r20 = r6
            r22 = r5
            r25 = r36
            r23 = r11
            r24 = r2
            int r7 = A06(r20, r21, r22, r23, r24, r25)
            goto L_0x02b9
        L_0x00c8:
            r0 = 1
            if (r7 != r0) goto L_0x008c
            long r0 = X.BEB.A0G(r5, r2)
            double r24 = java.lang.Double.longBitsToDouble(r0)
            X.CnK r20 = com.google.protobuf.UnsafeUtil.A02
            r21 = r8
            r22 = r9
            r20.A0C(r21, r22, r24)
            goto L_0x0111
        L_0x00dd:
            if (r7 != r0) goto L_0x008c
            int r0 = X.BEB.A08(r5, r2)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            r0.A0D(r8, r9, r1)
            goto L_0x011e
        L_0x00ed:
            if (r7 != 0) goto L_0x008c
            int r7 = A0E(r6, r5, r2)
            long r0 = r6.A01
            goto L_0x01c6
        L_0x00f7:
            if (r7 != 0) goto L_0x008c
            int r7 = A0D(r6, r5, r2)
            int r2 = r6.A00
            goto L_0x01b6
        L_0x0101:
            r0 = 1
            if (r7 != r0) goto L_0x008c
            long r24 = X.BEB.A0G(r5, r2)
            r20 = r13
            r21 = r8
            r22 = r9
            r20.putLong(r21, r22, r24)
        L_0x0111:
            int r7 = r2 + 8
            goto L_0x01d1
        L_0x0115:
            if (r7 != r0) goto L_0x008c
            int r0 = X.BEB.A08(r5, r2)
            r13.putInt(r8, r9, r0)
        L_0x011e:
            int r7 = r2 + 4
            goto L_0x01d1
        L_0x0122:
            if (r7 != 0) goto L_0x008c
            int r7 = A0E(r6, r5, r2)
            long r0 = r6.A01
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r2)
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            r0.A0H(r8, r9, r1)
            goto L_0x01d1
        L_0x0139:
            r0 = 2
            if (r7 != r0) goto L_0x008c
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r18
            if (r0 != 0) goto L_0x015b
            int r7 = A0D(r6, r5, r2)
            int r1 = r6.A00
            if (r1 < 0) goto L_0x02ed
            if (r1 != 0) goto L_0x0151
            java.lang.String r0 = ""
            r6.A02 = r0
            goto L_0x0184
        L_0x0151:
            java.nio.charset.Charset r0 = X.CIC.A04
            java.lang.String r0 = X.BE6.A0r(r0, r5, r7, r1)
            r6.A02 = r0
            int r7 = r7 + r1
            goto L_0x0184
        L_0x015b:
            int r7 = A0C(r6, r5, r2)
            goto L_0x0184
        L_0x0160:
            r0 = 2
            if (r7 != r0) goto L_0x008c
            java.lang.Object r0 = r4.A0R(r8, r3)
            X.EAO r21 = r4.A0N(r3)
            r20 = r6
            r23 = r5
            r25 = r36
            r22 = r0
            r24 = r2
            int r7 = A03(r20, r21, r22, r23, r24, r25)
            r4.A0b(r8, r3, r0)
            goto L_0x01d1
        L_0x017d:
            r0 = 2
            if (r7 != r0) goto L_0x008c
            int r7 = A0B(r6, r5, r2)
        L_0x0184:
            java.lang.Object r0 = r6.A02
            r13.putObject(r8, r9, r0)
            goto L_0x01d1
        L_0x018a:
            if (r7 != 0) goto L_0x008c
            int r7 = A0D(r6, r5, r2)
            int r2 = r6.A00
            X.E69 r0 = A0L(r4, r3)
            if (r0 == 0) goto L_0x01b6
            boolean r0 = r0.Bf4(r2)
            if (r0 != 0) goto L_0x01b6
            X.Cr6 r1 = A0O(r8)
            java.lang.Long r0 = X.C17880vN.A0n(r2)
            r1.A02(r11, r0)
            goto L_0x01d3
        L_0x01aa:
            if (r7 != 0) goto L_0x008c
            int r7 = A0D(r6, r5, r2)
            int r0 = r6.A00
            int r2 = X.BE7.A05(r0)
        L_0x01b6:
            r13.putInt(r8, r9, r2)
            goto L_0x01d1
        L_0x01ba:
            if (r7 != 0) goto L_0x008c
            int r7 = A0E(r6, r5, r2)
            long r0 = r6.A01
            long r0 = X.BEA.A0G(r0)
        L_0x01c6:
            r20 = r13
            r21 = r8
            r22 = r9
            r24 = r0
            r20.putLong(r21, r22, r24)
        L_0x01d1:
            r15 = r15 | r16
        L_0x01d3:
            r9 = r19
            r14 = r17
            goto L_0x0010
        L_0x01d9:
            r17 = r14
            goto L_0x0088
        L_0x01dd:
            r0 = 27
            if (r12 != r0) goto L_0x0230
            r0 = 2
            if (r7 != r0) goto L_0x008e
            java.lang.Object r1 = r13.getObject(r8, r9)
            X.EE9 r1 = (X.EE9) r1
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0202
            int r7 = r1.size()
            int r0 = r7 * 2
            if (r7 != 0) goto L_0x01fb
            r0 = 10
        L_0x01fb:
            X.EE9 r1 = r1.Bk8(r0)
            r13.putObject(r8, r9, r1)
        L_0x0202:
            X.EAO r4 = r4.A0N(r3)
        L_0x0206:
            X.Bm6 r0 = r4.BkG()
            r20 = r6
            r23 = r5
            r25 = r36
            r21 = r4
            r22 = r0
            r24 = r2
            int r7 = A03(r20, r21, r22, r23, r24, r25)
            r4.Bih(r0)
            r6.A02 = r0
            r1.add(r0)
            r0 = r36
            if (r7 >= r0) goto L_0x02b9
            int r2 = A0D(r6, r5, r7)
            int r0 = r6.A00
            if (r11 == r0) goto L_0x0206
            goto L_0x02b9
        L_0x0230:
            r0 = 49
            if (r12 > r0) goto L_0x025a
            r0 = r18
            long r0 = (long) r0
            r24 = r5
            r26 = r36
            r22 = r6
            r29 = r7
            r30 = r3
            r31 = r12
            r32 = r0
            r34 = r9
            r21 = r4
            r23 = r8
            r25 = r2
            r27 = r11
            r28 = r19
            int r7 = r21.A09(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34)
        L_0x0255:
            if (r7 != r2) goto L_0x02b9
            r2 = r7
            goto L_0x008e
        L_0x025a:
            r0 = 50
            if (r12 != r0) goto L_0x0276
            r0 = 2
            if (r7 != r0) goto L_0x008e
            r22 = r6
            r24 = r5
            r26 = r36
            r21 = r4
            r23 = r8
            r25 = r2
            r27 = r3
            r28 = r9
            int r7 = r21.A0A(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0255
        L_0x0276:
            r24 = r5
            r26 = r36
            r22 = r6
            r29 = r7
            r30 = r18
            r31 = r12
            r32 = r3
            r33 = r9
            r21 = r4
            r23 = r8
            r25 = r2
            r27 = r11
            r28 = r19
            int r7 = r21.A08(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0255
        L_0x0295:
            r0 = 3
            if (r7 != r0) goto L_0x008c
            java.lang.Object r1 = r4.A0R(r8, r3)
            int r0 = r19 << 3
            r26 = r0 | 4
            X.EAO r21 = r4.A0N(r3)
            r20 = r6
            r23 = r5
            r25 = r36
            r22 = r1
            r24 = r2
            int r7 = A04(r20, r21, r22, r23, r24, r25, r26)
            r4.A0b(r8, r3, r1)
            r15 = r15 | r16
            r14 = r17
        L_0x02b9:
            r9 = r19
            goto L_0x0010
        L_0x02bd:
            if (r0 >= r1) goto L_0x02c3
            int r9 = r16 + -1
            goto L_0x0044
        L_0x02c3:
            int r3 = r16 + 1
            goto L_0x0044
        L_0x02c7:
            r3 = 0
            goto L_0x008e
        L_0x02ca:
            int r3 = r4.A00(r0)
            goto L_0x0053
        L_0x02d0:
            if (r1 == 0) goto L_0x02d8
            X.Cr6 r1 = (X.C26042Cr6) r1
            X.Bm6 r8 = (X.C23577Bm6) r8
            r8.unknownFields = r1
        L_0x02d8:
            r0 = r36
            if (r43 != 0) goto L_0x02df
            if (r2 != r0) goto L_0x02e6
            return r2
        L_0x02df:
            if (r2 > r0) goto L_0x02e6
            r0 = r20
            if (r11 != r0) goto L_0x02e6
            return r2
        L_0x02e6:
            java.lang.String r0 = "Failed to parse the message."
            X.1PN r0 = X.BE6.A0c(r0)
            throw r0
        L_0x02ed:
            X.1PN r0 = X.BE7.A0N()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.A0f(X.CiD, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        if (r3 != r0) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (r7 != r1) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BKS(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            int[] r6 = r11.A05
            int r5 = r6.length
            r10 = 0
            r4 = 0
        L_0x0005:
            if (r4 >= r5) goto L_0x00cc
            int r0 = r4 + 1
            r2 = r6[r0]
            long r0 = X.BE6.A0M(r2)
            int r2 = X.BE7.A04(r2)
            switch(r2) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x008a;
                case 2: goto L_0x004b;
                case 3: goto L_0x004b;
                case 4: goto L_0x0060;
                case 5: goto L_0x004b;
                case 6: goto L_0x0060;
                case 7: goto L_0x0075;
                case 8: goto L_0x002a;
                case 9: goto L_0x002a;
                case 10: goto L_0x002a;
                case 11: goto L_0x0060;
                case 12: goto L_0x0060;
                case 13: goto L_0x0060;
                case 14: goto L_0x004b;
                case 15: goto L_0x0060;
                case 16: goto L_0x004b;
                case 17: goto L_0x002a;
                case 18: goto L_0x0034;
                case 19: goto L_0x0034;
                case 20: goto L_0x0034;
                case 21: goto L_0x0034;
                case 22: goto L_0x0034;
                case 23: goto L_0x0034;
                case 24: goto L_0x0034;
                case 25: goto L_0x0034;
                case 26: goto L_0x0034;
                case 27: goto L_0x0034;
                case 28: goto L_0x0034;
                case 29: goto L_0x0034;
                case 30: goto L_0x0034;
                case 31: goto L_0x0034;
                case 32: goto L_0x0034;
                case 33: goto L_0x0034;
                case 34: goto L_0x0034;
                case 35: goto L_0x0034;
                case 36: goto L_0x0034;
                case 37: goto L_0x0034;
                case 38: goto L_0x0034;
                case 39: goto L_0x0034;
                case 40: goto L_0x0034;
                case 41: goto L_0x0034;
                case 42: goto L_0x0034;
                case 43: goto L_0x0034;
                case 44: goto L_0x0034;
                case 45: goto L_0x0034;
                case 46: goto L_0x0034;
                case 47: goto L_0x0034;
                case 48: goto L_0x0034;
                case 49: goto L_0x0034;
                case 50: goto L_0x0034;
                case 51: goto L_0x0019;
                case 52: goto L_0x0019;
                case 53: goto L_0x0019;
                case 54: goto L_0x0019;
                case 55: goto L_0x0019;
                case 56: goto L_0x0019;
                case 57: goto L_0x0019;
                case 58: goto L_0x0019;
                case 59: goto L_0x0019;
                case 60: goto L_0x0019;
                case 61: goto L_0x0019;
                case 62: goto L_0x0019;
                case 63: goto L_0x0019;
                case 64: goto L_0x0019;
                case 65: goto L_0x0019;
                case 66: goto L_0x0019;
                case 67: goto L_0x0019;
                case 68: goto L_0x0019;
                default: goto L_0x0016;
            }
        L_0x0016:
            int r4 = r4 + 3
            goto L_0x0005
        L_0x0019:
            long r2 = X.BE9.A0O(r6, r4)
            X.CnK r8 = com.google.protobuf.UnsafeUtil.A02
            int r7 = r8.A06(r12, r2)
            int r2 = r8.A06(r13, r2)
            if (r7 != r2) goto L_0x00dc
            goto L_0x0034
        L_0x002a:
            boolean r3 = r11.A0d(r12, r4)
            boolean r2 = r11.A0d(r13, r4)
            if (r3 != r2) goto L_0x00dc
        L_0x0034:
            X.CnK r3 = com.google.protobuf.UnsafeUtil.A02
            java.lang.Object r2 = r3.A09(r12, r0)
            java.lang.Object r1 = r3.A09(r13, r0)
            X.CXo r0 = X.C26298CxB.A02
            if (r2 == r1) goto L_0x0016
            if (r2 == 0) goto L_0x00dc
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x00dc
            goto L_0x0016
        L_0x004b:
            boolean r3 = r11.A0d(r12, r4)
            boolean r2 = r11.A0d(r13, r4)
            if (r3 != r2) goto L_0x00dc
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            long r7 = r2.A07(r12, r0)
            long r1 = r2.A07(r13, r0)
            goto L_0x00c6
        L_0x0060:
            boolean r3 = r11.A0d(r12, r4)
            boolean r2 = r11.A0d(r13, r4)
            if (r3 != r2) goto L_0x00dc
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            int r3 = r2.A06(r12, r0)
            int r0 = r2.A06(r13, r0)
            goto L_0x00a6
        L_0x0075:
            boolean r3 = r11.A0d(r12, r4)
            boolean r2 = r11.A0d(r13, r4)
            if (r3 != r2) goto L_0x00dc
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            boolean r3 = r2.A0L(r12, r0)
            boolean r0 = r2.A0L(r13, r0)
            goto L_0x00a6
        L_0x008a:
            boolean r3 = r11.A0d(r12, r4)
            boolean r2 = r11.A0d(r13, r4)
            if (r3 != r2) goto L_0x00dc
            X.CnK r7 = com.google.protobuf.UnsafeUtil.A02
            float r2 = r7.A04(r12, r0)
            int r3 = java.lang.Float.floatToIntBits(r2)
            float r0 = r7.A04(r13, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
        L_0x00a6:
            if (r3 != r0) goto L_0x00dc
            goto L_0x0016
        L_0x00aa:
            boolean r3 = r11.A0d(r12, r4)
            boolean r2 = r11.A0d(r13, r4)
            if (r3 != r2) goto L_0x00dc
            X.CnK r9 = com.google.protobuf.UnsafeUtil.A02
            double r2 = r9.A03(r12, r0)
            long r7 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r9.A03(r13, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
        L_0x00c6:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00dc
            goto L_0x0016
        L_0x00cc:
            X.Bm6 r12 = (X.C23577Bm6) r12
            X.Cr6 r1 = r12.unknownFields
            X.Bm6 r13 = (X.C23577Bm6) r13
            X.Cr6 r0 = r13.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 1
            return r0
        L_0x00dc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.BKS(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0312, code lost:
        if (r1 >= 0) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x031a, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x031c, code lost:
        r12 = X.C25878Cnp.A05(r3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0328, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x032a, code lost:
        r12 = X.C25878Cnp.A05(r3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0336, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0338, code lost:
        r12 = X.C25878Cnp.A05(r3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0344, code lost:
        if (r2 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0346, code lost:
        r1 = X.C25856CnK.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x034c, code lost:
        if ((r1 instanceof X.DSQ) == false) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x034e, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r12 = X.C25878Cnp.A05(r3);
        r1 = ((X.DSQ) r1).A02();
        r12 = r12 + (X.BEB.A02(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0362, code lost:
        r12 = X.C25878Cnp.A05(r3);
        r0 = com.google.protobuf.CodedOutputStream.A04((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0372, code lost:
        if (r2 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0374, code lost:
        r2 = X.C25856CnK.A00(r6, r0);
        r1 = A0N(r4);
        r0 = X.C26298CxB.A02;
        r12 = X.C25878Cnp.A05(r3);
        r1 = ((X.DNC) ((X.C28668EDk) r2)).A0J(r1);
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r12 = r12 + (X.BEB.A02(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0398, code lost:
        if (r2 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x039a, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r12 = X.C25878Cnp.A05(r3);
        r1 = ((X.DSQ) X.C25856CnK.A00(r6, r0)).A02();
        r12 = r12 + (X.BEB.A02(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03de, code lost:
        if (r1 >= 0) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03e0, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r0 = X.BEB.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03e7, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03ee, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03f0, code lost:
        r12 = X.C25878Cnp.A05(r3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03fb, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03fd, code lost:
        r12 = X.C25878Cnp.A05(r3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x043a, code lost:
        if (r2 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x043c, code lost:
        r1 = A0N(r4);
        r12 = X.C25878Cnp.A05(r3) * 2;
        r0 = ((X.DNC) ((X.C28668EDk) X.C25856CnK.A00(r6, r0))).A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0452, code lost:
        r12 = r12 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0453, code lost:
        r16 = r16 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04c8, code lost:
        if (r1 >= 0) goto L_0x083a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x050c, code lost:
        if (r1 >= 0) goto L_0x083a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0665, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x06ec, code lost:
        if (r2 <= 0) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x06ee, code lost:
        r1 = X.C25878Cnp.A05(r8);
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r1 = (r1 + X.BEB.A02(r2)) + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0712, code lost:
        if (r0 == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0714, code lost:
        r9 = X.C25878Cnp.A05(r8) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0720, code lost:
        if (r0 == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0722, code lost:
        r9 = X.C25878Cnp.A05(r8) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x076c, code lost:
        if (r1 >= 0) goto L_0x083a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0774, code lost:
        if (r0 == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0776, code lost:
        r9 = X.C25878Cnp.A05(r8) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0790, code lost:
        if (r0 == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0792, code lost:
        r9 = X.C25878Cnp.A05(r8) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x079e, code lost:
        if (r0 == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x07a0, code lost:
        r1 = r4.getObject(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x07a6, code lost:
        if ((r1 instanceof X.DSQ) == false) goto L_0x07bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x07a8, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r9 = X.C25878Cnp.A05(r8);
        r1 = ((X.DSQ) r1).A02();
        r9 = r9 + (X.BEB.A02(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x07bc, code lost:
        r9 = X.C25878Cnp.A05(r8);
        r0 = com.google.protobuf.CodedOutputStream.A04((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x07cc, code lost:
        if (r0 == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x07ce, code lost:
        r2 = r4.getObject(r6, r1);
        r1 = A0N(r3);
        r0 = X.C26298CxB.A02;
        r9 = X.C25878Cnp.A05(r8);
        r1 = ((X.DNC) ((X.C28668EDk) r2)).A0J(r1);
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r9 = r9 + (X.BEB.A02(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x07f2, code lost:
        if (r0 == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x07f4, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r9 = X.C25878Cnp.A05(r8);
        r1 = ((X.DSQ) r4.getObject(r6, r1)).A02();
        r9 = r9 + (X.BEB.A02(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0838, code lost:
        if (r1 >= 0) goto L_0x083a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x083a, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r0 = X.BEB.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0841, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0848, code lost:
        if (r0 == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x084a, code lost:
        r1 = X.C25878Cnp.A05(r8) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0850, code lost:
        r16 = r16 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0858, code lost:
        if (r0 == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x085a, code lost:
        r9 = X.C25878Cnp.A05(r8) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0897, code lost:
        if (r0 == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0899, code lost:
        r1 = A0N(r3);
        r9 = X.C25878Cnp.A05(r8) * 2;
        r0 = ((X.DNC) ((X.C28668EDk) r4.getObject(r6, r1))).A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x08af, code lost:
        r9 = r9 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012d, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a3, code lost:
        if (r1 >= 0) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f3, code lost:
        if (r1 >= 0) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02a4, code lost:
        if (r1 <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a6, code lost:
        r12 = X.C25878Cnp.A05(r3);
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r12 = (r12 + X.BEB.A02(r1)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b8, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02ba, code lost:
        r12 = X.C25878Cnp.A05(r3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02c6, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c8, code lost:
        r12 = X.C25878Cnp.A05(r3) + 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BZ1(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r18
            r5 = r17
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0457
            sun.misc.Unsafe r7 = A0F
            r4 = 0
            r16 = 0
        L_0x000d:
            int[] r1 = r5.A05
            int r0 = r1.length
            if (r4 >= r0) goto L_0x08b7
            int r0 = r4 + 1
            r0 = r1[r0]
            int r8 = X.BE7.A04(r0)
            r3 = r1[r4]
            long r0 = X.BE6.A0M(r0)
            X.C03[] r2 = X.C03.A00
            switch(r8) {
                case 0: goto L_0x015b;
                case 1: goto L_0x0161;
                case 2: goto L_0x0167;
                case 3: goto L_0x017d;
                case 4: goto L_0x0193;
                case 5: goto L_0x01a7;
                case 6: goto L_0x01ad;
                case 7: goto L_0x01b3;
                case 8: goto L_0x01b9;
                case 9: goto L_0x01bf;
                case 10: goto L_0x01c5;
                case 11: goto L_0x01cb;
                case 12: goto L_0x01e3;
                case 13: goto L_0x01f7;
                case 14: goto L_0x01fd;
                case 15: goto L_0x0203;
                case 16: goto L_0x0219;
                case 17: goto L_0x0233;
                case 18: goto L_0x00de;
                case 19: goto L_0x00cb;
                case 20: goto L_0x0028;
                case 21: goto L_0x0040;
                case 22: goto L_0x0054;
                case 23: goto L_0x00de;
                case 24: goto L_0x00cb;
                case 25: goto L_0x0068;
                case 26: goto L_0x007b;
                case 27: goto L_0x0087;
                case 28: goto L_0x0097;
                case 29: goto L_0x00a3;
                case 30: goto L_0x00b7;
                case 31: goto L_0x00cb;
                case 32: goto L_0x00de;
                case 33: goto L_0x00f1;
                case 34: goto L_0x0105;
                case 35: goto L_0x0284;
                case 36: goto L_0x0279;
                case 37: goto L_0x0239;
                case 38: goto L_0x0244;
                case 39: goto L_0x024f;
                case 40: goto L_0x0284;
                case 41: goto L_0x0279;
                case 42: goto L_0x025a;
                case 43: goto L_0x0263;
                case 44: goto L_0x026e;
                case 45: goto L_0x0279;
                case 46: goto L_0x0284;
                case 47: goto L_0x028f;
                case 48: goto L_0x029a;
                case 49: goto L_0x0119;
                case 50: goto L_0x0149;
                case 51: goto L_0x02b4;
                case 52: goto L_0x02c2;
                case 53: goto L_0x02d0;
                case 54: goto L_0x02e8;
                case 55: goto L_0x0300;
                case 56: goto L_0x0316;
                case 57: goto L_0x0324;
                case 58: goto L_0x0332;
                case 59: goto L_0x0340;
                case 60: goto L_0x036e;
                case 61: goto L_0x0394;
                case 62: goto L_0x03b2;
                case 63: goto L_0x03cc;
                case 64: goto L_0x03ea;
                case 65: goto L_0x03f7;
                case 66: goto L_0x0404;
                case 67: goto L_0x041b;
                case 68: goto L_0x0436;
                default: goto L_0x0025;
            }
        L_0x0025:
            int r4 = r4 + 3
            goto L_0x000d
        L_0x0028:
            java.util.List r2 = A0W(r6, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L_0x012d
            int r1 = X.C26298CxB.A03(r2)
            int r0 = r2.size()
            int r12 = A01(r3, r0, r1)
            goto L_0x0453
        L_0x0040:
            java.util.List r0 = A0W(r6, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x012d
            int r0 = X.C26298CxB.A07(r0)
            int r12 = A01(r3, r1, r0)
            goto L_0x0453
        L_0x0054:
            java.util.List r0 = A0W(r6, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x012d
            int r0 = X.C26298CxB.A02(r0)
            int r12 = A01(r3, r1, r0)
            goto L_0x0453
        L_0x0068:
            java.util.List r0 = A0W(r6, r0)
            int r12 = r0.size()
            if (r12 == 0) goto L_0x012d
            int r0 = X.C25878Cnp.A05(r3)
            int r0 = r0 + 1
            int r12 = r12 * r0
            goto L_0x0453
        L_0x007b:
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = X.C26298CxB.A09(r0, r3)
            goto L_0x0453
        L_0x0087:
            java.lang.Object r1 = X.C25856CnK.A00(r6, r0)
            java.util.List r1 = (java.util.List) r1
            X.EAO r0 = r5.A0N(r4)
            int r12 = X.C26298CxB.A00(r0, r1, r3)
            goto L_0x0453
        L_0x0097:
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = X.C26298CxB.A08(r0, r3)
            goto L_0x0453
        L_0x00a3:
            java.util.List r0 = A0W(r6, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x012d
            int r0 = X.C26298CxB.A06(r0)
            int r12 = A01(r3, r1, r0)
            goto L_0x0453
        L_0x00b7:
            java.util.List r0 = A0W(r6, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x012d
            int r0 = X.C26298CxB.A01(r0)
            int r12 = A01(r3, r1, r0)
            goto L_0x0453
        L_0x00cb:
            java.util.List r0 = A0W(r6, r0)
            int r12 = r0.size()
            if (r12 == 0) goto L_0x012d
            int r0 = X.C25878Cnp.A05(r3)
            int r0 = r0 + 4
            int r12 = r12 * r0
            goto L_0x0453
        L_0x00de:
            java.util.List r0 = A0W(r6, r0)
            int r12 = r0.size()
            if (r12 == 0) goto L_0x012d
            int r0 = X.C25878Cnp.A05(r3)
            int r0 = r0 + 8
            int r12 = r12 * r0
            goto L_0x0453
        L_0x00f1:
            java.util.List r0 = A0W(r6, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x012d
            int r0 = X.C26298CxB.A04(r0)
            int r12 = A01(r3, r1, r0)
            goto L_0x0453
        L_0x0105:
            java.util.List r0 = A0W(r6, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x012d
            int r0 = X.C26298CxB.A05(r0)
            int r12 = A01(r3, r1, r0)
            goto L_0x0453
        L_0x0119:
            java.lang.Object r11 = X.C25856CnK.A00(r6, r0)
            java.util.List r11 = (java.util.List) r11
            X.EAO r10 = r5.A0N(r4)
            X.CXo r0 = X.C26298CxB.A02
            int r9 = r11.size()
            r8 = 0
            r12 = 0
            if (r9 != 0) goto L_0x0130
        L_0x012d:
            r12 = 0
            goto L_0x0453
        L_0x0130:
            if (r8 >= r9) goto L_0x0453
            java.lang.Object r2 = r11.get(r8)
            X.EDk r2 = (X.C28668EDk) r2
            int r0 = X.C25878Cnp.A05(r3)
            int r1 = r0 * 2
            X.DNC r2 = (X.DNC) r2
            int r0 = r2.A0J(r10)
            int r1 = r1 + r0
            int r12 = r12 + r1
            int r8 = r8 + 1
            goto L_0x0130
        L_0x0149:
            java.lang.Object r2 = X.C25856CnK.A00(r6, r0)
            java.lang.Object[] r1 = r5.A07
            int r0 = r4 / 3
            int r0 = r0 * 2
            r0 = r1[r0]
            int r12 = X.C25879Cnq.A00(r2, r0, r3)
            goto L_0x0453
        L_0x015b:
            boolean r0 = r5.A0d(r6, r4)
            goto L_0x02b8
        L_0x0161:
            boolean r0 = r5.A0d(r6, r4)
            goto L_0x02c6
        L_0x0167:
            boolean r2 = r5.A0d(r6, r4)
            if (r2 == 0) goto L_0x0025
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r2.A07(r6, r0)
            int r12 = X.C25878Cnp.A05(r3)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x0452
        L_0x017d:
            boolean r2 = r5.A0d(r6, r4)
            if (r2 == 0) goto L_0x0025
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r2.A07(r6, r0)
            int r12 = X.C25878Cnp.A05(r3)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x0452
        L_0x0193:
            boolean r2 = r5.A0d(r6, r4)
            if (r2 == 0) goto L_0x0025
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            int r1 = r2.A06(r6, r0)
            int r12 = X.C25878Cnp.A05(r3)
            if (r1 < 0) goto L_0x03e7
            goto L_0x03e0
        L_0x01a7:
            boolean r0 = r5.A0d(r6, r4)
            goto L_0x031a
        L_0x01ad:
            boolean r0 = r5.A0d(r6, r4)
            goto L_0x0328
        L_0x01b3:
            boolean r0 = r5.A0d(r6, r4)
            goto L_0x0336
        L_0x01b9:
            boolean r2 = r5.A0d(r6, r4)
            goto L_0x0344
        L_0x01bf:
            boolean r2 = r5.A0d(r6, r4)
            goto L_0x0372
        L_0x01c5:
            boolean r2 = r5.A0d(r6, r4)
            goto L_0x0398
        L_0x01cb:
            boolean r2 = r5.A0d(r6, r4)
            if (r2 == 0) goto L_0x0025
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            int r1 = r2.A06(r6, r0)
            int r12 = X.C25878Cnp.A05(r3)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
            goto L_0x0452
        L_0x01e3:
            boolean r2 = r5.A0d(r6, r4)
            if (r2 == 0) goto L_0x0025
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            int r1 = r2.A06(r6, r0)
            int r12 = X.C25878Cnp.A05(r3)
            if (r1 < 0) goto L_0x03e7
            goto L_0x03e0
        L_0x01f7:
            boolean r0 = r5.A0d(r6, r4)
            goto L_0x03ee
        L_0x01fd:
            boolean r0 = r5.A0d(r6, r4)
            goto L_0x03fb
        L_0x0203:
            boolean r2 = r5.A0d(r6, r4)
            if (r2 == 0) goto L_0x0025
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r2.A06(r6, r0)
            int r12 = X.C25878Cnp.A05(r3)
            int r0 = X.C25878Cnp.A06(r0)
            goto L_0x0452
        L_0x0219:
            boolean r2 = r5.A0d(r6, r4)
            if (r2 == 0) goto L_0x0025
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r2.A07(r6, r0)
            int r12 = X.C25878Cnp.A05(r3)
            long r0 = X.BE9.A0L(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x0452
        L_0x0233:
            boolean r2 = r5.A0d(r6, r4)
            goto L_0x043a
        L_0x0239:
            java.lang.Object r0 = r7.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26298CxB.A03(r0)
            goto L_0x02a4
        L_0x0244:
            java.lang.Object r0 = r7.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26298CxB.A07(r0)
            goto L_0x02a4
        L_0x024f:
            java.lang.Object r0 = r7.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26298CxB.A02(r0)
            goto L_0x02a4
        L_0x025a:
            java.lang.Object r0 = r7.getObject(r6, r0)
            int r1 = A0H(r0)
            goto L_0x02a4
        L_0x0263:
            java.lang.Object r0 = r7.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26298CxB.A06(r0)
            goto L_0x02a4
        L_0x026e:
            java.lang.Object r0 = r7.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26298CxB.A01(r0)
            goto L_0x02a4
        L_0x0279:
            java.lang.Object r0 = r7.getObject(r6, r0)
            int r0 = A0H(r0)
            int r1 = r0 * 4
            goto L_0x02a4
        L_0x0284:
            java.lang.Object r0 = r7.getObject(r6, r0)
            int r0 = A0H(r0)
            int r1 = r0 * 8
            goto L_0x02a4
        L_0x028f:
            java.lang.Object r0 = r7.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26298CxB.A04(r0)
            goto L_0x02a4
        L_0x029a:
            java.lang.Object r0 = r7.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26298CxB.A05(r0)
        L_0x02a4:
            if (r1 <= 0) goto L_0x0025
            int r12 = X.C25878Cnp.A05(r3)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
            int r12 = r12 + r0
            int r12 = r12 + r1
            goto L_0x0453
        L_0x02b4:
            boolean r0 = r5.A0e(r6, r3, r4)
        L_0x02b8:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C25878Cnp.A05(r3)
            int r12 = r0 + 8
            goto L_0x0453
        L_0x02c2:
            boolean r0 = r5.A0e(r6, r3, r4)
        L_0x02c6:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C25878Cnp.A05(r3)
            int r12 = r0 + 4
            goto L_0x0453
        L_0x02d0:
            boolean r2 = r5.A0e(r6, r3, r4)
            if (r2 == 0) goto L_0x0025
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            long r0 = X.C17880vN.A05(r0)
            int r12 = X.C25878Cnp.A05(r3)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x0452
        L_0x02e8:
            boolean r2 = r5.A0e(r6, r3, r4)
            if (r2 == 0) goto L_0x0025
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            long r0 = X.C17880vN.A05(r0)
            int r12 = X.C25878Cnp.A05(r3)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x0452
        L_0x0300:
            boolean r2 = r5.A0e(r6, r3, r4)
            if (r2 == 0) goto L_0x0025
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r12 = X.C25878Cnp.A05(r3)
            if (r1 < 0) goto L_0x03e7
            goto L_0x03e0
        L_0x0316:
            boolean r0 = r5.A0e(r6, r3, r4)
        L_0x031a:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C25878Cnp.A05(r3)
            int r12 = r0 + 8
            goto L_0x0453
        L_0x0324:
            boolean r0 = r5.A0e(r6, r3, r4)
        L_0x0328:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C25878Cnp.A05(r3)
            int r12 = r0 + 4
            goto L_0x0453
        L_0x0332:
            boolean r0 = r5.A0e(r6, r3, r4)
        L_0x0336:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C25878Cnp.A05(r3)
            int r12 = r0 + 1
            goto L_0x0453
        L_0x0340:
            boolean r2 = r5.A0e(r6, r3, r4)
        L_0x0344:
            if (r2 == 0) goto L_0x0025
            java.lang.Object r1 = X.C25856CnK.A00(r6, r0)
            boolean r0 = r1 instanceof X.DSQ
            if (r0 == 0) goto L_0x0362
            X.DSQ r1 = (X.DSQ) r1
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r12 = X.C25878Cnp.A05(r3)
            int r1 = r1.A02()
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            int r12 = r12 + r0
            goto L_0x0453
        L_0x0362:
            java.lang.String r1 = (java.lang.String) r1
            int r12 = X.C25878Cnp.A05(r3)
            int r0 = com.google.protobuf.CodedOutputStream.A04(r1)
            goto L_0x0452
        L_0x036e:
            boolean r2 = r5.A0e(r6, r3, r4)
        L_0x0372:
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = X.C25856CnK.A00(r6, r0)
            X.EAO r1 = r5.A0N(r4)
            X.CXo r0 = X.C26298CxB.A02
            X.EDk r2 = (X.C28668EDk) r2
            int r12 = X.C25878Cnp.A05(r3)
            X.DNC r2 = (X.DNC) r2
            int r1 = r2.A0J(r1)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            int r12 = r12 + r0
            goto L_0x0453
        L_0x0394:
            boolean r2 = r5.A0e(r6, r3, r4)
        L_0x0398:
            if (r2 == 0) goto L_0x0025
            java.lang.Object r1 = X.C25856CnK.A00(r6, r0)
            X.DSQ r1 = (X.DSQ) r1
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r12 = X.C25878Cnp.A05(r3)
            int r1 = r1.A02()
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            int r12 = r12 + r0
            goto L_0x0453
        L_0x03b2:
            boolean r2 = r5.A0e(r6, r3, r4)
            if (r2 == 0) goto L_0x0025
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r12 = X.C25878Cnp.A05(r3)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
            goto L_0x0452
        L_0x03cc:
            boolean r2 = r5.A0e(r6, r3, r4)
            if (r2 == 0) goto L_0x0025
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r12 = X.C25878Cnp.A05(r3)
            if (r1 < 0) goto L_0x03e7
        L_0x03e0:
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
            goto L_0x0452
        L_0x03e7:
            r0 = 10
            goto L_0x0452
        L_0x03ea:
            boolean r0 = r5.A0e(r6, r3, r4)
        L_0x03ee:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C25878Cnp.A05(r3)
            int r12 = r0 + 4
            goto L_0x0453
        L_0x03f7:
            boolean r0 = r5.A0e(r6, r3, r4)
        L_0x03fb:
            if (r0 == 0) goto L_0x0025
            int r0 = X.C25878Cnp.A05(r3)
            int r12 = r0 + 8
            goto L_0x0453
        L_0x0404:
            boolean r2 = r5.A0e(r6, r3, r4)
            if (r2 == 0) goto L_0x0025
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            int r12 = X.C25878Cnp.A05(r3)
            int r0 = X.C25878Cnp.A06(r0)
            goto L_0x0452
        L_0x041b:
            boolean r2 = r5.A0e(r6, r3, r4)
            if (r2 == 0) goto L_0x0025
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            long r0 = X.C17880vN.A05(r0)
            int r12 = X.C25878Cnp.A05(r3)
            long r0 = X.BE9.A0L(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x0452
        L_0x0436:
            boolean r2 = r5.A0e(r6, r3, r4)
        L_0x043a:
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = X.C25856CnK.A00(r6, r0)
            X.EDk r2 = (X.C28668EDk) r2
            X.EAO r1 = r5.A0N(r4)
            int r0 = X.C25878Cnp.A05(r3)
            int r12 = r0 * 2
            X.DNC r2 = (X.DNC) r2
            int r0 = r2.A0J(r1)
        L_0x0452:
            int r12 = r12 + r0
        L_0x0453:
            int r16 = r16 + r12
            goto L_0x0025
        L_0x0457:
            sun.misc.Unsafe r4 = A0F
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            r16 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r14 = 0
        L_0x0463:
            int[] r1 = r5.A05
            int r0 = r1.length
            if (r3 >= r0) goto L_0x08b7
            int r0 = r3 + 1
            r11 = r1[r0]
            r8 = r1[r3]
            int r10 = X.BE7.A04(r11)
            r0 = 17
            r9 = 1
            if (r10 > r0) goto L_0x08b4
            int r0 = r3 + 2
            r0 = r1[r0]
            r2 = r0 & r15
            int r0 = r0 >>> 20
            int r9 = r9 << r0
            if (r2 == r7) goto L_0x0488
            long r0 = (long) r2
            int r14 = r4.getInt(r6, r0)
            r7 = r2
        L_0x0488:
            r11 = r11 & r15
            long r1 = (long) r11
            switch(r10) {
                case 0: goto L_0x0490;
                case 1: goto L_0x0494;
                case 2: goto L_0x0498;
                case 3: goto L_0x04aa;
                case 4: goto L_0x04bc;
                case 5: goto L_0x04cc;
                case 6: goto L_0x04d0;
                case 7: goto L_0x04dc;
                case 8: goto L_0x04e0;
                case 9: goto L_0x04e4;
                case 10: goto L_0x04e8;
                case 11: goto L_0x04ec;
                case 12: goto L_0x0500;
                case 13: goto L_0x0510;
                case 14: goto L_0x0514;
                case 15: goto L_0x0518;
                case 16: goto L_0x052a;
                case 17: goto L_0x0540;
                case 18: goto L_0x060e;
                case 19: goto L_0x05fb;
                case 20: goto L_0x0544;
                case 21: goto L_0x0560;
                case 22: goto L_0x0578;
                case 23: goto L_0x060e;
                case 24: goto L_0x05fb;
                case 25: goto L_0x0590;
                case 26: goto L_0x05a3;
                case 27: goto L_0x05af;
                case 28: goto L_0x05bf;
                case 29: goto L_0x05cb;
                case 30: goto L_0x05e3;
                case 31: goto L_0x05fb;
                case 32: goto L_0x060e;
                case 33: goto L_0x0621;
                case 34: goto L_0x0639;
                case 35: goto L_0x06cc;
                case 36: goto L_0x06c1;
                case 37: goto L_0x0681;
                case 38: goto L_0x068c;
                case 39: goto L_0x0697;
                case 40: goto L_0x06cc;
                case 41: goto L_0x06c1;
                case 42: goto L_0x06a2;
                case 43: goto L_0x06ab;
                case 44: goto L_0x06b6;
                case 45: goto L_0x06c1;
                case 46: goto L_0x06cc;
                case 47: goto L_0x06d7;
                case 48: goto L_0x06e2;
                case 49: goto L_0x0651;
                case 50: goto L_0x06fc;
                case 51: goto L_0x070e;
                case 52: goto L_0x071c;
                case 53: goto L_0x072a;
                case 54: goto L_0x0742;
                case 55: goto L_0x075a;
                case 56: goto L_0x0770;
                case 57: goto L_0x077e;
                case 58: goto L_0x078c;
                case 59: goto L_0x079a;
                case 60: goto L_0x07c8;
                case 61: goto L_0x07ee;
                case 62: goto L_0x080c;
                case 63: goto L_0x0826;
                case 64: goto L_0x0844;
                case 65: goto L_0x0854;
                case 66: goto L_0x0861;
                case 67: goto L_0x0878;
                case 68: goto L_0x0893;
                default: goto L_0x048d;
            }
        L_0x048d:
            int r3 = r3 + 3
            goto L_0x0463
        L_0x0490:
            r0 = r14 & r9
            goto L_0x0712
        L_0x0494:
            r0 = r14 & r9
            goto L_0x0720
        L_0x0498:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x048d
            long r0 = r4.getLong(r6, r1)
            int r9 = X.C25878Cnp.A05(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x08af
        L_0x04aa:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x048d
            long r0 = r4.getLong(r6, r1)
            int r9 = X.C25878Cnp.A05(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x08af
        L_0x04bc:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x048d
            int r1 = r4.getInt(r6, r1)
            int r9 = X.C25878Cnp.A05(r8)
            if (r1 < 0) goto L_0x0841
            goto L_0x083a
        L_0x04cc:
            r0 = r14 & r9
            goto L_0x0774
        L_0x04d0:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x048d
            int r0 = X.C25878Cnp.A05(r8)
            int r9 = r0 + 4
            goto L_0x08b0
        L_0x04dc:
            r0 = r14 & r9
            goto L_0x0790
        L_0x04e0:
            r0 = r14 & r9
            goto L_0x079e
        L_0x04e4:
            r0 = r14 & r9
            goto L_0x07cc
        L_0x04e8:
            r0 = r14 & r9
            goto L_0x07f2
        L_0x04ec:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x048d
            int r1 = r4.getInt(r6, r1)
            int r9 = X.C25878Cnp.A05(r8)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
            goto L_0x08af
        L_0x0500:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x048d
            int r1 = r4.getInt(r6, r1)
            int r9 = X.C25878Cnp.A05(r8)
            if (r1 < 0) goto L_0x0841
            goto L_0x083a
        L_0x0510:
            r0 = r14 & r9
            goto L_0x0848
        L_0x0514:
            r0 = r14 & r9
            goto L_0x0858
        L_0x0518:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x048d
            int r0 = r4.getInt(r6, r1)
            int r9 = X.C25878Cnp.A05(r8)
            int r0 = X.C25878Cnp.A06(r0)
            goto L_0x08af
        L_0x052a:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x048d
            long r0 = r4.getLong(r6, r1)
            int r9 = X.C25878Cnp.A05(r8)
            long r0 = X.BE9.A0L(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x08af
        L_0x0540:
            r0 = r14 & r9
            goto L_0x0897
        L_0x0544:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.CXo r0 = X.C26298CxB.A02
            int r0 = r2.size()
            if (r0 == 0) goto L_0x0665
            int r1 = X.C26298CxB.A03(r2)
            int r0 = r2.size()
            int r9 = A01(r8, r0, r1)
            goto L_0x08b0
        L_0x0560:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.CXo r0 = X.C26298CxB.A02
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0665
            int r0 = X.C26298CxB.A07(r2)
            int r9 = A01(r8, r1, r0)
            goto L_0x08b0
        L_0x0578:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.CXo r0 = X.C26298CxB.A02
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0665
            int r0 = X.C26298CxB.A02(r2)
            int r9 = A01(r8, r1, r0)
            goto L_0x08b0
        L_0x0590:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r9 = A0H(r0)
            if (r9 == 0) goto L_0x0665
            int r0 = X.C25878Cnp.A05(r8)
            int r0 = r0 + 1
            int r9 = r9 * r0
            goto L_0x08b0
        L_0x05a3:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r9 = X.C26298CxB.A09(r0, r8)
            goto L_0x08b0
        L_0x05af:
            java.lang.Object r1 = r4.getObject(r6, r1)
            java.util.List r1 = (java.util.List) r1
            X.EAO r0 = r5.A0N(r3)
            int r9 = X.C26298CxB.A00(r0, r1, r8)
            goto L_0x08b0
        L_0x05bf:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r9 = X.C26298CxB.A08(r0, r8)
            goto L_0x08b0
        L_0x05cb:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.CXo r0 = X.C26298CxB.A02
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0665
            int r0 = X.C26298CxB.A06(r2)
            int r9 = A01(r8, r1, r0)
            goto L_0x08b0
        L_0x05e3:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.CXo r0 = X.C26298CxB.A02
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0665
            int r0 = X.C26298CxB.A01(r2)
            int r9 = A01(r8, r1, r0)
            goto L_0x08b0
        L_0x05fb:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r9 = A0H(r0)
            if (r9 == 0) goto L_0x0665
            int r0 = X.C25878Cnp.A05(r8)
            int r0 = r0 + 4
            int r9 = r9 * r0
            goto L_0x08b0
        L_0x060e:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r9 = A0H(r0)
            if (r9 == 0) goto L_0x0665
            int r0 = X.C25878Cnp.A05(r8)
            int r0 = r0 + 8
            int r9 = r9 * r0
            goto L_0x08b0
        L_0x0621:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.CXo r0 = X.C26298CxB.A02
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0665
            int r0 = X.C26298CxB.A04(r2)
            int r9 = A01(r8, r1, r0)
            goto L_0x08b0
        L_0x0639:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            X.CXo r0 = X.C26298CxB.A02
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0665
            int r0 = X.C26298CxB.A05(r2)
            int r9 = A01(r8, r1, r0)
            goto L_0x08b0
        L_0x0651:
            java.lang.Object r13 = r4.getObject(r6, r1)
            java.util.List r13 = (java.util.List) r13
            X.EAO r12 = r5.A0N(r3)
            X.CXo r0 = X.C26298CxB.A02
            int r11 = r13.size()
            r10 = 0
            r9 = 0
            if (r11 != 0) goto L_0x0668
        L_0x0665:
            r9 = 0
            goto L_0x08b0
        L_0x0668:
            if (r10 >= r11) goto L_0x08b0
            java.lang.Object r2 = r13.get(r10)
            X.EDk r2 = (X.C28668EDk) r2
            int r0 = X.C25878Cnp.A05(r8)
            int r1 = r0 * 2
            X.DNC r2 = (X.DNC) r2
            int r0 = r2.A0J(r12)
            int r1 = r1 + r0
            int r9 = r9 + r1
            int r10 = r10 + 1
            goto L_0x0668
        L_0x0681:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26298CxB.A03(r0)
            goto L_0x06ec
        L_0x068c:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26298CxB.A07(r0)
            goto L_0x06ec
        L_0x0697:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26298CxB.A02(r0)
            goto L_0x06ec
        L_0x06a2:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r2 = A0H(r0)
            goto L_0x06ec
        L_0x06ab:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26298CxB.A06(r0)
            goto L_0x06ec
        L_0x06b6:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26298CxB.A01(r0)
            goto L_0x06ec
        L_0x06c1:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A0H(r0)
            int r2 = r0 * 4
            goto L_0x06ec
        L_0x06cc:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A0H(r0)
            int r2 = r0 * 8
            goto L_0x06ec
        L_0x06d7:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26298CxB.A04(r0)
            goto L_0x06ec
        L_0x06e2:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26298CxB.A05(r0)
        L_0x06ec:
            if (r2 <= 0) goto L_0x048d
            int r1 = X.C25878Cnp.A05(r8)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r2)
            int r1 = r1 + r0
            int r1 = r1 + r2
            goto L_0x0850
        L_0x06fc:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.lang.Object[] r1 = r5.A07
            int r0 = r3 / 3
            int r0 = r0 * 2
            r0 = r1[r0]
            int r9 = X.C25879Cnq.A00(r2, r0, r8)
            goto L_0x08b0
        L_0x070e:
            boolean r0 = r5.A0e(r6, r8, r3)
        L_0x0712:
            if (r0 == 0) goto L_0x048d
            int r0 = X.C25878Cnp.A05(r8)
            int r9 = r0 + 8
            goto L_0x08b0
        L_0x071c:
            boolean r0 = r5.A0e(r6, r8, r3)
        L_0x0720:
            if (r0 == 0) goto L_0x048d
            int r0 = X.C25878Cnp.A05(r8)
            int r9 = r0 + 4
            goto L_0x08b0
        L_0x072a:
            boolean r0 = r5.A0e(r6, r8, r3)
            if (r0 == 0) goto L_0x048d
            java.lang.Object r0 = X.C25856CnK.A00(r6, r1)
            long r0 = X.C17880vN.A05(r0)
            int r9 = X.C25878Cnp.A05(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x08af
        L_0x0742:
            boolean r0 = r5.A0e(r6, r8, r3)
            if (r0 == 0) goto L_0x048d
            java.lang.Object r0 = X.C25856CnK.A00(r6, r1)
            long r0 = X.C17880vN.A05(r0)
            int r9 = X.C25878Cnp.A05(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x08af
        L_0x075a:
            boolean r0 = r5.A0e(r6, r8, r3)
            if (r0 == 0) goto L_0x048d
            java.lang.Object r0 = X.C25856CnK.A00(r6, r1)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r9 = X.C25878Cnp.A05(r8)
            if (r1 < 0) goto L_0x0841
            goto L_0x083a
        L_0x0770:
            boolean r0 = r5.A0e(r6, r8, r3)
        L_0x0774:
            if (r0 == 0) goto L_0x048d
            int r0 = X.C25878Cnp.A05(r8)
            int r9 = r0 + 8
            goto L_0x08b0
        L_0x077e:
            boolean r0 = r5.A0e(r6, r8, r3)
            if (r0 == 0) goto L_0x048d
            int r0 = X.C25878Cnp.A05(r8)
            int r1 = r0 + 4
            goto L_0x0850
        L_0x078c:
            boolean r0 = r5.A0e(r6, r8, r3)
        L_0x0790:
            if (r0 == 0) goto L_0x048d
            int r0 = X.C25878Cnp.A05(r8)
            int r9 = r0 + 1
            goto L_0x08b0
        L_0x079a:
            boolean r0 = r5.A0e(r6, r8, r3)
        L_0x079e:
            if (r0 == 0) goto L_0x048d
            java.lang.Object r1 = r4.getObject(r6, r1)
            boolean r0 = r1 instanceof X.DSQ
            if (r0 == 0) goto L_0x07bc
            X.DSQ r1 = (X.DSQ) r1
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r9 = X.C25878Cnp.A05(r8)
            int r1 = r1.A02()
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            goto L_0x08b0
        L_0x07bc:
            java.lang.String r1 = (java.lang.String) r1
            int r9 = X.C25878Cnp.A05(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A04(r1)
            goto L_0x08af
        L_0x07c8:
            boolean r0 = r5.A0e(r6, r8, r3)
        L_0x07cc:
            if (r0 == 0) goto L_0x048d
            java.lang.Object r2 = r4.getObject(r6, r1)
            X.EAO r1 = r5.A0N(r3)
            X.CXo r0 = X.C26298CxB.A02
            X.EDk r2 = (X.C28668EDk) r2
            int r9 = X.C25878Cnp.A05(r8)
            X.DNC r2 = (X.DNC) r2
            int r1 = r2.A0J(r1)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            goto L_0x08b0
        L_0x07ee:
            boolean r0 = r5.A0e(r6, r8, r3)
        L_0x07f2:
            if (r0 == 0) goto L_0x048d
            java.lang.Object r1 = r4.getObject(r6, r1)
            X.DSQ r1 = (X.DSQ) r1
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r9 = X.C25878Cnp.A05(r8)
            int r1 = r1.A02()
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            goto L_0x08b0
        L_0x080c:
            boolean r0 = r5.A0e(r6, r8, r3)
            if (r0 == 0) goto L_0x048d
            java.lang.Object r0 = X.C25856CnK.A00(r6, r1)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r9 = X.C25878Cnp.A05(r8)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
            goto L_0x08af
        L_0x0826:
            boolean r0 = r5.A0e(r6, r8, r3)
            if (r0 == 0) goto L_0x048d
            java.lang.Object r0 = X.C25856CnK.A00(r6, r1)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r9 = X.C25878Cnp.A05(r8)
            if (r1 < 0) goto L_0x0841
        L_0x083a:
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
            goto L_0x08af
        L_0x0841:
            r0 = 10
            goto L_0x08af
        L_0x0844:
            boolean r0 = r5.A0e(r6, r8, r3)
        L_0x0848:
            if (r0 == 0) goto L_0x048d
            int r0 = X.C25878Cnp.A05(r8)
            int r1 = r0 + 4
        L_0x0850:
            int r16 = r16 + r1
            goto L_0x048d
        L_0x0854:
            boolean r0 = r5.A0e(r6, r8, r3)
        L_0x0858:
            if (r0 == 0) goto L_0x048d
            int r0 = X.C25878Cnp.A05(r8)
            int r9 = r0 + 8
            goto L_0x08b0
        L_0x0861:
            boolean r0 = r5.A0e(r6, r8, r3)
            if (r0 == 0) goto L_0x048d
            java.lang.Object r0 = X.C25856CnK.A00(r6, r1)
            int r0 = X.AnonymousClass000.A0M(r0)
            int r9 = X.C25878Cnp.A05(r8)
            int r0 = X.C25878Cnp.A06(r0)
            goto L_0x08af
        L_0x0878:
            boolean r0 = r5.A0e(r6, r8, r3)
            if (r0 == 0) goto L_0x048d
            java.lang.Object r0 = X.C25856CnK.A00(r6, r1)
            long r0 = X.C17880vN.A05(r0)
            int r9 = X.C25878Cnp.A05(r8)
            long r0 = X.BE9.A0L(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x08af
        L_0x0893:
            boolean r0 = r5.A0e(r6, r8, r3)
        L_0x0897:
            if (r0 == 0) goto L_0x048d
            java.lang.Object r2 = r4.getObject(r6, r1)
            X.EDk r2 = (X.C28668EDk) r2
            X.EAO r1 = r5.A0N(r3)
            int r0 = X.C25878Cnp.A05(r8)
            int r9 = r0 * 2
            X.DNC r2 = (X.DNC) r2
            int r0 = r2.A0J(r1)
        L_0x08af:
            int r9 = r9 + r0
        L_0x08b0:
            int r16 = r16 + r9
            goto L_0x048d
        L_0x08b4:
            r9 = 0
            goto L_0x0488
        L_0x08b7:
            X.Bm6 r6 = (X.C23577Bm6) r6
            X.Cr6 r0 = r6.unknownFields
            int r0 = r0.A01()
            int r16 = r16 + r0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.BZ1(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b0, code lost:
        r0 = X.CIC.A04;
        r0 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b4, code lost:
        if (r1 == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b6, code lost:
        r0 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bf, code lost:
        r6 = r6 * 53;
        r0 = ((java.lang.String) X.C25856CnK.A00(r10, r0)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fa, code lost:
        r6 = r6 * 53;
        r0 = X.C25856CnK.A00(r10, r0).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0104, code lost:
        r6 = r6 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3 = r3 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int Bcu(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r5 = r9.A05
            int r4 = r5.length
            r3 = 0
            r6 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x0107
            int r0 = r3 + 1
            r2 = r5[r0]
            r8 = r5[r3]
            long r0 = X.BE6.A0M(r2)
            int r7 = X.BE7.A04(r2)
            r2 = 37
            switch(r7) {
                case 0: goto L_0x002b;
                case 1: goto L_0x003f;
                case 2: goto L_0x0060;
                case 3: goto L_0x0060;
                case 4: goto L_0x0056;
                case 5: goto L_0x0060;
                case 6: goto L_0x0056;
                case 7: goto L_0x004d;
                case 8: goto L_0x00bf;
                case 9: goto L_0x001d;
                case 10: goto L_0x00fa;
                case 11: goto L_0x0056;
                case 12: goto L_0x0056;
                case 13: goto L_0x0056;
                case 14: goto L_0x0060;
                case 15: goto L_0x0056;
                case 16: goto L_0x0060;
                case 17: goto L_0x001d;
                case 18: goto L_0x00fa;
                case 19: goto L_0x00fa;
                case 20: goto L_0x00fa;
                case 21: goto L_0x00fa;
                case 22: goto L_0x00fa;
                case 23: goto L_0x00fa;
                case 24: goto L_0x00fa;
                case 25: goto L_0x00fa;
                case 26: goto L_0x00fa;
                case 27: goto L_0x00fa;
                case 28: goto L_0x00fa;
                case 29: goto L_0x00fa;
                case 30: goto L_0x00fa;
                case 31: goto L_0x00fa;
                case 32: goto L_0x00fa;
                case 33: goto L_0x00fa;
                case 34: goto L_0x00fa;
                case 35: goto L_0x00fa;
                case 36: goto L_0x00fa;
                case 37: goto L_0x00fa;
                case 38: goto L_0x00fa;
                case 39: goto L_0x00fa;
                case 40: goto L_0x00fa;
                case 41: goto L_0x00fa;
                case 42: goto L_0x00fa;
                case 43: goto L_0x00fa;
                case 44: goto L_0x00fa;
                case 45: goto L_0x00fa;
                case 46: goto L_0x00fa;
                case 47: goto L_0x00fa;
                case 48: goto L_0x00fa;
                case 49: goto L_0x00fa;
                case 50: goto L_0x00fa;
                case 51: goto L_0x0070;
                case 52: goto L_0x008b;
                case 53: goto L_0x00dd;
                case 54: goto L_0x00dd;
                case 55: goto L_0x00cc;
                case 56: goto L_0x00dd;
                case 57: goto L_0x00cc;
                case 58: goto L_0x00a0;
                case 59: goto L_0x00b9;
                case 60: goto L_0x00f4;
                case 61: goto L_0x00f4;
                case 62: goto L_0x00cc;
                case 63: goto L_0x00cc;
                case 64: goto L_0x00cc;
                case 65: goto L_0x00dd;
                case 66: goto L_0x00cc;
                case 67: goto L_0x00dd;
                case 68: goto L_0x00f4;
                default: goto L_0x001a;
            }
        L_0x001a:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x001d:
            java.lang.Object r0 = X.C25856CnK.A00(r10, r0)
            if (r0 == 0) goto L_0x0027
            int r2 = r0.hashCode()
        L_0x0027:
            int r6 = r6 * 53
            int r6 = r6 + r2
            goto L_0x001a
        L_0x002b:
            int r6 = r6 * 53
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            double r0 = r2.A03(r10, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            java.nio.charset.Charset r0 = X.CIC.A04
            int r0 = X.AnonymousClass000.A0I(r1)
            goto L_0x0104
        L_0x003f:
            int r6 = r6 * 53
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r2.A04(r10, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0104
        L_0x004d:
            int r6 = r6 * 53
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            boolean r1 = r2.A0L(r10, r0)
            goto L_0x00b0
        L_0x0056:
            int r6 = r6 * 53
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r2.A06(r10, r0)
            goto L_0x0104
        L_0x0060:
            int r6 = r6 * 53
            X.CnK r2 = com.google.protobuf.UnsafeUtil.A02
            long r1 = r2.A07(r10, r0)
            java.nio.charset.Charset r0 = X.CIC.A04
            int r0 = X.AnonymousClass000.A0I(r1)
            goto L_0x0104
        L_0x0070:
            boolean r2 = r9.A0e(r10, r8, r3)
            if (r2 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.C25856CnK.A00(r10, r0)
            double r0 = X.AnonymousClass8BR.A00(r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            java.nio.charset.Charset r0 = X.CIC.A04
            int r0 = X.AnonymousClass000.A0I(r1)
            goto L_0x0104
        L_0x008b:
            boolean r2 = r9.A0e(r10, r8, r3)
            if (r2 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.C25856CnK.A00(r10, r0)
            float r0 = X.AnonymousClass000.A04(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0104
        L_0x00a0:
            boolean r2 = r9.A0e(r10, r8, r3)
            if (r2 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.C25856CnK.A00(r10, r0)
            boolean r1 = X.AnonymousClass000.A1Y(r0)
        L_0x00b0:
            java.nio.charset.Charset r0 = X.CIC.A04
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0104
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L_0x0104
        L_0x00b9:
            boolean r2 = r9.A0e(r10, r8, r3)
            if (r2 == 0) goto L_0x001a
        L_0x00bf:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C25856CnK.A00(r10, r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x0104
        L_0x00cc:
            boolean r2 = r9.A0e(r10, r8, r3)
            if (r2 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.C25856CnK.A00(r10, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            goto L_0x0104
        L_0x00dd:
            boolean r2 = r9.A0e(r10, r8, r3)
            if (r2 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.C25856CnK.A00(r10, r0)
            long r1 = X.C17880vN.A05(r0)
            java.nio.charset.Charset r0 = X.CIC.A04
            int r0 = X.AnonymousClass000.A0I(r1)
            goto L_0x0104
        L_0x00f4:
            boolean r2 = r9.A0e(r10, r8, r3)
            if (r2 == 0) goto L_0x001a
        L_0x00fa:
            java.lang.Object r0 = X.C25856CnK.A00(r10, r0)
            int r6 = r6 * 53
            int r0 = r0.hashCode()
        L_0x0104:
            int r6 = r6 + r0
            goto L_0x001a
        L_0x0107:
            int r1 = r6 * 53
            X.Bm6 r10 = (X.C23577Bm6) r10
            X.Cr6 r0 = r10.unknownFields
            int r0 = X.AnonymousClass000.A0O(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.Bcu(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0174, code lost:
        r5 = r8.getObject(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x017c, code lost:
        if (A0c(r5) != false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x017e, code lost:
        r4 = r6.BkG();
        r6.Bjk(r4, r5);
        r8.putObject(r10, r0, r4);
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0189, code lost:
        r6.Bjk(r5, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bjk(java.lang.Object r16, java.lang.Object r17) {
        /*
            r15 = this;
            r10 = r16
            A0Z(r10)
            r2 = r17
            if (r17 == 0) goto L_0x01bc
            r3 = 0
        L_0x000a:
            int[] r4 = r15.A05
            int r0 = r4.length
            if (r3 >= r0) goto L_0x01b8
            int r1 = r3 + 1
            r0 = r4[r1]
            long r11 = X.BE6.A0M(r0)
            r5 = r4[r3]
            int r0 = X.BE7.A04(r0)
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x0034;
                case 2: goto L_0x0076;
                case 3: goto L_0x0076;
                case 4: goto L_0x0065;
                case 5: goto L_0x0076;
                case 6: goto L_0x0065;
                case 7: goto L_0x0045;
                case 8: goto L_0x0056;
                case 9: goto L_0x0102;
                case 10: goto L_0x0056;
                case 11: goto L_0x0065;
                case 12: goto L_0x0065;
                case 13: goto L_0x0065;
                case 14: goto L_0x0076;
                case 15: goto L_0x0065;
                case 16: goto L_0x0076;
                case 17: goto L_0x0102;
                case 18: goto L_0x0087;
                case 19: goto L_0x0087;
                case 20: goto L_0x0087;
                case 21: goto L_0x0087;
                case 22: goto L_0x0087;
                case 23: goto L_0x0087;
                case 24: goto L_0x0087;
                case 25: goto L_0x0087;
                case 26: goto L_0x0087;
                case 27: goto L_0x0087;
                case 28: goto L_0x0087;
                case 29: goto L_0x0087;
                case 30: goto L_0x0087;
                case 31: goto L_0x0087;
                case 32: goto L_0x0087;
                case 33: goto L_0x0087;
                case 34: goto L_0x0087;
                case 35: goto L_0x0087;
                case 36: goto L_0x0087;
                case 37: goto L_0x0087;
                case 38: goto L_0x0087;
                case 39: goto L_0x0087;
                case 40: goto L_0x0087;
                case 41: goto L_0x0087;
                case 42: goto L_0x0087;
                case 43: goto L_0x0087;
                case 44: goto L_0x0087;
                case 45: goto L_0x0087;
                case 46: goto L_0x0087;
                case 47: goto L_0x0087;
                case 48: goto L_0x0087;
                case 49: goto L_0x0087;
                case 50: goto L_0x00df;
                case 51: goto L_0x00f4;
                case 52: goto L_0x00f4;
                case 53: goto L_0x00f4;
                case 54: goto L_0x00f4;
                case 55: goto L_0x00f4;
                case 56: goto L_0x00f4;
                case 57: goto L_0x00f4;
                case 58: goto L_0x00f4;
                case 59: goto L_0x00f4;
                case 60: goto L_0x0139;
                case 61: goto L_0x00f4;
                case 62: goto L_0x00f4;
                case 63: goto L_0x00f4;
                case 64: goto L_0x00f4;
                case 65: goto L_0x00f4;
                case 66: goto L_0x00f4;
                case 67: goto L_0x00f4;
                case 68: goto L_0x0139;
                default: goto L_0x0020;
            }
        L_0x0020:
            int r3 = r3 + 3
            goto L_0x000a
        L_0x0023:
            boolean r0 = r15.A0d(r2, r3)
            if (r0 == 0) goto L_0x0020
            X.CnK r9 = com.google.protobuf.UnsafeUtil.A02
            double r13 = r9.A03(r2, r11)
            r9.A0C(r10, r11, r13)
            goto L_0x0129
        L_0x0034:
            boolean r0 = r15.A0d(r2, r3)
            if (r0 == 0) goto L_0x0020
            X.CnK r1 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r1.A04(r2, r11)
            r1.A0D(r10, r11, r0)
            goto L_0x0129
        L_0x0045:
            boolean r0 = r15.A0d(r2, r3)
            if (r0 == 0) goto L_0x0020
            X.CnK r1 = com.google.protobuf.UnsafeUtil.A02
            boolean r0 = r1.A0L(r2, r11)
            r1.A0H(r10, r11, r0)
            goto L_0x0129
        L_0x0056:
            boolean r0 = r15.A0d(r2, r3)
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = X.C25856CnK.A00(r2, r11)
            com.google.protobuf.UnsafeUtil.A05(r10, r11, r0)
            goto L_0x0129
        L_0x0065:
            boolean r0 = r15.A0d(r2, r3)
            if (r0 == 0) goto L_0x0020
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r0.A06(r2, r11)
            com.google.protobuf.UnsafeUtil.A04(r10, r11, r0)
            goto L_0x0129
        L_0x0076:
            boolean r0 = r15.A0d(r2, r3)
            if (r0 == 0) goto L_0x0020
            X.CnK r9 = com.google.protobuf.UnsafeUtil.A02
            long r13 = r9.A07(r2, r11)
            r9.A0F(r10, r11, r13)
            goto L_0x0129
        L_0x0087:
            X.CUq r0 = r15.A04
            boolean r0 = r0 instanceof X.C23660BnT
            if (r0 == 0) goto L_0x00bc
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            java.lang.Object r6 = r0.A09(r10, r11)
            X.EE9 r6 = (X.EE9) r6
            java.lang.Object r5 = r0.A09(r2, r11)
            java.util.List r5 = (java.util.List) r5
            int r4 = r6.size()
            int r1 = r5.size()
            if (r4 <= 0) goto L_0x00b7
            if (r1 <= 0) goto L_0x00b6
            r0 = r6
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00b3
            int r1 = r1 + r4
            X.EE9 r6 = r6.Bk8(r1)
        L_0x00b3:
            r6.addAll(r5)
        L_0x00b6:
            r5 = r6
        L_0x00b7:
            com.google.protobuf.UnsafeUtil.A05(r10, r11, r5)
            goto L_0x0020
        L_0x00bc:
            java.lang.Object r5 = X.C25856CnK.A00(r2, r11)
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            java.util.List r4 = X.C23661BnU.A00(r10, r11, r0)
            int r1 = r4.size()
            int r0 = r5.size()
            if (r1 <= 0) goto L_0x00da
            if (r0 <= 0) goto L_0x00d9
            r4.addAll(r5)
        L_0x00d9:
            r5 = r4
        L_0x00da:
            com.google.protobuf.UnsafeUtil.A05(r10, r11, r5)
            goto L_0x0020
        L_0x00df:
            X.CXo r0 = X.C26298CxB.A02
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            java.lang.Object r1 = r0.A09(r10, r11)
            java.lang.Object r0 = r0.A09(r2, r11)
            X.Dbz r0 = X.C25879Cnq.A01(r1, r0)
            com.google.protobuf.UnsafeUtil.A05(r10, r11, r0)
            goto L_0x0020
        L_0x00f4:
            boolean r0 = r15.A0e(r2, r5, r3)
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = X.C25856CnK.A00(r2, r11)
            com.google.protobuf.UnsafeUtil.A05(r10, r11, r0)
            goto L_0x0160
        L_0x0102:
            boolean r0 = r15.A0d(r2, r3)
            if (r0 == 0) goto L_0x0020
            r0 = r4[r1]
            long r0 = X.BE6.A0M(r0)
            sun.misc.Unsafe r8 = A0F
            java.lang.Object r7 = r8.getObject(r2, r0)
            if (r7 == 0) goto L_0x018e
            X.EAO r6 = r15.A0N(r3)
            boolean r4 = r15.A0d(r10, r3)
            if (r4 != 0) goto L_0x0174
            boolean r4 = A0c(r7)
            if (r4 != 0) goto L_0x012e
            r8.putObject(r10, r0, r7)
        L_0x0129:
            r15.A0a(r10, r3)
            goto L_0x0020
        L_0x012e:
            X.Bm6 r4 = r6.BkG()
            r6.Bjk(r4, r7)
            r8.putObject(r10, r0, r4)
            goto L_0x0129
        L_0x0139:
            boolean r0 = r15.A0e(r2, r5, r3)
            if (r0 == 0) goto L_0x0020
            r0 = r4[r1]
            long r0 = X.BE6.A0M(r0)
            sun.misc.Unsafe r8 = A0F
            java.lang.Object r7 = r8.getObject(r2, r0)
            if (r7 == 0) goto L_0x01a3
            X.EAO r6 = r15.A0N(r3)
            boolean r9 = r15.A0e(r10, r5, r3)
            if (r9 != 0) goto L_0x0174
            boolean r9 = A0c(r7)
            if (r9 != 0) goto L_0x0169
            r8.putObject(r10, r0, r7)
        L_0x0160:
            long r0 = X.BE9.A0O(r4, r3)
            com.google.protobuf.UnsafeUtil.A04(r10, r0, r5)
            goto L_0x0020
        L_0x0169:
            X.Bm6 r9 = r6.BkG()
            r6.Bjk(r9, r7)
            r8.putObject(r10, r0, r9)
            goto L_0x0160
        L_0x0174:
            java.lang.Object r5 = r8.getObject(r10, r0)
            boolean r4 = A0c(r5)
            if (r4 != 0) goto L_0x0189
            X.Bm6 r4 = r6.BkG()
            r6.Bjk(r4, r5)
            r8.putObject(r10, r0, r4)
            r5 = r4
        L_0x0189:
            r6.Bjk(r5, r7)
            goto L_0x0020
        L_0x018e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Source subfield "
            r1.append(r0)
            r0 = r4[r3]
            r1.append(r0)
            java.lang.String r0 = " is present but null: "
            java.lang.IllegalStateException r0 = X.BEA.A0c(r2, r0, r1)
            throw r0
        L_0x01a3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Source subfield "
            r1.append(r0)
            r0 = r4[r3]
            r1.append(r0)
            java.lang.String r0 = " is present but null: "
            java.lang.IllegalStateException r0 = X.BEA.A0c(r2, r0, r1)
            throw r0
        L_0x01b8:
            X.C26298CxB.A0R(r10, r2)
            return
        L_0x01bc:
            java.lang.NullPointerException r0 = X.BE6.A0m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.Bjk(java.lang.Object, java.lang.Object):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void Bjl(X.C26282Cwd r23, X.C26105CsP r24, java.lang.Object r25) {
        /*
            r22 = this;
            r6 = r24
            r14 = r25
            if (r24 == 0) goto L_0x0694
            A0Z(r14)
            r12 = r22
            X.CXo r13 = r12.A0C
            r15 = 0
        L_0x000e:
            r0 = r23
            int r4 = r0.A0A()     // Catch:{ all -> 0x0677 }
            int r3 = r12.A00(r4)     // Catch:{ all -> 0x0677 }
            if (r3 >= 0) goto L_0x0040
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r1) goto L_0x0032
            int r1 = r12.A00
        L_0x0021:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x066e
            int[] r0 = r12.A06
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Q(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x0021
        L_0x0032:
            if (r15 != 0) goto L_0x0038
            X.Cr6 r15 = r13.A00(r14)     // Catch:{ all -> 0x0677 }
        L_0x0038:
            boolean r0 = r13.A01(r0, r15)     // Catch:{ all -> 0x0677 }
            if (r0 != 0) goto L_0x000e
            goto L_0x0635
        L_0x0040:
            int[] r5 = r12.A05     // Catch:{ all -> 0x0677 }
            int r9 = r3 + 1
            r7 = r5[r9]     // Catch:{ all -> 0x0677 }
            int r1 = X.BE7.A04(r7)
            switch(r1) {
                case 0: goto L_0x0404;
                case 1: goto L_0x0417;
                case 2: goto L_0x0428;
                case 3: goto L_0x043b;
                case 4: goto L_0x044e;
                case 5: goto L_0x045d;
                case 6: goto L_0x0470;
                case 7: goto L_0x047f;
                case 8: goto L_0x0122;
                case 9: goto L_0x0127;
                case 10: goto L_0x0490;
                case 11: goto L_0x04a1;
                case 12: goto L_0x0531;
                case 13: goto L_0x04b0;
                case 14: goto L_0x04bf;
                case 15: goto L_0x04d2;
                case 16: goto L_0x04e1;
                case 17: goto L_0x0139;
                case 18: goto L_0x014f;
                case 19: goto L_0x0158;
                case 20: goto L_0x0161;
                case 21: goto L_0x016a;
                case 22: goto L_0x0173;
                case 23: goto L_0x017c;
                case 24: goto L_0x0185;
                case 25: goto L_0x018e;
                case 26: goto L_0x0569;
                case 27: goto L_0x0197;
                case 28: goto L_0x01d4;
                case 29: goto L_0x0201;
                case 30: goto L_0x020a;
                case 31: goto L_0x0225;
                case 32: goto L_0x022e;
                case 33: goto L_0x0237;
                case 34: goto L_0x0240;
                case 35: goto L_0x0249;
                case 36: goto L_0x0252;
                case 37: goto L_0x025b;
                case 38: goto L_0x0264;
                case 39: goto L_0x026d;
                case 40: goto L_0x0276;
                case 41: goto L_0x027f;
                case 42: goto L_0x0288;
                case 43: goto L_0x0291;
                case 44: goto L_0x029a;
                case 45: goto L_0x02b5;
                case 46: goto L_0x02be;
                case 47: goto L_0x02c7;
                case 48: goto L_0x02d0;
                case 49: goto L_0x04f3;
                case 50: goto L_0x005b;
                case 51: goto L_0x02fc;
                case 52: goto L_0x030f;
                case 53: goto L_0x0322;
                case 54: goto L_0x0335;
                case 55: goto L_0x0348;
                case 56: goto L_0x035b;
                case 57: goto L_0x036e;
                case 58: goto L_0x0381;
                case 59: goto L_0x02d9;
                case 60: goto L_0x02de;
                case 61: goto L_0x0394;
                case 62: goto L_0x03a5;
                case 63: goto L_0x05e7;
                case 64: goto L_0x03b8;
                case 65: goto L_0x03cb;
                case 66: goto L_0x03de;
                case 67: goto L_0x03f1;
                case 68: goto L_0x010f;
                default: goto L_0x004d;
            }
        L_0x004d:
            if (r15 != 0) goto L_0x0053
            X.Cr6 r15 = r13.A00(r14)     // Catch:{ BnS -> 0x0628 }
        L_0x0053:
            boolean r0 = r13.A01(r0, r15)     // Catch:{ BnS -> 0x0628 }
            if (r0 != 0) goto L_0x000e
            goto L_0x0648
        L_0x005b:
            java.lang.Object[] r2 = r12.A07     // Catch:{ BnS -> 0x0628 }
            int r1 = r3 / 3
            int r1 = r1 * 2
            r4 = r2[r1]     // Catch:{ BnS -> 0x0628 }
            long r1 = X.BE6.A0M(r7)     // Catch:{ BnS -> 0x0628 }
            java.lang.Object r8 = X.C25856CnK.A00(r14, r1)     // Catch:{ BnS -> 0x0628 }
            if (r8 != 0) goto L_0x0091
            X.Dbz r3 = X.C27328Dbz.A00     // Catch:{ BnS -> 0x0628 }
            X.Dbz r8 = r3.A01()     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r8)     // Catch:{ BnS -> 0x0628 }
        L_0x0076:
            X.Dbz r8 = (X.C27328Dbz) r8     // Catch:{ BnS -> 0x0628 }
            X.CQE r4 = (X.CQE) r4     // Catch:{ BnS -> 0x0628 }
            X.CRc r10 = r4.A00     // Catch:{ BnS -> 0x0628 }
            r9 = 2
            X.C26282Cwd.A07(r0, r9)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            int r1 = r7.A0H()     // Catch:{ BnS -> 0x0628 }
            int r5 = r7.A0I(r1)     // Catch:{ BnS -> 0x0628 }
            java.lang.Object r4 = r10.A02     // Catch:{ BnS -> 0x0628 }
            java.lang.Object r3 = r10.A03     // Catch:{ BnS -> 0x0628 }
            r16 = r3
            goto L_0x00a8
        L_0x0091:
            r3 = r8
            X.Dbz r3 = (X.C27328Dbz) r3     // Catch:{ BnS -> 0x0628 }
            boolean r3 = r3.isMutable     // Catch:{ BnS -> 0x0628 }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x0076
            X.Dbz r3 = X.C27328Dbz.A00     // Catch:{ BnS -> 0x0628 }
            X.Dbz r3 = r3.A01()     // Catch:{ BnS -> 0x0628 }
            X.C25879Cnq.A01(r3, r8)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r3)     // Catch:{ BnS -> 0x0628 }
            r8 = r3
            goto L_0x0076
        L_0x00a8:
            int r2 = r0.A0A()     // Catch:{ all -> 0x0109 }
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r1) goto L_0x0101
            boolean r1 = r7.A0T()     // Catch:{ all -> 0x0109 }
            if (r1 != 0) goto L_0x0101
            r1 = 1
            java.lang.String r11 = "Unable to parse map entry."
            if (r2 == r1) goto L_0x00e1
            if (r2 == r9) goto L_0x00d6
            boolean r1 = r7.A0T()     // Catch:{ BnS -> 0x00e9 }
            if (r1 != 0) goto L_0x00d1
            int r2 = r0.A02     // Catch:{ BnS -> 0x00e9 }
            int r1 = r0.A00     // Catch:{ BnS -> 0x00e9 }
            if (r2 == r1) goto L_0x00d1
            boolean r1 = r7.A0V(r2)     // Catch:{ BnS -> 0x00e9 }
            if (r1 == 0) goto L_0x00d1
            goto L_0x00a8
        L_0x00d1:
            X.1PN r1 = X.BE6.A0c(r11)     // Catch:{ BnS -> 0x00e9 }
            throw r1     // Catch:{ BnS -> 0x00e9 }
        L_0x00d6:
            X.Bzx r2 = r10.A01     // Catch:{ BnS -> 0x00e9 }
            java.lang.Class r1 = r16.getClass()     // Catch:{ BnS -> 0x00e9 }
            java.lang.Object r3 = X.C26282Cwd.A04(r0, r6, r2, r1)     // Catch:{ BnS -> 0x00e9 }
            goto L_0x00a8
        L_0x00e1:
            X.Bzx r2 = r10.A00     // Catch:{ BnS -> 0x00e9 }
            r1 = 0
            java.lang.Object r4 = X.C26282Cwd.A04(r0, r1, r2, r1)     // Catch:{ BnS -> 0x00e9 }
            goto L_0x00a8
        L_0x00e9:
            boolean r1 = r7.A0T()     // Catch:{ all -> 0x0109 }
            if (r1 != 0) goto L_0x00fc
            int r2 = r0.A02     // Catch:{ all -> 0x0109 }
            int r1 = r0.A00     // Catch:{ all -> 0x0109 }
            if (r2 == r1) goto L_0x00fc
            boolean r1 = r7.A0V(r2)     // Catch:{ all -> 0x0109 }
            if (r1 == 0) goto L_0x00fc
            goto L_0x00a8
        L_0x00fc:
            X.1PN r1 = X.BE6.A0c(r11)     // Catch:{ all -> 0x0109 }
            throw r1     // Catch:{ all -> 0x0109 }
        L_0x0101:
            r8.put(r4, r3)     // Catch:{ all -> 0x0109 }
            r7.A0S(r5)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0109:
            r1 = move-exception
            r7.A0S(r5)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0582
        L_0x010f:
            java.lang.Object r8 = r12.A0S(r14, r4, r3)     // Catch:{ BnS -> 0x0628 }
            X.EDk r8 = (X.C28668EDk) r8     // Catch:{ BnS -> 0x0628 }
            X.EAO r2 = r12.A0N(r3)     // Catch:{ BnS -> 0x0628 }
            r1 = 3
            X.C26282Cwd.A07(r0, r1)     // Catch:{ BnS -> 0x0628 }
            X.C26282Cwd.A08(r0, r6, r2, r8)     // Catch:{ BnS -> 0x0628 }
            goto L_0x02ef
        L_0x0122:
            r12.A0X(r0, r14, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x0127:
            java.lang.Object r4 = r12.A0R(r14, r3)     // Catch:{ BnS -> 0x0628 }
            X.EDk r4 = (X.C28668EDk) r4     // Catch:{ BnS -> 0x0628 }
            X.EAO r2 = r12.A0N(r3)     // Catch:{ BnS -> 0x0628 }
            r1 = 2
            X.C26282Cwd.A07(r0, r1)     // Catch:{ BnS -> 0x0628 }
            X.C26282Cwd.A09(r0, r6, r2, r4)     // Catch:{ BnS -> 0x0628 }
            goto L_0x014a
        L_0x0139:
            java.lang.Object r4 = r12.A0R(r14, r3)     // Catch:{ BnS -> 0x0628 }
            X.EDk r4 = (X.C28668EDk) r4     // Catch:{ BnS -> 0x0628 }
            X.EAO r2 = r12.A0N(r3)     // Catch:{ BnS -> 0x0628 }
            r1 = 3
            X.C26282Cwd.A07(r0, r1)     // Catch:{ BnS -> 0x0628 }
            X.C26282Cwd.A08(r0, r6, r2, r4)     // Catch:{ BnS -> 0x0628 }
        L_0x014a:
            r12.A0b(r14, r3, r4)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x014f:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0C(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0158:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0G(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0161:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0I(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x016a:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0O(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0173:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0H(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x017c:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0F(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0185:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0E(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x018e:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0B(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0197:
            X.EAO r4 = r12.A0N(r3)     // Catch:{ BnS -> 0x0628 }
            long r1 = X.BE6.A0M(r7)     // Catch:{ BnS -> 0x0628 }
            X.CUq r3 = r12.A04     // Catch:{ BnS -> 0x0628 }
            java.util.List r5 = r3.A01(r14, r1)     // Catch:{ BnS -> 0x0628 }
            int r3 = r0.A02     // Catch:{ BnS -> 0x0628 }
            r2 = r3 & 7
            r1 = 2
            if (r2 == r1) goto L_0x01b3
            X.BnS r1 = new X.BnS     // Catch:{ BnS -> 0x0628 }
            r1.<init>()     // Catch:{ BnS -> 0x0628 }
            goto L_0x0582
        L_0x01b3:
            X.Bm6 r1 = r4.BkG()     // Catch:{ BnS -> 0x0628 }
            X.C26282Cwd.A09(r0, r6, r4, r1)     // Catch:{ BnS -> 0x0628 }
            r4.Bih(r1)     // Catch:{ BnS -> 0x0628 }
            r5.add(r1)     // Catch:{ BnS -> 0x0628 }
            X.CnL r2 = r0.A03     // Catch:{ BnS -> 0x0628 }
            boolean r1 = r2.A0T()     // Catch:{ BnS -> 0x0628 }
            if (r1 != 0) goto L_0x000e
            int r1 = r0.A01     // Catch:{ BnS -> 0x0628 }
            if (r1 != 0) goto L_0x000e
            int r1 = r2.A0G()     // Catch:{ BnS -> 0x0628 }
            if (r1 == r3) goto L_0x01b3
            goto L_0x052d
        L_0x01d4:
            java.util.List r3 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            int r1 = r0.A02     // Catch:{ BnS -> 0x0628 }
            r2 = r1 & 7
            r1 = 2
            if (r2 == r1) goto L_0x01e6
            X.BnS r1 = new X.BnS     // Catch:{ BnS -> 0x0628 }
            r1.<init>()     // Catch:{ BnS -> 0x0628 }
            goto L_0x0582
        L_0x01e6:
            X.CnL r2 = X.C26282Cwd.A03(r0)     // Catch:{ BnS -> 0x0628 }
            X.DSQ r1 = r2.A0O()     // Catch:{ BnS -> 0x0628 }
            r3.add(r1)     // Catch:{ BnS -> 0x0628 }
            boolean r1 = r2.A0T()     // Catch:{ BnS -> 0x0628 }
            if (r1 != 0) goto L_0x000e
            int r2 = r2.A0G()     // Catch:{ BnS -> 0x0628 }
            int r1 = r0.A02     // Catch:{ BnS -> 0x0628 }
            if (r2 == r1) goto L_0x01e6
            goto L_0x05e3
        L_0x0201:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0N(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x020a:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0D(r1)     // Catch:{ BnS -> 0x0628 }
            X.E69 r16 = A0L(r12, r3)     // Catch:{ BnS -> 0x0628 }
            r17 = r13
            r18 = r14
            r19 = r15
            r20 = r1
            r21 = r4
            java.lang.Object r15 = X.C26298CxB.A0A(r16, r17, r18, r19, r20, r21)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0225:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0J(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x022e:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0K(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0237:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0L(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0240:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0M(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0249:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0C(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0252:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0G(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x025b:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0I(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0264:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0O(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x026d:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0H(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0276:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0F(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x027f:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0E(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0288:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0B(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0291:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0N(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x029a:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0D(r1)     // Catch:{ BnS -> 0x0628 }
            X.E69 r16 = A0L(r12, r3)     // Catch:{ BnS -> 0x0628 }
            r17 = r13
            r18 = r14
            r19 = r15
            r20 = r1
            r21 = r4
            java.lang.Object r15 = X.C26298CxB.A0A(r16, r17, r18, r19, r20, r21)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x02b5:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0J(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x02be:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0K(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x02c7:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0L(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x02d0:
            java.util.List r1 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            r0.A0M(r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x02d9:
            r12.A0X(r0, r14, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x02de:
            java.lang.Object r8 = r12.A0S(r14, r4, r3)     // Catch:{ BnS -> 0x0628 }
            X.EDk r8 = (X.C28668EDk) r8     // Catch:{ BnS -> 0x0628 }
            X.EAO r2 = r12.A0N(r3)     // Catch:{ BnS -> 0x0628 }
            r1 = 2
            X.C26282Cwd.A07(r0, r1)     // Catch:{ BnS -> 0x0628 }
            X.C26282Cwd.A09(r0, r6, r2, r8)     // Catch:{ BnS -> 0x0628 }
        L_0x02ef:
            sun.misc.Unsafe r7 = A0F     // Catch:{ BnS -> 0x0628 }
            r1 = r5[r9]     // Catch:{ BnS -> 0x0628 }
            long r1 = X.BE6.A0M(r1)     // Catch:{ BnS -> 0x0628 }
            r7.putObject(r14, r1, r8)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x02fc:
            long r1 = A0J(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            double r7 = r7.A08()     // Catch:{ BnS -> 0x0628 }
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x030f:
            long r1 = A0K(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            float r7 = r7.A09()     // Catch:{ BnS -> 0x0628 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x0322:
            long r1 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            long r7 = r7.A0K()     // Catch:{ BnS -> 0x0628 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x0335:
            long r1 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            long r7 = r7.A0N()     // Catch:{ BnS -> 0x0628 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x0348:
            long r1 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            int r7 = r7.A0D()     // Catch:{ BnS -> 0x0628 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x035b:
            long r1 = A0J(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            long r7 = r7.A0J()     // Catch:{ BnS -> 0x0628 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x036e:
            long r1 = A0K(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            int r7 = r7.A0C()     // Catch:{ BnS -> 0x0628 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x0381:
            long r1 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            boolean r7 = r7.A0U()     // Catch:{ BnS -> 0x0628 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x0394:
            long r1 = X.BE6.A0M(r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = X.C26282Cwd.A03(r0)     // Catch:{ BnS -> 0x0628 }
            X.DSQ r7 = r7.A0O()     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x03a5:
            long r1 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            int r7 = r7.A0H()     // Catch:{ BnS -> 0x0628 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x03b8:
            long r1 = A0K(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            int r7 = r7.A0E()     // Catch:{ BnS -> 0x0628 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x03cb:
            long r1 = A0J(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            long r7 = r7.A0L()     // Catch:{ BnS -> 0x0628 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x03de:
            long r1 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            int r7 = r7.A0F()     // Catch:{ BnS -> 0x0628 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x03f1:
            long r1 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r7 = r0.A03     // Catch:{ BnS -> 0x0628 }
            long r7 = r7.A0M()     // Catch:{ BnS -> 0x0628 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
            goto L_0x061f
        L_0x0404:
            long r18 = A0J(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r1 = r0.A03     // Catch:{ BnS -> 0x0628 }
            double r20 = r1.A08()     // Catch:{ BnS -> 0x0628 }
            X.CnK r16 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ BnS -> 0x0628 }
            r17 = r14
            r16.A0C(r17, r18, r20)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x0417:
            long r1 = A0K(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r4 = r0.A03     // Catch:{ BnS -> 0x0628 }
            float r5 = r4.A09()     // Catch:{ BnS -> 0x0628 }
            X.CnK r4 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ BnS -> 0x0628 }
            r4.A0D(r14, r1, r5)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x0428:
            long r18 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r1 = r0.A03     // Catch:{ BnS -> 0x0628 }
            long r20 = r1.A0K()     // Catch:{ BnS -> 0x0628 }
            X.CnK r16 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ BnS -> 0x0628 }
            r17 = r14
            r16.A0F(r17, r18, r20)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x043b:
            long r18 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r1 = r0.A03     // Catch:{ BnS -> 0x0628 }
            long r20 = r1.A0N()     // Catch:{ BnS -> 0x0628 }
            X.CnK r16 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ BnS -> 0x0628 }
            r17 = r14
            r16.A0F(r17, r18, r20)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x044e:
            long r1 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r4 = r0.A03     // Catch:{ BnS -> 0x0628 }
            int r4 = r4.A0D()     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r4)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x045d:
            long r18 = A0J(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r1 = r0.A03     // Catch:{ BnS -> 0x0628 }
            long r20 = r1.A0J()     // Catch:{ BnS -> 0x0628 }
            X.CnK r16 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ BnS -> 0x0628 }
            r17 = r14
            r16.A0F(r17, r18, r20)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x0470:
            long r1 = A0K(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r4 = r0.A03     // Catch:{ BnS -> 0x0628 }
            int r4 = r4.A0C()     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r4)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x047f:
            long r1 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r4 = r0.A03     // Catch:{ BnS -> 0x0628 }
            boolean r5 = r4.A0U()     // Catch:{ BnS -> 0x0628 }
            X.CnK r4 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ BnS -> 0x0628 }
            r4.A0H(r14, r1, r5)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x0490:
            long r1 = X.BE6.A0M(r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r4 = X.C26282Cwd.A03(r0)     // Catch:{ BnS -> 0x0628 }
            X.DSQ r4 = r4.A0O()     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r4)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x04a1:
            long r1 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r4 = r0.A03     // Catch:{ BnS -> 0x0628 }
            int r4 = r4.A0H()     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r4)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x04b0:
            long r1 = A0K(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r4 = r0.A03     // Catch:{ BnS -> 0x0628 }
            int r4 = r4.A0E()     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r4)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x04bf:
            long r18 = A0J(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r1 = r0.A03     // Catch:{ BnS -> 0x0628 }
            long r20 = r1.A0L()     // Catch:{ BnS -> 0x0628 }
            X.CnK r16 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ BnS -> 0x0628 }
            r17 = r14
            r16.A0F(r17, r18, r20)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x04d2:
            long r1 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r4 = r0.A03     // Catch:{ BnS -> 0x0628 }
            int r4 = r4.A0F()     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r4)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x04e1:
            long r18 = A0I(r0, r7)     // Catch:{ BnS -> 0x0628 }
            X.CnL r1 = r0.A03     // Catch:{ BnS -> 0x0628 }
            long r20 = r1.A0M()     // Catch:{ BnS -> 0x0628 }
            X.CnK r16 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ BnS -> 0x0628 }
            r17 = r14
            r16.A0F(r17, r18, r20)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0564
        L_0x04f3:
            long r1 = X.BE6.A0M(r7)     // Catch:{ BnS -> 0x0628 }
            X.EAO r3 = r12.A0N(r3)     // Catch:{ BnS -> 0x0628 }
            X.CUq r4 = r12.A04     // Catch:{ BnS -> 0x0628 }
            java.util.List r5 = r4.A01(r14, r1)     // Catch:{ BnS -> 0x0628 }
            int r4 = r0.A02     // Catch:{ BnS -> 0x0628 }
            r2 = r4 & 7
            r1 = 3
            if (r2 == r1) goto L_0x050e
            X.BnS r1 = new X.BnS     // Catch:{ BnS -> 0x0628 }
            r1.<init>()     // Catch:{ BnS -> 0x0628 }
            goto L_0x0582
        L_0x050e:
            X.Bm6 r1 = r3.BkG()     // Catch:{ BnS -> 0x0628 }
            X.C26282Cwd.A08(r0, r6, r3, r1)     // Catch:{ BnS -> 0x0628 }
            r3.Bih(r1)     // Catch:{ BnS -> 0x0628 }
            r5.add(r1)     // Catch:{ BnS -> 0x0628 }
            X.CnL r2 = r0.A03     // Catch:{ BnS -> 0x0628 }
            boolean r1 = r2.A0T()     // Catch:{ BnS -> 0x0628 }
            if (r1 != 0) goto L_0x000e
            int r1 = r0.A01     // Catch:{ BnS -> 0x0628 }
            if (r1 != 0) goto L_0x000e
            int r1 = r2.A0G()     // Catch:{ BnS -> 0x0628 }
            if (r1 == r4) goto L_0x050e
        L_0x052d:
            r0.A01 = r1     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0531:
            X.CnL r1 = X.C26282Cwd.A02(r0)     // Catch:{ BnS -> 0x0628 }
            int r5 = r1.A0B()     // Catch:{ BnS -> 0x0628 }
            X.E69 r1 = A0L(r12, r3)     // Catch:{ BnS -> 0x0628 }
            if (r1 == 0) goto L_0x055d
            boolean r1 = r1.Bf4(r5)     // Catch:{ BnS -> 0x0628 }
            if (r1 != 0) goto L_0x055d
            r7 = r15
            X.CXo r1 = X.C26298CxB.A02     // Catch:{ BnS -> 0x0628 }
            if (r15 != 0) goto L_0x054e
            X.Cr6 r7 = r13.A00(r14)     // Catch:{ BnS -> 0x0628 }
        L_0x054e:
            long r1 = (long) r5     // Catch:{ BnS -> 0x0628 }
            r5 = r7
            X.Cr6 r5 = (X.C26042Cr6) r5     // Catch:{ BnS -> 0x0628 }
            int r3 = r4 << 3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ BnS -> 0x0628 }
            r5.A02(r3, r1)     // Catch:{ BnS -> 0x0628 }
            goto L_0x0611
        L_0x055d:
            long r1 = X.BE6.A0M(r7)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r5)     // Catch:{ BnS -> 0x0628 }
        L_0x0564:
            r12.A0a(r14, r3)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0569:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r7
            boolean r1 = X.AnonymousClass000.A1O(r1)
            java.util.List r3 = A0V(r12, r14, r7)     // Catch:{ BnS -> 0x0628 }
            if (r1 == 0) goto L_0x0583
            int r1 = r0.A02     // Catch:{ BnS -> 0x0628 }
            r2 = r1 & 7
            r1 = 2
            if (r2 == r1) goto L_0x05ca
            X.BnS r1 = new X.BnS     // Catch:{ BnS -> 0x0628 }
            r1.<init>()     // Catch:{ BnS -> 0x0628 }
        L_0x0582:
            throw r1     // Catch:{ BnS -> 0x0628 }
        L_0x0583:
            int r1 = r0.A02     // Catch:{ BnS -> 0x0628 }
            r2 = r1 & 7
            r1 = 2
            if (r2 != r1) goto L_0x05aa
            boolean r1 = r3 instanceof X.EE5     // Catch:{ BnS -> 0x0628 }
            if (r1 == 0) goto L_0x05b0
            X.EE5 r3 = (X.EE5) r3     // Catch:{ BnS -> 0x0628 }
        L_0x0590:
            X.CnL r2 = X.C26282Cwd.A03(r0)     // Catch:{ BnS -> 0x0628 }
            X.DSQ r1 = r2.A0O()     // Catch:{ BnS -> 0x0628 }
            r3.BAo(r1)     // Catch:{ BnS -> 0x0628 }
            boolean r1 = r2.A0T()     // Catch:{ BnS -> 0x0628 }
            if (r1 != 0) goto L_0x000e
            int r2 = r2.A0G()     // Catch:{ BnS -> 0x0628 }
            int r1 = r0.A02     // Catch:{ BnS -> 0x0628 }
            if (r2 == r1) goto L_0x0590
            goto L_0x05e3
        L_0x05aa:
            X.BnS r1 = new X.BnS     // Catch:{ BnS -> 0x0628 }
            r1.<init>()     // Catch:{ BnS -> 0x0628 }
            goto L_0x0582
        L_0x05b0:
            X.CnL r2 = X.C26282Cwd.A03(r0)     // Catch:{ BnS -> 0x0628 }
            java.lang.String r1 = r2.A0P()     // Catch:{ BnS -> 0x0628 }
            r3.add(r1)     // Catch:{ BnS -> 0x0628 }
            boolean r1 = r2.A0T()     // Catch:{ BnS -> 0x0628 }
            if (r1 != 0) goto L_0x000e
            int r2 = r2.A0G()     // Catch:{ BnS -> 0x0628 }
            int r1 = r0.A02     // Catch:{ BnS -> 0x0628 }
            if (r2 == r1) goto L_0x05b0
            goto L_0x05e3
        L_0x05ca:
            X.CnL r2 = X.C26282Cwd.A03(r0)     // Catch:{ BnS -> 0x0628 }
            java.lang.String r1 = r2.A0Q()     // Catch:{ BnS -> 0x0628 }
            r3.add(r1)     // Catch:{ BnS -> 0x0628 }
            boolean r1 = r2.A0T()     // Catch:{ BnS -> 0x0628 }
            if (r1 != 0) goto L_0x000e
            int r2 = r2.A0G()     // Catch:{ BnS -> 0x0628 }
            int r1 = r0.A02     // Catch:{ BnS -> 0x0628 }
            if (r2 == r1) goto L_0x05ca
        L_0x05e3:
            r0.A01 = r2     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x05e7:
            X.CnL r1 = X.C26282Cwd.A02(r0)     // Catch:{ BnS -> 0x0628 }
            int r8 = r1.A0B()     // Catch:{ BnS -> 0x0628 }
            X.E69 r1 = A0L(r12, r3)     // Catch:{ BnS -> 0x0628 }
            if (r1 == 0) goto L_0x0614
            boolean r1 = r1.Bf4(r8)     // Catch:{ BnS -> 0x0628 }
            if (r1 != 0) goto L_0x0614
            r7 = r15
            X.CXo r1 = X.C26298CxB.A02     // Catch:{ BnS -> 0x0628 }
            if (r15 != 0) goto L_0x0604
            X.Cr6 r7 = r13.A00(r14)     // Catch:{ BnS -> 0x0628 }
        L_0x0604:
            long r1 = (long) r8     // Catch:{ BnS -> 0x0628 }
            r5 = r7
            X.Cr6 r5 = (X.C26042Cr6) r5     // Catch:{ BnS -> 0x0628 }
            int r3 = r4 << 3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ BnS -> 0x0628 }
            r5.A02(r3, r1)     // Catch:{ BnS -> 0x0628 }
        L_0x0611:
            r15 = r7
            goto L_0x000e
        L_0x0614:
            long r1 = X.BE6.A0M(r7)     // Catch:{ BnS -> 0x0628 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ BnS -> 0x0628 }
        L_0x061f:
            long r1 = X.BE9.A0O(r5, r3)     // Catch:{ BnS -> 0x0628 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r4)     // Catch:{ BnS -> 0x0628 }
            goto L_0x000e
        L_0x0628:
            if (r15 != 0) goto L_0x062e
            X.Cr6 r15 = r13.A00(r14)     // Catch:{ all -> 0x0677 }
        L_0x062e:
            boolean r0 = r13.A01(r0, r15)     // Catch:{ all -> 0x0677 }
            if (r0 != 0) goto L_0x000e
            goto L_0x065b
        L_0x0635:
            int r1 = r12.A00
        L_0x0637:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x066e
            int[] r0 = r12.A06
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Q(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x0637
        L_0x0648:
            int r1 = r12.A00
        L_0x064a:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x066e
            int[] r0 = r12.A06
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Q(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x064a
        L_0x065b:
            int r1 = r12.A00
        L_0x065d:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x066e
            int[] r0 = r12.A06
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Q(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x065d
        L_0x066e:
            if (r15 == 0) goto L_0x0676
            X.Cr6 r15 = (X.C26042Cr6) r15
            X.Bm6 r14 = (X.C23577Bm6) r14
            r14.unknownFields = r15
        L_0x0676:
            return
        L_0x0677:
            r2 = move-exception
            int r1 = r12.A00
        L_0x067a:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x068b
            int[] r0 = r12.A06
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Q(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x067a
        L_0x068b:
            if (r15 == 0) goto L_0x0693
            X.Cr6 r15 = (X.C26042Cr6) r15
            X.Bm6 r14 = (X.C23577Bm6) r14
            r14.unknownFields = r15
        L_0x0693:
            throw r2
        L_0x0694:
            java.lang.NullPointerException r0 = X.BE6.A0m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.Bjl(X.Cwd, X.CsP, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0110, code lost:
        r14.putObject(r10, r2, r5.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0161, code lost:
        r14.putInt(r10, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016d, code lost:
        r14.putLong(r10, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0189, code lost:
        r13 = r6 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a1, code lost:
        r13 = r6 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a3, code lost:
        r21 = r21 | r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bjm(X.C25573CiD r39, java.lang.Object r40, byte[] r41, int r42, int r43) {
        /*
            r38 = this;
            r13 = r42
            r12 = r38
            boolean r0 = r12.A0E
            r5 = r39
            r10 = r40
            r4 = r41
            r37 = r43
            if (r0 == 0) goto L_0x027f
            A0Z(r10)
            sun.misc.Unsafe r14 = A0F
            r1 = -1
            r2 = -1
            r7 = 0
            r21 = 0
            r20 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            r0 = r37
            if (r13 >= r0) goto L_0x0267
            int r6 = r13 + 1
            byte r11 = r41[r13]
            if (r11 >= 0) goto L_0x002d
            int r6 = A0F(r5, r4, r11, r6)
            int r11 = r5.A00
        L_0x002d:
            int r19 = r11 >>> 3
            r9 = r11 & 7
            r0 = r19
            if (r0 <= r2) goto L_0x005c
            int r3 = r7 / 3
            int r2 = r12.A02
            if (r0 < r2) goto L_0x025f
            int r2 = r12.A01
            if (r0 > r2) goto L_0x025f
            int[] r13 = r12.A05
            int r0 = r13.length
            int r0 = r0 / 3
            int r8 = r0 + -1
        L_0x0046:
            if (r3 > r8) goto L_0x025f
            int r0 = r8 + r3
            int r15 = r0 >>> 1
            int r7 = r15 * 3
            r2 = r13[r7]
            r0 = r19
            if (r0 == r2) goto L_0x0060
            if (r0 >= r2) goto L_0x0059
            int r8 = r15 + -1
            goto L_0x0046
        L_0x0059:
            int r3 = r15 + 1
            goto L_0x0046
        L_0x005c:
            int r7 = r12.A00(r0)
        L_0x0060:
            if (r7 == r1) goto L_0x025f
            int[] r1 = r12.A05
            int r0 = r7 + 1
            r18 = r1[r0]
            int r13 = X.BE7.A04(r18)
            long r2 = X.BE6.A0M(r18)
            r0 = 17
            if (r13 > r0) goto L_0x01a7
            int r0 = r7 + 2
            r8 = r1[r0]
            int r0 = r8 >>> 20
            r16 = 1
            int r17 = r16 << r0
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r1
            r0 = r20
            if (r8 == r0) goto L_0x009a
            if (r0 == r1) goto L_0x0091
            long r0 = (long) r0
            r15 = r21
            r14.putInt(r10, r0, r15)
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0091:
            if (r8 == r1) goto L_0x0098
            long r0 = (long) r8
            int r21 = r14.getInt(r10, r0)
        L_0x0098:
            r20 = r8
        L_0x009a:
            switch(r13) {
                case 0: goto L_0x018c;
                case 1: goto L_0x0179;
                case 2: goto L_0x0165;
                case 3: goto L_0x0165;
                case 4: goto L_0x0159;
                case 5: goto L_0x0147;
                case 6: goto L_0x013c;
                case 7: goto L_0x0126;
                case 8: goto L_0x00f9;
                case 9: goto L_0x00db;
                case 10: goto L_0x00d3;
                case 11: goto L_0x0159;
                case 12: goto L_0x0159;
                case 13: goto L_0x013c;
                case 14: goto L_0x0147;
                case 15: goto L_0x00c5;
                case 16: goto L_0x00b4;
                default: goto L_0x009d;
            }
        L_0x009d:
            X.Cr6 r23 = A0O(r10)
            r22 = r5
            r24 = r4
            r25 = r11
            r26 = r6
            r27 = r37
            int r13 = A06(r22, r23, r24, r25, r26, r27)
        L_0x00af:
            r2 = r19
            r1 = -1
            goto L_0x001d
        L_0x00b4:
            if (r9 != 0) goto L_0x009d
            int r13 = A0E(r5, r4, r6)
            long r8 = r5.A01
            long r15 = r8 >>> r16
            r0 = 1
            long r8 = r8 & r0
            long r0 = -r8
            long r0 = r0 ^ r15
            goto L_0x016d
        L_0x00c5:
            if (r9 != 0) goto L_0x009d
            int r13 = A0D(r5, r4, r6)
            int r0 = r5.A00
            int r0 = X.BE7.A05(r0)
            goto L_0x0161
        L_0x00d3:
            r0 = 2
            if (r9 != r0) goto L_0x009d
            int r13 = A0B(r5, r4, r6)
            goto L_0x0110
        L_0x00db:
            r0 = 2
            if (r9 != r0) goto L_0x009d
            java.lang.Object r0 = r12.A0R(r10, r7)
            X.EAO r23 = r12.A0N(r7)
            r22 = r5
            r24 = r0
            r25 = r4
            r26 = r6
            r27 = r37
            int r13 = A03(r22, r23, r24, r25, r26, r27)
            r12.A0b(r10, r7, r0)
            goto L_0x01a3
        L_0x00f9:
            r0 = 2
            if (r9 != r0) goto L_0x009d
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r18
            if (r0 != 0) goto L_0x0121
            int r13 = A0D(r5, r4, r6)
            int r1 = r5.A00
            if (r1 < 0) goto L_0x0262
            if (r1 != 0) goto L_0x0117
            java.lang.String r0 = ""
            r5.A02 = r0
        L_0x0110:
            java.lang.Object r0 = r5.A02
            r14.putObject(r10, r2, r0)
            goto L_0x01a3
        L_0x0117:
            java.nio.charset.Charset r0 = X.CIC.A04
            java.lang.String r0 = X.BE6.A0r(r0, r4, r13, r1)
            r5.A02 = r0
            int r13 = r13 + r1
            goto L_0x0110
        L_0x0121:
            int r13 = A0C(r5, r4, r6)
            goto L_0x0110
        L_0x0126:
            r8 = 1
            if (r9 != 0) goto L_0x009d
            int r13 = A0E(r5, r4, r6)
            long r0 = r5.A01
            r15 = 0
            int r6 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r6 != 0) goto L_0x0136
            r8 = 0
        L_0x0136:
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            r0.A0H(r10, r2, r8)
            goto L_0x01a3
        L_0x013c:
            r0 = 5
            if (r9 != r0) goto L_0x009d
            int r0 = X.BEB.A08(r4, r6)
            r14.putInt(r10, r2, r0)
            goto L_0x0189
        L_0x0147:
            r0 = r16
            if (r9 != r0) goto L_0x009d
            long r26 = X.BEB.A0G(r4, r6)
            r22 = r14
            r23 = r10
            r24 = r2
            r22.putLong(r23, r24, r26)
            goto L_0x01a1
        L_0x0159:
            if (r9 != 0) goto L_0x009d
            int r13 = A0D(r5, r4, r6)
            int r0 = r5.A00
        L_0x0161:
            r14.putInt(r10, r2, r0)
            goto L_0x01a3
        L_0x0165:
            if (r9 != 0) goto L_0x009d
            int r13 = A0E(r5, r4, r6)
            long r0 = r5.A01
        L_0x016d:
            r22 = r14
            r23 = r10
            r24 = r2
            r26 = r0
            r22.putLong(r23, r24, r26)
            goto L_0x01a3
        L_0x0179:
            r0 = 5
            if (r9 != r0) goto L_0x009d
            int r0 = X.BEB.A08(r4, r6)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.CnK r0 = com.google.protobuf.UnsafeUtil.A02
            r0.A0D(r10, r2, r1)
        L_0x0189:
            int r13 = r6 + 4
            goto L_0x01a3
        L_0x018c:
            r0 = r16
            if (r9 != r0) goto L_0x009d
            long r0 = X.BEB.A0G(r4, r6)
            double r26 = java.lang.Double.longBitsToDouble(r0)
            X.CnK r22 = com.google.protobuf.UnsafeUtil.A02
            r23 = r10
            r24 = r2
            r22.A0C(r23, r24, r26)
        L_0x01a1:
            int r13 = r6 + 8
        L_0x01a3:
            r21 = r21 | r17
            goto L_0x00af
        L_0x01a7:
            r0 = 27
            if (r13 != r0) goto L_0x01fa
            r0 = 2
            if (r9 != r0) goto L_0x009d
            java.lang.Object r8 = r14.getObject(r10, r2)
            X.EE9 r8 = (X.EE9) r8
            r0 = r8
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01cc
            int r1 = r8.size()
            int r0 = r1 * 2
            if (r1 != 0) goto L_0x01c5
            r0 = 10
        L_0x01c5:
            X.EE9 r8 = r8.Bk8(r0)
            r14.putObject(r10, r2, r8)
        L_0x01cc:
            X.EAO r1 = r12.A0N(r7)
        L_0x01d0:
            X.Bm6 r0 = r1.BkG()
            r22 = r5
            r23 = r1
            r24 = r0
            r25 = r4
            r26 = r6
            r27 = r37
            int r13 = A03(r22, r23, r24, r25, r26, r27)
            r1.Bih(r0)
            r5.A02 = r0
            r8.add(r0)
            r0 = r37
            if (r13 >= r0) goto L_0x00af
            int r6 = A0D(r5, r4, r13)
            int r0 = r5.A00
            if (r11 == r0) goto L_0x01d0
            goto L_0x00af
        L_0x01fa:
            r0 = 49
            if (r13 > r0) goto L_0x0224
            r0 = r18
            long r0 = (long) r0
            r28 = r11
            r29 = r19
            r30 = r9
            r31 = r7
            r32 = r13
            r33 = r0
            r35 = r2
            r22 = r12
            r23 = r5
            r24 = r10
            r25 = r4
            r26 = r6
            r27 = r37
            int r13 = r22.A09(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)
        L_0x021f:
            if (r13 != r6) goto L_0x00af
            r6 = r13
            goto L_0x009d
        L_0x0224:
            r0 = 50
            if (r13 != r0) goto L_0x0240
            r0 = 2
            if (r9 != r0) goto L_0x009d
            r28 = r7
            r29 = r2
            r22 = r12
            r23 = r5
            r24 = r10
            r25 = r4
            r26 = r6
            r27 = r37
            int r13 = r22.A0A(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x021f
        L_0x0240:
            r28 = r11
            r29 = r19
            r30 = r9
            r31 = r18
            r32 = r13
            r33 = r7
            r34 = r2
            r22 = r12
            r23 = r5
            r24 = r10
            r25 = r4
            r26 = r6
            r27 = r37
            int r13 = r22.A08(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x021f
        L_0x025f:
            r7 = 0
            goto L_0x009d
        L_0x0262:
            X.1PN r0 = X.BE7.A0N()
            throw r0
        L_0x0267:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r20
            if (r0 == r1) goto L_0x0274
            long r1 = (long) r0
            r0 = r21
            r14.putInt(r10, r1, r0)
        L_0x0274:
            r0 = r37
            if (r13 == r0) goto L_0x028a
            java.lang.String r0 = "Failed to parse the message."
            X.1PN r0 = X.BE6.A0c(r0)
            throw r0
        L_0x027f:
            r6 = 0
            r0 = r12
            r1 = r5
            r2 = r10
            r3 = r4
            r4 = r13
            r5 = r37
            r0.A0f(r1, r2, r3, r4, r5, r6)
        L_0x028a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.Bjm(X.CiD, java.lang.Object, byte[], int, int):void");
    }

    public C23577Bm6 BkG() {
        return (C23577Bm6) ((C23577Bm6) this.A0A).A0P(AnonymousClass00R.A0N, (Object) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x031e, code lost:
        r7.A00.A0D(r2, X.C17880vN.A05(X.C25856CnK.A00(r6, X.BE6.A0M(r0))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0395, code lost:
        if (r1 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0397, code lost:
        r1 = A0P(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x039d, code lost:
        if ((r1 instanceof java.lang.String) == false) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x039f, code lost:
        r0 = r7.A00;
        X.C25878Cnp.A07(r0, r2);
        r0.A0K((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03ab, code lost:
        r0 = r7.A00;
        X.C25878Cnp.A07(r0, r2);
        r0.A0H((X.DSQ) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03bb, code lost:
        if (r1 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03bd, code lost:
        r10 = A0P(r0, r6);
        r7.A00.A0I((X.C28668EDk) r10, A0N(r3), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03d2, code lost:
        if (r1 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03d4, code lost:
        r0 = r7.A00;
        X.C25878Cnp.A07(r0, r2);
        r0.A0H((X.DSQ) A0P(r0, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x040f, code lost:
        r7.A00.A0A(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0428, code lost:
        r7.A00.A09(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0441, code lost:
        r7.A00.A0C(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x045a, code lost:
        r7.A00.A0B(r2, (r0 >> 31) ^ (r0 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0478, code lost:
        r7.A00.A0D(r2, (r0 >> 63) ^ (r0 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0489, code lost:
        if (r1 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x048b, code lost:
        r7.A00(A0N(r3), A0P(r0, r6), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04cd, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0533, code lost:
        X.C26298CxB.A0O(r7, r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x066e, code lost:
        X.C26298CxB.A0E(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x067c, code lost:
        X.C26298CxB.A0I(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x068a, code lost:
        X.C26298CxB.A0K(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0698, code lost:
        X.C26298CxB.A0Q(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x06a6, code lost:
        X.C26298CxB.A0J(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x06b4, code lost:
        X.C26298CxB.A0H(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x06de, code lost:
        X.C26298CxB.A0P(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x06ec, code lost:
        X.C26298CxB.A0F(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06fa, code lost:
        X.C26298CxB.A0L(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0708, code lost:
        X.C26298CxB.A0M(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0716, code lost:
        X.C26298CxB.A0N(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x076b, code lost:
        r7.A00.A0D(r2, X.C17880vN.A05(X.C25856CnK.A00(r6, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x07b8, code lost:
        if (r11 == false) goto L_0x04cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x07ba, code lost:
        r1 = r4.getObject(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x07c0, code lost:
        if ((r1 instanceof java.lang.String) == false) goto L_0x07ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x07c2, code lost:
        r0 = r7.A00;
        X.C25878Cnp.A07(r0, r2);
        r0.A0K((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x07ce, code lost:
        r0 = r7.A00;
        X.C25878Cnp.A07(r0, r2);
        r0.A0H((X.DSQ) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x07de, code lost:
        if (r11 == false) goto L_0x04cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x07e0, code lost:
        r11 = r4.getObject(r6, r0);
        r7.A00.A0I((X.C28668EDk) r11, A0N(r3), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x07f5, code lost:
        if (r11 == false) goto L_0x04cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x07f7, code lost:
        r0 = r7.A00;
        X.C25878Cnp.A07(r0, r2);
        r0.A0H((X.DSQ) r4.getObject(r6, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0822, code lost:
        r7.A00.A0A(r2, X.AnonymousClass000.A0M(X.C25856CnK.A00(r6, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0837, code lost:
        r7.A00.A09(r2, X.AnonymousClass000.A0M(X.C25856CnK.A00(r6, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0892, code lost:
        if (r11 == false) goto L_0x04cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0894, code lost:
        r7.A00(A0N(r3), r4.getObject(r6, r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r3 = r3 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CSV(X.CVN r18, java.lang.Object r19) {
        /*
            r17 = this;
            r6 = r19
            r5 = r17
            boolean r0 = r5.A0E
            r7 = r18
            if (r0 == 0) goto L_0x0498
            int[] r4 = r5.A05
            int r9 = r4.length
            r8 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r9) goto L_0x08a4
            int r0 = r3 + 1
            r0 = r4[r0]
            r2 = r4[r3]
            int r1 = X.BE7.A04(r0)
            r10 = 1
            switch(r1) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x01d5;
                case 2: goto L_0x01f0;
                case 3: goto L_0x0207;
                case 4: goto L_0x021e;
                case 5: goto L_0x022f;
                case 6: goto L_0x0246;
                case 7: goto L_0x0257;
                case 8: goto L_0x026e;
                case 9: goto L_0x0274;
                case 10: goto L_0x027a;
                case 11: goto L_0x0280;
                case 12: goto L_0x0291;
                case 13: goto L_0x029d;
                case 14: goto L_0x02a9;
                case 15: goto L_0x02bb;
                case 16: goto L_0x02c7;
                case 17: goto L_0x02d9;
                case 18: goto L_0x0022;
                case 19: goto L_0x002c;
                case 20: goto L_0x0036;
                case 21: goto L_0x0040;
                case 22: goto L_0x004a;
                case 23: goto L_0x0054;
                case 24: goto L_0x005e;
                case 25: goto L_0x0068;
                case 26: goto L_0x0072;
                case 27: goto L_0x007c;
                case 28: goto L_0x00a5;
                case 29: goto L_0x00b0;
                case 30: goto L_0x00bb;
                case 31: goto L_0x00c6;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00dc;
                case 34: goto L_0x00e7;
                case 35: goto L_0x00f2;
                case 36: goto L_0x00fd;
                case 37: goto L_0x0108;
                case 38: goto L_0x0113;
                case 39: goto L_0x011e;
                case 40: goto L_0x0129;
                case 41: goto L_0x0134;
                case 42: goto L_0x013f;
                case 43: goto L_0x014a;
                case 44: goto L_0x0155;
                case 45: goto L_0x0160;
                case 46: goto L_0x016b;
                case 47: goto L_0x0176;
                case 48: goto L_0x0181;
                case 49: goto L_0x018c;
                case 50: goto L_0x01b1;
                case 51: goto L_0x02df;
                case 52: goto L_0x02f8;
                case 53: goto L_0x0311;
                case 54: goto L_0x0318;
                case 55: goto L_0x0331;
                case 56: goto L_0x034a;
                case 57: goto L_0x0363;
                case 58: goto L_0x037c;
                case 59: goto L_0x0391;
                case 60: goto L_0x03b7;
                case 61: goto L_0x03ce;
                case 62: goto L_0x03e4;
                case 63: goto L_0x03fd;
                case 64: goto L_0x0416;
                case 65: goto L_0x042f;
                case 66: goto L_0x0448;
                case 67: goto L_0x0466;
                case 68: goto L_0x0485;
                default: goto L_0x001f;
            }
        L_0x001f:
            int r3 = r3 + 3
            goto L_0x000f
        L_0x0022:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0E(r7, r0, r1, r8)
            goto L_0x001f
        L_0x002c:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0I(r7, r0, r1, r8)
            goto L_0x001f
        L_0x0036:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0K(r7, r0, r1, r8)
            goto L_0x001f
        L_0x0040:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0Q(r7, r0, r1, r8)
            goto L_0x001f
        L_0x004a:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0J(r7, r0, r1, r8)
            goto L_0x001f
        L_0x0054:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0H(r7, r0, r1, r8)
            goto L_0x001f
        L_0x005e:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0G(r7, r0, r1, r8)
            goto L_0x001f
        L_0x0068:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0D(r7, r0, r1, r8)
            goto L_0x001f
        L_0x0072:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0C(r7, r0, r1)
            goto L_0x001f
        L_0x007c:
            r11 = r4[r3]
            java.util.List r12 = A0U(r0, r6)
            X.EAO r10 = r5.A0N(r3)
            X.CXo r0 = X.C26298CxB.A02
            if (r12 == 0) goto L_0x001f
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x001f
            r2 = 0
        L_0x0091:
            int r0 = r12.size()
            if (r2 >= r0) goto L_0x001f
            java.lang.Object r1 = r12.get(r2)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.EDk r1 = (X.C28668EDk) r1
            r0.A0I(r1, r10, r11)
            int r2 = r2 + 1
            goto L_0x0091
        L_0x00a5:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0B(r7, r0, r1)
            goto L_0x001f
        L_0x00b0:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0P(r7, r0, r1, r8)
            goto L_0x001f
        L_0x00bb:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0F(r7, r0, r1, r8)
            goto L_0x001f
        L_0x00c6:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0L(r7, r0, r1, r8)
            goto L_0x001f
        L_0x00d1:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0M(r7, r0, r1, r8)
            goto L_0x001f
        L_0x00dc:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0N(r7, r0, r1, r8)
            goto L_0x001f
        L_0x00e7:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0O(r7, r0, r1, r8)
            goto L_0x001f
        L_0x00f2:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0E(r7, r0, r1, r10)
            goto L_0x001f
        L_0x00fd:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0I(r7, r0, r1, r10)
            goto L_0x001f
        L_0x0108:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0K(r7, r0, r1, r10)
            goto L_0x001f
        L_0x0113:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0Q(r7, r0, r1, r10)
            goto L_0x001f
        L_0x011e:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0J(r7, r0, r1, r10)
            goto L_0x001f
        L_0x0129:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0H(r7, r0, r1, r10)
            goto L_0x001f
        L_0x0134:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0G(r7, r0, r1, r10)
            goto L_0x001f
        L_0x013f:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0D(r7, r0, r1, r10)
            goto L_0x001f
        L_0x014a:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0P(r7, r0, r1, r10)
            goto L_0x001f
        L_0x0155:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0F(r7, r0, r1, r10)
            goto L_0x001f
        L_0x0160:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0L(r7, r0, r1, r10)
            goto L_0x001f
        L_0x016b:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0M(r7, r0, r1, r10)
            goto L_0x001f
        L_0x0176:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0N(r7, r0, r1, r10)
            goto L_0x001f
        L_0x0181:
            r1 = r4[r3]
            java.util.List r0 = A0U(r0, r6)
            X.C26298CxB.A0O(r7, r0, r1, r10)
            goto L_0x001f
        L_0x018c:
            r11 = r4[r3]
            java.util.List r10 = A0U(r0, r6)
            X.EAO r2 = r5.A0N(r3)
            X.CXo r0 = X.C26298CxB.A02
            if (r10 == 0) goto L_0x001f
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x001f
            r1 = 0
        L_0x01a1:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x001f
            java.lang.Object r0 = r10.get(r1)
            r7.A00(r2, r0, r11)
            int r1 = r1 + 1
            goto L_0x01a1
        L_0x01b1:
            java.lang.Object r0 = A0P(r0, r6)
            r5.A0Y(r7, r0, r2, r3)
            goto L_0x001f
        L_0x01ba:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            X.CnK r10 = com.google.protobuf.UnsafeUtil.A02
            double r0 = r10.A03(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x01d5:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            X.CnK r10 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r10.A04(r6, r0)
            com.google.protobuf.CodedOutputStream r1 = r7.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A09(r2, r0)
            goto L_0x001f
        L_0x01f0:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            X.CnK r10 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r10.A07(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0D(r2, r0)
            goto L_0x001f
        L_0x0207:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            X.CnK r10 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r10.A07(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0D(r2, r0)
            goto L_0x001f
        L_0x021e:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            int r1 = A02(r0, r6)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x001f
        L_0x022f:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            X.CnK r10 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r10.A07(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x0246:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            int r1 = A02(r0, r6)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x001f
        L_0x0257:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            X.CnK r10 = com.google.protobuf.UnsafeUtil.A02
            boolean r1 = r10.A0L(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0E(r2, r1)
            goto L_0x001f
        L_0x026e:
            boolean r1 = r5.A0d(r6, r3)
            goto L_0x0395
        L_0x0274:
            boolean r1 = r5.A0d(r6, r3)
            goto L_0x03bb
        L_0x027a:
            boolean r1 = r5.A0d(r6, r3)
            goto L_0x03d2
        L_0x0280:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            int r1 = A02(r0, r6)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0B(r2, r1)
            goto L_0x001f
        L_0x0291:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            int r1 = A02(r0, r6)
            goto L_0x040f
        L_0x029d:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            int r1 = A02(r0, r6)
            goto L_0x0428
        L_0x02a9:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            X.CnK r10 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r10.A07(r6, r0)
            goto L_0x0441
        L_0x02bb:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            int r0 = A02(r0, r6)
            goto L_0x045a
        L_0x02c7:
            boolean r1 = r5.A0d(r6, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            X.CnK r11 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r11.A07(r6, r0)
            goto L_0x0478
        L_0x02d9:
            boolean r1 = r5.A0d(r6, r3)
            goto L_0x0489
        L_0x02df:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r0 = A0P(r0, r6)
            double r0 = X.AnonymousClass8BR.A00(r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x02f8:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r0 = A0P(r0, r6)
            float r0 = X.AnonymousClass000.A04(r0)
            com.google.protobuf.CodedOutputStream r1 = r7.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A09(r2, r0)
            goto L_0x001f
        L_0x0311:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            goto L_0x031e
        L_0x0318:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
        L_0x031e:
            long r0 = X.BE6.A0M(r0)
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            long r0 = X.C17880vN.A05(r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0D(r2, r0)
            goto L_0x001f
        L_0x0331:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x001f
        L_0x034a:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            long r0 = X.C17880vN.A05(r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x0363:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x001f
        L_0x037c:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r0 = A0P(r0, r6)
            boolean r1 = X.AnonymousClass000.A1Y(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0E(r2, r1)
            goto L_0x001f
        L_0x0391:
            boolean r1 = r5.A0e(r6, r2, r3)
        L_0x0395:
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = A0P(r0, r6)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x03ab
            java.lang.String r1 = (java.lang.String) r1
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.C25878Cnp.A07(r0, r2)
            r0.A0K(r1)
            goto L_0x001f
        L_0x03ab:
            X.DSQ r1 = (X.DSQ) r1
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.C25878Cnp.A07(r0, r2)
            r0.A0H(r1)
            goto L_0x001f
        L_0x03b7:
            boolean r1 = r5.A0e(r6, r2, r3)
        L_0x03bb:
            if (r1 == 0) goto L_0x001f
            java.lang.Object r10 = A0P(r0, r6)
            X.EAO r1 = r5.A0N(r3)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.EDk r10 = (X.C28668EDk) r10
            r0.A0I(r10, r1, r2)
            goto L_0x001f
        L_0x03ce:
            boolean r1 = r5.A0e(r6, r2, r3)
        L_0x03d2:
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = A0P(r0, r6)
            X.DSQ r1 = (X.DSQ) r1
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.C25878Cnp.A07(r0, r2)
            r0.A0H(r1)
            goto L_0x001f
        L_0x03e4:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0B(r2, r1)
            goto L_0x001f
        L_0x03fd:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
        L_0x040f:
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x001f
        L_0x0416:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
        L_0x0428:
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x001f
        L_0x042f:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            long r0 = X.C17880vN.A05(r0)
        L_0x0441:
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x0448:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
        L_0x045a:
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r10.A0B(r2, r0)
            goto L_0x001f
        L_0x0466:
            boolean r1 = r5.A0e(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.BE6.A0M(r0)
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            long r0 = X.C17880vN.A05(r0)
        L_0x0478:
            com.google.protobuf.CodedOutputStream r13 = r7.A00
            long r11 = r0 << r10
            r10 = 63
            long r0 = r0 >> r10
            long r0 = r0 ^ r11
            r13.A0D(r2, r0)
            goto L_0x001f
        L_0x0485:
            boolean r1 = r5.A0e(r6, r2, r3)
        L_0x0489:
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = A0P(r0, r6)
            X.EAO r0 = r5.A0N(r3)
            r7.A00(r0, r1, r2)
            goto L_0x001f
        L_0x0498:
            int[] r8 = r5.A05
            int r10 = r8.length
            sun.misc.Unsafe r4 = A0F
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r15 = 0
        L_0x04a5:
            if (r3 >= r10) goto L_0x08a4
            int r0 = r3 + 1
            r13 = r8[r0]
            r2 = r8[r3]
            int r12 = X.BE7.A04(r13)
            r0 = 17
            if (r12 > r0) goto L_0x08a1
            int r0 = r3 + 2
            r14 = r8[r0]
            r11 = r14 & r16
            if (r11 == r9) goto L_0x04c3
            long r0 = (long) r11
            int r15 = r4.getInt(r6, r0)
            r9 = r11
        L_0x04c3:
            int r0 = r14 >>> 20
            r11 = 1
            int r11 = r11 << r0
        L_0x04c7:
            r13 = r13 & r16
            long r0 = (long) r13
            switch(r12) {
                case 0: goto L_0x055e;
                case 1: goto L_0x0572;
                case 2: goto L_0x0586;
                case 3: goto L_0x0594;
                case 4: goto L_0x05a2;
                case 5: goto L_0x05b0;
                case 6: goto L_0x05be;
                case 7: goto L_0x05cc;
                case 8: goto L_0x05dc;
                case 9: goto L_0x05df;
                case 10: goto L_0x05e2;
                case 11: goto L_0x05e5;
                case 12: goto L_0x05f3;
                case 13: goto L_0x0601;
                case 14: goto L_0x060f;
                case 15: goto L_0x061d;
                case 16: goto L_0x0630;
                case 17: goto L_0x0642;
                case 18: goto L_0x0645;
                case 19: goto L_0x0647;
                case 20: goto L_0x0649;
                case 21: goto L_0x064b;
                case 22: goto L_0x064d;
                case 23: goto L_0x064f;
                case 24: goto L_0x0651;
                case 25: goto L_0x04d0;
                case 26: goto L_0x04dd;
                case 27: goto L_0x04e9;
                case 28: goto L_0x0514;
                case 29: goto L_0x065f;
                case 30: goto L_0x0661;
                case 31: goto L_0x0664;
                case 32: goto L_0x0667;
                case 33: goto L_0x066a;
                case 34: goto L_0x0520;
                case 35: goto L_0x066d;
                case 36: goto L_0x067b;
                case 37: goto L_0x0689;
                case 38: goto L_0x0697;
                case 39: goto L_0x06a5;
                case 40: goto L_0x06b3;
                case 41: goto L_0x06c1;
                case 42: goto L_0x06cf;
                case 43: goto L_0x06dd;
                case 44: goto L_0x06eb;
                case 45: goto L_0x06f9;
                case 46: goto L_0x0707;
                case 47: goto L_0x0715;
                case 48: goto L_0x052a;
                case 49: goto L_0x0537;
                case 50: goto L_0x0723;
                case 51: goto L_0x072c;
                case 52: goto L_0x0745;
                case 53: goto L_0x075e;
                case 54: goto L_0x0765;
                case 55: goto L_0x077a;
                case 56: goto L_0x0782;
                case 57: goto L_0x0797;
                case 58: goto L_0x079f;
                case 59: goto L_0x07b4;
                case 60: goto L_0x07da;
                case 61: goto L_0x07f1;
                case 62: goto L_0x0807;
                case 63: goto L_0x081c;
                case 64: goto L_0x0831;
                case 65: goto L_0x0846;
                case 66: goto L_0x085b;
                case 67: goto L_0x0875;
                case 68: goto L_0x088e;
                default: goto L_0x04cd;
            }
        L_0x04cd:
            int r3 = r3 + 3
            goto L_0x04a5
        L_0x04d0:
            r2 = r8[r3]
            java.lang.Object r1 = r4.getObject(r6, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C26298CxB.A0D(r7, r1, r2, r0)
            goto L_0x04cd
        L_0x04dd:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0C(r7, r0, r2)
            goto L_0x04cd
        L_0x04e9:
            r11 = r8[r3]
            java.lang.Object r13 = r4.getObject(r6, r0)
            java.util.List r13 = (java.util.List) r13
            X.EAO r12 = r5.A0N(r3)
            X.CXo r0 = X.C26298CxB.A02
            if (r13 == 0) goto L_0x04cd
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x04cd
            r2 = 0
        L_0x0500:
            int r0 = r13.size()
            if (r2 >= r0) goto L_0x04cd
            java.lang.Object r1 = r13.get(r2)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.EDk r1 = (X.C28668EDk) r1
            r0.A0I(r1, r12, r11)
            int r2 = r2 + 1
            goto L_0x0500
        L_0x0514:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0B(r7, r0, r2)
            goto L_0x04cd
        L_0x0520:
            r2 = r8[r3]
            java.lang.Object r1 = r4.getObject(r6, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            goto L_0x0533
        L_0x052a:
            r2 = r8[r3]
            java.lang.Object r1 = r4.getObject(r6, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 1
        L_0x0533:
            X.C26298CxB.A0O(r7, r1, r2, r0)
            goto L_0x04cd
        L_0x0537:
            r2 = r8[r3]
            java.lang.Object r12 = r4.getObject(r6, r0)
            java.util.List r12 = (java.util.List) r12
            X.EAO r11 = r5.A0N(r3)
            X.CXo r0 = X.C26298CxB.A02
            if (r12 == 0) goto L_0x04cd
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x04cd
            r1 = 0
        L_0x054e:
            int r0 = r12.size()
            if (r1 >= r0) goto L_0x04cd
            java.lang.Object r0 = r12.get(r1)
            r7.A00(r11, r0, r2)
            int r1 = r1 + 1
            goto L_0x054e
        L_0x055e:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            X.CnK r11 = com.google.protobuf.UnsafeUtil.A02
            double r0 = r11.A03(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r11.A0C(r2, r0)
            goto L_0x04cd
        L_0x0572:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            X.CnK r11 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r11.A04(r6, r0)
            com.google.protobuf.CodedOutputStream r1 = r7.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A09(r2, r0)
            goto L_0x04cd
        L_0x0586:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0D(r2, r0)
            goto L_0x04cd
        L_0x0594:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0D(r2, r0)
            goto L_0x04cd
        L_0x05a2:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x04cd
        L_0x05b0:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0C(r2, r0)
            goto L_0x04cd
        L_0x05be:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x04cd
        L_0x05cc:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            X.CnK r11 = com.google.protobuf.UnsafeUtil.A02
            boolean r1 = r11.A0L(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0E(r2, r1)
            goto L_0x04cd
        L_0x05dc:
            r11 = r11 & r15
            goto L_0x07b8
        L_0x05df:
            r11 = r11 & r15
            goto L_0x07de
        L_0x05e2:
            r11 = r11 & r15
            goto L_0x07f5
        L_0x05e5:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0B(r2, r1)
            goto L_0x04cd
        L_0x05f3:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x04cd
        L_0x0601:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x04cd
        L_0x060f:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0C(r2, r0)
            goto L_0x04cd
        L_0x061d:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            int r0 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r11.A0B(r2, r0)
            goto L_0x04cd
        L_0x0630:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04cd
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            long r0 = X.BE9.A0L(r0)
            r11.A0D(r2, r0)
            goto L_0x04cd
        L_0x0642:
            r11 = r11 & r15
            goto L_0x0892
        L_0x0645:
            r11 = 0
            goto L_0x066e
        L_0x0647:
            r11 = 0
            goto L_0x067c
        L_0x0649:
            r11 = 0
            goto L_0x068a
        L_0x064b:
            r11 = 0
            goto L_0x0698
        L_0x064d:
            r11 = 0
            goto L_0x06a6
        L_0x064f:
            r11 = 0
            goto L_0x06b4
        L_0x0651:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0G(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x065f:
            r11 = 0
            goto L_0x06de
        L_0x0661:
            r11 = 0
            goto L_0x06ec
        L_0x0664:
            r11 = 0
            goto L_0x06fa
        L_0x0667:
            r11 = 0
            goto L_0x0708
        L_0x066a:
            r11 = 0
            goto L_0x0716
        L_0x066d:
            r11 = 1
        L_0x066e:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0E(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x067b:
            r11 = 1
        L_0x067c:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0I(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x0689:
            r11 = 1
        L_0x068a:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0K(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x0697:
            r11 = 1
        L_0x0698:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0Q(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x06a5:
            r11 = 1
        L_0x06a6:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0J(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x06b3:
            r11 = 1
        L_0x06b4:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0H(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x06c1:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0G(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x06cf:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0D(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x06dd:
            r11 = 1
        L_0x06de:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0P(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x06eb:
            r11 = 1
        L_0x06ec:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0F(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x06f9:
            r11 = 1
        L_0x06fa:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0L(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x0707:
            r11 = 1
        L_0x0708:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0M(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x0715:
            r11 = 1
        L_0x0716:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26298CxB.A0N(r7, r0, r2, r11)
            goto L_0x04cd
        L_0x0723:
            java.lang.Object r0 = r4.getObject(r6, r0)
            r5.A0Y(r7, r0, r2, r3)
            goto L_0x04cd
        L_0x072c:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            double r0 = X.AnonymousClass8BR.A00(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r11.A0C(r2, r0)
            goto L_0x04cd
        L_0x0745:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            float r0 = X.AnonymousClass000.A04(r0)
            com.google.protobuf.CodedOutputStream r1 = r7.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A09(r2, r0)
            goto L_0x04cd
        L_0x075e:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
            goto L_0x076b
        L_0x0765:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
        L_0x076b:
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            long r0 = X.C17880vN.A05(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0D(r2, r0)
            goto L_0x04cd
        L_0x077a:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
            goto L_0x0822
        L_0x0782:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            long r0 = X.C17880vN.A05(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0C(r2, r0)
            goto L_0x04cd
        L_0x0797:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
            goto L_0x0837
        L_0x079f:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            boolean r1 = X.AnonymousClass000.A1Y(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0E(r2, r1)
            goto L_0x04cd
        L_0x07b4:
            boolean r11 = r5.A0e(r6, r2, r3)
        L_0x07b8:
            if (r11 == 0) goto L_0x04cd
            java.lang.Object r1 = r4.getObject(r6, r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x07ce
            java.lang.String r1 = (java.lang.String) r1
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.C25878Cnp.A07(r0, r2)
            r0.A0K(r1)
            goto L_0x04cd
        L_0x07ce:
            X.DSQ r1 = (X.DSQ) r1
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.C25878Cnp.A07(r0, r2)
            r0.A0H(r1)
            goto L_0x04cd
        L_0x07da:
            boolean r11 = r5.A0e(r6, r2, r3)
        L_0x07de:
            if (r11 == 0) goto L_0x04cd
            java.lang.Object r11 = r4.getObject(r6, r0)
            X.EAO r1 = r5.A0N(r3)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.EDk r11 = (X.C28668EDk) r11
            r0.A0I(r11, r1, r2)
            goto L_0x04cd
        L_0x07f1:
            boolean r11 = r5.A0e(r6, r2, r3)
        L_0x07f5:
            if (r11 == 0) goto L_0x04cd
            java.lang.Object r1 = r4.getObject(r6, r0)
            X.DSQ r1 = (X.DSQ) r1
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.C25878Cnp.A07(r0, r2)
            r0.A0H(r1)
            goto L_0x04cd
        L_0x0807:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0B(r2, r1)
            goto L_0x04cd
        L_0x081c:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
        L_0x0822:
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x04cd
        L_0x0831:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
        L_0x0837:
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x04cd
        L_0x0846:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            long r0 = X.C17880vN.A05(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0C(r2, r0)
            goto L_0x04cd
        L_0x085b:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r11.A0B(r2, r0)
            goto L_0x04cd
        L_0x0875:
            boolean r11 = r5.A0e(r6, r2, r3)
            if (r11 == 0) goto L_0x04cd
            java.lang.Object r0 = X.C25856CnK.A00(r6, r0)
            long r0 = X.C17880vN.A05(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            long r0 = X.BE9.A0L(r0)
            r11.A0D(r2, r0)
            goto L_0x04cd
        L_0x088e:
            boolean r11 = r5.A0e(r6, r2, r3)
        L_0x0892:
            if (r11 == 0) goto L_0x04cd
            java.lang.Object r1 = r4.getObject(r6, r0)
            X.EAO r0 = r5.A0N(r3)
            r7.A00(r0, r1, r2)
            goto L_0x04cd
        L_0x08a1:
            r11 = 0
            goto L_0x04c7
        L_0x08a4:
            X.Bm6 r6 = (X.C23577Bm6) r6
            X.Cr6 r0 = r6.unknownFields
            r0.A03(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNG.CSV(X.CVN, java.lang.Object):void");
    }

    public DNG(C24609CBn cBn, C25037CUq cUq, C25879Cnq cnq, C28668EDk eDk, C24611CBp cBp, C25096CXo cXo, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
        this.A05 = iArr;
        this.A07 = objArr;
        this.A02 = i;
        this.A01 = i2;
        this.A0D = eDk instanceof C23577Bm6;
        this.A0E = z;
        this.A06 = iArr2;
        this.A00 = i3;
        this.A03 = i4;
        this.A0B = cBp;
        this.A04 = cUq;
        this.A0C = cXo;
        this.A08 = cBn;
        this.A0A = eDk;
        this.A09 = cnq;
    }

    public static int A02(int i, Object obj) {
        return UnsafeUtil.A02.A06(obj, (long) (i & 1048575));
    }

    public static int A0B(C25573CiD ciD, byte[] bArr, int i) {
        int A0D2 = A0D(ciD, bArr, i);
        int i2 = ciD.A00;
        if (i2 < 0) {
            throw BE7.A0N();
        } else if (i2 > bArr.length - A0D2) {
            throw BE7.A0M();
        } else if (i2 == 0) {
            ciD.A02 = DSQ.A00;
            return A0D2;
        } else {
            ciD.A02 = DSQ.A01(bArr, A0D2, i2);
            return A0D2 + i2;
        }
    }

    public static int A0C(C25573CiD ciD, byte[] bArr, int i) {
        int A0D2 = A0D(ciD, bArr, i);
        int i2 = ciD.A00;
        if (i2 < 0) {
            throw BE7.A0N();
        } else if (i2 == 0) {
            ciD.A02 = "";
            return A0D2;
        } else {
            ciD.A02 = C25412CfK.A00.A03(bArr, A0D2, i2);
            return A0D2 + i2;
        }
    }

    public static long A0I(C26282Cwd cwd, int i) {
        long j = (long) (i & 1048575);
        C26282Cwd.A07(cwd, 0);
        return j;
    }

    public static long A0J(C26282Cwd cwd, int i) {
        long j = (long) (i & 1048575);
        C26282Cwd.A07(cwd, 1);
        return j;
    }

    public static long A0K(C26282Cwd cwd, int i) {
        long j = (long) (i & 1048575);
        C26282Cwd.A07(cwd, 5);
        return j;
    }

    public static Object A0P(int i, Object obj) {
        return UnsafeUtil.A02.A09(obj, (long) (i & 1048575));
    }

    private Object A0R(Object obj, int i) {
        EAO A0N = A0N(i);
        long A0N2 = BE9.A0N(this.A05, i);
        if (!A0d(obj, i)) {
            return A0N.BkG();
        }
        Object object = A0F.getObject(obj, A0N2);
        if (A0c(object)) {
            return object;
        }
        C23577Bm6 BkG = A0N.BkG();
        if (object != null) {
            A0N.Bjk(BkG, object);
        }
        return BkG;
    }

    private Object A0S(Object obj, int i, int i2) {
        EAO A0N = A0N(i2);
        if (!A0e(obj, i, i2)) {
            return A0N.BkG();
        }
        Object object = A0F.getObject(obj, BE9.A0N(this.A05, i2));
        if (A0c(object)) {
            return object;
        }
        C23577Bm6 BkG = A0N.BkG();
        if (object != null) {
            A0N.Bjk(BkG, object);
        }
        return BkG;
    }

    public static Field A0T(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder A10 = AnonymousClass000.A10();
            BEA.A1S(A10, str);
            BE7.A1E(cls, A10);
            A10.append(" not found. Known fields are ");
            throw BE9.A0n(Arrays.toString(declaredFields), A10);
        }
    }

    public static List A0U(int i, Object obj) {
        return (List) UnsafeUtil.A02.A09(obj, (long) (i & 1048575));
    }

    public static void A0Z(Object obj) {
        if (!A0c(obj)) {
            throw AnonymousClass8BX.A0V(obj, "Mutating immutable message: ", AnonymousClass000.A10());
        }
    }

    public final boolean Bf7(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A00) {
            int i4 = this.A06[i3];
            int[] iArr = this.A05;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i) {
                i8 = i;
            } else if (i8 != 1048575) {
                i2 = A0F.getInt(obj, (long) i8);
            }
            if ((268435456 & i6) != 0) {
                if (i8 == 1048575) {
                    if (!A0d(obj, i4)) {
                        return false;
                    }
                } else if ((i2 & i9) == 0) {
                    return false;
                }
            }
            int A042 = BE7.A04(i6);
            if (A042 != 9 && A042 != 17) {
                if (A042 != 27) {
                    if (A042 == 60 || A042 == 68) {
                        z = A0e(obj, i5, i4);
                    } else if (A042 != 49) {
                        if (A042 == 50) {
                            C27328Dbz dbz = (C27328Dbz) C25856CnK.A00(obj, (long) (i6 & 1048575));
                            if (!dbz.isEmpty() && ((CQE) this.A07[(i4 / 3) * 2]).A00.A01.javaType == C24351Bzm.MESSAGE) {
                                Iterator A0l = C17890vO.A0l(dbz);
                                EAO eao = null;
                                while (A0l.hasNext()) {
                                    Object next = A0l.next();
                                    if (eao == null) {
                                        eao = BE9.A0U(next);
                                    }
                                    if (!eao.Bf7(next)) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        } else {
                            continue;
                        }
                        i3++;
                        i = i8;
                    }
                }
                List list = (List) C25856CnK.A00(obj, (long) (i6 & 1048575));
                if (!list.isEmpty()) {
                    EAO A0N = A0N(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!A0N.Bf7(list.get(i10))) {
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
                z = A0d(obj, i4);
            } else {
                z = i2 & i9;
            }
            if (z && !A0N(i4).Bf7(C25856CnK.A00(obj, (long) (i6 & 1048575)))) {
                return false;
            }
            i3++;
            i = i8;
        }
        return true;
    }

    public void Bih(Object obj) {
        Object unmodifiableList;
        C27296DbR dbR;
        if (A0c(obj)) {
            if (obj instanceof C23577Bm6) {
                C23577Bm6 bm6 = (C23577Bm6) obj;
                int i = Integer.MAX_VALUE | (bm6.memoizedSerializedSize & Integer.MIN_VALUE);
                bm6.memoizedSerializedSize = i;
                bm6.memoizedHashCode = 0;
                bm6.memoizedSerializedSize = i & Integer.MAX_VALUE;
            }
            int[] iArr = this.A05;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int i3 = iArr[i2 + 1];
                long A0M = BE6.A0M(i3);
                int A042 = BE7.A04(i3);
                if (A042 != 9) {
                    switch (A042) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            boolean z = this.A04 instanceof C23660BnT;
                            Object A002 = C25856CnK.A00(obj, A0M);
                            if (!z) {
                                List list = (List) A002;
                                if (!(list instanceof EE5)) {
                                    if (!BE7.A1W(C23661BnU.A00, list)) {
                                        if ((list instanceof C28460E2b) && (list instanceof EE9)) {
                                            dbR = (C27296DbR) ((EE9) list);
                                            if (!dbR.A00) {
                                                break;
                                            }
                                        } else {
                                            unmodifiableList = Collections.unmodifiableList(list);
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    unmodifiableList = ((EE5) list).Bb0();
                                }
                                UnsafeUtil.A05(obj, A0M, unmodifiableList);
                                break;
                            } else {
                                dbR = (C27296DbR) ((EE9) A002);
                            }
                            dbR.A00 = false;
                            continue;
                        case 50:
                            Unsafe unsafe = A0F;
                            Object object = unsafe.getObject(obj, A0M);
                            if (object != null) {
                                ((C27328Dbz) object).isMutable = false;
                                unsafe.putObject(obj, A0M, object);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (A0d(obj, i2)) {
                    A0N(i2).Bih(A0F.getObject(obj, A0M));
                }
            }
            ((C23577Bm6) obj).unknownFields.A01 = false;
        }
    }
}
