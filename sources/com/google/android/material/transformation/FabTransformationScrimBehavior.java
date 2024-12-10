package com.google.android.material.transformation;

import X.AnonymousClass1YQ;
import X.C28001Yl;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final C28001Yl A00 = new C28001Yl(0);
    public final C28001Yl A01 = new C28001Yl(75);

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        this.A00 = 0;
    }

    public boolean A0C(View view, View view2) {
        return view2 instanceof AnonymousClass1YQ;
    }

    public FabTransformationScrimBehavior() {
    }
}
