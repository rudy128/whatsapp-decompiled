package X;

public class BNJ extends C24471C5l {
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02b1, code lost:
        if (r5.equals("reverse") == false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02d3, code lost:
        if (r2.equals("radial") == false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02f7, code lost:
        if (r0 == false) goto L_0x0291;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable A00(X.DOZ r17, X.DFL r18, X.DFL r19) {
        /*
            r16 = this;
            r1 = r18
            int r3 = r1.A05
            r0 = 13761(0x35c1, float:1.9283E-41)
            r2 = r17
            if (r3 == r0) goto L_0x01b6
            r0 = 15775(0x3d9f, float:2.2105E-41)
            if (r3 == r0) goto L_0x0117
            r0 = 16526(0x408e, float:2.3158E-41)
            if (r3 == r0) goto L_0x001b
            r0 = r16
            r3 = r19
            android.graphics.drawable.Drawable r9 = super.A00(r2, r1, r3)
            return r9
        L_0x001b:
            java.lang.String r5 = "CDSShadowDrawableV2Utils"
            android.content.Context r7 = r2.A00
            java.lang.String r9 = "rectangle"
            r10 = r9
            r0 = 43
            java.lang.String r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x002b
            r9 = r0
        L_0x002b:
            java.lang.Integer[] r8 = X.CEF.A00
            int r6 = r8.length
            r4 = 0
        L_0x002f:
            if (r4 >= r6) goto L_0x0048
            r3 = r8[r4]
            int r0 = r3.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0045
            r0 = r10
        L_0x003c:
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0057
            int r4 = r4 + 1
            goto L_0x002f
        L_0x0045:
            java.lang.String r0 = "circle"
            goto L_0x003c
        L_0x0048:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error finding Shape enum value for: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r9, r3)
            X.C25913CoX.A01(r5, r0)
            java.lang.Integer r3 = X.AnonymousClass00R.A00
        L_0x0057:
            java.lang.String r9 = X.BE7.A0i(r1)
            r6 = 1098907648(0x41800000, float:16.0)
            r15 = 0
            float r0 = X.C24515C7j.A00(r7, r6)     // Catch:{ 9HX -> 0x006d }
            if (r9 == 0) goto L_0x0068
            float r0 = X.A90.A01(r9)     // Catch:{ 9HX -> 0x006d }
        L_0x0068:
            float r11 = java.lang.Math.max(r15, r0)     // Catch:{ 9HX -> 0x006d }
            goto L_0x007f
        L_0x006d:
            r8 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error parsing shadow radius: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r9, r4)
            X.C25913CoX.A00(r2, r5, r0, r8)
            float r11 = X.C24515C7j.A00(r7, r6)
        L_0x007f:
            r0 = 36
            X.DFL r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x00a5
            int r14 = X.C25340Cdz.A00(r2, r0)
        L_0x008b:
            r0 = 41
            X.DFL r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x00a1
            int r12 = X.C25340Cdz.A00(r2, r0)
        L_0x0097:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r0 != r3) goto L_0x00a7
            X.BEx r9 = new X.BEx
            r9.<init>(r12, r14, r11)
            return r9
        L_0x00a1:
            r12 = -13350828(0xffffffffff344854, float:-2.3963659E38)
            goto L_0x0097
        L_0x00a5:
            r14 = 0
            goto L_0x008b
        L_0x00a7:
            java.lang.String r9 = X.BE7.A0d(r1)
            r8 = 1082130432(0x40800000, float:4.0)
            float r0 = X.C24515C7j.A00(r7, r8)     // Catch:{ 9HX -> 0x00bc }
            if (r9 == 0) goto L_0x00b7
            float r0 = X.A90.A01(r9)     // Catch:{ 9HX -> 0x00bc }
        L_0x00b7:
            float r10 = java.lang.Math.max(r15, r0)     // Catch:{ 9HX -> 0x00bc }
            goto L_0x00ce
        L_0x00bc:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error parsing corner radius: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r9, r3)
            X.C25913CoX.A00(r2, r5, r0, r4)
            float r10 = X.C24515C7j.A00(r7, r8)
        L_0x00ce:
            java.lang.String r8 = X.BE7.A0f(r1)
            float r0 = X.C24515C7j.A00(r7, r6)     // Catch:{ 9HX -> 0x00e1 }
            if (r8 == 0) goto L_0x00dc
            float r0 = X.A90.A01(r8)     // Catch:{ 9HX -> 0x00e1 }
        L_0x00dc:
            float r13 = java.lang.Math.max(r15, r0)     // Catch:{ 9HX -> 0x00e1 }
            goto L_0x00f0
        L_0x00e1:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error parsing horizontal offset: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r8, r3)
            X.C25913CoX.A00(r2, r5, r0, r4)
            r13 = 0
        L_0x00f0:
            java.lang.String r4 = X.BE7.A0g(r1)
            float r0 = X.C24515C7j.A00(r7, r6)     // Catch:{ 9HX -> 0x0103 }
            if (r4 == 0) goto L_0x00fe
            float r0 = X.A90.A01(r4)     // Catch:{ 9HX -> 0x0103 }
        L_0x00fe:
            float r15 = java.lang.Math.max(r15, r0)     // Catch:{ 9HX -> 0x0103 }
            goto L_0x0111
        L_0x0103:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error parsing vertical offset: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)
            X.C25913CoX.A00(r2, r5, r0, r3)
        L_0x0111:
            X.BF0 r9 = new X.BF0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L_0x0117:
            java.lang.String r3 = "primary"
            java.lang.String r0 = X.BE7.A0f(r1)
            if (r0 == 0) goto L_0x0120
            r3 = r0
        L_0x0120:
            java.lang.String r0 = "circular"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0130
            android.content.Context r0 = r2.A00
            X.BF5 r9 = new X.BF5
            r9.<init>(r0, r2)
            return r9
        L_0x0130:
            java.lang.String r0 = "elevated"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x019e
            java.lang.Integer r6 = X.AnonymousClass00R.A0C
        L_0x013a:
            r0 = 36
            X.DFL r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x019c
            int r7 = X.C25340Cdz.A00(r2, r0)
        L_0x0146:
            r0 = 35
            java.util.List r0 = X.BE7.A0s(r1, r0)
            java.util.Iterator r3 = r0.iterator()
            r8 = 0
        L_0x0151:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01ac
            java.lang.String r1 = X.C17880vN.A0v(r3)
            if (r1 == 0) goto L_0x0151
            int r0 = r1.hashCode()
            switch(r0) {
                case -1383228885: goto L_0x0191;
                case 96673: goto L_0x0186;
                case 115029: goto L_0x017b;
                case 3317767: goto L_0x0170;
                case 108511772: goto L_0x0165;
                default: goto L_0x0164;
            }
        L_0x0164:
            goto L_0x0151
        L_0x0165:
            java.lang.String r0 = "right"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0151
            r8 = r8 | 4
            goto L_0x0151
        L_0x0170:
            java.lang.String r0 = "left"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0151
            r8 = r8 | 2
            goto L_0x0151
        L_0x017b:
            java.lang.String r0 = "top"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0151
            r8 = r8 | 1
            goto L_0x0151
        L_0x0186:
            java.lang.String r0 = "all"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0151
            r8 = r8 | 15
            goto L_0x0151
        L_0x0191:
            java.lang.String r0 = "bottom"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0151
            r8 = r8 | 8
            goto L_0x0151
        L_0x019c:
            r7 = 0
            goto L_0x0146
        L_0x019e:
            java.lang.String r0 = "persistent"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x01a9
            java.lang.Integer r6 = X.AnonymousClass00R.A0N
            goto L_0x013a
        L_0x01a9:
            java.lang.Integer r6 = X.AnonymousClass00R.A00
            goto L_0x013a
        L_0x01ac:
            android.content.Context r4 = r2.A00
            X.BF9 r9 = new X.BF9
            r3 = r9
            r5 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            return r9
        L_0x01b6:
            X.BF7 r9 = new X.BF7
            r9.<init>()
            r0 = 41
            r8 = 0
            boolean r0 = r1.A0I(r0, r8)
            if (r0 == 0) goto L_0x0306
            X.BVN r4 = new X.BVN
            r4.<init>()
        L_0x01c9:
            boolean r0 = r4 instanceof X.BVN
            if (r0 == 0) goto L_0x01fa
            r0 = 38
            X.DFL r5 = r1.A09(r0)
            r0 = 50
            X.DFL r7 = r1.A09(r0)
            if (r5 == 0) goto L_0x01dd
            if (r7 != 0) goto L_0x01e4
        L_0x01dd:
            java.lang.String r3 = "ShimmerDrawableUtils"
            java.lang.String r0 = "Base Color or highlight color were null for a Color highlight Shimmer Drawable"
            X.C25913CoX.A01(r3, r0)
        L_0x01e4:
            if (r5 != 0) goto L_0x0300
            r6 = 0
        L_0x01e7:
            X.CUR r5 = r4.A00
            int r3 = r5.A05
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 & r0
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r0
            r6 = r6 | r3
            r5.A05 = r6
            if (r7 != 0) goto L_0x02fa
            r0 = 0
        L_0x01f8:
            r5.A09 = r0
        L_0x01fa:
            r2 = 40
            r0 = 1
            boolean r0 = r1.A0I(r2, r0)
            X.CUR r3 = r4.A00
            r3.A0H = r0
            r2 = 36
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r0 = r1.A03(r2, r0)
            r4.A01(r0)
            r0 = 49
            r7 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1.A03(r0, r7)
            r4.A03(r0)
            r2 = 44
            r0 = 1000(0x3e8, float:1.401E-42)
            int r0 = r1.A04(r2, r0)
            long r5 = (long) r0
            r4.A05(r5)
            r2 = 52
            r0 = -1
            int r0 = r1.A04(r2, r0)
            r3.A0A = r0
            r0 = 53
            int r0 = r1.A04(r0, r8)
            long r5 = (long) r0
            r4.A06(r5)
            r2 = 43
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = r1.A03(r2, r0)
            r4.A02(r0)
            r0 = 46
            int r2 = r1.A04(r0, r8)
            if (r2 < 0) goto L_0x033a
            r3.A08 = r2
            r0 = 45
            int r2 = r1.A04(r0, r8)
            if (r2 < 0) goto L_0x032f
            r3.A07 = r2
            r0 = 51
            r5 = 0
            float r0 = r1.A03(r0, r5)
            r4.A04(r0)
            r0 = 57
            float r2 = r1.A03(r0, r7)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x031e
            r3.A04 = r2
            r0 = 48
            float r2 = r1.A03(r0, r7)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x030d
            r3.A01 = r2
            r0 = 56
            float r0 = r1.A03(r0, r5)
            r3.A03 = r0
            java.lang.String r2 = X.BE7.A0i(r1)
            if (r2 == 0) goto L_0x0291
            int r0 = r2.hashCode()
            switch(r0) {
                case -1118360059: goto L_0x02f0;
                case -1085344219: goto L_0x02e8;
                case -87315416: goto L_0x02e0;
                default: goto L_0x0291;
            }
        L_0x0291:
            r2 = 0
        L_0x0292:
            r3.A06 = r2
            r0 = 54
            java.lang.String r5 = r1.A0D(r0)
            if (r5 == 0) goto L_0x02b3
            int r2 = r5.hashCode()
            r0 = 1097506319(0x416a9e0f, float:14.663589)
            if (r2 == r0) goto L_0x02b3
            r0 = 1099846370(0x418e52e2, float:17.79047)
            if (r2 != r0) goto L_0x02b3
            java.lang.String r0 = "reverse"
            boolean r0 = r5.equals(r0)
            r2 = 2
            if (r0 != 0) goto L_0x02b4
        L_0x02b3:
            r2 = 1
        L_0x02b4:
            r3.A0B = r2
            r0 = 55
            java.lang.String r2 = r1.A0D(r0)
            if (r2 == 0) goto L_0x02d5
            int r1 = r2.hashCode()
            r0 = -1102672091(0xffffffffbe468f25, float:-0.19390543)
            if (r1 == r0) goto L_0x02d5
            r0 = -938579425(0xffffffffc80e6a1f, float:-145832.48)
            if (r1 != r0) goto L_0x02d5
            java.lang.String r0 = "radial"
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x02d6
        L_0x02d5:
            r1 = 0
        L_0x02d6:
            r3.A0C = r1
            X.CUR r0 = r4.A00()
            r9.A02(r0)
            return r9
        L_0x02e0:
            java.lang.String r0 = "right_to_left"
            boolean r0 = r2.equals(r0)
            r2 = 2
            goto L_0x02f7
        L_0x02e8:
            java.lang.String r0 = "bottom_to_top"
            boolean r0 = r2.equals(r0)
            r2 = 3
            goto L_0x02f7
        L_0x02f0:
            java.lang.String r0 = "top_to_bottom"
            boolean r0 = r2.equals(r0)
            r2 = 1
        L_0x02f7:
            if (r0 != 0) goto L_0x0292
            goto L_0x0291
        L_0x02fa:
            int r0 = X.C25340Cdz.A01(r2, r7, r8)
            goto L_0x01f8
        L_0x0300:
            int r6 = X.C25340Cdz.A01(r2, r5, r8)
            goto L_0x01e7
        L_0x0306:
            X.BVM r4 = new X.BVM
            r4.<init>()
            goto L_0x01c9
        L_0x030d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Given invalid height ratio: "
            r1.append(r0)
            r1.append(r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0j(r1)
            throw r0
        L_0x031e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Given invalid width ratio: "
            r1.append(r0)
            r1.append(r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0j(r1)
            throw r0
        L_0x032f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Given invalid height: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)
            throw r0
        L_0x033a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Given invalid width: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BNJ.A00(X.DOZ, X.DFL, X.DFL):android.graphics.drawable.Drawable");
    }
}
