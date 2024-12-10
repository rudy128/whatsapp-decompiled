package com.whatsapp.components;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Mo;
import X.AnonymousClass3O7;
import X.C18000vb;
import X.C18070vi;
import X.C19740yt;
import X.C72463Mc;
import X.C72473Md;
import X.C84144If;
import X.C88754aj;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class RoundCornerProgressBar extends AnonymousClass3O7 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public C18000vb A04;
    public boolean A05;
    public int A06;
    public final Paint A07;
    public final RectF A08;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public void onDraw(Canvas canvas) {
        float paddingLeft;
        C18070vi.A0d(canvas, 0);
        float A072 = (this.A00 / 100.0f) * ((float) C72473Md.A07(this, getWidth()));
        if (isInEditMode() || AnonymousClass3MY.A1b(getWhatsAppLocale())) {
            paddingLeft = ((float) getPaddingLeft()) + A072;
        } else {
            paddingLeft = (((float) getWidth()) - A072) - ((float) getPaddingRight());
        }
        int paddingTop = getPaddingTop() + (C72473Md.A04(this) / 2);
        Paint paint = this.A07;
        AnonymousClass3MZ.A1D(this.A01, paint);
        RectF rectF = this.A08;
        int i = this.A06;
        int i2 = i / 2;
        float f = (float) (paddingTop - i2);
        float f2 = (float) (i2 + paddingTop);
        rectF.set(0.0f, f, (float) getWidth(), f2);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        paint.setColor(this.A02);
        if (isInEditMode() || AnonymousClass3MY.A1b(getWhatsAppLocale())) {
            rectF.set((float) getPaddingLeft(), (float) (paddingTop - (i / 2)), paddingLeft, f2);
        } else {
            rectF.set(paddingLeft, f, (float) C72463Mc.A09(this), f2);
        }
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final float getDrawnProgress() {
        return this.A00;
    }

    public final int getProgress() {
        return this.A03;
    }

    public final int getProgressColor() {
        return this.A02;
    }

    public final int getProgressField() {
        return this.A03;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setProgress(int i) {
        if (i < 0 || i > 100) {
            throw AnonymousClass000.A0k("Progress must be between 0 and 100 inclusive");
        } else if (i != this.A03) {
            this.A03 = i;
            if (!this.A05) {
                this.A00 = (float) i;
            } else if (i > 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) i});
                C72473Md.A0n(ofFloat, (long) ((int) Math.max(200.0f, (((float) this.A03) / 100.0f) * 650.0f)));
                C88754aj.A00(ofFloat, this, 9);
                AnonymousClass3Mo.A00(ofFloat, this, 9);
                ofFloat.setStartDelay(300);
                ofFloat.start();
                return;
            } else {
                this.A00 = 0.0f;
                this.A05 = false;
            }
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        int size;
        if (View.MeasureSpec.getMode(i2) == 0) {
            size = getPaddingTop() + this.A06 + getPaddingBottom();
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }

    public void setBackgroundColor(int i) {
        this.A01 = i;
    }

    public final void setDrawnProgress(float f) {
        this.A00 = f;
    }

    public final void setProgressColor(int i) {
        this.A02 = i;
    }

    public final void setProgressField(int i) {
        this.A03 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundCornerProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A00();
        this.A05 = true;
        this.A06 = 10;
        this.A02 = C19740yt.A00(context, 2131103261);
        this.A01 = C19740yt.A00(context, 2131103262);
        this.A07 = new Paint(1);
        this.A08 = AnonymousClass3MW.A08();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A0K);
            C18070vi.A0X(obtainStyledAttributes);
            this.A06 = obtainStyledAttributes.getDimensionPixelSize(2, this.A06);
            this.A02 = obtainStyledAttributes.getInteger(1, this.A02);
            this.A01 = obtainStyledAttributes.getInteger(0, this.A01);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RoundCornerProgressBar(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
