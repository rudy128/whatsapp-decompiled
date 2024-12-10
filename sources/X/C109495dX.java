package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.5dX  reason: invalid class name and case insensitive filesystem */
public final class C109495dX extends Drawable {
    public float A00;
    public boolean A01;
    public float A02;
    public final Paint A03;
    public final RectF A04 = AnonymousClass3MW.A08();

    public C109495dX(Context context) {
        Paint A06 = AnonymousClass3MW.A06();
        AnonymousClass3MX.A19(context, A06, 2131103104);
        this.A03 = A06;
        this.A00 = 1.0f;
        this.A01 = true;
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        RectF rectF = this.A04;
        float f = this.A02;
        canvas.drawRoundRect(rectF, f, f, this.A03);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.A03.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public static final void A00(C109495dX r7) {
        float height = ((float) r7.getBounds().height()) * r7.A00;
        float f = (float) r7.getBounds().left;
        float f2 = (float) r7.getBounds().right;
        float f3 = height / 2.0f;
        r7.A02 = (f2 - f) / 2.0f;
        r7.A04.set(f, r7.getBounds().exactCenterY() - f3, f2, r7.getBounds().exactCenterY() + f3);
        Paint paint = r7.A03;
        paint.setShader((Shader) null);
        int i = 76;
        if (r7.A01) {
            i = 255;
        }
        paint.setAlpha(i);
        r7.invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        A00(this);
    }
}
