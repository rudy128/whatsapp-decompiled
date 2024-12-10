package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.26m  reason: invalid class name */
public class AnonymousClass26m extends Drawable {
    public final float A00;
    public final Paint A01 = new Paint();
    public final int[] A02;

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    public AnonymousClass26m(int[] iArr, float f) {
        this.A02 = iArr;
        this.A00 = f;
    }

    public void draw(Canvas canvas) {
        int width = getBounds().width();
        int height = getBounds().height();
        Paint paint = this.A01;
        paint.setTextSize(((float) width) * this.A00);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(255);
        paint.setTextAlign(Paint.Align.CENTER);
        int i = width / 2;
        int descent = (int) (((float) (height / 2)) - ((paint.descent() + paint.ascent()) / 2.0f));
        int[] iArr = this.A02;
        StringBuilder A10 = AnonymousClass000.A10();
        for (int appendCodePoint : iArr) {
            A10.appendCodePoint(appendCodePoint);
        }
        String obj = A10.toString();
        if (!C25898Co9.A01(paint, obj)) {
            obj = C43271zX.A00;
        }
        canvas.drawText(obj, (float) i, (float) descent, paint);
    }
}
