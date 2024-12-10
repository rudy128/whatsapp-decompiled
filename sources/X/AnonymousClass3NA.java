package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.3NA  reason: invalid class name */
public final class AnonymousClass3NA extends Drawable {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final Paint A03;
    public final Paint A04;
    public final RectF A05 = AnonymousClass3MW.A08();
    public final RectF A06 = AnonymousClass3MW.A08();
    public final AnonymousClass4P1 A07;

    public AnonymousClass3NA(AnonymousClass4P1 r4) {
        C18070vi.A0d(r4, 1);
        this.A07 = r4;
        Paint paint = new Paint(1);
        AnonymousClass3MW.A1P(paint);
        this.A04 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.A03 = paint2;
    }

    public void draw(Canvas canvas) {
        boolean z;
        C18070vi.A0d(canvas, 0);
        if (this.A01 || this.A02) {
            RectF rectF = this.A05;
            float height = rectF.height() * 0.5f;
            canvas.drawRoundRect(rectF, height, height, this.A03);
        }
        if (this.A01) {
            z = this.A00;
        } else {
            z = this.A02;
        }
        if (!z) {
            RectF rectF2 = this.A06;
            float height2 = rectF2.height() * 0.5f;
            canvas.drawRoundRect(rectF2, height2, height2, this.A04);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        C18070vi.A0d(iArr, 0);
        boolean z = this.A02;
        boolean A0V = C200410p.A0V(iArr, 16842913);
        if (z != A0V) {
            this.A02 = A0V;
            A02(this);
            invalidateSelf();
        }
        if (z == this.A02) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    private final void A00(int i) {
        AnonymousClass4P1 r2;
        int i2;
        int i3;
        Paint paint = this.A04;
        float f = (float) i;
        paint.setStrokeWidth(0.025f * f);
        if (this.A00) {
            paint.setPathEffect((PathEffect) null);
            r2 = this.A07;
            i2 = r2.A05;
        } else {
            float f2 = f * 0.0478602f;
            paint.setPathEffect(new DashPathEffect(new float[]{f2, f2}, 0.0f));
            r2 = this.A07;
            i2 = r2.A06;
        }
        paint.setColor(i2);
        Paint paint2 = this.A03;
        if (this.A02 || !this.A01) {
            i3 = r2.A07;
        } else {
            i3 = r2.A02;
        }
        paint2.setColor(i3);
    }

    private final void A01(int i, int i2, int i3, int i4) {
        float strokeWidth = this.A04.getStrokeWidth() * 0.5f;
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = (float) i3;
        float f4 = (float) i4;
        this.A06.set(f + strokeWidth, f2 + strokeWidth, f3 - strokeWidth, f4 - strokeWidth);
        this.A05.set(f, f2, f3, f4);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        A00(i3 - i);
        A01(i, i2, i3, i4);
        super.setBounds(i, i2, i3, i4);
    }

    public static final void A02(AnonymousClass3NA r4) {
        r4.A00(r4.getBounds().width());
        r4.A01(r4.getBounds().left, r4.getBounds().top, r4.getBounds().right, r4.getBounds().bottom);
    }
}
