package X;

import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.DJe  reason: case insensitive filesystem */
public final class C26923DJe implements EAC {
    public static final Unsafe A0F = C26267CwC.A03();
    public final C28458E1y A00;
    public final boolean A01;
    public final int[] A02;
    public final Object[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final CB7 A07;
    public final CH9 A08;
    public final EDY A09;
    public final E20 A0A;
    public final CB8 A0B;
    public final int[] A0C;
    public final int[] A0D;
    public final int[] A0E;

    public C26923DJe(CB7 cb7, CH9 ch9, C28458E1y e1y, EDY edy, E20 e20, CB8 cb8, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, Object[] objArr, int i, int i2, int i3, boolean z) {
        this.A02 = iArr;
        this.A03 = objArr;
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A01 = z;
        this.A0C = iArr2;
        this.A0D = iArr3;
        this.A0E = iArr4;
        this.A0A = e20;
        this.A08 = ch9;
        this.A0B = cb8;
        this.A07 = cb7;
        this.A09 = edy;
        this.A00 = e1y;
    }

    private final int A00(int i) {
        int i2;
        int i3 = this.A04;
        if (i >= i3) {
            int i4 = this.A06;
            if (i < i4) {
                i2 = (i - i3) << 2;
                if (this.A02[i2] == i) {
                    return i2;
                }
            } else if (i <= this.A05) {
                int i5 = i4 - i3;
                int[] iArr = this.A02;
                int length = (iArr.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    i2 = i6 << 2;
                    int i7 = iArr[i2];
                    if (i != i7) {
                        if (i < i7) {
                            length = i6 - 1;
                        } else {
                            i5 = i6 + 1;
                        }
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    public static int A03(CQ8 cq8, EAC eac, byte[] bArr, int i, int i2, int i3) {
        C26923DJe dJe = (C26923DJe) eac;
        Object BkH = dJe.BkH();
        int A042 = dJe.A04(cq8, BkH, bArr, i, i2, i3);
        dJe.CTR(BkH);
        cq8.A02 = BkH;
        return A042;
    }

    public static int A01(int i, int i2, int i3) {
        return i3 + (i2 * C23301Bep.A00(i << 3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.CQ8 r6, X.EAC r7, byte[] r8, int r9, int r10) {
        /*
            int r5 = r9 + 1
            r4 = r8
            byte r0 = r8[r9]
            r2 = r6
            if (r0 >= 0) goto L_0x0010
            int r5 = X.C26163Ctc.A04(r6, r8, r0, r5)
            int r0 = r6.A00
            if (r0 < 0) goto L_0x0023
        L_0x0010:
            int r10 = r10 - r5
            if (r0 > r10) goto L_0x0023
            r1 = r7
            java.lang.Object r3 = r7.BkH()
            int r6 = r5 + r0
            r1.CTA(r2, r3, r4, r5, r6)
            r7.CTR(r3)
            r2.A02 = r3
            return r6
        L_0x0023:
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxF r0 = new X.BxF
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26923DJe.A02(X.CQ8, X.EAC, byte[], int, int):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d5, code lost:
        r9 = r5 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e1, code lost:
        r9 = r5 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0115, code lost:
        r8.putObject(r4, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0118, code lost:
        r12 = r12 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0131, code lost:
        r2 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01bf, code lost:
        r8.putObject(r4, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c2, code lost:
        r12 = r12 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ce, code lost:
        r3 = r7.A02;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A04(X.CQ8 r38, java.lang.Object r39, byte[] r40, int r41, int r42, int r43) {
        /*
            r37 = this;
            r9 = r41
            sun.misc.Unsafe r8 = A0F
            r2 = -1
            r13 = 0
            r12 = 0
            r20 = -1
        L_0x0009:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r9
            r10 = r37
            r27 = r42
            r4 = r39
            r21 = r43
            r0 = r27
            if (r9 >= r0) goto L_0x0268
            int r5 = r9 + 1
            r6 = r40
            byte r13 = r40[r9]
            r7 = r38
            if (r13 >= 0) goto L_0x0029
            int r5 = X.C26163Ctc.A04(r7, r6, r13, r5)
            int r13 = r7.A00
        L_0x0029:
            int r18 = r13 >>> 3
            r9 = r13 & 7
            r0 = r18
            int r11 = r10.A00(r0)
            if (r11 == r2) goto L_0x006a
            int[] r3 = r10.A02
            int r0 = r11 + 1
            r17 = r3[r0]
            int r15 = X.BE7.A04(r17)
            r0 = r17 & r19
            long r0 = (long) r0
            r2 = 17
            if (r15 > r2) goto L_0x01d1
            int r2 = r11 + 2
            r14 = r3[r2]
            int r2 = r14 >>> 20
            r16 = 1
            int r16 = r16 << r2
            r14 = r14 & r19
            r2 = r20
            if (r14 == r2) goto L_0x0066
            r2 = -1
            r3 = r20
            if (r3 == r2) goto L_0x005f
            long r2 = (long) r3
            r8.putInt(r4, r2, r12)
        L_0x005f:
            long r2 = (long) r14
            int r12 = r8.getInt(r4, r2)
            r20 = r14
        L_0x0066:
            r2 = 5
            switch(r15) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0095;
                case 2: goto L_0x00a5;
                case 3: goto L_0x00a5;
                case 4: goto L_0x00b9;
                case 5: goto L_0x00c5;
                case 6: goto L_0x00d8;
                case 7: goto L_0x00e4;
                case 8: goto L_0x011c;
                case 9: goto L_0x00fa;
                case 10: goto L_0x01c6;
                case 11: goto L_0x00b9;
                case 12: goto L_0x0143;
                case 13: goto L_0x00d8;
                case 14: goto L_0x00c5;
                case 15: goto L_0x0171;
                case 16: goto L_0x0182;
                case 17: goto L_0x0199;
                default: goto L_0x006a;
            }
        L_0x006a:
            r0 = r21
            if (r13 != r0) goto L_0x0070
            if (r43 != 0) goto L_0x0268
        L_0x0070:
            X.Cmt r1 = X.C26919DJa.A05(r4)
            r0 = r7
            r2 = r6
            r3 = r13
            r4 = r5
            r5 = r27
            int r9 = X.C26163Ctc.A00(r0, r1, r2, r3, r4, r5)
        L_0x007e:
            r2 = -1
            goto L_0x0009
        L_0x0080:
            r2 = 1
            if (r9 != r2) goto L_0x006a
            long r2 = X.BEB.A0G(r6, r5)
            double r25 = java.lang.Double.longBitsToDouble(r2)
            X.CnI r21 = X.C26267CwC.A02
            r22 = r4
            r23 = r0
            r21.A09(r22, r23, r25)
            goto L_0x00d5
        L_0x0095:
            if (r9 != r2) goto L_0x006a
            int r2 = X.BEB.A08(r6, r5)
            float r3 = java.lang.Float.intBitsToFloat(r2)
            X.CnI r2 = X.C26267CwC.A02
            r2.A0A(r4, r0, r3)
            goto L_0x00e1
        L_0x00a5:
            if (r9 != 0) goto L_0x006a
            int r9 = X.C26163Ctc.A02(r7, r6, r5)
            long r2 = r7.A01
            r22 = r4
            r21 = r8
            r23 = r0
            r25 = r2
            r21.putLong(r22, r23, r25)
            goto L_0x0118
        L_0x00b9:
            if (r9 != 0) goto L_0x006a
            int r9 = X.C26163Ctc.A01(r7, r6, r5)
            int r2 = r7.A00
            r8.putInt(r4, r0, r2)
            goto L_0x0118
        L_0x00c5:
            r2 = 1
            if (r9 != r2) goto L_0x006a
            long r25 = X.BEB.A0G(r6, r5)
            r22 = r4
            r21 = r8
            r23 = r0
            r21.putLong(r22, r23, r25)
        L_0x00d5:
            int r9 = r5 + 8
            goto L_0x0118
        L_0x00d8:
            if (r9 != r2) goto L_0x006a
            int r2 = X.BEB.A08(r6, r5)
            r8.putInt(r4, r0, r2)
        L_0x00e1:
            int r9 = r5 + 4
            goto L_0x0118
        L_0x00e4:
            if (r9 != 0) goto L_0x006a
            int r9 = X.C26163Ctc.A02(r7, r6, r5)
            long r2 = r7.A01
            r6 = 0
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1O(r5)
            X.CnI r2 = X.C26267CwC.A02
            r2.A0D(r4, r0, r3)
            goto L_0x0118
        L_0x00fa:
            r2 = 2
            if (r9 != r2) goto L_0x006a
            X.EAC r3 = r10.A0A(r11)
            r2 = r27
            int r9 = A02(r7, r3, r6, r5, r2)
            r2 = r12 & r16
            if (r2 == 0) goto L_0x0131
            java.lang.Object r3 = r8.getObject(r4, r0)
            java.lang.Object r2 = r7.A02
            X.Beh r2 = X.C25461CgE.A00(r3, r2)
        L_0x0115:
            r8.putObject(r4, r0, r2)
        L_0x0118:
            r12 = r12 | r16
            goto L_0x007e
        L_0x011c:
            r2 = 2
            if (r9 != r2) goto L_0x006a
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r17 = r17 & r2
            if (r17 != 0) goto L_0x013e
            int r9 = X.C26163Ctc.A01(r7, r6, r5)
            int r3 = r7.A00
            if (r3 != 0) goto L_0x0134
            java.lang.String r2 = ""
            r7.A02 = r2
        L_0x0131:
            java.lang.Object r2 = r7.A02
            goto L_0x0115
        L_0x0134:
            java.nio.charset.Charset r2 = X.C25461CgE.A00
            java.lang.String r2 = X.BE6.A0r(r2, r6, r9, r3)
            r7.A02 = r2
            int r9 = r9 + r3
            goto L_0x0131
        L_0x013e:
            int r9 = A07(r7, r6, r5)
            goto L_0x0131
        L_0x0143:
            r2 = -1
            if (r9 != 0) goto L_0x006a
            int r9 = X.C26163Ctc.A01(r7, r6, r5)
            int r5 = r7.A00
            java.lang.Object[] r6 = r10.A03
            int r3 = r11 / 4
            int r3 = r3 << 1
            int r3 = r3 + 1
            r3 = r6[r3]
            X.E5N r3 = (X.E5N) r3
            if (r3 == 0) goto L_0x016d
            X.E1x r3 = r3.CTE(r5)
            if (r3 != 0) goto L_0x016d
            X.Cmt r1 = X.C26919DJa.A05(r4)
            java.lang.Long r0 = X.C17880vN.A0n(r5)
            r1.A01(r13, r0)
            goto L_0x0009
        L_0x016d:
            r8.putInt(r4, r0, r5)
            goto L_0x01c2
        L_0x0171:
            r2 = -1
            if (r9 != 0) goto L_0x006a
            int r9 = X.C26163Ctc.A01(r7, r6, r5)
            int r3 = r7.A00
            int r3 = X.BE7.A05(r3)
            r8.putInt(r4, r0, r3)
            goto L_0x01c2
        L_0x0182:
            r2 = -1
            if (r9 != 0) goto L_0x006a
            int r9 = X.C26163Ctc.A02(r7, r6, r5)
            long r5 = r7.A01
            long r25 = X.BEA.A0G(r5)
            r22 = r4
            r21 = r8
            r23 = r0
            r21.putLong(r22, r23, r25)
            goto L_0x01c2
        L_0x0199:
            r2 = 3
            if (r9 != r2) goto L_0x006a
            int r2 = r18 << 3
            r26 = r2 | 4
            X.EAC r22 = r10.A0A(r11)
            r2 = -1
            r21 = r7
            r23 = r6
            r24 = r5
            r25 = r27
            int r9 = A03(r21, r22, r23, r24, r25, r26)
            r3 = r12 & r16
            if (r3 == 0) goto L_0x01ce
            java.lang.Object r5 = r8.getObject(r4, r0)
            java.lang.Object r3 = r7.A02
            X.Beh r3 = X.C25461CgE.A00(r5, r3)
        L_0x01bf:
            r8.putObject(r4, r0, r3)
        L_0x01c2:
            r12 = r12 | r16
            goto L_0x0009
        L_0x01c6:
            r3 = 2
            r2 = -1
            if (r9 != r3) goto L_0x006a
            int r9 = X.C26163Ctc.A03(r7, r6, r5)
        L_0x01ce:
            java.lang.Object r3 = r7.A02
            goto L_0x01bf
        L_0x01d1:
            r2 = 27
            if (r15 != r2) goto L_0x0212
            r2 = 2
            if (r9 != r2) goto L_0x006a
            java.lang.Object r2 = r8.getObject(r4, r0)
            X.EE7 r2 = (X.EE7) r2
            r3 = r2
            X.DbL r3 = (X.C27292DbL) r3
            boolean r3 = r3.A00
            if (r3 != 0) goto L_0x01f0
            int r3 = X.BEA.A0C(r2)
            X.EE7 r2 = r2.CTh(r3)
            r8.putObject(r4, r0, r2)
        L_0x01f0:
            X.EAC r3 = r10.A0A(r11)
            r0 = r27
            int r9 = A02(r7, r3, r6, r5, r0)
        L_0x01fa:
            java.lang.Object r0 = r7.A02
            r2.add(r0)
            r0 = r27
            if (r9 >= r0) goto L_0x007e
            int r1 = X.C26163Ctc.A01(r7, r6, r9)
            int r0 = r7.A00
            if (r13 != r0) goto L_0x007e
            r0 = r27
            int r9 = A02(r7, r3, r6, r1, r0)
            goto L_0x01fa
        L_0x0212:
            r2 = 49
            if (r15 > r2) goto L_0x023a
            r2 = r17
            long r2 = (long) r2
            r23 = r7
            r24 = r4
            r25 = r6
            r30 = r9
            r31 = r11
            r32 = r15
            r33 = r2
            r35 = r0
            r22 = r10
            r26 = r5
            r28 = r13
            r29 = r18
            int r9 = r22.A06(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)
        L_0x0235:
            if (r9 != r5) goto L_0x007e
            r5 = r9
            goto L_0x006a
        L_0x023a:
            r2 = 50
            if (r15 != r2) goto L_0x024b
            r2 = 2
            if (r9 != r2) goto L_0x006a
            r8.getObject(r4, r0)
            java.lang.String r0 = "isMutable"
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0s(r0)
            throw r1
        L_0x024b:
            r23 = r7
            r24 = r4
            r25 = r6
            r30 = r9
            r31 = r17
            r32 = r15
            r33 = r11
            r34 = r0
            r22 = r10
            r26 = r5
            r28 = r13
            r29 = r18
            int r9 = r22.A05(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0235
        L_0x0268:
            r1 = -1
            r0 = r20
            if (r0 == r1) goto L_0x0271
            long r0 = (long) r0
            r8.putInt(r4, r0, r12)
        L_0x0271:
            int[] r6 = r10.A0D
            if (r6 == 0) goto L_0x029f
            int r3 = r6.length
            r2 = 0
        L_0x0277:
            if (r2 >= r3) goto L_0x029f
            r7 = r6[r2]
            int[] r1 = r10.A02
            int r0 = r7 + 1
            r0 = r1[r0]
            r0 = r0 & r19
            long r0 = (long) r0
            java.lang.Object r0 = X.C26267CwC.A01(r4, r0)
            if (r0 == 0) goto L_0x029c
            java.lang.Object[] r1 = r10.A03
            int r0 = r7 / 4
            int r0 = r0 << 1
            int r0 = r0 + 1
            r0 = r1[r0]
            if (r0 == 0) goto L_0x029c
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        L_0x029c:
            int r2 = r2 + 1
            goto L_0x0277
        L_0x029f:
            r0 = r27
            if (r43 != 0) goto L_0x02a6
            if (r5 != r0) goto L_0x02ad
            return r5
        L_0x02a6:
            if (r5 > r0) goto L_0x02ad
            r0 = r21
            if (r13 != r0) goto L_0x02ad
            return r5
        L_0x02ad:
            java.lang.String r0 = "Failed to parse the message."
            X.BxF r1 = new X.BxF
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26923DJe.A04(X.CQ8, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        r7.putObject(r10, r0, r4);
        r8 = r26 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        r7.putObject(r10, r0, r4);
        r8 = r26 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e4, code lost:
        r7.putObject(r10, r0, r5);
        r8 = r8 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0125, code lost:
        r5 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0136, code lost:
        r5 = java.lang.Long.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0156, code lost:
        if (r7.getInt(r10, r2) != r15) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0158, code lost:
        r4 = r7.getObject(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015c, code lost:
        r5 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015e, code lost:
        if (r4 == null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0160, code lost:
        r5 = X.C25461CgE.A00(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0164, code lost:
        r7.putObject(r10, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0167, code lost:
        r7.putInt(r10, r2, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016a, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016b, code lost:
        r4 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A05(X.CQ8 r23, java.lang.Object r24, byte[] r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, long r34) {
        /*
            r22 = this;
            r8 = r26
            sun.misc.Unsafe r7 = A0F
            r6 = r22
            int[] r0 = r6.A02
            r12 = r33
            long r2 = X.BE9.A0O(r0, r12)
            r5 = 5
            r4 = 2
            r11 = r23
            r9 = r25
            r16 = r27
            r14 = r28
            r15 = r29
            r13 = r30
            r0 = r34
            r10 = r24
            switch(r32) {
                case 51: goto L_0x0024;
                case 52: goto L_0x0034;
                case 53: goto L_0x0043;
                case 54: goto L_0x0043;
                case 55: goto L_0x004d;
                case 56: goto L_0x0057;
                case 57: goto L_0x0069;
                case 58: goto L_0x007a;
                case 59: goto L_0x0090;
                case 60: goto L_0x00b6;
                case 61: goto L_0x00c4;
                case 62: goto L_0x004d;
                case 63: goto L_0x00e9;
                case 64: goto L_0x0069;
                case 65: goto L_0x0057;
                case 66: goto L_0x0119;
                case 67: goto L_0x012a;
                case 68: goto L_0x013b;
                default: goto L_0x0023;
            }
        L_0x0023:
            return r8
        L_0x0024:
            r4 = 1
            if (r13 != r4) goto L_0x0023
            long r4 = X.BEB.A0G(r9, r8)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            goto L_0x0062
        L_0x0034:
            if (r13 != r5) goto L_0x0023
            int r4 = X.BEB.A08(r9, r8)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x0073
        L_0x0043:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C26163Ctc.A02(r11, r9, r8)
            long r4 = r11.A01
            goto L_0x0136
        L_0x004d:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C26163Ctc.A01(r11, r9, r8)
            int r4 = r11.A00
            goto L_0x0125
        L_0x0057:
            r4 = 1
            if (r13 != r4) goto L_0x0023
            long r4 = X.BEB.A0G(r9, r8)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L_0x0062:
            r7.putObject(r10, r0, r4)
            int r8 = r26 + 8
            goto L_0x0167
        L_0x0069:
            if (r13 != r5) goto L_0x0023
            int r4 = X.BEB.A08(r9, r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0073:
            r7.putObject(r10, r0, r4)
            int r8 = r26 + 4
            goto L_0x0167
        L_0x007a:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C26163Ctc.A02(r11, r9, r8)
            long r4 = r11.A01
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1O(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            goto L_0x0164
        L_0x0090:
            if (r13 != r4) goto L_0x0023
            int r8 = X.C26163Ctc.A01(r11, r9, r8)
            int r6 = r11.A00
            if (r6 != 0) goto L_0x009e
            java.lang.String r5 = ""
            goto L_0x0164
        L_0x009e:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r31 = r31 & r4
            if (r31 == 0) goto L_0x00de
            int r5 = r8 + r6
            X.C6G r4 = X.C25908CoM.A00
            int r4 = r4.A01(r9, r8, r5)
            if (r4 == 0) goto L_0x00de
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.BxF r0 = new X.BxF
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            if (r13 != r4) goto L_0x0023
            X.EAC r5 = r6.A0A(r12)
            r4 = r16
            int r8 = A02(r11, r5, r9, r8, r4)
            goto L_0x0152
        L_0x00c4:
            if (r13 != r4) goto L_0x0023
            int r8 = X.C26163Ctc.A01(r11, r9, r8)
            int r6 = r11.A00
            if (r6 != 0) goto L_0x00d2
            X.DSP r5 = X.DSP.A00
            goto L_0x0164
        L_0x00d2:
            X.E5M r4 = X.DSP.A01
            byte[] r4 = r4.CTT(r9, r8, r6)
            X.Ber r5 = new X.Ber
            r5.<init>(r4)
            goto L_0x00e4
        L_0x00de:
            java.nio.charset.Charset r4 = X.C25461CgE.A00
            java.lang.String r5 = X.BE6.A0r(r4, r9, r8, r6)
        L_0x00e4:
            r7.putObject(r10, r0, r5)
            int r8 = r8 + r6
            goto L_0x0167
        L_0x00e9:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C26163Ctc.A01(r11, r9, r8)
            int r5 = r11.A00
            java.lang.Object[] r6 = r6.A03
            int r4 = r33 / 4
            int r4 = r4 << 1
            int r4 = r4 + 1
            r4 = r6[r4]
            X.E5N r4 = (X.E5N) r4
            if (r4 == 0) goto L_0x0111
            X.E1x r4 = r4.CTE(r5)
            if (r4 != 0) goto L_0x0111
            X.Cmt r1 = X.C26919DJa.A05(r10)
            java.lang.Long r0 = X.C17880vN.A0n(r5)
            r1.A01(r14, r0)
            return r8
        L_0x0111:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r7.putObject(r10, r0, r4)
            goto L_0x0167
        L_0x0119:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C26163Ctc.A01(r11, r9, r8)
            int r4 = r11.A00
            int r4 = X.BE7.A05(r4)
        L_0x0125:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            goto L_0x0164
        L_0x012a:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C26163Ctc.A02(r11, r9, r8)
            long r4 = r11.A01
            long r4 = X.BEA.A0G(r4)
        L_0x0136:
            java.lang.Long r5 = java.lang.Long.valueOf(r4)
            goto L_0x0164
        L_0x013b:
            r4 = 3
            if (r13 != r4) goto L_0x0023
            r4 = r28 & -8
            r21 = r4 | 4
            X.EAC r17 = r6.A0A(r12)
            r20 = r16
            r18 = r9
            r19 = r8
            r16 = r11
            int r8 = A03(r16, r17, r18, r19, r20, r21)
        L_0x0152:
            int r4 = r7.getInt(r10, r2)
            if (r4 != r15) goto L_0x016b
            java.lang.Object r4 = r7.getObject(r10, r0)
        L_0x015c:
            java.lang.Object r5 = r11.A02
            if (r4 == 0) goto L_0x0164
            X.Beh r5 = X.C25461CgE.A00(r4, r5)
        L_0x0164:
            r7.putObject(r10, r0, r5)
        L_0x0167:
            r7.putInt(r10, r2, r15)
            return r8
        L_0x016b:
            r4 = 0
            goto L_0x015c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26923DJe.A05(X.CQ8, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02ba, code lost:
        if (r27 != 0) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02bc, code lost:
        X.C26163Ctc.A01(r13, r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02c5, code lost:
        throw X.AnonymousClass000.A0s("zzac");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A06(X.CQ8 r20, java.lang.Object r21, byte[] r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, long r30, long r32) {
        /*
            r19 = this;
            r7 = r21
            r4 = r23
            sun.misc.Unsafe r8 = A0F
            r0 = r32
            java.lang.Object r3 = r8.getObject(r7, r0)
            X.EE7 r3 = (X.EE7) r3
            r2 = r3
            X.DbL r2 = (X.C27292DbL) r2
            boolean r5 = r2.A00
            r2 = 1
            if (r5 != 0) goto L_0x0027
            int r6 = r3.size()
            int r5 = r6 << r2
            if (r6 != 0) goto L_0x0020
            r5 = 10
        L_0x0020:
            X.EE7 r3 = r3.CTh(r5)
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
                case 18: goto L_0x0276;
                case 19: goto L_0x025b;
                case 20: goto L_0x023a;
                case 21: goto L_0x023a;
                case 22: goto L_0x029b;
                case 23: goto L_0x003c;
                case 24: goto L_0x021f;
                case 25: goto L_0x01fe;
                case 26: goto L_0x01a1;
                case 27: goto L_0x0183;
                case 28: goto L_0x0155;
                case 29: goto L_0x029b;
                case 30: goto L_0x0057;
                case 31: goto L_0x021f;
                case 32: goto L_0x003c;
                case 33: goto L_0x0134;
                case 34: goto L_0x0113;
                case 35: goto L_0x0276;
                case 36: goto L_0x025b;
                case 37: goto L_0x023a;
                case 38: goto L_0x023a;
                case 39: goto L_0x029b;
                case 40: goto L_0x003c;
                case 41: goto L_0x021f;
                case 42: goto L_0x01fe;
                case 43: goto L_0x029b;
                case 44: goto L_0x0057;
                case 45: goto L_0x021f;
                case 46: goto L_0x003c;
                case 47: goto L_0x0134;
                case 48: goto L_0x0113;
                case 49: goto L_0x00f0;
                default: goto L_0x003c;
            }
        L_0x003c:
            if (r9 != r1) goto L_0x004e
            int r4 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x0288
            java.lang.String r0 = "zzm"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x004e:
            if (r9 != r2) goto L_0x02d3
            java.lang.String r0 = "zzm"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0057:
            if (r9 != r1) goto L_0x02ba
            int r4 = X.C26163Ctc.A01(r13, r15, r4)
            int r1 = r13.A00
            int r1 = r1 + r4
            if (r4 >= r1) goto L_0x006c
            X.C26163Ctc.A01(r13, r15, r4)
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0s(r0)
            throw r1
        L_0x006c:
            if (r4 != r1) goto L_0x00e8
            X.Beh r7 = (X.C23293Beh) r7
            X.Cmt r6 = r7.zzjp
            X.Cmt r1 = X.C25839Cmt.A05
            if (r6 != r1) goto L_0x0077
            r6 = 0
        L_0x0077:
            java.lang.Object[] r1 = r0.A03
            int r0 = r28 / 4
            int r0 = r0 << 1
            int r0 = r0 + 1
            r8 = r1[r0]
            X.E5N r8 = (X.E5N) r8
            java.lang.Class r0 = X.C26297CxA.A03
            if (r8 == 0) goto L_0x02cf
            boolean r0 = r3 instanceof java.util.RandomAccess
            if (r0 == 0) goto L_0x00bf
            int r10 = r3.size()
            r9 = 0
            r5 = 0
        L_0x0091:
            if (r9 >= r10) goto L_0x02c6
            java.lang.Object r2 = r3.get(r9)
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            X.E1x r0 = r8.CTE(r1)
            if (r0 == 0) goto L_0x00ad
            if (r9 == r5) goto L_0x00a8
            r3.set(r5, r2)
        L_0x00a8:
            int r5 = r5 + 1
        L_0x00aa:
            int r9 = r9 + 1
            goto L_0x0091
        L_0x00ad:
            if (r6 != 0) goto L_0x00b4
            X.Cmt r6 = new X.Cmt
            r6.<init>()
        L_0x00b4:
            long r0 = (long) r1
            int r2 = r26 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A01(r2, r0)
            goto L_0x00aa
        L_0x00bf:
            java.util.Iterator r5 = r3.iterator()
        L_0x00c3:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x02cf
            int r1 = X.C72453Mb.A0H(r5)
            X.E1x r0 = r8.CTE(r1)
            if (r0 != 0) goto L_0x00c3
            if (r6 != 0) goto L_0x00da
            X.Cmt r6 = new X.Cmt
            r6.<init>()
        L_0x00da:
            long r2 = (long) r1
            int r1 = r26 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A01(r1, r0)
            r5.remove()
            goto L_0x00c3
        L_0x00e8:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxF r1 = new X.BxF
            r1.<init>(r0)
            throw r1
        L_0x00f0:
            r1 = 3
            if (r9 != r1) goto L_0x02d3
            X.EAC r14 = r0.A0A(r10)
            r0 = r25 & -8
            r18 = r0 | 4
            r16 = r4
        L_0x00fd:
            r17 = r6
            int r4 = A03(r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r13.A02
            r3.add(r0)
            if (r4 >= r6) goto L_0x02d3
            int r16 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02d3
            goto L_0x00fd
        L_0x0113:
            if (r9 != r1) goto L_0x0128
            int r4 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x0288
            X.C26163Ctc.A02(r13, r15, r4)
            java.lang.String r0 = "zzm"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0128:
            if (r27 != 0) goto L_0x02d3
            X.C26163Ctc.A02(r13, r15, r4)
            java.lang.String r0 = "zzm"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0134:
            if (r9 != r1) goto L_0x0149
            int r4 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x0288
            X.C26163Ctc.A01(r13, r15, r4)
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0149:
            if (r27 != 0) goto L_0x02d3
            X.C26163Ctc.A01(r13, r15, r4)
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0155:
            if (r9 != r1) goto L_0x02d3
            int r4 = X.C26163Ctc.A01(r13, r15, r4)
        L_0x015b:
            int r2 = r13.A00
            if (r2 != 0) goto L_0x0173
            X.DSP r0 = X.DSP.A00
            r3.add(r0)
        L_0x0164:
            if (r4 >= r6) goto L_0x02d3
            int r1 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02d3
            int r4 = X.C26163Ctc.A01(r13, r15, r1)
            goto L_0x015b
        L_0x0173:
            X.E5M r0 = X.DSP.A01
            byte[] r1 = r0.CTT(r15, r4, r2)
            X.Ber r0 = new X.Ber
            r0.<init>(r1)
            r3.add(r0)
            int r4 = r4 + r2
            goto L_0x0164
        L_0x0183:
            if (r9 != r1) goto L_0x02d3
            X.EAC r2 = r0.A0A(r10)
            int r4 = A02(r13, r2, r15, r4, r6)
        L_0x018d:
            java.lang.Object r0 = r13.A02
            r3.add(r0)
            if (r4 >= r6) goto L_0x02d3
            int r1 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02d3
            int r4 = A02(r13, r2, r15, r1, r6)
            goto L_0x018d
        L_0x01a1:
            if (r9 != r1) goto L_0x02d3
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r30 = r30 & r0
            java.lang.String r7 = ""
            int r0 = (r30 > r11 ? 1 : (r30 == r11 ? 0 : -1))
            int r4 = X.C26163Ctc.A01(r13, r15, r4)
            if (r0 != 0) goto L_0x01cf
        L_0x01b2:
            int r1 = r13.A00
            if (r1 != 0) goto L_0x01c8
            r3.add(r7)
        L_0x01b9:
            if (r4 >= r6) goto L_0x02d3
            int r1 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02d3
            int r4 = X.C26163Ctc.A01(r13, r15, r1)
            goto L_0x01b2
        L_0x01c8:
            java.nio.charset.Charset r0 = X.C25461CgE.A00
            X.BE8.A1H(r0, r3, r15, r4, r1)
            int r4 = r4 + r1
            goto L_0x01b9
        L_0x01cf:
            int r2 = r13.A00
            if (r2 != 0) goto L_0x01e5
            r3.add(r7)
        L_0x01d6:
            if (r4 >= r6) goto L_0x02d3
            int r1 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            if (r5 != r0) goto L_0x02d3
            int r4 = X.C26163Ctc.A01(r13, r15, r1)
            goto L_0x01cf
        L_0x01e5:
            int r1 = r4 + r2
            X.C6G r0 = X.C25908CoM.A00
            int r0 = r0.A01(r15, r4, r1)
            if (r0 != 0) goto L_0x01f6
            java.nio.charset.Charset r0 = X.C25461CgE.A00
            X.BE8.A1H(r0, r3, r15, r4, r2)
            int r4 = r4 + r2
            goto L_0x01d6
        L_0x01f6:
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.BxF r0 = new X.BxF
            r0.<init>(r1)
            throw r0
        L_0x01fe:
            if (r9 != r1) goto L_0x0213
            int r4 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x0288
            X.C26163Ctc.A02(r13, r15, r4)
            java.lang.String r0 = "addBoolean"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0213:
            if (r27 != 0) goto L_0x02d3
            X.C26163Ctc.A02(r13, r15, r4)
            java.lang.String r0 = "addBoolean"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x021f:
            if (r9 != r1) goto L_0x0231
            int r4 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x0288
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0231:
            if (r9 != r8) goto L_0x02d3
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x023a:
            if (r9 != r1) goto L_0x024f
            int r4 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x0288
            X.C26163Ctc.A02(r13, r15, r4)
            java.lang.String r0 = "zzm"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x024f:
            if (r27 != 0) goto L_0x02d3
            X.C26163Ctc.A02(r13, r15, r4)
            java.lang.String r0 = "zzm"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x025b:
            if (r9 != r1) goto L_0x026d
            int r4 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x0288
            java.lang.String r0 = "zzc"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x026d:
            if (r9 != r8) goto L_0x02d3
            java.lang.String r0 = "zzc"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0276:
            if (r9 != r1) goto L_0x0292
            int r4 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x0288
            java.lang.String r0 = "zzc"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0288:
            if (r4 == r0) goto L_0x02d3
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxF r0 = new X.BxF
            r0.<init>(r1)
            throw r0
        L_0x0292:
            if (r9 != r2) goto L_0x02d3
            java.lang.String r0 = "zzc"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x029b:
            if (r9 != r1) goto L_0x02ba
            int r4 = X.C26163Ctc.A01(r13, r15, r4)
            int r0 = r13.A00
            int r0 = r0 + r4
            if (r4 >= r0) goto L_0x02b0
            X.C26163Ctc.A01(r13, r15, r4)
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0s(r0)
            throw r1
        L_0x02b0:
            if (r4 == r0) goto L_0x02d3
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxF r1 = new X.BxF
            r1.<init>(r0)
            throw r1
        L_0x02ba:
            if (r27 != 0) goto L_0x02d3
            X.C26163Ctc.A01(r13, r15, r4)
            java.lang.String r0 = "zzac"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x02c6:
            if (r5 == r10) goto L_0x02cf
            java.util.List r0 = r3.subList(r5, r10)
            r0.clear()
        L_0x02cf:
            if (r6 == 0) goto L_0x02d3
            r7.zzjp = r6
        L_0x02d3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26923DJe.A06(X.CQ8, java.lang.Object, byte[], int, int, int, int, int, int, int, long, long):int");
    }

    public static int A08(Object obj) {
        Class cls = C26297CxA.A03;
        return ((List) obj).size();
    }

    private final EAC A0A(int i) {
        int i2 = (i / 4) << 1;
        Object[] objArr = this.A03;
        EAC eac = (EAC) objArr[i2];
        if (eac != null) {
            return eac;
        }
        EAC A002 = C25659Cjp.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = A002;
        return A002;
    }

    public static void A0C(E5P e5p, Object obj, int i) {
        if (obj instanceof String) {
            ((C26925DJg) e5p).A00.A08(i, (String) obj);
            return;
        }
        ((C26925DJg) e5p).A00.A0B((DSP) obj, i);
    }

    private final boolean A0D(Object obj, int i) {
        boolean z = this.A01;
        int[] iArr = this.A02;
        if (z) {
            int i2 = iArr[i + 1];
            long j = (long) (i2 & 1048575);
            switch (BE7.A04(i2)) {
                case 0:
                    if (C26267CwC.A02.A02(obj, j) != 0.0d) {
                        return true;
                    }
                    break;
                case 1:
                    if (C26267CwC.A02.A03(obj, j) != 0.0f) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C26267CwC.A02.A05(obj, j) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (C26267CwC.A02.A04(obj, j) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return C26267CwC.A02.A0F(obj, j);
                case 8:
                    Object A012 = C26267CwC.A01(obj, j);
                    if (A012 instanceof String) {
                        if (!((String) A012).isEmpty()) {
                            return true;
                        }
                    } else if (!(A012 instanceof DSP)) {
                        throw BE6.A0j();
                    } else if (!DSP.A00.equals(A012)) {
                        return true;
                    }
                    break;
                case 9:
                case 17:
                    if (C26267CwC.A01(obj, j) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!DSP.A00.equals(C26267CwC.A01(obj, j))) {
                        return true;
                    }
                    break;
                default:
                    throw BE6.A0j();
            }
        } else {
            int i3 = iArr[i + 2];
            if ((C26267CwC.A02.A04(obj, (long) (i3 & 1048575)) & (1 << (i3 >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0E(Object obj, int i, int i2) {
        return AnonymousClass000.A1T(C26267CwC.A02.A04(obj, BE9.A0O(this.A02, i2)), i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r3 == r0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean BKS(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r7 = r10.A02
            int r6 = r7.length
            r9 = 0
            r5 = 0
        L_0x0005:
            if (r5 >= r6) goto L_0x0079
            int r0 = r5 + 1
            r4 = r7[r0]
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r4 & r3
            long r1 = (long) r0
            int r0 = X.BE7.A04(r4)
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0030;
                case 2: goto L_0x0089;
                case 3: goto L_0x0089;
                case 4: goto L_0x0030;
                case 5: goto L_0x0089;
                case 6: goto L_0x0030;
                case 7: goto L_0x001b;
                case 8: goto L_0x0047;
                case 9: goto L_0x0047;
                case 10: goto L_0x0047;
                case 11: goto L_0x0030;
                case 12: goto L_0x0030;
                case 13: goto L_0x0030;
                case 14: goto L_0x0089;
                case 15: goto L_0x0030;
                case 16: goto L_0x0089;
                case 17: goto L_0x0047;
                case 18: goto L_0x0064;
                case 19: goto L_0x0064;
                case 20: goto L_0x0064;
                case 21: goto L_0x0064;
                case 22: goto L_0x0064;
                case 23: goto L_0x0064;
                case 24: goto L_0x0064;
                case 25: goto L_0x0064;
                case 26: goto L_0x0064;
                case 27: goto L_0x0064;
                case 28: goto L_0x0064;
                case 29: goto L_0x0064;
                case 30: goto L_0x0064;
                case 31: goto L_0x0064;
                case 32: goto L_0x0064;
                case 33: goto L_0x0064;
                case 34: goto L_0x0064;
                case 35: goto L_0x0064;
                case 36: goto L_0x0064;
                case 37: goto L_0x0064;
                case 38: goto L_0x0064;
                case 39: goto L_0x0064;
                case 40: goto L_0x0064;
                case 41: goto L_0x0064;
                case 42: goto L_0x0064;
                case 43: goto L_0x0064;
                case 44: goto L_0x0064;
                case 45: goto L_0x0064;
                case 46: goto L_0x0064;
                case 47: goto L_0x0064;
                case 48: goto L_0x0064;
                case 49: goto L_0x0064;
                case 50: goto L_0x0064;
                case 51: goto L_0x0052;
                case 52: goto L_0x0052;
                case 53: goto L_0x0052;
                case 54: goto L_0x0052;
                case 55: goto L_0x0052;
                case 56: goto L_0x0052;
                case 57: goto L_0x0052;
                case 58: goto L_0x0052;
                case 59: goto L_0x0052;
                case 60: goto L_0x0052;
                case 61: goto L_0x0052;
                case 62: goto L_0x0052;
                case 63: goto L_0x0052;
                case 64: goto L_0x0052;
                case 65: goto L_0x0052;
                case 66: goto L_0x0052;
                case 67: goto L_0x0052;
                case 68: goto L_0x0052;
                default: goto L_0x0018;
            }
        L_0x0018:
            int r5 = r5 + 4
            goto L_0x0005
        L_0x001b:
            boolean r3 = r10.A0D(r11, r5)
            boolean r0 = r10.A0D(r12, r5)
            if (r3 != r0) goto L_0x00a1
            X.CnI r0 = X.C26267CwC.A02
            boolean r3 = r0.A0F(r11, r1)
            boolean r0 = r0.A0F(r12, r1)
            goto L_0x0044
        L_0x0030:
            boolean r3 = r10.A0D(r11, r5)
            boolean r0 = r10.A0D(r12, r5)
            if (r3 != r0) goto L_0x00a1
            X.CnI r0 = X.C26267CwC.A02
            int r3 = r0.A04(r11, r1)
            int r0 = r0.A04(r12, r1)
        L_0x0044:
            if (r3 == r0) goto L_0x0018
            return r9
        L_0x0047:
            boolean r3 = r10.A0D(r11, r5)
            boolean r0 = r10.A0D(r12, r5)
            if (r3 != r0) goto L_0x00a1
            goto L_0x0064
        L_0x0052:
            int r0 = r5 + 2
            r0 = r7[r0]
            r0 = r0 & r3
            long r3 = (long) r0
            X.CnI r0 = X.C26267CwC.A02
            int r8 = r0.A04(r11, r3)
            int r0 = r0.A04(r12, r3)
            if (r8 != r0) goto L_0x00a1
        L_0x0064:
            java.lang.Object r3 = X.C26267CwC.A01(r11, r1)
            java.lang.Object r1 = X.C26267CwC.A01(r12, r1)
            java.lang.Class r0 = X.C26297CxA.A03
            if (r3 == r1) goto L_0x0018
            if (r3 == 0) goto L_0x00a1
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x00a1
            goto L_0x0018
        L_0x0079:
            X.Beh r11 = (X.C23293Beh) r11
            X.Cmt r1 = r11.zzjp
            X.Beh r12 = (X.C23293Beh) r12
            X.Cmt r0 = r12.zzjp
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a1
            r0 = 1
            return r0
        L_0x0089:
            boolean r3 = r10.A0D(r11, r5)
            boolean r0 = r10.A0D(r12, r5)
            if (r3 != r0) goto L_0x00a1
            X.CnI r0 = X.C26267CwC.A02
            long r3 = r0.A05(r11, r1)
            long r1 = r0.A05(r12, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0018
        L_0x00a1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26923DJe.BKS(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r1 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r0 = java.lang.Float.floatToIntBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        r0 = X.C25461CgE.A04;
        r0 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        if (r1 == false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        r0 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cb, code lost:
        r3 = r3 * 53;
        r0 = ((java.lang.String) X.C26267CwC.A01(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0108, code lost:
        r3 = r3 * 53;
        r0 = X.AnonymousClass000.A0M(X.C26267CwC.A01(r10, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0119, code lost:
        r3 = r3 * 53;
        r1 = A09(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011f, code lost:
        r0 = X.C25461CgE.A04;
        r0 = X.AnonymousClass000.A0I(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012c, code lost:
        r3 = r3 * 53;
        r0 = X.C26267CwC.A01(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0136, code lost:
        r3 = r3 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Bcu(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r6 = r9.A02
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L_0x0005:
            if (r4 >= r5) goto L_0x0139
            int r0 = r4 + 1
            r7 = r6[r0]
            r8 = r6[r4]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r1 = (long) r0
            int r0 = X.BE7.A04(r7)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0027;
                case 2: goto L_0x0030;
                case 3: goto L_0x0030;
                case 4: goto L_0x003a;
                case 5: goto L_0x0030;
                case 6: goto L_0x003a;
                case 7: goto L_0x0044;
                case 8: goto L_0x00cb;
                case 9: goto L_0x004d;
                case 10: goto L_0x012c;
                case 11: goto L_0x003a;
                case 12: goto L_0x003a;
                case 13: goto L_0x003a;
                case 14: goto L_0x0030;
                case 15: goto L_0x003a;
                case 16: goto L_0x0030;
                case 17: goto L_0x004d;
                case 18: goto L_0x012c;
                case 19: goto L_0x012c;
                case 20: goto L_0x012c;
                case 21: goto L_0x012c;
                case 22: goto L_0x012c;
                case 23: goto L_0x012c;
                case 24: goto L_0x012c;
                case 25: goto L_0x012c;
                case 26: goto L_0x012c;
                case 27: goto L_0x012c;
                case 28: goto L_0x012c;
                case 29: goto L_0x012c;
                case 30: goto L_0x012c;
                case 31: goto L_0x012c;
                case 32: goto L_0x012c;
                case 33: goto L_0x012c;
                case 34: goto L_0x012c;
                case 35: goto L_0x012c;
                case 36: goto L_0x012c;
                case 37: goto L_0x012c;
                case 38: goto L_0x012c;
                case 39: goto L_0x012c;
                case 40: goto L_0x012c;
                case 41: goto L_0x012c;
                case 42: goto L_0x012c;
                case 43: goto L_0x012c;
                case 44: goto L_0x012c;
                case 45: goto L_0x012c;
                case 46: goto L_0x012c;
                case 47: goto L_0x012c;
                case 48: goto L_0x012c;
                case 49: goto L_0x012c;
                case 50: goto L_0x012c;
                case 51: goto L_0x005b;
                case 52: goto L_0x0071;
                case 53: goto L_0x0087;
                case 54: goto L_0x008f;
                case 55: goto L_0x0097;
                case 56: goto L_0x009e;
                case 57: goto L_0x00a5;
                case 58: goto L_0x00ac;
                case 59: goto L_0x00c5;
                case 60: goto L_0x00d8;
                case 61: goto L_0x00df;
                case 62: goto L_0x00e6;
                case 63: goto L_0x00ed;
                case 64: goto L_0x00f4;
                case 65: goto L_0x00fb;
                case 66: goto L_0x0102;
                case 67: goto L_0x0113;
                case 68: goto L_0x0126;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r4 = r4 + 4
            goto L_0x0005
        L_0x001e:
            int r3 = r3 * 53
            X.CnI r0 = X.C26267CwC.A02
            double r0 = r0.A02(r10, r1)
            goto L_0x006b
        L_0x0027:
            int r3 = r3 * 53
            X.CnI r0 = X.C26267CwC.A02
            float r0 = r0.A03(r10, r1)
            goto L_0x0081
        L_0x0030:
            int r3 = r3 * 53
            X.CnI r0 = X.C26267CwC.A02
            long r1 = r0.A05(r10, r1)
            goto L_0x011f
        L_0x003a:
            int r3 = r3 * 53
            X.CnI r0 = X.C26267CwC.A02
            int r0 = r0.A04(r10, r1)
            goto L_0x0136
        L_0x0044:
            int r3 = r3 * 53
            X.CnI r0 = X.C26267CwC.A02
            boolean r1 = r0.A0F(r10, r1)
            goto L_0x00bc
        L_0x004d:
            java.lang.Object r0 = X.C26267CwC.A01(r10, r1)
            if (r0 == 0) goto L_0x0057
            int r7 = r0.hashCode()
        L_0x0057:
            int r3 = r3 * 53
            int r3 = r3 + r7
            goto L_0x001b
        L_0x005b:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            int r3 = r3 * 53
            java.lang.Object r0 = X.C26267CwC.A01(r10, r1)
            double r0 = X.AnonymousClass8BR.A00(r0)
        L_0x006b:
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x011f
        L_0x0071:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            int r3 = r3 * 53
            java.lang.Object r0 = X.C26267CwC.A01(r10, r1)
            float r0 = X.AnonymousClass000.A04(r0)
        L_0x0081:
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0136
        L_0x0087:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0119
        L_0x008f:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0119
        L_0x0097:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0108
        L_0x009e:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0119
        L_0x00a5:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0108
        L_0x00ac:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            int r3 = r3 * 53
            java.lang.Object r0 = X.C26267CwC.A01(r10, r1)
            boolean r1 = X.AnonymousClass000.A1Y(r0)
        L_0x00bc:
            java.nio.charset.Charset r0 = X.C25461CgE.A04
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0136
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L_0x0136
        L_0x00c5:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
        L_0x00cb:
            int r3 = r3 * 53
            java.lang.Object r0 = X.C26267CwC.A01(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x0136
        L_0x00d8:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x012c
        L_0x00df:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x012c
        L_0x00e6:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0108
        L_0x00ed:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0108
        L_0x00f4:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0108
        L_0x00fb:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0119
        L_0x0102:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
        L_0x0108:
            int r3 = r3 * 53
            java.lang.Object r0 = X.C26267CwC.A01(r10, r1)
            int r0 = X.AnonymousClass000.A0M(r0)
            goto L_0x0136
        L_0x0113:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
        L_0x0119:
            int r3 = r3 * 53
            long r1 = A09(r10, r1)
        L_0x011f:
            java.nio.charset.Charset r0 = X.C25461CgE.A04
            int r0 = X.AnonymousClass000.A0I(r1)
            goto L_0x0136
        L_0x0126:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
        L_0x012c:
            int r3 = r3 * 53
            java.lang.Object r0 = X.C26267CwC.A01(r10, r1)
            int r0 = r0.hashCode()
        L_0x0136:
            int r3 = r3 + r0
            goto L_0x001b
        L_0x0139:
            int r1 = r3 * 53
            X.Beh r10 = (X.C23293Beh) r10
            X.Cmt r0 = r10.zzjp
            int r0 = X.AnonymousClass000.A0O(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26923DJe.Bcu(java.lang.Object):int");
    }

    public final Object BkH() {
        return ((C23293Beh) this.A09).A04(4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02d6, code lost:
        ((X.C26925DJg) r6).A00.A07(r7, java.lang.Double.doubleToRawLongBits(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02f5, code lost:
        ((X.C26925DJg) r6).A00.A06(r7, java.lang.Float.floatToRawIntBits(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0310, code lost:
        X.C26164Ctd.A06(((X.C26925DJg) r6).A00, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0327, code lost:
        X.C26164Ctd.A06(((X.C26925DJg) r6).A00, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0342, code lost:
        ((X.C26925DJg) r6).A00.A05(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0359, code lost:
        ((X.C26925DJg) r6).A00.A07(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0374, code lost:
        ((X.C26925DJg) r6).A00.A06(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x038f, code lost:
        r1 = ((X.C26925DJg) r6).A00;
        r1.A03(r7 << 3);
        r1.A02(r11 ? (byte) 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03a5, code lost:
        A0C(r6, X.C26267CwC.A01(r5, (long) (r1 & 1048575)), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03b7, code lost:
        r11 = X.C26267CwC.A01(r5, (long) (r1 & 1048575));
        ((X.C26925DJg) r6).A00.A0C((X.EDY) r11, A0A(r2), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03d4, code lost:
        ((X.C26925DJg) r6).A00.A0B((X.DSP) X.C26267CwC.A01(r5, (long) (r1 & 1048575)), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03f8, code lost:
        r1 = ((X.C26925DJg) r6).A00;
        r1.A03(r7 << 3);
        r1.A03(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0418, code lost:
        ((X.C26925DJg) r6).A00.A05(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0433, code lost:
        ((X.C26925DJg) r6).A00.A06(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x044a, code lost:
        ((X.C26925DJg) r6).A00.A07(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0465, code lost:
        X.C26164Ctd.A05(((X.C26925DJg) r6).A00, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x047c, code lost:
        X.C26164Ctd.A06(((X.C26925DJg) r6).A00, r7, (r0 >> 63) ^ (r0 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0492, code lost:
        r6.CTL(A0A(r2), X.C26267CwC.A01(r5, (long) (r1 & 1048575)), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04d3, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x06b2, code lost:
        X.C26297CxA.A0C(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x06c0, code lost:
        X.C26297CxA.A0D(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06ce, code lost:
        X.C26297CxA.A0E(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x06dc, code lost:
        X.C26297CxA.A0I(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06ea, code lost:
        X.C26297CxA.A0G(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x06f8, code lost:
        X.C26297CxA.A0L(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0713, code lost:
        X.C26297CxA.A0J(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0721, code lost:
        X.C26297CxA.A0N(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x072f, code lost:
        X.C26297CxA.A0M(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x073d, code lost:
        X.C26297CxA.A0H(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x074b, code lost:
        X.C26297CxA.A0K(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0761, code lost:
        X.C26297CxA.A0F(r6, r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07e1, code lost:
        X.C26164Ctd.A06(((X.C26925DJg) r6).A00, r2, A09(r5, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0893, code lost:
        ((X.C26925DJg) r6).A00.A05(r2, X.AnonymousClass000.A0M(X.C26267CwC.A01(r5, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x08ab, code lost:
        ((X.C26925DJg) r6).A00.A06(r2, X.AnonymousClass000.A0M(X.C26267CwC.A01(r5, r0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CT9(X.E5P r21, java.lang.Object r22) {
        /*
            r20 = this;
            r5 = r22
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r9 = 1
            r10 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r20
            boolean r0 = r4.A01
            r6 = r21
            if (r0 == 0) goto L_0x04a2
            int[] r3 = r4.A02
            int r8 = r3.length
            r2 = 0
        L_0x0015:
            if (r2 >= r8) goto L_0x0919
            int r0 = r2 + 1
            r1 = r3[r0]
            r7 = r3[r2]
            r0 = r1 & r18
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0038;
                case 2: goto L_0x0049;
                case 3: goto L_0x005a;
                case 4: goto L_0x006b;
                case 5: goto L_0x007c;
                case 6: goto L_0x008d;
                case 7: goto L_0x009e;
                case 8: goto L_0x00af;
                case 9: goto L_0x00b7;
                case 10: goto L_0x00bf;
                case 11: goto L_0x00c7;
                case 12: goto L_0x00d8;
                case 13: goto L_0x00e9;
                case 14: goto L_0x00fa;
                case 15: goto L_0x010b;
                case 16: goto L_0x011c;
                case 17: goto L_0x012d;
                case 18: goto L_0x0135;
                case 19: goto L_0x0140;
                case 20: goto L_0x014b;
                case 21: goto L_0x0156;
                case 22: goto L_0x0161;
                case 23: goto L_0x016c;
                case 24: goto L_0x0177;
                case 25: goto L_0x0182;
                case 26: goto L_0x018d;
                case 27: goto L_0x0198;
                case 28: goto L_0x01a7;
                case 29: goto L_0x01b2;
                case 30: goto L_0x01bd;
                case 31: goto L_0x01c8;
                case 32: goto L_0x01d3;
                case 33: goto L_0x01de;
                case 34: goto L_0x01e9;
                case 35: goto L_0x01f4;
                case 36: goto L_0x01ff;
                case 37: goto L_0x020a;
                case 38: goto L_0x0215;
                case 39: goto L_0x0220;
                case 40: goto L_0x022b;
                case 41: goto L_0x0236;
                case 42: goto L_0x0241;
                case 43: goto L_0x024c;
                case 44: goto L_0x0257;
                case 45: goto L_0x0262;
                case 46: goto L_0x026d;
                case 47: goto L_0x0278;
                case 48: goto L_0x0283;
                case 49: goto L_0x028e;
                case 50: goto L_0x02b6;
                case 51: goto L_0x02c5;
                case 52: goto L_0x02e4;
                case 53: goto L_0x0303;
                case 54: goto L_0x031a;
                case 55: goto L_0x0331;
                case 56: goto L_0x034c;
                case 57: goto L_0x0363;
                case 58: goto L_0x037e;
                case 59: goto L_0x039f;
                case 60: goto L_0x03b1;
                case 61: goto L_0x03ce;
                case 62: goto L_0x03e7;
                case 63: goto L_0x0407;
                case 64: goto L_0x0422;
                case 65: goto L_0x043d;
                case 66: goto L_0x0454;
                case 67: goto L_0x046f;
                case 68: goto L_0x048c;
                default: goto L_0x0024;
            }
        L_0x0024:
            int r2 = r2 + 4
            goto L_0x0015
        L_0x0027:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            double r12 = r11.A02(r5, r0)
            goto L_0x02d6
        L_0x0038:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            float r11 = r11.A03(r5, r0)
            goto L_0x02f5
        L_0x0049:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x0310
        L_0x005a:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x0327
        L_0x006b:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0342
        L_0x007c:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x0359
        L_0x008d:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0374
        L_0x009e:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            boolean r11 = r11.A0F(r5, r0)
            goto L_0x038f
        L_0x00af:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            goto L_0x03a5
        L_0x00b7:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            goto L_0x03b7
        L_0x00bf:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            goto L_0x03d4
        L_0x00c7:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            int r11 = r11.A04(r5, r0)
            goto L_0x03f8
        L_0x00d8:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0418
        L_0x00e9:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0433
        L_0x00fa:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x044a
        L_0x010b:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0465
        L_0x011c:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.CnI r11 = X.C26267CwC.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x047c
        L_0x012d:
            boolean r0 = r4.A0D(r5, r2)
            if (r0 == 0) goto L_0x0024
            goto L_0x0492
        L_0x0135:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0B(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0140:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0C(r6, r0, r7, r10)
            goto L_0x0024
        L_0x014b:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0D(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0156:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0E(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0161:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0I(r6, r0, r7, r10)
            goto L_0x0024
        L_0x016c:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0G(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0177:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0L(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0182:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0O(r6, r0, r7, r10)
            goto L_0x0024
        L_0x018d:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A09(r6, r0, r7)
            goto L_0x0024
        L_0x0198:
            r7 = r3[r2]
            java.util.List r1 = A0B(r1, r5)
            X.EAC r0 = r4.A0A(r2)
            X.C26297CxA.A08(r0, r6, r1, r7)
            goto L_0x0024
        L_0x01a7:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0A(r6, r0, r7)
            goto L_0x0024
        L_0x01b2:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0J(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01bd:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0N(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01c8:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0M(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01d3:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0H(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01de:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0K(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01e9:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0F(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01f4:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0B(r6, r0, r7, r9)
            goto L_0x0024
        L_0x01ff:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0C(r6, r0, r7, r9)
            goto L_0x0024
        L_0x020a:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0D(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0215:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0E(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0220:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0I(r6, r0, r7, r9)
            goto L_0x0024
        L_0x022b:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0G(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0236:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0L(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0241:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0O(r6, r0, r7, r9)
            goto L_0x0024
        L_0x024c:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0J(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0257:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0N(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0262:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0M(r6, r0, r7, r9)
            goto L_0x0024
        L_0x026d:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0H(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0278:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0K(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0283:
            r7 = r3[r2]
            java.util.List r0 = A0B(r1, r5)
            X.C26297CxA.A0F(r6, r0, r7, r9)
            goto L_0x0024
        L_0x028e:
            r12 = r3[r2]
            java.util.List r13 = A0B(r1, r5)
            X.EAC r11 = r4.A0A(r2)
            java.lang.Class r0 = X.C26297CxA.A03
            if (r13 == 0) goto L_0x0024
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0024
            r7 = r6
            X.DJg r7 = (X.C26925DJg) r7
            r1 = 0
        L_0x02a6:
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x0024
            java.lang.Object r0 = r13.get(r1)
            r7.CTL(r11, r0, r12)
            int r1 = r1 + 1
            goto L_0x02a6
        L_0x02b6:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            if (r0 == 0) goto L_0x0024
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x02c5:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            double r12 = X.AnonymousClass8BR.A00(r0)
        L_0x02d6:
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r11 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r12)
            r11.A07(r7, r0)
            goto L_0x0024
        L_0x02e4:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            float r11 = X.AnonymousClass000.A04(r0)
        L_0x02f5:
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r11)
            r1.A06(r7, r0)
            goto L_0x0024
        L_0x0303:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A09(r5, r0)
        L_0x0310:
            r11 = r6
            X.DJg r11 = (X.C26925DJg) r11
            X.Bep r11 = r11.A00
            X.C26164Ctd.A06(r11, r7, r0)
            goto L_0x0024
        L_0x031a:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A09(r5, r0)
        L_0x0327:
            r11 = r6
            X.DJg r11 = (X.C26925DJg) r11
            X.Bep r11 = r11.A00
            X.C26164Ctd.A06(r11, r7, r0)
            goto L_0x0024
        L_0x0331:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
        L_0x0342:
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            r0.A05(r7, r1)
            goto L_0x0024
        L_0x034c:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A09(r5, r0)
        L_0x0359:
            r11 = r6
            X.DJg r11 = (X.C26925DJg) r11
            X.Bep r11 = r11.A00
            r11.A07(r7, r0)
            goto L_0x0024
        L_0x0363:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
        L_0x0374:
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            r0.A06(r7, r1)
            goto L_0x0024
        L_0x037e:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            boolean r11 = X.AnonymousClass000.A1Y(r0)
        L_0x038f:
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r1 = r0.A00
            int r0 = r7 << 3
            r1.A03(r0)
            byte r0 = (byte) r11
            r1.A02(r0)
            goto L_0x0024
        L_0x039f:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
        L_0x03a5:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            A0C(r6, r0, r7)
            goto L_0x0024
        L_0x03b1:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
        L_0x03b7:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r11 = X.C26267CwC.A01(r5, r0)
            X.EAC r1 = r4.A0A(r2)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            X.EDY r11 = (X.EDY) r11
            r0.A0C(r11, r1, r7)
            goto L_0x0024
        L_0x03ce:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
        L_0x03d4:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r1 = X.C26267CwC.A01(r5, r0)
            X.DSP r1 = (X.DSP) r1
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            r0.A0B(r1, r7)
            goto L_0x0024
        L_0x03e7:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            int r11 = X.AnonymousClass000.A0M(r0)
        L_0x03f8:
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r1 = r0.A00
            int r0 = r7 << 3
            r1.A03(r0)
            r1.A03(r11)
            goto L_0x0024
        L_0x0407:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
        L_0x0418:
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            r0.A05(r7, r1)
            goto L_0x0024
        L_0x0422:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
        L_0x0433:
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            r0.A06(r7, r1)
            goto L_0x0024
        L_0x043d:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A09(r5, r0)
        L_0x044a:
            r11 = r6
            X.DJg r11 = (X.C26925DJg) r11
            X.Bep r11 = r11.A00
            r11.A07(r7, r0)
            goto L_0x0024
        L_0x0454:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
        L_0x0465:
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            X.C26164Ctd.A05(r0, r1, r7)
            goto L_0x0024
        L_0x046f:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A09(r5, r0)
        L_0x047c:
            r11 = r6
            X.DJg r11 = (X.C26925DJg) r11
            X.Bep r12 = r11.A00
            long r13 = r0 << r9
            r11 = 63
            long r0 = r0 >> r11
            long r0 = r0 ^ r13
            X.C26164Ctd.A06(r12, r7, r0)
            goto L_0x0024
        L_0x048c:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
        L_0x0492:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r1 = X.C26267CwC.A01(r5, r0)
            X.EAC r0 = r4.A0A(r2)
            r6.CTL(r0, r1, r7)
            goto L_0x0024
        L_0x04a2:
            int[] r8 = r4.A02
            int r12 = r8.length
            sun.misc.Unsafe r7 = A0F
            r11 = -1
            r3 = 0
            r19 = 0
        L_0x04ab:
            if (r3 >= r12) goto L_0x0919
            int r0 = r3 + 1
            r15 = r8[r0]
            r2 = r8[r3]
            r0 = r18 & r15
            int r13 = r0 >>> 20
            r0 = 17
            if (r13 > r0) goto L_0x0916
            int r0 = r3 + 2
            r16 = r8[r0]
            r14 = r16 & r17
            if (r14 == r11) goto L_0x04c9
            long r0 = (long) r14
            int r19 = r7.getInt(r5, r0)
            r11 = r14
        L_0x04c9:
            int r0 = r16 >>> 20
            int r14 = r9 << r0
        L_0x04cd:
            r15 = r15 & r17
            long r0 = (long) r15
            switch(r13) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x04ed;
                case 2: goto L_0x0504;
                case 3: goto L_0x0515;
                case 4: goto L_0x0526;
                case 5: goto L_0x0537;
                case 6: goto L_0x0548;
                case 7: goto L_0x055a;
                case 8: goto L_0x0574;
                case 9: goto L_0x0581;
                case 10: goto L_0x0599;
                case 11: goto L_0x05ad;
                case 12: goto L_0x05c4;
                case 13: goto L_0x05d6;
                case 14: goto L_0x05e8;
                case 15: goto L_0x05fa;
                case 16: goto L_0x060c;
                case 17: goto L_0x0624;
                case 18: goto L_0x0635;
                case 19: goto L_0x0642;
                case 20: goto L_0x0644;
                case 21: goto L_0x0646;
                case 22: goto L_0x0649;
                case 23: goto L_0x064c;
                case 24: goto L_0x064f;
                case 25: goto L_0x0652;
                case 26: goto L_0x065f;
                case 27: goto L_0x066c;
                case 28: goto L_0x067d;
                case 29: goto L_0x068a;
                case 30: goto L_0x068d;
                case 31: goto L_0x0690;
                case 32: goto L_0x0693;
                case 33: goto L_0x0696;
                case 34: goto L_0x0699;
                case 35: goto L_0x06a4;
                case 36: goto L_0x06b1;
                case 37: goto L_0x06bf;
                case 38: goto L_0x06cd;
                case 39: goto L_0x06db;
                case 40: goto L_0x06e9;
                case 41: goto L_0x06f7;
                case 42: goto L_0x0705;
                case 43: goto L_0x0712;
                case 44: goto L_0x0720;
                case 45: goto L_0x072e;
                case 46: goto L_0x073c;
                case 47: goto L_0x074a;
                case 48: goto L_0x0758;
                case 49: goto L_0x0766;
                case 50: goto L_0x0790;
                case 51: goto L_0x079c;
                case 52: goto L_0x07b8;
                case 53: goto L_0x07d4;
                case 54: goto L_0x07db;
                case 55: goto L_0x07ef;
                case 56: goto L_0x07f7;
                case 57: goto L_0x080b;
                case 58: goto L_0x0813;
                case 59: goto L_0x0831;
                case 60: goto L_0x0840;
                case 61: goto L_0x085a;
                case 62: goto L_0x0870;
                case 63: goto L_0x088d;
                case 64: goto L_0x08a5;
                case 65: goto L_0x08bd;
                case 66: goto L_0x08d1;
                case 67: goto L_0x08e9;
                case 68: goto L_0x0903;
                default: goto L_0x04d3;
            }
        L_0x04d3:
            int r3 = r3 + 4
            goto L_0x04ab
        L_0x04d6:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            X.CnI r13 = X.C26267CwC.A02
            double r14 = r13.A02(r5, r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r13 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r14)
            r13.A07(r2, r0)
            goto L_0x04d3
        L_0x04ed:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            X.CnI r13 = X.C26267CwC.A02
            float r13 = r13.A03(r5, r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r13)
            r1.A06(r2, r0)
            goto L_0x04d3
        L_0x0504:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.DJg r13 = (X.C26925DJg) r13
            X.Bep r13 = r13.A00
            X.C26164Ctd.A06(r13, r2, r0)
            goto L_0x04d3
        L_0x0515:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.DJg r13 = (X.C26925DJg) r13
            X.Bep r13 = r13.A00
            X.C26164Ctd.A06(r13, r2, r0)
            goto L_0x04d3
        L_0x0526:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            r0.A05(r2, r1)
            goto L_0x04d3
        L_0x0537:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.DJg r13 = (X.C26925DJg) r13
            X.Bep r13 = r13.A00
            r13.A07(r2, r0)
            goto L_0x04d3
        L_0x0548:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            r0.A06(r2, r1)
            goto L_0x04d3
        L_0x055a:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            X.CnI r13 = X.C26267CwC.A02
            boolean r13 = r13.A0F(r5, r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r1 = r0.A00
            int r0 = r2 << 3
            r1.A03(r0)
            byte r0 = (byte) r13
            r1.A02(r0)
            goto L_0x04d3
        L_0x0574:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            java.lang.Object r0 = r7.getObject(r5, r0)
            A0C(r6, r0, r2)
            goto L_0x04d3
        L_0x0581:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            java.lang.Object r13 = r7.getObject(r5, r0)
            X.EAC r1 = r4.A0A(r3)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            X.EDY r13 = (X.EDY) r13
            r0.A0C(r13, r1, r2)
            goto L_0x04d3
        L_0x0599:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            java.lang.Object r1 = r7.getObject(r5, r0)
            X.DSP r1 = (X.DSP) r1
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            r0.A0B(r1, r2)
            goto L_0x04d3
        L_0x05ad:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            int r13 = r7.getInt(r5, r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r1 = r0.A00
            int r0 = r2 << 3
            r1.A03(r0)
            r1.A03(r13)
            goto L_0x04d3
        L_0x05c4:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            r0.A05(r2, r1)
            goto L_0x04d3
        L_0x05d6:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            r0.A06(r2, r1)
            goto L_0x04d3
        L_0x05e8:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.DJg r13 = (X.C26925DJg) r13
            X.Bep r13 = r13.A00
            r13.A07(r2, r0)
            goto L_0x04d3
        L_0x05fa:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            X.C26164Ctd.A05(r0, r1, r2)
            goto L_0x04d3
        L_0x060c:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.DJg r13 = (X.C26925DJg) r13
            X.Bep r14 = r13.A00
            long r15 = r0 << r9
            r13 = 63
            long r0 = r0 >> r13
            long r0 = r0 ^ r15
            X.C26164Ctd.A06(r14, r2, r0)
            goto L_0x04d3
        L_0x0624:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d3
            java.lang.Object r1 = r7.getObject(r5, r0)
            X.EAC r0 = r4.A0A(r3)
            r6.CTL(r0, r1, r2)
            goto L_0x04d3
        L_0x0635:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0B(r6, r0, r2, r10)
            goto L_0x04d3
        L_0x0642:
            r13 = 0
            goto L_0x06b2
        L_0x0644:
            r13 = 0
            goto L_0x06c0
        L_0x0646:
            r13 = 0
            goto L_0x06ce
        L_0x0649:
            r13 = 0
            goto L_0x06dc
        L_0x064c:
            r13 = 0
            goto L_0x06ea
        L_0x064f:
            r13 = 0
            goto L_0x06f8
        L_0x0652:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0O(r6, r0, r2, r10)
            goto L_0x04d3
        L_0x065f:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A09(r6, r0, r2)
            goto L_0x04d3
        L_0x066c:
            r2 = r8[r3]
            java.lang.Object r1 = r7.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            X.EAC r0 = r4.A0A(r3)
            X.C26297CxA.A08(r0, r6, r1, r2)
            goto L_0x04d3
        L_0x067d:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0A(r6, r0, r2)
            goto L_0x04d3
        L_0x068a:
            r13 = 0
            goto L_0x0713
        L_0x068d:
            r13 = 0
            goto L_0x0721
        L_0x0690:
            r13 = 0
            goto L_0x072f
        L_0x0693:
            r13 = 0
            goto L_0x073d
        L_0x0696:
            r13 = 0
            goto L_0x074b
        L_0x0699:
            r2 = r8[r3]
            java.lang.Object r1 = r7.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            goto L_0x0761
        L_0x06a4:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0B(r6, r0, r2, r9)
            goto L_0x04d3
        L_0x06b1:
            r13 = 1
        L_0x06b2:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0C(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x06bf:
            r13 = 1
        L_0x06c0:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0D(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x06cd:
            r13 = 1
        L_0x06ce:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0E(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x06db:
            r13 = 1
        L_0x06dc:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0I(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x06e9:
            r13 = 1
        L_0x06ea:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0G(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x06f7:
            r13 = 1
        L_0x06f8:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0L(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x0705:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0O(r6, r0, r2, r9)
            goto L_0x04d3
        L_0x0712:
            r13 = 1
        L_0x0713:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0J(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x0720:
            r13 = 1
        L_0x0721:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0N(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x072e:
            r13 = 1
        L_0x072f:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0M(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x073c:
            r13 = 1
        L_0x073d:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0H(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x074a:
            r13 = 1
        L_0x074b:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C26297CxA.A0K(r6, r0, r2, r13)
            goto L_0x04d3
        L_0x0758:
            r2 = r8[r3]
            java.lang.Object r1 = r7.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 1
        L_0x0761:
            X.C26297CxA.A0F(r6, r1, r2, r0)
            goto L_0x04d3
        L_0x0766:
            r13 = r8[r3]
            java.lang.Object r15 = r7.getObject(r5, r0)
            java.util.List r15 = (java.util.List) r15
            X.EAC r14 = r4.A0A(r3)
            java.lang.Class r0 = X.C26297CxA.A03
            if (r15 == 0) goto L_0x04d3
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x04d3
            r2 = r6
            X.DJg r2 = (X.C26925DJg) r2
            r1 = 0
        L_0x0780:
            int r0 = r15.size()
            if (r1 >= r0) goto L_0x04d3
            java.lang.Object r0 = r15.get(r1)
            r2.CTL(r14, r0, r13)
            int r1 = r1 + 1
            goto L_0x0780
        L_0x0790:
            java.lang.Object r0 = r7.getObject(r5, r0)
            if (r0 == 0) goto L_0x04d3
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x079c:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            double r14 = X.AnonymousClass8BR.A00(r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r13 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r14)
            r13.A07(r2, r0)
            goto L_0x04d3
        L_0x07b8:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            float r13 = X.AnonymousClass000.A04(r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r13)
            r1.A06(r2, r0)
            goto L_0x04d3
        L_0x07d4:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            goto L_0x07e1
        L_0x07db:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
        L_0x07e1:
            long r0 = A09(r5, r0)
            r13 = r6
            X.DJg r13 = (X.C26925DJg) r13
            X.Bep r13 = r13.A00
            X.C26164Ctd.A06(r13, r2, r0)
            goto L_0x04d3
        L_0x07ef:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            goto L_0x0893
        L_0x07f7:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            long r0 = A09(r5, r0)
            r13 = r6
            X.DJg r13 = (X.C26925DJg) r13
            X.Bep r13 = r13.A00
            r13.A07(r2, r0)
            goto L_0x04d3
        L_0x080b:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            goto L_0x08ab
        L_0x0813:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            boolean r13 = X.AnonymousClass000.A1Y(r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r1 = r0.A00
            int r0 = r2 << 3
            r1.A03(r0)
            byte r0 = (byte) r13
            r1.A02(r0)
            goto L_0x04d3
        L_0x0831:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r0 = r7.getObject(r5, r0)
            A0C(r6, r0, r2)
            goto L_0x04d3
        L_0x0840:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r13 = r7.getObject(r5, r0)
            X.EAC r1 = r4.A0A(r3)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            X.EDY r13 = (X.EDY) r13
            r0.A0C(r13, r1, r2)
            goto L_0x04d3
        L_0x085a:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r1 = r7.getObject(r5, r0)
            X.DSP r1 = (X.DSP) r1
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            r0.A0B(r1, r2)
            goto L_0x04d3
        L_0x0870:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            int r13 = X.AnonymousClass000.A0M(r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r1 = r0.A00
            int r0 = r2 << 3
            r1.A03(r0)
            r1.A03(r13)
            goto L_0x04d3
        L_0x088d:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
        L_0x0893:
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            r0.A05(r2, r1)
            goto L_0x04d3
        L_0x08a5:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
        L_0x08ab:
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            r0.A06(r2, r1)
            goto L_0x04d3
        L_0x08bd:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            long r0 = A09(r5, r0)
            r13 = r6
            X.DJg r13 = (X.C26925DJg) r13
            X.Bep r13 = r13.A00
            r13.A07(r2, r0)
            goto L_0x04d3
        L_0x08d1:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C26267CwC.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = r6
            X.DJg r0 = (X.C26925DJg) r0
            X.Bep r0 = r0.A00
            X.C26164Ctd.A05(r0, r1, r2)
            goto L_0x04d3
        L_0x08e9:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            long r0 = A09(r5, r0)
            r13 = r6
            X.DJg r13 = (X.C26925DJg) r13
            X.Bep r13 = r13.A00
            long r15 = r0 << r9
            r14 = 63
            long r0 = r0 >> r14
            long r0 = r0 ^ r15
            X.C26164Ctd.A06(r13, r2, r0)
            goto L_0x04d3
        L_0x0903:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d3
            java.lang.Object r1 = r7.getObject(r5, r0)
            X.EAC r0 = r4.A0A(r3)
            r6.CTL(r0, r1, r2)
            goto L_0x04d3
        L_0x0916:
            r14 = 0
            goto L_0x04cd
        L_0x0919:
            X.Beh r5 = (X.C23293Beh) r5
            X.Cmt r0 = r5.zzjp
            r0.A02(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26923DJe.CT9(X.E5P, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        r10 = r9 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009c, code lost:
        r10 = r9 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fa, code lost:
        r7.putObject(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0114, code lost:
        r7.putInt(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0125, code lost:
        r7.putLong(r5, r2, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CTA(X.CQ8 r32, java.lang.Object r33, byte[] r34, int r35, int r36) {
        /*
            r31 = this;
            r10 = r35
            r30 = r31
            r0 = r30
            boolean r0 = r0.A01
            r6 = r32
            r5 = r33
            r4 = r34
            r8 = r36
            if (r0 == 0) goto L_0x01c8
            sun.misc.Unsafe r7 = A0F
        L_0x0014:
            if (r10 >= r8) goto L_0x01be
            int r9 = r10 + 1
            byte r11 = r34[r10]
            if (r11 >= 0) goto L_0x0022
            int r9 = X.C26163Ctc.A04(r6, r4, r11, r9)
            int r11 = r6.A00
        L_0x0022:
            int r12 = r11 >>> 3
            r13 = r11 & 7
            r0 = r30
            int r10 = r0.A00(r12)
            if (r10 < 0) goto L_0x0048
            int[] r1 = r0.A02
            int r0 = r10 + 1
            r1 = r1[r0]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r1
            int r14 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r2 = (long) r0
            r15 = 17
            r0 = 2
            if (r14 > r15) goto L_0x012e
            r15 = 5
            r12 = 1
            switch(r14) {
                case 0: goto L_0x0058;
                case 1: goto L_0x006a;
                case 2: goto L_0x007a;
                case 3: goto L_0x007a;
                case 4: goto L_0x00ff;
                case 5: goto L_0x0084;
                case 6: goto L_0x0093;
                case 7: goto L_0x00a0;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00d9;
                case 10: goto L_0x00f2;
                case 11: goto L_0x00ff;
                case 12: goto L_0x00ff;
                case 13: goto L_0x0093;
                case 14: goto L_0x0084;
                case 15: goto L_0x0108;
                case 16: goto L_0x0119;
                default: goto L_0x0048;
            }
        L_0x0048:
            X.Cmt r13 = X.C26919DJa.A05(r5)
            r12 = r6
            r14 = r4
            r15 = r11
            r16 = r9
            r17 = r8
            int r10 = X.C26163Ctc.A00(r12, r13, r14, r15, r16, r17)
            goto L_0x0014
        L_0x0058:
            if (r13 != r12) goto L_0x0048
            long r0 = X.BEB.A0G(r4, r9)
            double r14 = java.lang.Double.longBitsToDouble(r0)
            X.CnI r10 = X.C26267CwC.A02
            r11 = r5
            r12 = r2
            r10.A09(r11, r12, r14)
            goto L_0x0090
        L_0x006a:
            if (r13 != r15) goto L_0x0048
            int r0 = X.BEB.A08(r4, r9)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.CnI r0 = X.C26267CwC.A02
            r0.A0A(r5, r2, r1)
            goto L_0x009c
        L_0x007a:
            if (r13 != 0) goto L_0x0048
            int r10 = X.C26163Ctc.A02(r6, r4, r9)
            long r0 = r6.A01
            goto L_0x0125
        L_0x0084:
            if (r13 != r12) goto L_0x0048
            long r14 = X.BEB.A0G(r4, r9)
            r10 = r7
            r11 = r5
            r12 = r2
            r10.putLong(r11, r12, r14)
        L_0x0090:
            int r10 = r9 + 8
            goto L_0x0014
        L_0x0093:
            if (r13 != r15) goto L_0x0048
            int r0 = X.BEB.A08(r4, r9)
            r7.putInt(r5, r2, r0)
        L_0x009c:
            int r10 = r9 + 4
            goto L_0x0014
        L_0x00a0:
            if (r13 != 0) goto L_0x0048
            int r10 = X.C26163Ctc.A02(r6, r4, r9)
            long r0 = r6.A01
            r13 = 0
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x00af
            r12 = 0
        L_0x00af:
            X.CnI r0 = X.C26267CwC.A02
            r0.A0D(r5, r2, r12)
            goto L_0x0014
        L_0x00b6:
            if (r13 != r0) goto L_0x0048
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x00d4
            int r10 = X.C26163Ctc.A01(r6, r4, r9)
            int r1 = r6.A00
            if (r1 != 0) goto L_0x00ca
            java.lang.String r0 = ""
            r6.A02 = r0
            goto L_0x00f8
        L_0x00ca:
            java.nio.charset.Charset r0 = X.C25461CgE.A00
            java.lang.String r0 = X.BE6.A0r(r0, r4, r10, r1)
            r6.A02 = r0
            int r10 = r10 + r1
            goto L_0x00f8
        L_0x00d4:
            int r10 = A07(r6, r4, r9)
            goto L_0x00f8
        L_0x00d9:
            if (r13 != r0) goto L_0x0048
            r0 = r30
            X.EAC r0 = r0.A0A(r10)
            int r10 = A02(r6, r0, r4, r9, r8)
            java.lang.Object r1 = r7.getObject(r5, r2)
            if (r1 == 0) goto L_0x00f8
            java.lang.Object r0 = r6.A02
            X.Beh r0 = X.C25461CgE.A00(r1, r0)
            goto L_0x00fa
        L_0x00f2:
            if (r13 != r0) goto L_0x0048
            int r10 = X.C26163Ctc.A03(r6, r4, r9)
        L_0x00f8:
            java.lang.Object r0 = r6.A02
        L_0x00fa:
            r7.putObject(r5, r2, r0)
            goto L_0x0014
        L_0x00ff:
            if (r13 != 0) goto L_0x0048
            int r10 = X.C26163Ctc.A01(r6, r4, r9)
            int r0 = r6.A00
            goto L_0x0114
        L_0x0108:
            if (r13 != 0) goto L_0x0048
            int r10 = X.C26163Ctc.A01(r6, r4, r9)
            int r0 = r6.A00
            int r0 = X.BE7.A05(r0)
        L_0x0114:
            r7.putInt(r5, r2, r0)
            goto L_0x0014
        L_0x0119:
            if (r13 != 0) goto L_0x0048
            int r10 = X.C26163Ctc.A02(r6, r4, r9)
            long r0 = r6.A01
            long r0 = X.BEA.A0G(r0)
        L_0x0125:
            r11 = r7
            r12 = r5
            r13 = r2
            r15 = r0
            r11.putLong(r12, r13, r15)
            goto L_0x0014
        L_0x012e:
            r15 = 27
            if (r14 != r15) goto L_0x016a
            if (r13 != r0) goto L_0x0048
            java.lang.Object r12 = r7.getObject(r5, r2)
            X.EE7 r12 = (X.EE7) r12
            r0 = r12
            X.DbL r0 = (X.C27292DbL) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x014c
            int r0 = X.BEA.A0C(r12)
            X.EE7 r12 = r12.CTh(r0)
            r7.putObject(r5, r2, r12)
        L_0x014c:
            r0 = r30
            X.EAC r2 = r0.A0A(r10)
            int r10 = A02(r6, r2, r4, r9, r8)
        L_0x0156:
            java.lang.Object r0 = r6.A02
            r12.add(r0)
            if (r10 >= r8) goto L_0x0014
            int r1 = X.C26163Ctc.A01(r6, r4, r10)
            int r0 = r6.A00
            if (r11 != r0) goto L_0x0014
            int r10 = A02(r6, r2, r4, r1, r8)
            goto L_0x0156
        L_0x016a:
            r15 = 49
            if (r14 > r15) goto L_0x0192
            long r0 = (long) r1
            r15 = r30
            r16 = r6
            r17 = r5
            r18 = r4
            r19 = r9
            r20 = r8
            r21 = r11
            r22 = r12
            r23 = r13
            r24 = r10
            r25 = r14
            r26 = r0
            r28 = r2
            int r10 = r15.A06(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
        L_0x018d:
            if (r10 != r9) goto L_0x0014
            r9 = r10
            goto L_0x0048
        L_0x0192:
            r15 = 50
            if (r14 != r15) goto L_0x01a2
            if (r13 != r0) goto L_0x0048
            r7.getObject(r5, r2)
            java.lang.String r0 = "isMutable"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01a2:
            r22 = r14
            r23 = r10
            r24 = r2
            r18 = r11
            r19 = r12
            r20 = r13
            r21 = r1
            r17 = r8
            r16 = r9
            r13 = r6
            r14 = r5
            r15 = r4
            r12 = r30
            int r10 = r12.A05(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x018d
        L_0x01be:
            if (r10 == r8) goto L_0x01d2
            java.lang.String r1 = "Failed to parse the message."
            X.BxF r0 = new X.BxF
            r0.<init>(r1)
            throw r0
        L_0x01c8:
            r7 = 0
            r1 = r30
            r2 = r6
            r3 = r5
            r5 = r10
            r6 = r8
            r1.A04(r2, r3, r4, r5, r6, r7)
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26923DJe.CTA(X.CQ8, java.lang.Object, byte[], int, int):void");
    }

    public final void CTR(Object obj) {
        Object unmodifiableList;
        int[] iArr = this.A0D;
        if (iArr != null) {
            for (int A0N : iArr) {
                if (C26267CwC.A01(obj, BE9.A0N(this.A02, A0N)) != null) {
                    throw AnonymousClass000.A0s("zzv");
                }
            }
        }
        int[] iArr2 = this.A0E;
        if (iArr2 != null) {
            for (int i : iArr2) {
                long j = (long) i;
                if (this.A08 instanceof C23314Bf2) {
                    ((C27292DbL) ((EE7) C26267CwC.A01(obj, j))).A00 = false;
                } else {
                    List list = (List) C26267CwC.A01(obj, j);
                    if (list instanceof EE2) {
                        unmodifiableList = ((EE2) list).CTQ();
                    } else if (!BE7.A1W(C23315Bf3.A00, list)) {
                        unmodifiableList = Collections.unmodifiableList(list);
                    }
                    C26267CwC.A05(obj, j, unmodifiableList);
                }
            }
        }
        ((C23293Beh) obj).zzjp.A02 = false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cf, code lost:
        if (r12.A01 != false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d1, code lost:
        r1 = r3[r2 + 2];
        r0 = X.BE6.A0M(r1);
        r4 = X.C26267CwC.A02;
        r4.A0B(r13, r0, r4.A04(r13, r0) | (1 << (r1 >>> 20)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018f, code lost:
        X.C26267CwC.A05(r13, r8, X.C26267CwC.A01(r14, r8));
        X.C26267CwC.A02.A0B(r13, X.BE9.A0O(r3, r2), r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CTS(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x01b8
            r2 = 0
        L_0x0003:
            int[] r3 = r12.A02
            int r0 = r3.length
            r7 = r13
            if (r2 >= r0) goto L_0x01b0
            int r0 = r2 + 1
            r1 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r8 = (long) r0
            r4 = r3[r2]
            int r0 = X.BE7.A04(r1)
            switch(r0) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0080;
                case 2: goto L_0x00be;
                case 3: goto L_0x00be;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00be;
                case 6: goto L_0x00ae;
                case 7: goto L_0x0090;
                case 8: goto L_0x00a0;
                case 9: goto L_0x001e;
                case 10: goto L_0x00a0;
                case 11: goto L_0x00ae;
                case 12: goto L_0x00ae;
                case 13: goto L_0x00ae;
                case 14: goto L_0x00be;
                case 15: goto L_0x00ae;
                case 16: goto L_0x00be;
                case 17: goto L_0x001e;
                case 18: goto L_0x00e9;
                case 19: goto L_0x00e9;
                case 20: goto L_0x00e9;
                case 21: goto L_0x00e9;
                case 22: goto L_0x00e9;
                case 23: goto L_0x00e9;
                case 24: goto L_0x00e9;
                case 25: goto L_0x00e9;
                case 26: goto L_0x00e9;
                case 27: goto L_0x00e9;
                case 28: goto L_0x00e9;
                case 29: goto L_0x00e9;
                case 30: goto L_0x00e9;
                case 31: goto L_0x00e9;
                case 32: goto L_0x00e9;
                case 33: goto L_0x00e9;
                case 34: goto L_0x00e9;
                case 35: goto L_0x00e9;
                case 36: goto L_0x00e9;
                case 37: goto L_0x00e9;
                case 38: goto L_0x00e9;
                case 39: goto L_0x00e9;
                case 40: goto L_0x00e9;
                case 41: goto L_0x00e9;
                case 42: goto L_0x00e9;
                case 43: goto L_0x00e9;
                case 44: goto L_0x00e9;
                case 45: goto L_0x00e9;
                case 46: goto L_0x00e9;
                case 47: goto L_0x00e9;
                case 48: goto L_0x00e9;
                case 49: goto L_0x00e9;
                case 50: goto L_0x01a1;
                case 51: goto L_0x0182;
                case 52: goto L_0x0182;
                case 53: goto L_0x0182;
                case 54: goto L_0x0182;
                case 55: goto L_0x0182;
                case 56: goto L_0x0182;
                case 57: goto L_0x0182;
                case 58: goto L_0x0182;
                case 59: goto L_0x0182;
                case 60: goto L_0x0040;
                case 61: goto L_0x0189;
                case 62: goto L_0x0189;
                case 63: goto L_0x0189;
                case 64: goto L_0x0189;
                case 65: goto L_0x0189;
                case 66: goto L_0x0189;
                case 67: goto L_0x0189;
                case 68: goto L_0x0040;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r2 = r2 + 4
            goto L_0x0003
        L_0x001e:
            long r0 = X.BE9.A0N(r3, r2)
            boolean r4 = r12.A0D(r14, r2)
            if (r4 == 0) goto L_0x001b
            java.lang.Object r5 = X.C26267CwC.A01(r13, r0)
            java.lang.Object r4 = X.C26267CwC.A01(r14, r0)
            if (r5 == 0) goto L_0x003d
            if (r4 == 0) goto L_0x001b
            X.Beh r4 = X.C25461CgE.A00(r5, r4)
        L_0x0038:
            X.C26267CwC.A05(r13, r0, r4)
            goto L_0x00cd
        L_0x003d:
            if (r4 == 0) goto L_0x001b
            goto L_0x0038
        L_0x0040:
            int r0 = r2 + 1
            r0 = r3[r0]
            r6 = r3[r2]
            long r0 = X.BE6.A0M(r0)
            boolean r4 = r12.A0E(r14, r6, r2)
            if (r4 == 0) goto L_0x001b
            java.lang.Object r5 = X.C26267CwC.A01(r13, r0)
            java.lang.Object r4 = X.C26267CwC.A01(r14, r0)
            if (r5 == 0) goto L_0x006d
            if (r4 == 0) goto L_0x001b
            X.Beh r4 = X.C25461CgE.A00(r5, r4)
        L_0x0060:
            X.C26267CwC.A05(r13, r0, r4)
            long r0 = X.BE9.A0O(r3, r2)
            X.CnI r3 = X.C26267CwC.A02
            r3.A0B(r13, r0, r6)
            goto L_0x001b
        L_0x006d:
            if (r4 == 0) goto L_0x001b
            goto L_0x0060
        L_0x0070:
            boolean r0 = r12.A0D(r14, r2)
            if (r0 == 0) goto L_0x001b
            X.CnI r6 = X.C26267CwC.A02
            double r10 = r6.A02(r14, r8)
            r6.A09(r7, r8, r10)
            goto L_0x00cd
        L_0x0080:
            boolean r0 = r12.A0D(r14, r2)
            if (r0 == 0) goto L_0x001b
            X.CnI r1 = X.C26267CwC.A02
            float r0 = r1.A03(r14, r8)
            r1.A0A(r13, r8, r0)
            goto L_0x00cd
        L_0x0090:
            boolean r0 = r12.A0D(r14, r2)
            if (r0 == 0) goto L_0x001b
            X.CnI r1 = X.C26267CwC.A02
            boolean r0 = r1.A0F(r14, r8)
            r1.A0D(r13, r8, r0)
            goto L_0x00cd
        L_0x00a0:
            boolean r0 = r12.A0D(r14, r2)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = X.C26267CwC.A01(r14, r8)
            X.C26267CwC.A05(r13, r8, r0)
            goto L_0x00cd
        L_0x00ae:
            boolean r0 = r12.A0D(r14, r2)
            if (r0 == 0) goto L_0x001b
            X.CnI r1 = X.C26267CwC.A02
            int r0 = r1.A04(r14, r8)
            r1.A0B(r13, r8, r0)
            goto L_0x00cd
        L_0x00be:
            boolean r0 = r12.A0D(r14, r2)
            if (r0 == 0) goto L_0x001b
            X.CnI r6 = X.C26267CwC.A02
            long r10 = r6.A05(r14, r8)
            r6.A0C(r7, r8, r10)
        L_0x00cd:
            boolean r0 = r12.A01
            if (r0 != 0) goto L_0x001b
            int r0 = r2 + 2
            r1 = r3[r0]
            int r0 = r1 >>> 20
            r5 = 1
            int r5 = r5 << r0
            long r0 = X.BE6.A0M(r1)
            X.CnI r4 = X.C26267CwC.A02
            int r3 = r4.A04(r13, r0)
            r3 = r3 | r5
            r4.A0B(r13, r0, r3)
            goto L_0x001b
        L_0x00e9:
            X.CH9 r0 = r12.A08
            boolean r0 = r0 instanceof X.C23314Bf2
            if (r0 == 0) goto L_0x011c
            java.lang.Object r5 = X.C26267CwC.A01(r13, r8)
            X.EE7 r5 = (X.EE7) r5
            java.lang.Object r4 = X.C26267CwC.A01(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r3 = r5.size()
            int r1 = r4.size()
            if (r3 <= 0) goto L_0x0117
            if (r1 <= 0) goto L_0x0116
            r0 = r5
            X.DbL r0 = (X.C27292DbL) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0113
            int r1 = r1 + r3
            X.EE7 r5 = r5.CTh(r1)
        L_0x0113:
            r5.addAll(r4)
        L_0x0116:
            r4 = r5
        L_0x0117:
            X.C26267CwC.A05(r13, r8, r4)
            goto L_0x001b
        L_0x011c:
            java.lang.Object r4 = X.C26267CwC.A01(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r1 = r4.size()
            java.lang.Object r3 = X.C26267CwC.A01(r13, r8)
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x015e
            boolean r0 = r3 instanceof X.EE2
            if (r0 == 0) goto L_0x0159
            X.Bek r0 = X.C23296Bek.A01
            java.util.ArrayList r0 = X.C17880vN.A0z(r1)
            X.Bek r3 = new X.Bek
            r3.<init>(r0)
        L_0x0141:
            X.C26267CwC.A05(r13, r8, r3)
        L_0x0144:
            int r1 = r3.size()
            int r0 = r4.size()
            if (r1 <= 0) goto L_0x0154
            if (r0 <= 0) goto L_0x0153
            r3.addAll(r4)
        L_0x0153:
            r4 = r3
        L_0x0154:
            X.C26267CwC.A05(r13, r8, r4)
            goto L_0x001b
        L_0x0159:
            java.util.ArrayList r3 = X.C17880vN.A0z(r1)
            goto L_0x0141
        L_0x015e:
            java.lang.Class r0 = X.C23315Bf3.A00
            boolean r0 = X.BE7.A1W(r0, r3)
            if (r0 == 0) goto L_0x0172
            java.util.ArrayList r1 = X.BE9.A0y(r3, r1)
        L_0x016a:
            r1.addAll(r3)
            X.C26267CwC.A05(r13, r8, r1)
            r3 = r1
            goto L_0x0144
        L_0x0172:
            boolean r0 = r3 instanceof X.C27293DbM
            if (r0 == 0) goto L_0x0144
            X.Bek r0 = X.C23296Bek.A01
            java.util.ArrayList r0 = X.BE9.A0y(r3, r1)
            X.Bek r1 = new X.Bek
            r1.<init>(r0)
            goto L_0x016a
        L_0x0182:
            boolean r0 = r12.A0E(r14, r4, r2)
            if (r0 == 0) goto L_0x001b
            goto L_0x018f
        L_0x0189:
            boolean r0 = r12.A0E(r14, r4, r2)
            if (r0 == 0) goto L_0x001b
        L_0x018f:
            java.lang.Object r0 = X.C26267CwC.A01(r14, r8)
            X.C26267CwC.A05(r13, r8, r0)
            long r0 = X.BE9.A0O(r3, r2)
            X.CnI r3 = X.C26267CwC.A02
            r3.A0B(r13, r0, r4)
            goto L_0x001b
        L_0x01a1:
            java.lang.Class r0 = X.C26297CxA.A03
            X.C26267CwC.A01(r13, r8)
            X.C26267CwC.A01(r14, r8)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01b0:
            boolean r0 = r12.A01
            if (r0 != 0) goto L_0x01b7
            X.C26297CxA.A0P(r13, r14)
        L_0x01b7:
            return
        L_0x01b8:
            java.lang.NullPointerException r0 = X.BE6.A0m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26923DJe.CTS(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0348, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0367, code lost:
        r1 = A0A(r3);
        r0 = X.C23301Bep.A01;
        r8 = (X.C26164Ctd.A02(r9) << 1) + X.C26919DJa.A04(r1, (X.EDY) r4.getObject(r6, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0387, code lost:
        r8 = X.C26164Ctd.A02(r9) + X.C23301Bep.A01((r10 >> 63) ^ (r10 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x039f, code lost:
        r8 = X.C26164Ctd.A02(r9);
        r1 = (r1 >> 31) ^ (r1 << 1);
        r0 = X.C23301Bep.A01;
        r8 = r8 + X.BEB.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03b5, code lost:
        r8 = X.C26164Ctd.A02(r9) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03c1, code lost:
        r1 = X.C26164Ctd.A02(r9) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03d0, code lost:
        r8 = X.C26164Ctd.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03d4, code lost:
        if (r1 < 0) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03d6, code lost:
        r0 = X.C23301Bep.A01;
        r0 = X.BEB.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03dc, code lost:
        r8 = r8 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03df, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03e9, code lost:
        r8 = X.C26164Ctd.A02(r9);
        r0 = X.C23301Bep.A01;
        r8 = r8 + X.BEB.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03f9, code lost:
        r2 = r4.getObject(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0407, code lost:
        if ((r2 instanceof X.DSP) != false) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0409, code lost:
        r8 = X.C26164Ctd.A03(((X.DSP) r2).A02(), X.C26164Ctd.A02(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0419, code lost:
        r2 = (java.lang.String) r2;
        r8 = X.C26164Ctd.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        r0 = X.C25908CoM.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0424, code lost:
        r0 = r2.getBytes(X.C25461CgE.A00).length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x042f, code lost:
        r2 = r4.getObject(r6, r0);
        r1 = A0A(r3);
        r0 = X.C26297CxA.A03;
        r8 = X.C26164Ctd.A02(r9);
        r0 = X.C26919DJa.A04(r1, (X.EDY) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x044c, code lost:
        r8 = X.C26164Ctd.A02(r9) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04bb, code lost:
        r16 = r16 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0562, code lost:
        if ((r2 instanceof X.DSP) != false) goto L_0x0737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x066d, code lost:
        r7 = X.C26164Ctd.A02(r8);
        r0 = X.C23301Bep.A01;
        r7 = (r7 + X.BEB.A02(r1)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0681, code lost:
        r1 = A0A(r3);
        r0 = X.C23301Bep.A01;
        r7 = (X.C26164Ctd.A02(r8) << 1) + X.C26919DJa.A04(r1, (X.EDY) X.C26267CwC.A01(r6, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x06a6, code lost:
        r7 = X.C26164Ctd.A02(r8) + X.C23301Bep.A01((r9 >> 63) ^ (r9 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06c3, code lost:
        r7 = X.C26164Ctd.A02(r8);
        r1 = (r1 >> 31) ^ (r1 << 1);
        r0 = X.C23301Bep.A01;
        r7 = r7 + X.BEB.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x06db, code lost:
        r7 = X.C26164Ctd.A02(r8) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06e9, code lost:
        r7 = X.C26164Ctd.A02(r8) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x06fd, code lost:
        r7 = X.C26164Ctd.A02(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0701, code lost:
        if (r1 < 0) goto L_0x07bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0711, code lost:
        r7 = X.C26164Ctd.A02(r8);
        r0 = X.C23301Bep.A01;
        r7 = r7 + X.BEB.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0724, code lost:
        r2 = X.C26267CwC.A01(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0735, code lost:
        if ((r2 instanceof X.DSP) != false) goto L_0x0737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0737, code lost:
        r7 = X.C26164Ctd.A03(((X.DSP) r2).A02(), X.C26164Ctd.A02(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0747, code lost:
        r2 = (java.lang.String) r2;
        r7 = X.C26164Ctd.A02(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:?, code lost:
        r0 = X.C25908CoM.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0752, code lost:
        r0 = r2.getBytes(X.C25461CgE.A00).length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0760, code lost:
        r2 = X.C26267CwC.A01(r6, r1);
        r1 = A0A(r3);
        r0 = X.C26297CxA.A03;
        r7 = X.C26164Ctd.A02(r8);
        r0 = X.C26919DJa.A04(r1, (X.EDY) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0780, code lost:
        r7 = X.C26164Ctd.A02(r8) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x078e, code lost:
        r7 = X.C26164Ctd.A02(r8) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x079c, code lost:
        r7 = X.C26164Ctd.A02(r8) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x07b0, code lost:
        r7 = X.C26164Ctd.A02(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x07b4, code lost:
        if (r1 < 0) goto L_0x07bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x07b6, code lost:
        r0 = X.C23301Bep.A01;
        r0 = X.BEB.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x07bc, code lost:
        r7 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x07bf, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x07ce, code lost:
        r7 = X.C26164Ctd.A02(r8) + X.C23301Bep.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x07e5, code lost:
        r7 = X.C26164Ctd.A02(r8) + X.C23301Bep.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x07f6, code lost:
        r7 = X.C26164Ctd.A02(r8) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0804, code lost:
        r7 = X.C26164Ctd.A02(r8) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        if ((r2 instanceof X.DSP) != false) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0962, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ec, code lost:
        if (r1 >= 0) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
        r8 = X.C26164Ctd.A02(r9) + X.C23301Bep.A01(A09(r6, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01df, code lost:
        r1 = X.C26164Ctd.A02(r9);
        r0 = X.C23301Bep.A01;
        r1 = (r1 + X.BEB.A02(r2)) + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int CTi(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r18
            r5 = r17
            boolean r0 = r5.A01
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = 1
            r14 = 1048575(0xfffff, float:1.469367E-39)
            sun.misc.Unsafe r4 = A0F
            r3 = 0
            r13 = 0
            if (r0 != 0) goto L_0x04d7
            r7 = -1
            r16 = 0
        L_0x0015:
            int[] r1 = r5.A02
            int r0 = r1.length
            if (r3 >= r0) goto L_0x04cc
            int r0 = r3 + 1
            r11 = r1[r0]
            r9 = r1[r3]
            int r8 = X.BE7.A04(r11)
            r0 = 17
            if (r8 > r0) goto L_0x04bf
            int r0 = r3 + 2
            r0 = r1[r0]
            r10 = r0 & r14
            int r0 = r0 >>> 20
            int r2 = r15 << r0
            if (r10 == r7) goto L_0x003a
            long r0 = (long) r10
            int r13 = r4.getInt(r6, r0)
            r7 = r10
        L_0x003a:
            r11 = r11 & r14
            long r0 = (long) r11
            switch(r8) {
                case 0: goto L_0x0492;
                case 1: goto L_0x049d;
                case 2: goto L_0x04ab;
                case 3: goto L_0x0481;
                case 4: goto L_0x0469;
                case 5: goto L_0x045e;
                case 6: goto L_0x0453;
                case 7: goto L_0x0448;
                case 8: goto L_0x03fe;
                case 9: goto L_0x042c;
                case 10: goto L_0x03f6;
                case 11: goto L_0x03e2;
                case 12: goto L_0x03c9;
                case 13: goto L_0x03bd;
                case 14: goto L_0x03b1;
                case 15: goto L_0x0398;
                case 16: goto L_0x0380;
                case 17: goto L_0x0364;
                case 18: goto L_0x0321;
                case 19: goto L_0x030e;
                case 20: goto L_0x02f2;
                case 21: goto L_0x02da;
                case 22: goto L_0x02c2;
                case 23: goto L_0x0321;
                case 24: goto L_0x030e;
                case 25: goto L_0x02af;
                case 26: goto L_0x02a3;
                case 27: goto L_0x0278;
                case 28: goto L_0x024d;
                case 29: goto L_0x0235;
                case 30: goto L_0x021d;
                case 31: goto L_0x030e;
                case 32: goto L_0x0321;
                case 33: goto L_0x0205;
                case 34: goto L_0x01ed;
                case 35: goto L_0x01d3;
                case 36: goto L_0x01c6;
                case 37: goto L_0x01b9;
                case 38: goto L_0x01ac;
                case 39: goto L_0x019f;
                case 40: goto L_0x0192;
                case 41: goto L_0x0185;
                case 42: goto L_0x017a;
                case 43: goto L_0x016d;
                case 44: goto L_0x0160;
                case 45: goto L_0x0152;
                case 46: goto L_0x0144;
                case 47: goto L_0x0136;
                case 48: goto L_0x0128;
                case 49: goto L_0x0334;
                case 50: goto L_0x04c2;
                case 51: goto L_0x011a;
                case 52: goto L_0x010c;
                case 53: goto L_0x00f7;
                case 54: goto L_0x00f0;
                case 55: goto L_0x00da;
                case 56: goto L_0x00cc;
                case 57: goto L_0x00be;
                case 58: goto L_0x00b6;
                case 59: goto L_0x00a6;
                case 60: goto L_0x009e;
                case 61: goto L_0x0096;
                case 62: goto L_0x0086;
                case 63: goto L_0x0076;
                case 64: goto L_0x006e;
                case 65: goto L_0x0066;
                case 66: goto L_0x0056;
                case 67: goto L_0x004a;
                case 68: goto L_0x0042;
                default: goto L_0x003f;
            }
        L_0x003f:
            int r3 = r3 + 4
            goto L_0x0015
        L_0x0042:
            boolean r2 = r5.A0E(r6, r9, r3)
            if (r2 == 0) goto L_0x003f
            goto L_0x0367
        L_0x004a:
            boolean r2 = r5.A0E(r6, r9, r3)
            if (r2 == 0) goto L_0x003f
            long r10 = A09(r6, r0)
            goto L_0x0387
        L_0x0056:
            boolean r2 = r5.A0E(r6, r9, r3)
            if (r2 == 0) goto L_0x003f
            java.lang.Object r0 = X.C26267CwC.A01(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            goto L_0x039f
        L_0x0066:
            boolean r0 = r5.A0E(r6, r9, r3)
            if (r0 == 0) goto L_0x003f
            goto L_0x03b5
        L_0x006e:
            boolean r0 = r5.A0E(r6, r9, r3)
            if (r0 == 0) goto L_0x003f
            goto L_0x03c1
        L_0x0076:
            boolean r2 = r5.A0E(r6, r9, r3)
            if (r2 == 0) goto L_0x003f
            java.lang.Object r0 = X.C26267CwC.A01(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            goto L_0x03d0
        L_0x0086:
            boolean r2 = r5.A0E(r6, r9, r3)
            if (r2 == 0) goto L_0x003f
            java.lang.Object r0 = X.C26267CwC.A01(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            goto L_0x03e9
        L_0x0096:
            boolean r2 = r5.A0E(r6, r9, r3)
            if (r2 == 0) goto L_0x003f
            goto L_0x03f9
        L_0x009e:
            boolean r2 = r5.A0E(r6, r9, r3)
            if (r2 == 0) goto L_0x003f
            goto L_0x042f
        L_0x00a6:
            boolean r2 = r5.A0E(r6, r9, r3)
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r4.getObject(r6, r0)
            boolean r0 = r2 instanceof X.DSP
            if (r0 == 0) goto L_0x0419
            goto L_0x0409
        L_0x00b6:
            boolean r0 = r5.A0E(r6, r9, r3)
            if (r0 == 0) goto L_0x003f
            goto L_0x044c
        L_0x00be:
            boolean r0 = r5.A0E(r6, r9, r3)
            if (r0 == 0) goto L_0x003f
            int r0 = X.C26164Ctd.A02(r9)
            int r1 = r0 + 4
            goto L_0x04bb
        L_0x00cc:
            boolean r0 = r5.A0E(r6, r9, r3)
            if (r0 == 0) goto L_0x003f
            int r0 = X.C26164Ctd.A02(r9)
            int r8 = r0 + 8
            goto L_0x04a7
        L_0x00da:
            boolean r2 = r5.A0E(r6, r9, r3)
            if (r2 == 0) goto L_0x003f
            java.lang.Object r0 = X.C26267CwC.A01(r6, r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r8 = X.C26164Ctd.A02(r9)
            if (r1 < 0) goto L_0x03df
            goto L_0x03d6
        L_0x00f0:
            boolean r2 = r5.A0E(r6, r9, r3)
            if (r2 == 0) goto L_0x003f
            goto L_0x00fd
        L_0x00f7:
            boolean r2 = r5.A0E(r6, r9, r3)
            if (r2 == 0) goto L_0x003f
        L_0x00fd:
            long r0 = A09(r6, r0)
            int r8 = X.C26164Ctd.A02(r9)
            int r0 = X.C23301Bep.A01(r0)
            int r8 = r8 + r0
            goto L_0x04a7
        L_0x010c:
            boolean r0 = r5.A0E(r6, r9, r3)
            if (r0 == 0) goto L_0x003f
            int r0 = X.C26164Ctd.A02(r9)
            int r1 = r0 + 4
            goto L_0x04bb
        L_0x011a:
            boolean r0 = r5.A0E(r6, r9, r3)
            if (r0 == 0) goto L_0x003f
            int r0 = X.C26164Ctd.A02(r9)
            int r8 = r0 + 8
            goto L_0x04a7
        L_0x0128:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26297CxA.A02(r0)
            if (r2 <= 0) goto L_0x003f
            goto L_0x01df
        L_0x0136:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26297CxA.A06(r0)
            if (r2 <= 0) goto L_0x003f
            goto L_0x01df
        L_0x0144:
            java.lang.Object r0 = r4.getObject(r6, r0)
            int r0 = A08(r0)
            int r2 = r0 << 3
            if (r2 <= 0) goto L_0x003f
            goto L_0x01df
        L_0x0152:
            java.lang.Object r0 = r4.getObject(r6, r0)
            int r0 = A08(r0)
            int r2 = r0 << 2
            if (r2 <= 0) goto L_0x003f
            goto L_0x01df
        L_0x0160:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26297CxA.A03(r0)
            if (r2 <= 0) goto L_0x003f
            goto L_0x01df
        L_0x016d:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26297CxA.A05(r0)
            if (r2 <= 0) goto L_0x003f
            goto L_0x01df
        L_0x017a:
            java.lang.Object r0 = r4.getObject(r6, r0)
            int r2 = A08(r0)
            if (r2 <= 0) goto L_0x003f
            goto L_0x01df
        L_0x0185:
            java.lang.Object r0 = r4.getObject(r6, r0)
            int r0 = A08(r0)
            int r2 = r0 << 2
            if (r2 <= 0) goto L_0x003f
            goto L_0x01df
        L_0x0192:
            java.lang.Object r0 = r4.getObject(r6, r0)
            int r0 = A08(r0)
            int r2 = r0 << 3
            if (r2 <= 0) goto L_0x003f
            goto L_0x01df
        L_0x019f:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26297CxA.A04(r0)
            if (r2 <= 0) goto L_0x003f
            goto L_0x01df
        L_0x01ac:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26297CxA.A01(r0)
            if (r2 <= 0) goto L_0x003f
            goto L_0x01df
        L_0x01b9:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C26297CxA.A00(r0)
            if (r2 <= 0) goto L_0x003f
            goto L_0x01df
        L_0x01c6:
            java.lang.Object r0 = r4.getObject(r6, r0)
            int r0 = A08(r0)
            int r2 = r0 << 2
            if (r2 <= 0) goto L_0x003f
            goto L_0x01df
        L_0x01d3:
            java.lang.Object r0 = r4.getObject(r6, r0)
            int r0 = A08(r0)
            int r2 = r0 << 3
            if (r2 <= 0) goto L_0x003f
        L_0x01df:
            int r1 = X.C26164Ctd.A02(r9)
            boolean r0 = X.C23301Bep.A01
            int r0 = X.BEB.A02(r2)
            int r1 = r1 + r0
            int r1 = r1 + r2
            goto L_0x04bb
        L_0x01ed:
            java.lang.Object r2 = r4.getObject(r6, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0348
            int r0 = X.C26297CxA.A02(r2)
            int r8 = A01(r9, r1, r0)
            goto L_0x04a7
        L_0x0205:
            java.lang.Object r2 = r4.getObject(r6, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0348
            int r0 = X.C26297CxA.A06(r2)
            int r8 = A01(r9, r1, r0)
            goto L_0x04a7
        L_0x021d:
            java.lang.Object r2 = r4.getObject(r6, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0348
            int r0 = X.C26297CxA.A03(r2)
            int r8 = A01(r9, r1, r0)
            goto L_0x04a7
        L_0x0235:
            java.lang.Object r2 = r4.getObject(r6, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0348
            int r0 = X.C26297CxA.A05(r2)
            int r8 = A01(r9, r1, r0)
            goto L_0x04a7
        L_0x024d:
            java.lang.Object r2 = r4.getObject(r6, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r8 = r2.size()
            r1 = 0
            if (r8 == 0) goto L_0x0348
            int r0 = X.C26164Ctd.A02(r9)
            int r8 = r8 * r0
        L_0x0261:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x04a7
            java.lang.Object r0 = r2.get(r1)
            X.DSP r0 = (X.DSP) r0
            int r0 = r0.A02()
            int r8 = X.C26164Ctd.A03(r0, r8)
            int r1 = r1 + 1
            goto L_0x0261
        L_0x0278:
            java.lang.Object r11 = r4.getObject(r6, r0)
            java.util.List r11 = (java.util.List) r11
            X.EAC r10 = r5.A0A(r3)
            java.lang.Class r0 = X.C26297CxA.A03
            int r2 = r11.size()
            r1 = 0
            if (r2 == 0) goto L_0x0348
            int r8 = X.C26164Ctd.A02(r9)
            int r8 = r8 * r2
        L_0x0290:
            if (r1 >= r2) goto L_0x04a7
            java.lang.Object r0 = r11.get(r1)
            X.EDY r0 = (X.EDY) r0
            int r0 = X.C26919DJa.A04(r10, r0)
            int r8 = X.C26164Ctd.A03(r0, r8)
            int r1 = r1 + 1
            goto L_0x0290
        L_0x02a3:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.C26297CxA.A07(r0, r9)
            goto L_0x04a7
        L_0x02af:
            java.lang.Object r0 = r4.getObject(r6, r0)
            int r8 = A08(r0)
            if (r8 == 0) goto L_0x0348
            int r0 = X.C26164Ctd.A02(r9)
            int r0 = r0 + 1
            int r8 = r8 * r0
            goto L_0x04a7
        L_0x02c2:
            java.lang.Object r2 = r4.getObject(r6, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0348
            int r0 = X.C26297CxA.A04(r2)
            int r8 = A01(r9, r1, r0)
            goto L_0x04a7
        L_0x02da:
            java.lang.Object r2 = r4.getObject(r6, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0348
            int r0 = X.C26297CxA.A01(r2)
            int r8 = A01(r9, r1, r0)
            goto L_0x04a7
        L_0x02f2:
            java.lang.Object r2 = r4.getObject(r6, r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r0 = r2.size()
            if (r0 == 0) goto L_0x0348
            int r1 = X.C26297CxA.A00(r2)
            int r0 = r2.size()
            int r8 = A01(r9, r0, r1)
            goto L_0x04a7
        L_0x030e:
            java.lang.Object r0 = r4.getObject(r6, r0)
            int r8 = A08(r0)
            if (r8 == 0) goto L_0x0348
            int r0 = X.C26164Ctd.A02(r9)
            int r0 = r0 + 4
            int r8 = r8 * r0
            goto L_0x04a7
        L_0x0321:
            java.lang.Object r0 = r4.getObject(r6, r0)
            int r8 = A08(r0)
            if (r8 == 0) goto L_0x0348
            int r0 = X.C26164Ctd.A02(r9)
            int r0 = r0 + 8
            int r8 = r8 * r0
            goto L_0x04a7
        L_0x0334:
            java.lang.Object r12 = r4.getObject(r6, r0)
            java.util.List r12 = (java.util.List) r12
            X.EAC r11 = r5.A0A(r3)
            java.lang.Class r0 = X.C26297CxA.A03
            int r10 = r12.size()
            r2 = 0
            r8 = 0
            if (r10 != 0) goto L_0x034b
        L_0x0348:
            r8 = 0
            goto L_0x04a7
        L_0x034b:
            if (r2 >= r10) goto L_0x04a7
            java.lang.Object r0 = r12.get(r2)
            X.EDY r0 = (X.EDY) r0
            boolean r1 = X.C23301Bep.A01
            int r1 = X.C26164Ctd.A02(r9)
            int r1 = r1 << 1
            int r0 = X.C26919DJa.A04(r11, r0)
            int r1 = r1 + r0
            int r8 = r8 + r1
            int r2 = r2 + 1
            goto L_0x034b
        L_0x0364:
            r2 = r2 & r13
            if (r2 == 0) goto L_0x003f
        L_0x0367:
            java.lang.Object r2 = r4.getObject(r6, r0)
            X.EDY r2 = (X.EDY) r2
            X.EAC r1 = r5.A0A(r3)
            boolean r0 = X.C23301Bep.A01
            int r0 = X.C26164Ctd.A02(r9)
            int r8 = r0 << 1
            int r0 = X.C26919DJa.A04(r1, r2)
            int r8 = r8 + r0
            goto L_0x04a7
        L_0x0380:
            r2 = r2 & r13
            if (r2 == 0) goto L_0x003f
            long r10 = r4.getLong(r6, r0)
        L_0x0387:
            int r8 = X.C26164Ctd.A02(r9)
            long r1 = r10 << r15
            r0 = 63
            long r10 = r10 >> r0
            long r10 = r10 ^ r1
            int r0 = X.C23301Bep.A01(r10)
            int r8 = r8 + r0
            goto L_0x04a7
        L_0x0398:
            r2 = r2 & r13
            if (r2 == 0) goto L_0x003f
            int r1 = r4.getInt(r6, r0)
        L_0x039f:
            int r8 = X.C26164Ctd.A02(r9)
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            boolean r0 = X.C23301Bep.A01
            int r0 = X.BEB.A02(r1)
            int r8 = r8 + r0
            goto L_0x04a7
        L_0x03b1:
            r0 = r13 & r2
            if (r0 == 0) goto L_0x003f
        L_0x03b5:
            int r0 = X.C26164Ctd.A02(r9)
            int r8 = r0 + 8
            goto L_0x04a7
        L_0x03bd:
            r0 = r13 & r2
            if (r0 == 0) goto L_0x003f
        L_0x03c1:
            int r0 = X.C26164Ctd.A02(r9)
            int r1 = r0 + 4
            goto L_0x04bb
        L_0x03c9:
            r2 = r2 & r13
            if (r2 == 0) goto L_0x003f
            int r1 = r4.getInt(r6, r0)
        L_0x03d0:
            int r8 = X.C26164Ctd.A02(r9)
            if (r1 < 0) goto L_0x03df
        L_0x03d6:
            boolean r0 = X.C23301Bep.A01
            int r0 = X.BEB.A02(r1)
        L_0x03dc:
            int r8 = r8 + r0
            goto L_0x04a7
        L_0x03df:
            r0 = 10
            goto L_0x03dc
        L_0x03e2:
            r2 = r2 & r13
            if (r2 == 0) goto L_0x003f
            int r1 = r4.getInt(r6, r0)
        L_0x03e9:
            int r8 = X.C26164Ctd.A02(r9)
            boolean r0 = X.C23301Bep.A01
            int r0 = X.BEB.A02(r1)
            int r8 = r8 + r0
            goto L_0x04a7
        L_0x03f6:
            r2 = r2 & r13
            if (r2 == 0) goto L_0x003f
        L_0x03f9:
            java.lang.Object r2 = r4.getObject(r6, r0)
            goto L_0x0409
        L_0x03fe:
            r2 = r2 & r13
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r4.getObject(r6, r0)
            boolean r0 = r2 instanceof X.DSP
            if (r0 == 0) goto L_0x0419
        L_0x0409:
            X.DSP r2 = (X.DSP) r2
            int r1 = X.C26164Ctd.A02(r9)
            int r0 = r2.A02()
            int r8 = X.C26164Ctd.A03(r0, r1)
            goto L_0x04a7
        L_0x0419:
            java.lang.String r2 = (java.lang.String) r2
            int r8 = X.C26164Ctd.A02(r9)
            int r0 = X.C25908CoM.A00(r2)     // Catch:{ C2d -> 0x0424 }
            goto L_0x0443
        L_0x0424:
            java.nio.charset.Charset r0 = X.C25461CgE.A00
            byte[] r0 = r2.getBytes(r0)
            int r0 = r0.length
            goto L_0x0443
        L_0x042c:
            r2 = r2 & r13
            if (r2 == 0) goto L_0x003f
        L_0x042f:
            java.lang.Object r2 = r4.getObject(r6, r0)
            X.EAC r1 = r5.A0A(r3)
            java.lang.Class r0 = X.C26297CxA.A03
            X.EDY r2 = (X.EDY) r2
            int r8 = X.C26164Ctd.A02(r9)
            int r0 = X.C26919DJa.A04(r1, r2)
        L_0x0443:
            int r8 = X.C26164Ctd.A03(r0, r8)
            goto L_0x04a7
        L_0x0448:
            r0 = r13 & r2
            if (r0 == 0) goto L_0x003f
        L_0x044c:
            int r0 = X.C26164Ctd.A02(r9)
            int r8 = r0 + 1
            goto L_0x04a7
        L_0x0453:
            r0 = r13 & r2
            if (r0 == 0) goto L_0x003f
            int r0 = X.C26164Ctd.A02(r9)
            int r1 = r0 + 4
            goto L_0x04bb
        L_0x045e:
            r0 = r13 & r2
            if (r0 == 0) goto L_0x003f
            int r0 = X.C26164Ctd.A02(r9)
            int r1 = r0 + 8
            goto L_0x04bb
        L_0x0469:
            r2 = r2 & r13
            if (r2 == 0) goto L_0x003f
            int r2 = r4.getInt(r6, r0)
            int r1 = X.C26164Ctd.A02(r9)
            if (r2 < 0) goto L_0x047e
            boolean r0 = X.C23301Bep.A01
            int r0 = X.BEB.A02(r2)
        L_0x047c:
            int r1 = r1 + r0
            goto L_0x04bb
        L_0x047e:
            r0 = 10
            goto L_0x047c
        L_0x0481:
            r2 = r2 & r13
            if (r2 == 0) goto L_0x003f
            long r10 = r4.getLong(r6, r0)
            int r1 = X.C26164Ctd.A02(r9)
            int r0 = X.C23301Bep.A01(r10)
            int r1 = r1 + r0
            goto L_0x04bb
        L_0x0492:
            r0 = r13 & r2
            if (r0 == 0) goto L_0x003f
            int r0 = X.C26164Ctd.A02(r9)
            int r8 = r0 + 8
            goto L_0x04a7
        L_0x049d:
            r0 = r13 & r2
            if (r0 == 0) goto L_0x003f
            int r0 = X.C26164Ctd.A02(r9)
            int r8 = r0 + 4
        L_0x04a7:
            int r16 = r16 + r8
            goto L_0x003f
        L_0x04ab:
            r2 = r2 & r13
            if (r2 == 0) goto L_0x003f
            long r10 = r4.getLong(r6, r0)
            int r1 = X.C26164Ctd.A02(r9)
            int r0 = X.C23301Bep.A01(r10)
            int r1 = r1 + r0
        L_0x04bb:
            int r16 = r16 + r1
            goto L_0x003f
        L_0x04bf:
            r2 = 0
            goto L_0x003a
        L_0x04c2:
            r4.getObject(r6, r0)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x04cc:
            X.Beh r6 = (X.C23293Beh) r6
            X.Cmt r0 = r6.zzjp
            int r0 = r0.A00()
            int r16 = r16 + r0
            return r16
        L_0x04d7:
            int[] r2 = r5.A02
            int r0 = r2.length
            if (r3 >= r0) goto L_0x0987
            int r0 = r3 + 1
            r1 = r2[r0]
            r0 = r1 & r7
            int r7 = r0 >>> 20
            r8 = r2[r3]
            r1 = r1 & r14
            long r1 = (long) r1
            X.C02[] r0 = X.C02.A00
            switch(r7) {
                case 0: goto L_0x07fe;
                case 1: goto L_0x07f0;
                case 2: goto L_0x07d9;
                case 3: goto L_0x07c2;
                case 4: goto L_0x07a4;
                case 5: goto L_0x0796;
                case 6: goto L_0x0788;
                case 7: goto L_0x077a;
                case 8: goto L_0x0729;
                case 9: goto L_0x075a;
                case 10: goto L_0x071e;
                case 11: goto L_0x0705;
                case 12: goto L_0x06f1;
                case 13: goto L_0x06e3;
                case 14: goto L_0x06d5;
                case 15: goto L_0x06b7;
                case 16: goto L_0x069a;
                case 17: goto L_0x067b;
                case 18: goto L_0x093a;
                case 19: goto L_0x0928;
                case 20: goto L_0x090d;
                case 21: goto L_0x08f6;
                case 22: goto L_0x08df;
                case 23: goto L_0x093a;
                case 24: goto L_0x0928;
                case 25: goto L_0x08cd;
                case 26: goto L_0x08c2;
                case 27: goto L_0x0897;
                case 28: goto L_0x086c;
                case 29: goto L_0x0854;
                case 30: goto L_0x083c;
                case 31: goto L_0x0928;
                case 32: goto L_0x093a;
                case 33: goto L_0x0824;
                case 34: goto L_0x080c;
                case 35: goto L_0x0661;
                case 36: goto L_0x0654;
                case 37: goto L_0x0647;
                case 38: goto L_0x063a;
                case 39: goto L_0x062d;
                case 40: goto L_0x0620;
                case 41: goto L_0x0613;
                case 42: goto L_0x0608;
                case 43: goto L_0x05fb;
                case 44: goto L_0x05ee;
                case 45: goto L_0x05e0;
                case 46: goto L_0x05d2;
                case 47: goto L_0x05c4;
                case 48: goto L_0x05b6;
                case 49: goto L_0x094e;
                case 50: goto L_0x097d;
                case 51: goto L_0x05ae;
                case 52: goto L_0x05a6;
                case 53: goto L_0x059a;
                case 54: goto L_0x058e;
                case 55: goto L_0x057e;
                case 56: goto L_0x0576;
                case 57: goto L_0x056e;
                case 58: goto L_0x0566;
                case 59: goto L_0x0556;
                case 60: goto L_0x054e;
                case 61: goto L_0x0546;
                case 62: goto L_0x0536;
                case 63: goto L_0x0526;
                case 64: goto L_0x051e;
                case 65: goto L_0x0516;
                case 66: goto L_0x0506;
                case 67: goto L_0x04fa;
                case 68: goto L_0x04f2;
                default: goto L_0x04ed;
            }
        L_0x04ed:
            int r3 = r3 + 4
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x04d7
        L_0x04f2:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            goto L_0x0681
        L_0x04fa:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            long r9 = A09(r6, r1)
            goto L_0x06a6
        L_0x0506:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            java.lang.Object r0 = X.C26267CwC.A01(r6, r1)
            int r1 = X.AnonymousClass000.A0M(r0)
            goto L_0x06c3
        L_0x0516:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            goto L_0x06db
        L_0x051e:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            goto L_0x06e9
        L_0x0526:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            java.lang.Object r0 = X.C26267CwC.A01(r6, r1)
            int r1 = X.AnonymousClass000.A0M(r0)
            goto L_0x06fd
        L_0x0536:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            java.lang.Object r0 = X.C26267CwC.A01(r6, r1)
            int r1 = X.AnonymousClass000.A0M(r0)
            goto L_0x0711
        L_0x0546:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            goto L_0x0724
        L_0x054e:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            goto L_0x0760
        L_0x0556:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            java.lang.Object r2 = X.C26267CwC.A01(r6, r1)
            boolean r0 = r2 instanceof X.DSP
            if (r0 == 0) goto L_0x0747
            goto L_0x0737
        L_0x0566:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            goto L_0x0780
        L_0x056e:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            goto L_0x078e
        L_0x0576:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            goto L_0x079c
        L_0x057e:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            java.lang.Object r0 = X.C26267CwC.A01(r6, r1)
            int r1 = X.AnonymousClass000.A0M(r0)
            goto L_0x07b0
        L_0x058e:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            long r0 = A09(r6, r1)
            goto L_0x07ce
        L_0x059a:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            long r0 = A09(r6, r1)
            goto L_0x07e5
        L_0x05a6:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            goto L_0x07f6
        L_0x05ae:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04ed
            goto L_0x0804
        L_0x05b6:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26297CxA.A02(r0)
            if (r1 <= 0) goto L_0x04ed
            goto L_0x066d
        L_0x05c4:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26297CxA.A06(r0)
            if (r1 <= 0) goto L_0x04ed
            goto L_0x066d
        L_0x05d2:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A08(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x04ed
            goto L_0x066d
        L_0x05e0:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A08(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x04ed
            goto L_0x066d
        L_0x05ee:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26297CxA.A03(r0)
            if (r1 <= 0) goto L_0x04ed
            goto L_0x066d
        L_0x05fb:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26297CxA.A05(r0)
            if (r1 <= 0) goto L_0x04ed
            goto L_0x066d
        L_0x0608:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r1 = A08(r0)
            if (r1 <= 0) goto L_0x04ed
            goto L_0x066d
        L_0x0613:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A08(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x04ed
            goto L_0x066d
        L_0x0620:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A08(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x04ed
            goto L_0x066d
        L_0x062d:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26297CxA.A04(r0)
            if (r1 <= 0) goto L_0x04ed
            goto L_0x066d
        L_0x063a:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26297CxA.A01(r0)
            if (r1 <= 0) goto L_0x04ed
            goto L_0x066d
        L_0x0647:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C26297CxA.A00(r0)
            if (r1 <= 0) goto L_0x04ed
            goto L_0x066d
        L_0x0654:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A08(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x04ed
            goto L_0x066d
        L_0x0661:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A08(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x04ed
        L_0x066d:
            int r7 = X.C26164Ctd.A02(r8)
            boolean r0 = X.C23301Bep.A01
            int r0 = X.BEB.A02(r1)
            int r7 = r7 + r0
            int r7 = r7 + r1
            goto L_0x094b
        L_0x067b:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
        L_0x0681:
            java.lang.Object r2 = X.C26267CwC.A01(r6, r1)
            X.EDY r2 = (X.EDY) r2
            X.EAC r1 = r5.A0A(r3)
            boolean r0 = X.C23301Bep.A01
            int r0 = X.C26164Ctd.A02(r8)
            int r7 = r0 << 1
            int r0 = X.C26919DJa.A04(r1, r2)
            int r7 = r7 + r0
            goto L_0x094b
        L_0x069a:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
            X.CnI r0 = X.C26267CwC.A02
            long r9 = r0.A05(r6, r1)
        L_0x06a6:
            int r7 = X.C26164Ctd.A02(r8)
            long r1 = r9 << r15
            r0 = 63
            long r9 = r9 >> r0
            long r9 = r9 ^ r1
            int r0 = X.C23301Bep.A01(r9)
            int r7 = r7 + r0
            goto L_0x094b
        L_0x06b7:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
            X.CnI r0 = X.C26267CwC.A02
            int r1 = r0.A04(r6, r1)
        L_0x06c3:
            int r7 = X.C26164Ctd.A02(r8)
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            boolean r0 = X.C23301Bep.A01
            int r0 = X.BEB.A02(r1)
            int r7 = r7 + r0
            goto L_0x094b
        L_0x06d5:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
        L_0x06db:
            int r0 = X.C26164Ctd.A02(r8)
            int r7 = r0 + 8
            goto L_0x094b
        L_0x06e3:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
        L_0x06e9:
            int r0 = X.C26164Ctd.A02(r8)
            int r7 = r0 + 4
            goto L_0x094b
        L_0x06f1:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
            X.CnI r0 = X.C26267CwC.A02
            int r1 = r0.A04(r6, r1)
        L_0x06fd:
            int r7 = X.C26164Ctd.A02(r8)
            if (r1 < 0) goto L_0x07bf
            goto L_0x07b6
        L_0x0705:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
            X.CnI r0 = X.C26267CwC.A02
            int r1 = r0.A04(r6, r1)
        L_0x0711:
            int r7 = X.C26164Ctd.A02(r8)
            boolean r0 = X.C23301Bep.A01
            int r0 = X.BEB.A02(r1)
            int r7 = r7 + r0
            goto L_0x094b
        L_0x071e:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
        L_0x0724:
            java.lang.Object r2 = X.C26267CwC.A01(r6, r1)
            goto L_0x0737
        L_0x0729:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
            java.lang.Object r2 = X.C26267CwC.A01(r6, r1)
            boolean r0 = r2 instanceof X.DSP
            if (r0 == 0) goto L_0x0747
        L_0x0737:
            X.DSP r2 = (X.DSP) r2
            int r1 = X.C26164Ctd.A02(r8)
            int r0 = r2.A02()
            int r7 = X.C26164Ctd.A03(r0, r1)
            goto L_0x094b
        L_0x0747:
            java.lang.String r2 = (java.lang.String) r2
            int r7 = X.C26164Ctd.A02(r8)
            int r0 = X.C25908CoM.A00(r2)     // Catch:{ C2d -> 0x0752 }
            goto L_0x0774
        L_0x0752:
            java.nio.charset.Charset r0 = X.C25461CgE.A00
            byte[] r0 = r2.getBytes(r0)
            int r0 = r0.length
            goto L_0x0774
        L_0x075a:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
        L_0x0760:
            java.lang.Object r2 = X.C26267CwC.A01(r6, r1)
            X.EAC r1 = r5.A0A(r3)
            java.lang.Class r0 = X.C26297CxA.A03
            X.EDY r2 = (X.EDY) r2
            int r7 = X.C26164Ctd.A02(r8)
            int r0 = X.C26919DJa.A04(r1, r2)
        L_0x0774:
            int r7 = X.C26164Ctd.A03(r0, r7)
            goto L_0x094b
        L_0x077a:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
        L_0x0780:
            int r0 = X.C26164Ctd.A02(r8)
            int r7 = r0 + 1
            goto L_0x094b
        L_0x0788:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
        L_0x078e:
            int r0 = X.C26164Ctd.A02(r8)
            int r7 = r0 + 4
            goto L_0x094b
        L_0x0796:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
        L_0x079c:
            int r0 = X.C26164Ctd.A02(r8)
            int r7 = r0 + 8
            goto L_0x094b
        L_0x07a4:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
            X.CnI r0 = X.C26267CwC.A02
            int r1 = r0.A04(r6, r1)
        L_0x07b0:
            int r7 = X.C26164Ctd.A02(r8)
            if (r1 < 0) goto L_0x07bf
        L_0x07b6:
            boolean r0 = X.C23301Bep.A01
            int r0 = X.BEB.A02(r1)
        L_0x07bc:
            int r7 = r7 + r0
            goto L_0x094b
        L_0x07bf:
            r0 = 10
            goto L_0x07bc
        L_0x07c2:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
            X.CnI r0 = X.C26267CwC.A02
            long r0 = r0.A05(r6, r1)
        L_0x07ce:
            int r7 = X.C26164Ctd.A02(r8)
            int r0 = X.C23301Bep.A01(r0)
            int r7 = r7 + r0
            goto L_0x094b
        L_0x07d9:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
            X.CnI r0 = X.C26267CwC.A02
            long r0 = r0.A05(r6, r1)
        L_0x07e5:
            int r7 = X.C26164Ctd.A02(r8)
            int r0 = X.C23301Bep.A01(r0)
            int r7 = r7 + r0
            goto L_0x094b
        L_0x07f0:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
        L_0x07f6:
            int r0 = X.C26164Ctd.A02(r8)
            int r7 = r0 + 4
            goto L_0x094b
        L_0x07fe:
            boolean r0 = r5.A0D(r6, r3)
            if (r0 == 0) goto L_0x04ed
        L_0x0804:
            int r0 = X.C26164Ctd.A02(r8)
            int r7 = r0 + 8
            goto L_0x094b
        L_0x080c:
            java.lang.Object r2 = X.C26267CwC.A01(r6, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0962
            int r0 = X.C26297CxA.A02(r2)
            int r7 = A01(r8, r1, r0)
            goto L_0x094b
        L_0x0824:
            java.lang.Object r2 = X.C26267CwC.A01(r6, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0962
            int r0 = X.C26297CxA.A06(r2)
            int r7 = A01(r8, r1, r0)
            goto L_0x094b
        L_0x083c:
            java.lang.Object r2 = X.C26267CwC.A01(r6, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0962
            int r0 = X.C26297CxA.A03(r2)
            int r7 = A01(r8, r1, r0)
            goto L_0x094b
        L_0x0854:
            java.lang.Object r2 = X.C26267CwC.A01(r6, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0962
            int r0 = X.C26297CxA.A05(r2)
            int r7 = A01(r8, r1, r0)
            goto L_0x094b
        L_0x086c:
            java.lang.Object r2 = X.C26267CwC.A01(r6, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r7 = r2.size()
            r1 = 0
            if (r7 == 0) goto L_0x0962
            int r0 = X.C26164Ctd.A02(r8)
            int r7 = r7 * r0
        L_0x0880:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x094b
            java.lang.Object r0 = r2.get(r1)
            X.DSP r0 = (X.DSP) r0
            int r0 = r0.A02()
            int r7 = X.C26164Ctd.A03(r0, r7)
            int r1 = r1 + 1
            goto L_0x0880
        L_0x0897:
            java.lang.Object r10 = X.C26267CwC.A01(r6, r1)
            java.util.List r10 = (java.util.List) r10
            X.EAC r9 = r5.A0A(r3)
            java.lang.Class r0 = X.C26297CxA.A03
            int r2 = r10.size()
            r1 = 0
            if (r2 == 0) goto L_0x0962
            int r7 = X.C26164Ctd.A02(r8)
            int r7 = r7 * r2
        L_0x08af:
            if (r1 >= r2) goto L_0x094b
            java.lang.Object r0 = r10.get(r1)
            X.EDY r0 = (X.EDY) r0
            int r0 = X.C26919DJa.A04(r9, r0)
            int r7 = X.C26164Ctd.A03(r0, r7)
            int r1 = r1 + 1
            goto L_0x08af
        L_0x08c2:
            java.lang.Object r0 = X.C26267CwC.A01(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r7 = X.C26297CxA.A07(r0, r8)
            goto L_0x094b
        L_0x08cd:
            java.lang.Object r0 = X.C26267CwC.A01(r6, r1)
            int r7 = A08(r0)
            if (r7 == 0) goto L_0x0962
            int r0 = X.C26164Ctd.A02(r8)
            int r0 = r0 + 1
            int r7 = r7 * r0
            goto L_0x094b
        L_0x08df:
            java.lang.Object r2 = X.C26267CwC.A01(r6, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0962
            int r0 = X.C26297CxA.A04(r2)
            int r7 = A01(r8, r1, r0)
            goto L_0x094b
        L_0x08f6:
            java.lang.Object r2 = X.C26267CwC.A01(r6, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r1 = r2.size()
            if (r1 == 0) goto L_0x0962
            int r0 = X.C26297CxA.A01(r2)
            int r7 = A01(r8, r1, r0)
            goto L_0x094b
        L_0x090d:
            java.lang.Object r2 = X.C26267CwC.A01(r6, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r0 = X.C26297CxA.A03
            int r0 = r2.size()
            if (r0 == 0) goto L_0x0962
            int r1 = X.C26297CxA.A00(r2)
            int r0 = r2.size()
            int r7 = A01(r8, r0, r1)
            goto L_0x094b
        L_0x0928:
            java.lang.Object r0 = X.C26267CwC.A01(r6, r1)
            int r7 = A08(r0)
            if (r7 == 0) goto L_0x0962
            int r0 = X.C26164Ctd.A02(r8)
            int r0 = r0 + 4
            int r7 = r7 * r0
            goto L_0x094b
        L_0x093a:
            java.lang.Object r0 = X.C26267CwC.A01(r6, r1)
            int r7 = A08(r0)
            if (r7 == 0) goto L_0x0962
            int r0 = X.C26164Ctd.A02(r8)
            int r0 = r0 + 8
            int r7 = r7 * r0
        L_0x094b:
            int r13 = r13 + r7
            goto L_0x04ed
        L_0x094e:
            java.lang.Object r12 = X.C26267CwC.A01(r6, r1)
            java.util.List r12 = (java.util.List) r12
            X.EAC r11 = r5.A0A(r3)
            java.lang.Class r0 = X.C26297CxA.A03
            int r10 = r12.size()
            r9 = 0
            r7 = 0
            if (r10 != 0) goto L_0x0964
        L_0x0962:
            r7 = 0
            goto L_0x094b
        L_0x0964:
            if (r9 >= r10) goto L_0x094b
            java.lang.Object r2 = r12.get(r9)
            X.EDY r2 = (X.EDY) r2
            boolean r0 = X.C23301Bep.A01
            int r0 = X.C26164Ctd.A02(r8)
            int r1 = r0 << 1
            int r0 = X.C26919DJa.A04(r11, r2)
            int r1 = r1 + r0
            int r7 = r7 + r1
            int r9 = r9 + 1
            goto L_0x0964
        L_0x097d:
            X.C26267CwC.A01(r6, r1)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0987:
            X.Beh r6 = (X.C23293Beh) r6
            X.Cmt r0 = r6.zzjp
            int r0 = r0.A00()
            int r13 = r13 + r0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26923DJe.CTi(java.lang.Object):int");
    }

    public final boolean CTk(Object obj) {
        int length;
        int i;
        boolean z;
        int[] iArr = this.A0C;
        boolean z2 = true;
        if (iArr == null || (length = iArr.length) == 0) {
            return z2;
        }
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        do {
            int i5 = iArr[i3];
            int A002 = A00(i5);
            int[] iArr2 = this.A02;
            int i6 = iArr2[A002 + 1];
            boolean z3 = this.A01;
            Object obj2 = obj;
            if (!z3) {
                int i7 = iArr2[A002 + 2];
                int i8 = i7 & 1048575;
                i = (z2 ? 1 : 0) << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = A0F.getInt(obj2, (long) i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if ((268435456 & i6) != 0) {
                if (z3) {
                    if (!A0D(obj2, A002)) {
                        return false;
                    }
                } else if ((i4 & i) == 0) {
                    return false;
                }
            }
            int i9 = (267386880 & i6) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        z = A0E(obj2, i5, A002);
                    } else if (i9 != 49) {
                        if (i9 == 50) {
                            C26267CwC.A01(obj2, (long) (i6 & 1048575));
                            throw AnonymousClass000.A0s("isEmpty");
                        }
                        i3++;
                        z2 = true;
                    }
                }
                List A0B2 = A0B(i6, obj2);
                if (!A0B2.isEmpty()) {
                    EAC A0A2 = A0A(A002);
                    for (int i10 = 0; i10 < A0B2.size(); i10++) {
                        if (!A0A2.CTk(A0B2.get(i10))) {
                            return false;
                        }
                    }
                }
                i3++;
                z2 = true;
            } else if (z3) {
                z = A0D(obj2, A002);
            } else {
                z = i4 & i;
            }
            if (z && !A0A(A002).CTk(C26267CwC.A01(obj2, (long) (i6 & 1048575)))) {
                return false;
            }
            i3++;
            z2 = true;
        } while (i3 < length);
        return z2;
    }

    public static int A07(CQ8 cq8, byte[] bArr, int i) {
        int A012 = C26163Ctc.A01(cq8, bArr, i);
        int i2 = cq8.A00;
        if (i2 == 0) {
            cq8.A02 = "";
            return A012;
        }
        if (C25908CoM.A00.A01(bArr, A012, A012 + i2) == 0) {
            cq8.A02 = BE6.A0r(C25461CgE.A00, bArr, A012, i2);
            return A012 + i2;
        }
        throw new C24203BxF("Protocol message had invalid UTF-8.");
    }

    public static long A09(Object obj, long j) {
        return ((Number) C26267CwC.A01(obj, j)).longValue();
    }

    public static List A0B(int i, Object obj) {
        return (List) C26267CwC.A01(obj, (long) (i & 1048575));
    }
}
