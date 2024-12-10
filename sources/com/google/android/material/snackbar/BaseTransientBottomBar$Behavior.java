package com.google.android.material.snackbar;

import X.BE8;
import X.BEA;
import X.C26218Cv5;
import X.C55;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final C55 A00;

    public boolean A0K(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C55 c55 = this.A00;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C26218Cv5.A00().A06(c55.A00);
            }
        } else if (BEA.A1W(motionEvent, view, coordinatorLayout)) {
            C26218Cv5.A00().A05(c55.A00);
        }
        return super.A0K(motionEvent, view, coordinatorLayout);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.C55, java.lang.Object] */
    public BaseTransientBottomBar$Behavior() {
        ? obj = new Object();
        this.A01 = BE8.A00(0.0f, 0.1f, 1.0f);
        this.A00 = BE8.A00(0.0f, 0.6f, 1.0f);
        this.A02 = 0;
        this.A00 = obj;
    }
}
