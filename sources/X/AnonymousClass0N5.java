package X;

/* renamed from: X.0N5  reason: invalid class name */
public final class AnonymousClass0N5 {
    public int A00;
    public final float[] A01;
    public final float[] A02;
    public final float[] A03;
    public final C02140Cw[] A04;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r6 >= 3) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A00(float r22) {
        /*
            r21 = this;
            r20 = 0
            r11 = r22
            int r0 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x016a
            r10 = r21
            float[] r13 = r10.A01
            float[] r12 = r10.A02
            int r9 = r10.A00
            X.0Cw[] r8 = r10.A04
            r7 = r8[r9]
            if (r7 == 0) goto L_0x0169
            r6 = 0
            r14 = r7
        L_0x0018:
            r5 = r8[r9]
            r19 = 1
            if (r5 == 0) goto L_0x004d
            long r0 = r7.A01
            long r3 = r5.A01
            long r0 = r0 - r3
            float r2 = (float) r0
            long r0 = r14.A01
            long r3 = r3 - r0
            long r0 = java.lang.Math.abs(r3)
            float r3 = (float) r0
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x004d
            r0 = 1109393408(0x42200000, float:40.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x004d
            float r0 = r5.A00
            r13[r6] = r0
            float r0 = -r2
            r12[r6] = r0
            r0 = 20
            if (r9 != 0) goto L_0x0045
            r9 = 20
        L_0x0045:
            int r9 = r9 - r19
            int r6 = r6 + 1
            if (r6 >= r0) goto L_0x0050
            r14 = r5
            goto L_0x0018
        L_0x004d:
            r0 = 3
            if (r6 < r0) goto L_0x0169
        L_0x0050:
            float[] r2 = r10.A03     // Catch:{ IllegalArgumentException -> 0x0151 }
            X.0uU r0 = X.AnonymousClass0M5.A00     // Catch:{ IllegalArgumentException -> 0x0151 }
            r8 = 3
            float[][] r7 = new float[r8][]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r5 = 0
            r1 = 0
        L_0x0059:
            float[] r0 = new float[r6]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r7[r1] = r0     // Catch:{ IllegalArgumentException -> 0x0151 }
            int r1 = r1 + 1
            if (r1 < r8) goto L_0x0059
            r4 = 0
        L_0x0062:
            r18 = 1065353216(0x3f800000, float:1.0)
            if (r4 >= r6) goto L_0x007f
            r0 = r7[r5]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0[r4] = r18     // Catch:{ IllegalArgumentException -> 0x0151 }
            r3 = 1
        L_0x006b:
            int r0 = r3 + -1
            r0 = r7[r0]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r1 = r0[r4]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0 = r12[r4]     // Catch:{ IllegalArgumentException -> 0x0151 }
            float r1 = r1 * r0
            r0 = r7[r3]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0[r4] = r1     // Catch:{ IllegalArgumentException -> 0x0151 }
            int r3 = r3 + 1
            if (r3 < r8) goto L_0x006b
            int r4 = r4 + 1
            goto L_0x0062
        L_0x007f:
            float[][] r4 = new float[r8][]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r1 = 0
        L_0x0082:
            float[] r0 = new float[r6]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r4[r1] = r0     // Catch:{ IllegalArgumentException -> 0x0151 }
            int r1 = r1 + 1
            if (r1 < r8) goto L_0x0082
            float[][] r3 = new float[r8][]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r1 = 0
        L_0x008d:
            float[] r0 = new float[r8]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r3[r1] = r0     // Catch:{ IllegalArgumentException -> 0x0151 }
            int r1 = r1 + 1
            if (r1 < r8) goto L_0x008d
            r9 = 0
        L_0x0096:
            r5 = r4[r9]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r10 = r7[r9]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r1 = 0
        L_0x009b:
            r0 = r10[r1]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r5[r1] = r0     // Catch:{ IllegalArgumentException -> 0x0151 }
            int r1 = r1 + 1
            if (r1 < r6) goto L_0x009b
            r12 = 0
        L_0x00a4:
            if (r12 >= r9) goto L_0x00c6
            r16 = r4[r12]     // Catch:{ IllegalArgumentException -> 0x0151 }
            int r15 = r5.length     // Catch:{ IllegalArgumentException -> 0x0151 }
            r14 = 0
            r10 = 0
        L_0x00ab:
            if (r10 >= r15) goto L_0x00b6
            r1 = r5[r10]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0 = r16[r10]     // Catch:{ IllegalArgumentException -> 0x0151 }
            float r1 = r1 * r0
            float r14 = r14 + r1
            int r10 = r10 + 1
            goto L_0x00ab
        L_0x00b6:
            r10 = 0
        L_0x00b7:
            r1 = r5[r10]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0 = r16[r10]     // Catch:{ IllegalArgumentException -> 0x0151 }
            float r0 = r0 * r14
            float r1 = r1 - r0
            r5[r10] = r1     // Catch:{ IllegalArgumentException -> 0x0151 }
            int r10 = r10 + 1
            if (r10 < r6) goto L_0x00b7
            int r12 = r12 + 1
            goto L_0x00a4
        L_0x00c6:
            int r14 = r5.length     // Catch:{ IllegalArgumentException -> 0x0151 }
            r12 = 0
            r10 = 0
        L_0x00c9:
            if (r10 >= r14) goto L_0x00d4
            r1 = r5[r10]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0 = r5[r10]     // Catch:{ IllegalArgumentException -> 0x0151 }
            float r1 = r1 * r0
            float r12 = r12 + r1
            int r10 = r10 + 1
            goto L_0x00c9
        L_0x00d4:
            double r0 = (double) r12     // Catch:{ IllegalArgumentException -> 0x0151 }
            double r0 = java.lang.Math.sqrt(r0)     // Catch:{ IllegalArgumentException -> 0x0151 }
            float r10 = (float) r0     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0 = 897988541(0x358637bd, float:1.0E-6)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x014a
            float r1 = r18 / r10
            r0 = 0
        L_0x00e4:
            X.AnonymousClass000.A1J(r5, r1, r0)     // Catch:{ IllegalArgumentException -> 0x0151 }
            int r0 = r0 + 1
            if (r0 < r6) goto L_0x00e4
            r17 = r3[r9]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r15 = 0
        L_0x00ee:
            if (r15 >= r9) goto L_0x00f3
            r16 = 0
            goto L_0x0105
        L_0x00f3:
            r14 = r7[r15]     // Catch:{ IllegalArgumentException -> 0x0151 }
            int r12 = r5.length     // Catch:{ IllegalArgumentException -> 0x0151 }
            r16 = 0
            r10 = 0
        L_0x00f9:
            if (r10 >= r12) goto L_0x0105
            r1 = r5[r10]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0 = r14[r10]     // Catch:{ IllegalArgumentException -> 0x0151 }
            float r1 = r1 * r0
            float r16 = r16 + r1
            int r10 = r10 + 1
            goto L_0x00f9
        L_0x0105:
            r17[r15] = r16     // Catch:{ IllegalArgumentException -> 0x0151 }
            int r15 = r15 + 1
            if (r15 < r8) goto L_0x00ee
            int r9 = r9 + 1
            if (r9 < r8) goto L_0x0096
            r8 = 2
            r7 = 2
        L_0x0111:
            r10 = r4[r8]     // Catch:{ IllegalArgumentException -> 0x0151 }
            int r9 = r10.length     // Catch:{ IllegalArgumentException -> 0x0151 }
            r6 = 0
            r5 = 0
        L_0x0116:
            if (r5 >= r9) goto L_0x0121
            r1 = r10[r5]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0 = r13[r5]     // Catch:{ IllegalArgumentException -> 0x0151 }
            float r1 = r1 * r0
            float r6 = r6 + r1
            int r5 = r5 + 1
            goto L_0x0116
        L_0x0121:
            r2[r8] = r6     // Catch:{ IllegalArgumentException -> 0x0151 }
            r9 = 2
            int r6 = r8 + 1
            if (r6 > r7) goto L_0x0139
        L_0x0128:
            r5 = r2[r8]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0 = r3[r8]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r1 = r0[r9]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0 = r2[r9]     // Catch:{ IllegalArgumentException -> 0x0151 }
            float r1 = r1 * r0
            float r5 = r5 - r1
            r2[r8] = r5     // Catch:{ IllegalArgumentException -> 0x0151 }
            if (r9 == r6) goto L_0x0139
            int r9 = r9 + -1
            goto L_0x0128
        L_0x0139:
            r1 = r2[r8]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0 = r3[r8]     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0 = r0[r8]     // Catch:{ IllegalArgumentException -> 0x0151 }
            float r1 = r1 / r0
            r2[r8] = r1     // Catch:{ IllegalArgumentException -> 0x0151 }
            int r8 = r8 + -1
            r0 = -1
            if (r0 < r8) goto L_0x0111
            r2 = r2[r19]     // Catch:{ IllegalArgumentException -> 0x0151 }
            goto L_0x0152
        L_0x014a:
            java.lang.String r0 = "Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ IllegalArgumentException -> 0x0151 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0151 }
        L_0x0151:
            r2 = 0
        L_0x0152:
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r0
            int r0 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0169
            int r0 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x0162
            int r0 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x0168
            return r11
        L_0x0162:
            float r1 = -r11
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0168
            return r1
        L_0x0168:
            return r2
        L_0x0169:
            return r20
        L_0x016a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "maximumVelocity should be a positive value. You specified="
            r1.append(r0)
            r1.append(r11)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0m(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N5.A00(float):float");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.0Cw[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.0Cw} */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.0Cw, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(float r4, long r5) {
        /*
            r3 = this;
            int r0 = r3.A00
            int r0 = r0 + 1
            int r2 = r0 % 20
            r3.A00 = r2
            X.0Cw[] r1 = r3.A04
            X.0uU r0 = X.AnonymousClass0M5.A00
            r0 = r1[r2]
            if (r0 != 0) goto L_0x001c
            X.0Cw r0 = new X.0Cw
            r0.<init>()
            r0.A01 = r5
            r0.A00 = r4
            r1[r2] = r0
            return
        L_0x001c:
            r0.A01 = r5
            r0.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N5.A01(float, long):void");
    }

    public AnonymousClass0N5(Integer num, boolean z) {
        this.A04 = new C02140Cw[20];
        this.A01 = new float[20];
        this.A02 = new float[20];
        this.A03 = new float[3];
    }

    public AnonymousClass0N5() {
        this(AnonymousClass00R.A00, false);
    }
}
