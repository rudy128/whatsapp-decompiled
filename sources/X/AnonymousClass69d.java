package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: X.69d  reason: invalid class name */
public final class AnonymousClass69d extends C1409773u {
    public final PointF A00;
    public final PointF A01;
    public final RectF A02;
    public final PointF[] A03;
    public final Paint A04;
    public final Path A05 = C108945cZ.A0L();
    public final RectF A06;

    public void A0O(RectF rectF, float f, float f2, float f3, float f4) {
        C18070vi.A0d(rectF, 0);
        float f5 = (f2 + f4) / 2.0f;
        float f6 = ((2.0f * (f3 - f)) / 3.0f) / 2.0f;
        float f7 = f5 - f6;
        float f8 = f5 + f6;
        super.A0O(rectF, f, f7, f3, f8);
    }

    public static void A02(PointF pointF, RectF rectF) {
        pointF.y = rectF.top + rectF.height();
    }

    public static void A03(RectF rectF, PointF[] pointFArr, int i) {
        pointFArr[i].x = rectF.left + rectF.width();
    }

    public static void A04(RectF rectF, PointF[] pointFArr, int i, int i2) {
        pointFArr[i].x = rectF.left + rectF.width();
        pointFArr[i].y = rectF.top + rectF.height();
        PointF pointF = pointFArr[i2];
        pointF.x = rectF.left;
        pointF.y = rectF.top + rectF.height();
    }

    public static void A05(RectF rectF, PointF[] pointFArr, int i, int i2) {
        PointF pointF = pointFArr[i];
        float f = rectF.left;
        pointF.x = f;
        pointF.y = rectF.top;
        pointFArr[i2].x = f + rectF.width();
        pointFArr[i2].y = rectF.top;
    }

    public void A0J(float f) {
        super.A0J((2.0f * f) / 3.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r7 = r18
            r6 = r19
            android.graphics.RectF r4 = X.C1409773u.A06(r7, r6)
            android.graphics.Path r5 = r7.A05
            r5.reset()
            float r10 = r4.centerX()
            float r0 = r7.A02
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r2 = java.lang.Math.cos(r0)
            float r0 = r4.width()
            double r0 = (double) r0
            double r2 = r2 * r0
            r0 = 4606281698659794944(0x3fecccccc0000000, double:0.8999999761581421)
            double r2 = r2 * r0
            float r0 = (float) r2
            float r10 = r10 + r0
            float r11 = r4.centerY()
            float r0 = r7.A02
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r2 = java.lang.Math.sin(r0)
            float r0 = r4.height()
            double r0 = (double) r0
            double r2 = r2 * r0
            r0 = 4606281698659794944(0x3fecccccc0000000, double:0.8999999761581421)
            double r2 = r2 * r0
            float r0 = (float) r2
            float r11 = r11 + r0
            android.graphics.RectF r8 = r7.A06
            r8.set(r4)
            float r0 = r8.left
            float r1 = r10 - r0
            float r2 = r8.width()
            r12 = 2
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r1 = r1 - r2
            float r0 = r8.top
            float r17 = r11 - r0
            float r2 = r8.height()
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r17 = r17 - r2
            float r14 = r8.height()
            float r0 = r8.width()
            float r14 = r14 / r0
            float r3 = r8.width()
            r9 = 6
            r2 = 1086324736(0x40c00000, float:6.0)
            float r3 = r3 / r2
            float r0 = r8.height()
            float r16 = X.C108945cZ.A01(r0, r2, r3)
            r15 = 1073741824(0x40000000, float:2.0)
            float r15 = r15 * r16
            android.graphics.PointF[] r4 = r7.A03
            r0 = 0
            r0 = r4[r0]
            r0.x = r10
            r0.y = r11
            r11 = 5
            r13 = 1
            r10 = 4
            r2 = 3
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0242
            int r0 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0242
            float r0 = -r1
            float r0 = r0 * r14
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            r14 = r4[r13]
            if (r0 >= 0) goto L_0x0224
            float r1 = r8.left
            r0 = 1073741824(0x40000000, float:2.0)
            float r14 = A01(r14, r8, r0, r1)
            r0 = r4[r13]
            A02(r0, r8)
            r1 = r4[r12]
            float r0 = r8.left
            r1.x = r0
            A02(r1, r8)
            A05(r8, r4, r2, r10)
            A03(r8, r4, r11)
            r0 = r4[r11]
            A02(r0, r8)
            r10 = r4[r9]
            float r2 = r8.left
            r1 = 1077936128(0x40400000, float:3.0)
        L_0x00c8:
            float r0 = r8.width()
            float r1 = r1 * r0
            float r1 = r1 / r14
            float r2 = r2 + r1
            r10.x = r2
            r9 = r4[r9]
            float r2 = r8.top
            float r1 = r8.height()
        L_0x00d9:
            float r2 = r2 + r1
        L_0x00da:
            r9.y = r2
        L_0x00dc:
            r0 = 0
            r0 = r4[r0]
            float r1 = r0.x
            float r0 = r0.y
            r5.moveTo(r1, r0)
            r9 = 0
        L_0x00e7:
            r2 = 7
            if (r9 >= r2) goto L_0x0374
            android.graphics.PointF r13 = r7.A00
            r0 = r4[r9]
            float r1 = r0.x
            float r0 = r0.y
            r13.set(r1, r0)
            android.graphics.PointF r10 = r7.A01
            int r0 = r9 + 1
            int r0 = r0 % r2
            r0 = r4[r0]
            float r1 = r0.x
            float r0 = r0.y
            r10.set(r1, r0)
            float r11 = r13.x
            float r0 = r8.left
            r14 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x012a
            float r12 = r13.y
            float r0 = r8.top
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x012a
            float r1 = r11 + r15
            float r0 = r12 + r15
            android.graphics.RectF r2 = r7.A02
            r2.set(r11, r12, r1, r0)
            r1 = 1127481344(0x43340000, float:180.0)
            r0 = 0
            r5.arcTo(r2, r1, r14, r0)
            float r11 = r13.x
            float r11 = r11 + r16
            r13.x = r11
        L_0x012a:
            float r0 = r10.x
            float r2 = r8.left
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x013e
            float r1 = r10.y
            float r0 = r8.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x013e
            float r1 = r1 + r16
            r10.y = r1
        L_0x013e:
            float r0 = r8.width()
            float r2 = r2 + r0
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0166
            float r12 = r13.y
            float r0 = r8.top
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0166
            float r11 = r13.x
            float r1 = r11 - r15
            float r0 = r12 + r15
            android.graphics.RectF r2 = r7.A02
            r2.set(r1, r12, r11, r0)
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r0 = 0
            r5.arcTo(r2, r1, r14, r0)
            float r0 = r13.y
            float r0 = r0 + r16
            r13.y = r0
        L_0x0166:
            float r2 = r10.x
            float r1 = r8.left
            float r0 = r8.width()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0181
            float r1 = r10.y
            float r0 = r8.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0181
            float r0 = r10.x
            float r0 = r0 - r16
            r10.x = r0
        L_0x0181:
            float r2 = r13.x
            float r1 = r8.left
            float r0 = r8.width()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01b2
            float r2 = r13.y
            float r1 = r8.top
            float r0 = r8.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01b2
            float r12 = r13.x
            float r11 = r12 - r15
            float r2 = r13.y
            float r0 = r2 - r15
            android.graphics.RectF r1 = r7.A02
            r1.set(r11, r0, r12, r2)
            r0 = 0
            r5.arcTo(r1, r3, r14, r0)
            float r0 = r13.x
            float r0 = r0 - r16
            r13.x = r0
        L_0x01b2:
            float r2 = r10.x
            float r1 = r8.left
            float r0 = r8.width()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01d2
            float r2 = r10.y
            float r1 = r8.top
            float r0 = r8.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01d2
            float r0 = r10.y
            float r0 = r0 - r16
            r10.y = r0
        L_0x01d2:
            float r1 = r13.x
            float r0 = r8.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01fe
            float r2 = r13.y
            float r1 = r8.top
            float r0 = r8.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01fe
            float r12 = r13.x
            float r11 = r13.y
            float r2 = r11 - r15
            float r0 = r12 + r15
            android.graphics.RectF r1 = r7.A02
            r1.set(r12, r2, r0, r11)
            r0 = 0
            r5.arcTo(r1, r14, r14, r0)
            float r0 = r13.y
            float r0 = r0 - r16
            r13.y = r0
        L_0x01fe:
            float r1 = r10.x
            float r0 = r8.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0219
            float r2 = r10.y
            float r1 = r8.top
            float r0 = r8.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0219
            float r0 = r10.x
            float r0 = r0 + r16
            r10.x = r0
        L_0x0219:
            float r1 = r10.x
            float r0 = r10.y
            r5.lineTo(r1, r0)
            int r9 = r9 + 1
            goto L_0x00e7
        L_0x0224:
            float r0 = r8.left
            r14.x = r0
            float r1 = r8.top
            r0 = 1077936128(0x40400000, float:3.0)
            float r13 = A00(r14, r8, r0, r1)
            A05(r8, r4, r12, r2)
            A04(r8, r4, r10, r11)
            r9 = r4[r9]
            float r0 = r8.left
            r9.x = r0
            float r2 = r8.top
            r1 = 1082130432(0x40800000, float:4.0)
            goto L_0x0354
        L_0x0242:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0298
            int r0 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0298
            float r1 = r1 * r14
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            r14 = r4[r13]
            float r1 = r8.left
            if (r0 >= 0) goto L_0x027a
            r0 = 1077936128(0x40400000, float:3.0)
            float r14 = A01(r14, r8, r0, r1)
            r0 = r4[r13]
            A02(r0, r8)
            r1 = r4[r12]
            float r0 = r8.left
            r1.x = r0
            A02(r1, r8)
            A05(r8, r4, r2, r10)
            A03(r8, r4, r11)
            r0 = r4[r11]
            A02(r0, r8)
            r10 = r4[r9]
            float r2 = r8.left
            r1 = 1082130432(0x40800000, float:4.0)
            goto L_0x00c8
        L_0x027a:
            float r0 = r8.width()
            float r1 = r1 + r0
            r14.x = r1
            r13 = r4[r13]
            float r1 = r8.top
            r0 = 1082130432(0x40800000, float:4.0)
            float r13 = A00(r13, r8, r0, r1)
            A04(r8, r4, r12, r2)
            A05(r8, r4, r10, r11)
            A03(r8, r4, r9)
            r9 = r4[r9]
            goto L_0x0350
        L_0x0298:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x02de
            int r0 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x02de
            float r1 = r1 * r14
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            r14 = r4[r13]
            if (r0 < 0) goto L_0x0338
            float r1 = r8.left
            r0 = 1077936128(0x40400000, float:3.0)
            float r14 = A01(r14, r8, r0, r1)
            r1 = r4[r13]
            float r0 = r8.top
            r1.y = r0
            A03(r8, r4, r12)
            r1 = r4[r12]
            float r0 = r8.top
            r1.y = r0
            A04(r8, r4, r2, r10)
            r1 = r4[r11]
            float r10 = r8.left
            r1.x = r10
            float r0 = r8.top
            r1.y = r0
            r2 = r4[r9]
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x02cf:
            float r0 = r8.width()
            float r1 = r1 * r0
            float r1 = r1 / r14
            float r10 = r10 + r1
            r2.x = r10
            r9 = r4[r9]
            float r2 = r8.top
            goto L_0x00da
        L_0x02de:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x035c
            int r0 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x035c
            float r0 = -r1
            float r0 = r0 * r14
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            r14 = r4[r13]
            float r1 = r8.left
            if (r0 < 0) goto L_0x0317
            r0 = 1082130432(0x40800000, float:4.0)
            float r14 = A01(r14, r8, r0, r1)
            r1 = r4[r13]
            float r0 = r8.top
            r1.y = r0
            A03(r8, r4, r12)
            r1 = r4[r12]
            float r0 = r8.top
            r1.y = r0
            A04(r8, r4, r2, r10)
            r1 = r4[r11]
            float r10 = r8.left
            r1.x = r10
            float r0 = r8.top
            r1.y = r0
            r2 = r4[r9]
            r1 = 1077936128(0x40400000, float:3.0)
            goto L_0x02cf
        L_0x0317:
            float r0 = r8.width()
            float r1 = r1 + r0
            r14.x = r1
            r13 = r4[r13]
            float r1 = r8.top
            r0 = 1077936128(0x40400000, float:3.0)
            float r13 = A00(r13, r8, r0, r1)
            A04(r8, r4, r12, r2)
            A05(r8, r4, r10, r11)
            A03(r8, r4, r9)
            r9 = r4[r9]
            float r2 = r8.top
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0354
        L_0x0338:
            float r0 = r8.left
            r14.x = r0
            float r1 = r8.top
            r0 = 1073741824(0x40000000, float:2.0)
            float r13 = A00(r14, r8, r0, r1)
            A05(r8, r4, r12, r2)
            A04(r8, r4, r10, r11)
            r9 = r4[r9]
            float r0 = r8.left
            r9.x = r0
        L_0x0350:
            float r2 = r8.top
            r1 = 1077936128(0x40400000, float:3.0)
        L_0x0354:
            float r0 = r8.height()
            float r1 = r1 * r0
            float r1 = r1 / r13
            goto L_0x00d9
        L_0x035c:
            A05(r8, r4, r13, r12)
            A04(r8, r4, r2, r10)
            r0 = r4[r11]
            float r2 = r8.left
            r0.x = r2
            float r1 = r8.top
            r0.y = r1
            r0 = r4[r9]
            r0.x = r2
            r0.y = r1
            goto L_0x00dc
        L_0x0374:
            android.graphics.Paint r0 = r7.A04
            r6.drawPath(r5, r0)
            android.graphics.Paint r0 = r7.A05
            r6.drawPath(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69d.A0M(android.graphics.Canvas):void");
    }

    public AnonymousClass69d() {
        Paint A0K = C108945cZ.A0K(1);
        this.A04 = A0K;
        this.A06 = AnonymousClass3MW.A08();
        this.A03 = new PointF[]{new PointF(), new PointF(), new PointF(), new PointF(), new PointF(), new PointF(), new PointF()};
        this.A02 = AnonymousClass3MW.A08();
        this.A00 = new PointF();
        this.A01 = new PointF();
        this.A02 = 110.0f;
        C108945cZ.A1L(A0K);
        A0K.setColor(-31);
        AnonymousClass3MW.A1P(this.A05);
    }

    public static float A00(PointF pointF, RectF rectF, float f, float f2) {
        pointF.y = f2 + ((f * rectF.height()) / 6.0f);
        return 6.0f;
    }

    public static float A01(PointF pointF, RectF rectF, float f, float f2) {
        pointF.x = f2 + ((f * rectF.width()) / 6.0f);
        return 6.0f;
    }
}
