package com.whatsapp.ui.media;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

public final class WrappingGridView extends GridView {
    public WrappingGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onMeasure(int i, int i2) {
        if (getLayoutParams().height == -2) {
            i2 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public WrappingGridView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WrappingGridView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? 0 : i);
    }

    public WrappingGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
