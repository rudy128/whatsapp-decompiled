package X;

/* renamed from: X.CjP  reason: case insensitive filesystem */
public final class C25637CjP {
    public final CLW A00 = new CLW(C25801CmE.A0D);

    /* JADX WARNING: Code restructure failed: missing block: B:227:0x044e, code lost:
        if (r7[2] != -65) goto L_0x0450;
     */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x04c8 A[Catch:{ UnsupportedEncodingException -> 0x073f, UnsupportedEncodingException -> 0x0726, UnsupportedEncodingException -> 0x0717, IllegalArgumentException -> 0x0770 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.CTM A00(X.C25727Ckx r35, java.util.Map r36) {
        /*
            r34 = this;
            r2 = r35
            X.Cwp r29 = r2.A02()
            X.CqJ r0 = r2.A01()
            java.lang.Integer r0 = r0.A01
            r33 = r0
            X.CqJ r0 = r2.A01()
            X.Cwp r5 = r2.A02()
            X.Bxx[] r1 = X.C24242Bxx.values()
            byte r0 = r0.A00
            r3 = r1[r0]
            X.DS5 r12 = r2.A03
            int r11 = r12.A00
            r2 = 0
        L_0x0023:
            if (r2 >= r11) goto L_0x0037
            r1 = 0
        L_0x0026:
            if (r1 >= r11) goto L_0x0034
            boolean r0 = r3.A00(r2, r1)
            if (r0 == 0) goto L_0x0031
            r12.A00(r1, r2)
        L_0x0031:
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0034:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0037:
            int r9 = r5.A01
            int r0 = r9 * 4
            int r6 = r0 + 17
            X.DS5 r10 = new X.DS5
            r10.<init>(r6, r6)
            r8 = 0
            r4 = 9
            r10.A02(r8, r8, r4, r4)
            int r1 = r6 + -8
            r0 = 8
            r10.A02(r1, r8, r0, r4)
            r10.A02(r8, r1, r4, r0)
            int[] r14 = r5.A02
            int r13 = r14.length
            r7 = 0
        L_0x0056:
            if (r7 >= r13) goto L_0x007b
            r0 = r14[r7]
            int r3 = r0 + -2
            r2 = 0
        L_0x005d:
            if (r2 >= r13) goto L_0x0078
            if (r7 != 0) goto L_0x0067
            if (r2 == 0) goto L_0x0075
            int r0 = r13 + -1
            if (r2 == r0) goto L_0x0075
        L_0x0067:
            int r0 = r13 + -1
            if (r7 != r0) goto L_0x006d
            if (r2 == 0) goto L_0x0075
        L_0x006d:
            r0 = r14[r2]
            int r1 = r0 + -2
            r0 = 5
            r10.A02(r1, r3, r0, r0)
        L_0x0075:
            int r2 = r2 + 1
            goto L_0x005d
        L_0x0078:
            int r7 = r7 + 1
            goto L_0x0056
        L_0x007b:
            int r1 = r6 + -17
            r7 = 6
            r0 = 1
            r10.A02(r7, r4, r0, r1)
            r10.A02(r4, r7, r1, r0)
            if (r9 <= r7) goto L_0x0090
            int r1 = r6 + -11
            r0 = 3
            r10.A02(r1, r8, r0, r7)
            r10.A02(r8, r1, r7, r0)
        L_0x0090:
            int r6 = r5.A00
            byte[] r9 = new byte[r6]
            int r5 = r11 + -1
            r15 = r5
            r14 = 1
            r1 = 0
            r13 = 0
        L_0x009a:
            if (r5 <= 0) goto L_0x00d7
            if (r5 != r7) goto L_0x009f
            r5 = 5
        L_0x009f:
            r4 = 0
        L_0x00a0:
            if (r4 >= r11) goto L_0x00d2
            r3 = r4
            if (r14 == 0) goto L_0x00a7
            int r3 = r15 - r4
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            int r0 = r5 - r2
            boolean r0 = r10.A03(r0, r3)
            if (r0 != 0) goto L_0x00ca
            int r1 = r1 + 1
            int r13 = r13 << 1
            int r0 = r5 - r2
            boolean r0 = r12.A03(r0, r3)
            if (r0 == 0) goto L_0x00be
            r13 = r13 | 1
        L_0x00be:
            r0 = 8
            if (r1 != r0) goto L_0x00ca
            int r1 = r8 + 1
            byte r0 = (byte) r13
            r9[r8] = r0
            r8 = r1
            r1 = 0
            r13 = 0
        L_0x00ca:
            int r2 = r2 + 1
            r0 = 2
            if (r2 < r0) goto L_0x00a8
            int r4 = r4 + 1
            goto L_0x00a0
        L_0x00d2:
            r14 = r14 ^ 1
            int r5 = r5 + -2
            goto L_0x009a
        L_0x00d7:
            if (r8 != r6) goto L_0x077a
            r0 = r29
            int r0 = r0.A00
            if (r6 != r0) goto L_0x0775
            r0 = r29
            X.CO2[] r1 = r0.A03
            int r0 = r33.intValue()
            r2 = r1[r0]
            X.CO1[] r13 = r2.A01
            int r12 = r13.length
            r14 = 0
            r1 = 0
            r5 = 0
        L_0x00ef:
            if (r1 >= r12) goto L_0x00f9
            r0 = r13[r1]
            int r0 = r0.A00
            int r5 = r5 + r0
            int r1 = r1 + 1
            goto L_0x00ef
        L_0x00f9:
            X.CO0[] r4 = new X.CO0[r5]
            r10 = 0
            r11 = 0
        L_0x00fd:
            if (r10 >= r12) goto L_0x011d
            r8 = r13[r10]
            r7 = 0
        L_0x0102:
            int r0 = r8.A00
            if (r7 >= r0) goto L_0x011a
            int r6 = r8.A01
            int r0 = r2.A00
            int r0 = r0 + r6
            int r3 = r11 + 1
            byte[] r1 = new byte[r0]
            X.CO0 r0 = new X.CO0
            r0.<init>(r6, r1)
            r4[r11] = r0
            int r7 = r7 + 1
            r11 = r3
            goto L_0x0102
        L_0x011a:
            int r10 = r10 + 1
            goto L_0x00fd
        L_0x011d:
            r0 = r4[r14]
            byte[] r0 = r0.A01
            int r10 = r0.length
            int r1 = r5 + -1
        L_0x0124:
            if (r1 < 0) goto L_0x0130
            r0 = r4[r1]
            byte[] r0 = r0.A01
            int r0 = r0.length
            if (r0 == r10) goto L_0x0130
            int r1 = r1 + -1
            goto L_0x0124
        L_0x0130:
            int r8 = r1 + 1
            int r0 = r2.A00
            int r7 = r10 - r0
            r3 = 0
            r6 = 0
        L_0x0138:
            r2 = r8
            if (r3 >= r7) goto L_0x014e
            r2 = 0
        L_0x013c:
            if (r2 >= r11) goto L_0x014b
            r0 = r4[r2]
            byte[] r1 = r0.A01
            int r0 = r6 + 1
            X.BE6.A1P(r9, r1, r6, r3)
            int r2 = r2 + 1
            r6 = r0
            goto L_0x013c
        L_0x014b:
            int r3 = r3 + 1
            goto L_0x0138
        L_0x014e:
            if (r2 >= r11) goto L_0x015d
            r0 = r4[r2]
            byte[] r1 = r0.A01
            int r0 = r6 + 1
            X.BE6.A1P(r9, r1, r6, r7)
            int r2 = r2 + 1
            r6 = r0
            goto L_0x014e
        L_0x015d:
            if (r7 >= r10) goto L_0x0177
            r3 = 0
        L_0x0160:
            if (r3 >= r11) goto L_0x0174
            int r2 = r7 + 1
            if (r3 >= r8) goto L_0x0167
            r2 = r7
        L_0x0167:
            r0 = r4[r3]
            byte[] r1 = r0.A01
            int r0 = r6 + 1
            X.BE6.A1P(r9, r1, r6, r2)
            int r3 = r3 + 1
            r6 = r0
            goto L_0x0160
        L_0x0174:
            int r7 = r7 + 1
            goto L_0x015d
        L_0x0177:
            r2 = 0
            r1 = 0
        L_0x0179:
            if (r2 >= r5) goto L_0x0183
            r0 = r4[r2]
            int r0 = r0.A00
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L_0x0179
        L_0x0183:
            byte[] r0 = new byte[r1]
            r32 = r0
            r22 = 0
            r21 = 0
        L_0x018b:
            r0 = r22
            if (r0 >= r5) goto L_0x0386
            r0 = r4[r22]
            byte[] r6 = r0.A01
            int r0 = r0.A00
            r20 = r0
            int r9 = r6.length
            int[] r8 = new int[r9]
            r7 = 0
            r1 = 0
        L_0x019c:
            if (r1 >= r9) goto L_0x01a7
            byte r0 = r6[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r8[r1] = r0
            int r1 = r1 + 1
            goto L_0x019c
        L_0x01a7:
            r0 = r34
            X.CLW r0 = r0.A00     // Catch:{ C1g -> 0x0379 }
            int r19 = r9 - r20
            X.CmE r3 = r0.A00     // Catch:{ C1g -> 0x0379 }
            X.CcG r12 = new X.CcG     // Catch:{ C1g -> 0x0379 }
            r12.<init>(r3, r8)     // Catch:{ C1g -> 0x0379 }
            r0 = r19
            int[] r11 = new int[r0]     // Catch:{ C1g -> 0x0379 }
            r2 = 1
            r1 = 0
            r13 = 0
            r14 = 1
        L_0x01bc:
            r0 = r19
            if (r13 >= r0) goto L_0x01d3
            int[] r0 = r3.A02     // Catch:{ C1g -> 0x0379 }
            r0 = r0[r13]     // Catch:{ C1g -> 0x0379 }
            int r10 = r12.A00(r0)     // Catch:{ C1g -> 0x0379 }
            int r0 = r19 + -1
            int r0 = r0 - r13
            r11[r0] = r10     // Catch:{ C1g -> 0x0379 }
            if (r10 == 0) goto L_0x01d0
            r14 = 0
        L_0x01d0:
            int r13 = r13 + 1
            goto L_0x01bc
        L_0x01d3:
            if (r14 != 0) goto L_0x034c
            X.CcG r10 = new X.CcG     // Catch:{ C1g -> 0x0379 }
            r10.<init>(r3, r11)     // Catch:{ C1g -> 0x0379 }
            if (r19 < 0) goto L_0x0374
            int r0 = r19 + 1
            int[] r11 = new int[r0]     // Catch:{ C1g -> 0x0379 }
            r11[r7] = r2     // Catch:{ C1g -> 0x0379 }
            X.CcG r18 = new X.CcG     // Catch:{ C1g -> 0x0379 }
            r0 = r18
            r0.<init>(r3, r11)     // Catch:{ C1g -> 0x0379 }
            r11 = r10
            int[] r0 = r0.A01     // Catch:{ C1g -> 0x0379 }
            int r0 = r0.length     // Catch:{ C1g -> 0x0379 }
            int r12 = r0 + -1
            int[] r0 = r10.A01     // Catch:{ C1g -> 0x0379 }
            int r0 = r0.length     // Catch:{ C1g -> 0x0379 }
            int r0 = r0 + -1
            if (r12 >= r0) goto L_0x01fa
            r11 = r18
            r18 = r10
        L_0x01fa:
            X.CcG r0 = r3.A01     // Catch:{ C1g -> 0x0379 }
            r26 = r0
            r25 = r0
            X.CcG r12 = r3.A00     // Catch:{ C1g -> 0x0379 }
        L_0x0202:
            r24 = r11
            r11 = r18
            r18 = r24
            r23 = r25
            r25 = r12
            r0 = r24
            int[] r14 = r0.A01     // Catch:{ C1g -> 0x0379 }
            int r0 = r14.length     // Catch:{ C1g -> 0x0379 }
            int r10 = r0 + -1
            r13 = 2
            int r0 = r19 / 2
            if (r10 < r0) goto L_0x0288
            r0 = r14[r7]     // Catch:{ C1g -> 0x0379 }
            if (r0 != 0) goto L_0x0224
            java.lang.String r0 = "r_{i-1} was zero"
            X.C1g r1 = new X.C1g     // Catch:{ C1g -> 0x0379 }
            r1.<init>(r0)     // Catch:{ C1g -> 0x0379 }
        L_0x0223:
            throw r1     // Catch:{ C1g -> 0x0379 }
        L_0x0224:
            r17 = r26
            int r0 = r10 - r10
            r0 = r14[r0]     // Catch:{ C1g -> 0x0379 }
            int r16 = r3.A00(r0)     // Catch:{ C1g -> 0x0379 }
        L_0x022e:
            int[] r0 = r11.A01     // Catch:{ C1g -> 0x0379 }
            int r0 = r0.length     // Catch:{ C1g -> 0x0379 }
            int r0 = r0 + -1
            if (r0 < r10) goto L_0x026e
            int[] r0 = r11.A01     // Catch:{ C1g -> 0x0379 }
            r0 = r0[r7]     // Catch:{ C1g -> 0x0379 }
            if (r0 == 0) goto L_0x026e
            int[] r14 = r11.A01     // Catch:{ C1g -> 0x0379 }
            int r0 = r14.length     // Catch:{ C1g -> 0x0379 }
            int r0 = r0 + -1
            int r13 = r0 - r10
            int r0 = r0 - r0
            r14 = r14[r0]     // Catch:{ C1g -> 0x0379 }
            r0 = r16
            int r14 = r3.A01(r14, r0)     // Catch:{ C1g -> 0x0379 }
            if (r13 < 0) goto L_0x036f
            if (r14 != 0) goto L_0x0252
            r15 = r26
            goto L_0x025d
        L_0x0252:
            int r0 = r13 + 1
            int[] r0 = new int[r0]     // Catch:{ C1g -> 0x0379 }
            r0[r7] = r14     // Catch:{ C1g -> 0x0379 }
            X.CcG r15 = new X.CcG     // Catch:{ C1g -> 0x0379 }
            r15.<init>(r3, r0)     // Catch:{ C1g -> 0x0379 }
        L_0x025d:
            r0 = r17
            X.CcG r17 = r0.A03(r15)     // Catch:{ C1g -> 0x0379 }
            r0 = r24
            X.CcG r0 = r0.A02(r13, r14)     // Catch:{ C1g -> 0x0379 }
            X.CcG r11 = r11.A03(r0)     // Catch:{ C1g -> 0x0379 }
            goto L_0x022e
        L_0x026e:
            r0 = r17
            X.CcG r12 = r0.A04(r12)     // Catch:{ C1g -> 0x0379 }
            r0 = r23
            X.CcG r12 = r12.A03(r0)     // Catch:{ C1g -> 0x0379 }
            int[] r0 = r11.A01     // Catch:{ C1g -> 0x0379 }
            int r0 = r0.length     // Catch:{ C1g -> 0x0379 }
            int r0 = r0 + -1
            if (r0 < r10) goto L_0x0202
            java.lang.String r0 = "Division algorithm failed to reduce polynomial?"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)     // Catch:{ C1g -> 0x0379 }
            goto L_0x0223
        L_0x0288:
            int[] r10 = r12.A01     // Catch:{ C1g -> 0x0379 }
            int r0 = r10.length     // Catch:{ C1g -> 0x0379 }
            int r0 = r0 + -1
            r0 = r10[r0]     // Catch:{ C1g -> 0x0379 }
            if (r0 == 0) goto L_0x0343
            int r10 = r3.A00(r0)     // Catch:{ C1g -> 0x0379 }
            X.CcG r11 = r12.A01(r10)     // Catch:{ C1g -> 0x0379 }
            r0 = r24
            X.CcG r10 = r0.A01(r10)     // Catch:{ C1g -> 0x0379 }
            X.CcG[] r0 = new X.C25270CcG[r13]     // Catch:{ C1g -> 0x0379 }
            r0[r7] = r11     // Catch:{ C1g -> 0x0379 }
            r0[r2] = r10     // Catch:{ C1g -> 0x0379 }
            r14 = r0[r7]     // Catch:{ C1g -> 0x0379 }
            r19 = r0[r2]     // Catch:{ C1g -> 0x0379 }
            int[] r15 = r14.A01     // Catch:{ C1g -> 0x0379 }
            int r0 = r15.length     // Catch:{ C1g -> 0x0379 }
            int r13 = r0 + -1
            r11 = 0
            r10 = 1
            if (r13 != r2) goto L_0x02bf
            int[] r12 = new int[r2]     // Catch:{ C1g -> 0x0379 }
            r0 = r15[r7]     // Catch:{ C1g -> 0x0379 }
            r12[r7] = r0     // Catch:{ C1g -> 0x0379 }
        L_0x02b8:
            int r11 = r12.length     // Catch:{ C1g -> 0x0379 }
            int[] r0 = new int[r11]     // Catch:{ C1g -> 0x0379 }
            r18 = r0
            r13 = 0
            goto L_0x02dc
        L_0x02bf:
            int[] r12 = new int[r13]     // Catch:{ C1g -> 0x0379 }
            goto L_0x02c6
        L_0x02c2:
            r0 = 256(0x100, float:3.59E-43)
            if (r10 >= r0) goto L_0x02d9
        L_0x02c6:
            if (r11 >= r13) goto L_0x02d9
            int r0 = r14.A00(r10)     // Catch:{ C1g -> 0x0379 }
            if (r0 != 0) goto L_0x02d6
            int r0 = r3.A00(r10)     // Catch:{ C1g -> 0x0379 }
            r12[r11] = r0     // Catch:{ C1g -> 0x0379 }
            int r11 = r11 + 1
        L_0x02d6:
            int r10 = r10 + 1
            goto L_0x02c2
        L_0x02d9:
            if (r11 == r13) goto L_0x02b8
            goto L_0x033a
        L_0x02dc:
            if (r13 >= r11) goto L_0x0312
            r0 = r12[r13]     // Catch:{ C1g -> 0x0379 }
            int r10 = r3.A00(r0)     // Catch:{ C1g -> 0x0379 }
            r14 = 1
            r15 = 0
        L_0x02e6:
            if (r15 >= r11) goto L_0x02ff
            if (r13 == r15) goto L_0x02fc
            r0 = r12[r15]     // Catch:{ C1g -> 0x0379 }
            int r17 = r3.A01(r0, r10)     // Catch:{ C1g -> 0x0379 }
            r16 = r17 & 1
            r0 = r17 & -2
            if (r16 != 0) goto L_0x02f8
            r0 = r17 | 1
        L_0x02f8:
            int r14 = r3.A01(r14, r0)     // Catch:{ C1g -> 0x0379 }
        L_0x02fc:
            int r15 = r15 + 1
            goto L_0x02e6
        L_0x02ff:
            r0 = r19
            int r10 = r0.A00(r10)     // Catch:{ C1g -> 0x0379 }
            int r0 = r3.A00(r14)     // Catch:{ C1g -> 0x0379 }
            int r0 = r3.A01(r10, r0)     // Catch:{ C1g -> 0x0379 }
            r18[r13] = r0     // Catch:{ C1g -> 0x0379 }
            int r13 = r13 + 1
            goto L_0x02dc
        L_0x0312:
            if (r1 >= r11) goto L_0x034c
            int r13 = r9 - r2
            r10 = r12[r1]     // Catch:{ C1g -> 0x0379 }
            if (r10 == 0) goto L_0x0334
            int[] r0 = r3.A03     // Catch:{ C1g -> 0x0379 }
            r0 = r0[r10]     // Catch:{ C1g -> 0x0379 }
            int r13 = r13 - r0
            if (r13 < 0) goto L_0x032b
            r10 = r8[r13]     // Catch:{ C1g -> 0x0379 }
            r0 = r18[r1]     // Catch:{ C1g -> 0x0379 }
            r10 = r10 ^ r0
            r8[r13] = r10     // Catch:{ C1g -> 0x0379 }
            int r1 = r1 + 1
            goto L_0x0312
        L_0x032b:
            java.lang.String r0 = "Bad error location"
            X.C1g r1 = new X.C1g     // Catch:{ C1g -> 0x0379 }
            r1.<init>(r0)     // Catch:{ C1g -> 0x0379 }
            goto L_0x0223
        L_0x0334:
            java.lang.IllegalArgumentException r1 = X.BE6.A0j()     // Catch:{ C1g -> 0x0379 }
            goto L_0x0223
        L_0x033a:
            java.lang.String r0 = "Error locator degree does not match number of roots"
            X.C1g r1 = new X.C1g     // Catch:{ C1g -> 0x0379 }
            r1.<init>(r0)     // Catch:{ C1g -> 0x0379 }
            goto L_0x0223
        L_0x0343:
            java.lang.String r0 = "sigmaTilde(0) was zero"
            X.C1g r1 = new X.C1g     // Catch:{ C1g -> 0x0379 }
            r1.<init>(r0)     // Catch:{ C1g -> 0x0379 }
            goto L_0x0223
        L_0x034c:
            r0 = r20
            if (r7 >= r0) goto L_0x0358
            r0 = r8[r7]
            byte r0 = (byte) r0
            r6[r7] = r0
            int r7 = r7 + 1
            goto L_0x034c
        L_0x0358:
            r3 = 0
        L_0x0359:
            r0 = r20
            if (r3 >= r0) goto L_0x036b
            int r2 = r21 + 1
            r1 = r21
            r0 = r32
            X.BE6.A1P(r6, r0, r3, r1)
            int r3 = r3 + 1
            r21 = r2
            goto L_0x0359
        L_0x036b:
            int r22 = r22 + 1
            goto L_0x018b
        L_0x036f:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()     // Catch:{ C1g -> 0x0379 }
            throw r0     // Catch:{ C1g -> 0x0379 }
        L_0x0374:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()     // Catch:{ C1g -> 0x0379 }
            throw r0     // Catch:{ C1g -> 0x0379 }
        L_0x0379:
            boolean r0 = X.C2R.A00
            if (r0 == 0) goto L_0x0383
            X.Bng r0 = new X.Bng
            r0.<init>()
            throw r0
        L_0x0383:
            X.Bng r0 = X.C23673Bng.A00
            throw r0
        L_0x0386:
            X.CYd r13 = new X.CYd
            r0 = r32
            r13.<init>(r0)
            r0 = 50
            java.lang.StringBuilder r12 = X.BE6.A0t(r0)
            r11 = 1
            java.util.ArrayList r28 = X.C17880vN.A0z(r11)
            r27 = 0
            r0 = r27
            r30 = -1
            r31 = -1
            r26 = 0
        L_0x03a2:
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            r3 = 4
            r2 = 6
            if (r1 >= r3) goto L_0x06cd
            X.C0A r10 = X.C0A.A0A     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x03ac:
            int r4 = r10.ordinal()     // Catch:{ IllegalArgumentException -> 0x0770 }
            switch(r4) {
                case 0: goto L_0x06c8;
                case 1: goto L_0x03b3;
                case 2: goto L_0x03b3;
                case 3: goto L_0x061d;
                case 4: goto L_0x03b3;
                case 5: goto L_0x0681;
                case 6: goto L_0x03b3;
                case 7: goto L_0x0631;
                case 8: goto L_0x0631;
                case 9: goto L_0x0635;
                default: goto L_0x03b3;
            }     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x03b3:
            r1 = r29
            int r1 = r10.A00(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r9 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r4 == r11) goto L_0x05b7
            r8 = 2
            if (r4 == r8) goto L_0x0550
            if (r4 == r3) goto L_0x0403
            if (r4 != r2) goto L_0x0721
            int r2 = r9 * 13
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r2 > r1) goto L_0x071c
            int r1 = r9 * 2
            byte[] r4 = new byte[r1]     // Catch:{ IllegalArgumentException -> 0x0770 }
            r5 = 0
        L_0x03d3:
            if (r9 <= 0) goto L_0x03f7
            r1 = 13
            int r2 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r1 = r2 / 192
            int r1 = r1 << 8
            int r3 = r2 % 192
            r3 = r3 | r1
            r2 = 7936(0x1f00, float:1.1121E-41)
            r1 = 49472(0xc140, float:6.9325E-41)
            if (r3 >= r2) goto L_0x03ec
            r1 = 33088(0x8140, float:4.6366E-41)
        L_0x03ec:
            int r3 = r3 + r1
            int r1 = r3 >> 8
            X.BE7.A12(r1, r4, r5, r3)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r5 = r5 + 2
            int r9 = r9 + -1
            goto L_0x03d3
        L_0x03f7:
            java.lang.String r2 = "SJIS"
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0717 }
            r1.<init>(r4, r2)     // Catch:{ UnsupportedEncodingException -> 0x0717 }
            r12.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0717 }
            goto L_0x06c8
        L_0x0403:
            int r2 = r9 << 3
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r2 > r1) goto L_0x072b
            byte[] r7 = new byte[r9]     // Catch:{ IllegalArgumentException -> 0x0770 }
            r2 = 0
        L_0x040e:
            if (r2 >= r9) goto L_0x041c
            r1 = 8
            int r1 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            byte r1 = (byte) r1     // Catch:{ IllegalArgumentException -> 0x0770 }
            r7[r2] = r1     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r2 = r2 + 1
            goto L_0x040e
        L_0x041c:
            if (r0 != 0) goto L_0x0542
            boolean r1 = X.CHT.A01     // Catch:{ IllegalArgumentException -> 0x0770 }
            r3 = r36
            if (r36 == 0) goto L_0x0436
            X.BzX r2 = X.C24336BzX.A01     // Catch:{ IllegalArgumentException -> 0x0770 }
            boolean r1 = r3.containsKey(r2)     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r1 == 0) goto L_0x0436
            java.lang.Object r1 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x0770 }
            java.lang.String r2 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x0546
        L_0x0436:
            r1 = 3
            r25 = 1
            r14 = 0
            if (r9 <= r1) goto L_0x0450
            byte r2 = r7[r14]     // Catch:{ IllegalArgumentException -> 0x0770 }
            r1 = -17
            if (r2 != r1) goto L_0x0450
            byte r2 = r7[r11]     // Catch:{ IllegalArgumentException -> 0x0770 }
            r1 = -69
            if (r2 != r1) goto L_0x0450
            byte r2 = r7[r8]     // Catch:{ IllegalArgumentException -> 0x0770 }
            r1 = -65
            r24 = 1
            if (r2 == r1) goto L_0x0452
        L_0x0450:
            r24 = 0
        L_0x0452:
            r6 = 0
            r23 = 1
            r22 = 1
            r5 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r4 = 0
            r16 = 0
            r3 = 0
            r2 = 0
        L_0x0467:
            if (r5 >= r9) goto L_0x0501
            if (r25 != 0) goto L_0x046f
            if (r23 != 0) goto L_0x046f
            if (r22 == 0) goto L_0x050d
        L_0x046f:
            byte r1 = r7[r5]     // Catch:{ IllegalArgumentException -> 0x0770 }
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r22 == 0) goto L_0x047d
            r15 = r1 & 128(0x80, float:1.794E-43)
            if (r21 <= 0) goto L_0x04dc
            if (r15 == 0) goto L_0x04fd
            int r21 = r21 + -1
        L_0x047d:
            r15 = 127(0x7f, float:1.78E-43)
            if (r25 == 0) goto L_0x0489
            if (r1 <= r15) goto L_0x0489
            r15 = 160(0xa0, float:2.24E-43)
            if (r1 >= r15) goto L_0x04cd
            r25 = 0
        L_0x0489:
            if (r23 == 0) goto L_0x049b
            if (r20 <= 0) goto L_0x049e
            r15 = 64
            if (r1 < r15) goto L_0x04ca
            r15 = 127(0x7f, float:1.78E-43)
            if (r1 == r15) goto L_0x04ca
            r15 = 252(0xfc, float:3.53E-43)
            if (r1 > r15) goto L_0x04ca
            r20 = 0
        L_0x049b:
            int r5 = r5 + 1
            goto L_0x0467
        L_0x049e:
            r15 = 128(0x80, float:1.794E-43)
            if (r1 == r15) goto L_0x04ca
            r15 = 160(0xa0, float:2.24E-43)
            if (r1 == r15) goto L_0x04ca
            r15 = 239(0xef, float:3.35E-43)
            if (r1 > r15) goto L_0x04ca
            r15 = 160(0xa0, float:2.24E-43)
            if (r1 <= r15) goto L_0x04bb
            r15 = 224(0xe0, float:3.14E-43)
            if (r1 >= r15) goto L_0x04c2
            int r6 = r6 + 1
            int r2 = r2 + 1
            if (r2 <= r4) goto L_0x04b9
            r4 = r2
        L_0x04b9:
            r3 = 0
            goto L_0x049b
        L_0x04bb:
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 > r2) goto L_0x04c2
            r3 = 0
        L_0x04c0:
            r2 = 0
            goto L_0x049b
        L_0x04c2:
            r20 = 1
            int r3 = r3 + 1
            if (r3 <= r14) goto L_0x04c0
            r14 = r3
            goto L_0x04c0
        L_0x04ca:
            r23 = 0
            goto L_0x049b
        L_0x04cd:
            r15 = 192(0xc0, float:2.69E-43)
            if (r1 < r15) goto L_0x04d9
            r15 = 215(0xd7, float:3.01E-43)
            if (r1 == r15) goto L_0x04d9
            r15 = 247(0xf7, float:3.46E-43)
            if (r1 != r15) goto L_0x0489
        L_0x04d9:
            int r16 = r16 + 1
            goto L_0x0489
        L_0x04dc:
            if (r15 == 0) goto L_0x047d
            r15 = r1 & 64
            if (r15 == 0) goto L_0x04fd
            int r21 = r21 + 1
            r15 = r1 & 32
            if (r15 != 0) goto L_0x04eb
            int r19 = r19 + 1
            goto L_0x047d
        L_0x04eb:
            int r21 = r21 + 1
            r15 = r1 & 16
            if (r15 != 0) goto L_0x04f4
            int r18 = r18 + 1
            goto L_0x047d
        L_0x04f4:
            int r21 = r21 + 1
            r15 = r1 & 8
            if (r15 != 0) goto L_0x04fd
            int r17 = r17 + 1
            goto L_0x047d
        L_0x04fd:
            r22 = 0
            goto L_0x047d
        L_0x0501:
            if (r22 == 0) goto L_0x0507
            if (r21 <= 0) goto L_0x0507
            r22 = 0
        L_0x0507:
            if (r23 == 0) goto L_0x050d
            if (r20 <= 0) goto L_0x050d
            r23 = 0
        L_0x050d:
            java.lang.String r2 = "UTF8"
            if (r22 == 0) goto L_0x051a
            if (r24 != 0) goto L_0x0546
            int r19 = r19 + r18
            int r19 = r19 + r17
            if (r19 <= 0) goto L_0x051a
            goto L_0x0546
        L_0x051a:
            java.lang.String r5 = "SJIS"
            if (r23 == 0) goto L_0x0528
            boolean r1 = X.CHT.A01     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r1 != 0) goto L_0x053e
            r1 = 3
            if (r4 >= r1) goto L_0x053e
            if (r14 < r1) goto L_0x0528
            goto L_0x053e
        L_0x0528:
            java.lang.String r3 = "ISO8859_1"
            if (r25 == 0) goto L_0x052d
            goto L_0x0534
        L_0x052d:
            if (r23 != 0) goto L_0x053e
            if (r22 != 0) goto L_0x0546
            java.lang.String r2 = X.CHT.A00     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x0546
        L_0x0534:
            if (r23 == 0) goto L_0x0540
            if (r4 != r8) goto L_0x053a
            if (r6 == r8) goto L_0x053e
        L_0x053a:
            int r1 = r16 * 10
            if (r1 < r9) goto L_0x0540
        L_0x053e:
            r2 = r5
            goto L_0x0546
        L_0x0540:
            r2 = r3
            goto L_0x0546
        L_0x0542:
            java.lang.String r2 = r0.name()     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x0546:
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0726 }
            r1.<init>(r7, r2)     // Catch:{ UnsupportedEncodingException -> 0x0726 }
            r12.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0726 }
            goto L_0x06c3
        L_0x0550:
            int r3 = r12.length()     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x0554:
            if (r9 <= r11) goto L_0x0577
            int r4 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            r1 = 11
            if (r4 < r1) goto L_0x0730
            int r4 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r1 = r4 / 45
            char r1 = X.C25413CfL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r1 = r4 % 45
            char r1 = X.C25413CfL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r9 = r9 + -2
            goto L_0x0554
        L_0x0577:
            if (r9 != r11) goto L_0x058a
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r1 < r2) goto L_0x0730
            int r1 = r13.A01(r2)     // Catch:{ IllegalArgumentException -> 0x0770 }
            char r1 = X.C25413CfL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x058a:
            if (r26 == 0) goto L_0x06c8
        L_0x058c:
            int r1 = r12.length()     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r3 >= r1) goto L_0x06c8
            char r1 = r12.charAt(r3)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r2 = 37
            if (r1 != r2) goto L_0x05b4
            int r1 = r12.length()     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r1 = r1 - r11
            if (r3 >= r1) goto L_0x05af
            int r1 = r3 + 1
            char r1 = r12.charAt(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r1 != r2) goto L_0x05af
            int r1 = r3 + 1
            r12.deleteCharAt(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x05b4
        L_0x05af:
            r1 = 29
            r12.setCharAt(r3, r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x05b4:
            int r3 = r3 + 1
            goto L_0x058c
        L_0x05b7:
            r1 = 3
            r4 = 10
            if (r9 < r1) goto L_0x05e9
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r1 < r4) goto L_0x0735
            int r2 = r13.A01(r4)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r2 >= r1) goto L_0x0735
            int r1 = r2 / 100
            char r1 = X.C25413CfL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r1 = r2 / 10
            int r1 = r1 % r4
            char r1 = X.C25413CfL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r1 = r2 % 10
            char r1 = X.C25413CfL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r9 = r9 + -3
            goto L_0x05b7
        L_0x05e9:
            r1 = 2
            if (r9 != r1) goto L_0x0606
            int r2 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            r1 = 7
            if (r2 < r1) goto L_0x0735
            int r2 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r1 = 100
            if (r2 >= r1) goto L_0x0735
            int r1 = r2 / 10
            char r1 = X.C25413CfL.A00(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r2 = r2 % r4
            goto L_0x0614
        L_0x0606:
            if (r9 != r11) goto L_0x06c8
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r1 < r3) goto L_0x0735
            int r2 = r13.A01(r3)     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r2 >= r4) goto L_0x0735
        L_0x0614:
            char r1 = X.C25413CfL.A00(r2)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r12.append(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x06c8
        L_0x061d:
            int r2 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            r1 = 16
            if (r2 < r1) goto L_0x073a
            r1 = 8
            int r30 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r31 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x06c8
        L_0x0631:
            r26 = 1
            goto L_0x06c8
        L_0x0635:
            int r2 = r13.A01(r3)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r1 = r29
            int r1 = r10.A00(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r6 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r2 != r11) goto L_0x06c8
            int r2 = r6 * 13
            int r1 = r13.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r2 > r1) goto L_0x0744
            int r1 = r6 * 2
            byte[] r4 = new byte[r1]     // Catch:{ IllegalArgumentException -> 0x0770 }
            r5 = 0
        L_0x0652:
            if (r6 <= 0) goto L_0x0676
            r1 = 13
            int r2 = r13.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r1 = r2 / 96
            int r1 = r1 << 8
            int r3 = r2 % 96
            r3 = r3 | r1
            r2 = 959(0x3bf, float:1.344E-42)
            r1 = 42657(0xa6a1, float:5.9775E-41)
            if (r3 >= r2) goto L_0x066b
            r1 = 41377(0xa1a1, float:5.7982E-41)
        L_0x066b:
            int r3 = r3 + r1
            int r1 = r3 >> 8
            X.BE7.A12(r1, r4, r5, r3)     // Catch:{ IllegalArgumentException -> 0x0770 }
            int r5 = r5 + 2
            int r6 = r6 + -1
            goto L_0x0652
        L_0x0676:
            java.lang.String r2 = "GB2312"
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x073f }
            r1.<init>(r4, r2)     // Catch:{ UnsupportedEncodingException -> 0x073f }
            r12.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x073f }
            goto L_0x06c8
        L_0x0681:
            r3 = 8
            int r2 = r13.A01(r3)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x068e
            r1 = r2 & 127(0x7f, float:1.78E-43)
            goto L_0x06ae
        L_0x068e:
            r1 = r2 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 != r0) goto L_0x069d
            int r1 = r13.A01(r3)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r0 = r2 & 63
            int r0 = r0 << 8
            goto L_0x06ad
        L_0x069d:
            r1 = r2 & 224(0xe0, float:3.14E-43)
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 != r0) goto L_0x0766
            r0 = 16
            int r1 = r13.A01(r0)     // Catch:{ IllegalArgumentException -> 0x0770 }
            r0 = r2 & 31
            int r0 = r0 << 16
        L_0x06ad:
            r1 = r1 | r0
        L_0x06ae:
            if (r1 < 0) goto L_0x0761
            r0 = 900(0x384, float:1.261E-42)
            if (r1 >= r0) goto L_0x0761
            java.util.Map r0 = X.C0N.A01     // Catch:{ IllegalArgumentException -> 0x0770 }
            java.lang.Object r0 = X.AnonymousClass000.A0w(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0770 }
            X.C0N r0 = (X.C0N) r0     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r0 != 0) goto L_0x06c8
            X.Bni r0 = X.C23675Bni.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x06c3:
            r1 = r28
            r1.add(r7)     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x06c8:
            X.C0A r1 = X.C0A.A0A     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r10 != r1) goto L_0x03a2
            goto L_0x0749
        L_0x06cd:
            int r4 = r13.A01(r3)     // Catch:{ IllegalArgumentException -> 0x0770 }
            if (r4 == 0) goto L_0x0713
            if (r4 == r11) goto L_0x070f
            r1 = 2
            if (r4 == r1) goto L_0x070b
            r1 = 3
            if (r4 == r1) goto L_0x0707
            if (r4 == r3) goto L_0x0703
            r1 = 5
            if (r4 == r1) goto L_0x06ff
            r1 = 7
            if (r4 == r1) goto L_0x06fb
            r1 = 8
            if (r4 == r1) goto L_0x06f7
            r1 = 9
            if (r4 == r1) goto L_0x06f3
            r1 = 13
            if (r4 != r1) goto L_0x076b
            X.C0A r10 = X.C0A.A06     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x03ac
        L_0x06f3:
            X.C0A r10 = X.C0A.A05     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x03ac
        L_0x06f7:
            X.C0A r10 = X.C0A.A07     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x03ac
        L_0x06fb:
            X.C0A r10 = X.C0A.A03     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x03ac
        L_0x06ff:
            X.C0A r10 = X.C0A.A04     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x03ac
        L_0x0703:
            X.C0A r10 = X.C0A.A02     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x03ac
        L_0x0707:
            X.C0A r10 = X.C0A.A09     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x03ac
        L_0x070b:
            X.C0A r10 = X.C0A.A01     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x03ac
        L_0x070f:
            X.C0A r10 = X.C0A.A08     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x03ac
        L_0x0713:
            X.C0A r10 = X.C0A.A0A     // Catch:{ IllegalArgumentException -> 0x0770 }
            goto L_0x03ac
        L_0x0717:
            X.Bni r0 = X.C23675Bni.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x071c:
            X.Bni r0 = X.C23675Bni.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x0721:
            X.Bni r0 = X.C23675Bni.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x0726:
            X.Bni r0 = X.C23675Bni.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x072b:
            X.Bni r0 = X.C23675Bni.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x0730:
            X.Bni r0 = X.C23675Bni.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x0735:
            X.Bni r0 = X.C23675Bni.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x073a:
            X.Bni r0 = X.C23675Bni.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x073f:
            X.Bni r0 = X.C23675Bni.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x0744:
            X.Bni r0 = X.C23675Bni.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x0749:
            java.lang.String r26 = r12.toString()
            boolean r0 = r28.isEmpty()
            if (r0 == 0) goto L_0x0755
            r28 = r27
        L_0x0755:
            java.lang.String r27 = X.C25414CfM.A00(r33)
            X.CTM r25 = new X.CTM
            r29 = r32
            r25.<init>(r26, r27, r28, r29, r30, r31)
            return r25
        L_0x0761:
            X.Bni r0 = X.C23675Bni.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x0766:
            X.Bni r0 = X.C23675Bni.A00()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x076b:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()     // Catch:{ IllegalArgumentException -> 0x0770 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0770 }
        L_0x0770:
            X.Bni r0 = X.C23675Bni.A00()
            throw r0
        L_0x0775:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()
            throw r0
        L_0x077a:
            X.Bni r0 = X.C23675Bni.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25637CjP.A00(X.Ckx, java.util.Map):X.CTM");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[Catch:{ Bng | Bni -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d A[Catch:{ Bng | Bni -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0069 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.CTM A01(X.DS5 r10, java.util.Map r11) {
        /*
            r9 = this;
            X.Ckx r5 = new X.Ckx
            r5.<init>(r10)
            r8 = 0
            X.CTM r0 = r9.A00(r5, r11)     // Catch:{ Bni -> 0x000d, Bng -> 0x000b }
            return r0
        L_0x000b:
            r7 = move-exception
            goto L_0x0010
        L_0x000d:
            r0 = move-exception
            r7 = r8
            r8 = r0
        L_0x0010:
            X.CqJ r0 = r5.A00     // Catch:{ Bng | Bni -> 0x0075 }
            if (r0 == 0) goto L_0x0038
            X.Bxx[] r1 = X.C24242Bxx.values()     // Catch:{ Bng | Bni -> 0x0075 }
            X.CqJ r0 = r5.A00     // Catch:{ Bng | Bni -> 0x0075 }
            byte r0 = r0.A00     // Catch:{ Bng | Bni -> 0x0075 }
            r6 = r1[r0]     // Catch:{ Bng | Bni -> 0x0075 }
            X.DS5 r4 = r5.A03     // Catch:{ Bng | Bni -> 0x0075 }
            int r3 = r4.A00     // Catch:{ Bng | Bni -> 0x0075 }
            r2 = 0
        L_0x0023:
            r1 = 0
            if (r2 < r3) goto L_0x0027
            goto L_0x0038
        L_0x0027:
            if (r1 >= r3) goto L_0x0035
            boolean r0 = r6.A00(r2, r1)     // Catch:{ Bng | Bni -> 0x0075 }
            if (r0 == 0) goto L_0x0032
            r4.A00(r1, r2)     // Catch:{ Bng | Bni -> 0x0075 }
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x0027
        L_0x0035:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0038:
            r1 = 1
            r0 = 0
            r5.A01 = r0     // Catch:{ Bng | Bni -> 0x0075 }
            r5.A00 = r0     // Catch:{ Bng | Bni -> 0x0075 }
            r5.A02 = r1     // Catch:{ Bng | Bni -> 0x0075 }
            r5.A02()     // Catch:{ Bng | Bni -> 0x0075 }
            r5.A01()     // Catch:{ Bng | Bni -> 0x0075 }
            r4 = 0
        L_0x0047:
            X.DS5 r3 = r5.A03     // Catch:{ Bng | Bni -> 0x0075 }
            int r0 = r3.A02     // Catch:{ Bng | Bni -> 0x0075 }
            if (r4 >= r0) goto L_0x0069
            int r2 = r4 + 1
        L_0x004f:
            int r0 = r3.A00     // Catch:{ Bng | Bni -> 0x0075 }
            if (r2 >= r0) goto L_0x0066
            boolean r1 = r3.A03(r4, r2)     // Catch:{ Bng | Bni -> 0x0075 }
            boolean r0 = r3.A03(r2, r4)     // Catch:{ Bng | Bni -> 0x0075 }
            if (r1 == r0) goto L_0x0063
            r3.A00(r2, r4)     // Catch:{ Bng | Bni -> 0x0075 }
            r3.A00(r4, r2)     // Catch:{ Bng | Bni -> 0x0075 }
        L_0x0063:
            int r2 = r2 + 1
            goto L_0x004f
        L_0x0066:
            int r4 = r4 + 1
            goto L_0x0047
        L_0x0069:
            X.CTM r1 = r9.A00(r5, r11)     // Catch:{ Bng | Bni -> 0x0075 }
            X.CBr r0 = new X.CBr     // Catch:{ Bng | Bni -> 0x0075 }
            r0.<init>()     // Catch:{ Bng | Bni -> 0x0075 }
            r1.A00 = r0     // Catch:{ Bng | Bni -> 0x0075 }
            return r1
        L_0x0075:
            if (r8 == 0) goto L_0x0078
            throw r8
        L_0x0078:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25637CjP.A01(X.DS5, java.util.Map):X.CTM");
    }
}
