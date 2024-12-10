package com.whatsapp;

import X.C18000vb;
import X.C29461cJ;
import X.C29471cL;
import X.C60312no;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class WaImageView extends C29461cJ {
    public C18000vb A00;
    public boolean A01;

    public WaImageView(Context context) {
        super(context, (AttributeSet) null);
        A05();
    }

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && this.A00 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29471cL.A03);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                setContentDescription(this.A00.A09(resourceId));
            }
            this.A01 = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        C18000vb r0;
        if (!this.A01 || (r0 = this.A00) == null) {
            z = false;
        } else {
            z = C18000vb.A00(r0).A06;
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, ((float) super.getWidth()) * 0.5f, ((float) super.getHeight()) * 0.5f);
            }
        }
        try {
            super.onDraw(canvas);
            if (this.A01 && z) {
                canvas.restore();
            }
        } catch (RuntimeException e) {
            C60312no.A01(this, "waimageview/");
            throw e;
        }
    }

    public void setMirrorForRtl(boolean z) {
        this.A01 = z;
    }

    public WaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        A00(context, attributeSet);
    }

    public WaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }
}
