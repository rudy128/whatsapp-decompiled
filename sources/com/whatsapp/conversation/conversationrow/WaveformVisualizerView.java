package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C108945cZ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class WaveformVisualizerView extends View implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public byte[] A02;
    public float[] A03;
    public final Paint A04;
    public final Path A05;
    public final Rect A06;

    private void A00() {
        this.A02 = null;
        Paint paint = this.A04;
        paint.setStrokeWidth(2.0f);
        AnonymousClass3MW.A1P(paint);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setColor(AnonymousClass3MZ.A02(getContext(), getContext(), 2130971957, 2131103410));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public WaveformVisualizerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A06 = AnonymousClass3MW.A07();
        this.A04 = AnonymousClass3MW.A06();
        this.A05 = C108945cZ.A0L();
        A00();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        byte[] bArr = this.A02;
        if (bArr != null) {
            float[] fArr = this.A03;
            if (fArr == null || fArr.length < bArr.length * 4) {
                this.A03 = new float[(bArr.length * 4)];
            }
            Rect rect = this.A06;
            rect.set(0, 0, getWidth(), getHeight());
            rect.top += getPaddingTop();
            rect.bottom -= getPaddingBottom();
            rect.left += getPaddingLeft();
            rect.right -= getPaddingRight();
            Path path = this.A05;
            path.reset();
            path.moveTo((float) rect.left, (float) (rect.top + (rect.height() / 2) + ((((byte) (this.A02[0] + 128)) * (rect.height() / 2)) / 128)));
            for (int i = 0; i < this.A02.length - 1; i++) {
                path.lineTo((float) (rect.left + ((rect.width() * i) / (this.A02.length - 1))), (float) (rect.top + (rect.height() / 2) + ((((byte) (this.A02[i] + 128)) * (rect.height() / 2)) / 128)));
            }
            canvas.drawPath(path, this.A04);
        }
    }

    public WaveformVisualizerView(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A06 = AnonymousClass3MW.A07();
        this.A04 = AnonymousClass3MW.A06();
        this.A05 = C108945cZ.A0L();
        A00();
    }

    public WaveformVisualizerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A06 = AnonymousClass3MW.A07();
        this.A04 = AnonymousClass3MW.A06();
        this.A05 = C108945cZ.A0L();
        A00();
    }

    public WaveformVisualizerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
