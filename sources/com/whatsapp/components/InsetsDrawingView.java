package com.whatsapp.components;

import X.AnonymousClass3MW;
import X.C108945cZ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class InsetsDrawingView extends FrameLayout {
    public Paint A00;
    public final Path A01 = C108945cZ.A0L();

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (this.A00 != null) {
            int width = getWidth();
            int height = getHeight();
            Path path = this.A01;
            path.reset();
            float f = (float) width;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(0.0f, 0.0f, f, (float) getPaddingTop(), direction);
            float f2 = (float) height;
            path.addRect((float) (width - getPaddingRight()), 0.0f, f, f2, direction);
            float f3 = f2;
            path.addRect(0.0f, (float) (height - getPaddingBottom()), f, f3, direction);
            path.addRect(0.0f, 0.0f, (float) getPaddingLeft(), f3, direction);
            canvas2.drawPath(path, this.A00);
        }
    }

    public InsetsDrawingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setColor(int i) {
        Paint A06 = AnonymousClass3MW.A06();
        this.A00 = A06;
        A06.setColor(getResources().getColor(i));
        setBackgroundResource(2131102739);
    }

    public InsetsDrawingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InsetsDrawingView(Context context) {
        super(context);
    }
}
