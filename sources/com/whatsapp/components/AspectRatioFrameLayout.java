package com.whatsapp.components;

import X.C110405fa;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public class AspectRatioFrameLayout extends C110405fa {
    public float A00;

    public void A03(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C84144If.A00, 0, 0);
            try {
                this.A00 = obtainStyledAttributes.getFloat(0, this.A00);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        this.A00 = 1.0f;
        A03(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i)) / this.A00), 1073741824);
        } else if (mode2 == 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i2)) * this.A00), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
