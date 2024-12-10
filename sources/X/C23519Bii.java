package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.Bii  reason: case insensitive filesystem */
public class C23519Bii extends C27801Xq implements C29331c2 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public CharSequence A0A;
    public final Context A0B;
    public final Paint.FontMetrics A0C = new Paint.FontMetrics();
    public final Rect A0D;
    public final View.OnLayoutChangeListener A0E;
    public final CZD A0F;

    public C23519Bii(Context context, int i) {
        super(context, (AttributeSet) null, 0, i);
        CZD czd = new CZD(this);
        this.A0F = czd;
        this.A0E = new C26581D4v(this, 3);
        this.A0D = AnonymousClass3MW.A07();
        this.A02 = 1.0f;
        this.A03 = 1.0f;
        this.A01 = 0.5f;
        this.A00 = 1.0f;
        this.A0B = context;
        TextPaint textPaint = czd.A04;
        textPaint.density = C72463Mc.A00(context);
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    private float A00() {
        int i;
        Rect rect = this.A0D;
        if (((rect.right - getBounds().right) - this.A06) - this.A05 < 0) {
            i = ((rect.right - getBounds().right) - this.A06) - this.A05;
        } else if (((rect.left - getBounds().left) - this.A06) + this.A05 <= 0) {
            return 0.0f;
        } else {
            i = ((rect.left - getBounds().left) - this.A06) + this.A05;
        }
        return (float) i;
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        canvas2.save();
        float A002 = A00();
        double d = (double) this.A04;
        float f = (float) (-((d * Math.sqrt(2.0d)) - d));
        canvas2.scale(this.A02, this.A03, ((float) getBounds().left) + (BE6.A02(getBounds()) * 0.5f), ((float) getBounds().top) + (((float) getBounds().height()) * this.A01));
        canvas2.translate(A002, f);
        super.draw(canvas2);
        if (this.A0A != null) {
            Rect bounds = getBounds();
            float centerY = (float) bounds.centerY();
            CZD czd = this.A0F;
            TextPaint textPaint = czd.A04;
            Paint.FontMetrics fontMetrics = this.A0C;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (czd.A00 != null) {
                textPaint.drawableState = getState();
                czd.A00.A04(this.A0B, textPaint, czd.A05);
                textPaint.setAlpha((int) (this.A00 * 255.0f));
            }
            CharSequence charSequence = this.A0A;
            canvas2.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) i, textPaint);
        }
        canvas2.restore();
    }

    public int getIntrinsicHeight() {
        return (int) Math.max(this.A0F.A04.getTextSize(), (float) this.A07);
    }

    public int getIntrinsicWidth() {
        float A002;
        float f = (float) (this.A09 * 2);
        CharSequence charSequence = this.A0A;
        if (charSequence == null) {
            A002 = 0.0f;
        } else {
            A002 = this.A0F.A00(charSequence.toString());
        }
        return (int) Math.max(f + A002, (float) this.A08);
    }

    public static AnonymousClass2AG A01(C23519Bii bii) {
        float f = -bii.A00();
        int i = bii.A04;
        float width = ((float) (((double) bii.getBounds().width()) - (((double) i) * Math.sqrt(2.0d)))) / 2.0f;
        return new AnonymousClass2AG(new AnonymousClass2AF((float) i), BE8.A00(f, -width, width));
    }

    public void C8W() {
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C28041Yp r1 = new C28041Yp(this.A01.A0K);
        r1.A08 = A01(this);
        setShapeAppearanceModel(new C28011Ym(r1));
    }
}
