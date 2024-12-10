package com.google.android.material.snackbar;

import X.AnonymousClass1YW;
import X.C17880vN;
import X.C29101bc;
import X.E2T;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SnackbarContentLayout extends LinearLayout implements E2T {
    public int A00;
    public Button A01;
    public TextView A02;
    public final TimeInterpolator A03;

    public Button getActionView() {
        return this.A01;
    }

    public TextView getMessageView() {
        return this.A02;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = C29101bc.A01(AnonymousClass1YW.A02, context, 2130970548);
    }

    private boolean A00(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.A02.getPaddingTop() == i2 && this.A02.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.A02;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A02 = C17880vN.A0E(this, 2131435508);
        this.A01 = (Button) findViewById(2131435507);
    }

    public void onMeasure(int i, int i2) {
        boolean A002;
        super.onMeasure(i, i2);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131166440);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131166439);
            Layout layout = this.A02.getLayout();
            if (layout == null || layout.getLineCount() <= 1) {
                dimensionPixelSize = dimensionPixelSize2;
                A002 = A00(0, dimensionPixelSize, dimensionPixelSize);
            } else {
                if (this.A00 > 0 && this.A01.getMeasuredWidth() > this.A00) {
                    A002 = A00(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2);
                }
                A002 = A00(0, dimensionPixelSize, dimensionPixelSize);
            }
            if (A002) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.A00 = i;
    }

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
