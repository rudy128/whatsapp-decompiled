package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.5dU  reason: invalid class name and case insensitive filesystem */
public final class C109465dU extends Drawable {
    public Bitmap A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Matrix A06;
    public final Paint A07;
    public final Path A08 = C108945cZ.A0L();
    public final RectF A09;
    public final RectF A0A;
    public final RectF A0B;
    public final float A0C;
    public final int A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Shader A0G;

    public C109465dU(Resources resources) {
        Resources resources2 = resources;
        C18070vi.A0d(resources2, 1);
        Paint A0K = C108945cZ.A0K(1);
        this.A0F = A0K;
        Paint A0K2 = C108945cZ.A0K(1);
        this.A07 = A0K2;
        Paint A0K3 = C108945cZ.A0K(1);
        this.A0E = A0K3;
        RectF A042 = C108965cb.A04(62.0f, 73.0f);
        this.A09 = A042;
        this.A0B = AnonymousClass3MW.A08();
        this.A06 = C108945cZ.A0J();
        int dimensionPixelSize = resources2.getDimensionPixelSize(2131166595);
        this.A05 = dimensionPixelSize;
        float f = (float) dimensionPixelSize;
        float width = f / (A042.width() / A042.height());
        int color = resources2.getColor(2131103394);
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(2131166593);
        int color2 = resources2.getColor(2131103056);
        int dimensionPixelSize3 = resources2.getDimensionPixelSize(2131166594);
        this.A04 = dimensionPixelSize3;
        int dimensionPixelSize4 = resources2.getDimensionPixelSize(2131166591);
        this.A02 = dimensionPixelSize4;
        int dimensionPixelSize5 = resources2.getDimensionPixelSize(2131166592);
        this.A0D = dimensionPixelSize5;
        float f2 = f / 6.0f;
        float f3 = f2 / 2.0f;
        this.A01 = f3;
        float f4 = (float) dimensionPixelSize4;
        float f5 = f4 + f3;
        this.A0C = f5;
        int i = (int) ((width / 3.5f) + width + f2 + f4);
        this.A03 = i;
        this.A0G = new RadialGradient((float) ((dimensionPixelSize / 2) + dimensionPixelSize3 + dimensionPixelSize4), ((float) i) - f3, f5, color2, 0, Shader.TileMode.CLAMP);
        float f6 = (float) dimensionPixelSize3;
        this.A0A = new RectF(f6, f6, (float) (dimensionPixelSize - dimensionPixelSize3), width - f6);
        C108945cZ.A1L(A0K2);
        A0K.setStrokeWidth(f6);
        A0K.setStrokeMiter((float) dimensionPixelSize2);
        AnonymousClass3MW.A1P(A0K);
        A0K.setColor(color);
        A0K3.setShadowLayer((float) dimensionPixelSize5, 0.0f, 0.0f, color2);
        Path path = this.A08;
        path.reset();
        path.moveTo(0.0f, 31.02f);
        path.cubicTo(-0.18f, 55.51f, 31.0f, 73.0f, 31.0f, 73.0f);
        Path path2 = path;
        path2.cubicTo(31.0f, 73.0f, 62.0f, 55.51f, 62.0f, 31.02f);
        path.cubicTo(62.0f, 13.89f, 48.12f, 0.0f, 31.0f, 0.0f);
        path2.cubicTo(13.88f, 0.0f, 0.13f, 13.89f, 0.0f, 31.02f);
        path.close();
        RectF rectF = this.A09;
        RectF rectF2 = this.A0A;
        RectF rectF3 = this.A0B;
        C18070vi.A0o(rectF, rectF2, rectF3);
        if (rectF.equals(rectF2)) {
            rectF3.set(rectF);
        } else {
            float width2 = rectF.width();
            float height = rectF.height();
            float min = Math.min(Math.abs(rectF2.width() / width2), Math.abs(rectF2.height() / height));
            float abs = Math.abs(rectF.width() * min);
            float f7 = abs / 2.0f;
            float abs2 = Math.abs(rectF.height() * min) / 2.0f;
            rectF3.set(rectF2.centerX() - f7, rectF2.centerY() - abs2, rectF2.centerX() + f7, rectF2.centerY() + abs2);
        }
        Matrix matrix = this.A06;
        matrix.setScale(rectF3.width() / rectF.width(), rectF3.height() / rectF.height(), 0.0f, 0.0f);
        path.transform(matrix);
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        Bitmap bitmap = this.A00;
        if (bitmap == null) {
            bitmap = C108945cZ.A0H(canvas.getWidth(), canvas.getHeight());
            Canvas A0I = C108945cZ.A0I(bitmap);
            A0I.save();
            float f = (float) (this.A04 + this.A0D);
            A0I.translate(f, f);
            A0I.drawPath(this.A08, this.A0E);
            A0I.restore();
            this.A00 = bitmap;
            if (bitmap == null) {
                return;
            }
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.save();
        int i = this.A04;
        float f2 = (float) (this.A0D + i);
        canvas.translate(f2, f2);
        Path path = this.A08;
        Paint paint = this.A07;
        canvas.drawPath(path, paint);
        Paint paint2 = this.A0F;
        canvas.drawPath(path, paint2);
        canvas.restore();
        canvas.save();
        paint.setShader(this.A0G);
        float f3 = (float) ((this.A05 / 2) + i + this.A02);
        float f4 = this.A01;
        float f5 = ((float) this.A03) - f4;
        canvas.drawCircle(f3, f5, this.A0C, paint);
        paint.setShader((Shader) null);
        canvas.drawCircle(f3, f5, f4, paint);
        canvas.drawCircle(f3, f5, f4, paint2);
        canvas.restore();
    }

    public int getOpacity() {
        return -1;
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getIntrinsicHeight() {
        return this.A03 + (this.A0D * 2);
    }

    public int getIntrinsicWidth() {
        return this.A05 + (this.A0D * 2);
    }

    public void setAlpha(int i) {
        this.A07.setAlpha(i);
        invalidateSelf();
    }
}
