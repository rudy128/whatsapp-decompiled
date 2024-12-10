package com.google.android.material.behavior;

import X.AnonymousClass000;
import X.AnonymousClass1YW;
import X.AnonymousClass1Z9;
import X.AnonymousClass3MW;
import X.BEQ;
import X.C17880vN;
import X.C29101bc;
import X.C41501wV;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior extends C41501wV {
    public int A00 = 2;
    public int A01;
    public int A02;
    public int A03 = 0;
    public TimeInterpolator A04;
    public TimeInterpolator A05;
    public ViewPropertyAnimator A06;
    public final LinkedHashSet A07 = C17880vN.A14();

    public void A0I(View view, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        TimeInterpolator timeInterpolator;
        ViewPropertyAnimator viewPropertyAnimator;
        long j;
        float f;
        if (i > 0) {
            if (this.A00 != 1) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.A06;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.A00 = 1;
                Iterator it = this.A07.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass000.A0s("onStateChanged");
                }
                int i4 = this.A03;
                j = (long) this.A02;
                timeInterpolator = this.A05;
                viewPropertyAnimator = view.animate();
                f = (float) i4;
            } else {
                return;
            }
        } else if (i < 0 && this.A00 != 2) {
            ViewPropertyAnimator viewPropertyAnimator3 = this.A06;
            if (viewPropertyAnimator3 != null) {
                viewPropertyAnimator3.cancel();
                view.clearAnimation();
            }
            this.A00 = 2;
            Iterator it2 = this.A07.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw AnonymousClass000.A0s("onStateChanged");
            }
            j = (long) this.A01;
            timeInterpolator = this.A04;
            viewPropertyAnimator = view.animate();
            f = 0.0f;
        } else {
            return;
        }
        this.A06 = viewPropertyAnimator.translationY(f).setInterpolator(timeInterpolator).setDuration(j).setListener(new BEQ(this, 8));
    }

    public boolean A0M(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        if (!(this instanceof BottomAppBar$Behavior)) {
            return AnonymousClass000.A1T(i, 2);
        }
        throw AnonymousClass000.A0s("getHideOnScroll");
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }

    public boolean A0O(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A03 = view.getMeasuredHeight() + AnonymousClass3MW.A0B(view).bottomMargin;
        this.A01 = AnonymousClass1Z9.A00(view.getContext(), 2130970532, 225);
        this.A02 = AnonymousClass1Z9.A00(view.getContext(), 2130970538, 175);
        this.A04 = C29101bc.A01(AnonymousClass1YW.A04, view.getContext(), 2130970548);
        this.A05 = C29101bc.A01(AnonymousClass1YW.A01, view.getContext(), 2130970548);
        return false;
    }

    public HideBottomViewOnScrollBehavior() {
    }
}
