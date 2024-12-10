package com.google.android.material.floatingactionbutton;

import X.AnonymousClass000;
import X.C27781Xn;
import X.C37891qK;
import X.C41501wV;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends C41501wV {
    public /* bridge */ /* synthetic */ boolean A0O(View view, CoordinatorLayout coordinatorLayout, int i) {
        List A0C = coordinatorLayout.A0C((View) null);
        int size = A0C.size();
        int i2 = 0;
        while (i2 < size) {
            View view2 = (View) A0C.get(i2);
            if (view2 instanceof AppBarLayout) {
                throw AnonymousClass000.A0s("getLayoutParams");
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof C37891qK) || !(((C37891qK) layoutParams).A0A instanceof BottomSheetBehavior)) {
                i2++;
            } else {
                throw AnonymousClass000.A0s("getLayoutParams");
            }
        }
        coordinatorLayout.A0F((View) null, i);
        return true;
    }

    public /* bridge */ /* synthetic */ boolean A0B(View view, View view2, CoordinatorLayout coordinatorLayout) {
        if (!(view2 instanceof AppBarLayout)) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof C37891qK) || !(((C37891qK) layoutParams).A0A instanceof BottomSheetBehavior)) {
                return false;
            }
        }
        throw AnonymousClass000.A0s("getLayoutParams");
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27781Xn.A0E);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }
}
