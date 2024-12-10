package com.whatsapp.mediacomposer.doodle.universaltoolpicker.color;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C108945cZ;
import X.C108995ce;
import X.C18070vi;
import X.C19740yt;
import X.C43531zx;
import X.C72473Md;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public final class ColorToolPickerItemView extends View {
    public int A00;
    public Paint A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final Paint A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ColorToolPickerItemView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }

    public void onDraw(Canvas canvas) {
        float f;
        C18070vi.A0d(canvas, 0);
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int min = Math.min(C108995ce.A03(this), C72473Md.A04(this));
        if (isSelected()) {
            f = 0.0f;
        } else {
            f = this.A03;
        }
        boolean isSelected = isSelected();
        float f2 = this.A03;
        if (isSelected) {
            f2 *= 2.0f;
        }
        float A022 = C108945cZ.A02(min) - f;
        float f3 = A022 - f2;
        float f4 = (float) width;
        float f5 = (float) height;
        canvas.drawCircle(f4, f5, A022, this.A04);
        Paint paint = this.A01;
        paint.setColor(this.A00);
        canvas.drawCircle(f4, f5, f3, paint);
        if (this.A00 == -1) {
            canvas.drawCircle(f4, f5, f3 - this.A02, this.A05);
        }
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(C43531zx.A00(this, 24), i), View.getDefaultSize(C43531zx.A00(this, 24), i2));
    }

    public final int getColor() {
        return this.A00;
    }

    public final void setColor(int i) {
        this.A00 = i;
    }

    public /* synthetic */ ColorToolPickerItemView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ColorToolPickerItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        this.A03 = (float) C43531zx.A00(this, 3);
        float A002 = (float) C43531zx.A00(this, 1);
        this.A02 = A002;
        Paint A06 = AnonymousClass3MW.A06();
        A06.setStrokeWidth(A002);
        AnonymousClass3MX.A19(context, A06, 2131103225);
        AnonymousClass3MW.A1P(A06);
        A06.setAntiAlias(true);
        A06.setDither(true);
        this.A05 = A06;
        Paint A062 = AnonymousClass3MW.A06();
        AnonymousClass3MX.A19(context, A062, 2131103394);
        Paint.Style style = Paint.Style.FILL;
        A062.setStyle(style);
        A062.setAntiAlias(true);
        A062.setDither(true);
        this.A04 = A062;
        Paint A063 = AnonymousClass3MW.A06();
        A063.setStyle(style);
        A063.setAntiAlias(true);
        A063.setDither(true);
        this.A01 = A063;
        this.A00 = C19740yt.A00(context, 2131103075);
    }
}
