package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public class BEy extends Drawable {
    public final int A00;
    public final Paint A01;
    public final Paint A02;
    public final Path A03 = C108945cZ.A0L();
    public final CXA A04;
    public final CXA A05;
    public final CXA A06;
    public final CSB A07;
    public final boolean A08;
    public final float[] A09;

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas.save();
        try {
            if (this.A08) {
                canvas.clipPath(this.A03);
            }
            canvas.drawColor(this.A00);
            int height = getBounds().height();
            int width = getBounds().width();
            float f = (float) width;
            canvas2.drawRect(0.0f, 0.0f, f, (float) height, this.A01);
            canvas.drawCircle(f, 0.0f, (float) ((int) BEB.A00(width, height)), this.A02);
            CSB csb = this.A07;
            canvas.drawPath(csb.A01, csb.A00);
            CXA cxa = this.A05;
            canvas.drawPath(cxa.A01, cxa.A00);
            CXA cxa2 = this.A04;
            canvas.drawPath(cxa2.A01, cxa2.A00);
            CXA cxa3 = this.A06;
            canvas.drawPath(cxa3.A01, cxa3.A00);
        } catch (Exception unused) {
            C25913CoX.A01("CDSHarmonizationCompanyGradientDrawable", "Exception when drawing CDSHarmonizationCompanyGradientDrawable");
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
        canvas.restoreToCount(save);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void onBoundsChange(Rect rect) {
        Rect rect2 = rect;
        super.onBoundsChange(rect2);
        if (this.A08) {
            Path path = this.A03;
            path.reset();
            path.addRoundRect(new RectF(rect2), this.A09, Path.Direction.CW);
            path.close();
        }
        int height = rect2.height();
        int width = rect2.width();
        float f = (float) height;
        float f2 = (float) width;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A01.setShader(new LinearGradient(0.0f, f, f2, 0.0f, -16751392, -16743685, tileMode));
        float f3 = f2 * -0.333f;
        float f4 = f * -0.333f;
        float f5 = f2 * 1.333f;
        float f6 = 1.333f * f;
        CSB csb = this.A07;
        CMW cmw = csb.A03;
        cmw.A00 = f5;
        cmw.A01 = f6;
        CMW cmw2 = csb.A04;
        cmw2.A00 = f5;
        cmw2.A01 = 0.55f * f;
        CMW cmw3 = csb.A02;
        cmw3.A00 = -0.37f * f2;
        cmw3.A01 = f6;
        CXA cxa = this.A06;
        CMW cmw4 = cxa.A05;
        cmw4.A00 = f3;
        cmw4.A01 = f4;
        CMW cmw5 = cxa.A06;
        cmw5.A00 = 0.032f * f2;
        cmw5.A01 = f4;
        CMW cmw6 = cxa.A04;
        cmw6.A00 = f3;
        cmw6.A01 = 1.078f * f;
        CMW cmw7 = cxa.A02;
        cmw7.A00 = 0.122f * f2;
        cmw7.A01 = 0.415f * f;
        CMW cmw8 = cxa.A03;
        cmw8.A00 = -0.01f * f2;
        cmw8.A01 = 0.753f * f;
        CXA cxa2 = this.A04;
        CMW cmw9 = cxa2.A05;
        cmw9.A00 = f3;
        cmw9.A01 = f4;
        CMW cmw10 = cxa2.A06;
        cmw10.A00 = 0.19f * f2;
        cmw10.A01 = f4;
        CMW cmw11 = cxa2.A04;
        cmw11.A00 = f3;
        cmw11.A01 = 1.087f * f;
        CMW cmw12 = cxa2.A02;
        cmw12.A00 = 0.197f * f2;
        cmw12.A01 = 0.473f * f;
        CMW cmw13 = cxa2.A03;
        cmw13.A00 = 0.025f * f2;
        cmw13.A01 = 0.803f * f;
        CXA cxa3 = this.A05;
        CMW cmw14 = cxa3.A05;
        cmw14.A00 = f3;
        cmw14.A01 = f4;
        CMW cmw15 = cxa3.A06;
        cmw15.A00 = 0.355f * f2;
        cmw15.A01 = f4;
        CMW cmw16 = cxa3.A04;
        cmw16.A00 = f3;
        cmw16.A01 = 1.043f * f;
        CMW cmw17 = cxa3.A02;
        cmw17.A00 = 0.27f * f2;
        cmw17.A01 = 0.49f * f;
        CMW cmw18 = cxa3.A03;
        cmw18.A00 = 0.057f * f2;
        cmw18.A01 = f * 0.807f;
        float max = Math.max((float) BEB.A00(width, height), Float.MIN_VALUE);
        int[] A1W = C108945cZ.A1W();
        A1W[0] = C25346Ce5.A00(-1, 0.25f);
        A1W[1] = C25346Ce5.A00(-1, 0.0f);
        this.A02.setShader(new RadialGradient(f2, 0.0f, max, A1W, (float[]) null, tileMode));
        Path path2 = csb.A01;
        path2.reset();
        path2.moveTo(cmw2.A00, cmw2.A01);
        path2.lineTo(cmw3.A00, cmw3.A01);
        path2.lineTo(cmw.A00, cmw.A01);
        path2.close();
        cxa3.A00();
        cxa2.A00();
        cxa.A00();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        this.A07.A00.setColorFilter(colorFilter);
        this.A06.A00.setColorFilter(colorFilter);
        this.A04.A00.setColorFilter(colorFilter);
        this.A05.A00.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public BEy(int i, float[] fArr) {
        this.A00 = i;
        this.A09 = fArr;
        int length = fArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (fArr[i2] > 0.0f) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        this.A08 = z;
        this.A01 = AnonymousClass3MW.A06();
        this.A07 = new CSB();
        this.A06 = new CXA(-11695, 100);
        this.A04 = new CXA(-44416, 190);
        this.A05 = new CXA(-6278145, 175);
        Paint A062 = AnonymousClass3MW.A06();
        this.A02 = A062;
        BEA.A12(A062);
    }
}
