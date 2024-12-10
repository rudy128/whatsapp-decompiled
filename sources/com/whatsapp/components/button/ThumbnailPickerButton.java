package com.whatsapp.components.button;

import X.AnonymousClass3MW;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;

public class ThumbnailPickerButton extends ThumbnailButton {
    public boolean A00;
    public final Path A01;

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        this.A01 = new Path();
    }

    public void A06(Canvas canvas) {
        super.A06(canvas);
        if (isEnabled()) {
            float f = this.A01;
            if (f > 0.0f) {
                float f2 = f * 7.0f;
                Path path = this.A01;
                path.reset();
                this.A04.setStyle(Paint.Style.FILL);
                RectF rectF = this.A09;
                path.moveTo(rectF.right, rectF.bottom - f2);
                path.lineTo(rectF.right, rectF.bottom - this.A01);
                float f3 = rectF.right;
                float f4 = this.A01 * 2.0f;
                float f5 = rectF.bottom;
                path.arcTo(new RectF(f3 - f4, f5 - f4, f3, f5), 0.0f, 90.0f);
                path.lineTo(rectF.right - f2, rectF.bottom);
                path.lineTo(rectF.right, rectF.bottom - f2);
                this.A04.setColor(1409286144);
                canvas.drawPath(path, this.A04);
                path.reset();
                path.moveTo(rectF.right, rectF.bottom - f2);
                path.lineTo(rectF.right - f2, rectF.bottom);
                AnonymousClass3MW.A1P(this.A04);
                this.A04.setStrokeJoin(Paint.Join.ROUND);
                this.A04.setStrokeCap(Paint.Cap.ROUND);
                this.A04.setStrokeWidth(getResources().getDimension(2131169022));
                this.A04.setColor(-570425345);
                canvas.drawPath(path, this.A04);
            }
        }
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        this.A01 = new Path();
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    public ThumbnailPickerButton(Context context) {
        super(context);
        A05();
        this.A01 = new Path();
    }
}
