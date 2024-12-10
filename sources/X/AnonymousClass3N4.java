package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.3N4  reason: invalid class name */
public final class AnonymousClass3N4 extends Drawable {
    public Path A00;
    public RectF A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final Bitmap A05;
    public final C18140vp A06 = C99054sC.A01(this, 39);
    public final boolean A07;
    public final float A08;
    public final Paint A09;
    public final Paint A0A;

    public void draw(Canvas canvas) {
        String str;
        C18070vi.A0d(canvas, 0);
        int save = canvas.save();
        Path path = this.A00;
        if (path != null) {
            canvas.clipPath(path);
            canvas.drawPaint(this.A09);
            if (!this.A07) {
                Bitmap bitmap = this.A05;
                RectF rectF = this.A01;
                str = "backgroundRectF";
                if (rectF != null) {
                    float f = rectF.left;
                    float f2 = rectF.top;
                    Object A0m = C72463Mc.A0m(this.A06);
                    C18070vi.A0X(A0m);
                    canvas.drawBitmap(bitmap, f, f2, (Paint) A0m);
                }
                C18070vi.A11(str);
                throw null;
            }
            Object A0m2 = C72463Mc.A0m(this.A06);
            C18070vi.A0X(A0m2);
            canvas.drawPaint((Paint) A0m2);
            Path path2 = this.A00;
            if (path2 != null) {
                canvas.drawPath(path2, this.A0A);
                canvas.restoreToCount(save);
                return;
            }
        }
        str = "backgroundPath";
        C18070vi.A11(str);
        throw null;
    }

    public int getOpacity() {
        return -1;
    }

    public void onBoundsChange(Rect rect) {
        C18070vi.A0d(rect, 0);
        super.onBoundsChange(rect);
        float f = this.A03;
        float width = ((float) getBounds().left) + ((((float) getBounds().width()) - f) / 2.0f);
        float f2 = this.A02;
        float height = ((float) getBounds().top) + ((((float) getBounds().height()) - f2) / 2.0f);
        this.A01 = new RectF(width, height, f + width, f2 + height);
        Path path = new Path();
        RectF rectF = this.A01;
        if (rectF == null) {
            C18070vi.A11("backgroundRectF");
            throw null;
        }
        float[] fArr = new float[8];
        int i = 0;
        do {
            fArr[i] = this.A08;
            i++;
        } while (i < 8);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        this.A00 = path;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass3N4(Bitmap bitmap, float f, float f2, float f3, float f4, int i, int i2, int i3, boolean z) {
        this.A04 = i2;
        this.A08 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A05 = bitmap;
        this.A07 = z;
        Paint A062 = AnonymousClass3MW.A06();
        AnonymousClass3MZ.A1D(i, A062);
        A062.setAntiAlias(true);
        this.A09 = A062;
        Paint A063 = AnonymousClass3MW.A06();
        A063.setColor(i3);
        AnonymousClass3MW.A1P(A063);
        A063.setStrokeWidth(f);
        A063.setAntiAlias(true);
        this.A0A = A063;
    }
}
