package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.animation.Interpolator;

/* renamed from: X.8CJ  reason: invalid class name */
public class AnonymousClass8CJ extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08 = -7829368;
    public int A09 = 3;
    public int A0A = 2;
    public long A0B = -1;
    public long A0C = -1;
    public long A0D = 0;
    public Bitmap A0E;
    public RectF A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public final float A0J;
    public final float A0K;
    public final float A0L;
    public final float A0M;
    public final float A0N;
    public final float A0O;
    public final int A0P;
    public final Context A0Q;
    public final Paint A0R;
    public final Paint A0S;
    public final Paint A0T;
    public final Paint A0U;
    public final Paint A0V;
    public final TextPaint A0W;
    public final TextPaint A0X;
    public final Interpolator A0Y = new D5O();

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public float A00() {
        return Math.max(this.A04, this.A06 + this.A02 + AnonymousClass8BR.A01(this.A0Q, 3.0f));
    }

    public void A01() {
        setBounds(0, 0, Math.round(this.A05), Math.round(this.A04));
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        float min;
        if (this.A09 != 3) {
            Canvas canvas2 = canvas;
            canvas.save();
            if (this.A09 == 2 && this.A0B == -1 && this.A0C == -1) {
                this.A0F.offsetTo(0.0f, 0.0f);
                canvas.save();
                canvas.translate(this.A0F.centerX(), A00() / 2.0f);
                Paint paint = this.A0T;
                paint.setColor(this.A08);
                float f3 = (float) this.A0P;
                canvas.drawCircle(0.0f, 0.0f, f3, paint);
                canvas.drawCircle(0.0f, 0.0f, f3 - this.A0K, this.A0S);
                canvas.restore();
            } else {
                RectF rectF = this.A0F;
                this.A0F.offsetTo(0.0f, 0.0f);
                canvas.save();
                canvas.translate(rectF.centerX(), A00() / 2.0f);
                float width = rectF.width() / 2.0f;
                Paint paint2 = this.A0T;
                paint2.setColor(this.A08);
                canvas.drawCircle(0.0f, 0.0f, width, paint2);
                canvas.drawCircle(0.0f, 0.0f, width - this.A0K, this.A0S);
                if (this.A0E != null) {
                    RectF rectF2 = new RectF();
                    float f4 = rectF2.left;
                    float f5 = width - this.A0L;
                    rectF2.left = f4 - f5;
                    rectF2.right = f5;
                    rectF2.top -= f5;
                    rectF2.bottom = f5;
                    canvas.drawBitmap(this.A0E, (Rect) null, rectF2, this.A0U);
                }
                canvas.restore();
                if (this.A0I && this.A0B == -1 && this.A0C == -1) {
                    if (!TextUtils.isEmpty(this.A0G)) {
                        int i = this.A0A;
                        RectF rectF3 = this.A0F;
                        if (i == 1) {
                            f2 = (rectF3.left - this.A03) - this.A0O;
                        } else {
                            f2 = rectF3.right + this.A0O;
                        }
                        float centerY = rectF3.centerY() - this.A0J;
                        String str = this.A0G;
                        canvas2.drawText(str, 0, str.length(), f2, centerY, this.A0R);
                        String str2 = this.A0G;
                        canvas2.drawText(str2, 0, str2.length(), f2, centerY, this.A0W);
                    }
                    if (!TextUtils.isEmpty(this.A0H)) {
                        int i2 = this.A0A;
                        RectF rectF4 = this.A0F;
                        if (i2 == 1) {
                            f = (rectF4.left - this.A07) - this.A0O;
                        } else {
                            f = rectF4.right + this.A0O;
                        }
                        float centerY2 = rectF4.centerY() + this.A06 + this.A0N;
                        canvas.drawText(this.A0H, f, centerY2, this.A0V);
                        canvas.drawText(this.A0H, f, centerY2, this.A0X);
                    }
                }
            }
            canvas.restore();
            long j = this.A0B;
            if (j != -1 || this.A0C != -1) {
                long j2 = this.A0D;
                if (j2 == 0) {
                    min = 0.0f;
                } else {
                    long min2 = Math.min(AnonymousClass8BR.A04(j), j2);
                    if (min2 >= j2) {
                        this.A0B = -1;
                        j = -1;
                    }
                    long min3 = Math.min(System.currentTimeMillis() - this.A0C, j2);
                    if (min3 >= j2) {
                        this.A0C = -1;
                    }
                    if (j == -1) {
                        min2 = min3;
                    }
                    min = Math.min(Math.max(0.0f, 1.0f), Math.max(Math.min(0.0f, 1.0f), this.A0Y.getInterpolation(((float) min2) / ((float) j2))));
                }
                float f6 = this.A01;
                float f7 = 1.0f - 0.0f;
                float f8 = this.A00 - f6;
                float f9 = 0.0f;
                if (f7 != 0.0f) {
                    f9 = (min - 0.0f) / f7;
                }
                float f10 = (f9 * f8) + f6;
                this.A05 = f10;
                this.A04 = f10;
                A01();
            }
        }
    }

    public int getIntrinsicHeight() {
        return Math.round(this.A04);
    }

    public int getIntrinsicWidth() {
        return Math.round(this.A05);
    }

    public AnonymousClass8CJ(Context context) {
        this.A0Q = context;
        this.A0P = C62762rw.A01(context, 3.0f);
        this.A0M = AnonymousClass8BR.A01(context, 120.0f);
        this.A0L = AnonymousClass8BR.A01(context, 3.0f);
        this.A0O = AnonymousClass8BR.A01(context, 4.0f);
        this.A0K = AnonymousClass8BR.A01(context, 1.0f);
        this.A0J = AnonymousClass8BR.A01(context, 1.5f);
        this.A0N = AnonymousClass8BR.A01(context, 1.5f);
        C18070vi.A0d(context, 0);
        TextPaint textPaint = C197559wt.A05;
        if (textPaint == null) {
            textPaint = new TextPaint();
            textPaint.setTextAlign(Paint.Align.LEFT);
            textPaint.setTextSize(AnonymousClass8BR.A01(context, 12.0f));
            Typeface typeface = C180519Mw.A00;
            if (typeface == null) {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
                C180519Mw.A00 = typeface;
            }
            C17960vV.A07(typeface);
            C18070vi.A0X(typeface);
            textPaint.setTypeface(typeface);
            textPaint.setColor(context.getResources().getColor(2131103229));
            C197559wt.A05 = textPaint;
        }
        this.A0W = textPaint;
        this.A0R = C197559wt.A00(context);
        TextPaint textPaint2 = C197559wt.A06;
        if (textPaint2 == null) {
            textPaint2 = new TextPaint();
            textPaint2.setTextSize(AnonymousClass8BR.A01(context, 10.0f));
            textPaint2.setTextAlign(Paint.Align.LEFT);
            textPaint2.setTypeface(Typeface.DEFAULT);
            textPaint2.setColor(context.getResources().getColor(2131103228));
            C197559wt.A06 = textPaint2;
        }
        this.A0X = textPaint2;
        this.A0V = C197559wt.A01(context);
        Paint paint = C197559wt.A02;
        if (paint == null) {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            C197559wt.A02 = paint;
        }
        this.A0T = paint;
        Paint paint2 = C197559wt.A01;
        if (paint2 == null) {
            paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(AnonymousClass3Ma.A01(context, context.getResources(), 2130968804, 2131099879));
            paint2.setStrokeWidth(AnonymousClass8BR.A01(context, 1.0f));
            C197559wt.A01 = paint2;
        }
        this.A0S = paint2;
        Paint paint3 = C197559wt.A03;
        if (paint3 == null) {
            paint3 = new Paint();
            paint3.setStyle(Paint.Style.FILL_AND_STROKE);
            C197559wt.A03 = paint3;
        }
        this.A0U = paint3;
        this.A0F = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A0F = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }
}
