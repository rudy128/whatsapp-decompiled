package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.5dR  reason: invalid class name and case insensitive filesystem */
public final class C109435dR extends Drawable {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final RectF A04 = AnonymousClass3MW.A08();

    public C109435dR(Context context) {
        C18070vi.A0d(context, 1);
        Resources resources = context.getResources();
        this.A02 = resources.getDimensionPixelSize(2131167964);
        int dimensionPixelSize = resources.getDimensionPixelSize(2131167963);
        this.A01 = dimensionPixelSize;
        this.A00 = C108945cZ.A02(dimensionPixelSize);
        Paint A06 = AnonymousClass3MW.A06();
        this.A03 = A06;
        AnonymousClass3MX.A19(context, A06, 2131100590);
        A06.setAntiAlias(true);
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        RectF rectF = this.A04;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A03);
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        C18070vi.A0d(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A04;
        float centerX = (float) rect.centerX();
        float f = ((float) this.A02) / 2.0f;
        float centerY = (float) rect.centerY();
        float f2 = ((float) this.A01) / 2.0f;
        rectF.set(centerX - f, centerY - f2, ((float) rect.centerX()) + f, ((float) rect.centerY()) + f2);
    }

    public void setAlpha(int i) {
        this.A03.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
