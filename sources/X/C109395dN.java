package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.5dN  reason: invalid class name and case insensitive filesystem */
public class C109395dN extends Drawable {
    public final C1409773u A00;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C109395dN(C1409773u r1) {
        this.A00 = r1;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        C1409773u r3 = this.A00;
        float A0B = r3.A0B() / 2.0f;
        r3.A0O(AnonymousClass3MW.A08(), ((float) bounds.left) + A0B, ((float) bounds.top) + A0B, ((float) bounds.right) - A0B, ((float) bounds.bottom) - A0B);
        r3.A0M(canvas);
    }
}
