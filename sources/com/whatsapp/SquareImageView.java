package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C110755h2;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class SquareImageView extends C110755h2 {
    public int A00;
    public Drawable A01;

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A0P)) != null) {
            if (obtainStyledAttributes.hasValue(0)) {
                this.A00 = obtainStyledAttributes.getInt(0, this.A00);
            }
            setSelector(obtainStyledAttributes.getDrawable(1));
            obtainStyledAttributes.recycle();
        }
    }

    public void onMeasure(int i, int i2) {
        int defaultSize;
        int i3 = this.A00;
        if (i3 == 0) {
            defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        } else if (i3 == 1) {
            defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        } else {
            throw AnonymousClass001.A13("Illegal value: ", AnonymousClass000.A10(), i3);
        }
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.A01 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.A01 || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A00 = 0;
        A00(context, attributeSet);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A01;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
        A00(context, attributeSet);
    }

    public SquareImageView(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A00 = 0;
    }
}
