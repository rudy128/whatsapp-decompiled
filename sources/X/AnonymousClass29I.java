package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.29I  reason: invalid class name */
public class AnonymousClass29I extends C26049CrJ {
    public List A00;
    public final Path A01 = new Path();
    public final C40781vG A02 = new C40781vG();

    public static int A00(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) >= 0 || i2 * i3 == i) {
            return i3;
        }
        return i3 - 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r3.A01 != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A06(X.C40511up r26, float r27) {
        /*
            r25 = this;
            r0 = r26
            java.lang.Object r5 = r0.A0E
            X.1vG r5 = (X.C40781vG) r5
            java.lang.Object r3 = r0.A07
            X.1vG r3 = (X.C40781vG) r3
            r24 = r25
            r0 = r24
            X.1vG r4 = r0.A02
            android.graphics.PointF r0 = r4.A00
            if (r0 != 0) goto L_0x001b
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r4.A00 = r0
        L_0x001b:
            boolean r0 = r5.A01
            r10 = 1
            if (r0 != 0) goto L_0x0025
            boolean r1 = r3.A01
            r0 = 0
            if (r1 == 0) goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            r4.A01 = r0
            java.util.List r8 = r5.A02
            int r1 = r8.size()
            java.util.List r7 = r3.A02
            int r0 = r7.size()
            if (r1 == r0) goto L_0x004f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Curves must have the same number of control points. Shape 1: "
            X.C17890vO.A15(r0, r1, r8)
            java.lang.String r0 = "\tShape 2: "
            r1.append(r0)
            int r0 = r7.size()
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            X.C196379ux.A00(r0)
        L_0x004f:
            int r1 = r8.size()
            int r0 = r7.size()
            int r2 = java.lang.Math.min(r1, r0)
            java.util.List r6 = r4.A02
            int r0 = r6.size()
            int r1 = r6.size()
            if (r0 < r2) goto L_0x007b
            if (r1 <= r2) goto L_0x0088
            int r1 = r6.size()
            int r1 = r1 - r10
        L_0x006e:
            if (r1 < r2) goto L_0x0088
            int r0 = r6.size()
            int r0 = r0 - r10
            r6.remove(r0)
            int r1 = r1 + -1
            goto L_0x006e
        L_0x007b:
            if (r1 >= r2) goto L_0x0088
            X.1vF r0 = new X.1vF
            r0.<init>()
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x007b
        L_0x0088:
            android.graphics.PointF r5 = r5.A00
            android.graphics.PointF r3 = r3.A00
            float r2 = r5.x
            float r1 = r3.x
            android.graphics.PointF r0 = X.C40761vE.A00
            r9 = r27
            float r2 = X.C17880vN.A00(r1, r2, r9)
            float r1 = r5.y
            float r0 = r3.y
            float r1 = X.C17880vN.A00(r0, r1, r9)
            android.graphics.PointF r0 = r4.A00
            if (r0 != 0) goto L_0x00ab
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r4.A00 = r0
        L_0x00ab:
            r0.set(r2, r1)
            int r5 = r6.size()
            int r5 = r5 - r10
        L_0x00b3:
            if (r5 < 0) goto L_0x0121
            java.lang.Object r1 = r8.get(r5)
            X.1vF r1 = (X.C40771vF) r1
            java.lang.Object r0 = r7.get(r5)
            X.1vF r0 = (X.C40771vF) r0
            android.graphics.PointF r15 = r1.A00
            android.graphics.PointF r13 = r1.A01
            android.graphics.PointF r11 = r1.A02
            android.graphics.PointF r14 = r0.A00
            android.graphics.PointF r12 = r0.A01
            android.graphics.PointF r10 = r0.A02
            java.lang.Object r3 = r6.get(r5)
            X.1vF r3 = (X.C40771vF) r3
            float r1 = r15.x
            float r0 = r14.x
            float r2 = X.C17880vN.A00(r0, r1, r9)
            float r1 = r15.y
            float r0 = r14.y
            float r1 = X.C17880vN.A00(r0, r1, r9)
            android.graphics.PointF r0 = r3.A00
            r0.set(r2, r1)
            java.lang.Object r3 = r6.get(r5)
            X.1vF r3 = (X.C40771vF) r3
            float r1 = r13.x
            float r0 = r12.x
            float r2 = X.C17880vN.A00(r0, r1, r9)
            float r1 = r13.y
            float r0 = r12.y
            float r1 = X.C17880vN.A00(r0, r1, r9)
            android.graphics.PointF r0 = r3.A01
            r0.set(r2, r1)
            java.lang.Object r3 = r6.get(r5)
            X.1vF r3 = (X.C40771vF) r3
            float r1 = r11.x
            float r0 = r10.x
            float r2 = X.C17880vN.A00(r0, r1, r9)
            float r1 = r11.y
            float r0 = r10.y
            float r1 = X.C17880vN.A00(r0, r1, r9)
            android.graphics.PointF r0 = r3.A02
            r0.set(r2, r1)
            int r5 = r5 + -1
            goto L_0x00b3
        L_0x0121:
            r0 = r24
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0355
            int r19 = r0.size()
        L_0x012b:
            int r19 = r19 + -1
            if (r19 < 0) goto L_0x0355
            r0 = r24
            java.util.List r1 = r0.A00
            r0 = r19
            java.lang.Object r6 = r1.get(r0)
            X.D7b r6 = (X.D7b) r6
            java.util.List r15 = r4.A02
            int r1 = r15.size()
            r0 = 2
            if (r1 <= r0) goto L_0x012b
            X.CrJ r0 = r6.A01
            java.lang.Object r0 = r0.A05()
            float r18 = X.AnonymousClass000.A04(r0)
            r0 = 0
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x012b
            boolean r5 = r4.A01
            int r10 = r15.size()
            r12 = 1
            int r10 = r10 - r12
            r3 = 0
            r7 = 0
        L_0x015d:
            if (r10 < 0) goto L_0x01b0
            java.lang.Object r11 = r15.get(r10)
            X.1vF r11 = (X.C40771vF) r11
            int r2 = r10 + -1
            int r1 = r15.size()
            int r0 = A00(r2, r1)
            int r0 = r0 * r1
            int r2 = r2 - r0
            java.lang.Object r0 = r15.get(r2)
            X.1vF r0 = (X.C40771vF) r0
            if (r10 != 0) goto L_0x01a6
            if (r5 != 0) goto L_0x01a6
            android.graphics.PointF r9 = r4.A00
        L_0x017d:
            r8 = r9
        L_0x017e:
            android.graphics.PointF r2 = r11.A00
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x01a4
            if (r10 == 0) goto L_0x018d
            int r0 = r15.size()
            int r0 = r0 - r12
            if (r10 != r0) goto L_0x01a4
        L_0x018d:
            r1 = 1
        L_0x018e:
            boolean r0 = r8.equals(r9)
            if (r0 == 0) goto L_0x01a1
            boolean r0 = r2.equals(r9)
            if (r0 == 0) goto L_0x01a1
            if (r1 != 0) goto L_0x01a1
            int r7 = r7 + 2
        L_0x019e:
            int r10 = r10 + -1
            goto L_0x015d
        L_0x01a1:
            int r7 = r7 + 1
            goto L_0x019e
        L_0x01a4:
            r1 = 0
            goto L_0x018e
        L_0x01a6:
            android.graphics.PointF r9 = r0.A02
            if (r10 != 0) goto L_0x01ad
            if (r5 != 0) goto L_0x01ad
            goto L_0x017d
        L_0x01ad:
            android.graphics.PointF r8 = r0.A01
            goto L_0x017e
        L_0x01b0:
            X.1vG r0 = r6.A00
            if (r0 == 0) goto L_0x01bc
            java.util.List r0 = r0.A02
            int r0 = r0.size()
            if (r0 == r7) goto L_0x01db
        L_0x01bc:
            java.util.ArrayList r2 = X.C17880vN.A0z(r7)
            r1 = 0
        L_0x01c1:
            if (r1 >= r7) goto L_0x01ce
            X.1vF r0 = new X.1vF
            r0.<init>()
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x01c1
        L_0x01ce:
            r0 = 0
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r0, r0)
            X.1vG r0 = new X.1vG
            r0.<init>(r1, r2, r3)
            r6.A00 = r0
        L_0x01db:
            X.1vG r13 = r6.A00
            r13.A01 = r5
            android.graphics.PointF r0 = r4.A00
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.PointF r0 = r13.A00
            if (r0 != 0) goto L_0x01f0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r13.A00 = r0
        L_0x01f0:
            r0.set(r2, r1)
            java.util.List r14 = r13.A02
            boolean r0 = r4.A01
            r17 = r0
            r8 = 0
            r7 = 0
        L_0x01fb:
            int r0 = r15.size()
            if (r8 >= r0) goto L_0x0352
            java.lang.Object r5 = r15.get(r8)
            X.1vF r5 = (X.C40771vF) r5
            int r2 = r8 + -1
            int r1 = r15.size()
            int r0 = A00(r2, r1)
            int r0 = r0 * r1
            int r2 = r2 - r0
            java.lang.Object r9 = r15.get(r2)
            X.1vF r9 = (X.C40771vF) r9
            int r2 = r8 + -2
            int r1 = r15.size()
            int r0 = A00(r2, r1)
            int r0 = r0 * r1
            int r2 = r2 - r0
            java.lang.Object r0 = r15.get(r2)
            X.1vF r0 = (X.C40771vF) r0
            if (r8 != 0) goto L_0x0346
            if (r17 != 0) goto L_0x0346
            android.graphics.PointF r3 = r4.A00
        L_0x0231:
            r11 = r3
        L_0x0232:
            android.graphics.PointF r10 = r5.A00
            android.graphics.PointF r2 = r0.A02
            android.graphics.PointF r1 = r5.A02
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0343
            if (r8 == 0) goto L_0x0246
            int r0 = r15.size()
            int r0 = r0 + -1
            if (r8 != r0) goto L_0x0343
        L_0x0246:
            r6 = 1
        L_0x0247:
            boolean r0 = r11.equals(r3)
            if (r0 == 0) goto L_0x0309
            boolean r0 = r10.equals(r3)
            if (r0 == 0) goto L_0x0309
            if (r6 != 0) goto L_0x0309
            float r6 = r3.x
            float r12 = r2.x
            float r0 = r6 - r12
            float r5 = r3.y
            float r11 = r2.y
            float r2 = r5 - r11
            float r10 = r1.x
            float r10 = r10 - r6
            float r9 = r1.y
            float r9 = r9 - r5
            double r0 = (double) r0
            r22 = r0
            double r0 = (double) r2
            r2 = r22
            double r0 = java.lang.Math.hypot(r2, r0)
            float r2 = (float) r0
            r16 = r2
            double r0 = (double) r10
            r22 = r0
            double r0 = (double) r9
            r2 = r22
            double r0 = java.lang.Math.hypot(r2, r0)
            float r2 = (float) r0
            r3 = r2
            float r0 = r18 / r16
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = java.lang.Math.min(r0, r1)
            float r0 = r18 / r3
            float r1 = java.lang.Math.min(r0, r1)
            float r12 = r12 - r6
            float r12 = r12 * r2
            float r0 = r6 + r12
            float r11 = r11 - r5
            float r11 = r11 * r2
            float r3 = r5 + r11
            float r10 = r10 * r1
            float r2 = r6 + r10
            float r9 = r9 * r1
            float r16 = r5 + r9
            float r1 = r0 - r6
            r10 = 1057835346(0x3f0d4952, float:0.5519)
            float r1 = r1 * r10
            float r12 = r0 - r1
            float r1 = r3 - r5
            float r1 = r1 * r10
            float r9 = r3 - r1
            float r1 = r2 - r6
            float r1 = r1 * r10
            float r6 = r2 - r1
            float r1 = r16 - r5
            float r1 = r1 * r10
            float r5 = r16 - r1
            int r11 = r7 + -1
            int r10 = r14.size()
            int r1 = A00(r11, r10)
            int r1 = r1 * r10
            int r11 = r11 - r1
            java.lang.Object r11 = r14.get(r11)
            X.1vF r11 = (X.C40771vF) r11
            java.lang.Object r1 = r14.get(r7)
            X.1vF r1 = (X.C40771vF) r1
            android.graphics.PointF r10 = r11.A01
            r10.set(r0, r3)
            android.graphics.PointF r10 = r11.A02
            r10.set(r0, r3)
            if (r8 != 0) goto L_0x02e5
            android.graphics.PointF r10 = r13.A00
            if (r10 != 0) goto L_0x02e2
            android.graphics.PointF r10 = new android.graphics.PointF
            r10.<init>()
            r13.A00 = r10
        L_0x02e2:
            r10.set(r0, r3)
        L_0x02e5:
            android.graphics.PointF r3 = r1.A00
            r3.set(r12, r9)
            int r7 = r7 + 1
            java.lang.Object r3 = r14.get(r7)
            X.1vF r3 = (X.C40771vF) r3
            android.graphics.PointF r0 = r1.A01
            r0.set(r6, r5)
            android.graphics.PointF r1 = r1.A02
            r0 = r16
            r1.set(r2, r0)
            android.graphics.PointF r1 = r3.A00
            r1.set(r2, r0)
        L_0x0303:
            int r7 = r7 + 1
            int r8 = r8 + 1
            goto L_0x01fb
        L_0x0309:
            int r2 = r7 + -1
            int r1 = r14.size()
            int r0 = A00(r2, r1)
            int r0 = r0 * r1
            int r2 = r2 - r0
            java.lang.Object r6 = r14.get(r2)
            X.1vF r6 = (X.C40771vF) r6
            java.lang.Object r3 = r14.get(r7)
            X.1vF r3 = (X.C40771vF) r3
            android.graphics.PointF r0 = r9.A01
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.PointF r0 = r6.A01
            r0.set(r2, r1)
            android.graphics.PointF r0 = r9.A02
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.PointF r0 = r6.A02
            r0.set(r2, r1)
            android.graphics.PointF r0 = r5.A00
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.PointF r0 = r3.A00
            r0.set(r2, r1)
            goto L_0x0303
        L_0x0343:
            r6 = 0
            goto L_0x0247
        L_0x0346:
            android.graphics.PointF r3 = r9.A02
            if (r8 != 0) goto L_0x034e
            if (r17 != 0) goto L_0x034e
            goto L_0x0231
        L_0x034e:
            android.graphics.PointF r11 = r9.A01
            goto L_0x0232
        L_0x0352:
            r4 = r13
            goto L_0x012b
        L_0x0355:
            r0 = r24
            android.graphics.Path r7 = r0.A01
            r7.reset()
            android.graphics.PointF r2 = r4.A00
            float r1 = r2.x
            float r0 = r2.y
            r7.moveTo(r1, r0)
            android.graphics.PointF r3 = X.C40761vE.A00
            float r1 = r2.x
            float r0 = r2.y
            r3.set(r1, r0)
            r2 = 0
        L_0x036f:
            java.util.List r1 = r4.A02
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x03b0
            java.lang.Object r0 = r1.get(r2)
            X.1vF r0 = (X.C40771vF) r0
            android.graphics.PointF r6 = r0.A00
            android.graphics.PointF r1 = r0.A01
            android.graphics.PointF r5 = r0.A02
            boolean r0 = r6.equals(r3)
            if (r0 == 0) goto L_0x03a0
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x03a0
            float r1 = r5.x
            float r0 = r5.y
            r7.lineTo(r1, r0)
        L_0x0396:
            float r1 = r5.x
            float r0 = r5.y
            r3.set(r1, r0)
            int r2 = r2 + 1
            goto L_0x036f
        L_0x03a0:
            float r8 = r6.x
            float r9 = r6.y
            float r10 = r1.x
            float r11 = r1.y
            float r12 = r5.x
            float r13 = r5.y
            r7.cubicTo(r8, r9, r10, r11, r12, r13)
            goto L_0x0396
        L_0x03b0:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x03b7
            r7.close()
        L_0x03b7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass29I.A06(X.1up, float):java.lang.Object");
    }

    public AnonymousClass29I(List list) {
        super(list);
    }
}
