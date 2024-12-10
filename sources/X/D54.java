package X;

import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;

public class D54 implements View.OnTouchListener {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03 = false;
    public final GestureDetector A04;
    public final ScaleGestureDetector A05;
    public final BH5 A06;
    public final boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0117, code lost:
        if (r2.A07(r0) != null) goto L_0x0119;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0120 A[Catch:{ all -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0128 A[Catch:{ all -> 0x01de }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            r13 = this;
            android.graphics.Matrix r0 = X.C25433Cff.A00
            android.view.MotionEvent r6 = android.view.MotionEvent.obtain(r15)
            android.graphics.Matrix r0 = r14.getMatrix()
            r6.transform(r0)
            int r0 = r14.getLeft()
            float r1 = (float) r0
            int r0 = r14.getTop()
            float r0 = (float) r0
            r6.offsetLocation(r1, r0)
            android.view.ScaleGestureDetector r0 = r13.A05     // Catch:{ all -> 0x01de }
            r0.onTouchEvent(r6)     // Catch:{ all -> 0x01de }
            android.view.ViewParent r10 = r14.getParent()     // Catch:{ all -> 0x01de }
            boolean r0 = r0.isInProgress()     // Catch:{ all -> 0x01de }
            r7 = 1
            if (r0 == 0) goto L_0x003d
            X.BH5 r1 = r13.A06     // Catch:{ all -> 0x01de }
            r0 = 44
            X.E8A r0 = r1.A07(r0)     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x003d
            if (r10 == 0) goto L_0x003b
            r10.requestDisallowInterceptTouchEvent(r7)     // Catch:{ all -> 0x01de }
            r13.A02 = r7     // Catch:{ all -> 0x01de }
        L_0x003b:
            r4 = 1
            goto L_0x0043
        L_0x003d:
            android.view.GestureDetector r0 = r13.A04     // Catch:{ all -> 0x01de }
            boolean r4 = r0.onTouchEvent(r6)     // Catch:{ all -> 0x01de }
        L_0x0043:
            int r1 = r6.getActionMasked()     // Catch:{ all -> 0x01de }
            if (r10 == 0) goto L_0x0177
            if (r1 == 0) goto L_0x0164
            r9 = 0
            if (r1 == r7) goto L_0x0130
            r0 = 2
            if (r1 == r0) goto L_0x00b2
            r0 = 3
            if (r1 != r0) goto L_0x0177
            X.BH5 r11 = r13.A06     // Catch:{ all -> 0x01de }
            r0 = 61
            X.E8A r4 = r11.A07(r0)     // Catch:{ all -> 0x01de }
            boolean r0 = r11.A02     // Catch:{ all -> 0x01de }
            r8 = 3
            r12 = 2
            if (r0 == 0) goto L_0x007e
            if (r4 == 0) goto L_0x007e
            android.view.View r0 = r11.A01     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x007e
            X.DFL r3 = r11.A07     // Catch:{ all -> 0x01de }
            X.A4p r2 = X.BH5.A01(r11)     // Catch:{ all -> 0x01de }
            X.DOZ r1 = r11.A05     // Catch:{ all -> 0x01de }
            r2.A03(r1, r7)     // Catch:{ all -> 0x01de }
            r2.A03(r3, r12)     // Catch:{ all -> 0x01de }
            java.lang.String r0 = "cancelled"
            X.BH5.A05(r6, r11, r2, r0)     // Catch:{ all -> 0x01de }
            X.C26209Cul.A03(r1, r3, r2, r4)     // Catch:{ all -> 0x01de }
        L_0x007e:
            r0 = 66
            X.E8A r5 = r11.A07(r0)     // Catch:{ all -> 0x01de }
            if (r5 == 0) goto L_0x00ae
            android.view.View r0 = r11.A01     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x00ae
            android.graphics.PointF r4 = X.BH5.A00(r6, r11)     // Catch:{ all -> 0x01de }
            X.DFL r3 = r11.A07     // Catch:{ all -> 0x01de }
            X.A4p r2 = X.BH5.A01(r11)     // Catch:{ all -> 0x01de }
            X.DOZ r1 = r11.A05     // Catch:{ all -> 0x01de }
            r2.A03(r1, r7)     // Catch:{ all -> 0x01de }
            float r0 = r4.x     // Catch:{ all -> 0x01de }
            java.lang.Float r0 = X.BH5.A04(r11, r0)     // Catch:{ all -> 0x01de }
            r2.A03(r0, r12)     // Catch:{ all -> 0x01de }
            float r0 = r4.y     // Catch:{ all -> 0x01de }
            java.lang.Float r0 = X.BH5.A03(r11, r0)     // Catch:{ all -> 0x01de }
            r2.A03(r0, r8)     // Catch:{ all -> 0x01de }
            X.C26209Cul.A03(r1, r3, r2, r5)     // Catch:{ all -> 0x01de }
        L_0x00ae:
            r11.A02 = r9     // Catch:{ all -> 0x01de }
            goto L_0x01c3
        L_0x00b2:
            float r0 = r13.A00     // Catch:{ all -> 0x01de }
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x011b
            float r0 = r13.A01     // Catch:{ all -> 0x01de }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x011b
            int r0 = r6.getPointerCount()     // Catch:{ all -> 0x01de }
            if (r0 <= r7) goto L_0x00d2
            X.BH5 r1 = r13.A06     // Catch:{ all -> 0x01de }
            r0 = 44
            X.E8A r0 = r1.A07(r0)     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x00d2
            goto L_0x0119
        L_0x00d2:
            X.BH5 r2 = r13.A06     // Catch:{ all -> 0x01de }
            boolean r0 = r2.A04     // Catch:{ all -> 0x01de }
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r2.A03     // Catch:{ all -> 0x01de }
            if (r0 != 0) goto L_0x00e5
        L_0x00dc:
            r0 = 48
            X.E8A r0 = r2.A07(r0)     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x00e5
            goto L_0x0119
        L_0x00e5:
            float r3 = r6.getX()     // Catch:{ all -> 0x01de }
            float r0 = r13.A00     // Catch:{ all -> 0x01de }
            float r3 = r3 - r0
            float r1 = r6.getY()     // Catch:{ all -> 0x01de }
            float r0 = r13.A01     // Catch:{ all -> 0x01de }
            float r1 = X.C108945cZ.A00(r1, r0)     // Catch:{ all -> 0x01de }
            float r0 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x01de }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0109
            r0 = 38
            X.E8A r0 = r2.A07(r0)     // Catch:{ all -> 0x01de }
            if (r0 != 0) goto L_0x0119
            r0 = 42
            goto L_0x0113
        L_0x0109:
            r0 = 40
            X.E8A r0 = r2.A07(r0)     // Catch:{ all -> 0x01de }
            if (r0 != 0) goto L_0x0119
            r0 = 41
        L_0x0113:
            X.E8A r0 = r2.A07(r0)     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x011b
        L_0x0119:
            r1 = 1
            goto L_0x011c
        L_0x011b:
            r1 = 0
        L_0x011c:
            boolean r0 = r13.A02     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0128
            if (r1 != 0) goto L_0x0177
            r10.requestDisallowInterceptTouchEvent(r9)     // Catch:{ all -> 0x01de }
            r13.A02 = r9     // Catch:{ all -> 0x01de }
            goto L_0x0177
        L_0x0128:
            if (r1 == 0) goto L_0x0177
            r10.requestDisallowInterceptTouchEvent(r7)     // Catch:{ all -> 0x01de }
            r13.A02 = r7     // Catch:{ all -> 0x01de }
            goto L_0x0177
        L_0x0130:
            X.BH5 r8 = r13.A06     // Catch:{ all -> 0x01de }
            r8.A04 = r9     // Catch:{ all -> 0x01de }
            boolean r0 = r8.A02     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0191
            android.view.View r0 = r8.A01     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x018f
            r0 = 53
            X.E8A r12 = r8.A07(r0)     // Catch:{ all -> 0x01de }
            r0 = 61
            X.E8A r5 = r8.A07(r0)     // Catch:{ all -> 0x01de }
            r11 = 3
            r4 = 2
            if (r12 == 0) goto L_0x0161
            X.DFL r3 = r8.A07     // Catch:{ all -> 0x01de }
            X.A4p r2 = X.BH5.A01(r8)     // Catch:{ all -> 0x01de }
            X.DOZ r1 = r8.A05     // Catch:{ all -> 0x01de }
            r2.A03(r1, r7)     // Catch:{ all -> 0x01de }
            java.lang.Float r0 = X.BH5.A02(r6, r8, r2, r4)     // Catch:{ all -> 0x01de }
            r2.A03(r0, r11)     // Catch:{ all -> 0x01de }
            X.C26209Cul.A03(r1, r3, r2, r12)     // Catch:{ all -> 0x01de }
        L_0x0161:
            if (r5 == 0) goto L_0x018f
            goto L_0x0179
        L_0x0164:
            float r0 = r6.getX()     // Catch:{ all -> 0x01de }
            r13.A00 = r0     // Catch:{ all -> 0x01de }
            float r0 = r6.getY()     // Catch:{ all -> 0x01de }
            r13.A01 = r0     // Catch:{ all -> 0x01de }
            r10.requestDisallowInterceptTouchEvent(r7)     // Catch:{ all -> 0x01de }
            r13.A02 = r7     // Catch:{ all -> 0x01de }
            r13.A03 = r7     // Catch:{ all -> 0x01de }
        L_0x0177:
            r7 = r4
            goto L_0x01d5
        L_0x0179:
            X.DFL r3 = r8.A07     // Catch:{ all -> 0x01de }
            X.A4p r2 = X.BH5.A01(r8)     // Catch:{ all -> 0x01de }
            X.DOZ r1 = r8.A05     // Catch:{ all -> 0x01de }
            r2.A03(r1, r7)     // Catch:{ all -> 0x01de }
            r2.A03(r3, r4)     // Catch:{ all -> 0x01de }
            java.lang.String r0 = "released"
            X.BH5.A05(r6, r8, r2, r0)     // Catch:{ all -> 0x01de }
            X.C26209Cul.A03(r1, r3, r2, r5)     // Catch:{ all -> 0x01de }
        L_0x018f:
            r8.A02 = r9     // Catch:{ all -> 0x01de }
        L_0x0191:
            r0 = 50
            X.E8A r5 = r8.A07(r0)     // Catch:{ all -> 0x01de }
            if (r5 == 0) goto L_0x01c3
            android.view.View r0 = r8.A01     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x01c3
            android.graphics.PointF r11 = X.BH5.A00(r6, r8)     // Catch:{ all -> 0x01de }
            X.DFL r4 = r8.A07     // Catch:{ all -> 0x01de }
            X.A4p r3 = X.BH5.A01(r8)     // Catch:{ all -> 0x01de }
            X.DOZ r2 = r8.A05     // Catch:{ all -> 0x01de }
            r3.A03(r2, r7)     // Catch:{ all -> 0x01de }
            float r0 = r11.x     // Catch:{ all -> 0x01de }
            java.lang.Float r1 = X.BH5.A04(r8, r0)     // Catch:{ all -> 0x01de }
            r0 = 2
            r3.A03(r1, r0)     // Catch:{ all -> 0x01de }
            float r0 = r11.y     // Catch:{ all -> 0x01de }
            java.lang.Float r1 = X.BH5.A03(r8, r0)     // Catch:{ all -> 0x01de }
            r0 = 3
            r3.A03(r1, r0)     // Catch:{ all -> 0x01de }
            X.C26209Cul.A03(r2, r4, r3, r5)     // Catch:{ all -> 0x01de }
        L_0x01c3:
            boolean r0 = r13.A02     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x01cc
            r10.requestDisallowInterceptTouchEvent(r9)     // Catch:{ all -> 0x01de }
            r13.A02 = r9     // Catch:{ all -> 0x01de }
        L_0x01cc:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r13.A01 = r0     // Catch:{ all -> 0x01de }
            r13.A00 = r0     // Catch:{ all -> 0x01de }
            r13.A03 = r9     // Catch:{ all -> 0x01de }
        L_0x01d5:
            X.BH5 r1 = r13.A06     // Catch:{ all -> 0x01de }
            r0 = 0
            r1.A03 = r0     // Catch:{ all -> 0x01de }
            r6.recycle()
            return r7
        L_0x01de:
            r0 = move-exception
            r6.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D54.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public D54(GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector, BH5 bh5, boolean z) {
        this.A06 = bh5;
        this.A04 = gestureDetector;
        this.A05 = scaleGestureDetector;
        this.A07 = z;
        this.A02 = false;
        this.A00 = Float.MAX_VALUE;
        this.A01 = Float.MAX_VALUE;
    }
}
