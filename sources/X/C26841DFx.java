package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.DFx  reason: case insensitive filesystem */
public final class C26841DFx implements E1L {
    public final Paint A00;
    public final Paint A01;
    public final CT9 A02;
    public final CT9 A03;

    public C26841DFx(CT9 ct9, CT9 ct92) {
        int i;
        this.A02 = ct9;
        this.A03 = ct92;
        Paint A06 = AnonymousClass3MW.A06();
        int i2 = 0;
        if (ct9 != null) {
            i = ct9.A03;
        } else {
            i = 0;
        }
        A06.setColor(i);
        Paint.Style style = Paint.Style.FILL;
        A06.setStyle(style);
        this.A00 = A06;
        Paint A062 = AnonymousClass3MW.A06();
        A062.setColor(ct92 != null ? ct92.A03 : i2);
        A062.setStyle(style);
        this.A01 = A062;
    }

    public static final void A00(Canvas canvas, Paint paint, CT9 ct9) {
        int i;
        int i2;
        int width = canvas.getWidth();
        String str = ct9.A04;
        if (C18070vi.A18(str, "start")) {
            i = 0;
        } else if (C18070vi.A18(str, "end")) {
            i = width;
        } else {
            i = width / 2;
        }
        float min = Math.min(Math.max(0.0f, ((float) i) + ct9.A00), (float) width);
        int height = canvas.getHeight();
        String str2 = ct9.A06;
        if (C18070vi.A18(str2, "start")) {
            i2 = 0;
        } else if (C18070vi.A18(str2, "end")) {
            i2 = height;
        } else {
            i2 = height / 2;
        }
        float min2 = Math.min(Math.max(0.0f, ((float) i2) + ct9.A02), (float) height);
        if (C18070vi.A18(ct9.A05, "circle")) {
            canvas.drawCircle(min, min2, ct9.A01, paint);
        }
    }
}
