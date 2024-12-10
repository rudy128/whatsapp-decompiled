package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.3N3  reason: invalid class name */
public final class AnonymousClass3N3 extends Drawable {
    public final float A00;
    public final float A01;
    public final Paint A02;
    public final String A03 = "👋";

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        canvas.drawText(this.A03, this.A00, this.A01, this.A02);
    }

    public int getOpacity() {
        return -3;
    }

    public AnonymousClass3N3(float f, float f2, float f3) {
        this.A00 = f2;
        this.A01 = f3;
        Paint A06 = AnonymousClass3MW.A06();
        this.A02 = A06;
        A06.setTextAlign(Paint.Align.CENTER);
        A06.setTextSize(f);
    }

    public void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }
}
