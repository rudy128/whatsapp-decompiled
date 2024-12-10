package com.google.android.material.transformation;

import X.AnonymousClass1YP;
import X.AnonymousClass1YQ;
import X.C41501wV;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public abstract class ExpandableBehavior extends C41501wV {
    public int A00 = 0;

    public abstract boolean A0Q(View view, View view2, boolean z, boolean z2);

    public boolean A0B(View view, View view2, CoordinatorLayout coordinatorLayout) {
        int i;
        AnonymousClass1YP r6 = (AnonymousClass1YP) view2;
        boolean z = ((AnonymousClass1YQ) r6).A0D.A01;
        int i2 = this.A00;
        if (!z) {
            i = 2;
            if (i2 != 1) {
                return false;
            }
        } else if (i2 != 0 && i2 != 2) {
            return false;
        } else {
            i = 1;
        }
        this.A00 = i;
        return A0Q((View) r6, view, z, true);
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r3 != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0O(android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7, int r8) {
        /*
            r5 = this;
            boolean r0 = r6.isLaidOut()
            if (r0 != 0) goto L_0x0044
            java.util.List r3 = r7.A0C(r6)
            int r2 = r3.size()
            r1 = 0
        L_0x000f:
            if (r1 >= r2) goto L_0x0044
            java.lang.Object r4 = r3.get(r1)
            android.view.View r4 = (android.view.View) r4
            boolean r0 = r5.A0C(r6, r4)
            if (r0 == 0) goto L_0x0046
            X.1YP r4 = (X.AnonymousClass1YP) r4
            if (r4 == 0) goto L_0x0044
            r0 = r4
            X.1YQ r0 = (X.AnonymousClass1YQ) r0
            X.1Yw r0 = r0.A0D
            boolean r3 = r0.A01
            r1 = 1
            int r0 = r5.A00
            if (r3 == 0) goto L_0x0030
            if (r0 == 0) goto L_0x0035
            r1 = 2
        L_0x0030:
            if (r0 != r1) goto L_0x0044
            r2 = 2
            if (r3 == 0) goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            r5.A00 = r2
            android.view.ViewTreeObserver r1 = r6.getViewTreeObserver()
            X.D5H r0 = new X.D5H
            r0.<init>(r6, r4, r5, r2)
            r1.addOnPreDrawListener(r0)
        L_0x0044:
            r0 = 0
            return r0
        L_0x0046:
            int r1 = r1 + 1
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.ExpandableBehavior.A0O(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
    }

    public ExpandableBehavior() {
    }
}
