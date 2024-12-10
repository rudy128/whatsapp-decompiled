package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.List;

public abstract class BiQ extends BJV {
    public int A00;
    public int A01 = 0;
    public final Rect A02 = AnonymousClass3MW.A07();
    public final Rect A03 = AnonymousClass3MW.A07();

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0Q(android.view.View r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            r4 = 0
            if (r0 == 0) goto L_0x0043
            boolean r0 = r6 instanceof com.google.android.material.appbar.AppBarLayout
            if (r0 == 0) goto L_0x002b
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            int r3 = r6.getTotalScrollRange()
            int r2 = r6.getDownNestedPreScrollRange()
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            X.1qK r0 = (X.C37891qK) r0
            X.1wV r1 = r0.A0A
            boolean r0 = r1 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
            if (r0 == 0) goto L_0x0041
            X.BiR r1 = (X.C23511BiR) r1
            int r1 = r1.A0Q()
        L_0x0025:
            if (r2 == 0) goto L_0x0037
            int r0 = r3 + r1
            if (r0 > r2) goto L_0x0037
        L_0x002b:
            r1 = 0
        L_0x002c:
            int r2 = r5.A00
            float r0 = (float) r2
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r0 < r4) goto L_0x0043
            r4 = r0
            if (r0 <= r2) goto L_0x0043
            return r2
        L_0x0037:
            int r3 = r3 - r2
            if (r3 == 0) goto L_0x002b
            float r1 = (float) r1
            float r0 = (float) r3
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            goto L_0x002c
        L_0x0041:
            r1 = 0
            goto L_0x0025
        L_0x0043:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BiQ.A0Q(android.view.View):int");
    }

    public BiQ(Context context, AttributeSet attributeSet) {
        this.A00 = 0;
    }

    public boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3) {
        AnonymousClass1HO r0;
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        List A0C = coordinatorLayout.A0C(view);
        int size = A0C.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) A0C.get(i5);
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout == null) {
                    return false;
                }
                int size2 = View.MeasureSpec.getSize(i3);
                if (size2 <= 0) {
                    size2 = coordinatorLayout.getHeight();
                } else if (appBarLayout.getFitsSystemWindows() && (r0 = coordinatorLayout.A02) != null) {
                    size2 += r0.A05() + r0.A02();
                }
                int totalScrollRange = size2 + appBarLayout.getTotalScrollRange();
                int measuredHeight = appBarLayout.getMeasuredHeight();
                if (this instanceof SearchBar$ScrollingViewBehavior) {
                    view.setTranslationY((float) (-measuredHeight));
                } else {
                    view.setTranslationY(0.0f);
                    totalScrollRange -= measuredHeight;
                }
                int i6 = Integer.MIN_VALUE;
                if (i4 == -1) {
                    i6 = 1073741824;
                }
                coordinatorLayout.A0G(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i6));
                return true;
            }
        }
        return false;
    }

    public BiQ() {
    }
}
