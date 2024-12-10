package X;

import android.graphics.Matrix;

/* renamed from: X.0Xe  reason: invalid class name and case insensitive filesystem */
public final class C06160Xe implements C16500sM {
    public final Matrix A00 = new Matrix();
    public final int[] A01 = new int[2];

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BDr(android.view.View r7, float[] r8) {
        /*
            r6 = this;
            android.graphics.Matrix r5 = r6.A00
            r5.reset()
            r7.transformMatrixToGlobal(r5)
        L_0x0008:
            android.view.ViewParent r1 = r7.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0014
            r7 = r1
            android.view.View r7 = (android.view.View) r7
            goto L_0x0008
        L_0x0014:
            int[] r4 = r6.A01
            r7.getLocationOnScreen(r4)
            r1 = 0
            r3 = r4[r1]
            r0 = 1
            r2 = r4[r0]
            r7.getLocationInWindow(r4)
            r1 = r4[r1]
            r0 = r4[r0]
            int r1 = r1 - r3
            float r1 = (float) r1
            int r0 = r0 - r2
            float r0 = (float) r0
            r5.postTranslate(r1, r0)
            X.AnonymousClass0LJ.A01(r5, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06160Xe.BDr(android.view.View, float[]):void");
    }
}
