package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: X.0LS  reason: invalid class name */
public abstract class AnonymousClass0LS {
    public static final C04640Oe A00(C17130tn r9, int i) {
        C04640Oe r1;
        r9.COB(473971343);
        AnonymousClass07W r12 = AnonymousClass0PK.A01;
        Context context = (Context) r9.BFh(r12);
        r9.BFh(AnonymousClass0PK.A00);
        Resources resources = ((Context) r9.BFh(r12)).getResources();
        Object A1A = AnonymousClass001.A1A(r9);
        Object obj = AnonymousClass0MH.A00;
        if (A1A == obj) {
            A1A = new TypedValue();
            r9.CRH(A1A);
        }
        AnonymousClass0VR r3 = (AnonymousClass0VR) r9;
        AnonymousClass0VR.A0R(r3, false);
        TypedValue typedValue = (TypedValue) A1A;
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !AnonymousClass1YF.A0W(charSequence, ".xml")) {
            r9.COB(-738265172);
            Integer valueOf = Integer.valueOf(i);
            Resources.Theme theme = context.getTheme();
            boolean BEf = r9.BEf(valueOf) | AnonymousClass000.A1V(r9, charSequence, 1618982084) | r9.BEf(theme);
            Object CER = r9.CER();
            if (BEf || CER == obj) {
                try {
                    CER = AnonymousClass0FX.A00(resources, i);
                    r9.CRH(CER);
                } catch (Exception e) {
                    throw new C07180aV(AnonymousClass001.A1E(charSequence, "Error attempting to load resource: ", AnonymousClass000.A10()), e);
                }
            }
            AnonymousClass0VR.A0R(r3, false);
            r1 = new AnonymousClass09o((C16980tX) CER);
        } else {
            r9.COB(-738265327);
            r1 = C04830Pc.A01(r9, A01(context.getTheme(), resources, r9, i, typedValue.changingConfigurations));
        }
        AnonymousClass0VR.A0R(r3, false);
        AnonymousClass0VR.A0R(r3, false);
        return r1;
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [X.0Ml, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v19, types: [X.0Ml, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0NK A01(android.content.res.Resources.Theme r30, android.content.res.Resources r31, X.C17130tn r32, int r33, int r34) {
        /*
            r1 = 21855625(0x14d7d89, float:3.774262E-38)
            r29 = r32
            r0 = r29
            r0.COB(r1)
            X.07W r1 = X.AnonymousClass0PK.A02
            java.lang.Object r0 = r0.BFh(r1)
            X.0HG r0 = (X.AnonymousClass0HG) r0
            X.0Jh r4 = new X.0Jh
            r5 = r30
            r1 = r33
            r4.<init>(r5, r1)
            java.util.HashMap r0 = r0.A00
            r28 = r0
            java.lang.Object r0 = r0.get(r4)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x002f
            java.lang.Object r2 = r0.get()
            X.0Jg r2 = (X.C03670Jg) r2
            if (r2 != 0) goto L_0x0116
        L_0x002f:
            r7 = r31
            android.content.res.XmlResourceParser r18 = r7.getXml(r1)
        L_0x0035:
            int r1 = r18.next()
            r0 = 2
            if (r1 == r0) goto L_0x0047
            r0 = 1
            if (r1 != r0) goto L_0x0035
            java.lang.String r1 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0047:
            java.lang.String r1 = r18.getName()
            java.lang.String r0 = "vector"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x027c
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r18)
            X.0NX r3 = new X.0NX
            r0 = r18
            r3.<init>(r0)
            int[] r0 = X.C03010Gg.A03
            android.content.res.TypedArray r2 = r3.A04(r5, r7, r6, r0)
            boolean r27 = r3.A06(r2)
            r8 = 7
            java.lang.String r0 = "viewportWidth"
            r1 = 0
            float r22 = r3.A01(r2, r0, r1, r8)
            r8 = 8
            java.lang.String r0 = "viewportHeight"
            float r23 = r3.A01(r2, r0, r1, r8)
            int r0 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0265
            int r0 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x024e
            r0 = 3
            float r20 = r2.getDimension(r0, r1)
            X.AnonymousClass0NX.A00(r2, r3)
            r0 = 2
            float r21 = r2.getDimension(r0, r1)
            X.AnonymousClass0NX.A00(r2, r3)
            r0 = 1
            r1 = 1
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x024a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r2.getValue(r1, r0)
            int r1 = r0.type
            r0 = 2
            if (r1 == r0) goto L_0x024a
            android.content.res.ColorStateList r0 = r3.A03(r5, r2)
            if (r0 == 0) goto L_0x024a
            int r0 = r0.getDefaultColor()
            long r0 = (long) r0
            r8 = 32
            long r0 = r0 << r8
            X.0Ek r8 = X.C05100Qk.A06
        L_0x00b5:
            r10 = -1
            r8 = 6
            int r9 = r2.getInt(r8, r10)
            X.AnonymousClass0NX.A00(r2, r3)
            if (r9 == r10) goto L_0x00cd
            r8 = 3
            if (r9 == r8) goto L_0x0246
            r8 = 5
            if (r9 == r8) goto L_0x00cd
            r8 = 9
            if (r9 == r8) goto L_0x0242
            switch(r9) {
                case 14: goto L_0x023e;
                case 15: goto L_0x023a;
                case 16: goto L_0x0236;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            r24 = 5
        L_0x00cf:
            android.util.DisplayMetrics r8 = r7.getDisplayMetrics()
            float r8 = r8.density
            float r20 = r20 / r8
            android.util.DisplayMetrics r8 = r7.getDisplayMetrics()
            float r8 = r8.density
            float r21 = r21 / r8
            r2.recycle()
            X.0OQ r2 = new X.0OQ
            r19 = r2
            r25 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r27)
            r17 = 0
        L_0x00ed:
            int r0 = r18.getEventType()
            r1 = 1
            if (r0 == r1) goto L_0x0101
            int r0 = r18.getDepth()
            if (r0 >= r1) goto L_0x011c
            int r1 = r18.getEventType()
            r0 = 3
            if (r1 != r0) goto L_0x011c
        L_0x0101:
            X.0NK r0 = r2.A02()
            X.0Jg r2 = new X.0Jg
            r1 = r34
            r2.<init>(r0, r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r0 = r28
            r0.put(r4, r1)
        L_0x0116:
            X.0NK r0 = r2.A01
            X.AnonymousClass0VR.A0T(r29)
            return r0
        L_0x011c:
            org.xmlpull.v1.XmlPullParser r8 = r3.A01
            int r1 = r8.getEventType()
            r0 = 2
            java.lang.String r9 = "group"
            if (r1 == r0) goto L_0x0143
            r0 = 3
            if (r1 != r0) goto L_0x01d6
            java.lang.String r0 = r8.getName()
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x01d6
            int r1 = r17 + 1
            r0 = 0
        L_0x0137:
            if (r0 >= r1) goto L_0x013f
            r2.A03()
            int r0 = r0 + 1
            goto L_0x0137
        L_0x013f:
            r17 = 0
            goto L_0x01d6
        L_0x0143:
            java.lang.String r8 = r8.getName()
            if (r8 == 0) goto L_0x01d6
            int r1 = r8.hashCode()
            r0 = -1649314686(0xffffffff9db17482, float:-4.6971976E-21)
            if (r1 == r0) goto L_0x01e7
            r0 = 3433509(0x346425, float:4.811371E-39)
            if (r1 == r0) goto L_0x01db
            r0 = 98629247(0x5e0f67f, float:2.1155407E-35)
            if (r1 != r0) goto L_0x01d6
            boolean r0 = r8.equals(r9)
            if (r0 == 0) goto L_0x01d6
            int[] r0 = X.C03010Gg.A01
            android.content.res.TypedArray r1 = r3.A04(r5, r7, r6, r0)
            r8 = 5
            java.lang.String r0 = "rotation"
            r9 = 0
            float r16 = r3.A01(r1, r0, r9, r8)
            r0 = 1
            float r15 = r1.getFloat(r0, r9)
            X.AnonymousClass0NX.A00(r1, r3)
            r0 = 2
            float r14 = r1.getFloat(r0, r9)
            X.AnonymousClass0NX.A00(r1, r3)
            r8 = 3
            java.lang.String r0 = "scaleX"
            r10 = 1065353216(0x3f800000, float:1.0)
            float r13 = r3.A01(r1, r0, r10, r8)
            r8 = 4
            java.lang.String r0 = "scaleY"
            float r12 = r3.A01(r1, r0, r10, r8)
            r8 = 6
            java.lang.String r0 = "translateX"
            float r11 = r3.A01(r1, r0, r9, r8)
            r8 = 7
            java.lang.String r0 = "translateY"
            float r10 = r3.A01(r1, r0, r9, r8)
            r0 = 0
            java.lang.String r0 = r1.getString(r0)
            X.AnonymousClass0NX.A00(r1, r3)
            if (r0 != 0) goto L_0x01aa
            java.lang.String r0 = ""
        L_0x01aa:
            r1.recycle()
            java.util.List r9 = X.AnonymousClass0GD.A00
            X.AnonymousClass0OQ.A01(r2)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            X.0Ml r1 = new X.0Ml
            r1.<init>()
            r1.A07 = r0
            r0 = r16
            r1.A02 = r0
            r1.A00 = r15
            r1.A01 = r14
            r1.A03 = r13
            r1.A04 = r12
            r1.A05 = r11
            r1.A06 = r10
            r1.A09 = r9
            r1.A08 = r8
            java.util.ArrayList r0 = r2.A02
            r0.add(r1)
        L_0x01d6:
            r18.next()
            goto L_0x00ed
        L_0x01db:
            java.lang.String r0 = "path"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x01d6
            X.AnonymousClass0LL.A01(r5, r7, r6, r2, r3)
            goto L_0x01d6
        L_0x01e7:
            java.lang.String r0 = "clip-path"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x01d6
            int[] r0 = X.C03010Gg.A00
            android.content.res.TypedArray r10 = r3.A04(r5, r7, r6, r0)
            r0 = 0
            java.lang.String r9 = r10.getString(r0)
            X.AnonymousClass0NX.A00(r10, r3)
            if (r9 != 0) goto L_0x0201
            java.lang.String r9 = ""
        L_0x0201:
            r0 = 1
            java.lang.String r1 = r10.getString(r0)
            X.AnonymousClass0NX.A00(r10, r3)
            java.util.List r0 = X.AnonymousClass0GD.A00
            if (r1 != 0) goto L_0x022b
            java.util.List r8 = X.AnonymousClass0GD.A00
        L_0x020f:
            r10.recycle()
            X.AnonymousClass0OQ.A01(r2)
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            X.0Ml r1 = new X.0Ml
            r1.<init>()
            r1.A07 = r9
            X.C04250Ml.A00(r1, r8, r0)
            java.util.ArrayList r0 = r2.A02
            r0.add(r1)
            int r17 = r17 + 1
            goto L_0x01d6
        L_0x022b:
            X.0ID r0 = new X.0ID
            r0.<init>()
            r0.A00(r1)
            java.util.ArrayList r8 = r0.A01
            goto L_0x020f
        L_0x0236:
            r24 = 12
            goto L_0x00cf
        L_0x023a:
            r24 = 14
            goto L_0x00cf
        L_0x023e:
            r24 = 13
            goto L_0x00cf
        L_0x0242:
            r24 = 9
            goto L_0x00cf
        L_0x0246:
            r24 = 3
            goto L_0x00cf
        L_0x024a:
            long r0 = X.C05100Qk.A05
            goto L_0x00b5
        L_0x024e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r2.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = "<VectorGraphic> tag requires viewportHeight > 0"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0265:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r2.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = "<VectorGraphic> tag requires viewportWidth > 0"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x027c:
            java.lang.String r0 = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0LS.A01(android.content.res.Resources$Theme, android.content.res.Resources, X.0tn, int, int):X.0NK");
    }
}
