package X;

public final class CXP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ DOZ A03;
    public final /* synthetic */ DFL A04;
    public final /* synthetic */ DFL A05;
    public final /* synthetic */ DFL A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public CXP(DOZ doz, DFL dfl, DFL dfl2, DFL dfl3, int i, int i2, int i3, boolean z, boolean z2) {
        this.A07 = z;
        this.A03 = doz;
        this.A06 = dfl;
        this.A02 = i;
        this.A08 = z2;
        this.A05 = dfl2;
        this.A04 = dfl3;
        this.A01 = i2;
        this.A00 = i3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.text.Layout r38, android.text.Spannable r39, X.C24949CQz r40, int r41, int r42) {
        /*
            r37 = this;
            r0 = 1
            r5 = r39
            X.C18070vi.A0d(r5, r0)
            r1 = r37
            boolean r0 = r1.A07
            r6 = r40
            if (r0 == 0) goto L_0x0061
            X.DOZ r3 = r1.A03
            X.DFL r1 = r1.A06
            int r4 = r6.A01
            int r6 = r6.A00
            java.lang.String r11 = X.BE7.A0i(r1)
            java.lang.String r12 = X.BE7.A0g(r1)
            r0 = 38
            X.DFL r9 = r1.A09(r0)
            java.lang.String r13 = X.BE7.A0e(r1)
            r7 = 41
            X.DFL r10 = r1.A09(r7)
            r0 = 43
            java.util.List r0 = X.BE7.A0s(r1, r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x0038:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x005e
            X.DFL r2 = X.BE6.A0d(r8)
            int r1 = r2.A05
            r0 = 16870(0x41e6, float:2.364E-41)
            if (r1 != r0) goto L_0x0038
            java.lang.String r1 = r2.A0D(r7)
            java.lang.String r0 = X.BE7.A0d(r2)
            if (r1 == 0) goto L_0x0038
            if (r0 == 0) goto L_0x0038
            r16 = 1
        L_0x0056:
            r7 = r5
            r8 = r3
            r14 = r4
            r15 = r6
            X.C26276CwV.A08(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x005d:
            return
        L_0x005e:
            r16 = 0
            goto L_0x0056
        L_0x0061:
            int r4 = r1.A02
            r0 = 16870(0x41e6, float:2.364E-41)
            if (r4 == r0) goto L_0x034e
            r0 = 16871(0x41e7, float:2.3641E-41)
            if (r4 == r0) goto L_0x034e
            r0 = 16917(0x4215, float:2.3706E-41)
            if (r4 == r0) goto L_0x034e
            r0 = 16958(0x423e, float:2.3763E-41)
            if (r4 == r0) goto L_0x034e
            switch(r4) {
                case 16873: goto L_0x034e;
                case 16874: goto L_0x034e;
                case 16875: goto L_0x034e;
                case 16876: goto L_0x034e;
                default: goto L_0x0076;
            }
        L_0x0076:
            r0 = 0
        L_0x0077:
            r11 = 0
            if (r0 != 0) goto L_0x0088
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x0332
            java.lang.String r2 = "Span style is not supported"
            X.DOZ r1 = r1.A03
            java.lang.String r0 = "TextNodeUtils:Span:unsupported-style"
        L_0x0084:
            X.C25913CoX.A00(r1, r0, r2, r11)
            return
        L_0x0088:
            X.DOZ r15 = r1.A03
            X.DFL r8 = r1.A05
            X.DFL r7 = r1.A06
            X.DFL r0 = r1.A04
            int r2 = r6.A01
            int r3 = r6.A00
            r6 = 16870(0x41e6, float:2.364E-41)
            if (r4 == r6) goto L_0x01ea
            r6 = 16871(0x41e7, float:2.3641E-41)
            if (r4 == r6) goto L_0x01bb
            r6 = 16917(0x4215, float:2.3706E-41)
            if (r4 == r6) goto L_0x021f
            r6 = 16958(0x423e, float:2.3763E-41)
            if (r4 == r6) goto L_0x00f5
            switch(r4) {
                case 16873: goto L_0x0305;
                case 16874: goto L_0x00dc;
                case 16875: goto L_0x00ac;
                case 16876: goto L_0x00c3;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            java.lang.IllegalArgumentException r0 = X.BEB.A0S(r4)
            throw r0
        L_0x00ac:
            X.DFL r0 = X.BE7.A0O(r0)
            if (r0 == 0) goto L_0x0332
            int r7 = X.C25340Cdz.A00(r15, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            if (r0 == 0) goto L_0x0332
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            r6.<init>(r7)
            goto L_0x025c
        L_0x00c3:
            r7 = 0
            r6 = 35
            boolean r0 = r0.A0I(r6, r7)
            if (r0 == 0) goto L_0x00d6
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
        L_0x00d1:
            r5.setSpan(r0, r2, r3, r7)
            goto L_0x0332
        L_0x00d6:
            X.BGO r0 = new X.BGO
            r0.<init>()
            goto L_0x00d1
        L_0x00dc:
            r7 = 0
            r6 = 35
            boolean r0 = r0.A0I(r6, r7)
            if (r0 == 0) goto L_0x00ef
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
        L_0x00ea:
            r5.setSpan(r0, r2, r3, r7)
            goto L_0x0332
        L_0x00ef:
            X.BGN r0 = new X.BGN
            r0.<init>()
            goto L_0x00ea
        L_0x00f5:
            r6 = 0
            java.lang.String r8 = X.BE7.A0d(r0)
            java.lang.String r7 = "none"
            if (r8 != 0) goto L_0x00ff
            r8 = r7
        L_0x00ff:
            r9 = 36
            X.DFL r12 = r0.A09(r9)
            java.lang.String r13 = X.BE7.A0h(r0)
            boolean r10 = r8.equals(r7)
            r9 = 0
            java.lang.String r24 = "center"
            java.lang.String r14 = "0px"
            if (r10 != 0) goto L_0x01b9
            if (r12 == 0) goto L_0x01b9
            if (r13 == 0) goto L_0x01b9
            int r23 = X.C25340Cdz.A01(r15, r12, r6)
            float r20 = X.A90.A01(r13)
            java.lang.String r10 = X.BE7.A0g(r0)
            if (r10 != 0) goto L_0x0127
            r10 = r14
        L_0x0127:
            float r21 = X.A90.A01(r10)
            r10 = 43
            java.lang.String r10 = r0.A0D(r10)
            if (r10 != 0) goto L_0x0134
            r10 = r14
        L_0x0134:
            float r22 = X.A90.A01(r10)
            java.lang.String r18 = X.BE7.A0f(r0)
            if (r18 != 0) goto L_0x0140
            r18 = r24
        L_0x0140:
            java.lang.String r19 = X.BE7.A0i(r0)
            if (r19 != 0) goto L_0x0148
            r19 = r24
        L_0x0148:
            X.CT9 r10 = new X.CT9
            r16 = r10
            r17 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
        L_0x0151:
            r8 = 44
            java.lang.String r8 = r0.A0D(r8)
            if (r8 != 0) goto L_0x015a
            r8 = r7
        L_0x015a:
            r12 = 45
            X.DFL r12 = r0.A09(r12)
            r13 = 49
            java.lang.String r13 = r0.A0D(r13)
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x01af
            if (r12 == 0) goto L_0x01af
            if (r13 == 0) goto L_0x01af
            int r28 = X.C25340Cdz.A01(r15, r12, r6)
            float r25 = X.A90.A01(r13)
            r7 = 48
            java.lang.String r7 = r0.A0D(r7)
            if (r7 != 0) goto L_0x0181
            r7 = r14
        L_0x0181:
            float r26 = X.A90.A01(r7)
            r7 = 51
            java.lang.String r7 = r0.A0D(r7)
            if (r7 == 0) goto L_0x018e
            r14 = r7
        L_0x018e:
            float r27 = X.A90.A01(r14)
            r7 = 46
            java.lang.String r23 = r0.A0D(r7)
            if (r23 != 0) goto L_0x019c
            r23 = r24
        L_0x019c:
            r7 = 50
            java.lang.String r0 = r0.A0D(r7)
            if (r0 == 0) goto L_0x01a6
            r24 = r0
        L_0x01a6:
            X.CT9 r9 = new X.CT9
            r21 = r9
            r22 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
        L_0x01af:
            X.DFx r0 = new X.DFx
            r0.<init>(r10, r9)
            r5.setSpan(r0, r2, r3, r6)
            goto L_0x0332
        L_0x01b9:
            r10 = r11
            goto L_0x0151
        L_0x01bb:
            r6 = 40
            r7 = 0
            float r10 = r0.A03(r6, r7)
            r6 = 36
            float r9 = r0.A03(r6, r7)
            r6 = 38
            float r8 = r0.A03(r6, r7)
            X.DFL r6 = X.BE7.A0O(r0)
            r7 = 0
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0332
            if (r6 == 0) goto L_0x01e8
            int r6 = X.C25340Cdz.A01(r15, r6, r7)
        L_0x01de:
            X.BGS r0 = new X.BGS
            r0.<init>(r10, r9, r8, r6)
            r5.setSpan(r0, r2, r3, r7)
            goto L_0x0332
        L_0x01e8:
            r6 = 0
            goto L_0x01de
        L_0x01ea:
            java.lang.String r6 = X.BE7.A0h(r0)
            X.C26276CwV.A06(r5, r15, r6, r2, r3)
            java.lang.String r8 = X.BE7.A0i(r0)
            java.lang.String r7 = X.BE7.A0d(r0)
            r6 = r15
            r9 = r2
            r10 = r3
            X.C26276CwV.A07(r5, r6, r7, r8, r9, r10)
            r8 = 1
            r6 = 44
            float r7 = r0.A03(r6, r8)
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0332
            X.CqB r0 = X.C25995CqB.A00()
            android.content.Context r0 = r0.A00
            X.C18070vi.A0X(r0)
            android.util.DisplayMetrics r0 = X.C108965cb.A08(r0)
            float r0 = r0.scaledDensity
            X.BGh r6 = new X.BGh
            r6.<init>(r7, r0)
            goto L_0x025c
        L_0x021f:
            r7 = 0
            r6 = 36
            float r6 = r0.A03(r6, r7)
            java.lang.String r9 = X.BE7.A0g(r0)
            java.lang.String r8 = "AllTextShown"
            if (r9 != 0) goto L_0x022f
            r9 = r8
        L_0x022f:
            int r7 = r9.hashCode()
            r0 = -726803703(0xffffffffd4addb09, float:-5.9736331E12)
            if (r7 == r0) goto L_0x02c6
            r0 = 2702122(0x293b2a, float:3.78648E-39)
            if (r7 == r0) goto L_0x0262
            r0 = 209568611(0xc7dc363, float:1.9549208E-31)
            if (r7 != r0) goto L_0x0332
            boolean r0 = r9.equals(r8)
            if (r0 == 0) goto L_0x0332
            r0 = 0
            float r6 = java.lang.Math.max(r6, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = java.lang.Math.min(r6, r0)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r6
            int r0 = (int) r0
            X.BGP r6 = new X.BGP
            r6.<init>(r0)
        L_0x025c:
            r0 = 0
            r5.setSpan(r6, r2, r3, r0)
            goto L_0x0332
        L_0x0262:
            java.lang.String r0 = "Word"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0332
            r0 = 0
            float r0 = java.lang.Math.max(r6, r0)
            r12 = 1065353216(0x3f800000, float:1.0)
            float r14 = java.lang.Math.min(r0, r12)
            java.lang.CharSequence r6 = r5.subSequence(r2, r3)
            java.lang.String r3 = "\\s+"
            X.1wr r0 = new X.1wr
            r0.<init>((java.lang.String) r3)
            r13 = 0
            java.util.List r10 = r0.A01(r6, r13)
            int r0 = r10.size()
            float r0 = (float) r0
            float r12 = r12 / r0
            int r9 = r10.size()
            r8 = 0
            r3 = 0
        L_0x0291:
            if (r8 >= r9) goto L_0x0332
            java.lang.String r0 = X.C17880vN.A0w(r10, r8)
            int r7 = r0.length()
            int r6 = r3 + 1
            if (r3 != 0) goto L_0x02a0
            r6 = r2
        L_0x02a0:
            int r7 = r7 + r6
            int r0 = r8 + 1
            float r3 = (float) r0
            float r3 = r3 * r12
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x02b8
            r3 = 1132396544(0x437f0000, float:255.0)
        L_0x02ab:
            int r3 = (int) r3
            X.BGP r0 = new X.BGP
            r0.<init>(r3)
            r5.setSpan(r0, r6, r7, r13)
            int r8 = r8 + 1
            r3 = r7
            goto L_0x0291
        L_0x02b8:
            float r3 = r3 - r12
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x02c4
            float r3 = r14 % r12
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r0
            float r3 = r3 / r12
            goto L_0x02ab
        L_0x02c4:
            r3 = 0
            goto L_0x02ab
        L_0x02c6:
            java.lang.String r0 = "Character"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0332
            r0 = 0
            float r0 = java.lang.Math.max(r6, r0)
            r8 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Math.min(r0, r8)
            int r0 = r3 - r2
            float r0 = (float) r0
            float r8 = r8 / r0
        L_0x02dd:
            if (r2 >= r3) goto L_0x0332
            int r0 = r2 + 1
            float r6 = (float) r0
            float r6 = r6 * r8
            r7 = 0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x02f7
            r6 = 1132396544(0x437f0000, float:255.0)
        L_0x02ea:
            int r0 = (int) r6
            X.BGP r6 = new X.BGP
            r6.<init>(r0)
            int r0 = r2 + 1
            r5.setSpan(r6, r2, r0, r7)
            r2 = r0
            goto L_0x02dd
        L_0x02f7:
            float r6 = r6 - r8
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0303
            float r6 = r9 % r8
            r0 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 * r0
            float r6 = r6 / r8
            goto L_0x02ea
        L_0x0303:
            r6 = 0
            goto L_0x02ea
        L_0x0305:
            int r10 = r7.A05
            r6 = 16880(0x41f0, float:2.3654E-41)
            r9 = 35
            if (r10 == r6) goto L_0x0349
            r6 = 16887(0x41f7, float:2.3664E-41)
            if (r10 == r6) goto L_0x0349
            r6 = 16898(0x4202, float:2.3679E-41)
            if (r10 == r6) goto L_0x0342
            r19 = 0
        L_0x0317:
            java.lang.String r20 = r0.A0D(r9)
            r6 = 36
            X.E8A r18 = r0.A0A(r6)
            r0 = 0
            if (r18 == 0) goto L_0x0332
            X.BVG r14 = new X.BVG
            r16 = r8
            r17 = r7
            r21 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r5.setSpan(r14, r2, r3, r0)
        L_0x0332:
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x005d
            r2 = r38
            if (r38 != 0) goto L_0x0351
            java.lang.String r2 = "Trying to apply layoutAffectingStyle with null layout!"
            X.DOZ r1 = r1.A03
            java.lang.String r0 = "TextNodeUtils:Span:null-layout"
            goto L_0x0084
        L_0x0342:
            r6 = 44
            java.lang.String r19 = r7.A0D(r6)
            goto L_0x0317
        L_0x0349:
            java.lang.String r19 = r7.A0D(r9)
            goto L_0x0317
        L_0x034e:
            r0 = 1
            goto L_0x0077
        L_0x0351:
            X.DOZ r10 = r1.A03
            X.DFL r9 = r1.A05
            X.DFL r8 = r1.A04
            int r0 = r1.A01
            int r1 = r1.A00
            r3 = 16891(0x41fb, float:2.367E-41)
            if (r4 == r3) goto L_0x03cc
            r3 = 16917(0x4215, float:2.3706E-41)
            if (r4 != r3) goto L_0x056f
            r4 = 0
            r3 = 36
            float r6 = r8.A03(r3, r4)
            java.lang.String r4 = X.BE7.A0g(r8)
            java.lang.String r3 = "Line"
            boolean r3 = X.C18070vi.A18(r4, r3)
            if (r3 == 0) goto L_0x005d
            r3 = 0
            float r3 = java.lang.Math.max(r6, r3)
            r12 = 1065353216(0x3f800000, float:1.0)
            float r14 = java.lang.Math.min(r3, r12)
            int r11 = r2.getLineForOffset(r0)
            int r10 = r2.getLineForOffset(r1)
            int r3 = r10 - r11
            int r3 = r3 + 1
            float r3 = (float) r3
            float r12 = r12 / r3
            if (r11 > r10) goto L_0x005d
            r9 = r11
        L_0x0392:
            int r8 = r2.getLineStart(r9)
            int r7 = r2.getLineEnd(r9)
            if (r9 != r11) goto L_0x03a0
            int r8 = java.lang.Math.max(r8, r0)
        L_0x03a0:
            if (r9 != r10) goto L_0x03a6
            int r7 = java.lang.Math.min(r7, r1)
        L_0x03a6:
            int r3 = r9 + 1
            float r13 = (float) r3
            float r13 = r13 * r12
            r4 = 255(0xff, float:3.57E-43)
            r6 = 0
            int r3 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x03bd
            float r13 = r13 - r12
            int r3 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r3 < 0) goto L_0x03ca
            float r4 = r14 % r12
            r3 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r3
            float r4 = r4 / r12
            int r4 = (int) r4
        L_0x03bd:
            X.BGP r3 = new X.BGP
            r3.<init>(r4)
            r5.setSpan(r3, r8, r7, r6)
            if (r9 == r10) goto L_0x005d
            int r9 = r9 + 1
            goto L_0x0392
        L_0x03ca:
            r4 = 0
            goto L_0x03bd
        L_0x03cc:
            r4 = 1
            java.lang.String r3 = X.BE7.A0e(r8)
            if (r3 != 0) goto L_0x03d5
            java.lang.String r3 = "1.sp"
        L_0x03d5:
            java.lang.String r6 = X.BE7.A0d(r8)
            if (r6 != 0) goto L_0x03dd
            java.lang.String r6 = "100.sp"
        L_0x03dd:
            int r4 = X.C26072Crm.A01(r10, r3, r4)
            r3 = 100
            int r3 = X.C26072Crm.A01(r10, r6, r3)
            if (r4 <= r3) goto L_0x03f1
            java.lang.String r6 = "ResizeToFitSpanStyle"
            java.lang.String r3 = "Min text size cannot be larger than max text size."
            X.C25913CoX.A01(r6, r3)
            r3 = r4
        L_0x03f1:
            android.text.TextPaint r7 = r2.getPaint()
            android.text.TextPaint r17 = new android.text.TextPaint
            r6 = r17
            r6.<init>(r7)
            r7 = 40
            r6 = 0
            int r22 = r9.A04(r7, r6)
            java.lang.String r7 = r8.A0D(r7)
            if (r7 != 0) goto L_0x040b
            java.lang.String r7 = "uniform"
        L_0x040b:
            android.text.SpannableString r14 = new android.text.SpannableString
            r14.<init>(r5)
            java.lang.String r6 = "scaled"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0484
            android.graphics.RectF r16 = X.AnonymousClass3MW.A08()
            int r7 = android.view.View.MeasureSpec.getMode(r41)
            int r6 = android.view.View.MeasureSpec.getMode(r42)
            r12 = 1
            boolean r34 = X.AnonymousClass000.A1P(r7)
            boolean r35 = X.AnonymousClass000.A1P(r6)
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r34 == 0) goto L_0x047f
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x0435:
            if (r35 != 0) goto L_0x043b
            int r8 = android.view.View.MeasureSpec.getSize(r42)
        L_0x043b:
            float r7 = (float) r6
            r6 = r16
            X.BE7.A13(r6, r7, r8)
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r6 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object[] r11 = r14.getSpans(r0, r1, r6)
            android.text.style.AbsoluteSizeSpan[] r11 = (android.text.style.AbsoluteSizeSpan[]) r11
            X.C18070vi.A0b(r11)
            int r6 = r11.length
            r18 = r6
            r15 = 2147483647(0x7fffffff, float:NaN)
            r9 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x0458:
            r6 = r18
            if (r9 >= r6) goto L_0x04bd
            r13 = r11[r9]
            int r6 = r13.getSize()
            boolean r13 = r13.getDip()
            if (r13 == 0) goto L_0x0474
            float r13 = (float) r6
            android.content.Context r6 = r10.A00
            android.util.DisplayMetrics r6 = X.C108965cb.A08(r6)
            float r6 = android.util.TypedValue.applyDimension(r12, r13, r6)
            int r6 = (int) r6
        L_0x0474:
            int r8 = java.lang.Math.max(r8, r6)
            int r7 = java.lang.Math.min(r7, r6)
            int r9 = r9 + 1
            goto L_0x0458
        L_0x047f:
            int r6 = android.view.View.MeasureSpec.getSize(r41)
            goto L_0x0435
        L_0x0484:
            if (r3 == r4) goto L_0x04b7
            android.graphics.RectF r7 = X.AnonymousClass3MW.A08()
            int r8 = android.view.View.MeasureSpec.getMode(r41)
            int r6 = android.view.View.MeasureSpec.getMode(r42)
            r9 = 1
            boolean r25 = X.AnonymousClass000.A1P(r8)
            boolean r26 = X.AnonymousClass000.A1P(r6)
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r25 == 0) goto L_0x0569
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x04a3:
            if (r26 != 0) goto L_0x04a9
            int r8 = android.view.View.MeasureSpec.getSize(r42)
        L_0x04a9:
            float r6 = (float) r6
            X.BE7.A13(r7, r6, r8)
            if (r22 <= 0) goto L_0x04b0
            r9 = 0
        L_0x04b0:
            if (r25 == 0) goto L_0x054e
            if (r26 == 0) goto L_0x054e
            if (r9 == 0) goto L_0x054e
            r4 = r3
        L_0x04b7:
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            r3.<init>(r4)
            goto L_0x04f5
        L_0x04bd:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r6) goto L_0x0534
            if (r7 != r15) goto L_0x0534
        L_0x04c3:
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r7 = java.lang.Float.valueOf(r6)
            float r6 = (float) r8
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            X.7PS r8 = new X.7PS
            r8.<init>(r7, r7, r6)
        L_0x04d4:
            if (r22 <= 0) goto L_0x04d7
            r12 = 0
        L_0x04d7:
            if (r34 == 0) goto L_0x04fa
            if (r35 == 0) goto L_0x04fa
            if (r12 == 0) goto L_0x04fa
            java.lang.Object r7 = r8.second
        L_0x04df:
            float r7 = X.AnonymousClass000.A04(r7)
        L_0x04e3:
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0484
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x005d
            android.text.style.RelativeSizeSpan r3 = new android.text.style.RelativeSizeSpan
            r3.<init>(r7)
        L_0x04f5:
            r2 = 0
            r5.setSpan(r3, r0, r1, r2)
            return
        L_0x04fa:
            java.lang.Object r6 = r8.first
            float r7 = X.AnonymousClass000.A04(r6)
            java.lang.Object r6 = r8.second
            float r6 = X.AnonymousClass000.A04(r6)
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            java.lang.Object r7 = r8.first
            if (r6 >= 0) goto L_0x04df
            float r27 = X.AnonymousClass000.A04(r7)
            java.lang.Object r6 = r8.second
            float r28 = X.AnonymousClass000.A04(r6)
            java.lang.Object r6 = r8.third
            float r29 = X.AnonymousClass000.A04(r6)
            r36 = 1
            r30 = 1036831949(0x3dcccccd, float:0.1)
            r32 = r0
            r33 = r1
            r23 = r16
            r24 = r2
            r25 = r14
            r26 = r17
            r31 = r22
            float r7 = X.C26072Crm.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x04e3
        L_0x0534:
            if (r8 == r7) goto L_0x04c3
            float r9 = (float) r4
            float r6 = (float) r7
            float r9 = r9 / r6
            float r7 = (float) r3
            float r6 = (float) r8
            float r7 = r7 / r6
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            X.7PS r8 = new X.7PS
            r8.<init>(r9, r7, r6)
            goto L_0x04d4
        L_0x054e:
            float r4 = (float) r4
            float r3 = (float) r3
            r21 = 1065353216(0x3f800000, float:1.0)
            r27 = 0
            r20 = r3
            r18 = r4
            r19 = r3
            r23 = r0
            r24 = r1
            r16 = r14
            r15 = r2
            r14 = r7
            float r2 = X.C26072Crm.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r4 = (int) r2
            goto L_0x04b7
        L_0x0569:
            int r6 = android.view.View.MeasureSpec.getSize(r41)
            goto L_0x04a3
        L_0x056f:
            java.lang.IllegalArgumentException r0 = X.BEB.A0S(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CXP.A00(android.text.Layout, android.text.Spannable, X.CQz, int, int):void");
    }
}
