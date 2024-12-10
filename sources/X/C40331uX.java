package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.1uX  reason: invalid class name and case insensitive filesystem */
public abstract class C40331uX {
    public static C40111uB A00 = C40111uB.A01("x", "y");
    public static C40111uB A01 = C40111uB.A01("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final Interpolator A02 = new LinearInterpolator();

    public static Interpolator A00(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        PointF pointF3 = C40761vE.A00;
        pointF.x = Math.max(-1.0f, Math.min(1.0f, f));
        pointF.y = Math.max(-100.0f, Math.min(100.0f, pointF.y));
        float max = Math.max(-1.0f, Math.min(1.0f, pointF2.x));
        pointF2.x = max;
        float max2 = Math.max(-100.0f, Math.min(100.0f, pointF2.y));
        pointF2.y = max2;
        try {
            return C29111bd.A00(pointF.x, pointF.y, max, max2);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                return C29111bd.A00(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0146, code lost:
        r3.A0I();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C40511up A01(X.C39801tf r17, X.C40301uU r18, X.C39941tt r19, float r20, boolean r21, boolean r22) {
        /*
            r11 = r18
            r3 = r19
            r2 = r20
            if (r21 == 0) goto L_0x0224
            r18 = r17
            if (r22 == 0) goto L_0x01af
            r3.A0G()
            r15 = 0
            r17 = 0
            r13 = 0
            r12 = 0
            r7 = 0
            r20 = 0
            r9 = 0
            r4 = 0
            r8 = 0
            r16 = 0
            r14 = 0
            r21 = 0
        L_0x001f:
            boolean r0 = r3.A0M()
            if (r0 == 0) goto L_0x0166
            X.1uB r0 = A01
            int r0 = r3.A09(r0)
            r1 = 1
            switch(r0) {
                case 0: goto L_0x015d;
                case 1: goto L_0x0157;
                case 2: goto L_0x0151;
                case 3: goto L_0x00cb;
                case 4: goto L_0x0048;
                case 5: goto L_0x003d;
                case 6: goto L_0x0038;
                case 7: goto L_0x0033;
                default: goto L_0x002f;
            }
        L_0x002f:
            r3.A0K()
            goto L_0x001f
        L_0x0033:
            android.graphics.PointF r15 = X.C40491un.A02(r3, r2)
            goto L_0x001f
        L_0x0038:
            android.graphics.PointF r14 = X.C40491un.A02(r3, r2)
            goto L_0x001f
        L_0x003d:
            int r0 = r3.A08()
            r17 = 0
            if (r0 != r1) goto L_0x001f
            r17 = 1
            goto L_0x001f
        L_0x0048:
            java.lang.Integer r1 = r3.A0B()
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x00c5
            r3.A0G()
            r10 = 0
            r8 = 0
            r5 = 0
            r6 = 0
        L_0x0057:
            boolean r0 = r3.A0M()
            if (r0 == 0) goto L_0x00b9
            X.1uB r0 = A00
            int r1 = r3.A09(r0)
            if (r1 == 0) goto L_0x0091
            r0 = 1
            if (r1 == r0) goto L_0x006c
            r3.A0K()
            goto L_0x0057
        L_0x006c:
            java.lang.Integer r0 = r3.A0B()
            java.lang.Integer r4 = X.AnonymousClass00R.A0u
            if (r0 != r4) goto L_0x007b
            double r0 = r3.A07()
            float r6 = (float) r0
            r8 = r6
            goto L_0x0057
        L_0x007b:
            r3.A0F()
            double r0 = r3.A07()
            float r8 = (float) r0
            java.lang.Integer r0 = r3.A0B()
            if (r0 != r4) goto L_0x008f
            double r0 = r3.A07()
            float r6 = (float) r0
            goto L_0x00b3
        L_0x008f:
            r6 = r8
            goto L_0x00b3
        L_0x0091:
            java.lang.Integer r0 = r3.A0B()
            java.lang.Integer r4 = X.AnonymousClass00R.A0u
            if (r0 != r4) goto L_0x00a0
            double r0 = r3.A07()
            float r5 = (float) r0
            r10 = r5
            goto L_0x0057
        L_0x00a0:
            r3.A0F()
            double r0 = r3.A07()
            float r10 = (float) r0
            java.lang.Integer r0 = r3.A0B()
            if (r0 != r4) goto L_0x00b7
            double r0 = r3.A07()
            float r5 = (float) r0
        L_0x00b3:
            r3.A0H()
            goto L_0x0057
        L_0x00b7:
            r5 = r10
            goto L_0x00b3
        L_0x00b9:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r10, r8)
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>(r5, r6)
            goto L_0x0146
        L_0x00c5:
            android.graphics.PointF r12 = X.C40491un.A02(r3, r2)
            goto L_0x001f
        L_0x00cb:
            java.lang.Integer r1 = r3.A0B()
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x014b
            r3.A0G()
            r10 = 0
            r9 = 0
            r6 = 0
            r5 = 0
        L_0x00da:
            boolean r0 = r3.A0M()
            if (r0 == 0) goto L_0x013c
            X.1uB r0 = A00
            int r1 = r3.A09(r0)
            if (r1 == 0) goto L_0x0114
            r0 = 1
            if (r1 == r0) goto L_0x00ef
            r3.A0K()
            goto L_0x00da
        L_0x00ef:
            java.lang.Integer r0 = r3.A0B()
            java.lang.Integer r5 = X.AnonymousClass00R.A0u
            if (r0 != r5) goto L_0x00fe
            double r0 = r3.A07()
            float r5 = (float) r0
            r9 = r5
            goto L_0x00da
        L_0x00fe:
            r3.A0F()
            double r0 = r3.A07()
            float r9 = (float) r0
            java.lang.Integer r0 = r3.A0B()
            if (r0 != r5) goto L_0x0112
            double r0 = r3.A07()
            float r5 = (float) r0
            goto L_0x0136
        L_0x0112:
            r5 = r9
            goto L_0x0136
        L_0x0114:
            java.lang.Integer r0 = r3.A0B()
            java.lang.Integer r6 = X.AnonymousClass00R.A0u
            if (r0 != r6) goto L_0x0123
            double r0 = r3.A07()
            float r6 = (float) r0
            r10 = r6
            goto L_0x00da
        L_0x0123:
            r3.A0F()
            double r0 = r3.A07()
            float r10 = (float) r0
            java.lang.Integer r0 = r3.A0B()
            if (r0 != r6) goto L_0x013a
            double r0 = r3.A07()
            float r6 = (float) r0
        L_0x0136:
            r3.A0H()
            goto L_0x00da
        L_0x013a:
            r6 = r10
            goto L_0x0136
        L_0x013c:
            android.graphics.PointF r7 = new android.graphics.PointF
            r7.<init>(r10, r9)
            android.graphics.PointF r9 = new android.graphics.PointF
            r9.<init>(r6, r5)
        L_0x0146:
            r3.A0I()
            goto L_0x001f
        L_0x014b:
            android.graphics.PointF r13 = X.C40491un.A02(r3, r2)
            goto L_0x001f
        L_0x0151:
            java.lang.Object r21 = r11.CB7(r3, r2)
            goto L_0x001f
        L_0x0157:
            java.lang.Object r20 = r11.CB7(r3, r2)
            goto L_0x001f
        L_0x015d:
            double r0 = r3.A07()
            float r5 = (float) r0
            r16 = r5
            goto L_0x001f
        L_0x0166:
            r3.A0I()
            if (r17 == 0) goto L_0x017f
            android.view.animation.Interpolator r17 = A02
            r21 = r20
        L_0x016f:
            r19 = 0
            X.1up r1 = new X.1up
            r22 = r16
            r16 = r1
            r16.<init>((android.view.animation.Interpolator) r17, (X.C39801tf) r18, (java.lang.Float) r19, (java.lang.Object) r20, (java.lang.Object) r21, (float) r22)
        L_0x017a:
            r1.A04 = r14
            r1.A05 = r15
            return r1
        L_0x017f:
            if (r13 == 0) goto L_0x0188
            if (r12 == 0) goto L_0x0188
            android.view.animation.Interpolator r17 = A00(r13, r12)
            goto L_0x016f
        L_0x0188:
            if (r7 == 0) goto L_0x01ac
            if (r9 == 0) goto L_0x01ac
            if (r4 == 0) goto L_0x01ac
            if (r8 == 0) goto L_0x01ac
            android.view.animation.Interpolator r2 = A00(r7, r4)
            android.view.animation.Interpolator r3 = A00(r9, r8)
            r17 = 0
            if (r2 == 0) goto L_0x016f
            if (r3 == 0) goto L_0x016f
            X.1up r1 = new X.1up
            r4 = r18
            r5 = r20
            r6 = r21
            r7 = r16
            r1.<init>((android.view.animation.Interpolator) r2, (android.view.animation.Interpolator) r3, (X.C39801tf) r4, (java.lang.Object) r5, (java.lang.Object) r6, (float) r7)
            goto L_0x017a
        L_0x01ac:
            android.view.animation.Interpolator r17 = A02
            goto L_0x016f
        L_0x01af:
            r3.A0G()
            r8 = 0
            r7 = r8
            r21 = r8
            r20 = r8
            r6 = r8
            r5 = r8
            r9 = 0
            r4 = 0
        L_0x01bc:
            boolean r0 = r3.A0M()
            if (r0 == 0) goto L_0x01ff
            X.1uB r0 = A01
            int r1 = r3.A09(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            switch(r1) {
                case 0: goto L_0x01f9;
                case 1: goto L_0x01f4;
                case 2: goto L_0x01ef;
                case 3: goto L_0x01ea;
                case 4: goto L_0x01e5;
                case 5: goto L_0x01db;
                case 6: goto L_0x01d6;
                case 7: goto L_0x01d1;
                default: goto L_0x01cd;
            }
        L_0x01cd:
            r3.A0K()
            goto L_0x01bc
        L_0x01d1:
            android.graphics.PointF r5 = X.C40491un.A02(r3, r2)
            goto L_0x01bc
        L_0x01d6:
            android.graphics.PointF r6 = X.C40491un.A02(r3, r2)
            goto L_0x01bc
        L_0x01db:
            int r1 = r3.A08()
            r0 = 1
            r9 = 0
            if (r1 != r0) goto L_0x01bc
            r9 = 1
            goto L_0x01bc
        L_0x01e5:
            android.graphics.PointF r7 = X.C40491un.A02(r3, r0)
            goto L_0x01bc
        L_0x01ea:
            android.graphics.PointF r8 = X.C40491un.A02(r3, r0)
            goto L_0x01bc
        L_0x01ef:
            java.lang.Object r21 = r11.CB7(r3, r2)
            goto L_0x01bc
        L_0x01f4:
            java.lang.Object r20 = r11.CB7(r3, r2)
            goto L_0x01bc
        L_0x01f9:
            double r0 = r3.A07()
            float r4 = (float) r0
            goto L_0x01bc
        L_0x01ff:
            r3.A0I()
            if (r9 == 0) goto L_0x0218
            android.view.animation.Interpolator r17 = A02
            r21 = r20
        L_0x0208:
            r19 = 0
            X.1up r1 = new X.1up
            r22 = r4
            r16 = r1
            r16.<init>((android.view.animation.Interpolator) r17, (X.C39801tf) r18, (java.lang.Float) r19, (java.lang.Object) r20, (java.lang.Object) r21, (float) r22)
            r1.A04 = r6
            r1.A05 = r5
            return r1
        L_0x0218:
            if (r8 == 0) goto L_0x0221
            if (r7 == 0) goto L_0x0221
            android.view.animation.Interpolator r17 = A00(r8, r7)
            goto L_0x0208
        L_0x0221:
            android.view.animation.Interpolator r17 = A02
            goto L_0x0208
        L_0x0224:
            java.lang.Object r0 = r11.CB7(r3, r2)
            X.1up r1 = new X.1up
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40331uX.A01(X.1tf, X.1uU, X.1tt, float, boolean, boolean):X.1up");
    }
}
