package com.whatsapp.camera.overlays;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass7R9;
import X.C108945cZ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

public class ZoomOverlay extends View implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public final Paint A02;
    public final RectF A03;
    public final TextPaint A04;
    public final Runnable A05;

    private void A00(Context context) {
        Paint paint = this.A02;
        paint.setStrokeWidth(context.getResources().getDimension(2131169590));
        AnonymousClass3MW.A1P(paint);
        TextPaint textPaint = this.A04;
        textPaint.setTextSize(context.getResources().getDimension(2131169592));
        textPaint.setColor(-1711276033);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setFakeBoldText(true);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass3MW.A08();
        this.A02 = C108945cZ.A0K(1);
        this.A04 = new TextPaint(1);
        this.A05 = new AnonymousClass7R9((Object) this, 33);
        A00(context);
    }

    public float getMaxScale() {
        return (((float) Math.min(getWidth() / 2, C108945cZ.A06(this))) * 0.9f) / this.A04.measureText("x00.0");
    }

    public void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int A06 = C108945cZ.A06(this);
        float min = ((float) Math.min(width, A06)) * 0.9f;
        Paint paint = this.A02;
        paint.setColor(-1711276033);
        RectF rectF = this.A03;
        float f = (float) width;
        float f2 = (float) A06;
        rectF.set(f - min, f2 - min, f + min, f2 + min);
        canvas.drawOval(rectF, paint);
        float measureText = this.A04.measureText("x00.0");
        rectF.set(f - measureText, f2 - measureText, f + measureText, f2 + measureText);
        canvas.drawOval(rectF, paint);
        float min2 = Math.min(min, measureText * 0.0f);
        paint.setColor(-13388315);
        rectF.set(f - min2, f2 - min2, f + min2, f2 + min2);
        canvas.drawOval(rectF, paint);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass3MW.A08();
        this.A02 = C108945cZ.A0K(1);
        this.A04 = new TextPaint(1);
        this.A05 = new AnonymousClass7R9((Object) this, 33);
        A00(context);
    }

    public ZoomOverlay(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass3MW.A08();
        this.A02 = C108945cZ.A0K(1);
        this.A04 = new TextPaint(1);
        this.A05 = new AnonymousClass7R9((Object) this, 33);
        A00(context);
    }
}
