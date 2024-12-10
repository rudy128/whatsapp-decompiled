package com.whatsapp.text;

import X.AnonymousClass112;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass7RM;
import X.C72463Mc;
import X.C72483Me;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.whatsapp.WaTextView;

public class AutoSizeTextView extends WaTextView {
    public float A00;
    public float A01;
    public int A02;
    public int[] A03;
    public boolean A04;

    public /* synthetic */ void A0N(int i) {
        super.setTextSize(0, (float) i);
    }

    private void A0F() {
        int i;
        int compoundPaddingLeft = (this.A02 - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        int[] iArr = this.A03;
        if (iArr != null && iArr.length != 0) {
            TextPaint textPaint = new TextPaint(getPaint());
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.A03;
                int length = iArr2.length;
                if (i2 >= length) {
                    i = iArr2[length - 1];
                    break;
                }
                textPaint.setTextSize((float) iArr2[i2]);
                if (textPaint.measureText(AnonymousClass3MZ.A18(this)) <= ((float) compoundPaddingLeft)) {
                    i = this.A03[i2];
                    break;
                }
                i2++;
            }
            if (i >= 0) {
                post(new AnonymousClass7RM((Object) this, i, 42));
            }
        }
    }

    private void A0G() {
        float f;
        float f2;
        float f3 = this.A00;
        boolean A0A = AnonymousClass112.A0A();
        DisplayMetrics A09 = AnonymousClass3Ma.A09(this);
        if (A0A) {
            f = TypedValue.convertPixelsToDimension(2, f3, A09);
        } else {
            f = f3 / A09.scaledDensity;
        }
        int round = Math.round(f);
        float f4 = this.A01;
        boolean A0A2 = AnonymousClass112.A0A();
        DisplayMetrics A092 = AnonymousClass3Ma.A09(this);
        if (A0A2) {
            f2 = TypedValue.convertPixelsToDimension(2, f4, A092);
        } else {
            f2 = f4 / A092.scaledDensity;
        }
        int round2 = (round - Math.round(f2)) + 1;
        this.A03 = new int[round2];
        for (int i = 0; i < round2; i++) {
            this.A03[i] = Math.round(TypedValue.applyDimension(2, (float) (round - i), AnonymousClass3Ma.A09(this)));
        }
    }

    public void A0I() {
        if (!this.A04) {
            this.A04 = true;
            C72483Me.A0s(C72463Mc.A0X(this), this);
        }
    }

    public void A0M(int i) {
        this.A01 = TypedValue.applyDimension(2, 11.0f, AnonymousClass3Ma.A09(this));
        this.A02 = Math.round(TypedValue.applyDimension(1, (float) i, AnonymousClass3Ma.A09(this)));
        if (this.A00 == 0.0f) {
            this.A00 = getTextSize();
        }
        A0G();
        A0F();
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C72483Me.A12(this);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i != i3 && i2 != i4) {
            A0F();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A0F();
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.A00 = getPaint().getTextSize();
        A0G();
        A0F();
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C72483Me.A12(this);
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0I();
    }

    public AutoSizeTextView(Context context) {
        super(context);
        C72483Me.A12(this);
    }
}
