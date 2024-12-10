package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.2tq  reason: invalid class name and case insensitive filesystem */
public abstract class C63882tq {
    /* JADX WARNING: type inference failed for: r2v6, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r21v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r19v2, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018a, code lost:
        if (r2.size() <= 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018c, code lost:
        r1 = new X.C63002sL((java.util.List) r2, (java.util.List) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0192, code lost:
        if (r16 == false) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0194, code lost:
        r1 = new X.C63002sL(r6, r15, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019a, code lost:
        r1 = new X.C63002sL(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x019f, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a1, code lost:
        if (r0 == 1) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a4, code lost:
        if (r0 == 2) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a6, code lost:
        r5 = r1.A01;
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01aa, code lost:
        if (r4 == 1) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ac, code lost:
        if (r4 == 2) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ae, code lost:
        r26 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b1, code lost:
        r26 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b4, code lost:
        r2 = new android.graphics.SweepGradient(r19, r18, r1.A01, r1.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c4, code lost:
        if (r24 <= 0.0f) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c6, code lost:
        r5 = r1.A01;
        r1 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ca, code lost:
        if (r4 == 1) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cd, code lost:
        if (r4 == 2) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cf, code lost:
        r27 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d2, code lost:
        r27 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d5, code lost:
        r27 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d7, code lost:
        r21 = new android.graphics.RadialGradient(r19, r18, r24, r5, r1, r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e7, code lost:
        r26 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e9, code lost:
        r19 = new android.graphics.LinearGradient(r20, r21, r22, r23, r5, r0, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fa, code lost:
        return new X.C59202lv((android.content.res.ColorStateList) null, r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01fb, code lost:
        r0 = X.C17880vN.A17("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C59202lv A05(android.content.res.Resources.Theme r23, android.content.res.TypedArray r24, java.lang.String r25, org.xmlpull.v1.XmlPullParser r26, int r27) {
        /*
            r8 = 0
            r1 = r25
            r0 = r26
            boolean r0 = A07(r1, r0)
            if (r0 == 0) goto L_0x0227
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r4 = r24
            r3 = r27
            r4.getValue(r3, r2)
            int r1 = r2.type
            r0 = 28
            if (r1 < r0) goto L_0x002a
            r0 = 31
            if (r1 > r0) goto L_0x002a
            int r1 = r2.data
            r0 = 0
            X.2lv r3 = new X.2lv
            r3.<init>(r0, r0, r1)
            return r3
        L_0x002a:
            android.content.res.Resources r10 = r4.getResources()
            int r0 = r4.getResourceId(r3, r8)
            android.content.res.XmlResourceParser r9 = r10.getXml(r0)     // Catch:{ Exception -> 0x021f }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r9)     // Catch:{ Exception -> 0x021f }
        L_0x003a:
            int r1 = r9.next()     // Catch:{ Exception -> 0x021f }
            r0 = 2
            if (r1 == r0) goto L_0x0046
            r0 = 1
            if (r1 != r0) goto L_0x003a
            goto L_0x0218
        L_0x0046:
            java.lang.String r2 = r9.getName()     // Catch:{ Exception -> 0x021f }
            java.lang.String r1 = "gradient"
            boolean r0 = r2.equals(r1)     // Catch:{ Exception -> 0x021f }
            r25 = r23
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "selector"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x021f }
            if (r0 == 0) goto L_0x006e
            r0 = r25
            android.content.res.ColorStateList r2 = X.AnonymousClass1bU.A00(r0, r10, r7, r9)     // Catch:{ Exception -> 0x021f }
            r1 = 0
            int r0 = r2.getDefaultColor()     // Catch:{ Exception -> 0x021f }
            X.2lv r3 = new X.2lv     // Catch:{ Exception -> 0x021f }
            r3.<init>(r2, r1, r0)     // Catch:{ Exception -> 0x021f }
            return r3
        L_0x006e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x021f }
            java.lang.String r0 = r9.getPositionDescription()     // Catch:{ Exception -> 0x021f }
            r1.append(r0)     // Catch:{ Exception -> 0x021f }
            java.lang.String r0 = ": unsupported complex color tag "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ Exception -> 0x021f }
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)     // Catch:{ Exception -> 0x021f }
            goto L_0x021e
        L_0x0085:
            java.lang.String r2 = r9.getName()     // Catch:{ Exception -> 0x021f }
            boolean r0 = r2.equals(r1)     // Catch:{ Exception -> 0x021f }
            if (r0 == 0) goto L_0x0202
            int[] r1 = X.AnonymousClass1bV.A03     // Catch:{ Exception -> 0x021f }
            r0 = r25
            android.content.res.TypedArray r2 = A04(r0, r10, r7, r1)     // Catch:{ Exception -> 0x021f }
            java.lang.String r1 = "startX"
            r0 = 8
            r3 = 0
            float r20 = A00(r2, r1, r9, r3, r0)     // Catch:{ Exception -> 0x021f }
            java.lang.String r1 = "startY"
            r0 = 9
            float r21 = A00(r2, r1, r9, r3, r0)     // Catch:{ Exception -> 0x021f }
            java.lang.String r1 = "endX"
            r0 = 10
            float r22 = A00(r2, r1, r9, r3, r0)     // Catch:{ Exception -> 0x021f }
            java.lang.String r1 = "endY"
            r0 = 11
            float r23 = A00(r2, r1, r9, r3, r0)     // Catch:{ Exception -> 0x021f }
            java.lang.String r1 = "centerX"
            r0 = 3
            float r19 = A00(r2, r1, r9, r3, r0)     // Catch:{ Exception -> 0x021f }
            java.lang.String r1 = "centerY"
            r0 = 4
            float r18 = A00(r2, r1, r9, r3, r0)     // Catch:{ Exception -> 0x021f }
            java.lang.String r1 = "type"
            r0 = 2
            int r17 = A02(r2, r1, r9, r0, r8)     // Catch:{ Exception -> 0x021f }
            java.lang.String r0 = "startColor"
            boolean r0 = A07(r0, r9)     // Catch:{ Exception -> 0x021f }
            if (r0 != 0) goto L_0x00db
            r6 = 0
            goto L_0x00df
        L_0x00db:
            int r6 = r2.getColor(r8, r8)     // Catch:{ Exception -> 0x021f }
        L_0x00df:
            java.lang.String r0 = "centerColor"
            boolean r16 = A07(r0, r9)     // Catch:{ Exception -> 0x021f }
            r1 = 7
            boolean r0 = A07(r0, r9)     // Catch:{ Exception -> 0x021f }
            if (r0 != 0) goto L_0x00ee
            r15 = 0
            goto L_0x00f2
        L_0x00ee:
            int r15 = r2.getColor(r1, r8)     // Catch:{ Exception -> 0x021f }
        L_0x00f2:
            java.lang.String r0 = "endColor"
            r1 = 1
            boolean r0 = A07(r0, r9)     // Catch:{ Exception -> 0x021f }
            if (r0 != 0) goto L_0x00fd
            r5 = 0
            goto L_0x0101
        L_0x00fd:
            int r5 = r2.getColor(r1, r8)     // Catch:{ Exception -> 0x021f }
        L_0x0101:
            java.lang.String r1 = "tileMode"
            r0 = 6
            int r4 = A02(r2, r1, r9, r0, r8)     // Catch:{ Exception -> 0x021f }
            java.lang.String r1 = "gradientRadius"
            r0 = 5
            r13 = 0
            float r24 = A00(r2, r1, r9, r3, r0)     // Catch:{ Exception -> 0x021f }
            r2.recycle()     // Catch:{ Exception -> 0x021f }
            int r0 = r9.getDepth()     // Catch:{ Exception -> 0x021f }
            r3 = 1
            int r12 = r0 + 1
            r0 = 20
            java.util.ArrayList r11 = X.C17880vN.A0z(r0)     // Catch:{ Exception -> 0x021f }
            java.util.ArrayList r2 = X.C17880vN.A0z(r0)     // Catch:{ Exception -> 0x021f }
        L_0x0125:
            int r1 = r9.next()     // Catch:{ Exception -> 0x021f }
            if (r1 == r3) goto L_0x0186
            int r0 = r9.getDepth()     // Catch:{ Exception -> 0x021f }
            if (r0 >= r12) goto L_0x0134
            r14 = 3
            if (r1 == r14) goto L_0x0186
        L_0x0134:
            r14 = 2
            if (r1 != r14) goto L_0x0125
            if (r0 > r12) goto L_0x0125
            java.lang.String r1 = r9.getName()     // Catch:{ Exception -> 0x021f }
            java.lang.String r0 = "item"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x021f }
            if (r0 == 0) goto L_0x0125
            int[] r1 = X.AnonymousClass1bV.A04     // Catch:{ Exception -> 0x021f }
            r0 = r25
            android.content.res.TypedArray r0 = A04(r0, r10, r7, r1)     // Catch:{ Exception -> 0x021f }
            boolean r14 = r0.hasValue(r8)     // Catch:{ Exception -> 0x021f }
            boolean r1 = r0.hasValue(r3)     // Catch:{ Exception -> 0x021f }
            if (r14 == 0) goto L_0x016f
            if (r1 == 0) goto L_0x016f
            int r1 = r0.getColor(r8, r8)     // Catch:{ Exception -> 0x021f }
            float r14 = r0.getFloat(r3, r13)     // Catch:{ Exception -> 0x021f }
            r0.recycle()     // Catch:{ Exception -> 0x021f }
            X.C17890vO.A1D(r2, r1)     // Catch:{ Exception -> 0x021f }
            java.lang.Float r0 = java.lang.Float.valueOf(r14)     // Catch:{ Exception -> 0x021f }
            r11.add(r0)     // Catch:{ Exception -> 0x021f }
            goto L_0x0125
        L_0x016f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x021f }
            java.lang.String r0 = r9.getPositionDescription()     // Catch:{ Exception -> 0x021f }
            r1.append(r0)     // Catch:{ Exception -> 0x021f }
            java.lang.String r0 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x021f }
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)     // Catch:{ Exception -> 0x021f }
            goto L_0x021e
        L_0x0186:
            int r0 = r2.size()     // Catch:{ Exception -> 0x021f }
            if (r0 <= 0) goto L_0x0192
            X.2sL r1 = new X.2sL     // Catch:{ Exception -> 0x021f }
            r1.<init>((java.util.List) r2, (java.util.List) r11)     // Catch:{ Exception -> 0x021f }
            goto L_0x019f
        L_0x0192:
            if (r16 == 0) goto L_0x019a
            X.2sL r1 = new X.2sL     // Catch:{ Exception -> 0x021f }
            r1.<init>(r6, r15, r5)     // Catch:{ Exception -> 0x021f }
            goto L_0x019f
        L_0x019a:
            X.2sL r1 = new X.2sL     // Catch:{ Exception -> 0x021f }
            r1.<init>((int) r6, (int) r5)     // Catch:{ Exception -> 0x021f }
        L_0x019f:
            r0 = r17
            if (r0 == r3) goto L_0x01c2
            r2 = 2
            if (r0 == r2) goto L_0x01b4
            int[] r5 = r1.A01     // Catch:{ Exception -> 0x021f }
            float[] r0 = r1.A00     // Catch:{ Exception -> 0x021f }
            if (r4 == r3) goto L_0x01b1
            if (r4 == r2) goto L_0x01e7
            android.graphics.Shader$TileMode r26 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ Exception -> 0x021f }
            goto L_0x01e9
        L_0x01b1:
            android.graphics.Shader$TileMode r26 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ Exception -> 0x021f }
            goto L_0x01e9
        L_0x01b4:
            int[] r4 = r1.A01     // Catch:{ Exception -> 0x021f }
            float[] r3 = r1.A00     // Catch:{ Exception -> 0x021f }
            android.graphics.SweepGradient r2 = new android.graphics.SweepGradient     // Catch:{ Exception -> 0x021f }
            r1 = r19
            r0 = r18
            r2.<init>(r1, r0, r4, r3)     // Catch:{ Exception -> 0x021f }
            goto L_0x01f4
        L_0x01c2:
            int r0 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x01fb
            int[] r5 = r1.A01     // Catch:{ Exception -> 0x021f }
            float[] r1 = r1.A00     // Catch:{ Exception -> 0x021f }
            if (r4 == r3) goto L_0x01d2
            r0 = 2
            if (r4 == r0) goto L_0x01d5
            android.graphics.Shader$TileMode r27 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ Exception -> 0x021f }
            goto L_0x01d7
        L_0x01d2:
            android.graphics.Shader$TileMode r27 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ Exception -> 0x021f }
            goto L_0x01d7
        L_0x01d5:
            android.graphics.Shader$TileMode r27 = android.graphics.Shader.TileMode.MIRROR     // Catch:{ Exception -> 0x021f }
        L_0x01d7:
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient     // Catch:{ Exception -> 0x021f }
            r21 = r2
            r22 = r19
            r23 = r18
            r25 = r5
            r26 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x021f }
            goto L_0x01f4
        L_0x01e7:
            android.graphics.Shader$TileMode r26 = android.graphics.Shader.TileMode.MIRROR     // Catch:{ Exception -> 0x021f }
        L_0x01e9:
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient     // Catch:{ Exception -> 0x021f }
            r19 = r2
            r24 = r5
            r25 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x021f }
        L_0x01f4:
            r0 = 0
            X.2lv r3 = new X.2lv     // Catch:{ Exception -> 0x021f }
            r3.<init>(r0, r2, r8)     // Catch:{ Exception -> 0x021f }
            return r3
        L_0x01fb:
            java.lang.String r0 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)     // Catch:{ Exception -> 0x021f }
            goto L_0x021e
        L_0x0202:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x021f }
            java.lang.String r0 = r9.getPositionDescription()     // Catch:{ Exception -> 0x021f }
            r1.append(r0)     // Catch:{ Exception -> 0x021f }
            java.lang.String r0 = ": invalid gradient color tag "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ Exception -> 0x021f }
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)     // Catch:{ Exception -> 0x021f }
            goto L_0x021e
        L_0x0218:
            java.lang.String r0 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r0 = X.C17880vN.A17(r0)     // Catch:{ Exception -> 0x021f }
        L_0x021e:
            throw r0     // Catch:{ Exception -> 0x021f }
        L_0x021f:
            r2 = move-exception
            java.lang.String r1 = "ComplexColorCompat"
            java.lang.String r0 = "Failed to inflate ComplexColor."
            android.util.Log.e(r1, r0, r2)
        L_0x0227:
            r0 = 0
            X.2lv r3 = new X.2lv
            r3.<init>(r0, r0, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63882tq.A05(android.content.res.Resources$Theme, android.content.res.TypedArray, java.lang.String, org.xmlpull.v1.XmlPullParser, int):X.2lv");
    }

    public static int A01(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static TypedArray A04(Resources.Theme theme, Resources resources, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean A06(TypedArray typedArray, XmlPullParser xmlPullParser, boolean z) {
        if (!A07("autoMirrored", xmlPullParser)) {
            return z;
        }
        return typedArray.getBoolean(5, z);
    }

    public static boolean A07(String str, XmlPullParser xmlPullParser) {
        return AnonymousClass000.A1W(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str));
    }

    public static float A00(TypedArray typedArray, String str, XmlPullParser xmlPullParser, float f, int i) {
        if (!A07(str, xmlPullParser)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    public static int A02(TypedArray typedArray, String str, XmlPullParser xmlPullParser, int i, int i2) {
        if (!A07(str, xmlPullParser)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    public static ColorStateList A03(Resources.Theme theme, TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (!A07("tint", xmlPullParser)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Failed to resolve attribute at index ");
            A10.append(1);
            throw new UnsupportedOperationException(AnonymousClass001.A1E(typedValue, ": ", A10));
        } else if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        } else {
            Resources resources = typedArray.getResources();
            try {
                return AnonymousClass1bU.A01(theme, resources, resources.getXml(typedArray.getResourceId(1, 0)));
            } catch (Exception e) {
                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                return null;
            }
        }
    }
}
