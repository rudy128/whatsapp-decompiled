package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.3qH  reason: invalid class name and case insensitive filesystem */
public class C77523qH extends C77533qI {
    public float A00 = 15.0f;
    public int A01 = 3;
    public int A02 = -1728053248;
    public int A03 = 17;
    public Drawable A04;
    public CharSequence A05;
    public int A06 = -1;
    public Paint A07;
    public Rect A08;
    public RectF A09;
    public TextPaint A0A;

    public void A06(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        super.A06(canvas2);
        if (!TextUtils.isEmpty(this.A05)) {
            if (this.A07 == null) {
                Paint A062 = AnonymousClass3MW.A06();
                this.A07 = A062;
                A062.setAntiAlias(true);
                this.A07.setStyle(Paint.Style.FILL);
                this.A07.setColor(this.A02);
            }
            if (this.A0A == null) {
                TextPaint textPaint = new TextPaint();
                this.A0A = textPaint;
                textPaint.setAntiAlias(true);
                this.A0A.setColor(this.A06);
                this.A0A.setTextSize(this.A00);
                this.A0A.setTextAlign(Paint.Align.CENTER);
            }
            if (this.A09 == null) {
                this.A09 = AnonymousClass3MW.A08();
            }
            if (this.A08 == null) {
                this.A08 = AnonymousClass3MW.A07();
            }
            float f3 = this.A00;
            float f4 = 1.25f * f3;
            float f5 = f4 - f3;
            Path path = new Path();
            RectF rectF = this.A09;
            path.moveTo(rectF.left, rectF.bottom - f4);
            path.lineTo(rectF.right, rectF.bottom - f4);
            path.lineTo(rectF.right, rectF.bottom - this.A01);
            RectF rectF2 = this.A09;
            float f6 = rectF.right;
            float f7 = this.A01 * 2.0f;
            float f8 = rectF.bottom;
            rectF2.set(f6 - f7, f8 - f7, f6, f8);
            path.arcTo(this.A09, 0.0f, 90.0f);
            path.lineTo(rectF.left + this.A01, rectF.bottom);
            RectF rectF3 = this.A09;
            float f9 = rectF.left;
            float f10 = rectF.bottom;
            float f11 = this.A01 * 2.0f;
            rectF3.set(f9, f10 - f11, f11 + f9, f10);
            path.arcTo(this.A09, 90.0f, 90.0f);
            path.lineTo(rectF.left, rectF.bottom - f4);
            canvas2.drawPath(path, this.A07);
            String charSequence = TextUtils.ellipsize(this.A05, this.A0A, rectF.width() - this.A01, TextUtils.TruncateAt.END).toString();
            TextPaint textPaint2 = this.A0A;
            int length = charSequence.length();
            textPaint2.getTextBounds(charSequence, 0, length, this.A08);
            int i = this.A03;
            if (i != 3) {
                float f12 = rectF.right;
                if (i != 5) {
                    f = (f12 + rectF.left) / 2.0f;
                } else {
                    Rect rect = this.A08;
                    f = (f12 - ((float) ((rect.right - rect.left) / 2))) - f5;
                }
            } else {
                float f13 = rectF.left;
                Rect rect2 = this.A08;
                f = f13 + ((float) ((rect2.right - rect2.left) / 2)) + f5;
            }
            canvas2.drawText(charSequence, 0, length, f, ((rectF.bottom - (f4 / 2.0f)) + (this.A00 / 2.0f)) - (this.A0A.descent() / 2.0f), this.A0A);
            Drawable drawable = this.A04;
            if (drawable != null) {
                float intrinsicWidth = (((float) drawable.getIntrinsicWidth()) * this.A00) / ((float) this.A04.getIntrinsicHeight());
                if (this.A01 != 5) {
                    f2 = rectF.left + f5 + this.A01;
                } else {
                    f2 = ((rectF.right - f5) - this.A01) - intrinsicWidth;
                }
                int i2 = (int) f2;
                Drawable drawable2 = this.A04;
                float f14 = rectF.bottom;
                float f15 = f14 - f4;
                float f16 = (f4 - this.A00) / 2.0f;
                drawable2.setBounds(i2, (int) (f15 + f16), (int) (((float) i2) + intrinsicWidth), (int) (f14 - f16));
                this.A04.draw(canvas2);
            }
        }
    }

    public C77523qH(Context context) {
        super(context);
        A05();
    }

    public void setIcon(Drawable drawable) {
        this.A04 = drawable;
    }

    public void setIconGravity(int i) {
        this.A01 = i;
    }

    public void setText(CharSequence charSequence) {
        this.A05 = charSequence;
    }

    public void setTextBackgroundColor(int i) {
        this.A02 = i;
    }

    public void setTextColor(int i) {
        this.A06 = i;
    }

    public void setTextGravity(int i) {
        this.A03 = i;
    }

    public void setTextSize(float f) {
        this.A00 = f;
    }
}
