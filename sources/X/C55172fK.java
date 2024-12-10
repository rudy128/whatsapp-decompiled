package X;

/* renamed from: X.2fK  reason: invalid class name and case insensitive filesystem */
public final class C55172fK {
    public final float A00;
    public final float A01;
    public final float A02;
    public final C64542uw A03;
    public final C64542uw A04;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r12 == 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ec, code lost:
        if (r1 != false) goto L_0x00ee;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C55172fK(android.content.Context r14, X.C64542uw r15) {
        /*
            r13 = this;
            r13.<init>()
            X.2uw r3 = new X.2uw
            r3.<init>()
            r13.A03 = r3
            if (r15 != 0) goto L_0x0011
            X.2uw r15 = new X.2uw
            r15.<init>()
        L_0x0011:
            int r4 = r15.A01
            r11 = 2130968753(0x7f0400b1, float:1.7546169E38)
            r2 = 0
            r7 = r14
            if (r4 == 0) goto L_0x0076
            java.lang.String r6 = "badge"
            android.content.res.Resources r0 = r14.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x005b }
            android.content.res.XmlResourceParser r5 = r0.getXml(r4)     // Catch:{ IOException | XmlPullParserException -> 0x005b }
        L_0x0024:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x005b }
            r0 = 2
            if (r1 == r0) goto L_0x0035
            r0 = 1
            if (r1 != r0) goto L_0x0024
            java.lang.String r0 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)     // Catch:{ IOException | XmlPullParserException -> 0x005b }
            goto L_0x005a
        L_0x0035:
            java.lang.String r0 = r5.getName()     // Catch:{ IOException | XmlPullParserException -> 0x005b }
            boolean r0 = android.text.TextUtils.equals(r0, r6)     // Catch:{ IOException | XmlPullParserException -> 0x005b }
            if (r0 == 0) goto L_0x0044
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x005b }
            goto L_0x0078
        L_0x0044:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | XmlPullParserException -> 0x005b }
            java.lang.String r0 = "Must have a <"
            r1.append(r0)     // Catch:{ IOException | XmlPullParserException -> 0x005b }
            r1.append(r6)     // Catch:{ IOException | XmlPullParserException -> 0x005b }
            java.lang.String r0 = "> start tag"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException | XmlPullParserException -> 0x005b }
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)     // Catch:{ IOException | XmlPullParserException -> 0x005b }
        L_0x005a:
            throw r0     // Catch:{ IOException | XmlPullParserException -> 0x005b }
        L_0x005b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Can't load badge resource ID #0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r4)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
        L_0x0076:
            r8 = 0
            goto L_0x007e
        L_0x0078:
            int r12 = r8.getStyleAttribute()
            if (r12 != 0) goto L_0x0081
        L_0x007e:
            r12 = 2132084723(0x7f1507f3, float:1.9809625E38)
        L_0x0081:
            int[] r9 = X.C27781Xn.A02
            int[] r10 = new int[r2]
            android.content.res.TypedArray r4 = X.C27791Xo.A00(r7, r8, r9, r10, r11, r12)
            android.content.res.Resources r5 = r14.getResources()
            r1 = 2
            r0 = 2131167763(0x7f070a13, float:1.7949809E38)
            int r0 = r5.getDimensionPixelSize(r0)
            int r0 = r4.getDimensionPixelSize(r1, r0)
            float r0 = (float) r0
            r13.A00 = r0
            r1 = 4
            r0 = 2131167762(0x7f070a12, float:1.7949807E38)
            int r0 = r5.getDimensionPixelSize(r0)
            int r0 = r4.getDimensionPixelSize(r1, r0)
            float r0 = (float) r0
            r13.A01 = r0
            r1 = 5
            r0 = 2131167768(0x7f070a18, float:1.7949819E38)
            int r0 = r5.getDimensionPixelSize(r0)
            int r0 = r4.getDimensionPixelSize(r1, r0)
            float r0 = (float) r0
            r13.A02 = r0
            int r0 = r15.A00
            r6 = -2
            if (r0 != r6) goto L_0x00c1
            r0 = 255(0xff, float:3.57E-43)
        L_0x00c1:
            r3.A00 = r0
            java.lang.CharSequence r0 = r15.A07
            if (r0 != 0) goto L_0x00ce
            r0 = 2131899188(0x7f123334, float:1.9433315E38)
            java.lang.String r0 = r14.getString(r0)
        L_0x00ce:
            r3.A07 = r0
            int r0 = r15.A03
            if (r0 != 0) goto L_0x00d7
            r0 = 2131755520(0x7f100200, float:1.9141922E38)
        L_0x00d7:
            r3.A03 = r0
            int r0 = r15.A02
            if (r0 != 0) goto L_0x00e0
            r0 = 2131899201(0x7f123341, float:1.9433341E38)
        L_0x00e0:
            r3.A02 = r0
            java.lang.Boolean r0 = r15.A06
            r5 = 0
            if (r0 == 0) goto L_0x00ee
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x00ef
        L_0x00ee:
            r0 = 1
        L_0x00ef:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A06 = r0
            int r0 = r15.A04
            if (r0 != r6) goto L_0x0100
            r1 = 8
            r0 = 4
            int r0 = r4.getInt(r1, r0)
        L_0x0100:
            r3.A04 = r0
            int r0 = r15.A05
            if (r0 != r6) goto L_0x0114
            r0 = 9
            r1 = 9
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L_0x0206
            int r0 = r4.getInt(r1, r2)
        L_0x0114:
            r3.A05 = r0
            java.lang.Integer r0 = r15.A0A
            if (r0 != 0) goto L_0x0200
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r14, r4, r2)
            int r0 = r0.getDefaultColor()
        L_0x0122:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0A = r0
            java.lang.Integer r0 = r15.A0C
            if (r0 != 0) goto L_0x0140
            r0 = 3
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L_0x01f4
            r0 = 3
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r14, r4, r0)
        L_0x0138:
            int r0 = r0.getDefaultColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0140:
            r3.A0C = r0
            java.lang.Integer r0 = r15.A0B
            if (r0 != 0) goto L_0x01ee
            r1 = 1
            r0 = 8388661(0x800035, float:1.1755018E-38)
            int r0 = r4.getInt(r1, r0)
        L_0x014e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0B = r0
            java.lang.Integer r0 = r15.A0E
            if (r0 != 0) goto L_0x01e8
            r0 = 6
            int r0 = r4.getDimensionPixelOffset(r0, r2)
        L_0x015d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0E = r0
            java.lang.Integer r0 = r15.A0G
            if (r0 != 0) goto L_0x01e3
            r0 = 10
            int r0 = r4.getDimensionPixelOffset(r0, r2)
        L_0x016d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0G = r0
            java.lang.Integer r0 = r15.A0D
            if (r0 != 0) goto L_0x01de
            r1 = 7
            java.lang.Integer r0 = r3.A0E
            int r0 = r0.intValue()
            int r0 = r4.getDimensionPixelOffset(r1, r0)
        L_0x0182:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0D = r0
            java.lang.Integer r0 = r15.A0F
            if (r0 != 0) goto L_0x01d9
            r1 = 11
            java.lang.Integer r0 = r3.A0G
            int r0 = r0.intValue()
            int r0 = r4.getDimensionPixelOffset(r1, r0)
        L_0x0198:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0F = r0
            java.lang.Integer r0 = r15.A08
            if (r0 != 0) goto L_0x01d4
            r0 = 0
        L_0x01a3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A08 = r0
            java.lang.Integer r0 = r15.A09
            if (r0 == 0) goto L_0x01b1
            int r5 = r0.intValue()
        L_0x01b1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.A09 = r0
            r4.recycle()
            java.util.Locale r0 = r15.A0H
            if (r0 != 0) goto L_0x01ca
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x01cf
            java.util.Locale$Category r0 = java.util.Locale.Category.FORMAT
            java.util.Locale r0 = java.util.Locale.getDefault(r0)
        L_0x01ca:
            r3.A0H = r0
            r13.A04 = r15
            return
        L_0x01cf:
            java.util.Locale r0 = java.util.Locale.getDefault()
            goto L_0x01ca
        L_0x01d4:
            int r0 = r0.intValue()
            goto L_0x01a3
        L_0x01d9:
            int r0 = r0.intValue()
            goto L_0x0198
        L_0x01de:
            int r0 = r0.intValue()
            goto L_0x0182
        L_0x01e3:
            int r0 = r0.intValue()
            goto L_0x016d
        L_0x01e8:
            int r0 = r0.intValue()
            goto L_0x015d
        L_0x01ee:
            int r0 = r0.intValue()
            goto L_0x014e
        L_0x01f4:
            r1 = 2132083927(0x7f1504d7, float:1.980801E38)
            X.Cr8 r0 = new X.Cr8
            r0.<init>(r14, r1)
            android.content.res.ColorStateList r0 = r0.A01
            goto L_0x0138
        L_0x0200:
            int r0 = r0.intValue()
            goto L_0x0122
        L_0x0206:
            r0 = -1
            goto L_0x0114
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55172fK.<init>(android.content.Context, X.2uw):void");
    }
}
