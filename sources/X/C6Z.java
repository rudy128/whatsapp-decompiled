package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public abstract class C6Z {
    public C24468C5i A00;
    public BFE A01;

    public void A00(Canvas canvas, Paint paint) {
        C23512Bib bib = (C23512Bib) this;
        int A04 = BEA.A04(bib.A00.A02, bib.A01.A01);
        AnonymousClass3MW.A1P(paint);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(A04);
        paint.setStrokeWidth(bib.A02);
        float f = bib.A00;
        float f2 = -f;
        RectF rectF = new RectF(f2, f2, f, f);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
    }

    public void A01(Canvas canvas, Paint paint, float f, float f2, int i) {
        float f3;
        C23512Bib bib = (C23512Bib) this;
        if (f != f2) {
            Paint paint2 = paint;
            AnonymousClass3MW.A1P(paint);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(bib.A02);
            float f4 = (float) bib.A03;
            float f5 = f * 360.0f * f4;
            if (f2 >= f) {
                f3 = f2 - f;
            } else {
                f3 = (1.0f + f2) - f;
            }
            float f6 = f3 * 360.0f * f4;
            float f7 = bib.A00;
            float f8 = -f7;
            canvas.drawArc(new RectF(f8, f8, f7, f7), f5, f6, false, paint2);
            if (bib.A01 > 0.0f && Math.abs(f6) < 360.0f) {
                C108945cZ.A1L(paint);
                float f9 = bib.A02;
                float f10 = bib.A01;
                canvas.save();
                canvas.rotate(f5);
                float f11 = bib.A00;
                float f12 = f9 / 2.0f;
                canvas.drawRoundRect(new RectF(f11 - f12, f10, f11 + f12, -f10), f10, f10, paint);
                canvas.restore();
                float f13 = bib.A02;
                float f14 = bib.A01;
                canvas.save();
                canvas.rotate(f5 + f6);
                float f15 = bib.A00;
                float f16 = f13 / 2.0f;
                canvas.drawRoundRect(new RectF(f15 - f16, f14, f15 + f16, -f14), f14, f14, paint);
                canvas.restore();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006a, code lost:
        if (r1 == false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.graphics.Canvas r10, android.graphics.Rect r11, float r12) {
        /*
            r9 = this;
            r2 = r9
            X.Bib r2 = (X.C23512Bib) r2
            float r8 = X.BE6.A02(r11)
            X.C5i r0 = r2.A00
            int r1 = r0.A07
            int r0 = r0.A06
            int r0 = r0 * 2
            int r1 = r1 + r0
            float r0 = (float) r1
            float r8 = r8 / r0
            int r0 = r11.height()
            float r7 = (float) r0
            X.C5i r3 = r2.A00
            int r4 = r3.A07
            int r1 = r3.A06
            int r0 = r1 * 2
            int r0 = r0 + r4
            float r0 = (float) r0
            float r7 = r7 / r0
            float r5 = (float) r4
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r0 = (float) r1
            float r5 = r5 + r0
            float r4 = r5 * r8
            float r1 = r5 * r7
            int r0 = r11.left
            float r0 = (float) r0
            float r4 = r4 + r0
            int r0 = r11.top
            float r0 = (float) r0
            float r1 = r1 + r0
            r10.translate(r4, r1)
            r10.scale(r8, r7)
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r10.rotate(r0)
            float r0 = -r5
            r10.clipRect(r0, r0, r5, r5)
            int r1 = r3.A05
            r5 = 1
            r0 = -1
            if (r1 != 0) goto L_0x004a
            r0 = 1
        L_0x004a:
            r2.A03 = r0
            int r1 = r3.A04
            float r0 = (float) r1
            float r0 = r0 * r12
            r2.A02 = r0
            int r0 = r3.A03
            float r0 = (float) r0
            float r0 = r0 * r12
            r2.A01 = r0
            int r0 = r3.A07
            int r0 = r0 - r1
            float r0 = (float) r0
            float r0 = r0 / r6
            r2.A00 = r0
            X.BFE r0 = r2.A01
            android.animation.ValueAnimator r0 = r0.A03
            if (r0 == 0) goto L_0x006c
            boolean r1 = r0.isRunning()
            r0 = 1
            if (r1 != 0) goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            r4 = 1065353216(0x3f800000, float:1.0)
            r1 = 2
            if (r0 == 0) goto L_0x0076
            int r0 = r3.A01
            if (r0 == r1) goto L_0x0086
        L_0x0076:
            X.BFE r0 = r2.A01
            android.animation.ValueAnimator r0 = r0.A02
            if (r0 == 0) goto L_0x0092
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0092
            int r0 = r3.A00
            if (r0 != r5) goto L_0x0092
        L_0x0086:
            float r1 = r2.A00
            float r4 = r4 - r12
            int r0 = r3.A04
            float r0 = (float) r0
            float r4 = r4 * r0
            float r4 = r4 / r6
            float r1 = r1 + r4
        L_0x008f:
            r2.A00 = r1
        L_0x0091:
            return
        L_0x0092:
            X.BFE r0 = r2.A01
            android.animation.ValueAnimator r0 = r0.A03
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x00a2
            int r0 = r3.A01
            if (r0 == r5) goto L_0x00b2
        L_0x00a2:
            X.BFE r0 = r2.A01
            android.animation.ValueAnimator r0 = r0.A02
            if (r0 == 0) goto L_0x0091
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0091
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0091
        L_0x00b2:
            float r1 = r2.A00
            float r4 = r4 - r12
            int r0 = r3.A04
            float r0 = (float) r0
            float r4 = r4 * r0
            float r4 = r4 / r6
            float r1 = r1 - r4
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6Z.A02(android.graphics.Canvas, android.graphics.Rect, float):void");
    }
}
