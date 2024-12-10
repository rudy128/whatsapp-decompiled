package com.whatsapp.calling.dialer;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4IY;
import X.C18070vi;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.whatsapp.WaTextView;

public final class DialerNumberView extends WaTextView {
    public float A00;
    public float A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerNumberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (attributeSet != null) {
            this.A01 = getTextSize();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IY.A03);
            C18070vi.A0X(obtainStyledAttributes);
            this.A00 = obtainStyledAttributes.getDimension(0, this.A01);
            obtainStyledAttributes.recycle();
        }
    }

    public static final void A0F(TextView textView, float f, float f2) {
        float f3;
        TextPaint paint = textView.getPaint();
        C18070vi.A0X(paint);
        int width = textView.getWidth();
        if (width != 0) {
            textView.setTextSize(0, f);
            float measureText = ((float) width) - paint.measureText("8");
            float measureText2 = paint.measureText(AnonymousClass3Ma.A13(textView));
            Float valueOf = Float.valueOf(measureText2);
            if (measureText2 <= 0.0f) {
                valueOf = null;
            }
            if (valueOf != null) {
                f3 = valueOf.floatValue();
            } else {
                f3 = 1.0f;
            }
            float f4 = measureText / f3;
            if (f4 <= 1.0f) {
                float f5 = f * f4;
                if (f2 < f5) {
                    f2 = f5;
                }
                textView.setTextSize(0, f2);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A0F(this, this.A01, this.A00);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A0F(this, this.A01, this.A00);
    }

    public /* synthetic */ DialerNumberView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerNumberView(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
