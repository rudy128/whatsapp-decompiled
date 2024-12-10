package com.whatsapp.calling.views;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class VoipCallControlRingingDotsIndicator extends View implements AnonymousClass009 {
    public int A00;
    public int A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public final float[] A04;
    public final Paint A05;

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
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

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A04 = new float[3];
        this.A05 = AnonymousClass3MZ.A0A();
        A00(context);
    }

    private void A00(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165593);
        this.A01 = dimensionPixelSize;
        this.A00 = dimensionPixelSize * 2;
        this.A05.setColor(AnonymousClass3MZ.A02(getContext(), getContext(), 2130971957, 17170443));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        do {
            Paint paint = this.A05;
            paint.setAlpha((int) (this.A04[i] * 255.0f));
            int i2 = this.A01;
            float f = (float) i2;
            canvas.drawCircle((float) ((this.A00 * 2 * i) + i2), f, f, paint);
            i++;
        } while (i < 3);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.A00;
        setMeasuredDimension(i3 * 5, i3);
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A04 = new float[3];
        this.A05 = AnonymousClass3MZ.A0A();
        A00(context);
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        this.A04 = new float[3];
        this.A05 = AnonymousClass3MZ.A0A();
        A00(context);
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public VoipCallControlRingingDotsIndicator(Context context) {
        super(context);
        A01();
        this.A04 = new float[3];
        this.A05 = AnonymousClass3MZ.A0A();
        A00(context);
    }
}
