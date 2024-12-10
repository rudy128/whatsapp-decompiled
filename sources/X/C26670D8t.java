package X;

import java.util.Arrays;

/* renamed from: X.D8t  reason: case insensitive filesystem */
public class C26670D8t implements C28585E8y {
    public CZO A00;
    public D9O A01;
    public boolean A02;

    private boolean A00(C26036Cqw cqw) {
        CZO czo;
        CZF czf = new CZF();
        if (czf.A01(cqw, true) && (czf.A03 & 2) == 2) {
            int min = Math.min(czf.A00, 8);
            C26207Cui cui = new C26207Cui(min);
            cqw.A03(cui.A02, 0, min);
            cui.A0I(0);
            if (cui.A00 - cui.A01 >= 5 && cui.A04() == 127 && cui.A09() == 1179402563) {
                czo = new CZO();
            } else {
                cui.A0I(0);
                try {
                    if (C86.A00(cui, 1, true)) {
                        czo = new CZO();
                    }
                } catch (C24215BxS unused) {
                }
                cui.A0I(0);
                int i = cui.A00 - cui.A01;
                byte[] bArr = C22772BOl.A01;
                if (i >= 8) {
                    byte[] bArr2 = new byte[8];
                    cui.A0K(bArr2, 0, 8);
                    if (Arrays.equals(bArr2, bArr)) {
                        czo = new CZO();
                    }
                }
            }
            this.A00 = czo;
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: X.E8Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v119, resolved type: X.E8Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v120, resolved type: X.E8Y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int CDJ(X.C26036Cqw r24, X.C24761CIy r25) {
        /*
            r23 = this;
            r5 = r23
            X.CZO r0 = r5.A00
            r3 = r24
            if (r0 != 0) goto L_0x0011
            boolean r0 = r5.A00(r3)
            if (r0 == 0) goto L_0x02bc
            r0 = 0
            r3.A01 = r0
        L_0x0011:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0035
            X.D9O r1 = r5.A01
            r0 = 0
            r4 = 1
            X.E8z r2 = r1.A05(r0)
            X.D9O r0 = r5.A01
            r0.A0G = r4
            android.os.Handler r1 = r0.A0O
            java.lang.Runnable r0 = r0.A0U
            r1.post(r0)
            X.CZO r1 = r5.A00
            X.D9O r0 = r5.A01
            r1.A09 = r0
            r1.A06 = r2
            r1.A00(r4)
            r5.A02 = r4
        L_0x0035:
            X.CZO r7 = r5.A00
            int r0 = r7.A01
            if (r0 == 0) goto L_0x0061
            r6 = 1
            r4 = 2
            if (r0 == r6) goto L_0x0057
            if (r0 != r4) goto L_0x0052
            X.E8Y r0 = r7.A07
            long r8 = r0.CDL(r3)
            r4 = 0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00e9
            r0 = r25
            r0.A00 = r8
            return r6
        L_0x0052:
            java.lang.IllegalStateException r0 = X.BE6.A0k()
            throw r0
        L_0x0057:
            long r1 = r7.A04
            int r0 = (int) r1
            r3.A02(r0)
            r7.A01 = r4
            goto L_0x01d5
        L_0x0061:
            X.CWS r4 = r7.A0C
            boolean r0 = r4.A00(r3)
            if (r0 == 0) goto L_0x02b7
            long r5 = r3.A02
            long r0 = r7.A04
            long r5 = r5 - r0
            r7.A03 = r5
            X.Cui r10 = r4.A03
            X.CMk r2 = r7.A08
            boolean r0 = r7.A01(r2, r10, r0)
            if (r0 == 0) goto L_0x007f
            long r0 = r3.A02
            r7.A04 = r0
            goto L_0x0061
        L_0x007f:
            X.CMk r0 = r7.A08
            X.D48 r2 = r0.A00
            int r0 = r2.A0F
            r7.A00 = r0
            boolean r0 = r7.A0A
            r1 = 1
            if (r0 != 0) goto L_0x0093
            X.E8z r0 = r7.A06
            r0.BLZ(r2)
            r7.A0A = r1
        L_0x0093:
            X.CMk r0 = r7.A08
            X.E8Y r0 = r0.A01
            r11 = 0
            if (r0 != 0) goto L_0x00a7
            long r8 = r3.A04
            r1 = -1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c4
            X.D94 r0 = new X.D94
            r0.<init>()
        L_0x00a7:
            r7.A07 = r0
        L_0x00a9:
            r7.A08 = r11
            r0 = 2
            r7.A01 = r0
            byte[] r2 = r10.A02
            int r0 = r2.length
            r1 = 65025(0xfe01, float:9.112E-41)
            if (r0 == r1) goto L_0x01d5
            int r0 = r10.A00
            int r0 = java.lang.Math.max(r1, r0)
            byte[] r0 = java.util.Arrays.copyOf(r2, r0)
            r10.A02 = r0
            goto L_0x01d5
        L_0x00c4:
            X.CZF r6 = r4.A02
            int r0 = r6.A03
            r0 = r0 & 4
            boolean r22 = X.AnonymousClass000.A1O(r0)
            long r4 = r7.A04
            int r1 = r6.A01
            int r0 = r6.A00
            int r1 = r1 + r0
            long r2 = (long) r1
            long r0 = r6.A04
            X.D95 r6 = new X.D95
            r12 = r6
            r13 = r7
            r14 = r4
            r16 = r8
            r18 = r2
            r20 = r0
            r12.<init>(r13, r14, r16, r18, r20, r22)
            r7.A07 = r6
            goto L_0x00a9
        L_0x00e9:
            r19 = -1
            int r0 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r0 >= 0) goto L_0x010d
            r0 = 2
            long r8 = r8 + r0
            long r0 = -r8
            boolean r2 = r7 instanceof X.C22771BOk
            if (r2 == 0) goto L_0x0293
            r9 = r7
            X.BOk r9 = (X.C22771BOk) r9
            r9.A02 = r0
            r8 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r2)
            r9.A04 = r0
            X.CSk r0 = r9.A03
            if (r0 == 0) goto L_0x010b
            int r8 = r0.A01
        L_0x010b:
            r9.A00 = r8
        L_0x010d:
            boolean r0 = r7.A0B
            if (r0 != 0) goto L_0x0124
            X.E8Y r0 = r7.A07
            X.E8W r1 = r0.BHo()
            X.D9O r0 = r7.A09
            r0.A07 = r1
            android.os.Handler r1 = r0.A0O
            java.lang.Runnable r0 = r0.A0U
            r1.post(r0)
            r7.A0B = r6
        L_0x0124:
            long r0 = r7.A03
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0132
            X.CWS r0 = r7.A0C
            boolean r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x02b7
        L_0x0132:
            r7.A03 = r4
            X.CWS r0 = r7.A0C
            X.Cui r8 = r0.A03
            boolean r0 = r7 instanceof X.C22771BOk
            if (r0 == 0) goto L_0x01da
            r10 = r7
            X.BOk r10 = (X.C22771BOk) r10
            byte[] r0 = r8.A02
            r2 = 0
            byte r9 = r0[r2]
            r0 = r9 & 1
            if (r0 == r6) goto L_0x028f
            X.CSH r3 = r10.A01
            int r0 = r3.A00
            int r9 = r9 >> r6
            int r1 = 8 - r0
            r0 = 255(0xff, float:3.57E-43)
            int r0 = r0 >>> r1
            r9 = r9 & r0
            X.CJ0[] r0 = r3.A04
            r0 = r0[r9]
            boolean r1 = r0.A00
            X.CSk r0 = r3.A02
            if (r1 != 0) goto L_0x01d7
            int r12 = r0.A01
        L_0x015f:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0168
            int r0 = r10.A00
            int r0 = r0 + r12
            int r2 = r0 / 4
        L_0x0168:
            long r2 = (long) r2
            int r0 = r8.A00
            int r0 = r0 + 4
            r8.A0H(r0)
            byte[] r9 = r8.A02
            int r11 = r8.A00
            int r14 = r11 + -4
            r15 = 255(0xff, double:1.26E-321)
            long r0 = r2 & r15
            int r13 = (int) r0
            byte r0 = (byte) r13
            r9[r14] = r0
            int r14 = r11 + -3
            r0 = 8
            long r0 = r2 >>> r0
            long r0 = r0 & r15
            int r13 = (int) r0
            byte r0 = (byte) r13
            r9[r14] = r0
            int r14 = r11 + -2
            r0 = 16
            long r0 = r2 >>> r0
            long r0 = r0 & r15
            int r13 = (int) r0
            byte r0 = (byte) r13
            r9[r14] = r0
            int r13 = r11 + -1
            r0 = 24
            long r0 = r2 >>> r0
            long r0 = r0 & r15
            int r11 = (int) r0
            byte r0 = (byte) r11
            r9[r13] = r0
            r10.A04 = r6
            r10.A00 = r12
        L_0x01a3:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01d0
            long r0 = r7.A02
            long r10 = r0 + r2
            long r4 = r7.A05
            int r9 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x01d0
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r4
            int r4 = r7.A00
            long r4 = (long) r4
            long r0 = r0 / r4
            X.E8z r5 = r7.A06
            int r4 = r8.A00
            r5.CGY(r8, r4)
            X.E8z r9 = r7.A06
            int r4 = r8.A00
            r13 = 0
            r10 = 0
            r11 = r6
            r12 = r4
            r14 = r0
            r9.CGa(r10, r11, r12, r13, r14)
            r0 = r19
            r7.A05 = r0
        L_0x01d0:
            long r0 = r7.A02
            long r0 = r0 + r2
            r7.A02 = r0
        L_0x01d5:
            r6 = 0
            return r6
        L_0x01d7:
            int r12 = r0.A02
            goto L_0x015f
        L_0x01da:
            boolean r0 = r7 instanceof X.C22772BOl
            if (r0 == 0) goto L_0x0219
            byte[] r1 = r8.A02
            r0 = 0
            byte r0 = r1[r0]
            r10 = r0 & 255(0xff, float:3.57E-43)
            r0 = r10 & 3
            r9 = 1
            if (r0 == 0) goto L_0x01f3
            r9 = 2
            if (r0 == r6) goto L_0x01f3
            if (r0 == r9) goto L_0x01f3
            byte r0 = r1[r6]
            r9 = r0 & 63
        L_0x01f3:
            r3 = 3
            int r10 = r10 >> r3
            r2 = r10 & 3
            r0 = 16
            r1 = 2500(0x9c4, float:3.503E-42)
            if (r10 >= r0) goto L_0x0217
            r0 = 12
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r10 < r0) goto L_0x0211
            r0 = r2 & 1
            int r1 = r1 << r0
        L_0x0206:
            long r2 = (long) r9
            long r0 = (long) r1
            long r2 = r2 * r0
            int r0 = r7.A00
            long r0 = (long) r0
            long r2 = X.BE8.A0F(r0, r2)
            goto L_0x01a3
        L_0x0211:
            if (r2 != r3) goto L_0x0217
            r1 = 60000(0xea60, float:8.4078E-41)
            goto L_0x0206
        L_0x0217:
            int r1 = r1 << r2
            goto L_0x0206
        L_0x0219:
            byte[] r2 = r8.A02
            r18 = 0
            byte r1 = r2[r18]
            r0 = -1
            if (r1 != r0) goto L_0x028f
            r1 = 2
            byte r0 = r2[r1]
            r13 = r0 & 255(0xff, float:3.57E-43)
            r0 = 4
            int r13 = r13 >> r0
            switch(r13) {
                case 1: goto L_0x0230;
                case 2: goto L_0x0233;
                case 3: goto L_0x0233;
                case 4: goto L_0x0233;
                case 5: goto L_0x0233;
                case 6: goto L_0x023d;
                case 7: goto L_0x023d;
                case 8: goto L_0x0237;
                case 9: goto L_0x0237;
                case 10: goto L_0x0237;
                case 11: goto L_0x0237;
                case 12: goto L_0x0237;
                case 13: goto L_0x0237;
                case 14: goto L_0x0237;
                case 15: goto L_0x0237;
                default: goto L_0x022c;
            }
        L_0x022c:
            r0 = -1
        L_0x022d:
            long r2 = (long) r0
            goto L_0x01a3
        L_0x0230:
            r0 = 192(0xc0, float:2.69E-43)
            goto L_0x022d
        L_0x0233:
            r0 = 576(0x240, float:8.07E-43)
            int r13 = r13 - r1
            goto L_0x023b
        L_0x0237:
            int r13 = r13 + -8
            r0 = 256(0x100, float:3.59E-43)
        L_0x023b:
            int r0 = r0 << r13
            goto L_0x022d
        L_0x023d:
            r8.A0J(r0)
            byte[] r0 = r8.A02
            r17 = r0
            int r12 = r8.A01
            byte r0 = r0[r12]
            long r0 = (long) r0
            r11 = 7
            r14 = 7
        L_0x024b:
            r10 = 6
            r9 = 1
            if (r14 < 0) goto L_0x02a7
            int r15 = r6 << r14
            long r2 = (long) r15
            long r2 = r2 & r0
            int r16 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x0273
            if (r14 >= r10) goto L_0x0276
            int r15 = r15 - r6
            long r2 = (long) r15
            long r0 = r0 & r2
            int r11 = r11 - r14
            if (r11 == 0) goto L_0x02a7
        L_0x025f:
            if (r9 >= r11) goto L_0x0279
            int r2 = r12 + r9
            byte r14 = r17[r2]
            r3 = r14 & 192(0xc0, float:2.69E-43)
            r2 = 128(0x80, float:1.794E-43)
            if (r3 != r2) goto L_0x0297
            long r0 = r0 << r10
            r2 = r14 & 63
            long r2 = (long) r2
            long r0 = r0 | r2
            int r9 = r9 + 1
            goto L_0x025f
        L_0x0273:
            int r14 = r14 + -1
            goto L_0x024b
        L_0x0276:
            if (r14 != r11) goto L_0x02a7
            r11 = 1
        L_0x0279:
            int r12 = r12 + r11
            r8.A01 = r12
            if (r13 != r10) goto L_0x028a
            int r1 = r8.A04()
        L_0x0282:
            r0 = r18
            r8.A0I(r0)
            int r0 = r1 + 1
            goto L_0x022d
        L_0x028a:
            int r1 = r8.A06()
            goto L_0x0282
        L_0x028f:
            r2 = -1
            goto L_0x01d0
        L_0x0293:
            r7.A02 = r0
            goto L_0x010d
        L_0x0297:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Invalid UTF-8 sequence continuation byte: "
            java.lang.String r1 = X.C17890vO.A0a(r2, r3, r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r1)
            throw r0
        L_0x02a7:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Invalid UTF-8 sequence first byte: "
            java.lang.String r1 = X.C17890vO.A0a(r2, r3, r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r1)
            throw r0
        L_0x02b7:
            r0 = 3
            r7.A01 = r0
            r6 = -1
            return r6
        L_0x02bc:
            java.lang.String r0 = "Failed to determine bitstream type"
            X.BxS r0 = X.C24215BxS.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26670D8t.CDJ(X.Cqw, X.CIy):int");
    }

    public void CH9(long j, long j2) {
        CZO czo = this.A00;
        if (czo != null) {
            CWS cws = czo.A0C;
            CZF czf = cws.A02;
            czf.A03 = 0;
            czf.A04 = 0;
            czf.A02 = 0;
            czf.A01 = 0;
            czf.A00 = 0;
            cws.A03.A0G(0);
            cws.A00 = -1;
            cws.A01 = false;
            if (j == 0) {
                czo.A00(!czo.A0B);
            } else if (czo.A01 != 0) {
                long A0F = BE8.A0F((long) czo.A00, j2);
                czo.A05 = A0F;
                czo.A07.COF(A0F);
                czo.A01 = 2;
            }
        }
    }

    public boolean CNV(C26036Cqw cqw) {
        try {
            return A00(cqw);
        } catch (C24215BxS unused) {
            return false;
        }
    }

    public void Bd7(D9O d9o) {
        this.A01 = d9o;
    }
}
