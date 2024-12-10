package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.69b  reason: invalid class name */
public final class AnonymousClass69b extends C1409773u {
    public static final C130116iu[] A07 = {new C130116iu(68.0f, 47.0f, 309.0f, 266.0f, 164.0f, 156.0f), new C130116iu(246.0f, 17.0f, 419.0f, 142.0f, 196.0f, 124.0f), new C130116iu(390.0f, 0.0f, 546.0f, 155.0f, 195.0f, 128.0f), new C130116iu(507.0f, 1.0f, 686.0f, 179.0f, 208.0f, 146.0f), new C130116iu(575.0f, 64.0f, 750.0f, 235.0f, 284.0f, 122.0f), new C130116iu(530.0f, 141.0f, 769.0f, 357.0f, 324.0f, 118.0f), new C130116iu(459.0f, 261.0f, 664.0f, 449.0f, 300.0f, 180.0f), new C130116iu(275.0f, 316.0f, 510.0f, 512.0f, 0.0f, 164.0f), new C130116iu(97.0f, 286.0f, 346.0f, 482.0f, 56.0f, 100.0f), new C130116iu(17.0f, 279.0f, 174.0f, 419.0f, 67.0f, 152.0f), new C130116iu(0.0f, 171.0f, 157.0f, 311.0f, 91.0f, 170.0f)};
    public final Matrix A00;
    public final Paint A01;
    public final Path A02;
    public final Path A03;
    public final Path A04;
    public final RectF A05;
    public final RectF A06;

    public void A0O(RectF rectF, float f, float f2, float f3, float f4) {
        RectF rectF2 = rectF;
        C18070vi.A0d(rectF, 0);
        float f5 = f3 - f;
        float f6 = f4 - f2;
        RectF rectF3 = this.A05;
        if (f5 / f6 < rectF3.width() / rectF3.height()) {
            f6 = (rectF3.height() * f5) / rectF3.width();
        } else {
            f5 = (rectF3.width() * f6) / rectF3.height();
        }
        float f7 = (f + f3) / 2.0f;
        float f8 = (f2 + f4) / 2.0f;
        float f9 = f5 / 2.0f;
        float f10 = f6 / 2.0f;
        super.A0O(rectF2, f7 - f9, f8 - f10, f7 + f9, f8 + f10);
    }

    public static final void A00(Canvas canvas, AnonymousClass69b r10, float f, float f2) {
        RectF rectF = r10.A06;
        float width = rectF.width() / r10.A05.width();
        float f3 = 60.0f * width * f2;
        float f4 = 30.0f * width * f2;
        float centerX = rectF.centerX() + (((float) ((Math.cos(Math.toRadians((double) r10.A02)) * ((double) rectF.width())) / 2.0d)) * f);
        float centerY = rectF.centerY() + (f * ((float) ((Math.sin(Math.toRadians((double) r10.A02)) * ((double) rectF.height())) / 2.0d)));
        RectF rectF2 = r10.A06;
        rectF2.set(centerX - f3, centerY - f4, centerX + f3, centerY + f4);
        canvas.drawOval(rectF2, r10.A01);
        canvas.drawOval(rectF2, r10.A05);
    }

    public void A0J(float f) {
        super.A0J((3.0f * f) / 5.0f);
    }

    public AnonymousClass69b() {
        Path.Direction direction;
        Path A0L = C108945cZ.A0L();
        C130116iu[] r9 = A07;
        int i = 0;
        do {
            C130116iu r6 = r9[i];
            A0L.addArc(new RectF(r6.A01, r6.A05, r6.A02, r6.A00), r6.A03, r6.A04);
            i++;
        } while (i < 11);
        this.A03 = A0L;
        Path A0L2 = C108945cZ.A0L();
        int i2 = 0;
        do {
            C130116iu r0 = r9[i2];
            RectF rectF = new RectF(r0.A01, r0.A05, r0.A02, r0.A00);
            direction = Path.Direction.CW;
            A0L2.addOval(rectF, direction);
            i2++;
        } while (i2 < 11);
        A0L2.addRect(120.0f, 80.0f, 580.0f, 430.0f, direction);
        this.A02 = A0L2;
        this.A01 = C108945cZ.A0K(1);
        this.A00 = C108945cZ.A0J();
        RectF A08 = AnonymousClass3MW.A08();
        this.A05 = A08;
        this.A04 = C108945cZ.A0L();
        this.A06 = AnonymousClass3MW.A08();
        A0L.setFillType(Path.FillType.WINDING);
        A0L.computeBounds(A08, true);
        this.A02 = 120.0f;
    }
}
