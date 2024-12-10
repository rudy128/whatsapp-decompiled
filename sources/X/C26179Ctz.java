package X;

/* renamed from: X.Ctz  reason: case insensitive filesystem */
public abstract class C26179Ctz {
    public static final int[][] A00 = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] A01 = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, AnonymousClass74N.A03, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] A02 = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] A03 = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0202, code lost:
        r0 = r0 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0203, code lost:
        r1 = r0 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e3, code lost:
        r1 = (r1 + r0) & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e6, code lost:
        if (r1 != 0) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e8, code lost:
        r11 = !r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ea, code lost:
        r9[r6][r12] = r11 ? (byte) 1 : 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.DS4 r18, X.C26289Cwp r19, X.CWH r20, java.lang.Integer r21, int r22) {
        /*
            r3 = -1
            r4 = r20
            byte[][] r9 = r4.A02
            int r2 = r9.length
            r1 = 0
        L_0x0007:
            if (r1 >= r2) goto L_0x0011
            r0 = r9[r1]
            java.util.Arrays.fill(r0, r3)
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0011:
            int[][] r0 = A02
            r3 = 0
            r0 = r0[r3]
            int r0 = r0.length
            A02(r4, r3, r3)
            int r8 = r4.A01
            int r0 = r8 - r0
            A02(r4, r0, r3)
            A02(r4, r3, r0)
            r2 = 7
            A01(r4, r3, r2)
            int r0 = r8 + -8
            A01(r4, r0, r2)
            A01(r4, r3, r0)
            A03(r4, r2, r3)
            int r7 = r4.A00
            int r1 = r7 - r2
            int r0 = r1 + -1
            A03(r4, r0, r3)
            A03(r4, r2, r1)
            r2 = 8
            int r0 = r7 - r2
            r1 = r9[r0]
            byte r0 = r1[r2]
            if (r0 == 0) goto L_0x0258
            r0 = 1
            r1[r2] = r0
            r0 = r19
            int r3 = r0.A01
            r0 = 2
            if (r3 < r0) goto L_0x0093
            int r1 = r3 + -1
            int[][] r0 = A01
            r13 = r0[r1]
            int r12 = r13.length
            r11 = 0
        L_0x005b:
            if (r11 >= r12) goto L_0x0093
            r17 = r13[r11]
            if (r17 < 0) goto L_0x0090
            r10 = 0
        L_0x0062:
            if (r10 >= r12) goto L_0x0090
            r2 = r13[r10]
            if (r2 < 0) goto L_0x008d
            r0 = r9[r17]
            byte r1 = r0[r2]
            r0 = -1
            if (r1 != r0) goto L_0x008d
            int r16 = r2 + -2
            int r15 = r17 + -2
            r6 = 0
        L_0x0074:
            r5 = 5
            if (r6 >= r5) goto L_0x008d
            int[][] r0 = A00
            r14 = r0[r6]
            r4 = 0
        L_0x007c:
            int r2 = r16 + r4
            int r0 = r15 + r6
            r1 = r14[r4]
            r0 = r9[r0]
            int r4 = X.BE6.A0A(r1, r0, r2, r4)
            if (r4 < r5) goto L_0x007c
            int r6 = r6 + 1
            goto L_0x0074
        L_0x008d:
            int r10 = r10 + 1
            goto L_0x0062
        L_0x0090:
            int r11 = r11 + 1
            goto L_0x005b
        L_0x0093:
            r10 = 8
            r5 = 8
        L_0x0097:
            int r0 = r8 - r10
            if (r5 >= r0) goto L_0x00b9
            int r0 = r5 + 1
            int r6 = r0 % 2
            r4 = 6
            r2 = r9[r4]
            byte r1 = r2[r5]
            r0 = -1
            if (r1 != r0) goto L_0x00aa
            byte r0 = (byte) r6
            r2[r5] = r0
        L_0x00aa:
            r0 = r9[r5]
            byte r1 = r0[r4]
            r0 = -1
            if (r1 != r0) goto L_0x00b6
            r1 = r9[r5]
            byte r0 = (byte) r6
            r1[r4] = r0
        L_0x00b6:
            int r5 = r5 + 1
            goto L_0x0097
        L_0x00b9:
            X.DS4 r10 = new X.DS4
            r10.<init>()
            if (r22 < 0) goto L_0x0250
            int r0 = r21.intValue()
            if (r0 == 0) goto L_0x00ed
            r0 = 0
        L_0x00c7:
            int r2 = r0 << 3
            r2 = r2 | r22
            r0 = 5
            r10.A01(r2, r0)
            r4 = 1335(0x537, float:1.871E-42)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)
            int r1 = 32 - r0
            int r0 = r1 + -1
            int r2 = r2 << r0
        L_0x00da:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r0 = 32 - r0
            if (r0 < r1) goto L_0x00ef
            int r0 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r0 = 32 - r0
            int r0 = r0 - r1
            int r0 = r4 << r0
            r2 = r2 ^ r0
            goto L_0x00da
        L_0x00ed:
            r0 = 1
            goto L_0x00c7
        L_0x00ef:
            r0 = 10
            r10.A01(r2, r0)
            X.DS4 r11 = new X.DS4
            r11.<init>()
            r0 = 21522(0x5412, float:3.0159E-41)
            r6 = 15
            r11.A01(r0, r6)
            int r5 = r10.A00
            int r0 = r11.A00
            if (r5 != r0) goto L_0x0249
            r4 = 0
        L_0x0107:
            int[] r2 = r10.A01
            int r0 = r2.length
            if (r4 >= r0) goto L_0x0118
            r1 = r2[r4]
            int[] r0 = r11.A01
            r0 = r0[r4]
            r1 = r1 ^ r0
            r2[r4] = r1
            int r4 = r4 + 1
            goto L_0x0107
        L_0x0118:
            if (r5 != r6) goto L_0x0239
            r12 = 0
            r6 = 0
        L_0x011c:
            r11 = 1
            r0 = 14
            int r0 = r0 - r6
            boolean r2 = r10.A03(r0)
            int[][] r0 = A03
            r0 = r0[r6]
            r1 = r0[r12]
            r0 = r0[r11]
            r0 = r9[r0]
            byte r4 = (byte) r2
            r0[r1] = r4
            r2 = 8
            if (r6 >= r2) goto L_0x016a
            int r1 = r8 - r6
            int r1 = r1 - r11
            r0 = r9[r2]
            r0[r1] = r4
        L_0x013c:
            int r6 = r6 + 1
            if (r6 < r5) goto L_0x011c
            r0 = 7
            if (r3 < r0) goto L_0x01b0
            X.DS4 r6 = new X.DS4
            r6.<init>()
            r0 = 6
            r6.A01(r3, r0)
            r2 = 7973(0x1f25, float:1.1173E-41)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r1 = 32 - r0
            int r0 = r1 + -1
            int r3 = r3 << r0
        L_0x0157:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r3)
            int r0 = 32 - r0
            if (r0 < r1) goto L_0x0174
            int r0 = java.lang.Integer.numberOfLeadingZeros(r3)
            int r0 = 32 - r0
            int r0 = r0 - r1
            int r0 = r2 << r0
            r3 = r3 ^ r0
            goto L_0x0157
        L_0x016a:
            int r1 = r7 + -7
            int r0 = r6 + -8
            int r1 = r1 + r0
            r0 = r9[r1]
            r0[r2] = r4
            goto L_0x013c
        L_0x0174:
            r0 = 12
            r6.A01(r3, r0)
            int r1 = r6.A00
            r0 = 18
            if (r1 != r0) goto L_0x01a0
            r5 = 17
            r4 = 0
        L_0x0182:
            r3 = 0
        L_0x0183:
            boolean r1 = r6.A03(r5)
            int r5 = r5 + -1
            int r2 = r7 + -11
            int r2 = r2 + r3
            r0 = r9[r2]
            byte r1 = (byte) r1
            r0[r4] = r1
            r0 = r9[r4]
            r0[r2] = r1
            int r3 = r3 + 1
            r0 = 3
            if (r3 < r0) goto L_0x0183
            int r4 = r4 + 1
            r0 = 6
            if (r4 >= r0) goto L_0x01b0
            goto L_0x0182
        L_0x01a0:
            java.lang.String r0 = "should not happen but we got: "
            java.lang.StringBuilder r0 = X.BE6.A0u(r0)
            java.lang.String r1 = X.C17880vN.A0t(r0, r1)
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01b0:
            int r8 = r8 + -1
            int r6 = r7 + -1
            r5 = -1
            r4 = 0
            r3 = -1
        L_0x01b7:
            r10 = r18
            if (r8 <= 0) goto L_0x021c
            r0 = 6
            if (r8 != r0) goto L_0x01bf
            r8 = 5
        L_0x01bf:
            if (r6 < 0) goto L_0x0217
            if (r6 >= r7) goto L_0x0217
            r2 = 0
        L_0x01c4:
            int r12 = r8 - r2
            r0 = r9[r6]
            byte r0 = r0[r12]
            if (r0 != r5) goto L_0x01ef
            int r0 = r10.A00
            if (r4 >= r0) goto L_0x0215
            boolean r11 = r10.A03(r4)
            int r4 = r4 + 1
        L_0x01d6:
            r1 = r12
            r0 = r6
            switch(r22) {
                case 0: goto L_0x0202;
                case 1: goto L_0x0203;
                case 2: goto L_0x01f6;
                case 3: goto L_0x01f9;
                case 4: goto L_0x01fe;
                case 5: goto L_0x0206;
                case 6: goto L_0x020e;
                default: goto L_0x01db;
            }
        L_0x01db:
            int r0 = r6 * r12
            int r1 = r0 % 3
            int r0 = r6 + r12
            r0 = r0 & 1
        L_0x01e3:
            int r1 = r1 + r0
            r1 = r1 & 1
        L_0x01e6:
            if (r1 != 0) goto L_0x01ea
            r11 = r11 ^ 1
        L_0x01ea:
            r1 = r9[r6]
            byte r0 = (byte) r11
            r1[r12] = r0
        L_0x01ef:
            int r2 = r2 + 1
            r0 = 2
            if (r2 < r0) goto L_0x01c4
            int r6 = r6 + r3
            goto L_0x01bf
        L_0x01f6:
            int r1 = r12 % 3
            goto L_0x01e6
        L_0x01f9:
            int r0 = r6 + r12
            int r1 = r0 % 3
            goto L_0x01e6
        L_0x01fe:
            int r0 = r6 / 2
            int r1 = r12 / 3
        L_0x0202:
            int r0 = r0 + r1
        L_0x0203:
            r1 = r0 & 1
            goto L_0x01e6
        L_0x0206:
            int r0 = r6 * r12
            r1 = r0 & 1
            int r0 = r0 % 3
            int r1 = r1 + r0
            goto L_0x01e6
        L_0x020e:
            int r0 = r6 * r12
            r1 = r0 & 1
            int r0 = r0 % 3
            goto L_0x01e3
        L_0x0215:
            r11 = 0
            goto L_0x01d6
        L_0x0217:
            int r3 = -r3
            int r6 = r6 + r3
            int r8 = r8 + -2
            goto L_0x01b7
        L_0x021c:
            int r2 = r10.A00
            if (r4 != r2) goto L_0x0221
            return
        L_0x0221:
            java.lang.String r0 = "Not all bits consumed: "
            java.lang.StringBuilder r1 = X.BE6.A0u(r0)
            r1.append(r4)
            r0 = 47
            r1.append(r0)
            java.lang.String r1 = X.C17880vN.A0t(r1, r2)
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0239:
            java.lang.String r0 = "should not happen but we got: "
            java.lang.StringBuilder r0 = X.BE6.A0u(r0)
            java.lang.String r1 = X.C17880vN.A0t(r0, r5)
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0249:
            java.lang.String r0 = "Sizes don't match"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0250:
            java.lang.String r1 = "Invalid mask pattern"
            X.C2V r0 = new X.C2V
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0258:
            X.C2V r0 = new X.C2V
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26179Ctz.A00(X.DS4, X.Cwp, X.CWH, java.lang.Integer, int):void");
    }

    public static void A01(CWH cwh, int i, int i2) {
        int i3 = 0;
        do {
            byte[] bArr = cwh.A02[i2];
            if (bArr[i + i3] == -1) {
                bArr[i + i3] = 0;
                i3++;
            } else {
                throw new C2V();
            }
        } while (i3 < 8);
    }

    public static void A02(CWH cwh, int i, int i2) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = A02[i3];
            int i4 = 0;
            do {
                i4 = BE6.A0A(iArr[i4], cwh.A02[i2 + i3], i + i4, i4);
            } while (i4 < 7);
        }
    }

    public static void A03(CWH cwh, int i, int i2) {
        int i3 = 0;
        do {
            byte[][] bArr = cwh.A02;
            if (bArr[i2 + i3][i] == -1) {
                bArr[i2 + i3][i] = 0;
                i3++;
            } else {
                throw new C2V();
            }
        } while (i3 < 7);
    }
}
