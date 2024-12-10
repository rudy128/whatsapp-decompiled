package com.whatsapp;

import X.AnonymousClass3Ma;
import X.C72483Me;
import X.C84144If;
import X.C90384dz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;

public class WaRoundCornerImageView extends WaImageView {
    public float A00;
    public Path A01;
    public C90384dz A02;
    public boolean A03;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A0X);
            try {
                this.A00 = obtainStyledAttributes.getDimension(0, TypedValue.applyDimension(1, 4.0f, AnonymousClass3Ma.A09(this)));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.A02 = new C90384dz(this);
    }

    public void A05() {
        if (!this.A03) {
            this.A03 = true;
            C72483Me.A0x(this);
        }
    }

    public void onDraw(Canvas canvas) {
        Path path = this.A01;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    public WaRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        A00(context, attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
    }

    public void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this.A02);
        super.onDetachedFromWindow();
    }

    public WaRoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        A00(context, attributeSet);
    }

    public WaRoundCornerImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    public WaRoundCornerImageView(Context context) {
        super(context);
        A05();
        A00(context, (AttributeSet) null);
    }
}
