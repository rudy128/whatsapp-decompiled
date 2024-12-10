package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.5dV  reason: invalid class name and case insensitive filesystem */
public class C109475dV extends Drawable {
    public int A00 = 255;
    public int A01;
    public ColorFilter A02;
    public final Paint A03 = AnonymousClass3MZ.A0A();
    public final Path A04 = C108945cZ.A0L();
    public final Rect A05 = AnonymousClass3MW.A07();
    public final RectF A06 = AnonymousClass3MW.A08();

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.A02 != colorFilter) {
            this.A02 = colorFilter;
            invalidateSelf();
        }
    }

    public C109475dV(int i) {
        this.A01 = i;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        Rect rect = this.A05;
        int max = Math.max(0, (width - rect.left) - rect.right);
        int max2 = Math.max(0, (bounds.height() - rect.top) - rect.bottom);
        Path path = this.A04;
        path.rewind();
        if (max > max2) {
            float f = (float) max2;
            float f2 = f / 2.0f;
            path.moveTo(f2, 0.0f);
            float f3 = (float) max;
            path.lineTo(f3 - f2, 0.0f);
            RectF rectF = this.A06;
            rectF.set((float) (max - max2), 0.0f, f3, f);
            path.arcTo(rectF, -90.0f, 180.0f);
            path.lineTo(f2, f);
            rectF.set(0.0f, 0.0f, f, f);
            path.arcTo(rectF, 90.0f, 180.0f);
        } else if (max < max2) {
            float f4 = (float) max;
            float f5 = f4 / 2.0f;
            path.moveTo(0.0f, f5);
            float f6 = (float) max2;
            path.lineTo(0.0f, f6 - f5);
            RectF rectF2 = this.A06;
            rectF2.set(0.0f, (float) (max2 - max), f4, f6);
            path.arcTo(rectF2, -180.0f, -180.0f);
            path.lineTo(f4, f5);
            rectF2.set(0.0f, 0.0f, f4, f4);
            path.arcTo(rectF2, 0.0f, -180.0f);
        } else {
            RectF rectF3 = this.A06;
            rectF3.set(0.0f, 0.0f, (float) max, (float) max2);
            path.addOval(rectF3, Path.Direction.CW);
        }
        path.close();
        path.setFillType(Path.FillType.WINDING);
        Paint paint = this.A03;
        int alpha = paint.getAlpha();
        int i = this.A00;
        int i2 = (alpha * (i + (i >> 7))) >> 8;
        C108945cZ.A1L(paint);
        ColorFilter colorFilter = this.A02;
        if (colorFilter == null) {
            colorFilter = C7H.A00(AnonymousClass00R.A0j, this.A01);
        }
        paint.setColorFilter(colorFilter);
        paint.setAlpha(i2);
        canvas.translate((float) (bounds.left + rect.left), (float) (bounds.top + rect.top));
        canvas.drawPath(path, paint);
        canvas.translate((float) (-(bounds.left + rect.left)), (float) (-(bounds.top + rect.top)));
        paint.setAlpha(alpha);
    }

    public int getAlpha() {
        return this.A00;
    }

    public ColorFilter getColorFilter() {
        return this.A02;
    }

    public boolean isStateful() {
        return AnonymousClass000.A1O(super.isStateful() ? 1 : 0);
    }

    public boolean onStateChange(int[] iArr) {
        return false;
    }
}
