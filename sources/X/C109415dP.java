package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.5dP  reason: invalid class name and case insensitive filesystem */
public final class C109415dP extends Drawable {
    public final float A00;
    public final int A01;
    public final Paint A02;
    public final RectF A03 = AnonymousClass3MW.A08();

    public C109415dP(Context context) {
        C18070vi.A0d(context, 1);
        Paint A06 = AnonymousClass3MW.A06();
        AnonymousClass3MX.A19(context, A06, 2131100589);
        A06.setAntiAlias(true);
        this.A02 = A06;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167961);
        this.A01 = dimensionPixelSize;
        this.A00 = C108945cZ.A02(dimensionPixelSize);
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        RectF rectF = this.A03;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A02);
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        C18070vi.A0d(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A03;
        float f = (float) rect.left;
        float centerY = (float) rect.centerY();
        float A022 = C108945cZ.A02(this.A01);
        rectF.set(f, centerY - A022, (float) rect.right, ((float) rect.centerY()) + A022);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
