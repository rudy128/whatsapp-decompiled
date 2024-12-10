package com.whatsapp;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C19740yt;
import X.C72483Me;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class CircularProgressBar extends ProgressBar implements AnonymousClass009 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public Typeface A0E;
    public AnonymousClass031 A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public int A0J;
    public final Paint A0K;
    public final RectF A0L;
    public final Rect A0M;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0F;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0F = r0;
        }
        return r0.generatedComponent();
    }

    public String getCenterText() {
        return this.A0G;
    }

    public Typeface getCenterTextTypeface() {
        return this.A0E;
    }

    public int getFillColor() {
        return this.A08;
    }

    public boolean getKnobEnabled() {
        return this.A0I;
    }

    public int getNumBackgroundDashes() {
        return this.A09;
    }

    public float getPaintStrokeFactor() {
        return this.A06;
    }

    public int getProgressBarBackgroundColor() {
        return this.A0B;
    }

    public int getProgressBarColor() {
        return this.A0C;
    }

    public void onDraw(Canvas canvas) {
        float f;
        Paint paint = this.A0K;
        paint.setAntiAlias(true);
        Canvas canvas2 = canvas;
        if (this.A08 != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.A08);
            canvas2.drawArc(this.A0L, 0.0f, 360.0f, true, paint);
        }
        paint.setStrokeCap(Paint.Cap.ROUND);
        if (isIndeterminate()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.A0D;
            if (j == 0) {
                this.A0D = uptimeMillis;
                j = uptimeMillis;
            }
            long j2 = uptimeMillis - j;
            float f2 = (((float) (j2 % 1333)) * 1.0f) / 1333.0f;
            if (f2 < 0.5f) {
                float sin = (float) Math.sin(((double) f2) * 3.141592653589793d);
                f = (((sin * sin) * sin) * sin) / 2.0f;
            } else {
                float sin2 = (float) Math.sin(((double) (f2 - 0.5f)) * 3.141592653589793d);
                f = ((((sin2 * sin2) * sin2) * sin2) / 2.0f) + 0.5f;
            }
            if (f < 0.5f) {
                this.A00 = f * 2.0f * 280.0f;
                this.A02 = -1.0f;
            } else {
                float f3 = this.A02;
                if (f3 < 0.0f) {
                    f3 = this.A01;
                    this.A02 = f3;
                }
                this.A00 = (1.0f - f) * 2.0f * 280.0f;
                this.A01 = f3 + ((f - 0.5f) * 2.0f * 280.0f);
            }
            canvas2.rotate(((((float) (j2 % 2200)) * 1.0f) / 2200.0f) * 360.0f, (float) (getWidth() / 2), (float) (getHeight() / 2));
            paint.setAntiAlias(true);
            int i = this.A0B;
            if (i != 0) {
                paint.setColor(i);
                AnonymousClass3MW.A1P(paint);
                canvas2.drawArc(this.A0L, 0.0f, 360.0f, false, paint);
            }
            int i2 = this.A0A;
            if (i2 != 0) {
                paint.setColor(i2);
                AnonymousClass3MW.A1P(paint);
                paint.setStrokeWidth((this.A04 / this.A06) + (this.A03 * 2.0f));
                canvas2.drawArc(this.A0L, this.A01, this.A00, false, paint);
            }
            paint.setColor(this.A0C);
            AnonymousClass3MW.A1P(paint);
            paint.setStrokeWidth(this.A04 / this.A06);
            canvas2.drawArc(this.A0L, this.A01, this.A00, false, paint);
            invalidate();
            return;
        }
        AnonymousClass3MW.A1P(paint);
        if (this.A0B != 0) {
            if (this.A09 > 0) {
                paint.setPathEffect(getDashPath());
            }
            paint.setStrokeWidth(this.A04 / this.A06);
            paint.setColor(this.A0B);
            canvas2.drawArc(this.A0L, ((((float) getProgress()) * 360.0f) / ((float) getMax())) + 270.0f, 360.0f - ((((float) getProgress()) * 360.0f) / ((float) getMax())), false, paint);
            paint.setPathEffect((PathEffect) null);
        }
        int i3 = this.A0A;
        if (i3 != 0) {
            paint.setColor(i3);
            paint.setStrokeWidth((this.A04 / this.A06) + (this.A03 * 2.0f));
            canvas2.drawArc(this.A0L, -90.0f, (((float) getProgress()) * 360.0f) / ((float) getMax()), false, paint);
        }
        paint.setStrokeWidth(this.A04 / this.A06);
        paint.setColor(this.A0C);
        RectF rectF = this.A0L;
        canvas2.drawArc(rectF, -90.0f, (((float) getProgress()) * 360.0f) / ((float) getMax()), false, paint);
        if (this.A0I) {
            AnonymousClass3MZ.A1D(this.A0B, paint);
            double progress = (double) (((float) getProgress()) * ((float) (6.283185307179586d / ((double) getMax()))));
            float f4 = this.A04;
            canvas2.drawCircle((float) (((double) rectF.centerX()) + (((double) this.A04) * Math.sin(progress))), (float) (((double) rectF.centerY()) - (((double) f4) * Math.cos(progress))), f4 * 0.07272727f, paint);
        }
        if (this.A0G != null) {
            paint.setColor(this.A0J);
            paint.setTextSize(this.A07);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(this.A0E);
            String str = this.A0G;
            int length = str.length();
            Rect rect = this.A0M;
            paint.getTextBounds(str, 0, length, rect);
            paint.setStyle(Paint.Style.FILL);
            String str2 = this.A0G;
            canvas2.drawText(str2, 0, str2.length(), rectF.centerX(), rectF.centerY() + (((float) rect.height()) * 0.5f), paint);
        }
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0H) {
            this.A0H = true;
            generatedComponent();
        }
        this.A0L = AnonymousClass3MW.A08();
        this.A0K = AnonymousClass3MW.A06();
        this.A0M = C72483Me.A0F(this);
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        this.A0J = AnonymousClass3Ma.A00(context, 2130969067, 2131100130);
        this.A0C = AnonymousClass3Ma.A00(context, 2130969066, 2131100129);
        this.A0B = C19740yt.A00(context, 2131100128);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A06);
            this.A0C = obtainStyledAttributes.getInteger(1, this.A0C);
            this.A0B = obtainStyledAttributes.getInteger(0, this.A0B);
            this.A08 = obtainStyledAttributes.getInteger(2, this.A08);
            this.A06 = obtainStyledAttributes.getFloat(5, this.A06);
            this.A0A = obtainStyledAttributes.getInteger(3, this.A0A);
            this.A03 = obtainStyledAttributes.getDimension(4, this.A03);
            this.A0J = obtainStyledAttributes.getInteger(6, this.A0J);
            obtainStyledAttributes.recycle();
        }
    }

    private DashPathEffect getDashPath() {
        float f = this.A04 * 6.2831855f;
        float f2 = f / ((float) (this.A09 * 2));
        float f3 = f2 * 2.0f;
        return new DashPathEffect(new float[]{f2, f2}, f3 - ((f * (1.0f - ((((float) getProgress()) * 1.0f) / ((float) getMax())))) % f3));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        float min = ((float) Math.min((i - paddingLeft) - getPaddingRight(), (i2 - getPaddingTop()) - getPaddingBottom())) / 2.0f;
        float f = min - (this.A05 * min);
        this.A04 = f;
        float f2 = (float) (i / 2);
        float f3 = (float) (i2 / 2);
        this.A0L.set(f2 - f, f3 - f, f2 + f, f3 + f);
    }

    public void setCenterText(String str) {
        this.A0G = str;
        this.A07 = (float) AnonymousClass3Ma.A02(this, 2131168375);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        this.A0E = typeface;
    }

    public void setFillColor(int i) {
        this.A08 = i;
    }

    public void setKnobEnabled(boolean z) {
        this.A0I = z;
    }

    public void setNumBackgroundDashes(int i) {
        this.A09 = i;
    }

    public void setPaintStrokeFactor(float f) {
        this.A06 = f;
    }

    public void setProgressBarBackgroundColor(int i) {
        this.A0B = i;
    }

    public void setProgressBarColor(int i) {
        this.A0C = i;
    }

    public void setRadiusFactor(float f) {
        this.A05 = f;
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0H) {
            this.A0H = true;
            generatedComponent();
        }
        this.A0L = AnonymousClass3MW.A08();
        this.A0K = AnonymousClass3MW.A06();
        this.A0M = C72483Me.A0F(this);
        A00(context, attributeSet);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A0H) {
            this.A0H = true;
            generatedComponent();
        }
    }

    public CircularProgressBar(Context context) {
        super(context);
        if (!this.A0H) {
            this.A0H = true;
            generatedComponent();
        }
        this.A0L = AnonymousClass3MW.A08();
        this.A0K = AnonymousClass3MW.A06();
        this.A0M = C72483Me.A0F(this);
        A00(context, (AttributeSet) null);
    }
}
