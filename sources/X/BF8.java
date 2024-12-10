package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.util.HashMap;
import java.util.List;

public class BF8 extends Drawable {
    public float A00;
    public C24749CIl A01;
    public C24749CIl A02;
    public float A03;
    public int A04;
    public ValueAnimator A05;
    public boolean A06;
    public final C24749CIl[] A07;
    public final float A08;
    public final int A09;
    public final ValueAnimator.AnimatorUpdateListener A0A = new C26323Cxg(this, 1);
    public final Path A0B;
    public final List A0C;
    public final boolean A0D;
    public final float[] A0E;

    public int getOpacity() {
        return -1;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, X.CS9] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.CS9] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, X.CS9] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.Object, X.CS9] */
    /* JADX WARNING: type inference failed for: r2v8, types: [java.lang.Object, X.CS9] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Object, X.CS9] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object, X.CS9] */
    /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.Object, X.CS9] */
    public BF8(Context context, float[] fArr, int i, boolean z) {
        C24749CIl[] cIlArr = new C24749CIl[4];
        this.A07 = cIlArr;
        this.A0B = C108945cZ.A0L();
        this.A04 = 255;
        this.A09 = i;
        float[] fArr2 = fArr;
        this.A0E = fArr2;
        int length = fArr2.length;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (fArr[i2] > 0.0f) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        this.A0D = z2;
        Context context2 = context;
        this.A08 = C24515C7j.A00(context2, 375.0f);
        C25617Cix[] cixArr = new C25617Cix[6];
        cixArr[0] = new C25617Cix(0.0f, C24515C7j.A00(context2, 116.0f), 0, C24515C7j.A00(context2, 350.0f), -15173646, C24515C7j.A00(context2, 232.0f));
        cixArr[1] = new C25617Cix(0.0f, C24515C7j.A00(context2, -219.0f), 1, C24515C7j.A00(context2, 226.0f), -14298266, C24515C7j.A00(context2, 153.0f));
        cixArr[2] = new C25617Cix(C24515C7j.A00(context2, 124.0f), C24515C7j.A00(context2, -438.0f), 2, C24515C7j.A00(context2, 156.0f), -668109, C24515C7j.A00(context2, 100.0f));
        cixArr[3] = new C25617Cix(C24515C7j.A00(context2, 238.0f), C24515C7j.A00(context2, -196.0f), 3, C24515C7j.A00(context2, 206.0f), -37796, C24515C7j.A00(context2, 132.0f));
        cixArr[4] = new C25617Cix(C24515C7j.A00(context2, -175.0f), C24515C7j.A00(context2, 373.0f), 4, C24515C7j.A00(context2, 272.0f), -15173646, C24515C7j.A00(context2, 175.0f));
        this.A0C = AnonymousClass8BR.A15(new C25617Cix(C24515C7j.A00(context2, 308.0f), C24515C7j.A00(context2, -71.0f), 5, C24515C7j.A00(context2, 176.0f), -6278145, C24515C7j.A00(context2, 119.0f)), cixArr, 5);
        HashMap A11 = C17880vN.A11();
        Integer A0Z = BE7.A0Z();
        ? obj = new Object();
        obj.A04 = true;
        obj.A01 = 90.0f;
        A11.put(A0Z, obj);
        ? obj2 = new Object();
        obj2.A03 = true;
        A11.put(4, obj2);
        ? obj3 = new Object();
        obj3.A02 = true;
        obj3.A00 = 0.5f;
        A11.put(5, obj3);
        cIlArr[1] = new C24749CIl(A11);
        HashMap A112 = C17880vN.A11();
        ? obj4 = new Object();
        obj4.A04 = true;
        obj4.A01 = 180.0f;
        A112.put(A0Z, obj4);
        ? obj5 = new Object();
        obj5.A02 = true;
        obj5.A00 = 0.5f;
        obj5.A03 = true;
        A112.put(5, obj5);
        cIlArr[2] = new C24749CIl(A112);
        HashMap A113 = C17880vN.A11();
        ? obj6 = new Object();
        obj6.A04 = true;
        obj6.A01 = 270.0f;
        A113.put(A0Z, obj6);
        ? obj7 = new Object();
        obj7.A02 = true;
        obj7.A00 = 0.5f;
        A113.put(5, obj7);
        ? obj8 = new Object();
        obj8.A03 = true;
        A113.put(1, obj8);
        cIlArr[3] = new C24749CIl(A113);
        setAlpha(z ? 10 : 8);
    }

    public void A01(boolean z) {
        if (this.A06 != z) {
            ValueAnimator valueAnimator = this.A05;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.A05 = null;
            }
            if (z) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.A05 = valueAnimator2;
                valueAnimator2.addUpdateListener(this.A0A);
                this.A05.setRepeatCount(-1);
                this.A05.setDuration(((long) this.A07.length) * 3000);
                ValueAnimator valueAnimator3 = this.A05;
                float[] A1V = C108945cZ.A1V();
                // fill-array-data instruction
                A1V[0] = 0;
                A1V[1] = 1065353216;
                valueAnimator3.setFloatValues(A1V);
                this.A05.setInterpolator(new LinearInterpolator());
                this.A05.start();
            }
            this.A06 = z;
        }
    }

    public void draw(Canvas canvas) {
        CS9 cs9;
        CS9 cs92;
        float f;
        float f2;
        CS9 cs93;
        CS9 cs94;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        int save = canvas2.save();
        if (this.A0D) {
            canvas2.clipPath(this.A0B);
        }
        if (this.A03 > 1.0f) {
            Rect bounds = getBounds();
            float f5 = this.A03;
            canvas2.scale(f5, f5, bounds.exactCenterX(), bounds.exactCenterY());
        }
        canvas2.drawColor(this.A09);
        C24749CIl cIl = this.A01;
        if (cIl != null) {
            cs9 = (CS9) AnonymousClass000.A0w(cIl.A00, -1);
        } else {
            cs9 = null;
        }
        C24749CIl cIl2 = this.A02;
        if (cIl2 != null) {
            cs92 = (CS9) AnonymousClass000.A0w(cIl2.A00, -1);
        } else {
            cs92 = null;
        }
        if (cs9 == null || !cs9.A04) {
            f = 0.0f;
        } else {
            f = cs9.A01;
        }
        if (cs92 == null || !cs92.A04) {
            f2 = 0.0f;
        } else {
            f2 = cs92.A01;
        }
        if (f == 270.0f && f2 == 0.0f) {
            f2 = 360.0f;
        }
        float A002 = C17880vN.A00(f2, f, this.A00);
        Rect bounds2 = getBounds();
        if (A002 != 0.0f) {
            canvas2.rotate(A002, bounds2.exactCenterX(), bounds2.exactCenterY());
        }
        for (C25617Cix cix : this.A0C) {
            int save2 = canvas2.save();
            C24749CIl cIl3 = this.A01;
            if (cIl3 != null) {
                cs93 = (CS9) AnonymousClass000.A0w(cIl3.A00, cix.A06);
            } else {
                cs93 = null;
            }
            C24749CIl cIl4 = this.A02;
            if (cIl4 != null) {
                cs94 = (CS9) AnonymousClass000.A0w(cIl4.A00, cix.A06);
            } else {
                cs94 = null;
            }
            float f6 = cix.A00;
            float exactCenterX = bounds2.exactCenterX();
            if (cs93 == null || !cs93.A03) {
                f3 = f6;
            } else {
                f3 = 0.0f + exactCenterX;
            }
            if (cs94 != null && cs94.A03) {
                f6 = exactCenterX + 0.0f;
            }
            float A003 = C17880vN.A00(f6, f3, this.A00);
            float f7 = cix.A01;
            float exactCenterY = bounds2.exactCenterY();
            if (cs93 == null || !cs93.A03) {
                f4 = f7;
            } else {
                f4 = 0.0f + exactCenterY;
            }
            if (cs94 != null && cs94.A03) {
                f7 = exactCenterY + 0.0f;
            }
            canvas2.translate(A003, C17880vN.A00(f7, f4, this.A00));
            float f8 = cix.A04;
            float f9 = cix.A05;
            float max = Math.max(f8, f9);
            canvas2.scale(1.0f, Math.min(f8, f9) / max);
            CS9 cs95 = cs94;
            CS9 cs96 = cs93;
            A00(canvas2, cix.A09, cs96, cs95, max * 2.0f);
            A00(canvas2, cix.A08, cs96, cs95, max * 1.5f);
            A00(canvas2, cix.A07, cs93, cs94, max);
            canvas2.restoreToCount(save2);
        }
        canvas2.restoreToCount(save);
    }

    public int getAlpha() {
        return this.A04;
    }

    public void setAlpha(int i) {
        this.A04 = i;
        for (C25617Cix cix : this.A0C) {
            cix.A07.setAlpha(i);
            cix.A08.setAlpha(i);
            cix.A09.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        for (C25617Cix cix : this.A0C) {
            cix.A07.setColorFilter(colorFilter);
            cix.A08.setColorFilter(colorFilter);
            cix.A09.setColorFilter(colorFilter);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z3 = this.A06;
        if (!z) {
            if (z3 && (valueAnimator2 = this.A05) != null && valueAnimator2.isStarted()) {
                this.A05.cancel();
            }
        } else if (z3 && (valueAnimator = this.A05) != null && !valueAnimator.isStarted()) {
            this.A05.start();
        }
        return super.setVisible(z, z2);
    }

    private void A00(Canvas canvas, Paint paint, CS9 cs9, CS9 cs92, float f) {
        float f2;
        int alpha = paint.getAlpha();
        float f3 = 1.0f;
        if (cs9 == null || !cs9.A02) {
            f2 = 1.0f;
        } else {
            f2 = cs9.A00;
        }
        if (cs92 != null && cs92.A02) {
            f3 = cs92.A00;
        }
        float alpha2 = (float) paint.getAlpha();
        paint.setAlpha((int) C17880vN.A00(f3 * alpha2, f2 * alpha2, this.A00));
        canvas.drawCircle(0.0f, 0.0f, f, paint);
        paint.setAlpha(alpha);
    }

    public void onBoundsChange(Rect rect) {
        float f;
        super.onBoundsChange(rect);
        for (C25617Cix cix : this.A0C) {
            cix.A00 = ((float) rect.centerX()) + cix.A02;
            cix.A01 = ((float) rect.centerY()) + cix.A03;
        }
        Path path = this.A0B;
        path.reset();
        path.addRoundRect(new RectF(rect), this.A0E, Path.Direction.CW);
        path.close();
        float A022 = BE6.A02(rect);
        float f2 = this.A08;
        if (A022 > f2) {
            f = A022 / f2;
        } else {
            f = 0.0f;
        }
        this.A03 = f;
    }
}
