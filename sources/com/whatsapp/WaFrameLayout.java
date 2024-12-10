package com.whatsapp;

import X.AnonymousClass3MY;
import X.AnonymousClass3Pe;
import X.C27831Xu;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class WaFrameLayout extends AnonymousClass3Pe {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;

    private void A02(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.A04 = isPressed();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A0U);
            this.A01 = obtainStyledAttributes.getResourceId(1, 0);
            this.A00 = obtainStyledAttributes.getResourceId(0, 0);
            if (!(getBackground() == null || this.A01 == 0)) {
                setBackgroundDrawable(getBackground());
            }
            this.A03 = obtainStyledAttributes.getResourceId(3, 0);
            this.A02 = obtainStyledAttributes.getResourceId(2, 0);
            if (!(getForeground() == null || this.A03 == 0)) {
                setForeground(getForeground());
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        int i;
        if (!(this.A01 == 0 || drawable == null)) {
            drawable = C27831Xu.A02(drawable);
            if (!isPressed() || (i = this.A00) == 0) {
                i = this.A01;
            }
            C27831Xu.A0C(drawable, AnonymousClass3MY.A02(this, i));
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setForeground(Drawable drawable) {
        int i;
        if (!(this.A03 == 0 || drawable == null)) {
            drawable = C27831Xu.A02(drawable);
            if (!isPressed() || (i = this.A02) == 0) {
                i = this.A03;
            }
            C27831Xu.A0C(drawable, AnonymousClass3MY.A02(this, i));
        }
        super.setForeground(drawable);
    }

    public WaFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass3Pe.A01(this);
        A02(context, attributeSet);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (isPressed() != this.A04) {
            this.A04 = isPressed();
            setBackgroundDrawable(getBackground());
            setForeground(getForeground());
        }
    }

    public WaFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A04();
        AnonymousClass3Pe.A01(this);
        A02(context, attributeSet);
    }

    public WaFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A04();
        AnonymousClass3Pe.A01(this);
    }

    public WaFrameLayout(Context context) {
        super(context);
        A04();
        AnonymousClass3Pe.A01(this);
    }
}
