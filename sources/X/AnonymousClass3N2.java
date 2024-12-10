package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.3N2  reason: invalid class name */
public final class AnonymousClass3N2 extends Drawable {
    public final int A00;
    public final Bitmap A01;
    public final Paint A02;

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        canvas.drawColor(this.A00);
        canvas.drawPaint(this.A02);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public AnonymousClass3N2(int i, int i2, Bitmap bitmap) {
        this.A00 = i;
        this.A01 = bitmap;
        Paint A06 = AnonymousClass3MW.A06();
        A06.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        A06.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        A06.setColor(i2);
        this.A02 = A06;
    }
}
