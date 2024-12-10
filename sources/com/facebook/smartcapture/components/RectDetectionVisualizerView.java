package com.facebook.smartcapture.components;

import X.AnonymousClass3MW;
import X.C108945cZ;
import X.C18070vi;
import X.C27082DTh;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;

public final class RectDetectionVisualizerView extends View {
    public Handler A00;
    public final Paint A01;
    public final Paint A02;
    public final Paint A03;
    public final Path A04 = C108945cZ.A0L();
    public final Path A05 = C108945cZ.A0L();
    public final Runnable A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RectDetectionVisualizerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        Paint A062 = AnonymousClass3MW.A06();
        C108945cZ.A1L(A062);
        A00(A062);
        this.A02 = A062;
        Paint A063 = AnonymousClass3MW.A06();
        AnonymousClass3MW.A1P(A063);
        A063.setStrokeWidth(getResources().getDimension(2131168453));
        A00(A063);
        this.A01 = A063;
        Paint A064 = AnonymousClass3MW.A06();
        C108945cZ.A1L(A064);
        A00(A064);
        this.A03 = A064;
        this.A06 = C27082DTh.A00(this, 34);
    }

    private final void A00(Paint paint) {
        paint.setColor(0);
        paint.setDither(true);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new CornerPathEffect(getResources().getDimension(2131168454)));
        paint.setAntiAlias(true);
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        super.onDraw(canvas);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Handler handler = new Handler();
        handler.post(this.A06);
        this.A00 = handler;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(this.A06);
        }
        this.A00 = null;
    }

    public final void setProgress(int i) {
        postInvalidate();
    }
}
