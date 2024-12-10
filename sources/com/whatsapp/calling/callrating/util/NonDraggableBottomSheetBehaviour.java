package com.whatsapp.calling.callrating.util;

import X.AnonymousClass1Y1;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.bottomsheet.LockableBottomSheetBehavior;

public final class NonDraggableBottomSheetBehaviour extends LockableBottomSheetBehavior {
    public boolean A0N(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        C18070vi.A0d(view2, 2);
        if (!this.A00 || !super.A0N(view, view2, coordinatorLayout, f, f2)) {
            return false;
        }
        return true;
    }

    public void A0G(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
        C18070vi.A0n(coordinatorLayout, view, view2);
        if (this.A00) {
            super.A0G(view, view2, coordinatorLayout, i);
        }
    }

    public void A0H(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        C18070vi.A0n(coordinatorLayout, view, view2);
        C18070vi.A0d(iArr, 5);
        if (this.A00) {
            super.A0H(view, view2, coordinatorLayout, iArr, i, i2, i3);
        }
    }

    public boolean A0K(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C18070vi.A0n(coordinatorLayout, view, motionEvent);
        if (!this.A00 || !super.A0K(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C18070vi.A0n(coordinatorLayout, view, motionEvent);
        if (!this.A00 || !super.A0L(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }

    public NonDraggableBottomSheetBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NonDraggableBottomSheetBehaviour(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r6) {
        super((i & 1) != 0 ? null : context, (i & 2) != 0 ? null : attributeSet);
    }

    public NonDraggableBottomSheetBehaviour() {
        super((Context) null, (AttributeSet) null);
    }
}
