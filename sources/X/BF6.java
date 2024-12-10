package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public final class BF6 extends Drawable {
    public Paint A00;
    public final Paint A01;
    public final Paint A02;
    public final CX9 A03;
    public final CX9 A04;
    public final CX9 A05;
    public final CSA A06;
    public final int A07;
    public final Path A08;

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas, 0);
        int save = canvas.save();
        try {
            canvas.drawColor(this.A07);
            int height = getBounds().height();
            int width = getBounds().width();
            Paint paint = this.A00;
            if (paint != null) {
                canvas2.drawRect(0.0f, 0.0f, (float) width, (float) height, paint);
            }
            float f = (float) width;
            canvas2.drawRect(0.0f, 0.0f, f, (float) height, this.A01);
            canvas.drawCircle(f, 0.0f, (float) ((int) BEB.A00(width, height)), this.A02);
            CSA csa = this.A06;
            canvas.drawPath(csa.A01, csa.A00);
            CX9 cx9 = this.A04;
            canvas.drawPath(cx9.A01, cx9.A00);
            CX9 cx92 = this.A03;
            canvas.drawPath(cx92.A01, cx92.A00);
            CX9 cx93 = this.A05;
            canvas.drawPath(cx93.A01, cx93.A00);
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

    public void onBoundsChange(Rect rect) {
        Rect rect2 = rect;
        C18070vi.A0d(rect2, 0);
        super.onBoundsChange(rect2);
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
        CSA csa = this.A06;
        CMV cmv = csa.A03;
        cmv.A00 = f5;
        cmv.A01 = f6;
        CMV cmv2 = csa.A04;
        cmv2.A00 = f5;
        cmv2.A01 = 0.55f * f;
        CMV cmv3 = csa.A02;
        cmv3.A00 = -0.37f * f2;
        cmv3.A01 = f6;
        CX9 cx9 = this.A05;
        CMV cmv4 = cx9.A05;
        cmv4.A00 = f3;
        cmv4.A01 = f4;
        CMV cmv5 = cx9.A06;
        cmv5.A00 = 0.032f * f2;
        cmv5.A01 = f4;
        CMV cmv6 = cx9.A04;
        cmv6.A00 = f3;
        cmv6.A01 = 1.078f * f;
        CMV cmv7 = cx9.A02;
        cmv7.A00 = 0.122f * f2;
        cmv7.A01 = 0.415f * f;
        CMV cmv8 = cx9.A03;
        cmv8.A00 = -0.01f * f2;
        cmv8.A01 = 0.753f * f;
        CX9 cx92 = this.A03;
        CMV cmv9 = cx92.A05;
        cmv9.A00 = f3;
        cmv9.A01 = f4;
        CMV cmv10 = cx92.A06;
        cmv10.A00 = 0.19f * f2;
        cmv10.A01 = f4;
        CMV cmv11 = cx92.A04;
        cmv11.A00 = f3;
        cmv11.A01 = 1.087f * f;
        CMV cmv12 = cx92.A02;
        cmv12.A00 = 0.197f * f2;
        cmv12.A01 = 0.473f * f;
        CMV cmv13 = cx92.A03;
        cmv13.A00 = 0.025f * f2;
        cmv13.A01 = 0.803f * f;
        CX9 cx93 = this.A04;
        CMV cmv14 = cx93.A05;
        cmv14.A00 = f3;
        cmv14.A01 = f4;
        CMV cmv15 = cx93.A06;
        cmv15.A00 = 0.355f * f2;
        cmv15.A01 = f4;
        CMV cmv16 = cx93.A04;
        cmv16.A00 = f3;
        cmv16.A01 = 1.043f * f;
        CMV cmv17 = cx93.A02;
        cmv17.A00 = 0.27f * f2;
        cmv17.A01 = 0.49f * f;
        CMV cmv18 = cx93.A03;
        cmv18.A00 = 0.057f * f2;
        cmv18.A01 = f * 0.807f;
        int[] A1W = C108945cZ.A1W();
        C25346Ce5.A01(A1W, 0.25f, -1, 0);
        C25346Ce5.A01(A1W, 0.0f, -1, 1);
        this.A02.setShader(new RadialGradient(f2, 0.0f, (float) Math.max((double) ((float) BEB.A00(width, height)), 1.401298464324817E-45d), A1W, (float[]) null, tileMode));
        Path path = csa.A01;
        path.reset();
        path.moveTo(cmv2.A00, cmv2.A01);
        path.lineTo(cmv3.A00, cmv3.A01);
        path.lineTo(cmv.A00, cmv.A01);
        path.close();
        cx93.A00();
        cx92.A00();
        cx9.A00();
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        this.A06.A00.setColorFilter(colorFilter);
        this.A05.A00.setColorFilter(colorFilter);
        this.A03.A00.setColorFilter(colorFilter);
        this.A04.A00.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public BF6(int i, float f) {
        this.A07 = 268435455;
        this.A08 = C108945cZ.A0L();
        this.A01 = AnonymousClass3MW.A06();
        this.A05 = new CX9(-11695, 100);
        this.A03 = new CX9(-44416, 190);
        this.A04 = new CX9(-6278145, 175);
        this.A06 = new CSA();
        Paint A062 = AnonymousClass3MW.A06();
        this.A02 = A062;
        BEA.A12(A062);
    }

    public BF6() {
    }
}
