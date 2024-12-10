package X;

/* renamed from: X.1uR  reason: invalid class name and case insensitive filesystem */
public abstract class C40271uR {
    public static final C40111uB A00 = C40111uB.A01("k");
    public static final C40111uB A01 = C40111uB.A01("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0154, code lost:
        if (r3.A01 == 1.0f) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C40691v7 A00(X.C39801tf r22, X.C39941tt r23) {
        /*
            r2 = r23
            java.lang.Integer r3 = r2.A0B()
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            r0 = 0
            r5 = 0
            if (r3 != r1) goto L_0x0010
            r5 = 1
            r2.A0G()
        L_0x0010:
            r6 = 0
            r12 = 0
            r14 = 0
            r13 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = 0
            r8 = 0
        L_0x0019:
            boolean r1 = r2.A0M()
            if (r1 == 0) goto L_0x00d3
            X.1uB r1 = A01
            int r3 = r2.A09(r1)
            r1 = r22
            switch(r3) {
                case 0: goto L_0x003f;
                case 1: goto L_0x0060;
                case 2: goto L_0x0031;
                case 3: goto L_0x0065;
                case 4: goto L_0x006a;
                case 5: goto L_0x00b5;
                case 6: goto L_0x00bb;
                case 7: goto L_0x00c1;
                case 8: goto L_0x00c7;
                case 9: goto L_0x00cd;
                default: goto L_0x002a;
            }
        L_0x002a:
            r2.A0J()
            r2.A0K()
            goto L_0x0019
        L_0x0031:
            X.1v2 r4 = X.C40641v2.A00
            r3 = 1065353216(0x3f800000, float:1.0)
            java.util.ArrayList r1 = X.C40321uW.A00(r1, r4, r2, r3, r0)
            X.1v4 r13 = new X.1v4
            r13.<init>(r1)
            goto L_0x0019
        L_0x003f:
            r2.A0G()
        L_0x0042:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x005c
            X.1uB r3 = A00
            int r3 = r2.A09(r3)
            if (r3 == 0) goto L_0x0057
            r2.A0J()
            r2.A0K()
            goto L_0x0042
        L_0x0057:
            X.1uy r12 = X.C40571uv.A00(r1, r2)
            goto L_0x0042
        L_0x005c:
            r2.A0I()
            goto L_0x0019
        L_0x0060:
            X.1uq r14 = X.C40571uv.A01(r1, r2)
            goto L_0x0019
        L_0x0065:
            java.lang.String r3 = "Lottie doesn't support 3D layers."
            r1.A02(r3)
        L_0x006a:
            X.1uu r6 = X.C40291uT.A01(r1, r2, r0)
            java.util.List r3 = r6.A00
            boolean r4 = r3.isEmpty()
            r21 = 0
            if (r4 == 0) goto L_0x0091
            java.lang.Float r19 = java.lang.Float.valueOf(r21)
            float r4 = r1.A00
            java.lang.Float r18 = java.lang.Float.valueOf(r4)
            r16 = 0
            X.1up r15 = new X.1up
            r17 = r1
            r20 = r19
            r15.<init>((android.view.animation.Interpolator) r16, (X.C39801tf) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
            r3.add(r15)
            goto L_0x0019
        L_0x0091:
            java.lang.Object r4 = r3.get(r0)
            X.1up r4 = (X.C40511up) r4
            java.lang.Object r4 = r4.A0E
            if (r4 != 0) goto L_0x0019
            java.lang.Float r19 = java.lang.Float.valueOf(r21)
            float r4 = r1.A00
            java.lang.Float r18 = java.lang.Float.valueOf(r4)
            r16 = 0
            X.1up r15 = new X.1up
            r17 = r1
            r20 = r19
            r15.<init>((android.view.animation.Interpolator) r16, (X.C39801tf) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
            r3.set(r0, r15)
            goto L_0x0019
        L_0x00b5:
            X.1us r11 = X.C40291uT.A02(r1, r2)
            goto L_0x0019
        L_0x00bb:
            X.1uu r7 = X.C40291uT.A01(r1, r2, r0)
            goto L_0x0019
        L_0x00c1:
            X.1uu r8 = X.C40291uT.A01(r1, r2, r0)
            goto L_0x0019
        L_0x00c7:
            X.1uu r9 = X.C40291uT.A01(r1, r2, r0)
            goto L_0x0019
        L_0x00cd:
            X.1uu r10 = X.C40291uT.A01(r1, r2, r0)
            goto L_0x0019
        L_0x00d3:
            if (r5 == 0) goto L_0x00d8
            r2.A0I()
        L_0x00d8:
            if (r12 == 0) goto L_0x00f3
            boolean r1 = r12.BgZ()
            if (r1 == 0) goto L_0x00f4
            java.util.List r1 = r12.A00
            java.lang.Object r1 = r1.get(r0)
            X.1up r1 = (X.C40511up) r1
            java.lang.Object r2 = r1.A0E
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1 = 0
            boolean r1 = r2.equals(r1, r1)
            if (r1 == 0) goto L_0x00f4
        L_0x00f3:
            r12 = 0
        L_0x00f4:
            if (r14 == 0) goto L_0x0115
            boolean r1 = r14 instanceof X.C40671v5
            if (r1 != 0) goto L_0x0116
            boolean r1 = r14.BgZ()
            if (r1 == 0) goto L_0x0116
            java.util.List r1 = r14.BTm()
            java.lang.Object r1 = r1.get(r0)
            X.1up r1 = (X.C40511up) r1
            java.lang.Object r2 = r1.A0E
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1 = 0
            boolean r1 = r2.equals(r1, r1)
            if (r1 == 0) goto L_0x0116
        L_0x0115:
            r14 = 0
        L_0x0116:
            if (r6 == 0) goto L_0x0133
            boolean r1 = r6.BgZ()
            if (r1 == 0) goto L_0x0134
            java.util.List r1 = r6.A00
            java.lang.Object r1 = r1.get(r0)
            X.1up r1 = (X.C40511up) r1
            java.lang.Object r1 = r1.A0E
            java.lang.Number r1 = (java.lang.Number) r1
            float r2 = r1.floatValue()
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0134
        L_0x0133:
            r6 = 0
        L_0x0134:
            if (r13 == 0) goto L_0x0156
            boolean r1 = r13.BgZ()
            if (r1 == 0) goto L_0x0157
            java.util.List r1 = r13.A00
            java.lang.Object r1 = r1.get(r0)
            X.1up r1 = (X.C40511up) r1
            java.lang.Object r3 = r1.A0E
            X.1v3 r3 = (X.C40651v3) r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r3.A00
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0157
            float r1 = r3.A01
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0157
        L_0x0156:
            r13 = 0
        L_0x0157:
            if (r9 == 0) goto L_0x0174
            boolean r1 = r9.BgZ()
            if (r1 == 0) goto L_0x0175
            java.util.List r1 = r9.A00
            java.lang.Object r1 = r1.get(r0)
            X.1up r1 = (X.C40511up) r1
            java.lang.Object r1 = r1.A0E
            java.lang.Number r1 = (java.lang.Number) r1
            float r2 = r1.floatValue()
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0175
        L_0x0174:
            r9 = 0
        L_0x0175:
            if (r10 == 0) goto L_0x0192
            boolean r1 = r10.BgZ()
            if (r1 == 0) goto L_0x0193
            java.util.List r1 = r10.A00
            java.lang.Object r0 = r1.get(r0)
            X.1up r0 = (X.C40511up) r0
            java.lang.Object r0 = r0.A0E
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0193
        L_0x0192:
            r10 = 0
        L_0x0193:
            X.1v7 r5 = new X.1v7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40271uR.A00(X.1tf, X.1tt):X.1v7");
    }
}
