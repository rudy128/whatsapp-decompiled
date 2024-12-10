package X;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public class BFB extends Drawable implements Animatable {
    public static final ArgbEvaluator A08 = new ArgbEvaluator();
    public static final TimeInterpolator A09 = new C26311CxU();
    public boolean A00;
    public final float A01;
    public final int A02;
    public final ValueAnimator.AnimatorUpdateListener A03;
    public final ValueAnimator A04;
    public final Paint A05;
    public final RectF A06 = AnonymousClass3MW.A08();
    public final Integer A07;

    public int getOpacity() {
        return -1;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public BFB(C5H c5h, C5H c5h2, Integer num, float f, int i, int i2, boolean z) {
        float f2;
        float f3;
        C26323Cxg cxg = new C26323Cxg(this, 18);
        this.A03 = cxg;
        this.A07 = num;
        Paint A062 = AnonymousClass3MW.A06();
        this.A05 = A062;
        C108945cZ.A1L(A062);
        A062.setAntiAlias(true);
        this.A02 = i2;
        this.A01 = f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A04 = valueAnimator;
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(cxg);
        valueAnimator.setStartDelay(((long) (i % 10)) * 200);
        valueAnimator.setDuration(2000);
        valueAnimator.setInterpolator(A09);
        valueAnimator.setEvaluator(A08);
        if (z) {
            f2 = c5h2.A00;
            f3 = c5h2.A01;
        } else {
            f2 = c5h.A00;
            f3 = c5h.A01;
        }
        float[] A1V = C108945cZ.A1V();
        A1V[0] = f2;
        A1V[1] = f3;
        valueAnimator.setFloatValues(A1V);
        A062.setColor(C25346Ce5.A00(i2, f2));
    }

    public void draw(Canvas canvas) {
        int intValue = this.A07.intValue();
        RectF rectF = this.A06;
        if (intValue != 0) {
            float f = this.A01;
            canvas.drawRoundRect(rectF, f, f, this.A05);
            return;
        }
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.A05);
    }

    public boolean isRunning() {
        return this.A04.isStarted();
    }

    public void setAlpha(int i) {
        Paint paint = this.A05;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (!z) {
            this.A04.cancel();
        } else if (this.A00) {
            this.A04.start();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.A04.start();
        this.A00 = true;
    }

    public void stop() {
        this.A04.cancel();
        this.A00 = false;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A06.set(rect);
    }
}
