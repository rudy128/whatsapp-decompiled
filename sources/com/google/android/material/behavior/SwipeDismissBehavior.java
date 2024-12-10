package com.google.android.material.behavior;

import X.AnonymousClass1HF;
import X.BEA;
import X.BIE;
import X.BLC;
import X.C24495C6n;
import X.C26137Ct0;
import X.C26281Cwc;
import X.C28518E5i;
import X.C41501wV;
import X.D6Y;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

public class SwipeDismissBehavior extends C41501wV {
    public float A00 = 0.5f;
    public float A01 = 0.0f;
    public int A02 = 2;
    public C26281Cwc A03;
    public C28518E5i A04;
    public boolean A05;
    public boolean A06;
    public final C24495C6n A07 = new BLC(this);

    public boolean A0O(View view, CoordinatorLayout coordinatorLayout, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AnonymousClass1HF.A0b(view, 1048576);
            if (!(this instanceof BaseTransientBottomBar$Behavior) || (view instanceof BIE)) {
                AnonymousClass1HF.A0m(view, C26137Ct0.A0D, new D6Y(this, 2), (CharSequence) null);
            }
        }
        return false;
    }

    public boolean A0K(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        boolean z = this.A06;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = BEA.A1W(motionEvent, view, coordinatorLayout);
            this.A06 = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A06 = false;
        }
        if (!z) {
            return false;
        }
        C26281Cwc cwc = this.A03;
        if (cwc == null) {
            cwc = C26281Cwc.A01(coordinatorLayout, this.A07);
            this.A03 = cwc;
        }
        if (this.A05 || !cwc.A0H(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A03 == null) {
            return false;
        }
        if (this.A05 && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.A03.A0D(motionEvent);
        return true;
    }
}
