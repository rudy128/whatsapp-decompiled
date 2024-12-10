package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public class BFC extends Drawable implements Animatable {
    public static final Interpolator A06 = new LinearInterpolator();
    public static final Interpolator A07 = new AnonymousClass1YX();
    public static final int[] A08;
    public float A00;
    public float A01;
    public Animator A02;
    public Resources A03;
    public boolean A04;
    public final CUQ A05;

    public int getOpacity() {
        return -3;
    }

    static {
        int[] A1X = BE6.A1X();
        A1X[0] = -16777216;
        A08 = A1X;
    }

    public void A00(int i) {
        float f = 10.0f;
        float f2 = 5.0f;
        float f3 = 7.5f;
        float f4 = 2.5f;
        if (i == 0) {
            f = 12.0f;
            f2 = 6.0f;
            f3 = 11.0f;
            f4 = 3.0f;
        }
        CUQ cuq = this.A05;
        float f5 = this.A03.getDisplayMetrics().density;
        float f6 = f4 * f5;
        cuq.A08 = f6;
        cuq.A0J.setStrokeWidth(f6);
        cuq.A02 = f3 * f5;
        cuq.A0C = 0;
        cuq.A0D = cuq.A0G[0];
        cuq.A0B = (int) (f * f5);
        cuq.A0A = (int) (f2 * f5);
        invalidateSelf();
    }

    public void A01(CUQ cuq, float f) {
        int i;
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = cuq.A0G;
            int i2 = cuq.A0C;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            int i5 = (i3 >> 24) & 255;
            int i6 = (i3 >> 16) & 255;
            int i7 = (i3 >> 8) & 255;
            int i8 = i3 & 255;
            i = ((i5 + ((int) (((float) (((i4 >> 24) & 255) - i5)) * f2))) << 24) | ((i6 + ((int) (((float) (((i4 >> 16) & 255) - i6)) * f2))) << 16) | ((i7 + ((int) (((float) (((i4 >> 8) & 255) - i7)) * f2))) << 8) | (i8 + ((int) (f2 * ((float) ((i4 & 255) - i8)))));
        } else {
            i = cuq.A0G[cuq.A0C];
        }
        cuq.A0D = i;
    }

    public void A02(CUQ cuq, float f, boolean z) {
        float f2;
        float interpolation;
        if (this.A04) {
            A01(cuq, f);
            float f3 = cuq.A06;
            float f4 = cuq.A07;
            float f5 = cuq.A05;
            cuq.A04 = f4 + (((f5 - 0.01f) - f4) * f);
            cuq.A01 = f5;
            cuq.A03 = f3 + ((((float) (Math.floor((double) (f3 / 0.8f)) + 1.0d)) - f3) * f);
        } else if (f != 1.0f || z) {
            float f6 = cuq.A06;
            if (f < 0.5f) {
                interpolation = cuq.A07;
                f2 = (A07.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                f2 = cuq.A07 + 0.79f;
                interpolation = f2 - (((1.0f - A07.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            cuq.A04 = interpolation;
            cuq.A01 = f2;
            cuq.A03 = f6 + (0.20999998f * f);
            this.A00 = (f + this.A01) * 216.0f;
        }
    }

    public int getAlpha() {
        return this.A05.A09;
    }

    public boolean isRunning() {
        return this.A02.isRunning();
    }

    public void setAlpha(int i) {
        this.A05.A09 = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A05.A0J.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void start() {
        long j;
        Animator animator = this.A02;
        animator.cancel();
        CUQ cuq = this.A05;
        float f = cuq.A04;
        cuq.A07 = f;
        float f2 = cuq.A01;
        cuq.A05 = f2;
        cuq.A06 = cuq.A03;
        if (f2 != f) {
            this.A04 = true;
            j = 666;
        } else {
            cuq.A0C = 0;
            cuq.A0D = cuq.A0G[0];
            cuq.A07 = 0.0f;
            cuq.A05 = 0.0f;
            cuq.A06 = 0.0f;
            cuq.A04 = 0.0f;
            cuq.A01 = 0.0f;
            cuq.A03 = 0.0f;
            j = 1332;
        }
        animator.setDuration(j);
        animator.start();
    }

    public void stop() {
        this.A02.cancel();
        this.A00 = 0.0f;
        CUQ cuq = this.A05;
        if (cuq.A0F) {
            cuq.A0F = false;
        }
        cuq.A0C = 0;
        cuq.A0D = cuq.A0G[0];
        cuq.A07 = 0.0f;
        cuq.A05 = 0.0f;
        cuq.A06 = 0.0f;
        cuq.A04 = 0.0f;
        cuq.A01 = 0.0f;
        cuq.A03 = 0.0f;
        invalidateSelf();
    }

    public BFC(Context context) {
        C28111Yx.A02(context);
        this.A03 = context.getResources();
        CUQ cuq = new CUQ();
        this.A05 = cuq;
        int[] iArr = A08;
        cuq.A0G = iArr;
        cuq.A0C = 0;
        cuq.A0D = iArr[0];
        cuq.A08 = 2.5f;
        cuq.A0J.setStrokeWidth(2.5f);
        invalidateSelf();
        CUQ cuq2 = this.A05;
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 0;
        A1V[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
        ofFloat.addUpdateListener(new C26315CxY(cuq2, this, 0));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(A06);
        ofFloat.addListener(new C26308CxR(cuq2, this, 0));
        this.A02 = ofFloat;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Canvas canvas2 = canvas;
        canvas.save();
        canvas.rotate(this.A00, bounds.exactCenterX(), bounds.exactCenterY());
        CUQ cuq = this.A05;
        RectF rectF = cuq.A0K;
        float f = cuq.A02;
        float f2 = (cuq.A08 / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) cuq.A0B) * cuq.A00) / 2.0f, cuq.A08 / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = cuq.A04;
        float f4 = cuq.A03;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((cuq.A01 + f4) * 360.0f) - f5;
        Paint paint = cuq.A0J;
        paint.setColor(cuq.A0D);
        paint.setAlpha(cuq.A09);
        float f7 = cuq.A08 / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, cuq.A0I);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas2.drawArc(rectF, f5, f6, false, paint);
        if (cuq.A0F) {
            Path path = cuq.A0E;
            if (path == null) {
                Path A0L = C108945cZ.A0L();
                cuq.A0E = A0L;
                A0L.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            cuq.A0E.moveTo(0.0f, 0.0f);
            cuq.A0E.lineTo(((float) cuq.A0B) * cuq.A00, 0.0f);
            Path path2 = cuq.A0E;
            float f9 = cuq.A00;
            path2.lineTo((((float) cuq.A0B) * f9) / 2.0f, ((float) cuq.A0A) * f9);
            cuq.A0E.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) cuq.A0B) * cuq.A00) / 2.0f), rectF.centerY() + (cuq.A08 / 2.0f));
            cuq.A0E.close();
            Paint paint2 = cuq.A0H;
            paint2.setColor(cuq.A0D);
            paint2.setAlpha(cuq.A09);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(cuq.A0E, paint2);
            canvas.restore();
        }
        canvas.restore();
    }
}
