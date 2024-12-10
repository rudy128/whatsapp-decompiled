package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class BEw extends Drawable {
    public Paint A00;
    public Paint A01;
    public Drawable A02;
    public Rect A03;
    public final Context A04;
    public final Path A05 = C108945cZ.A0L();
    public final C25154Ca5 A06;

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        Paint paint = this.A01;
        if (paint != null) {
            canvas.drawPath(this.A05, paint);
        }
        Drawable drawable = this.A02;
        if (drawable != null) {
            Path path = this.A05;
            int save = canvas.save();
            canvas.clipPath(path);
            try {
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        Paint paint2 = this.A00;
        if (paint2 != null) {
            canvas.drawPath(this.A05, paint2);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r4.A02 == 0) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (android.graphics.Color.alpha(r4.A02) != 255) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getOpacity() {
        /*
            r5 = this;
            X.Ca5 r0 = r5.A06
            X.CbI r4 = r0.A00
            float r1 = r4.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0010
            int r0 = r4.A02
            r1 = 1
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            r3 = 1
            if (r1 == 0) goto L_0x001f
            int r0 = r4.A02
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 == r0) goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            android.graphics.drawable.Drawable r0 = r4.A03
            r1 = -1
            if (r0 == 0) goto L_0x0030
            int r0 = r0.getOpacity()
            if (r0 != r1) goto L_0x0030
        L_0x002b:
            if (r2 == 0) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            return r1
        L_0x0030:
            r3 = 0
            goto L_0x002b
        L_0x0032:
            r1 = -3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BEw.getOpacity():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01fd, code lost:
        if (r4 == r17) goto L_0x01ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBoundsChange(android.graphics.Rect r31) {
        /*
            r30 = this;
            r24 = 0
            r1 = r31
            r0 = r24
            X.C18070vi.A0d(r1, r0)
            r29 = r30
            r0 = r29
            super.onBoundsChange(r1)
            android.graphics.Rect r0 = r0.A03
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 != 0) goto L_0x0234
            r0 = r29
            r0.A03 = r1
            X.Ca5 r1 = r0.A06
            android.graphics.Path r0 = r0.A05
            r28 = r0
            X.CbI r0 = r1.A00
            r27 = r0
            float r0 = r0.A01
            r23 = r0
            X.CbA r6 = r1.A01
            android.graphics.RectF r0 = r6.A01
            r26 = r0
            X.Bza r5 = r6.A04
            X.Bzf r0 = r6.A03
            r25 = r0
            r4 = 1
            r0 = r26
            X.C18070vi.A0d(r0, r4)
            android.graphics.Path r22 = X.C108945cZ.A0L()
            r0 = 8
            X.1D6[] r11 = new X.AnonymousClass1D6[r0]
            X.Bza r3 = X.C24339Bza.TOP
            X.Bzf r16 = X.C24344Bzf.EDGE_LEFT
            r0 = r16
            X.1D6 r1 = X.AnonymousClass1D6.A01(r3, r0)
            r21 = 6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r21)
            r20 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r7, r2)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r1, r0)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r24)
            r11[r24] = r0
            X.Bzf r18 = X.C24344Bzf.EDGE_RIGHT
            r0 = r18
            X.1D6 r1 = X.AnonymousClass1D6.A01(r3, r0)
            r10 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r9 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r12, r8)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r1, r0)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            r11[r4] = r0
            X.Bza r1 = X.C24339Bza.RIGHT
            X.Bzf r13 = X.C24344Bzf.EDGE_TOP
            X.1D6 r3 = X.AnonymousClass1D6.A01(r1, r13)
            r0 = r19
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r14)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r3, r0)
            r3 = 2
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            r11[r3] = r0
            X.Bzf r17 = X.C24344Bzf.EDGE_BOTTOM
            r0 = r17
            X.1D6 r1 = X.AnonymousClass1D6.A01(r1, r0)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r7, r2)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r1, r0)
            r2 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r11[r2] = r0
            X.Bza r1 = X.C24339Bza.BOTTOM
            r0 = r16
            X.1D6 r16 = X.AnonymousClass1D6.A01(r1, r0)
            r0 = r19
            X.1D6 r14 = X.AnonymousClass1D6.A01(r0, r14)
            r0 = r16
            X.AnonymousClass1D6.A03(r0, r14, r11, r10)
            r0 = r18
            X.1D6 r1 = X.AnonymousClass1D6.A01(r1, r0)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r15, r7)
            X.AnonymousClass1D6.A03(r1, r0, r11, r9)
            X.Bza r1 = X.C24339Bza.LEFT
            X.1D6 r13 = X.AnonymousClass1D6.A01(r1, r13)
            X.1D6 r7 = X.AnonymousClass1D6.A01(r15, r7)
            r0 = r21
            X.AnonymousClass1D6.A03(r13, r7, r11, r0)
            r0 = r17
            X.1D6 r7 = X.AnonymousClass1D6.A01(r1, r0)
            X.1D6 r1 = X.AnonymousClass1D6.A01(r12, r8)
            r0 = r20
            X.AnonymousClass1D6.A03(r7, r1, r11, r0)
            java.util.HashMap r1 = X.AnonymousClass1D7.A07(r11)
            r0 = 8
            float[] r8 = new float[r0]
            r8[r24] = r23
            r8[r4] = r23
            r8[r3] = r23
            r8[r2] = r23
            r8[r10] = r23
            r8[r9] = r23
            r8[r21] = r23
            r8[r20] = r23
            int r0 = r25.ordinal()
            if (r0 == r3) goto L_0x0131
            if (r0 == r2) goto L_0x0131
            r0 = r25
            X.1D6 r0 = X.AnonymousClass1D6.A01(r5, r0)
            java.lang.Object r0 = r1.get(r0)
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            if (r0 == 0) goto L_0x0131
            int r7 = X.AnonymousClass3MZ.A04(r0)
            int r1 = X.C108955ca.A09(r0)
            r0 = 0
            r8[r7] = r0
            r8[r1] = r0
        L_0x0131:
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CCW
            r1 = r22
            r0 = r26
            r1.addRoundRect(r0, r8, r7)
            r1 = r28
            r0 = r22
            r1.set(r0)
            r0 = r29
            android.content.Context r7 = r0.A04
            android.graphics.RectF r6 = r6.A00
            r0 = r27
            java.lang.Integer r1 = r0.A05
            r0 = r24
            X.C18070vi.A0d(r7, r0)
            X.C18070vi.A0d(r6, r4)
            int r1 = r1.intValue()
            if (r1 == r3) goto L_0x0215
            if (r1 == r0) goto L_0x0398
            if (r1 != r4) goto L_0x03a4
            X.BNI r1 = new X.BNI
            r0 = r25
            r1.<init>(r7, r6, r0, r5)
        L_0x0164:
            boolean r0 = r1 instanceof X.BNI
            if (r0 == 0) goto L_0x02ed
            X.BNI r1 = (X.BNI) r1
            X.Bzf r4 = r1.A02
            int r0 = r4.ordinal()
            if (r0 == r3) goto L_0x0237
            if (r0 == r2) goto L_0x0237
            android.content.Context r3 = r1.A00
            android.graphics.Path r8 = X.C108945cZ.A0L()
            android.graphics.RectF r2 = r1.A01
            float r5 = r2.width()
            r0 = 0
            r8.moveTo(r5, r0)
            r5 = 1100195529(0x4193a6c9, float:18.456438)
            float r9 = X.C25342Ce1.A00(r3, r5)
            r5 = 1057698238(0x3f0b31be, float:0.54372776)
            float r10 = X.C25342Ce1.A00(r3, r5)
            r5 = 1099120798(0x4183409e, float:16.406551)
            float r11 = X.C25342Ce1.A00(r3, r5)
            r5 = 1073884914(0x40022ef2, float:2.0341153)
            float r12 = X.C25342Ce1.A00(r3, r5)
            r5 = 1097338737(0x41680f71, float:14.50377)
            float r13 = X.C25342Ce1.A00(r3, r5)
            r5 = 1080130887(0x40617d47, float:3.5232713)
            float r14 = X.C25342Ce1.A00(r3, r5)
            r8.cubicTo(r9, r10, r11, r12, r13, r14)
            r5 = 1085068990(0x40acd6be, float:5.4012136)
            float r6 = X.C25342Ce1.A00(r3, r5)
            r5 = 1093602135(0x412f0b57, float:10.9402685)
            float r5 = X.C25342Ce1.A00(r3, r5)
            r8.lineTo(r6, r5)
            r5 = 1079508673(0x4057fec1, float:3.374924)
            float r9 = X.C25342Ce1.A00(r3, r5)
            r5 = 1096004422(0x4153b346, float:13.231268)
            float r10 = X.C25342Ce1.A00(r3, r5)
            r5 = -1123573603(0xffffffffbd07a09d, float:-0.033112157)
            float r11 = X.C25342Ce1.A00(r3, r5)
            r5 = 1094252252(0x4138f6dc, float:11.560268)
            float r12 = X.C25342Ce1.A00(r3, r5)
            r5 = 1090825507(0x4104ad23, float:8.29227)
            float r14 = X.C25342Ce1.A00(r3, r5)
            r13 = r0
            r8.cubicTo(r9, r10, r11, r12, r13, r14)
            r8.lineTo(r0, r0)
            float r3 = r2.width()
            r8.lineTo(r3, r0)
            r8.close()
            r0 = r18
            if (r4 == r0) goto L_0x01ff
            r3 = 0
            r0 = r17
            if (r4 != r0) goto L_0x0200
        L_0x01ff:
            r3 = 1
        L_0x0200:
            android.graphics.Matrix r3 = X.BNI.A00(r1, r3)
        L_0x0204:
            float r1 = r2.left
            float r0 = r2.top
            r3.postTranslate(r1, r0)
            r8.transform(r3)
        L_0x020e:
            android.graphics.Path$Op r1 = android.graphics.Path.Op.UNION
            r0 = r28
            r0.op(r8, r1)
        L_0x0215:
            android.graphics.RectF r3 = X.AnonymousClass3MW.A08()
            r1 = r28
            r0 = r24
            r1.computeBounds(r3, r0)
            android.graphics.Rect r2 = X.AnonymousClass3MW.A07()
            r3.round(r2)
            r0 = r27
            android.graphics.drawable.Drawable r1 = r0.A03
            if (r1 == 0) goto L_0x0235
            r1.setBounds(r2)
        L_0x0230:
            r0 = r29
            r0.A02 = r1
        L_0x0234:
            return
        L_0x0235:
            r1 = 0
            goto L_0x0230
        L_0x0237:
            android.content.Context r0 = r1.A00
            android.graphics.Path r8 = X.C108945cZ.A0L()
            android.graphics.RectF r2 = r1.A01
            float r5 = r2.width()
            r3 = 0
            r8.moveTo(r5, r3)
            r3 = 1101928553(0x41ae1869, float:21.761919)
            float r9 = X.C25342Ce1.A00(r0, r3)
            r3 = 1100286926(0x41950bce, float:18.630764)
            float r11 = X.C25342Ce1.A00(r0, r3)
            r3 = 1070664146(0x3fd109d2, float:1.6331122)
            float r12 = X.C25342Ce1.A00(r0, r3)
            r3 = 1099313212(0x4186303c, float:16.773552)
            float r13 = X.C25342Ce1.A00(r0, r3)
            r3 = 1080278157(0x4063bc8d, float:3.5583832)
            float r14 = X.C25342Ce1.A00(r0, r3)
            r10 = 0
            r8.cubicTo(r9, r10, r11, r12, r13, r14)
            r3 = 1088742272(0x40e4e380, float:7.152771)
            float r5 = X.C25342Ce1.A00(r0, r3)
            r3 = 1093225300(0x41294b54, float:10.580891)
            float r3 = X.C25342Ce1.A00(r0, r3)
            r8.lineTo(r5, r3)
            r3 = 1083606066(0x40968432, float:4.703637)
            float r9 = X.C25342Ce1.A00(r0, r3)
            r3 = 1095889401(0x4151f1f9, float:13.121575)
            float r10 = X.C25342Ce1.A00(r0, r3)
            r3 = 1068484091(0x3fafc5fb, float:1.3732294)
            float r11 = X.C25342Ce1.A00(r0, r3)
            r3 = 1094950089(0x41439cc9, float:12.225778)
            float r12 = X.C25342Ce1.A00(r0, r3)
            r3 = 1068484091(0x3fafc5fb, float:1.3732294)
            float r13 = X.C25342Ce1.A00(r0, r3)
            r3 = 1090617917(0x4101823d, float:8.094296)
            float r14 = X.C25342Ce1.A00(r0, r3)
            r8.cubicTo(r9, r10, r11, r12, r13, r14)
            r3 = 1068484091(0x3fafc5fb, float:1.3732294)
            float r5 = X.C25342Ce1.A00(r0, r3)
            r3 = 1074099317(0x40057475, float:2.085233)
            float r3 = X.C25342Ce1.A00(r0, r3)
            r8.lineTo(r5, r3)
            r3 = 1068484091(0x3fafc5fb, float:1.3732294)
            float r9 = X.C25342Ce1.A00(r0, r3)
            r3 = 1066951682(0x3f986402, float:1.190552)
            float r10 = X.C25342Ce1.A00(r0, r3)
            r3 = 1062766946(0x3f588962, float:0.8458463)
            float r11 = X.C25342Ce1.A00(r0, r3)
            r3 = 1054343040(0x3ed7ff80, float:0.4218712)
            float r12 = X.C25342Ce1.A00(r0, r3)
            r13 = 0
            r14 = r13
            r8.cubicTo(r9, r10, r11, r12, r13, r14)
            r8.close()
            X.Bzf r0 = X.C24344Bzf.INSET_RIGHT
            boolean r0 = X.AnonymousClass000.A1Z(r4, r0)
            android.graphics.Matrix r3 = X.BNI.A00(r1, r0)
            goto L_0x0204
        L_0x02ed:
            X.BNH r1 = (X.BNH) r1
            android.content.Context r6 = r1.A00
            android.graphics.Path r8 = X.C108945cZ.A0L()
            r0 = 0
            r8.moveTo(r0, r0)
            r5 = 1082130432(0x40800000, float:4.0)
            float r9 = X.C25342Ce1.A00(r6, r5)
            float r10 = X.C25342Ce1.A00(r6, r0)
            r5 = 1090139455(0x40fa353f, float:7.819)
            float r11 = X.C25342Ce1.A00(r6, r5)
            android.graphics.RectF r5 = r1.A01
            float r12 = r5.height()
            r7 = 1093140480(0x41280000, float:10.5)
            float r13 = X.C25342Ce1.A00(r6, r7)
            float r14 = r5.height()
            r8.cubicTo(r9, r10, r11, r12, r13, r14)
            r7 = 1095952237(0x4152e76d, float:13.1815)
            float r9 = X.C25342Ce1.A00(r6, r7)
            float r10 = r5.height()
            r7 = 1099432198(0x41880106, float:17.0005)
            float r11 = X.C25342Ce1.A00(r6, r7)
            float r13 = r5.width()
            r14 = r0
            r12 = r0
            r8.cubicTo(r9, r10, r11, r12, r13, r14)
            r8.lineTo(r0, r0)
            r8.close()
            X.Bza r1 = r1.A02
            int r6 = r1.ordinal()
            r1 = r24
            if (r6 == r1) goto L_0x0393
            if (r6 == r2) goto L_0x0382
            if (r6 == r4) goto L_0x036a
            if (r6 != r3) goto L_0x039f
            android.graphics.Matrix r4 = X.C108945cZ.A0J()
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4.postRotate(r1, r0, r0)
            float r1 = r5.width()
            r4.postTranslate(r0, r1)
        L_0x035e:
            float r1 = r5.left
            float r0 = r5.top
            r4.postTranslate(r1, r0)
            r8.transform(r4)
            goto L_0x020e
        L_0x036a:
            android.graphics.Matrix r4 = X.C108945cZ.A0J()
            float r3 = r5.width()
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            float r2 = r5.height()
            float r2 = r2 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.postScale(r1, r0, r3, r2)
            goto L_0x035e
        L_0x0382:
            android.graphics.Matrix r4 = X.C108945cZ.A0J()
            r1 = 1119092736(0x42b40000, float:90.0)
            r4.postRotate(r1, r0, r0)
            float r1 = r5.height()
            r4.postTranslate(r1, r0)
            goto L_0x035e
        L_0x0393:
            android.graphics.Matrix r4 = X.C108945cZ.A0J()
            goto L_0x035e
        L_0x0398:
            X.BNH r1 = new X.BNH
            r1.<init>(r7, r6, r5)
            goto L_0x0164
        L_0x039f:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x03a4:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BEw.onBoundsChange(android.graphics.Rect):void");
    }

    public BEw(Context context, C25154Ca5 ca5) {
        int i;
        int i2;
        this.A04 = context;
        this.A06 = ca5;
        C25222CbI cbI = ca5.A00;
        float f = cbI.A00;
        if (!(f == 0.0f || (i2 = cbI.A02) == 0)) {
            Paint A0K = C108945cZ.A0K(5);
            AnonymousClass3MW.A1P(A0K);
            A0K.setStrokeWidth(f);
            A0K.setColor(i2);
            this.A00 = A0K;
        }
        C25196Can can = cbI.A04;
        if (can != null) {
            float f2 = can.A02;
            if (f2 != 0.0f && (i = can.A03) != 0) {
                Paint A0K2 = C108945cZ.A0K(5);
                C108945cZ.A1L(A0K2);
                A0K2.setColor(i);
                A0K2.setShadowLayer(f2, can.A00, can.A01, i);
                this.A01 = A0K2;
            }
        }
    }
}
