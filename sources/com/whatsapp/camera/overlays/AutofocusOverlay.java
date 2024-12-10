package com.whatsapp.camera.overlays;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass7R9;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class AutofocusOverlay extends View implements AnonymousClass009 {
    public float A00;
    public RectF A01;
    public AnonymousClass031 A02;
    public Boolean A03;
    public boolean A04;
    public boolean A05;
    public final Paint A06;
    public final Runnable A07;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        int i;
        if (this.A01 != null) {
            if (!this.A04) {
                Boolean bool = this.A03;
                if (bool == null) {
                    paint = this.A06;
                    i = -1;
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    paint = this.A06;
                    i = -65536;
                    if (bool == bool2) {
                        i = -16711936;
                    }
                }
                paint.setColor(i);
            }
            boolean z = this.A04;
            RectF rectF = this.A01;
            if (z) {
                float f = this.A00 / 2.0f;
                canvas.drawRoundRect(rectF, f, f, this.A06);
                return;
            }
            canvas.drawRect(rectF, this.A06);
        }
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A06 = AnonymousClass3MZ.A0A();
        this.A07 = new AnonymousClass7R9((Object) this, 31);
        A00();
    }

    private void A00() {
        this.A00 = getResources().getDimension(2131165405);
        Paint paint = this.A06;
        paint.setStrokeWidth(getResources().getDimension(2131165407));
        AnonymousClass3MW.A1P(paint);
        paint.setColor(-1);
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A06 = AnonymousClass3MZ.A0A();
        this.A07 = new AnonymousClass7R9((Object) this, 31);
        A00();
    }

    public AutofocusOverlay(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A06 = AnonymousClass3MZ.A0A();
        this.A07 = new AnonymousClass7R9((Object) this, 31);
        A00();
    }
}
