package com.google.android.material.bottomappbar;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.BE8;
import X.C26581D4v;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior {
    public WeakReference A00;
    public final Rect A01 = AnonymousClass3MW.A07();
    public final View.OnLayoutChangeListener A02 = new C26581D4v(this, 2);

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public /* bridge */ /* synthetic */ boolean A0O(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A00 = BE8.A0m();
        throw AnonymousClass000.A0s("findDependentView");
    }

    public BottomAppBar$Behavior() {
    }
}
