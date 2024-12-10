package X;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior;

/* renamed from: X.1wV  reason: invalid class name and case insensitive filesystem */
public abstract class C41501wV {
    public void A09(View view, CoordinatorLayout coordinatorLayout) {
    }

    public boolean A0A(Rect rect, View view, CoordinatorLayout coordinatorLayout, boolean z) {
        return false;
    }

    public boolean A0B(View view, View view2, CoordinatorLayout coordinatorLayout) {
        return false;
    }

    public boolean A0C(View view, View view2) {
        return false;
    }

    public void A0E() {
    }

    public void A0F(Parcelable parcelable) {
    }

    public void A0I(View view, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public boolean A0K(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        return false;
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        return false;
    }

    public boolean A0N(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        return false;
    }

    public boolean A0O(View view, CoordinatorLayout coordinatorLayout, int i) {
        return false;
    }

    public boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3) {
        return false;
    }

    public void A0J(C37891qK r2) {
        if (((this instanceof FloatingActionButton$BaseBehavior) || (this instanceof ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior)) && r2.A01 == 0) {
            r2.A01 = 80;
        }
    }

    public Parcelable A0D(View view) {
        return AbsSavedState.EMPTY_STATE;
    }

    public void A0G(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
    }

    public boolean A0M(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        return false;
    }

    public void A0H(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
    }
}
