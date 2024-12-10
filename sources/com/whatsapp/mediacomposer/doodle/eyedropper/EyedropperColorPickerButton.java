package com.whatsapp.mediacomposer.doodle.eyedropper;

import X.AnonymousClass000;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass6Z2;
import X.C108945cZ;
import X.C108995ce;
import X.C124406Yf;
import X.C18070vi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.Map;

public final class EyedropperColorPickerButton extends View {
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final Paint A04;
    public final Paint A05;
    public final Drawable A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EyedropperColorPickerButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass6Z2.A00);
        float dimension = obtainStyledAttributes.getDimension(2, 3.0f);
        this.A03 = dimension;
        this.A01 = obtainStyledAttributes.getDimension(1, 0.0f);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            this.A06 = drawable;
            obtainStyledAttributes.recycle();
            Paint A0K = C108945cZ.A0K(1);
            this.A05 = A0K;
            A0K.setColor(-1);
            AnonymousClass3MW.A1P(A0K);
            A0K.setStrokeWidth(dimension);
            Paint A0K2 = C108945cZ.A0K(1);
            this.A04 = A0K2;
            C108945cZ.A1L(A0K2);
            setColor(-1);
            return;
        }
        throw AnonymousClass000.A0n("Should pass a valid icon");
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        float A022 = C108945cZ.A02(C108995ce.A03(this)) - this.A03;
        canvas.drawCircle(this.A02, this.A00, A022, this.A04);
        canvas.drawCircle(this.A02, this.A00, A022, this.A05);
        this.A06.draw(canvas);
    }

    public final void setColor(int i) {
        int HSVToColor;
        this.A04.setColor(i);
        float[] fArr = new float[3];
        if (((double) (((float) Color.alpha(i)) / 255.0f)) < 0.3d || ((((((float) Color.red(i)) / 255.0f) * 299.0f) + ((((float) Color.green(i)) / 255.0f) * 587.0f)) + ((((float) Color.blue(i)) / 255.0f) * 114.0f)) / 1000.0f > 0.85f) {
            Color.colorToHSV(i, fArr);
            if (fArr[0] == 0.0f) {
                HSVToColor = -16777216;
            } else {
                fArr[1] = 1.0f;
                fArr[2] = 0.4f;
                HSVToColor = Color.HSVToColor(fArr);
            }
        } else {
            HSVToColor = -1;
        }
        Map map = C124406Yf.A00;
        Integer valueOf = Integer.valueOf(HSVToColor);
        ColorFilter colorFilter = (ColorFilter) map.get(valueOf);
        if (colorFilter == null) {
            colorFilter = new PorterDuffColorFilter(HSVToColor, PorterDuff.Mode.SRC_ATOP);
            map.put(valueOf, colorFilter);
        }
        this.A06.setColorFilter(colorFilter);
        invalidate();
    }

    private final float getButtonRadius() {
        return C108945cZ.A02(C108995ce.A03(this));
    }

    private final void setIconBounds(Drawable drawable) {
        float A022 = C108945cZ.A02(C108995ce.A03(this)) * 2.0f;
        float sqrt = ((float) Math.sqrt((double) ((A022 * A022) / 2.0f))) - this.A01;
        float intrinsicWidth = ((float) drawable.getIntrinsicWidth()) / 2.0f;
        if (sqrt > intrinsicWidth) {
            sqrt = intrinsicWidth;
        }
        float f = this.A02;
        float f2 = this.A00;
        drawable.setBounds((int) (f - sqrt), (int) (f2 - sqrt), (int) (f + sqrt), (int) (f2 + sqrt));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A02 = C108945cZ.A02(getWidth());
        this.A00 = (C108945cZ.A04(this) - this.A02) - ((float) getPaddingBottom());
        setIconBounds(this.A06);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EyedropperColorPickerButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ EyedropperColorPickerButton(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EyedropperColorPickerButton(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
