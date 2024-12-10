package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.5dT  reason: invalid class name and case insensitive filesystem */
public final class C109455dT extends Drawable {
    public float A00 = 1.0f;
    public float A01;
    public int A02;
    public Drawable A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final Paint A0A;

    public C109455dT(Context context, int i) {
        Drawable drawable;
        Paint A0K = C108945cZ.A0K(1);
        C108945cZ.A1L(A0K);
        this.A0A = A0K;
        float A002 = C72463Mc.A00(context);
        this.A07 = 0.75f * A002;
        this.A09 = (int) (A002 * 48.0f);
        if (i != 0) {
            drawable = C24261Jm.A00(context, i);
        } else {
            drawable = null;
        }
        this.A03 = drawable;
        this.A08 = context.getResources().getDimension(2131169037);
        this.A06 = C19740yt.A00(context, 2131102721);
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        Rect bounds = getBounds();
        C18070vi.A0X(bounds);
        float min = ((float) Math.min(getBounds().width(), getBounds().height())) * 0.4375f;
        if (this.A05) {
            Paint paint = this.A0A;
            C108945cZ.A1L(paint);
            paint.setColor(this.A02);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), min, paint);
            C108945cZ.A1L(paint);
            paint.setColor(-1);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (this.A01 * 1.2f) / 2.0f, paint);
            if (Color.red(this.A02) > 240 && Color.green(this.A02) > 240 && Color.blue(this.A02) > 240) {
                AnonymousClass3MW.A1P(paint);
                paint.setStrokeWidth(this.A07);
                int min2 = 255 - ((Math.min(Math.min(Color.red(this.A02), Color.green(this.A02)), Color.blue(this.A02)) - 240) * 3);
                paint.setColor(Color.argb(255, min2, min2, min2));
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (this.A01 * 1.2f) / 2.0f, paint);
                return;
            }
            return;
        }
        if (this.A02 != 0) {
            Paint paint2 = this.A0A;
            C108945cZ.A1L(paint2);
            paint2.setColor(this.A02);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), this.A00 * min, paint2);
            if (this.A04) {
                AnonymousClass3MW.A1P(paint2);
                paint2.setStrokeWidth(this.A08);
                paint2.setColor(this.A06);
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (this.A00 * min) - (paint2.getStrokeWidth() / 2.0f), paint2);
            }
        }
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setBounds(bounds.centerX() - (drawable.getIntrinsicWidth() / 2), bounds.centerY() - (drawable.getIntrinsicHeight() / 2), bounds.centerX() + (drawable.getIntrinsicWidth() / 2), bounds.centerY() + (drawable.getIntrinsicHeight() / 2));
            drawable.draw(canvas);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void A00(int i, float f) {
        this.A01 = f;
        this.A02 = i;
        this.A00 = 1.0f;
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return this.A09;
    }

    public int getIntrinsicWidth() {
        return this.A09;
    }
}
