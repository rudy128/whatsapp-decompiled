package com.google.android.material.floatingactionbutton;

import X.AnonymousClass1YQ;
import X.C27781Xn;
import X.C37891qK;
import X.C41501wV;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class FloatingActionButton$BaseBehavior extends C41501wV {
    public boolean A00;
    public Rect A01;

    public /* bridge */ /* synthetic */ boolean A0B(View view, View view2, CoordinatorLayout coordinatorLayout) {
        AnonymousClass1YQ r3 = (AnonymousClass1YQ) view;
        if (view2 instanceof AppBarLayout) {
            A01(coordinatorLayout, (AppBarLayout) view2, r3);
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!(layoutParams instanceof C37891qK) || !(((C37891qK) layoutParams).A0A instanceof BottomSheetBehavior)) {
            return false;
        }
        A00(view2, r3);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A0O(android.view.View r7, androidx.coordinatorlayout.widget.CoordinatorLayout r8, int r9) {
        /*
            r6 = this;
            X.1YQ r7 = (X.AnonymousClass1YQ) r7
            java.util.List r5 = r8.A0C(r7)
            int r4 = r5.size()
            r3 = 0
        L_0x000b:
            if (r3 >= r4) goto L_0x001f
            java.lang.Object r2 = r5.get(r3)
            android.view.View r2 = (android.view.View) r2
            boolean r0 = r2 instanceof com.google.android.material.appbar.AppBarLayout
            if (r0 == 0) goto L_0x007c
            com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
            boolean r0 = r6.A01(r8, r2, r7)
        L_0x001d:
            if (r0 == 0) goto L_0x0091
        L_0x001f:
            r8.A0F(r7, r9)
            android.graphics.Rect r4 = r7.A0C
            if (r4 == 0) goto L_0x0060
            int r0 = r4.centerX()
            if (r0 <= 0) goto L_0x0060
            int r0 = r4.centerY()
            if (r0 <= 0) goto L_0x0060
            android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r2 = r7.getRight()
            int r1 = r8.getWidth()
            int r0 = r5.rightMargin
            int r1 = r1 - r0
            if (r2 < r1) goto L_0x006e
            int r3 = r4.right
        L_0x0047:
            int r2 = r7.getBottom()
            int r1 = r8.getHeight()
            int r0 = r5.bottomMargin
            int r1 = r1 - r0
            if (r2 < r1) goto L_0x0062
            int r0 = r4.bottom
        L_0x0056:
            if (r0 == 0) goto L_0x005b
            X.AnonymousClass1HF.A0a(r7, r0)
        L_0x005b:
            if (r3 == 0) goto L_0x0060
            X.AnonymousClass1HF.A0Z(r7, r3)
        L_0x0060:
            r0 = 1
            return r0
        L_0x0062:
            int r1 = r7.getTop()
            int r0 = r5.topMargin
            if (r1 > r0) goto L_0x005b
            int r0 = r4.top
            int r0 = -r0
            goto L_0x0056
        L_0x006e:
            int r1 = r7.getLeft()
            int r0 = r5.leftMargin
            if (r1 > r0) goto L_0x007a
            int r0 = r4.left
            int r3 = -r0
            goto L_0x0047
        L_0x007a:
            r3 = 0
            goto L_0x0047
        L_0x007c:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof X.C37891qK
            if (r0 == 0) goto L_0x0091
            X.1qK r1 = (X.C37891qK) r1
            X.1wV r0 = r1.A0A
            boolean r0 = r0 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r0 == 0) goto L_0x0091
            boolean r0 = r6.A00(r2, r7)
            goto L_0x001d
        L_0x0091:
            int r3 = r3 + 1
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior.A0O(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27781Xn.A0G);
        this.A00 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r7.A00 != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A00(android.view.View r6, X.AnonymousClass1YQ r7) {
        /*
            r5 = this;
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            X.1qK r1 = (X.C37891qK) r1
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0017
            int r1 = r1.A05
            int r0 = r6.getId()
            if (r1 != r0) goto L_0x0017
            int r0 = r7.A00
            r1 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            r4 = 0
            if (r1 != 0) goto L_0x001c
            return r4
        L_0x001c:
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r2 = r6.getTop()
            int r0 = r7.getHeight()
            int r1 = r0 / 2
            int r0 = r3.topMargin
            int r1 = r1 + r0
            if (r2 >= r1) goto L_0x0036
            r7.A04(r4)
        L_0x0034:
            r0 = 1
            return r0
        L_0x0036:
            r7.A05(r4)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior.A00(android.view.View, X.1YQ):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r7.A00 != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A01(androidx.coordinatorlayout.widget.CoordinatorLayout r5, com.google.android.material.appbar.AppBarLayout r6, X.AnonymousClass1YQ r7) {
        /*
            r4 = this;
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            X.1qK r1 = (X.C37891qK) r1
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0017
            int r1 = r1.A05
            int r0 = r6.getId()
            if (r1 != r0) goto L_0x0017
            int r0 = r7.A00
            r1 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            r3 = 0
            if (r1 != 0) goto L_0x001c
            return r3
        L_0x001c:
            android.graphics.Rect r2 = r4.A01
            if (r2 != 0) goto L_0x0027
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r4.A01 = r2
        L_0x0027:
            int r1 = r6.getWidth()
            int r0 = r6.getHeight()
            r2.set(r3, r3, r1, r0)
            X.C25923Coh.A01(r2, r6, r5)
            int r1 = r2.bottom
            int r0 = r6.getMinimumHeightForVisibleOverlappingContent()
            if (r1 > r0) goto L_0x0042
            r7.A04(r3)
        L_0x0040:
            r0 = 1
            return r0
        L_0x0042:
            r7.A05(r3)
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior.A01(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, X.1YQ):boolean");
    }

    public FloatingActionButton$BaseBehavior() {
        this.A00 = true;
    }
}
