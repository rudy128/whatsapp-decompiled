package X;

/* renamed from: X.CoW  reason: case insensitive filesystem */
public abstract class C25912CoW {
    public static final int[] A00 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX WARNING: Code restructure failed: missing block: B:383:0x06f3, code lost:
        r17 = r17 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x027a A[LOOP:8: B:144:0x0278->B:145:0x027a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x0788  */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x0070 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0237 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024 A[SYNTHETIC, Splitter:B:8:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C25088CWz A00(java.lang.Integer r30, java.lang.String r31, java.util.Map r32) {
        /*
            r3 = r32
            if (r32 == 0) goto L_0x0020
            X.ByL r1 = X.C24262ByL.CHARACTER_SET
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0020
            r7 = 1
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r9 = r0.toString()
        L_0x0015:
            java.lang.String r6 = "Shift_JIS"
            boolean r0 = r6.equals(r9)
            r8 = r31
            if (r0 == 0) goto L_0x0044
            goto L_0x0024
        L_0x0020:
            r7 = 0
            java.lang.String r9 = "ISO-8859-1"
            goto L_0x0015
        L_0x0024:
            byte[] r5 = r8.getBytes(r6)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            int r4 = r5.length
            int r0 = r4 % 2
            if (r0 != 0) goto L_0x0044
            r2 = 0
        L_0x002e:
            if (r2 >= r4) goto L_0x006d
            byte r0 = r5[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 129(0x81, float:1.81E-43)
            if (r1 < r0) goto L_0x0044
            r0 = 159(0x9f, float:2.23E-43)
            if (r1 <= r0) goto L_0x006a
            r0 = 224(0xe0, float:3.14E-43)
            if (r1 < r0) goto L_0x0044
            r0 = 235(0xeb, float:3.3E-43)
            if (r1 <= r0) goto L_0x006a
        L_0x0044:
            r5 = 0
            r1 = 0
            r4 = 0
        L_0x0047:
            int r0 = r8.length()
            if (r5 >= r0) goto L_0x0070
            char r2 = r8.charAt(r5)
            r0 = 48
            if (r2 < r0) goto L_0x005d
            r0 = 57
            if (r2 > r0) goto L_0x005d
            r4 = 1
        L_0x005a:
            int r5 = r5 + 1
            goto L_0x0047
        L_0x005d:
            int[] r1 = A00
            r0 = 96
            if (r2 >= r0) goto L_0x00e1
            r1 = r1[r2]
            r0 = -1
            if (r1 == r0) goto L_0x00e1
            r1 = 1
            goto L_0x005a
        L_0x006a:
            int r2 = r2 + 2
            goto L_0x002e
        L_0x006d:
            X.C0A r2 = X.C0A.A07
            goto L_0x0074
        L_0x0070:
            if (r1 == 0) goto L_0x00dc
            X.C0A r2 = X.C0A.A01
        L_0x0074:
            X.DS4 r5 = new X.DS4
            r5.<init>()
            X.C0A r4 = X.C0A.A02
            if (r2 != r4) goto L_0x009c
            if (r7 == 0) goto L_0x009c
            java.util.Map r0 = X.C0N.A00
            java.lang.Object r7 = r0.get(r9)
            X.C0N r7 = (X.C0N) r7
            if (r7 == 0) goto L_0x009c
            X.C0A r0 = X.C0A.A03
            int r1 = r0.bits
            r0 = 4
            r5.A01(r1, r0)
            int[] r0 = r7.values
            int r1 = X.BE6.A0I(r0)
            r0 = 8
            r5.A01(r1, r0)
        L_0x009c:
            if (r32 == 0) goto L_0x00c0
            X.ByL r1 = X.C24262ByL.GS1_FORMAT
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c0
            X.C0A r0 = X.C0A.A04
            int r1 = r0.bits
            r0 = 4
            r5.A01(r1, r0)
        L_0x00c0:
            int r1 = r2.bits
            r0 = 4
            r5.A01(r1, r0)
            X.DS4 r7 = new X.DS4
            r7.<init>()
            int r1 = r2.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x019b
            r0 = 2
            if (r1 == r0) goto L_0x0157
            r0 = 4
            if (r1 == r0) goto L_0x013e
            r0 = 6
            if (r1 != r0) goto L_0x0132
            goto L_0x00e4
        L_0x00dc:
            if (r4 == 0) goto L_0x00e1
            X.C0A r2 = X.C0A.A08
            goto L_0x0074
        L_0x00e1:
            X.C0A r2 = X.C0A.A02
            goto L_0x0074
        L_0x00e4:
            byte[] r10 = r8.getBytes(r6)     // Catch:{ UnsupportedEncodingException -> 0x012b }
            int r9 = r10.length
            r6 = 0
        L_0x00ea:
            if (r6 >= r9) goto L_0x01e5
            byte r0 = r10[r6]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r6 + 1
            byte r0 = r10[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r11 = r1 << 8
            r11 = r11 | r0
            r12 = 33088(0x8140, float:4.6366E-41)
            r1 = -1
            if (r11 < r12) goto L_0x0123
            r0 = 40956(0x9ffc, float:5.7392E-41)
            if (r11 <= r0) goto L_0x0111
            r0 = 57408(0xe040, float:8.0446E-41)
            if (r11 < r0) goto L_0x0123
            r0 = 60351(0xebbf, float:8.457E-41)
            if (r11 > r0) goto L_0x0123
            r12 = 49472(0xc140, float:6.9325E-41)
        L_0x0111:
            int r11 = r11 - r12
            if (r11 == r1) goto L_0x0123
            int r0 = r11 >> 8
            int r1 = r0 * 192
            r0 = r11 & 255(0xff, float:3.57E-43)
            int r1 = r1 + r0
            r0 = 13
            r7.A01(r1, r0)
            int r6 = r6 + 2
            goto L_0x00ea
        L_0x0123:
            java.lang.String r1 = "Invalid byte sequence"
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x012b:
            r1 = move-exception
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0132:
            java.lang.String r0 = "Invalid mode: "
            java.lang.String r1 = X.BE7.A0m(r0, r2)
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x013e:
            byte[] r10 = r8.getBytes(r9)     // Catch:{ UnsupportedEncodingException -> 0x0150 }
            int r9 = r10.length
            r6 = 0
        L_0x0144:
            if (r6 >= r9) goto L_0x01e5
            byte r1 = r10[r6]
            r0 = 8
            r7.A01(r1, r0)
            int r6 = r6 + 1
            goto L_0x0144
        L_0x0150:
            r1 = move-exception
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0157:
            int r9 = r8.length()
            r6 = 0
        L_0x015c:
            if (r6 >= r9) goto L_0x01e5
            char r0 = r8.charAt(r6)
            int[] r12 = A00
            r11 = 96
            if (r0 >= r11) goto L_0x0195
            r10 = r12[r0]
            r1 = -1
            if (r10 == r1) goto L_0x0195
            int r0 = r6 + 1
            if (r0 >= r9) goto L_0x0188
            int r0 = r6 + 1
            char r0 = r8.charAt(r0)
            if (r0 >= r11) goto L_0x018f
            r0 = r12[r0]
            if (r0 == r1) goto L_0x018f
            int r1 = r10 * 45
            int r1 = r1 + r0
            r0 = 11
            r7.A01(r1, r0)
            int r6 = r6 + 2
            goto L_0x015c
        L_0x0188:
            r0 = 6
            r7.A01(r10, r0)
            int r6 = r6 + 1
            goto L_0x015c
        L_0x018f:
            X.C2V r0 = new X.C2V
            r0.<init>()
            throw r0
        L_0x0195:
            X.C2V r0 = new X.C2V
            r0.<init>()
            throw r0
        L_0x019b:
            int r9 = r8.length()
            r6 = 0
        L_0x01a0:
            if (r6 >= r9) goto L_0x01e5
            char r0 = r8.charAt(r6)
            int r1 = r0 + -48
            int r10 = r6 + 2
            int r0 = r6 + 1
            if (r10 >= r9) goto L_0x01ca
            char r0 = r8.charAt(r0)
            int r12 = r0 + -48
            int r0 = r6 + 2
            char r0 = r8.charAt(r0)
            int r11 = r0 + -48
            int r10 = r1 * 100
            r1 = 10
            int r0 = r12 * 10
            int r10 = r10 + r0
            int r10 = r10 + r11
            r7.A01(r10, r1)
            int r6 = r6 + 3
            goto L_0x01a0
        L_0x01ca:
            if (r0 >= r9) goto L_0x01de
            int r0 = r6 + 1
            char r0 = r8.charAt(r0)
            int r0 = r0 + -48
            int r1 = r1 * 10
            int r1 = r1 + r0
            r0 = 7
            r7.A01(r1, r0)
            int r6 = r6 + 2
            goto L_0x01a0
        L_0x01de:
            r0 = 4
            r7.A01(r1, r0)
            int r6 = r6 + 1
            goto L_0x01a0
        L_0x01e5:
            r32 = r30
            if (r3 == 0) goto L_0x021b
            X.ByL r1 = X.C24262ByL.QR_VERSION
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x021b
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            X.Cwp r1 = X.C26289Cwp.A03(r0)
            int r3 = r5.A00
            int r0 = r2.A00(r1)
            int r3 = r3 + r0
            int r0 = r7.A00
            int r3 = r3 + r0
            r0 = r32
            boolean r0 = A01(r1, r0, r3)
            if (r0 != 0) goto L_0x026a
            java.lang.String r1 = "Data too big for requested version"
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x021b:
            X.Cwp[] r1 = X.C26289Cwp.A04
            r0 = 0
            r0 = r1[r0]
            int r6 = r5.A00
            int r0 = r2.A00(r0)
            int r6 = r6 + r0
            int r0 = r7.A00
            int r6 = r6 + r0
            r3 = 1
        L_0x022b:
            X.Cwp r1 = X.C26289Cwp.A03(r3)
            r0 = r32
            boolean r0 = A01(r1, r0, r6)
            if (r0 == 0) goto L_0x025c
            int r6 = r5.A00
            int r0 = r2.A00(r1)
            int r6 = r6 + r0
            int r0 = r7.A00
            int r6 = r6 + r0
            r3 = 1
        L_0x0242:
            X.Cwp r1 = X.C26289Cwp.A03(r3)
            r0 = r32
            boolean r0 = A01(r1, r0, r6)
            if (r0 != 0) goto L_0x026a
            int r3 = r3 + 1
            r0 = 40
            if (r3 <= r0) goto L_0x0242
            java.lang.String r1 = "Data too big"
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x025c:
            int r3 = r3 + 1
            r0 = 40
            if (r3 <= r0) goto L_0x022b
            java.lang.String r1 = "Data too big"
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x026a:
            X.DS4 r6 = new X.DS4
            r6.<init>()
            int r9 = r5.A00
            int r0 = r6.A00
            int r0 = r0 + r9
            X.DS4.A00(r6, r0)
            r3 = 0
        L_0x0278:
            if (r3 >= r9) goto L_0x0284
            boolean r0 = r5.A03(r3)
            r6.A02(r0)
            int r3 = r3 + 1
            goto L_0x0278
        L_0x0284:
            if (r2 != r4) goto L_0x02ad
            int r0 = r7.A00
            int r0 = r0 + 7
            int r5 = r0 / 8
        L_0x028c:
            int r0 = r2.A00(r1)
            r4 = 1
            int r3 = r4 << r0
            if (r5 >= r3) goto L_0x0788
            r6.A01(r5, r0)
            int r4 = r7.A00
            int r0 = r6.A00
            int r0 = r0 + r4
            X.DS4.A00(r6, r0)
            r3 = 0
        L_0x02a1:
            if (r3 >= r4) goto L_0x02b2
            boolean r0 = r7.A03(r3)
            r6.A02(r0)
            int r3 = r3 + 1
            goto L_0x02a1
        L_0x02ad:
            int r5 = r8.length()
            goto L_0x028c
        L_0x02b2:
            X.CO2[] r3 = r1.A03
            int r0 = r32.intValue()
            r10 = r3[r0]
            int r4 = r1.A00
            int r9 = r10.A00
            X.CO1[] r8 = r10.A01
            int r7 = r8.length
            r5 = 0
            r3 = 0
        L_0x02c3:
            if (r5 >= r7) goto L_0x02cd
            r0 = r8[r5]
            int r0 = r0.A00
            int r3 = r3 + r0
            int r5 = r5 + 1
            goto L_0x02c3
        L_0x02cd:
            int r9 = r9 * r3
            int r30 = r4 - r9
            int r8 = r30 << 3
            int r3 = r6.A00
            if (r3 > r8) goto L_0x0773
            r9 = 0
            r3 = 0
        L_0x02d8:
            int r0 = r6.A00
            if (r0 >= r8) goto L_0x02e5
            r6.A02(r9)
            int r3 = r3 + 1
            r0 = 4
            if (r3 >= r0) goto L_0x02e5
            goto L_0x02d8
        L_0x02e5:
            int r0 = r6.A00
            r0 = r0 & 7
            r7 = 8
            if (r0 <= 0) goto L_0x02f5
        L_0x02ed:
            if (r0 >= r7) goto L_0x02f5
            r6.A02(r9)
            int r0 = r0 + 1
            goto L_0x02ed
        L_0x02f5:
            int r0 = r6.A00
            int r0 = r0 + 7
            int r0 = r0 / 8
            int r5 = r30 - r0
        L_0x02fd:
            if (r9 >= r5) goto L_0x030d
            r3 = r9 & 1
            r0 = 17
            if (r3 != 0) goto L_0x0307
            r0 = 236(0xec, float:3.31E-43)
        L_0x0307:
            r6.A01(r0, r7)
            int r9 = r9 + 1
            goto L_0x02fd
        L_0x030d:
            int r9 = r6.A00
            if (r9 != r8) goto L_0x076b
            X.CO1[] r8 = r10.A01
            int r7 = r8.length
            r3 = 0
            r5 = 0
        L_0x0316:
            if (r3 >= r7) goto L_0x0320
            r0 = r8[r3]
            int r0 = r0.A00
            int r5 = r5 + r0
            int r3 = r3 + 1
            goto L_0x0316
        L_0x0320:
            int r0 = r9 + 7
            int r3 = r0 / 8
            r0 = r30
            if (r3 != r0) goto L_0x0763
            java.util.ArrayList r29 = X.C17880vN.A0z(r5)
            r3 = 0
            r28 = 0
            r27 = 0
            r26 = 0
            r25 = 0
        L_0x0335:
            r0 = r28
            if (r0 >= r5) goto L_0x0519
            r7 = 1
            int[] r0 = new int[r7]
            r24 = r0
            int[] r12 = new int[r7]
            r0 = r28
            if (r0 >= r5) goto L_0x0511
            int r14 = r4 % r5
            int r13 = r5 - r14
            int r7 = r4 / r5
            int r11 = r7 + 1
            int r10 = r30 / r5
            int r9 = r10 + 1
            int r7 = r7 - r10
            int r11 = r11 - r9
            if (r7 != r11) goto L_0x0509
            int r0 = r13 + r14
            if (r5 != r0) goto L_0x0501
            int r8 = r10 + r7
            int r8 = r8 * r13
            int r0 = r9 + r11
            int r0 = r0 * r14
            int r8 = r8 + r0
            if (r4 != r8) goto L_0x04f9
            r0 = r28
            if (r0 >= r13) goto L_0x04d8
            r24[r3] = r10
            r12[r3] = r7
        L_0x0369:
            r8 = r24[r3]
            byte[] r0 = new byte[r8]
            r23 = r0
            int r12 = r27 << 3
            r11 = 0
        L_0x0372:
            if (r11 >= r8) goto L_0x038f
            r13 = 0
            r10 = 0
        L_0x0376:
            boolean r0 = r6.A03(r12)
            if (r0 == 0) goto L_0x0381
            int r9 = 7 - r13
            r0 = 1
            int r0 = r0 << r9
            r10 = r10 | r0
        L_0x0381:
            int r12 = r12 + 1
            int r13 = r13 + 1
            r0 = 8
            if (r13 < r0) goto L_0x0376
            byte r0 = (byte) r10
            r23[r11] = r0
            int r11 = r11 + 1
            goto L_0x0372
        L_0x038f:
            int r9 = r8 + r7
            int[] r0 = new int[r9]
            r22 = r0
            r10 = 0
            r11 = 0
        L_0x0397:
            if (r11 >= r8) goto L_0x03a2
            byte r0 = r23[r11]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r22[r11] = r0
            int r11 = r11 + 1
            goto L_0x0397
        L_0x03a2:
            X.CmE r18 = X.C25801CmE.A0D
            java.util.ArrayList r17 = X.AnonymousClass000.A13()
            r11 = 1
            int[] r13 = new int[r11]
            r13[r3] = r11
            X.CcG r12 = new X.CcG
            r0 = r18
            r12.<init>(r0, r13)
            r0 = r17
            r0.add(r12)
            if (r7 == 0) goto L_0x04f2
            int r9 = r9 - r7
            if (r9 <= 0) goto L_0x04eb
            int r0 = r17.size()
            if (r7 < r0) goto L_0x03fc
            int r12 = r17.size()
            int r12 = r12 - r11
            r0 = r17
            java.lang.Object r13 = r0.get(r12)
            X.CcG r13 = (X.C25270CcG) r13
            int r12 = r17.size()
        L_0x03d5:
            if (r12 > r7) goto L_0x03fc
            int[] r16 = X.C108945cZ.A1W()
            r16[r3] = r11
            int r14 = r12 + -1
            r0 = r18
            int[] r0 = r0.A02
            r0 = r0[r14]
            r16[r11] = r0
            X.CcG r15 = new X.CcG
            r14 = r18
            r0 = r16
            r15.<init>(r14, r0)
            X.CcG r13 = r13.A04(r15)
            r0 = r17
            r0.add(r13)
            int r12 = r12 + 1
            goto L_0x03d5
        L_0x03fc:
            r0 = r17
            java.lang.Object r14 = r0.get(r7)
            X.CcG r14 = (X.C25270CcG) r14
            int[] r13 = new int[r9]
            r0 = r22
            java.lang.System.arraycopy(r0, r3, r13, r3, r9)
            X.CcG r12 = new X.CcG
            r0 = r18
            r12.<init>(r0, r13)
            X.CcG r15 = r12.A02(r7, r11)
            X.CmE r13 = r15.A00
            X.CmE r0 = r14.A00
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x04e4
            int[] r0 = r14.A01
            r12 = r0
            r0 = r0[r3]
            if (r0 != 0) goto L_0x042e
            java.lang.String r0 = "Divide by 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x042e:
            X.CcG r0 = r13.A01
            r31 = r0
            r21 = r0
            int r0 = r12.length
            int r20 = r0 + -1
            int r0 = r20 - r20
            r0 = r12[r0]
            int r19 = r13.A00(r0)
        L_0x043f:
            int[] r0 = r15.A01
            int r0 = r0.length
            int r0 = r0 + -1
            r12 = r0
            r0 = r20
            if (r12 < r0) goto L_0x048c
            int[] r0 = r15.A01
            r0 = r0[r3]
            if (r0 == 0) goto L_0x048c
            int[] r0 = r15.A01
            r12 = r0
            int r0 = r0.length
            int r0 = r0 + -1
            int r18 = r0 - r20
            int r0 = r0 - r0
            r0 = r12[r0]
            r12 = r0
            r0 = r19
            int r16 = r13.A01(r12, r0)
            r12 = r18
            r0 = r16
            X.CcG r17 = r14.A02(r12, r0)
            if (r18 < 0) goto L_0x04df
            if (r16 != 0) goto L_0x047e
            r16 = r31
        L_0x046f:
            r12 = r21
            r0 = r16
            X.CcG r21 = r12.A03(r0)
            r0 = r17
            X.CcG r15 = r15.A03(r0)
            goto L_0x043f
        L_0x047e:
            int r0 = r18 + 1
            int[] r0 = new int[r0]
            r0[r3] = r16
            X.CcG r16 = new X.CcG
            r12 = r16
            r12.<init>(r13, r0)
            goto L_0x046f
        L_0x048c:
            r0 = 2
            X.CcG[] r0 = new X.C25270CcG[r0]
            r0[r3] = r21
            r0[r11] = r15
            r0 = r0[r11]
            int[] r14 = r0.A01
            int r13 = r14.length
            int r12 = r7 - r13
            r11 = 0
        L_0x049b:
            if (r11 >= r12) goto L_0x04a4
            int r0 = r9 + r11
            r22[r0] = r3
            int r11 = r11 + 1
            goto L_0x049b
        L_0x04a4:
            int r9 = r9 + r12
            r0 = r22
            java.lang.System.arraycopy(r14, r3, r0, r9, r13)
            byte[] r11 = new byte[r7]
        L_0x04ac:
            if (r10 >= r7) goto L_0x04b8
            int r0 = r8 + r10
            r0 = r22[r0]
            byte r0 = (byte) r0
            r11[r10] = r0
            int r10 = r10 + 1
            goto L_0x04ac
        L_0x04b8:
            X.CO3 r9 = new X.CO3
            r0 = r23
            r9.<init>(r0, r11)
            r0 = r29
            r0.add(r9)
            r0 = r26
            int r26 = java.lang.Math.max(r0, r8)
            r0 = r25
            int r25 = java.lang.Math.max(r0, r7)
            r0 = r24[r3]
            int r27 = r27 + r0
            int r28 = r28 + 1
            goto L_0x0335
        L_0x04d8:
            r24[r3] = r9
            r12[r3] = r11
            r7 = r11
            goto L_0x0369
        L_0x04df:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()
            throw r0
        L_0x04e4:
            java.lang.String r0 = "GenericGFPolys do not have same GenericGF field"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x04eb:
            java.lang.String r0 = "No data bytes provided"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x04f2:
            java.lang.String r0 = "No error correction bytes"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x04f9:
            java.lang.String r1 = "Total bytes mismatch"
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0501:
            java.lang.String r1 = "RS blocks mismatch"
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0509:
            java.lang.String r1 = "EC bytes mismatch"
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0511:
            java.lang.String r1 = "Block ID too large"
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0519:
            r5 = r30
            r0 = r27
            if (r5 != r0) goto L_0x075b
            X.DS4 r5 = new X.DS4
            r5.<init>()
            r9 = 0
        L_0x0525:
            r8 = 8
            r0 = r26
            if (r9 >= r0) goto L_0x0549
            java.util.Iterator r7 = r29.iterator()
        L_0x052f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0546
            java.lang.Object r0 = r7.next()
            X.CO3 r0 = (X.CO3) r0
            byte[] r6 = r0.A00
            int r0 = r6.length
            if (r9 >= r0) goto L_0x052f
            byte r0 = r6[r9]
            r5.A01(r0, r8)
            goto L_0x052f
        L_0x0546:
            int r9 = r9 + 1
            goto L_0x0525
        L_0x0549:
            r0 = r25
            if (r3 >= r0) goto L_0x056b
            java.util.Iterator r7 = r29.iterator()
        L_0x0551:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0568
            java.lang.Object r0 = r7.next()
            X.CO3 r0 = (X.CO3) r0
            byte[] r6 = r0.A01
            int r0 = r6.length
            if (r3 >= r0) goto L_0x0551
            byte r0 = r6[r3]
            r5.A01(r0, r8)
            goto L_0x0551
        L_0x0568:
            int r3 = r3 + 1
            goto L_0x0549
        L_0x056b:
            int r0 = r5.A00
            int r0 = r0 + 7
            int r3 = r0 / 8
            if (r4 != r3) goto L_0x073e
            X.CWz r3 = new X.CWz
            r3.<init>()
            r0 = r32
            r3.A04 = r0
            r3.A01 = r2
            r3.A02 = r1
            int r0 = r1.A01
            int r0 = r0 * 4
            int r0 = r0 + 17
            X.CWH r4 = new X.CWH
            r4.<init>(r0, r0)
            r19 = 2147483647(0x7fffffff, float:NaN)
            r18 = -1
            r6 = 0
        L_0x0591:
            r0 = r32
            X.C26179Ctz.A00(r5, r1, r4, r0, r6)
            int r10 = r4.A00
            int r13 = r4.A01
            byte[][] r12 = r4.A02
            r7 = 0
            r8 = 0
        L_0x059e:
            if (r7 >= r10) goto L_0x05c5
            r15 = -1
            r11 = 0
            r14 = 0
        L_0x05a3:
            r9 = 5
            if (r11 >= r13) goto L_0x05bb
            r0 = r12[r7]
            byte r2 = r0[r11]
            if (r2 != r15) goto L_0x05b1
            int r14 = r14 + 1
        L_0x05ae:
            int r11 = r11 + 1
            goto L_0x05a3
        L_0x05b1:
            if (r14 < r9) goto L_0x05b8
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r8 = r8 + r0
        L_0x05b8:
            r15 = r2
            r14 = 1
            goto L_0x05ae
        L_0x05bb:
            if (r14 < r9) goto L_0x05c2
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r8 = r8 + r0
        L_0x05c2:
            int r7 = r7 + 1
            goto L_0x059e
        L_0x05c5:
            r7 = 0
            r16 = 0
        L_0x05c8:
            if (r7 >= r13) goto L_0x05f1
            r15 = -1
            r11 = 0
            r14 = 0
        L_0x05cd:
            r9 = 5
            if (r11 >= r10) goto L_0x05e6
            r0 = r12[r11]
            byte r2 = r0[r7]
            if (r2 != r15) goto L_0x05db
            int r14 = r14 + 1
        L_0x05d8:
            int r11 = r11 + 1
            goto L_0x05cd
        L_0x05db:
            if (r14 < r9) goto L_0x05e3
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r16 = r16 + r0
        L_0x05e3:
            r15 = r2
            r14 = 1
            goto L_0x05d8
        L_0x05e6:
            if (r14 < r9) goto L_0x05ee
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r16 = r16 + r0
        L_0x05ee:
            int r7 = r7 + 1
            goto L_0x05c8
        L_0x05f1:
            int r8 = r8 + r16
            r11 = 0
            r15 = 0
        L_0x05f5:
            int r0 = r10 + -1
            if (r11 >= r0) goto L_0x0622
            r14 = r12[r11]
            r9 = 0
        L_0x05fc:
            int r0 = r13 + -1
            if (r9 >= r0) goto L_0x061f
            byte r7 = r14[r9]
            int r0 = r9 + 1
            byte r0 = r14[r0]
            if (r7 != r0) goto L_0x061c
            int r0 = r11 + 1
            r0 = r12[r0]
            byte r0 = r0[r9]
            if (r7 != r0) goto L_0x061c
            int r0 = r11 + 1
            r2 = r12[r0]
            int r0 = r9 + 1
            byte r0 = r2[r0]
            if (r7 != r0) goto L_0x061c
            int r15 = r15 + 1
        L_0x061c:
            int r9 = r9 + 1
            goto L_0x05fc
        L_0x061f:
            int r11 = r11 + 1
            goto L_0x05f5
        L_0x0622:
            int r0 = r15 * 3
            int r8 = r8 + r0
            r9 = 0
            r17 = 0
        L_0x0628:
            if (r9 >= r10) goto L_0x06fd
            r7 = 0
        L_0x062b:
            if (r7 >= r13) goto L_0x06f9
            r14 = r12[r9]
            int r0 = r7 + 6
            r2 = 1
            if (r0 >= r13) goto L_0x068a
            byte r0 = r14[r7]
            if (r0 != r2) goto L_0x068a
            int r0 = r7 + 1
            byte r0 = r14[r0]
            if (r0 != 0) goto L_0x068a
            int r0 = r7 + 2
            byte r0 = r14[r0]
            if (r0 != r2) goto L_0x068a
            int r0 = r7 + 3
            byte r0 = r14[r0]
            if (r0 != r2) goto L_0x068a
            int r0 = r7 + 4
            byte r0 = r14[r0]
            if (r0 != r2) goto L_0x068a
            int r0 = r7 + 5
            byte r0 = r14[r0]
            if (r0 != 0) goto L_0x068a
            int r0 = r7 + 6
            byte r0 = r14[r0]
            if (r0 != r2) goto L_0x068a
            int r0 = r7 + -4
            r15 = 0
            int r11 = java.lang.Math.max(r0, r15)
            int r0 = r14.length
            int r16 = java.lang.Math.min(r7, r0)
        L_0x0668:
            r0 = r16
            if (r11 >= r0) goto L_0x0688
            byte r0 = r14[r11]
            int r11 = r11 + 1
            if (r0 != r2) goto L_0x0668
            int r0 = r7 + 7
            int r11 = r7 + 11
            int r15 = java.lang.Math.max(r0, r15)
            int r0 = r14.length
            int r11 = java.lang.Math.min(r11, r0)
        L_0x067f:
            if (r15 >= r11) goto L_0x0688
            byte r0 = r14[r15]
            if (r0 == r2) goto L_0x068a
            int r15 = r15 + 1
            goto L_0x067f
        L_0x0688:
            int r17 = r17 + 1
        L_0x068a:
            int r0 = r9 + 6
            if (r0 >= r10) goto L_0x06f5
            r0 = r12[r9]
            byte r0 = r0[r7]
            if (r0 != r2) goto L_0x06f5
            int r0 = r9 + 1
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != 0) goto L_0x06f5
            int r0 = r9 + 2
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != r2) goto L_0x06f5
            int r0 = r9 + 3
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != r2) goto L_0x06f5
            int r0 = r9 + 4
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != r2) goto L_0x06f5
            int r0 = r9 + 5
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != 0) goto L_0x06f5
            int r0 = r9 + 6
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != r2) goto L_0x06f5
            int r0 = r9 + -4
            r14 = 0
            int r15 = java.lang.Math.max(r0, r14)
            int r11 = r12.length
            int r16 = java.lang.Math.min(r9, r11)
        L_0x06d0:
            r0 = r16
            if (r15 >= r0) goto L_0x06f3
            r0 = r12[r15]
            byte r0 = r0[r7]
            int r15 = r15 + 1
            if (r0 != r2) goto L_0x06d0
            int r15 = r9 + 7
            int r0 = r9 + 11
            int r14 = java.lang.Math.max(r15, r14)
            int r11 = java.lang.Math.min(r0, r11)
        L_0x06e8:
            if (r14 >= r11) goto L_0x06f3
            r0 = r12[r14]
            byte r0 = r0[r7]
            if (r0 == r2) goto L_0x06f5
            int r14 = r14 + 1
            goto L_0x06e8
        L_0x06f3:
            int r17 = r17 + 1
        L_0x06f5:
            int r7 = r7 + 1
            goto L_0x062b
        L_0x06f9:
            int r9 = r9 + 1
            goto L_0x0628
        L_0x06fd:
            int r0 = r17 * 40
            int r8 = r8 + r0
            r14 = 0
            r11 = 0
        L_0x0702:
            r9 = 1
            if (r14 >= r10) goto L_0x0716
            r7 = r12[r14]
            r2 = 0
        L_0x0708:
            if (r2 >= r13) goto L_0x0713
            byte r0 = r7[r2]
            if (r0 != r9) goto L_0x0710
            int r11 = r11 + 1
        L_0x0710:
            int r2 = r2 + 1
            goto L_0x0708
        L_0x0713:
            int r14 = r14 + 1
            goto L_0x0702
        L_0x0716:
            int r10 = r10 * r13
            int r0 = r11 << 1
            int r0 = X.C108945cZ.A05(r0, r10)
            int r0 = r0 * 10
            int r0 = r0 / r10
            int r0 = r0 * 10
            int r8 = r8 + r0
            r0 = r19
            if (r8 >= r0) goto L_0x072b
            r18 = r6
            r19 = r8
        L_0x072b:
            int r6 = r6 + 1
            r0 = 8
            if (r6 < r0) goto L_0x0591
            r0 = r18
            r3.A00 = r0
            r2 = r0
            r0 = r32
            X.C26179Ctz.A00(r5, r1, r4, r0, r2)
            r3.A03 = r4
            return r3
        L_0x073e:
            java.lang.String r0 = "Interleaving error: "
            java.lang.StringBuilder r1 = X.BE6.A0u(r0)
            r1.append(r4)
            java.lang.String r0 = " and "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " differ."
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x075b:
            java.lang.String r1 = "Data bytes does not match offset"
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0763:
            java.lang.String r1 = "Number of bits and data bytes does not match"
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x076b:
            java.lang.String r1 = "Bits size does not equal capacity"
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0773:
            java.lang.String r0 = "data bits cannot fit in the QR Code"
            java.lang.StringBuilder r1 = X.BE6.A0u(r0)
            r1.append(r3)
            java.lang.String r0 = " > "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r8)
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0788:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r1.append(r5)
            java.lang.String r0 = " is bigger than "
            r1.append(r0)
            int r3 = r3 - r4
            java.lang.String r1 = X.C17880vN.A0t(r1, r3)
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25912CoW.A00(java.lang.Integer, java.lang.String, java.util.Map):X.CWz");
    }

    public static boolean A01(C26289Cwp cwp, Integer num, int i) {
        int i2 = cwp.A00;
        CO2 co2 = cwp.A03[num.intValue()];
        int i3 = co2.A00;
        int i4 = 0;
        for (CO1 co1 : co2.A01) {
            i4 += co1.A00;
        }
        return C108975cc.A1C(i2 - (i3 * i4), (i + 7) / 8);
    }
}
