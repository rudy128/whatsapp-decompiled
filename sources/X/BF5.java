package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Build;

public final class BF5 extends Drawable {
    public static final float[] A07 = {0.0f, 0.15428571f, 0.46666667f, 0.6027778f, 0.69166666f, 1.0f};
    public static final int[] A08;
    public static final int[] A09;
    public static final int[] A0A;
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final Paint A04;
    public final boolean A05;
    public final RectF A06 = AnonymousClass3MW.A08();

    static {
        int A002 = C25346Ce5.A00(-6278145, 0.1f);
        A09 = new int[]{A002, C25346Ce5.A00(-15173646, 0.1f), C25346Ce5.A00(-14298266, 0.1f), C25346Ce5.A00(-668109, 0.1f), C25346Ce5.A00(-37796, 0.1f), A002};
        int[] iArr = new int[6];
        int A003 = C25346Ce5.A00(-7982634, 0.2f);
        iArr[0] = A003;
        C25346Ce5.A01(iArr, 0.2f, -15111988, 1);
        C25346Ce5.A01(iArr, 0.2f, -14438052, 2);
        C25346Ce5.A01(iArr, 0.2f, -3494861, 3);
        C25346Ce5.A01(iArr, 0.2f, -2990252, 4);
        iArr[5] = A003;
        A08 = iArr;
        int[] iArr2 = new int[5];
        iArr2[0] = 16777215;
        iArr2[1] = 16777215;
        C25346Ce5.A01(iArr2, 0.3f, -16777216, 2);
        C25346Ce5.A01(iArr2, 0.2f, -16777216, 3);
        iArr2[4] = 16777215;
        A0A = iArr2;
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        int save = canvas.save();
        canvas.rotate(94.0f, this.A00, this.A01);
        canvas.drawCircle(this.A00, this.A01, this.A02, this.A04);
        canvas.restoreToCount(save);
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        int[] iArr;
        C18070vi.A0d(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A06;
        float f = this.A03;
        BEB.A0n(rect, rectF, (float) rect.left, f);
        this.A00 = rectF.centerX();
        this.A01 = rectF.centerY();
        this.A02 = BE6.A02(rect) / 2.0f;
        if (this.A05) {
            iArr = A08;
        } else {
            iArr = A09;
        }
        SweepGradient sweepGradient = new SweepGradient(this.A00, this.A01, iArr, A07);
        float f2 = this.A02;
        if (f2 > 0.0f) {
            float f3 = f / f2;
            float f4 = 1.0f - f3;
            float f5 = (f3 * 0.25f) + f4;
            if (f5 > 1.0f) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Gradient quarter fraction cannot be greater than 1, value is: ");
                A10.append(f5);
                C25913CoX.A01("CDSCircularShadowDrawable", A10.toString());
                return;
            }
            float[] fArr = new float[5];
            fArr[0] = 0.0f;
            fArr[1] = f4;
            fArr[2] = f4;
            BE9.A1N(fArr, f5, 1.0f);
            float f6 = this.A00;
            float f7 = this.A01;
            int[] iArr2 = A0A;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            Shader radialGradient = new RadialGradient(f6, f7, f2, iArr2, fArr, tileMode);
            if (Build.VERSION.SDK_INT < 28) {
                Bitmap A0J = BE8.A0J(rect.width(), rect.height());
                float f8 = this.A00;
                float f9 = this.A01;
                float f10 = this.A02;
                Paint A062 = AnonymousClass3MW.A06();
                C108945cZ.A1L(A062);
                A062.setDither(true);
                A062.setShader(radialGradient);
                new Canvas(A0J).drawCircle(f8, f9, f10, A062);
                radialGradient = new BitmapShader(A0J, tileMode, tileMode);
            }
            this.A04.setShader(new ComposeShader(radialGradient, sweepGradient, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public BF5(Context context, E6Q e6q) {
        Paint A062 = AnonymousClass3MW.A06();
        this.A04 = A062;
        A062.setAntiAlias(false);
        A062.setDither(true);
        C108945cZ.A1L(A062);
        this.A03 = C24515C7j.A00(context, 12.0f);
        this.A05 = e6q.BeR();
    }
}
