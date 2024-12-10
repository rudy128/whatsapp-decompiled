package com.whatsapp.status.playback.widget;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.C108945cZ;
import X.C108985cd;
import X.C18070vi;
import X.C72473Md;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public final class AudioVolumeView extends View implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public float A01;
    public boolean A02;
    public final Paint A03;
    public final Path A04;
    public final RectF A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioVolumeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A01();
        this.A03 = C108945cZ.A0K(1);
        this.A05 = AnonymousClass3MW.A08();
        this.A04 = C108945cZ.A0L();
        A00(context);
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas, 0);
        super.onDraw(canvas);
        float A042 = (float) C72473Md.A04(this);
        float f = 1.5f * A042;
        RectF rectF = this.A05;
        rectF.set(0.0f, (A042 - f) / 2.0f, f, (A042 + f) / 2.0f);
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        Paint paint = this.A03;
        float strokeWidth = paint.getStrokeWidth();
        Path path = this.A04;
        path.reset();
        float f2 = A042 / 3.0f;
        path.moveTo(strokeWidth, f2);
        path.lineTo(f2, f2);
        float f3 = (2.0f * A042) / 3.0f;
        int i = 0;
        path.lineTo(f3, 0.0f + strokeWidth);
        path.lineTo(f3, A042 - strokeWidth);
        path.lineTo(f2, f3);
        path.lineTo(strokeWidth, f3);
        path.lineTo(strokeWidth, f2);
        paint.setColor(-1);
        canvas.drawPath(path, paint);
        canvas.translate(((-A042) / 2.0f) + strokeWidth, 0.0f);
        do {
            float f4 = this.A01;
            int i2 = 51;
            if (f4 >= (((float) i) * 1.0f) / 8.0f) {
                if (f4 > (((float) (i + 1)) * 1.0f) / 8.0f) {
                    i2 = 255;
                } else {
                    i2 = 51 + ((int) (204.0f * (f4 - ((((float) i) * 1.0f) / 8.0f)) * 8.0f));
                }
            }
            paint.setColor((i2 << 24) | 16777215);
            canvas2.drawArc(rectF, -33.0f, 66.0f, false, paint);
            canvas.translate(paint.getStrokeWidth() * 3.0f, 0.0f);
            i++;
        } while (i < 8);
    }

    private final void A00(Context context) {
        Paint paint = this.A03;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        AnonymousClass3MW.A1P(paint);
        paint.setColor(-1);
        paint.setStrokeWidth(context.getResources().getDimension(2131165400));
    }

    public void A01() {
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public final void setVolume(float f) {
        this.A01 = f;
        invalidate();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(((int) (((float) C108985cd.A07(this, getMeasuredHeight())) + (8.0f * this.A03.getStrokeWidth() * 3.0f) + ((float) getPaddingLeft()) + ((float) getPaddingRight()))) + 1, getMeasuredHeight());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioVolumeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        A01();
        this.A03 = C108945cZ.A0K(1);
        this.A05 = AnonymousClass3MW.A08();
        this.A04 = C108945cZ.A0L();
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioVolumeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A01();
        this.A03 = C108945cZ.A0K(1);
        this.A05 = AnonymousClass3MW.A08();
        this.A04 = C108945cZ.A0L();
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioVolumeView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A01();
        this.A03 = C108945cZ.A0K(1);
        this.A05 = AnonymousClass3MW.A08();
        this.A04 = C108945cZ.A0L();
        A00(context);
    }

    public AudioVolumeView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }
}
