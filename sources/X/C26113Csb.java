package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;

/* renamed from: X.Csb  reason: case insensitive filesystem */
public class C26113Csb {
    public final C26116Cse A00;
    public final E15 A01;
    public final boolean A02;
    public final Paint A03;

    private boolean A01(int i) {
        if (i != 0) {
            C24988CSo[] cSoArr = this.A00.A0B;
            C24988CSo cSo = cSoArr[i];
            C24988CSo cSo2 = cSoArr[i - 1];
            if (cSo.A05 != AnonymousClass00R.A01 || !A02(cSo)) {
                return cSo2.A04 == C24255ByD.DISPOSE_TO_BACKGROUND && A02(cSo2);
            }
        }
        return true;
    }

    private void A00(Canvas canvas, C24988CSo cSo) {
        int i = cSo.A02;
        int i2 = cSo.A03;
        canvas.drawRect((float) i, (float) i2, (float) (i + cSo.A01), (float) (i2 + cSo.A00), this.A03);
    }

    private boolean A02(C24988CSo cSo) {
        if (cSo.A02 == 0 && cSo.A03 == 0) {
            int i = cSo.A01;
            Rect rect = this.A00.A05;
            if (i == rect.width() && cSo.A00 == rect.height()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(int r16, android.graphics.Bitmap r17) {
        /*
            r15 = this;
            boolean r0 = r15.A02
            r5 = r16
            r1 = r17
            if (r0 == 0) goto L_0x0142
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r1)
            X.Cse r6 = r15.A00
            X.EAH r1 = r6.A06
            X.E9g r4 = r1.getFrame(r5)
            X.CSo r10 = r1.getFrameInfo(r5)
            if (r16 != 0) goto L_0x001d
            r5 = 0
            goto L_0x0023
        L_0x001d:
            int r0 = r16 + -1
            X.CSo r5 = r1.getFrameInfo(r0)
        L_0x0023:
            int r0 = r4.getWidth()     // Catch:{ all -> 0x013d }
            if (r0 <= 0) goto L_0x0139
            int r0 = r4.getHeight()     // Catch:{ all -> 0x013d }
            if (r0 <= 0) goto L_0x0139
            boolean r0 = r1.doesRenderSupportScaling()     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x00d7
            int r11 = r1.getWidth()     // Catch:{ all -> 0x013d }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x013d }
            float r3 = (float) r11     // Catch:{ all -> 0x013d }
            float r2 = (float) r1     // Catch:{ all -> 0x013d }
            int r9 = r4.getWidth()     // Catch:{ all -> 0x013d }
            int r8 = r4.getHeight()     // Catch:{ all -> 0x013d }
            int r14 = r4.getXOffset()     // Catch:{ all -> 0x013d }
            int r13 = r4.getYOffset()     // Catch:{ all -> 0x013d }
            int r0 = r7.getWidth()     // Catch:{ all -> 0x013d }
            float r0 = (float) r0     // Catch:{ all -> 0x013d }
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            int r0 = r7.getHeight()     // Catch:{ all -> 0x013d }
            float r0 = (float) r0     // Catch:{ all -> 0x013d }
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            r12 = 1065353216(0x3f800000, float:1.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a7
        L_0x0066:
            int r0 = r7.getWidth()     // Catch:{ all -> 0x013d }
            int r8 = java.lang.Math.min(r0, r11)     // Catch:{ all -> 0x013d }
            int r0 = r7.getHeight()     // Catch:{ all -> 0x013d }
            int r1 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x013d }
            float r0 = r3 / r2
            if (r8 <= r1) goto L_0x007e
            float r12 = (float) r8     // Catch:{ all -> 0x013d }
            float r11 = r12 / r0
            goto L_0x0081
        L_0x007e:
            float r11 = (float) r1     // Catch:{ all -> 0x013d }
            float r12 = r11 * r0
        L_0x0081:
            float r12 = r12 / r3
            float r11 = r11 / r2
            int r0 = r4.getWidth()     // Catch:{ all -> 0x013d }
            float r0 = (float) r0     // Catch:{ all -> 0x013d }
            int r9 = X.BE8.A03(r0, r12)     // Catch:{ all -> 0x013d }
            int r0 = r4.getHeight()     // Catch:{ all -> 0x013d }
            float r0 = (float) r0     // Catch:{ all -> 0x013d }
            int r8 = X.BE8.A03(r0, r11)     // Catch:{ all -> 0x013d }
            int r0 = r4.getXOffset()     // Catch:{ all -> 0x013d }
            float r0 = (float) r0     // Catch:{ all -> 0x013d }
            int r14 = X.BE8.A03(r0, r12)     // Catch:{ all -> 0x013d }
            int r0 = r4.getYOffset()     // Catch:{ all -> 0x013d }
            float r0 = (float) r0     // Catch:{ all -> 0x013d }
            int r13 = X.BE8.A03(r0, r11)     // Catch:{ all -> 0x013d }
        L_0x00a7:
            r0 = 0
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ all -> 0x013d }
            r3.<init>(r0, r0, r9, r8)     // Catch:{ all -> 0x013d }
            int r1 = r14 + r9
            int r0 = r13 + r8
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ all -> 0x013d }
            r2.<init>(r14, r13, r1, r0)     // Catch:{ all -> 0x013d }
            if (r5 == 0) goto L_0x00bb
            X.C26116Cse.A02(r7, r5, r6, r12, r11)     // Catch:{ all -> 0x013d }
        L_0x00bb:
            java.lang.Integer r1 = r10.A05     // Catch:{ all -> 0x013d }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x013d }
            if (r1 != r0) goto L_0x00c6
            android.graphics.Paint r0 = r6.A02     // Catch:{ all -> 0x013d }
            r7.drawRect(r2, r0)     // Catch:{ all -> 0x013d }
        L_0x00c6:
            monitor-enter(r6)     // Catch:{ all -> 0x013d }
            android.graphics.Bitmap r1 = X.C26116Cse.A00(r6, r9, r8)     // Catch:{ all -> 0x00d4 }
            r4.renderFrame(r9, r8, r1)     // Catch:{ all -> 0x00d4 }
            r0 = 0
            r7.drawBitmap(r1, r3, r2, r0)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r6)     // Catch:{ all -> 0x00d4 }
            goto L_0x0139
        L_0x00d4:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00d4 }
            goto L_0x0138
        L_0x00d7:
            android.graphics.Rect r1 = r6.A05     // Catch:{ all -> 0x013d }
            int r0 = r1.width()     // Catch:{ all -> 0x013d }
            if (r0 <= 0) goto L_0x0139
            int r0 = r1.height()     // Catch:{ all -> 0x013d }
            if (r0 <= 0) goto L_0x0139
            int r0 = r7.getWidth()     // Catch:{ all -> 0x013d }
            float r2 = (float) r0     // Catch:{ all -> 0x013d }
            float r0 = X.BE6.A02(r1)     // Catch:{ all -> 0x013d }
            float r2 = r2 / r0
            if (r5 == 0) goto L_0x00f4
            X.C26116Cse.A02(r7, r5, r6, r2, r2)     // Catch:{ all -> 0x013d }
        L_0x00f4:
            int r8 = r4.getWidth()     // Catch:{ all -> 0x013d }
            int r5 = r4.getHeight()     // Catch:{ all -> 0x013d }
            r0 = 0
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ all -> 0x013d }
            r3.<init>(r0, r0, r8, r5)     // Catch:{ all -> 0x013d }
            float r0 = (float) r8     // Catch:{ all -> 0x013d }
            float r0 = r0 * r2
            int r11 = (int) r0     // Catch:{ all -> 0x013d }
            float r0 = (float) r5     // Catch:{ all -> 0x013d }
            float r0 = r0 * r2
            int r9 = (int) r0     // Catch:{ all -> 0x013d }
            int r0 = r4.getXOffset()     // Catch:{ all -> 0x013d }
            float r0 = (float) r0     // Catch:{ all -> 0x013d }
            float r0 = r0 * r2
            int r1 = (int) r0     // Catch:{ all -> 0x013d }
            int r0 = r4.getYOffset()     // Catch:{ all -> 0x013d }
            float r0 = (float) r0     // Catch:{ all -> 0x013d }
            float r0 = r0 * r2
            int r0 = (int) r0     // Catch:{ all -> 0x013d }
            int r11 = r11 + r1
            int r9 = r9 + r0
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ all -> 0x013d }
            r2.<init>(r1, r0, r11, r9)     // Catch:{ all -> 0x013d }
            java.lang.Integer r1 = r10.A05     // Catch:{ all -> 0x013d }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x013d }
            if (r1 != r0) goto L_0x0128
            android.graphics.Paint r0 = r6.A02     // Catch:{ all -> 0x013d }
            r7.drawRect(r2, r0)     // Catch:{ all -> 0x013d }
        L_0x0128:
            monitor-enter(r6)     // Catch:{ all -> 0x013d }
            android.graphics.Bitmap r1 = X.C26116Cse.A00(r6, r8, r5)     // Catch:{ all -> 0x0136 }
            r4.renderFrame(r8, r5, r1)     // Catch:{ all -> 0x0136 }
            r0 = 0
            r7.drawBitmap(r1, r3, r2, r0)     // Catch:{ all -> 0x0136 }
            monitor-exit(r6)     // Catch:{ all -> 0x0136 }
            goto L_0x0139
        L_0x0136:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0136 }
        L_0x0138:
            throw r0     // Catch:{ all -> 0x013d }
        L_0x0139:
            r4.dispose()
            return
        L_0x013d:
            r0 = move-exception
            r4.dispose()
            throw r0
        L_0x0142:
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC
            r4.drawColor(r2, r0)
            boolean r0 = r15.A01(r5)
            r6 = r5
            if (r0 != 0) goto L_0x01cb
            int r6 = r16 + -1
        L_0x0156:
            if (r6 < 0) goto L_0x01c4
            X.Cse r0 = r15.A00
            X.CSo[] r7 = r0.A0B
            r3 = r7[r6]
            X.ByD r1 = r3.A04
            X.ByD r0 = X.C24255ByD.DISPOSE_DO_NOT
            if (r1 == r0) goto L_0x01a7
            X.ByD r0 = X.C24255ByD.DISPOSE_TO_BACKGROUND
            if (r1 != r0) goto L_0x019d
            boolean r0 = r15.A02(r3)
            if (r0 == 0) goto L_0x01a7
            java.lang.Integer r0 = X.AnonymousClass00R.A01
        L_0x0170:
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x017f
            r0 = 1
            if (r1 == r0) goto L_0x01ec
            r0 = 3
            if (r1 == r0) goto L_0x01cb
        L_0x017c:
            int r6 = r6 + -1
            goto L_0x0156
        L_0x017f:
            r7 = r7[r6]
            X.E15 r1 = r15.A01
            X.DCi r1 = (X.C26753DCi) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0196
            java.lang.Object r0 = r1.A01
            X.CWs r0 = (X.C25082CWs) r0
            X.E9u r0 = r0.A02
            X.DRN r3 = r0.BNy(r6)
            if (r3 == 0) goto L_0x0196
            goto L_0x01aa
        L_0x0196:
            boolean r0 = r15.A01(r6)
            if (r0 == 0) goto L_0x017c
            goto L_0x01cb
        L_0x019d:
            X.ByD r0 = X.C24255ByD.DISPOSE_TO_PREVIOUS
            if (r1 != r0) goto L_0x01a4
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0170
        L_0x01a4:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            goto L_0x0170
        L_0x01a7:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0170
        L_0x01aa:
            java.lang.Object r2 = r3.A05()     // Catch:{ all -> 0x01bf }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x01bf }
            r1 = 0
            r0 = 0
            r4.drawBitmap(r2, r0, r0, r1)     // Catch:{ all -> 0x01bf }
            X.ByD r1 = r7.A04     // Catch:{ all -> 0x01bf }
            X.ByD r0 = X.C24255ByD.DISPOSE_TO_BACKGROUND     // Catch:{ all -> 0x01bf }
            if (r1 != r0) goto L_0x01c6
            r15.A00(r4, r7)     // Catch:{ all -> 0x01bf }
            goto L_0x01c6
        L_0x01bf:
            r0 = move-exception
            r3.close()
            throw r0
        L_0x01c4:
            r6 = 0
            goto L_0x01cb
        L_0x01c6:
            int r6 = r6 + 1
            r3.close()
        L_0x01cb:
            if (r6 >= r5) goto L_0x01ef
            X.Cse r7 = r15.A00
            X.CSo[] r0 = r7.A0B
            r3 = r0[r6]
            X.ByD r2 = r3.A04
            X.ByD r0 = X.C24255ByD.DISPOSE_TO_PREVIOUS
            if (r2 == r0) goto L_0x01ec
            java.lang.Integer r1 = r3.A05
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x01e2
            r15.A00(r4, r3)
        L_0x01e2:
            r7.A03(r4, r6)
            X.ByD r0 = X.C24255ByD.DISPOSE_TO_BACKGROUND
            if (r2 != r0) goto L_0x01ec
            r15.A00(r4, r3)
        L_0x01ec:
            int r6 = r6 + 1
            goto L_0x01cb
        L_0x01ef:
            X.Cse r3 = r15.A00
            X.CSo[] r0 = r3.A0B
            r2 = r0[r16]
            java.lang.Integer r1 = r2.A05
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x01fe
            r15.A00(r4, r2)
        L_0x01fe:
            r3.A03(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26113Csb.A03(int, android.graphics.Bitmap):void");
    }

    public C26113Csb(C26116Cse cse, E15 e15, boolean z) {
        this.A00 = cse;
        this.A01 = e15;
        this.A02 = z;
        Paint A06 = AnonymousClass3MW.A06();
        this.A03 = A06;
        AnonymousClass3MZ.A1D(0, A06);
        C108965cb.A11(A06, PorterDuff.Mode.SRC);
    }
}
