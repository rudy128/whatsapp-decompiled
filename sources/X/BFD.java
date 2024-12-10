package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public final class BFD extends Drawable implements Animatable {
    public static final Interpolator A09;
    public static final Interpolator A0A = new LinearInterpolator();
    public static final float[] A0B = {0.8f, 0.8f, 1.0f, 0.8f, 0.8f};
    public static final float[] A0C = {0.0f, 180.0f, 360.0f, 540.0f, 1080.0f};
    public static final float[] A0D = {0.0f, 0.7f, 0.45f, 0.7f, 0.0f};
    public float A00;
    public float A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final ValueAnimator.AnimatorUpdateListener A05;
    public final ValueAnimator A06;
    public final Paint A07;
    public final RectF A08 = AnonymousClass3MW.A08();

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        Paint paint = this.A07;
        paint.setColor(this.A03);
        canvas.drawArc(this.A08, this.A01, this.A00, false, paint);
    }

    public int getOpacity() {
        return -1;
    }

    public void onBoundsChange(Rect rect) {
        C18070vi.A0d(rect, 0);
        super.onBoundsChange(rect);
        float strokeWidth = this.A07.getStrokeWidth() / 2.0f;
        RectF rectF = this.A08;
        rectF.set(rect);
        rectF.offset(strokeWidth, strokeWidth);
        int i = rect.left;
        int i2 = this.A04;
        rectF.right = ((float) (i + i2)) - strokeWidth;
        rectF.bottom = ((float) (rect.top + i2)) - strokeWidth;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        Interpolator A002 = C29111bd.A00(0.33f, 0.0f, 0.67f, 1.0f);
        C18070vi.A0X(A002);
        A09 = A002;
    }

    public BFD(Context context, int i, int i2) {
        this.A03 = i;
        this.A04 = i2;
        Paint A0K = C108945cZ.A0K(1);
        this.A07 = A0K;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A06 = valueAnimator;
        this.A01 = -90.0f;
        C26323Cxg cxg = new C26323Cxg(this, 19);
        this.A05 = cxg;
        valueAnimator.setInterpolator(A0A);
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 0;
        A1V[1] = 1065353216;
        valueAnimator.setFloatValues(A1V);
        valueAnimator.addUpdateListener(cxg);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setDuration(2000);
        AnonymousClass3MW.A1P(A0K);
        A0K.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, C108965cb.A08(context)));
    }

    public int getIntrinsicHeight() {
        return this.A04;
    }

    public int getIntrinsicWidth() {
        return this.A04;
    }

    public boolean isRunning() {
        return this.A06.isRunning();
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = this.A02;
        if (!z) {
            if (z3) {
                this.A06.cancel();
            }
        } else if (z3) {
            this.A06.start();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.A06.start();
        this.A02 = true;
    }

    public void stop() {
        this.A06.cancel();
        this.A02 = false;
    }
}
