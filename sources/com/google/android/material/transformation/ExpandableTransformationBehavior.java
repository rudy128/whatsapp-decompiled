package com.google.android.material.transformation;

import X.AnonymousClass000;
import X.AnonymousClass2SX;
import X.BEQ;
import X.C108945cZ;
import X.C28001Yl;
import X.C72553Mn;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet A00;

    public AnimatorSet A0R(View view, View view2, boolean z, boolean z2) {
        C28001Yl r4;
        Property property;
        float[] fArr;
        FabTransformationScrimBehavior fabTransformationScrimBehavior = (FabTransformationScrimBehavior) this;
        ArrayList A13 = AnonymousClass000.A13();
        if (z) {
            r4 = fabTransformationScrimBehavior.A01;
        } else {
            r4 = fabTransformationScrimBehavior.A00;
        }
        float f = 0.0f;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            property = View.ALPHA;
            fArr = new float[1];
            f = 1.0f;
        } else {
            property = View.ALPHA;
            fArr = new float[1];
        }
        ObjectAnimator A0C = C108945cZ.A0C(property, view2, fArr, f, 0);
        r4.A00(A0C);
        A13.add(A0C);
        AnimatorSet animatorSet = new AnimatorSet();
        AnonymousClass2SX.A00(animatorSet, A13);
        animatorSet.addListener(new C72553Mn(view2, fabTransformationScrimBehavior, 0, z));
        return animatorSet;
    }

    public boolean A0Q(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.A00;
        boolean z3 = false;
        if (animatorSet != null) {
            z3 = true;
            animatorSet.cancel();
        }
        AnimatorSet A0R = A0R(view, view2, z, z3);
        this.A00 = A0R;
        BEQ.A00(A0R, this, 19);
        this.A00.start();
        if (!z2) {
            this.A00.end();
        }
        return true;
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        this.A00 = 0;
    }

    public ExpandableTransformationBehavior() {
    }
}
