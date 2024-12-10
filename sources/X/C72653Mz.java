package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.3Mz  reason: invalid class name and case insensitive filesystem */
public final class C72653Mz extends Drawable {
    public final Paint A00;

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        canvas.drawRect(getBounds(), this.A00);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C72653Mz(int i) {
        Paint A0A = AnonymousClass3MZ.A0A();
        this.A00 = A0A;
        if (A0A.getColor() != i) {
            A0A.setColor(i);
            invalidateSelf();
        }
    }
}
