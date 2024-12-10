package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class BF4 extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06 = AnonymousClass3MZ.A0A();

    private void A00(Canvas canvas, float f, float f2) {
        int i = 0;
        do {
            int i2 = (this.A00 * i) + 50;
            Paint paint = this.A06;
            AnonymousClass3MW.A1P(paint);
            paint.setStrokeWidth((float) this.A05);
            paint.setColor(this.A01);
            canvas.drawCircle(f, f2, (float) i2, paint);
            i++;
        } while (i < 62);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public BF4(Context context) {
        this.A05 = context.getResources().getDimensionPixelSize(2131168195);
        this.A00 = context.getResources().getDimensionPixelSize(2131168194);
        this.A02 = context.getResources().getDimensionPixelSize(2131168196);
        this.A01 = context.getResources().getColor(2131102097);
        this.A04 = context.getResources().getColor(2131102099);
        this.A03 = context.getResources().getColor(2131102098);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
        int[] A1W = C108945cZ.A1W();
        A1W[0] = this.A04;
        A1W[1] = this.A03;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, A1W);
        float f = (float) this.A02;
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setBounds(0, 0, width, height);
        gradientDrawable.draw(canvas);
        RectF A042 = C108965cb.A04((float) width, (float) height);
        Path A0L = C108945cZ.A0L();
        A0L.addRoundRect(A042, f, f, Path.Direction.CW);
        canvas.clipPath(A0L);
        float f2 = (float) (height + 120);
        A00(canvas, 100.0f, f2);
        A00(canvas, (float) (width - 100), f2);
    }
}
