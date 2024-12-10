package com.whatsapp.status;

import X.C18070vi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

public final class ScalingContactStatusThumbnail extends ContactStatusThumbnail {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScalingContactStatusThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A05();
    }

    public void A06(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
    }

    public void A07(int i, int i2) {
        if (i2 == 0) {
            requestLayout();
        }
        super.A07(i, i2);
    }

    public int getBorderSizeAdjustment() {
        return (int) this.A00;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00 > 0) {
            this.A00 = ((float) getMeasuredWidth()) * 0.04f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScalingContactStatusThumbnail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A05();
    }

    public ScalingContactStatusThumbnail(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScalingContactStatusThumbnail(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A05();
    }
}
