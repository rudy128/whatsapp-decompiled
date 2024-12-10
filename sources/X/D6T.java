package X;

public class D6T implements AnonymousClass1HE {
    public final int A00;
    public final Object A01;

    public D6T(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r2.getTopInset() <= 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        if (r9.A05() <= 0) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1HO BlX(android.view.View r8, X.AnonymousClass1HO r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x003a;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00c7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r7.A01
            X.BIe r6 = (X.C22655BIe) r6
            boolean r0 = r6.A0O
            r5 = 0
            android.view.View r4 = r6.A0E
            if (r0 == 0) goto L_0x00bd
            if (r4 == 0) goto L_0x0029
            int r3 = r9.A03()
            android.view.View r0 = r6.A0E
            int r2 = r0.getPaddingTop()
            int r1 = r9.A04()
            android.view.View r0 = r6.A0E
            int r0 = r0.getPaddingBottom()
            r4.setPadding(r3, r2, r1, r0)
        L_0x0029:
            X.1HO r2 = X.AnonymousClass1HF.A0F(r8, r9)
            int r1 = r2.A05()
            int r0 = r2.A02()
            X.1HO r9 = r2.A0E(r5, r1, r5, r0)
        L_0x0039:
            return r9
        L_0x003a:
            java.lang.Object r2 = r7.A01
            com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
            boolean r0 = r2.getFitsSystemWindows()
            r1 = 0
            if (r0 == 0) goto L_0x0046
            r1 = r9
        L_0x0046:
            X.1HO r0 = r2.A05
            boolean r0 = X.AnonymousClass026.A00(r0, r1)
            if (r0 != 0) goto L_0x0039
            r2.A05 = r1
            android.graphics.drawable.Drawable r0 = r2.A04
            if (r0 == 0) goto L_0x005b
            int r1 = r2.getTopInset()
            r0 = 1
            if (r1 > 0) goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            r0 = r0 ^ 1
            r2.setWillNotDraw(r0)
            r2.requestLayout()
            return r9
        L_0x0065:
            java.lang.Object r5 = r7.A01
            androidx.coordinatorlayout.widget.CoordinatorLayout r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r5
            X.1HO r0 = r5.A02
            boolean r0 = X.AnonymousClass026.A00(r0, r9)
            if (r0 != 0) goto L_0x0039
            r5.A02 = r9
            r2 = 1
            if (r9 == 0) goto L_0x007d
            int r1 = r9.A05()
            r0 = 1
            if (r1 > 0) goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            r5.A03 = r0
            if (r0 != 0) goto L_0x00bb
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L_0x00bb
        L_0x0088:
            r5.setWillNotDraw(r2)
            X.1ZX r4 = r9.A00
            boolean r0 = r4.A0C()
            if (r0 != 0) goto L_0x00b4
            int r3 = r5.getChildCount()
            r2 = 0
        L_0x0098:
            if (r2 >= r3) goto L_0x00b4
            android.view.View r1 = r5.getChildAt(r2)
            boolean r0 = r1.getFitsSystemWindows()
            if (r0 == 0) goto L_0x00b8
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.1qK r0 = (X.C37891qK) r0
            X.1wV r0 = r0.A0A
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r4.A0C()
            if (r0 == 0) goto L_0x00b8
        L_0x00b4:
            r5.requestLayout()
            return r9
        L_0x00b8:
            int r2 = r2 + 1
            goto L_0x0098
        L_0x00bb:
            r2 = 0
            goto L_0x0088
        L_0x00bd:
            if (r4 == 0) goto L_0x00c2
            r4.setPadding(r5, r5, r5, r5)
        L_0x00c2:
            X.1HO r9 = X.AnonymousClass1HF.A0F(r8, r9)
            return r9
        L_0x00c7:
            java.lang.Object r2 = r7.A01
            X.CtN r2 = (X.C26155CtN) r2
            int r1 = r9.A02()
            android.os.Handler r0 = X.C26155CtN.A0M
            r2.A03 = r1
            int r0 = r9.A03()
            r2.A04 = r0
            int r0 = r9.A04()
            r2.A05 = r0
            X.C26155CtN.A04(r2)
            return r9
        L_0x00e3:
            java.lang.Object r2 = r7.A01
            com.google.android.material.appbar.CollapsingToolbarLayout r2 = (com.google.android.material.appbar.CollapsingToolbarLayout) r2
            boolean r0 = r2.getFitsSystemWindows()
            r1 = 0
            if (r0 == 0) goto L_0x00ef
            r1 = r9
        L_0x00ef:
            X.1HO r0 = r2.A09
            boolean r0 = X.AnonymousClass026.A00(r0, r1)
            if (r0 != 0) goto L_0x00fc
            r2.A09 = r1
            r2.requestLayout()
        L_0x00fc:
            X.1HO r9 = r9.A0C()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D6T.BlX(android.view.View, X.1HO):X.1HO");
    }
}
