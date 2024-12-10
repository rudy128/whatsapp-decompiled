package X;

/* renamed from: X.C5l  reason: case insensitive filesystem */
public abstract class C24471C5l {
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fb, code lost:
        throw new X.AnonymousClass9HX(X.AnonymousClass001.A1H("can't parse orientation value: ", r2, X.AnonymousClass000.A10()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable A00(X.DOZ r15, X.DFL r16, X.DFL r17) {
        /*
            r14 = this;
            r1 = r16
            int r2 = r1.A05
            r0 = 13318(0x3406, float:1.8662E-41)
            r5 = r17
            if (r2 == r0) goto L_0x015d
            r0 = 13322(0x340a, float:1.8668E-41)
            if (r2 == r0) goto L_0x00c8
            r0 = 13330(0x3412, float:1.868E-41)
            if (r2 == r0) goto L_0x016f
            r0 = 13332(0x3414, float:1.8682E-41)
            if (r2 == r0) goto L_0x0032
            r0 = 13340(0x341c, float:1.8693E-41)
            if (r2 == r0) goto L_0x0020
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r3.<init>()
        L_0x001f:
            return r3
        L_0x0020:
            r3 = 0
            r0 = 35
            X.DFL r0 = r1.A09(r0)     // Catch:{ 9HX -> 0x0205 }
            if (r0 == 0) goto L_0x001f
            int r0 = X.C25340Cdz.A00(r15, r0)     // Catch:{ 9HX -> 0x0205 }
            X.BEz r3 = X.C25885Cnw.A01(r15, r5, r0)     // Catch:{ 9HX -> 0x0205 }
            return r3
        L_0x0032:
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            r0 = 6
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r0]
            r2 = 35
            java.util.List r6 = r1.A0F(r2)
            r13 = 0
            r1 = 0
        L_0x0042:
            int r0 = r6.size()
            r12 = 1
            if (r1 >= r0) goto L_0x00b7
            X.DFL r8 = X.AnonymousClass8BR.A0G(r6, r1)
            X.DFL r7 = r8.A09(r2)
            if (r7 != 0) goto L_0x00ac
            java.lang.String r7 = "StateDrawableUtils"
            java.lang.String r0 = "Null Drawable model when creating children of a StateDrawable"
            X.C25913CoX.A01(r7, r0)
            android.graphics.drawable.ColorDrawable r11 = new android.graphics.drawable.ColorDrawable
            r11.<init>()
        L_0x005f:
            java.lang.String r10 = ""
            java.lang.String r0 = X.BE7.A0e(r8)
            if (r0 == 0) goto L_0x0068
            r10 = r0
        L_0x0068:
            int r0 = r10.hashCode()
            r9 = 4
            r8 = 3
            r7 = 2
            switch(r0) {
                case -691041417: goto L_0x0075;
                case -318264286: goto L_0x0080;
                case 270940796: goto L_0x008b;
                case 1191572123: goto L_0x0096;
                case 1544803905: goto L_0x00a1;
                default: goto L_0x0072;
            }
        L_0x0072:
            int r1 = r1 + 1
            goto L_0x0042
        L_0x0075:
            java.lang.String r0 = "focused"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0072
            r4[r12] = r11
            goto L_0x0072
        L_0x0080:
            java.lang.String r0 = "pressed"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0072
            r4[r8] = r11
            goto L_0x0072
        L_0x008b:
            java.lang.String r0 = "disabled"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0072
            r4[r9] = r11
            goto L_0x0072
        L_0x0096:
            java.lang.String r0 = "selected"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0072
            r4[r7] = r11
            goto L_0x0072
        L_0x00a1:
            java.lang.String r0 = "default"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0072
            r4[r13] = r11
            goto L_0x0072
        L_0x00ac:
            X.CqB r0 = X.C25995CqB.A00()
            X.C5l r0 = r0.A01
            android.graphics.drawable.Drawable r11 = r0.A00(r15, r7, r5)
            goto L_0x005f
        L_0x00b7:
            r2 = 5
        L_0x00b8:
            r1 = r4[r2]
            if (r1 == 0) goto L_0x00c3
            int[][] r0 = X.CEK.A00
            r0 = r0[r2]
            r3.addState(r0, r1)
        L_0x00c3:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x001f
            goto L_0x00b8
        L_0x00c8:
            X.DFL r4 = X.BE7.A0O(r1)
            r0 = 36
            X.DFL r3 = r1.A09(r0)
            if (r4 == 0) goto L_0x01f8
            if (r3 == 0) goto L_0x01f8
            r0 = 38
            X.DFL r8 = r1.A09(r0)
            java.lang.String r2 = X.BE7.A0g(r1)
            if (r2 != 0) goto L_0x00e5
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM     // Catch:{ 9HX -> 0x0128 }
            goto L_0x0132
        L_0x00e5:
            int r0 = r2.hashCode()     // Catch:{ 9HX -> 0x0128 }
            switch(r0) {
                case -1451623918: goto L_0x00fc;
                case -1118360059: goto L_0x0107;
                case 404498110: goto L_0x0112;
                case 1553519760: goto L_0x011d;
                default: goto L_0x00ec;
            }     // Catch:{ 9HX -> 0x0128 }
        L_0x00ec:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 9HX -> 0x0128 }
            java.lang.String r0 = "can't parse orientation value: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ 9HX -> 0x0128 }
            X.9HX r0 = new X.9HX     // Catch:{ 9HX -> 0x0128 }
            r0.<init>(r1)     // Catch:{ 9HX -> 0x0128 }
            throw r0     // Catch:{ 9HX -> 0x0128 }
        L_0x00fc:
            java.lang.String r0 = "bottom_left_to_top_right"
            boolean r0 = r2.equals(r0)     // Catch:{ 9HX -> 0x0128 }
            if (r0 == 0) goto L_0x00ec
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR     // Catch:{ 9HX -> 0x0128 }
            goto L_0x0132
        L_0x0107:
            java.lang.String r0 = "top_to_bottom"
            boolean r0 = r2.equals(r0)     // Catch:{ 9HX -> 0x0128 }
            if (r0 == 0) goto L_0x00ec
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM     // Catch:{ 9HX -> 0x0128 }
            goto L_0x0132
        L_0x0112:
            java.lang.String r0 = "top_left_to_bottom_right"
            boolean r0 = r2.equals(r0)     // Catch:{ 9HX -> 0x0128 }
            if (r0 == 0) goto L_0x00ec
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR     // Catch:{ 9HX -> 0x0128 }
            goto L_0x0132
        L_0x011d:
            java.lang.String r0 = "left_to_right"
            boolean r0 = r2.equals(r0)     // Catch:{ 9HX -> 0x0128 }
            if (r0 == 0) goto L_0x00ec
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT     // Catch:{ 9HX -> 0x0128 }
            goto L_0x0132
        L_0x0128:
            r2 = move-exception
            java.lang.String r1 = "GradientDrawableUtils"
            java.lang.String r0 = "Error parsing orientation for GradientDrawable"
            X.C25913CoX.A00(r15, r1, r0, r2)
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
        L_0x0132:
            r7 = 0
            int r6 = X.C25340Cdz.A01(r15, r4, r7)
            int r4 = X.C25340Cdz.A01(r15, r3, r7)
            r3 = 1
            r2 = 2
            if (r8 == 0) goto L_0x0156
            int r1 = X.C25340Cdz.A01(r15, r8, r7)
            r0 = 3
            int[] r0 = new int[r0]
            r0[r7] = r6
            r0[r3] = r1
            r0[r2] = r4
        L_0x014c:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>(r9, r0)
            if (r17 == 0) goto L_0x001f
            r0 = 46
            goto L_0x01cd
        L_0x0156:
            int[] r0 = new int[r2]
            r0[r7] = r6
            r0[r3] = r4
            goto L_0x014c
        L_0x015d:
            r0 = 35
            r3 = 0
            java.lang.String r0 = r1.A0D(r0)     // Catch:{ 9HX -> 0x01ff }
            if (r0 == 0) goto L_0x001f
            int r0 = X.A90.A04(r0)     // Catch:{ 9HX -> 0x01ff }
            X.BEz r3 = X.C25885Cnw.A01(r15, r5, r0)     // Catch:{ 9HX -> 0x01ff }
            return r3
        L_0x016f:
            X.DFL r2 = X.BE7.A0O(r1)
            java.lang.String r7 = "RippleDrawableUtils"
            if (r2 != 0) goto L_0x017c
            java.lang.String r0 = "Client received a RippleDrawable with null content"
            X.C25913CoX.A01(r7, r0)
        L_0x017c:
            if (r2 != 0) goto L_0x018e
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
        L_0x0183:
            r4 = 0
            if (r17 == 0) goto L_0x01bb
            r0 = 8
            float[] r3 = new float[r0]
            r0 = 46
            r2 = 0
            goto L_0x0199
        L_0x018e:
            X.CqB r0 = X.C25995CqB.A00()
            X.C5l r0 = r0.A01
            android.graphics.drawable.Drawable r6 = r0.A00(r15, r2, r5)
            goto L_0x0183
        L_0x0199:
            java.lang.String r0 = r5.A0D(r0)     // Catch:{ 9HX -> 0x01a9 }
            if (r0 != 0) goto L_0x01a1
            r0 = 0
            goto L_0x01a5
        L_0x01a1:
            float r0 = X.A90.A01(r0)     // Catch:{ 9HX -> 0x01a9 }
        L_0x01a5:
            java.util.Arrays.fill(r3, r0)     // Catch:{ 9HX -> 0x01a9 }
            goto L_0x01b1
        L_0x01a9:
            java.lang.String r0 = "Error parsing Corner radius for Box decoration"
            X.C25913CoX.A01(r7, r0)
            java.util.Arrays.fill(r3, r2)
        L_0x01b1:
            android.graphics.drawable.shapes.RoundRectShape r0 = new android.graphics.drawable.shapes.RoundRectShape
            r0.<init>(r3, r4, r4)
            android.graphics.drawable.ShapeDrawable r4 = new android.graphics.drawable.ShapeDrawable
            r4.<init>(r0)
        L_0x01bb:
            java.lang.String r0 = X.BE7.A0f(r1)
            int r0 = android.graphics.Color.parseColor(r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            r3.<init>(r0, r6, r4)
            return r3
        L_0x01cd:
            java.lang.String r0 = r5.A0D(r0)     // Catch:{ 9HX -> 0x01f0 }
            if (r0 != 0) goto L_0x01d5
            r2 = 0
            goto L_0x01d9
        L_0x01d5:
            float r2 = X.A90.A01(r0)     // Catch:{ 9HX -> 0x01f0 }
        L_0x01d9:
            r0 = 56
            java.util.List r1 = r5.A0G(r0)     // Catch:{ 9HX -> 0x01f0 }
            r0 = 15
            int r1 = X.C25887Cny.A00(r1, r0)     // Catch:{ 9HX -> 0x01f0 }
            r0 = 8
            float[] r0 = new float[r0]     // Catch:{ 9HX -> 0x01f0 }
            X.C25887Cny.A01(r0, r2, r1)     // Catch:{ 9HX -> 0x01f0 }
            r3.setCornerRadii(r0)     // Catch:{ 9HX -> 0x01f0 }
            return r3
        L_0x01f0:
            java.lang.String r1 = "GradientDrawableUtils"
            java.lang.String r0 = "Error parsing Corner radius for Box decoration"
            X.C25913CoX.A01(r1, r0)
            return r3
        L_0x01f8:
            java.lang.String r0 = "Gradient drawable received with null begin or end color"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x01ff:
            r2 = move-exception
            java.lang.String r1 = "ColorDrawableUtils"
            java.lang.String r0 = "Error parsing color for ColorDrawable"
            goto L_0x020a
        L_0x0205:
            r2 = move-exception
            java.lang.String r1 = "ThemedColorDrawableUtils"
            java.lang.String r0 = "Parse error for ThemedColorDrawable"
        L_0x020a:
            X.C25913CoX.A00(r15, r1, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24471C5l.A00(X.DOZ, X.DFL, X.DFL):android.graphics.drawable.Drawable");
    }
}
