package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.1bU  reason: invalid class name */
public abstract class AnonymousClass1bU {
    public static final ThreadLocal A00 = new ThreadLocal();

    /* JADX WARNING: type inference failed for: r1v47, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0113, code lost:
        if (r4 > 100.0f) goto L_0x0115;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0172  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList A00(android.content.res.Resources.Theme r30, android.content.res.Resources r31, android.util.AttributeSet r32, org.xmlpull.v1.XmlPullParser r33) {
        /*
            java.lang.String r2 = r33.getName()
            java.lang.String r0 = "selector"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x031c
            int r0 = r33.getDepth()
            r1 = 1
            int r29 = r0 + 1
            r2 = 20
            int[][] r0 = new int[r2][]
            r28 = r0
            int[] r0 = new int[r2]
            r27 = r0
            r7 = 0
        L_0x001f:
            int r3 = r33.next()
            if (r3 == r1) goto L_0x0307
            int r2 = r33.getDepth()
            r0 = r29
            if (r2 >= r0) goto L_0x0030
            r0 = 3
            if (r3 == r0) goto L_0x0307
        L_0x0030:
            r0 = 2
            if (r3 != r0) goto L_0x015e
            r0 = r29
            if (r2 > r0) goto L_0x015e
            java.lang.String r2 = r33.getName()
            java.lang.String r0 = "item"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x015e
            int[] r2 = X.AnonymousClass1bV.A00
            r10 = r30
            r9 = r31
            r5 = r32
            if (r30 != 0) goto L_0x00fe
            android.content.res.TypedArray r8 = r9.obtainAttributes(r5, r2)
        L_0x0051:
            r2 = 0
            r6 = 0
            r0 = -1
            int r11 = r8.getResourceId(r2, r0)
            r4 = -65281(0xffffffffffff00ff, float:NaN)
            if (r11 == r0) goto L_0x008e
            java.lang.ThreadLocal r2 = A00
            java.lang.Object r0 = r2.get()
            android.util.TypedValue r0 = (android.util.TypedValue) r0
            if (r0 != 0) goto L_0x006f
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r2.set(r0)
        L_0x006f:
            r3 = 1
            r9.getValue(r11, r0, r1)
            int r2 = r0.type
            r0 = 28
            if (r2 < r0) goto L_0x008c
            r0 = 31
            if (r2 > r0) goto L_0x008c
        L_0x007d:
            if (r3 != 0) goto L_0x008e
            android.content.res.XmlResourceParser r0 = r9.getXml(r11)     // Catch:{ Exception -> 0x0093 }
            android.content.res.ColorStateList r0 = A01(r10, r9, r0)     // Catch:{ Exception -> 0x0093 }
            int r12 = r0.getDefaultColor()     // Catch:{ Exception -> 0x0093 }
            goto L_0x0097
        L_0x008c:
            r3 = 0
            goto L_0x007d
        L_0x008e:
            int r12 = r8.getColor(r6, r4)
            goto L_0x0097
        L_0x0093:
            int r12 = r8.getColor(r6, r4)
        L_0x0097:
            boolean r0 = r8.hasValue(r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x00f1
            float r3 = r8.getFloat(r1, r3)
        L_0x00a3:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 < r0) goto L_0x00eb
            r0 = 2
            r1 = 2
            boolean r0 = r8.hasValue(r0)
            if (r0 == 0) goto L_0x00eb
            float r4 = r8.getFloat(r1, r2)
        L_0x00b7:
            r8.recycle()
            int r11 = r5.getAttributeCount()
            int[] r10 = new int[r11]
            r9 = 0
            r8 = 0
        L_0x00c2:
            if (r9 >= r11) goto L_0x0105
            int r2 = r5.getAttributeNameResource(r9)
            r0 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r2 == r0) goto L_0x00e8
            r0 = 16843551(0x101031f, float:2.3695797E-38)
            if (r2 == r0) goto L_0x00e8
            r0 = 2130968663(0x7f040057, float:1.7545986E38)
            if (r2 == r0) goto L_0x00e8
            r0 = 2130970191(0x7f04064f, float:1.7549085E38)
            if (r2 == r0) goto L_0x00e8
            int r1 = r8 + 1
            boolean r0 = r5.getAttributeBooleanValue(r9, r6)
            if (r0 != 0) goto L_0x00e5
            int r2 = -r2
        L_0x00e5:
            r10[r8] = r2
            r8 = r1
        L_0x00e8:
            int r9 = r9 + 1
            goto L_0x00c2
        L_0x00eb:
            r0 = 4
            float r4 = r8.getFloat(r0, r2)
            goto L_0x00b7
        L_0x00f1:
            r0 = 3
            r1 = 3
            boolean r0 = r8.hasValue(r0)
            if (r0 == 0) goto L_0x00a3
            float r3 = r8.getFloat(r1, r3)
            goto L_0x00a3
        L_0x00fe:
            r0 = 0
            android.content.res.TypedArray r8 = r10.obtainStyledAttributes(r5, r2, r0, r0)
            goto L_0x0051
        L_0x0105:
            int[] r26 = android.util.StateSet.trimStateSet(r10, r8)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0115
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r2 = 1
            if (r0 <= 0) goto L_0x0116
        L_0x0115:
            r2 = 0
        L_0x0116:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0161
            if (r2 != 0) goto L_0x0161
        L_0x011e:
            int r1 = r7 + 1
            r0 = r27
            int r0 = r0.length
            if (r1 <= r0) goto L_0x0135
            r1 = 4
            int r0 = r7 * 2
            if (r7 > r1) goto L_0x012c
            r0 = 8
        L_0x012c:
            int[] r1 = new int[r0]
            r0 = r27
            java.lang.System.arraycopy(r0, r6, r1, r6, r7)
            r27 = r1
        L_0x0135:
            r27[r7] = r12
            int r1 = r7 + 1
            r0 = r28
            int r0 = r0.length
            if (r1 <= r0) goto L_0x015a
            java.lang.Class r0 = r28.getClass()
            java.lang.Class r2 = r0.getComponentType()
            r1 = 4
            int r0 = r7 * 2
            if (r7 > r1) goto L_0x014d
            r0 = 8
        L_0x014d:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0 = r28
            java.lang.System.arraycopy(r0, r6, r1, r6, r7)
            r28 = r1
        L_0x015a:
            r28[r7] = r26
            int r7 = r7 + 1
        L_0x015e:
            r1 = 1
            goto L_0x001f
        L_0x0161:
            int r0 = android.graphics.Color.alpha(r12)
            float r1 = (float) r0
            float r1 = r1 * r3
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r5 = (int) r1
            r0 = 255(0xff, float:3.57E-43)
            if (r5 >= r6) goto L_0x0301
            r5 = 0
        L_0x0170:
            if (r2 == 0) goto L_0x026b
            X.Cpz r0 = X.C25985Cpz.A01(r12)
            float r3 = r0.A03
            float r9 = r0.A02
            X.Ciz r8 = X.C25619Ciz.A0A
            double r0 = (double) r9
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x02b7
            int r0 = java.lang.Math.round(r4)
            double r0 = (double) r0
            r10 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x02b7
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x02b7
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02af
            r12 = 0
        L_0x019a:
            r25 = 0
            r3 = r9
            r24 = 0
            r23 = 1
        L_0x01a1:
            float r0 = r24 - r9
            float r1 = java.lang.Math.abs(r0)
            r0 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02a6
            r22 = 0
            r21 = 1120403456(0x42c80000, float:100.0)
            r20 = 1148846080(0x447a0000, float:1000.0)
            r11 = 0
            r19 = 1148846080(0x447a0000, float:1000.0)
            r18 = 0
        L_0x01b9:
            float r0 = r18 - r21
            float r1 = java.lang.Math.abs(r0)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0261
            float r10 = r21 - r18
            r0 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r0
            float r10 = r10 + r18
            X.Cpz r0 = X.C25985Cpz.A00(r10, r3, r12)
            int r17 = r0.A02(r8)
            int r0 = android.graphics.Color.red(r17)
            float r0 = X.C25456Cg8.A00(r0)
            int r1 = android.graphics.Color.green(r17)
            float r15 = X.C25456Cg8.A00(r1)
            int r1 = android.graphics.Color.blue(r17)
            float r14 = X.C25456Cg8.A00(r1)
            float[][] r1 = X.C25456Cg8.A02
            r13 = 1
            r2 = r1[r13]
            r1 = r2[r6]
            float r0 = r0 * r1
            r1 = r2[r13]
            float r15 = r15 * r1
            float r0 = r0 + r15
            r1 = 2
            r1 = r2[r1]
            float r14 = r14 * r1
            float r0 = r0 + r14
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            r1 = 1007753895(0x3c111aa7, float:0.008856452)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0298
            r1 = 1147261687(0x4461d2f7, float:903.2963)
            float r0 = r0 * r1
        L_0x020c:
            float r1 = r4 - r0
            float r16 = java.lang.Math.abs(r1)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0259
            X.Cpz r13 = X.C25985Cpz.A01(r17)
            float r2 = r13.A04
            float r1 = r13.A02
            X.Cpz r1 = X.C25985Cpz.A00(r2, r1, r12)
            float r15 = r13.A05
            float r2 = r1.A05
            float r15 = r15 - r2
            float r14 = r13.A00
            float r2 = r1.A00
            float r14 = r14 - r2
            float r2 = r13.A01
            float r1 = r1.A01
            float r2 = r2 - r1
            float r15 = r15 * r15
            float r14 = r14 * r14
            float r15 = r15 + r14
            float r2 = r2 * r2
            float r15 = r15 + r2
            double r1 = (double) r15
            double r14 = java.lang.Math.sqrt(r1)
            r1 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r1 = java.lang.Math.pow(r14, r1)
            r14 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r1 = r1 * r14
            float r14 = (float) r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0259
            r11 = r13
            r20 = r16
            r19 = r14
        L_0x0259:
            int r1 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r1 != 0) goto L_0x028c
            int r1 = (r19 > r22 ? 1 : (r19 == r22 ? 0 : -1))
            if (r1 != 0) goto L_0x028c
        L_0x0261:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r23 == 0) goto L_0x027d
            if (r11 == 0) goto L_0x0274
            int r12 = r11.A02(r8)
        L_0x026b:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r0
            int r0 = r5 << 24
            r12 = r12 | r0
            goto L_0x011e
        L_0x0274:
            float r3 = r9 - r24
            float r3 = r3 / r0
            float r3 = r3 + r24
            r23 = 0
            goto L_0x01a1
        L_0x027d:
            if (r11 != 0) goto L_0x0287
            r9 = r3
        L_0x0280:
            float r3 = r9 - r24
            float r3 = r3 / r0
            float r3 = r3 + r24
            goto L_0x01a1
        L_0x0287:
            r24 = r3
            r25 = r11
            goto L_0x0280
        L_0x028c:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0294
            r18 = r10
            goto L_0x01b9
        L_0x0294:
            r21 = r10
            goto L_0x01b9
        L_0x0298:
            double r0 = (double) r0
            double r1 = java.lang.Math.cbrt(r0)
            float r0 = (float) r1
            r1 = 1122500608(0x42e80000, float:116.0)
            float r0 = r0 * r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r0 = r0 - r1
            goto L_0x020c
        L_0x02a6:
            if (r25 == 0) goto L_0x02b7
            r0 = r25
            int r12 = r0.A02(r8)
            goto L_0x026b
        L_0x02af:
            r0 = 1135869952(0x43b40000, float:360.0)
            float r12 = java.lang.Math.min(r0, r3)
            goto L_0x019a
        L_0x02b7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02c0
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x026b
        L_0x02c0:
            r0 = 1120272384(0x42c60000, float:99.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02c8
            r12 = -1
            goto L_0x026b
        L_0x02c8:
            r10 = 1098907648(0x41800000, float:16.0)
            float r9 = r4 + r10
            r8 = 1122500608(0x42e80000, float:116.0)
            float r9 = r9 / r8
            r0 = 1090519040(0x41000000, float:8.0)
            r1 = 1147261687(0x4461d2f7, float:903.2963)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ff
            float r4 = r9 * r9
            float r4 = r4 * r9
        L_0x02db:
            float r2 = r9 * r9
            float r2 = r2 * r9
            r3 = 1
            r0 = 1007753895(0x3c111aa7, float:0.008856452)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x02ea
            float r9 = r9 * r8
            float r9 = r9 - r10
            float r2 = r9 / r1
        L_0x02ea:
            float[] r1 = X.C25456Cg8.A00
            r0 = r1[r6]
            float r0 = r0 * r2
            double r8 = (double) r0
            r0 = r1[r3]
            float r4 = r4 * r0
            double r10 = (double) r4
            r0 = 2
            r0 = r1[r0]
            float r2 = r2 * r0
            double r12 = (double) r2
            int r12 = X.AnonymousClass1Z2.A02(r8, r10, r12)
            goto L_0x026b
        L_0x02ff:
            float r4 = r4 / r1
            goto L_0x02db
        L_0x0301:
            if (r5 <= r0) goto L_0x0170
            r5 = 255(0xff, float:3.57E-43)
            goto L_0x0170
        L_0x0307:
            int[] r3 = new int[r7]
            int[][] r2 = new int[r7][]
            r1 = 0
            r0 = r27
            java.lang.System.arraycopy(r0, r1, r3, r1, r7)
            r0 = r28
            java.lang.System.arraycopy(r0, r1, r2, r1, r7)
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r2, r3)
            return r0
        L_0x031c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r33.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": invalid color state list tag "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1bU.A00(android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser):android.content.res.ColorStateList");
    }

    public static ColorStateList A01(Resources.Theme theme, Resources resources, XmlPullParser xmlPullParser) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return A00(theme, resources, asAttributeSet, xmlPullParser);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }
}
