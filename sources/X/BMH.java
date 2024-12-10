package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public final class BMH extends C39711tW {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C24903COw A04 = new Object();
    public C6T A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final LinearLayoutManager A09;
    public final RecyclerView A0A;
    public final ViewPager2 A0B;

    private void A00() {
        this.A00 = 0;
        this.A02 = 0;
        C24903COw cOw = this.A04;
        cOw.A02 = -1;
        cOw.A00 = 0.0f;
        cOw.A01 = 0;
        this.A01 = -1;
        this.A03 = -1;
        this.A07 = false;
        this.A08 = false;
        this.A06 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r8.A01 == r1) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
        /*
            r8 = this;
            r6 = 1
            r8.A08 = r6
            A01(r8)
            boolean r0 = r8.A07
            r7 = -1
            r5 = 0
            if (r0 == 0) goto L_0x006b
            r8.A07 = r5
            if (r11 > 0) goto L_0x0026
            if (r11 != 0) goto L_0x0066
            boolean r1 = X.C108975cc.A19(r10)
            androidx.viewpager2.widget.ViewPager2 r0 = r8.A0B
            androidx.recyclerview.widget.LinearLayoutManager r0 = r0.A02
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            int r0 = r0.getLayoutDirection()
            boolean r0 = X.BE8.A1T(r0)
            if (r1 != r0) goto L_0x0066
        L_0x0026:
            X.COw r1 = r8.A04
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0066
            int r0 = r1.A02
            int r1 = r0 + 1
        L_0x0030:
            r8.A03 = r1
            int r0 = r8.A01
            if (r0 == r1) goto L_0x003d
        L_0x0036:
            X.C6T r0 = r8.A05
            if (r0 == 0) goto L_0x003d
            r0.A01(r1)
        L_0x003d:
            X.COw r4 = r8.A04
            int r3 = r4.A02
            if (r3 != r7) goto L_0x0044
            r3 = 0
        L_0x0044:
            float r2 = r4.A00
            int r1 = r4.A01
            X.C6T r0 = r8.A05
            if (r0 == 0) goto L_0x004f
            r0.A02(r3, r2, r1)
        L_0x004f:
            int r1 = r4.A02
            int r0 = r8.A03
            if (r1 == r0) goto L_0x0057
            if (r0 != r7) goto L_0x0065
        L_0x0057:
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0065
            int r0 = r8.A02
            if (r0 == r6) goto L_0x0065
            A02(r8, r5)
            r8.A00()
        L_0x0065:
            return
        L_0x0066:
            X.COw r0 = r8.A04
            int r1 = r0.A02
            goto L_0x0030
        L_0x006b:
            int r0 = r8.A00
            if (r0 != 0) goto L_0x003d
            X.COw r0 = r8.A04
            int r1 = r0.A02
            if (r1 != r7) goto L_0x0036
            r1 = 0
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BMH.A04(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.Cgo] */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0112, code lost:
        if (r6[r7 - 1][1] >= r1) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011b, code lost:
        if (r5.A00.A0J() <= 1) goto L_0x011d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.BMH r13) {
        /*
            X.COw r3 = r13.A04
            androidx.recyclerview.widget.LinearLayoutManager r8 = r13.A09
            int r1 = r8.A1O()
            r3.A02 = r1
            r0 = -1
            if (r1 == r0) goto L_0x0159
            android.view.View r9 = r8.A0j(r1)
            if (r9 == 0) goto L_0x0159
            android.graphics.Rect r0 = X.BE7.A0D(r9)
            int r6 = r0.left
            android.graphics.Rect r0 = X.BE7.A0D(r9)
            int r7 = r0.right
            android.graphics.Rect r0 = X.BE7.A0D(r9)
            int r5 = r0.top
            android.graphics.Rect r0 = X.BE7.A0D(r9)
            int r4 = r0.bottom
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0041
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.leftMargin
            int r6 = r6 + r0
            int r0 = r1.rightMargin
            int r7 = r7 + r0
            int r0 = r1.topMargin
            int r5 = r5 + r0
            int r0 = r1.bottomMargin
            int r4 = r4 + r0
        L_0x0041:
            int r2 = r9.getHeight()
            int r2 = r2 + r5
            int r2 = r2 + r4
            int r4 = r9.getWidth()
            int r4 = r4 + r6
            int r4 = r4 + r7
            int r0 = r8.A01
            if (r0 != 0) goto L_0x00d6
            int r1 = r9.getLeft()
            int r1 = r1 - r6
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0A
            int r0 = r0.getPaddingLeft()
            int r1 = r1 - r0
            androidx.viewpager2.widget.ViewPager2 r0 = r13.A0B
            androidx.recyclerview.widget.LinearLayoutManager r0 = r0.A02
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            int r2 = r0.getLayoutDirection()
            r0 = 1
            if (r2 != r0) goto L_0x006b
            int r1 = -r1
        L_0x006b:
            r2 = r4
        L_0x006c:
            int r0 = -r1
            r3.A01 = r0
            if (r0 >= 0) goto L_0x0150
            X.Cgo r5 = new X.Cgo
            r5.<init>()
            r5.A00 = r8
            int r7 = r8.A0J()
            r4 = 1
            if (r7 == 0) goto L_0x0115
            int r0 = r8.A01
            r13 = 0
            boolean r12 = X.AnonymousClass000.A1P(r0)
            r0 = 2
            int[] r1 = new int[r0]
            r1[r4] = r0
            r1[r13] = r7
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r0, r1)
            int[][] r6 = (int[][]) r6
            r11 = 0
        L_0x0096:
            if (r11 >= r7) goto L_0x00ea
            android.view.View r10 = r8.A0P(r11)
            if (r10 == 0) goto L_0x00e3
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            boolean r0 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00d3
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
        L_0x00a8:
            r2 = r6[r11]
            if (r12 == 0) goto L_0x00cc
            int r1 = r10.getLeft()
            int r0 = r9.leftMargin
        L_0x00b2:
            int r1 = r1 - r0
            r2[r13] = r1
            r2 = r6[r11]
            if (r12 == 0) goto L_0x00c5
            int r1 = r10.getRight()
            int r0 = r9.rightMargin
        L_0x00bf:
            int r1 = r1 + r0
            r2[r4] = r1
            int r11 = r11 + 1
            goto L_0x0096
        L_0x00c5:
            int r1 = r10.getBottom()
            int r0 = r9.bottomMargin
            goto L_0x00bf
        L_0x00cc:
            int r1 = r10.getTop()
            int r0 = r9.topMargin
            goto L_0x00b2
        L_0x00d3:
            android.view.ViewGroup$MarginLayoutParams r9 = X.C25493Cgo.A01
            goto L_0x00a8
        L_0x00d6:
            int r1 = r9.getTop()
            int r1 = r1 - r5
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0A
            int r0 = r0.getPaddingTop()
            int r1 = r1 - r0
            goto L_0x006c
        L_0x00e3:
            java.lang.String r0 = "null view contained in the view hierarchy"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00ea:
            X.DUP r0 = new X.DUP
            r0.<init>(r5, r4)
            java.util.Arrays.sort(r6, r0)
            r2 = 1
        L_0x00f3:
            if (r2 >= r7) goto L_0x0104
            int r0 = r2 + -1
            r0 = r6[r0]
            r1 = r0[r4]
            r0 = r6[r2]
            r0 = r0[r13]
            if (r1 != r0) goto L_0x011d
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x0104:
            r0 = r6[r13]
            r1 = r0[r4]
            r0 = r0[r13]
            int r1 = r1 - r0
            if (r0 > 0) goto L_0x011d
            int r7 = r7 - r4
            r0 = r6[r7]
            r0 = r0[r4]
            if (r0 >= r1) goto L_0x0115
            goto L_0x011d
        L_0x0115:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r5.A00
            int r0 = r0.A0J()
            if (r0 > r4) goto L_0x013a
        L_0x011d:
            androidx.recyclerview.widget.LinearLayoutManager r4 = r5.A00
            int r2 = r4.A0J()
            r1 = 0
        L_0x0124:
            if (r1 >= r2) goto L_0x013a
            android.view.View r0 = r4.A0P(r1)
            boolean r0 = X.C25493Cgo.A00(r0)
            if (r0 == 0) goto L_0x0137
            java.lang.String r0 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0137:
            int r1 = r1 + 1
            goto L_0x0124
        L_0x013a:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            int r0 = r3.A01
            X.AnonymousClass000.A1L(r1, r0)
            java.lang.String r0 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0150:
            r1 = 0
            if (r2 == 0) goto L_0x0156
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
        L_0x0156:
            r3.A00 = r1
            return
        L_0x0159:
            r3.A02 = r0
            r0 = 0
            r3.A00 = r0
            r0 = 0
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BMH.A01(X.BMH):void");
    }

    public static void A02(BMH bmh, int i) {
        if ((bmh.A00 != 3 || bmh.A02 != 0) && bmh.A02 != i) {
            bmh.A02 = i;
            C6T c6t = bmh.A05;
            if (c6t != null) {
                c6t.A00(i);
            }
        }
    }

    public void A03(RecyclerView recyclerView, int i) {
        C6T c6t;
        C6T c6t2;
        int i2 = this.A00;
        if (!(i2 == 1 && this.A02 == 1) && i == 1) {
            this.A00 = 1;
            int i3 = this.A03;
            if (i3 != -1) {
                this.A01 = i3;
                this.A03 = -1;
            } else if (this.A01 == -1) {
                this.A01 = this.A09.A1O();
            }
            A02(this, 1);
            return;
        }
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        if (!z || i != 2) {
            if (z && i == 0) {
                A01(this);
                boolean z2 = this.A08;
                C24903COw cOw = this.A04;
                if (!z2) {
                    int i4 = cOw.A02;
                    if (!(i4 == -1 || (c6t2 = this.A05) == null)) {
                        c6t2.A02(i4, 0.0f, 0);
                    }
                } else if (cOw.A01 == 0) {
                    int i5 = this.A01;
                    int i6 = cOw.A02;
                    if (!(i5 == i6 || (c6t = this.A05) == null)) {
                        c6t.A01(i6);
                    }
                }
                A02(this, 0);
                A00();
            }
            if (this.A00 == 2 && i == 0 && this.A06) {
                A01(this);
                C24903COw cOw2 = this.A04;
                if (cOw2.A01 == 0) {
                    int i7 = this.A03;
                    int i8 = cOw2.A02;
                    if (i7 != i8) {
                        if (i8 == -1) {
                            i8 = 0;
                        }
                        C6T c6t3 = this.A05;
                        if (c6t3 != null) {
                            c6t3.A01(i8);
                        }
                    }
                    A02(this, 0);
                    A00();
                }
            }
        } else if (this.A08) {
            A02(this, 2);
            this.A07 = true;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.COw] */
    public BMH(ViewPager2 viewPager2) {
        this.A0B = viewPager2;
        RecyclerView recyclerView = viewPager2.A04;
        this.A0A = recyclerView;
        this.A09 = (LinearLayoutManager) recyclerView.getLayoutManager();
        A00();
    }
}
