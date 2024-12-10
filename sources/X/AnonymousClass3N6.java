package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* renamed from: X.3N6  reason: invalid class name */
public final class AnonymousClass3N6 extends Drawable {
    public final int A00;
    public final Paint A01;
    public final RectF A02 = AnonymousClass3MW.A08();
    public final ClipDrawable A03;
    public final ShapeDrawable A04;

    public AnonymousClass3N6(Context context) {
        Paint A06 = AnonymousClass3MW.A06();
        this.A01 = A06;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        this.A04 = shapeDrawable;
        this.A03 = new ClipDrawable(shapeDrawable, 3, 1);
        AnonymousClass3MX.A19(context, A06, 17170445);
        this.A00 = C19740yt.A00(context, 2131100590);
        A00(0.0f);
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        canvas.drawRect(this.A02, this.A01);
        this.A03.draw(canvas);
    }

    public int getOpacity() {
        return -1;
    }

    public void onBoundsChange(Rect rect) {
        C18070vi.A0d(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A02;
        rectF.set(rect);
        this.A03.setBounds(rect);
        Paint paint = this.A04.getPaint();
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        int i = this.A00;
        paint.setShader(new LinearGradient(f, f2, f3, f4, i, i, Shader.TileMode.CLAMP));
        invalidateSelf();
    }

    public final void A00(float f) {
        this.A03.mutate().setLevel((int) (f * 10000.0f));
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.A01.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
