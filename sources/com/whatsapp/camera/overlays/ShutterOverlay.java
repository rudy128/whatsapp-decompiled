package com.whatsapp.camera.overlays;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C108945cZ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class ShutterOverlay extends View implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public boolean A02;
    public final Paint A03;

    private void A00(Context context) {
        Paint paint = this.A03;
        paint.setStrokeWidth(context.getResources().getDimension(2131168729));
        AnonymousClass3MW.A1P(paint);
        paint.setColor(-1);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        if (this.A02) {
            canvas.drawRect(0.0f, 0.0f, C108945cZ.A03(this), C108945cZ.A04(this), this.A03);
        }
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass3MZ.A0A();
        A00(context);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass3MZ.A0A();
        A00(context);
    }

    public ShutterOverlay(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass3MZ.A0A();
        A00(context);
    }
}
