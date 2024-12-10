package com.whatsapp;

import X.C19740yt;
import X.C27641Ww;
import X.C27831Xu;
import X.C73143Qb;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class WaLinearLayout extends C73143Qb {
    public int A00 = 0;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A0V);
            this.A00 = obtainStyledAttributes.getResourceId(1, 0);
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            Drawable background = getBackground();
            if (!(background == null || this.A00 == 0)) {
                setBackground(background);
            }
            obtainStyledAttributes.recycle();
            if (z) {
                setLayoutDirection(0);
                setTag(2131428112, C27641Ww.A00);
            }
        }
    }

    public void setBackground(Drawable drawable) {
        if (!(this.A00 == 0 || drawable == null)) {
            drawable = C27831Xu.A02(drawable);
            C27831Xu.A0C(drawable, C19740yt.A00(getContext(), this.A00));
        }
        super.setBackground(drawable);
    }

    public WaLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public WaLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00(context, attributeSet);
    }

    public WaLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        A00(context, attributeSet);
    }

    public WaLinearLayout(Context context) {
        super(context);
        A01();
    }
}
