package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.5dM  reason: invalid class name and case insensitive filesystem */
public class C109385dM extends Drawable {
    public final Paint A00;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C109385dM() {
        Paint A0A = AnonymousClass3MZ.A0A();
        this.A00 = A0A;
        AnonymousClass3MZ.A1D(285212672, A0A);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (bounds.width() / 2), this.A00);
    }
}
