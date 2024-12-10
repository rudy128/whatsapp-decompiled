package com.whatsapp.components;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass3MW;
import X.C18000vb;
import X.C72473Md;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ScalingFrameLayout extends FrameLayout implements AnonymousClass009 {
    public float A00;
    public C18000vb A01;
    public AnonymousClass031 A02;
    public boolean A03;

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public ScalingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A00 = 1.0f;
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (AnonymousClass3MW.A1Z(this.A01)) {
            canvas.translate((float) getWidth(), 0.0f);
        }
        float f = this.A00;
        canvas.scale(f, f);
        if (AnonymousClass3MW.A1Z(this.A01)) {
            canvas.translate((float) (-getWidth()), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i)) / this.A00), mode), View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i2)) / this.A00), mode2));
        setMeasuredDimension((int) (((float) getMeasuredWidth()) * this.A00), (int) (((float) getMeasuredHeight()) * this.A00));
    }

    public void setScale(float f) {
        this.A00 = f;
    }

    public ScalingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A00 = 1.0f;
    }

    public ScalingFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        this.A00 = 1.0f;
    }

    public ScalingFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public ScalingFrameLayout(Context context) {
        super(context);
        A00();
        this.A00 = 1.0f;
    }
}
