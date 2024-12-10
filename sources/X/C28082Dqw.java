package X;

/* renamed from: X.Dqw  reason: case insensitive filesystem */
public final class C28082Dqw extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ float[] $array;
    public final /* synthetic */ C98474rD $currentArrayStart;
    public final /* synthetic */ C27061DRh $currentHeight;
    public final /* synthetic */ long $range;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28082Dqw(C27061DRh dRh, C98474rD r3, float[] fArr, long j) {
        super(1);
        this.$range = j;
        this.$array = fArr;
        this.$currentArrayStart = r3;
        this.$currentHeight = dRh;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b6, code lost:
        if (r15 == r0) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fb, code lost:
        if (r15 == r0) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0134, code lost:
        if (r15 == r0) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016a, code lost:
        if (r15 == r0) goto L_0x016c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r29) {
        /*
            r28 = this;
            r9 = r29
            X.CbO r9 = (X.C25227CbO) r9
            r2 = r28
            long r0 = r2.$range
            float[] r7 = r2.$array
            X.4rD r6 = r2.$currentArrayStart
            X.DRh r5 = r2.$currentHeight
            int r8 = r9.A05
            r4 = r8
            int r2 = X.C26260Cw5.A02(r0)
            if (r8 > r2) goto L_0x0018
            r8 = r2
        L_0x0018:
            int r3 = r9.A04
            r2 = r3
            int r0 = X.C26260Cw5.A01(r0)
            if (r3 < r0) goto L_0x0022
            r3 = r0
        L_0x0022:
            int r1 = X.BE6.A07(r8, r4, r2)
            int r0 = X.BE6.A07(r3, r4, r2)
            long r26 = X.C25858CnM.A02(r1, r0)
            X.EA0 r0 = r9.A06
            r25 = r0
            int r14 = r6.element
            r0 = r25
            X.D5i r0 = (X.C26594D5i) r0
            X.Cr7 r13 = r0.A01
            int r12 = X.C26260Cw5.A02(r26)
            int r11 = X.C26260Cw5.A01(r26)
            android.text.Layout r10 = r13.A08
            java.lang.CharSequence r0 = r10.getText()
            int r0 = r0.length()
            if (r12 < 0) goto L_0x01d2
            if (r12 >= r0) goto L_0x01cb
            if (r11 <= r12) goto L_0x01c4
            if (r11 > r0) goto L_0x01bd
            int r0 = r11 - r12
            int r1 = r0 * 4
            int r0 = r7.length
            int r0 = r0 - r14
            if (r0 < r1) goto L_0x01b6
            int r9 = r10.getLineForOffset(r12)
            int r0 = r11 + -1
            int r8 = r10.getLineForOffset(r0)
            r24 = 0
            r4 = -1
            if (r9 > r8) goto L_0x0189
        L_0x006b:
            int r1 = r10.getLineStart(r9)
            int r0 = r13.A06(r9)
            int r3 = java.lang.Math.max(r12, r1)
            int r23 = java.lang.Math.min(r11, r0)
            float r22 = r13.A03(r9)
            float r21 = r13.A02(r9)
            int r0 = r10.getParagraphDirection(r9)
            boolean r20 = X.C17890vO.A1R(r0)
            r19 = r20 ^ 1
        L_0x008d:
            r0 = r23
            if (r3 >= r0) goto L_0x0183
            boolean r2 = r10.isRtlCharAt(r3)
            if (r20 == 0) goto L_0x0113
            r1 = 0
            int r0 = r3 * 4
            if (r2 != 0) goto L_0x00e2
            int r0 = r0 + 1
            if (r4 != r0) goto L_0x00dd
            r18 = r24
        L_0x00a2:
            int r15 = r3 + 1
            r2 = 1
            r16 = 1
            int r0 = X.C24501C6v.A00(r10, r15)
            int r1 = r10.getLineStart(r0)
            int r0 = r13.A06(r0)
            if (r15 == r1) goto L_0x00b8
            r1 = 0
            if (r15 != r0) goto L_0x00b9
        L_0x00b8:
            r1 = 1
        L_0x00b9:
            int r0 = r15 * 4
            if (r1 == 0) goto L_0x00bf
            r16 = 0
        L_0x00bf:
            int r0 = r0 + r16
            if (r4 == r0) goto L_0x00c8
            float r24 = r13.A04(r15, r2)
            r4 = r0
        L_0x00c8:
            r17 = r24
        L_0x00ca:
            r7[r14] = r18
            int r0 = r14 + 1
            r7[r0] = r22
            int r0 = r14 + 2
            r7[r0] = r17
            int r0 = r14 + 3
            r7[r0] = r21
            int r14 = r14 + 4
            int r3 = r3 + 1
            goto L_0x008d
        L_0x00dd:
            float r18 = r13.A04(r3, r1)
            goto L_0x00a2
        L_0x00e2:
            int r0 = r0 + 3
            if (r4 != r0) goto L_0x010e
            r17 = r24
        L_0x00e8:
            int r15 = r3 + 1
            r2 = 1
            int r0 = X.C24501C6v.A00(r10, r15)
            int r1 = r10.getLineStart(r0)
            int r0 = r13.A06(r0)
            if (r15 == r1) goto L_0x00fd
            r16 = 0
            if (r15 != r0) goto L_0x00ff
        L_0x00fd:
            r16 = 1
        L_0x00ff:
            int r1 = r15 * 4
            r0 = 3
            if (r16 == 0) goto L_0x0105
            r0 = 2
        L_0x0105:
            int r1 = r1 + r0
            if (r4 == r1) goto L_0x0146
            float r24 = r13.A05(r15, r2)
            r4 = r1
            goto L_0x0146
        L_0x010e:
            float r17 = r13.A05(r3, r1)
            goto L_0x00e8
        L_0x0113:
            if (r19 == 0) goto L_0x014e
            if (r2 == 0) goto L_0x014e
            r1 = 0
            int r0 = r3 * 4
            int r0 = r0 + 1
            if (r4 != r0) goto L_0x0149
            r17 = r24
        L_0x0120:
            int r15 = r3 + 1
            r2 = 1
            r16 = 1
            int r0 = X.C24501C6v.A00(r10, r15)
            int r1 = r10.getLineStart(r0)
            int r0 = r13.A06(r0)
            if (r15 == r1) goto L_0x0136
            r1 = 0
            if (r15 != r0) goto L_0x0137
        L_0x0136:
            r1 = 1
        L_0x0137:
            int r0 = r15 * 4
            if (r1 == 0) goto L_0x013d
            r16 = 0
        L_0x013d:
            int r0 = r0 + r16
            if (r4 == r0) goto L_0x0146
            float r24 = r13.A04(r15, r2)
            r4 = r0
        L_0x0146:
            r18 = r24
            goto L_0x00ca
        L_0x0149:
            float r17 = r13.A04(r3, r1)
            goto L_0x0120
        L_0x014e:
            r1 = 0
            int r0 = r3 * 4
            int r0 = r0 + 3
            if (r4 != r0) goto L_0x017e
            r18 = r24
        L_0x0157:
            int r15 = r3 + 1
            r2 = 1
            int r0 = X.C24501C6v.A00(r10, r15)
            int r1 = r10.getLineStart(r0)
            int r0 = r13.A06(r0)
            if (r15 == r1) goto L_0x016c
            r16 = 0
            if (r15 != r0) goto L_0x016e
        L_0x016c:
            r16 = 1
        L_0x016e:
            int r1 = r15 * 4
            r0 = 3
            if (r16 == 0) goto L_0x0174
            r0 = 2
        L_0x0174:
            int r1 = r1 + r0
            if (r4 == r1) goto L_0x00c8
            float r24 = r13.A05(r15, r2)
            r4 = r1
            goto L_0x00c8
        L_0x017e:
            float r18 = r13.A05(r3, r1)
            goto L_0x0157
        L_0x0183:
            if (r9 == r8) goto L_0x0189
            int r9 = r9 + 1
            goto L_0x006b
        L_0x0189:
            int r4 = r6.element
            int r0 = X.C26260Cw5.A00(r26)
            int r0 = r0 * 4
            int r3 = r4 + r0
        L_0x0193:
            if (r4 >= r3) goto L_0x01a8
            int r1 = r4 + 1
            r0 = r7[r1]
            float r2 = r5.element
            float r0 = r0 + r2
            r7[r1] = r0
            int r1 = r4 + 3
            r0 = r7[r1]
            float r0 = r0 + r2
            r7[r1] = r0
            int r4 = r4 + 4
            goto L_0x0193
        L_0x01a8:
            r6.element = r3
            float r1 = r5.element
            float r0 = r25.BSR()
            float r1 = r1 + r0
            r5.element = r1
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x01b6:
            java.lang.String r0 = "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x01bd:
            java.lang.String r0 = "endOffset must be smaller or equal to text length"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x01c4:
            java.lang.String r0 = "endOffset must be greater than startOffset"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x01cb:
            java.lang.String r0 = "startOffset must be less than text length"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x01d2:
            java.lang.String r0 = "startOffset must be > 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28082Dqw.invoke(java.lang.Object):java.lang.Object");
    }
}
