package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class DLB implements C29151bh {
    public final /* synthetic */ BottomSheetBehavior A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        if (r12 != false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BlY(android.view.View r14, X.AnonymousClass1HO r15, X.C29171bj r16) {
        /*
            r13 = this;
            r0 = 7
            X.1id r11 = r15.A07(r0)
            r0 = 32
            X.1id r7 = r15.A07(r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = r13.A00
            int r9 = r11.A03
            r5.A0A = r9
            int r0 = r14.getLayoutDirection()
            boolean r2 = X.C17890vO.A1R(r0)
            int r8 = r14.getPaddingBottom()
            int r4 = r14.getPaddingLeft()
            int r3 = r14.getPaddingRight()
            boolean r6 = r5.A0c
            r1 = r16
            if (r6 == 0) goto L_0x0034
            int r0 = r15.A02()
            r5.A09 = r0
            int r8 = r1.A00
            int r8 = r8 + r0
        L_0x0034:
            boolean r0 = r5.A0d
            if (r0 == 0) goto L_0x003f
            if (r2 == 0) goto L_0x00a8
            int r4 = r1.A01
        L_0x003c:
            int r0 = r11.A01
            int r4 = r4 + r0
        L_0x003f:
            boolean r0 = r5.A0e
            if (r0 == 0) goto L_0x004a
            if (r2 == 0) goto L_0x00a5
            int r3 = r1.A02
        L_0x0047:
            int r0 = r11.A02
            int r3 = r3 + r0
        L_0x004a:
            android.view.ViewGroup$MarginLayoutParams r10 = X.AnonymousClass3MW.A0B(r14)
            boolean r0 = r5.A0Y
            r12 = 1
            if (r0 == 0) goto L_0x00a3
            int r1 = r10.leftMargin
            int r0 = r11.A01
            if (r1 == r0) goto L_0x00a3
            r10.leftMargin = r0
            r2 = 1
        L_0x005c:
            boolean r0 = r5.A0Z
            if (r0 == 0) goto L_0x00a1
            int r1 = r10.rightMargin
            int r0 = r11.A02
            if (r1 == r0) goto L_0x00a1
            r10.rightMargin = r0
        L_0x0068:
            boolean r0 = r5.A0a
            if (r0 == 0) goto L_0x009e
            int r0 = r10.topMargin
            if (r0 == r9) goto L_0x009e
            r10.topMargin = r9
        L_0x0072:
            r14.setLayoutParams(r10)
        L_0x0075:
            int r0 = r14.getPaddingTop()
            r14.setPadding(r4, r0, r3, r8)
            boolean r1 = r13.A01
            if (r1 == 0) goto L_0x0084
            int r0 = r7.A00
            r5.A07 = r0
        L_0x0084:
            if (r6 != 0) goto L_0x0088
            if (r1 == 0) goto L_0x009d
        L_0x0088:
            java.lang.ref.WeakReference r2 = r5.A0S
            if (r2 == 0) goto L_0x009d
            com.google.android.material.bottomsheet.BottomSheetBehavior.A08(r5)
            int r1 = r5.A0J
            r0 = 4
            if (r1 != r0) goto L_0x009d
            android.view.View r0 = X.C108945cZ.A0O(r2)
            if (r0 == 0) goto L_0x009d
            r0.requestLayout()
        L_0x009d:
            return
        L_0x009e:
            if (r12 == 0) goto L_0x0075
            goto L_0x0072
        L_0x00a1:
            r12 = r2
            goto L_0x0068
        L_0x00a3:
            r2 = 0
            goto L_0x005c
        L_0x00a5:
            int r3 = r1.A01
            goto L_0x0047
        L_0x00a8:
            int r4 = r1.A02
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DLB.BlY(android.view.View, X.1HO, X.1bj):void");
    }

    public DLB(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.A00 = bottomSheetBehavior;
        this.A01 = z;
    }
}
