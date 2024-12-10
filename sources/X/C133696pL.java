package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import java.util.Locale;

/* renamed from: X.6pL  reason: invalid class name and case insensitive filesystem */
public final class C133696pL {
    public boolean A00 = true;
    public final TextPaint A01;
    public final TextPaint A02;
    public final String A03;

    public C133696pL(Context context, C18000vb r9) {
        TextPaint textPaint = new TextPaint(1);
        this.A02 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.A01 = textPaint2;
        textPaint.setColor(-1);
        C108995ce.A0o(textPaint, 40.0f);
        textPaint.setShadowLayer(0.5f, 0.0f, 1.0f, Color.parseColor("#73000000"));
        textPaint2.setColor(0);
        C108995ce.A0o(textPaint2, 40.0f);
        textPaint2.setShadowLayer(7.0f, 0.0f, 0.0f, Color.parseColor("#4D000000"));
        String A0F = C18070vi.A0F(context, 2131896772);
        Locale A0N = r9.A0N();
        C18070vi.A0X(A0N);
        String upperCase = A0F.toUpperCase(A0N);
        C18070vi.A0X(upperCase);
        this.A03 = upperCase;
    }

    public final void A01(Canvas canvas, RectF rectF, float f) {
        if (this.A00) {
            Rect A07 = AnonymousClass3MW.A07();
            TextPaint textPaint = this.A02;
            String str = this.A03;
            textPaint.getTextBounds(str, 0, str.length(), A07);
            canvas.save();
            float width = rectF.left + (rectF.width() / 2.0f);
            float height = rectF.top + rectF.height() + ((float) (A07.height() * 2));
            C108985cd.A0w(canvas, rectF, f);
            canvas.drawText(str, width, height, this.A01);
            canvas.drawText(str, width, height, textPaint);
            canvas.restore();
        }
    }

    public final void A00(float f) {
        if (this.A00) {
            TextPaint textPaint = this.A02;
            textPaint.setTextSize(textPaint.getTextSize() * f);
            TextPaint textPaint2 = this.A01;
            textPaint2.setTextSize(textPaint2.getTextSize() * f);
        }
    }
}
