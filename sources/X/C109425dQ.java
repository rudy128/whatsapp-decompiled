package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.5dQ  reason: invalid class name and case insensitive filesystem */
public final class C109425dQ extends Drawable {
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final RectF A03 = AnonymousClass3MW.A08();

    public C109425dQ(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167971);
        this.A01 = dimensionPixelSize;
        this.A00 = context.getResources().getDimensionPixelSize(2131167970);
        Paint A0K = C108945cZ.A0K(1);
        AnonymousClass3MW.A1P(A0K);
        AnonymousClass3MX.A19(context, A0K, 2131101059);
        A0K.setStrokeWidth((float) dimensionPixelSize);
        this.A02 = A0K;
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        RectF rectF = this.A03;
        float f = (float) this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A02);
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        C18070vi.A0d(rect, 0);
        super.onBoundsChange(rect);
        float A022 = C108945cZ.A02(this.A01);
        this.A03.set(((float) rect.left) + A022, ((float) rect.top) + A022, ((float) rect.right) - A022, ((float) rect.bottom) - A022);
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.A02.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
