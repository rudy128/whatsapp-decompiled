package com.whatsapp.contact;

import X.AnonymousClass033;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3PJ;
import X.C18000vb;
import X.C18070vi;
import X.C72473Md;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;

public final class FacepileItemMaskView extends AnonymousClass3PJ {
    public int A00;
    public C18000vb A01;
    public float A02;
    public final Path A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FacepileItemMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public void dispatchDraw(Canvas canvas) {
        float f;
        C18070vi.A0d(canvas, 0);
        if (this.A00 != 0) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            double d = (double) (height / 2.0f);
            float degrees = (float) Math.toDegrees(Math.acos((d - ((double) (this.A02 / 2.0f))) / d));
            boolean A1Z = AnonymousClass3MW.A1Z(getWaLocale());
            float f2 = this.A02;
            if (A1Z) {
                f = width - f2;
            } else {
                f = f2 - (((float) d) * 2.0f);
            }
            boolean A1Z2 = AnonymousClass3MW.A1Z(getWaLocale());
            float f3 = this.A02;
            if (A1Z2) {
                f3 = (width - f3) + (((float) d) * 2.0f);
            }
            RectF rectF = new RectF(f, 0.0f, f3, height);
            float f4 = degrees;
            if (AnonymousClass3MW.A1Z(getWaLocale())) {
                f4 = 180.0f + degrees;
            }
            float f5 = degrees * -2.0f;
            Path path = this.A03;
            path.reset();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(width, 0.0f);
            if (AnonymousClass3MW.A1Z(getWaLocale())) {
                path.arcTo(rectF, f4, f5, false);
            }
            path.lineTo(width, height);
            path.lineTo(0.0f, height);
            if (!AnonymousClass3MW.A1Z(getWaLocale())) {
                path.arcTo(rectF, f4, f5, false);
            }
            path.lineTo(0.0f, 0.0f);
            path.close();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
    }

    public final void setWaLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final int getIndex() {
        return this.A00;
    }

    public final float getOverlapSize() {
        return this.A02;
    }

    public final C18000vb getWaLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waLocale");
        throw null;
    }

    public final void setIndex(int i) {
        this.A00 = i;
    }

    public final void setOverlapSize(float f) {
        this.A02 = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacepileItemMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            this.A01 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        this.A03 = new Path();
        this.A02 = AnonymousClass3MW.A00(context.getResources(), 2131166782);
    }

    public /* synthetic */ FacepileItemMaskView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FacepileItemMaskView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
