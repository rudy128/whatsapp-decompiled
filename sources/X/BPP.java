package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class BPP extends DA3 {
    public float A00;
    public C25600Cif A01;
    public final float A02;
    public final Rect A03 = AnonymousClass3MW.A07();
    public final RectF A04 = AnonymousClass3MW.A08();
    public final RectF A05 = AnonymousClass3MW.A08();
    public final Drawable A06;
    public final C04 A07;
    public final Paint A08;

    public void A08(Canvas canvas) {
        Drawable drawable = this.A06;
        Rect rect = this.A03;
        drawable.setBounds(rect);
        canvas.drawCircle((float) rect.centerX(), (float) rect.centerY(), (float) (rect.width() >> 1), this.A08);
        drawable.setAlpha(76);
        drawable.draw(canvas);
    }

    public BPP(Drawable drawable, DAE dae, C04 c04, C25600Cif cif) {
        super(dae);
        Paint A062 = AnonymousClass3MW.A06();
        this.A08 = A062;
        this.A01 = cif;
        this.A06 = drawable;
        float f = this.A0B;
        this.A02 = (f * 48.0f) / 2.0f;
        this.A00 = (float) ((int) (f * 8.0f));
        this.A03 = 5;
        this.A02 = 4.0f;
        this.A07 = c04 == null ? C04.BOTTOM_RIGHT : c04;
        A062.setColor(-1);
        A062.setAlpha(178);
    }
}
