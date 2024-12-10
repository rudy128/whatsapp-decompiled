package com.facebook.flexlayout;

import X.AnonymousClass8BR;

public abstract class FlexLayoutNativeMeasureCallback {
    public final float baselineNative(int i, float f, float f2) {
        throw AnonymousClass8BR.A0w("Baseline function isn't defined!");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (java.lang.Float.isNaN(r11) == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c5, code lost:
        if (java.lang.Float.isNaN(r11) == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r2.A05 == 13320) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.flexlayout.layoutoutput.MeasureOutput measureNative(int r18, float r19, float r20, float r21, float r22, float r23, float r24) {
        /*
            r17 = this;
            r9 = r19
            r6 = r22
            r7 = r21
            r8 = r20
            r5 = r17
            X.BRb r5 = (X.C22823BRb) r5
            X.CJn[] r0 = r5.A01
            r0 = r0[r18]
            X.0Mh r4 = r0.A00
            X.0sU r3 = r4.A02
            boolean r0 = r3 instanceof X.DFL
            if (r0 == 0) goto L_0x0136
            r2 = r3
            X.DFL r2 = (X.DFL) r2
            int r1 = r2.A05
            r0 = 13320(0x3408, float:1.8665E-41)
            if (r1 != r0) goto L_0x0136
        L_0x0021:
            r16 = 1
            r15 = 0
            boolean r0 = X.AnonymousClass000.A1W(r2)
            X.DFL r11 = X.DFG.A02(r3)
            r10 = 0
            if (r0 != 0) goto L_0x0079
            if (r11 == 0) goto L_0x0079
            r0 = 61
            float r14 = X.DFG.A01(r11, r0)
            r0 = 57
            float r13 = X.DFG.A01(r11, r0)
            r0 = 58
            float r12 = X.DFG.A01(r11, r0)
            r0 = 55
            float r2 = X.DFG.A01(r11, r0)
            r0 = 59
            float r1 = X.DFG.A01(r11, r0)
            r0 = 56
            float r11 = X.DFG.A01(r11, r0)
            boolean r0 = java.lang.Float.isNaN(r14)
            if (r0 == 0) goto L_0x0124
            boolean r0 = java.lang.Float.isNaN(r13)
            if (r0 == 0) goto L_0x0124
            boolean r0 = java.lang.Float.isNaN(r12)
            if (r0 == 0) goto L_0x0124
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto L_0x0124
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x0124
            boolean r0 = java.lang.Float.isNaN(r11)
            if (r0 == 0) goto L_0x0124
        L_0x0079:
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r10 != 0) goto L_0x00ab
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 == 0) goto L_0x0085
            r8 = r23
        L_0x0085:
            X.0IV r4 = r4.A01
            int r2 = X.C04210Mh.A00(r9, r8)
            int r0 = X.C04210Mh.A00(r7, r6)
            X.0tS r4 = r3.BDo(r4, r2, r0)
            int r0 = r4.getWidth()
            float r3 = (float) r0
            int r0 = r4.getHeight()
        L_0x009c:
            float r0 = (float) r0
            com.facebook.flexlayout.layoutoutput.MeasureOutput r2 = new com.facebook.flexlayout.layoutoutput.MeasureOutput
            r2.<init>(r3, r0, r1, r4)
            com.facebook.flexlayout.layoutoutput.LayoutOutput r0 = r5.A00
            java.lang.Object[] r1 = r0.measureResults
            java.lang.Object r0 = r2.measureResult
            r1[r18] = r0
            return r2
        L_0x00ab:
            boolean r2 = r4.A03
            if (r2 != 0) goto L_0x011a
            r0 = 5
            r11 = r10[r0]
            boolean r0 = java.lang.Float.isNaN(r11)
            if (r0 != 0) goto L_0x011a
        L_0x00b8:
            int r13 = java.lang.Math.round(r11)
            if (r2 == 0) goto L_0x010f
            r0 = 5
            r11 = r10[r0]
            boolean r0 = java.lang.Float.isNaN(r11)
            if (r0 != 0) goto L_0x010f
        L_0x00c7:
            int r0 = java.lang.Math.round(r11)
            int r13 = r13 + r0
            r11 = r10[r15]
            boolean r0 = java.lang.Float.isNaN(r11)
            if (r0 == 0) goto L_0x00d5
            r11 = 0
        L_0x00d5:
            int r12 = java.lang.Math.round(r11)
            r0 = 3
            r11 = r10[r0]
            boolean r0 = java.lang.Float.isNaN(r11)
            if (r0 == 0) goto L_0x00e3
            r11 = 0
        L_0x00e3:
            int r0 = java.lang.Math.round(r11)
            int r12 = r12 + r0
            X.0IV r11 = r4.A01
            float r0 = (float) r13
            float r9 = r19 - r0
            float r8 = r20 - r0
            int r4 = X.C04210Mh.A00(r9, r8)
            float r0 = (float) r12
            float r7 = r21 - r0
            float r6 = r22 - r0
            int r0 = X.C04210Mh.A00(r7, r6)
            X.0tS r0 = r3.BDo(r11, r4, r0)
            X.0YH r4 = new X.0YH
            r4.<init>(r0, r10, r2)
            int r0 = r4.getWidth()
            float r3 = (float) r0
            int r0 = r4.getHeight()
            goto L_0x009c
        L_0x010f:
            r0 = 2
            r11 = r10[r0]
            boolean r0 = java.lang.Float.isNaN(r11)
            if (r0 == 0) goto L_0x00c7
            r11 = 0
            goto L_0x00c7
        L_0x011a:
            r11 = r10[r16]
            boolean r0 = java.lang.Float.isNaN(r11)
            if (r0 == 0) goto L_0x00b8
            r11 = 0
            goto L_0x00b8
        L_0x0124:
            r0 = 6
            float[] r10 = new float[r0]
            r10[r15] = r14
            r10[r16] = r13
            r0 = 2
            r10[r0] = r12
            X.BE9.A1N(r10, r2, r1)
            r0 = 5
            r10[r0] = r11
            goto L_0x0079
        L_0x0136:
            r2 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.flexlayout.FlexLayoutNativeMeasureCallback.measureNative(int, float, float, float, float, float, float):com.facebook.flexlayout.layoutoutput.MeasureOutput");
    }
}
