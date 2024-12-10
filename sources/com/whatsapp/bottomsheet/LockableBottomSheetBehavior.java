package com.whatsapp.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class LockableBottomSheetBehavior extends BottomSheetBehavior {
    public boolean A00 = true;

    public void A0G(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
        if (this.A00) {
            super.A0G(view, view2, coordinatorLayout, i);
        }
    }

    public void A0H(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        if (this.A00) {
            super.A0H(view, view2, coordinatorLayout, iArr, i, i2, i3);
        }
    }

    public boolean A0K(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A00) {
            return false;
        }
        return super.A0K(motionEvent, view, coordinatorLayout);
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A00) {
            return false;
        }
        return super.A0L(motionEvent, view, coordinatorLayout);
    }

    public boolean A0N(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        if (!this.A00) {
            return false;
        }
        return super.A0N(view, view2, coordinatorLayout, f, f2);
    }

    public LockableBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LockableBottomSheetBehavior() {
    }
}
