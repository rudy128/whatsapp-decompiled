package com.whatsapp.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.perf.MeasuringFrameLayout;

public class ClippingLayout extends MeasuringFrameLayout {
    public boolean A00;
    public Rect A01;

    public boolean drawChild(Canvas canvas, View view, long j) {
        Rect rect = this.A01;
        if (rect != null) {
            canvas.clipRect(rect);
        }
        return super.drawChild(canvas, view, j);
    }

    public void setClipBounds(Rect rect) {
        Rect rect2;
        Rect rect3 = this.A01;
        if (rect != rect3) {
            if (rect == null) {
                rect2 = null;
            } else if (!rect.equals(rect3)) {
                Rect rect4 = this.A01;
                if (rect4 == null) {
                    rect2 = new Rect(rect);
                } else {
                    rect4.set(rect);
                    invalidate();
                }
            } else {
                return;
            }
            this.A01 = rect2;
            invalidate();
        }
    }

    public ClippingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
    }

    public ClippingLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A02();
    }

    public ClippingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
    }

    public ClippingLayout(Context context) {
        super(context);
        A02();
    }
}
