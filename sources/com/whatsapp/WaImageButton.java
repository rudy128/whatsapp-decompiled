package com.whatsapp;

import X.AnonymousClass3MW;
import X.C18000vb;
import X.C29471cL;
import X.C73213Ro;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class WaImageButton extends C73213Ro {
    public C18000vb A00;
    public boolean A01;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29471cL.A02);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (!isInEditMode() && resourceId != 0) {
                setContentDescription(this.A00.A09(resourceId));
            }
            this.A01 = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        if (this.A01) {
            z = AnonymousClass3MW.A1Z(this.A00);
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, ((float) super.getWidth()) * 0.5f, ((float) super.getHeight()) * 0.5f);
            }
        } else {
            z = false;
        }
        super.onDraw(canvas);
        if (this.A01 && z) {
            canvas.restore();
        }
    }

    public WaImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public WaImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00(context, attributeSet);
    }

    public WaImageButton(Context context) {
        super(context, (AttributeSet) null);
        A01();
    }
}
