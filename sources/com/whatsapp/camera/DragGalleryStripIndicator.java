package com.whatsapp.camera;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C108945cZ;
import X.C108985cd;
import X.C62762rw;
import X.C72463Mc;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

public class DragGalleryStripIndicator extends View implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public float A02;
    public float A03;
    public boolean A04;
    public final Paint A05;
    public final Paint A06;
    public final Path A07;

    private void A00(Context context) {
        Paint paint = this.A05;
        AnonymousClass3MW.A1P(paint);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth((float) C62762rw.A01(context, 2.0f));
        paint.setColor(AnonymousClass3Ma.A01(context, getResources(), 2130971957, 2131103410));
        Paint paint2 = this.A06;
        AnonymousClass3MW.A1P(paint2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeWidth(C72463Mc.A00(context) * 4.0f);
        paint2.setColor(AnonymousClass3Ma.A01(context, getResources(), 2130968803, 2131099878));
        this.A02 = TypedValue.applyDimension(1, 1.0f, AnonymousClass3Ma.A09(this));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setOffset(float f) {
        this.A03 = f - 1.0f;
        invalidate();
    }

    public void setUpdating(boolean z) {
        this.A04 = z;
        if (z) {
            invalidate();
        }
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A05 = C108945cZ.A0K(1);
        this.A06 = C108945cZ.A0K(1);
        this.A07 = C108945cZ.A0L();
        this.A03 = 0.0f;
        A00(context);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = (float) getPaddingLeft();
        float paddingTop = (float) getPaddingTop();
        float A09 = (float) C72463Mc.A09(this);
        float A052 = (float) C108985cd.A05(this);
        float f = (A052 + paddingTop) / 2.0f;
        float f2 = this.A03;
        float f3 = (((A052 - paddingTop) / 4.0f) * f2) + f;
        float f4 = f + (this.A02 * (-f2));
        Path path = this.A07;
        path.reset();
        path.moveTo(paddingLeft, f4);
        path.lineTo((paddingLeft + A09) / 2.0f, f3);
        path.lineTo(A09, f4);
        canvas.drawPath(path, this.A06);
        canvas.drawPath(path, this.A05);
        if (this.A04) {
            invalidate();
        }
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A05 = C108945cZ.A0K(1);
        this.A06 = C108945cZ.A0K(1);
        this.A07 = C108945cZ.A0L();
        this.A03 = 0.0f;
        A00(context);
    }

    public DragGalleryStripIndicator(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A05 = C108945cZ.A0K(1);
        this.A06 = C108945cZ.A0K(1);
        this.A07 = C108945cZ.A0L();
        this.A03 = 0.0f;
        A00(context);
    }
}
