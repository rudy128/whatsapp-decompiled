package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.5dY  reason: invalid class name and case insensitive filesystem */
public final class C109505dY extends Drawable {
    public final Paint A00;
    public final Drawable A01;

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        Rect bounds = getBounds();
        C18070vi.A0X(bounds);
        RectF rectF = new RectF(bounds);
        canvas.drawCircle(rectF.centerX(), rectF.centerX(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.A00);
        this.A01.draw(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public void setBounds(Rect rect) {
        C18070vi.A0d(rect, 0);
        super.setBounds(rect);
        A00();
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.A00.setAlpha(i);
        this.A01.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C109505dY(Drawable drawable, int i) {
        this.A01 = drawable;
        Paint A06 = AnonymousClass3MW.A06();
        A06.setColor(i);
        this.A00 = A06;
    }

    private final void A00() {
        Rect bounds = getBounds();
        C18070vi.A0X(bounds);
        RectF rectF = new RectF(bounds);
        Drawable drawable = this.A01;
        RectF rectF2 = new RectF(rectF.width() * 0.2f, rectF.height() * 0.2f, rectF.width() * 0.8f, rectF.height() * 0.8f);
        Rect A07 = AnonymousClass3MW.A07();
        rectF2.roundOut(A07);
        drawable.setBounds(A07);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        A00();
        invalidateSelf();
    }
}
