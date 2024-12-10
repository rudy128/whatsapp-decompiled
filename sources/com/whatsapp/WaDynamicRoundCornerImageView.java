package com.whatsapp;

import X.AnonymousClass3Ma;
import X.C42491yG;
import X.C75313gs;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewOutlineProvider;

public class WaDynamicRoundCornerImageView extends C75313gs {
    public float A00;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A0T);
            try {
                setRadius(obtainStyledAttributes.getDimension(0, TypedValue.applyDimension(1, 4.0f, AnonymousClass3Ma.A09(this))));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setRadius(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            if (f == 0.0f) {
                if (getClipToOutline()) {
                    setClipToOutline(false);
                }
                setOutlineProvider((ViewOutlineProvider) null);
            } else {
                C42491yG.A05(this, f);
            }
            invalidateOutline();
        }
    }

    public WaDynamicRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public WaDynamicRoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        A00(context, attributeSet);
    }

    public WaDynamicRoundCornerImageView(Context context) {
        super(context);
        A05();
    }
}
