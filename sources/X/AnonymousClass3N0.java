package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.3N0  reason: invalid class name */
public final class AnonymousClass3N0 extends Drawable {
    public final Paint A00;
    public final Paint A01;

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas, 0);
        canvas2.drawOval((float) getBounds().left, (float) getBounds().top, (float) getBounds().right, (float) getBounds().bottom, this.A00);
        canvas2.drawOval((float) getBounds().left, (float) getBounds().top, (float) getBounds().right, (float) getBounds().bottom, this.A01);
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass3N0(int i, int i2, float f) {
        Paint A06 = AnonymousClass3MW.A06();
        AnonymousClass3MZ.A1D(i, A06);
        A06.setAntiAlias(true);
        this.A00 = A06;
        Paint A062 = AnonymousClass3MW.A06();
        A062.setColor(i2);
        AnonymousClass3MW.A1P(A062);
        A062.setStrokeWidth(f);
        A062.setAntiAlias(true);
        this.A01 = A062;
    }
}
