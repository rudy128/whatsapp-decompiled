package X;

import android.graphics.Matrix;

/* renamed from: X.6p8  reason: invalid class name */
public final class AnonymousClass6p8 {
    public final Matrix A00 = C108945cZ.A0J();
    public final C1405671z A01;
    public final float[] A02 = C108945cZ.A1V();

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PointF A00(android.graphics.PointF r10) {
        /*
            r9 = this;
            r8 = 0
            X.71z r4 = r9.A01
            android.graphics.RectF r7 = r4.A08
            android.graphics.RectF r6 = r4.A07
            if (r7 == 0) goto L_0x00a4
            if (r6 == 0) goto L_0x00a4
            float[] r3 = r9.A02
            float r2 = r10.x
            float r1 = r7.left
            float r0 = r6.left
            float r1 = r1 - r0
            float r2 = r2 - r1
            float r5 = r4.A00
            float r2 = r2 * r5
            r3[r8] = r2
            float r2 = r10.y
            float r1 = r7.top
            float r0 = r6.top
            float r1 = r1 - r0
            float r2 = r2 - r1
            float r2 = r2 * r5
            r6 = 1
            r3[r6] = r2
            android.graphics.Matrix r5 = r9.A00
            r5.reset()
            int r1 = r4.A02
            r0 = 90
            r2 = 0
            if (r1 == r0) goto L_0x004f
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L_0x0058
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 == r0) goto L_0x0043
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0043:
            android.graphics.RectF r0 = r4.A0B
            float r0 = r0.height()
            int r0 = (int) r0
            float r0 = (float) r0
            r5.preTranslate(r2, r0)
            goto L_0x0069
        L_0x004f:
            android.graphics.RectF r0 = r4.A0B
            float r0 = r0.width()
            int r0 = (int) r0
            float r1 = (float) r0
            goto L_0x0066
        L_0x0058:
            android.graphics.RectF r2 = r4.A0B
            float r0 = r2.width()
            int r0 = (int) r0
            float r1 = (float) r0
            float r0 = r2.height()
            int r0 = (int) r0
            float r2 = (float) r0
        L_0x0066:
            r5.preTranslate(r1, r2)
        L_0x0069:
            int r0 = r4.A02
            float r0 = (float) r0
            r5.preRotate(r0)
            r5.mapPoints(r3)
            r1 = r3[r8]
            android.graphics.RectF r5 = r4.A0B
            float r0 = r5.left
            float r1 = r1 + r0
            r2 = r3[r6]
            float r0 = r5.top
            float r2 = r2 + r0
            android.graphics.Rect r3 = r4.A06
            if (r3 == 0) goto L_0x009e
            int r0 = r3.left
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = r4.A04
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = r3.width()
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = r3.top
            float r0 = (float) r0
            float r2 = r2 - r0
            int r0 = r4.A03
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = r3.height()
            float r0 = (float) r0
            float r2 = r2 / r0
        L_0x009e:
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r1, r2)
            return r0
        L_0x00a4:
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6p8.A00(android.graphics.PointF):android.graphics.PointF");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PointF A01(X.AnonymousClass69K r10, float r11, float r12) {
        /*
            r9 = this;
            X.71z r2 = r9.A01
            android.graphics.RectF r6 = r2.A08
            android.graphics.RectF r3 = r2.A07
            if (r6 == 0) goto L_0x00f8
            if (r3 == 0) goto L_0x00f8
            android.graphics.Matrix r5 = r9.A00
            r5.reset()
            int r0 = r2.A02
            float r0 = (float) r0
            float r0 = -r0
            r5.preRotate(r0)
            int r1 = r2.A02
            r0 = 90
            r4 = 0
            if (r1 == r0) goto L_0x003b
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L_0x0045
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 == r0) goto L_0x002e
            if (r1 == 0) goto L_0x0058
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x002e:
            android.graphics.RectF r0 = r2.A0B
            float r0 = r0.height()
            int r0 = (int) r0
            float r0 = (float) r0
            float r0 = -r0
            r5.preTranslate(r4, r0)
            goto L_0x0058
        L_0x003b:
            android.graphics.RectF r0 = r2.A0B
            float r0 = r0.width()
            int r0 = (int) r0
            float r0 = (float) r0
            float r1 = -r0
            goto L_0x0055
        L_0x0045:
            android.graphics.RectF r4 = r2.A0B
            float r0 = r4.width()
            int r0 = (int) r0
            float r0 = (float) r0
            float r1 = -r0
            float r0 = r4.height()
            int r0 = (int) r0
            float r0 = (float) r0
            float r4 = -r0
        L_0x0055:
            r5.preTranslate(r1, r4)
        L_0x0058:
            android.graphics.Rect r1 = r2.A06
            if (r1 == 0) goto L_0x0078
            int r0 = r1.width()
            float r0 = (float) r0
            float r11 = r11 * r0
            int r0 = r2.A04
            float r0 = (float) r0
            float r11 = r11 / r0
            int r0 = r1.left
            float r0 = (float) r0
            float r11 = r11 + r0
            int r0 = r1.height()
            float r0 = (float) r0
            float r12 = r12 * r0
            int r0 = r2.A03
            float r0 = (float) r0
            float r12 = r12 / r0
            int r0 = r1.top
            float r0 = (float) r0
            float r12 = r12 + r0
        L_0x0078:
            float[] r4 = r9.A02
            android.graphics.RectF r1 = r2.A0B
            float r0 = r1.left
            float r11 = r11 - r0
            r8 = 0
            r4[r8] = r11
            float r0 = r1.top
            float r12 = r12 - r0
            r7 = 1
            r4[r7] = r12
            r5.mapPoints(r4)
            if (r10 != 0) goto L_0x00a7
            float r5 = r6.left
            float r0 = r3.left
            float r5 = r5 - r0
            r0 = r4[r8]
            float r2 = r2.A00
            float r0 = r0 / r2
            float r5 = r5 + r0
            float r1 = r6.top
            float r0 = r3.top
            float r1 = r1 - r0
            r0 = r4[r7]
            float r0 = r0 / r2
            float r1 = r1 + r0
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>(r5, r1)
            return r2
        L_0x00a7:
            float r1 = r6.left
            float r0 = r3.left
            float r1 = r1 - r0
            r0 = r4[r8]
            float r2 = r2.A00
            float r0 = r0 / r2
            float r1 = r1 + r0
            r4[r8] = r1
            float r1 = r6.top
            float r0 = r3.top
            float r1 = r1 - r0
            r0 = r4[r7]
            float r0 = r0 / r2
            float r1 = r1 + r0
            r4[r7] = r1
            r5.reset()
            float r0 = r10.A00
            float r1 = -r0
            float r0 = r10.A01
            float r0 = -r0
            r5.preTranslate(r1, r0)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r10.A03
            float r2 = r2 / r0
            android.graphics.RectF r3 = r10.A06
            float r1 = r3.centerX()
            float r0 = r3.centerY()
            r5.preScale(r2, r2, r1, r0)
            float r0 = r10.A02
            float r2 = -r0
            float r1 = r3.centerX()
            float r0 = r3.centerY()
            r5.preRotate(r2, r1, r0)
            r5.mapPoints(r4)
            r1 = r4[r8]
            r0 = r4[r7]
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>(r1, r0)
            return r2
        L_0x00f8:
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6p8.A01(X.69K, float, float):android.graphics.PointF");
    }

    public AnonymousClass6p8(C1405671z r2) {
        this.A01 = r2;
    }
}
