package X;

import android.os.Handler;

/* renamed from: X.CyT  reason: case insensitive filesystem */
public class C26367CyT implements Handler.Callback {
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            int r0 = r9.what
            r4 = 1
            if (r0 == 0) goto L_0x0095
            if (r0 == r4) goto L_0x0009
            r0 = 0
            return r0
        L_0x0009:
            java.lang.Object r6 = r9.obj
            X.CtN r6 = (X.C26155CtN) r6
            int r7 = r9.arg1
            android.view.accessibility.AccessibilityManager r0 = r6.A0I
            if (r0 == 0) goto L_0x001f
            java.util.List r0 = r0.getEnabledAccessibilityServiceList(r4)
            if (r0 == 0) goto L_0x0091
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0091
        L_0x001f:
            X.BIE r1 = r6.A0J
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0091
            int r0 = r1.A00
            if (r0 != r4) goto L_0x0053
            float[] r0 = X.C108945cZ.A1V()
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            android.animation.TimeInterpolator r0 = r6.A0D
            r2.setInterpolator(r0)
            r0 = 10
            X.C26323Cxg.A00(r2, r6, r0)
            int r0 = r6.A0B
            long r0 = (long) r0
            r2.setDuration(r0)
            r1 = 0
            X.BEI r0 = new X.BEI
            r0.<init>(r6, r7, r1)
            r2.addListener(r0)
            r2.start()
            return r4
        L_0x0053:
            android.animation.ValueAnimator r5 = new android.animation.ValueAnimator
            r5.<init>()
            int[] r3 = X.C108945cZ.A1W()
            r0 = 0
            r3[r0] = r0
            int r2 = r1.getHeight()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0070
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.bottomMargin
            int r2 = r2 + r0
        L_0x0070:
            r3[r4] = r2
            r5.setIntValues(r3)
            android.animation.TimeInterpolator r0 = r6.A0F
            r5.setInterpolator(r0)
            int r0 = r6.A0C
            long r0 = (long) r0
            r5.setDuration(r0)
            X.BEI r0 = new X.BEI
            r0.<init>(r6, r7, r4)
            r5.addListener(r0)
            r0 = 13
            X.C26323Cxg.A00(r5, r6, r0)
            r5.start()
            return r4
        L_0x0091:
            r6.A0A(r7)
            return r4
        L_0x0095:
            java.lang.Object r5 = r9.obj
            X.CtN r5 = (X.C26155CtN) r5
            X.BIE r6 = r5.A0J
            android.view.ViewParent r0 = r6.getParent()
            if (r0 != 0) goto L_0x010b
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            boolean r0 = r3 instanceof X.C37891qK
            if (r0 == 0) goto L_0x00d0
            X.1qK r3 = (X.C37891qK) r3
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r2 = new com.google.android.material.snackbar.BaseTransientBottomBar$Behavior
            r2.<init>()
            X.C55 r1 = r2.A00
            X.E2U r0 = r5.A07
            r1.A00 = r0
            X.DL6 r0 = new X.DL6
            r0.<init>(r5)
            r2.A04 = r0
            r3.A00(r2)
            X.D5E r0 = r5.A06
            if (r0 == 0) goto L_0x00cc
            java.lang.ref.WeakReference r0 = r0.A00
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x00d0
        L_0x00cc:
            r0 = 80
            r3.A03 = r0
        L_0x00d0:
            android.view.ViewGroup r7 = r5.A0H
            r6.A05 = r4
            r7.addView(r6)
            r0 = 0
            r6.A05 = r0
            X.D5E r0 = r5.A06
            if (r0 == 0) goto L_0x0115
            java.lang.ref.WeakReference r3 = r0.A00
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L_0x0115
            r2 = 2
            int[] r1 = new int[r2]
            android.view.View r0 = X.C108945cZ.A0O(r3)
            r0.getLocationOnScreen(r1)
            r1 = r1[r4]
            int[] r0 = new int[r2]
            r7.getLocationOnScreen(r0)
            r0 = r0[r4]
            int r0 = X.AnonymousClass3MW.A02(r7, r0)
            int r0 = r0 - r1
        L_0x00fe:
            int r1 = r5.A01
            if (r0 == r1) goto L_0x0107
            r5.A01 = r0
            X.C26155CtN.A04(r5)
        L_0x0107:
            r0 = 4
            r6.setVisibility(r0)
        L_0x010b:
            boolean r0 = r6.isLaidOut()
            if (r0 == 0) goto L_0x0117
            X.C26155CtN.A03(r5)
            return r4
        L_0x0115:
            r0 = 0
            goto L_0x00fe
        L_0x0117:
            r5.A09 = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26367CyT.handleMessage(android.os.Message):boolean");
    }
}
