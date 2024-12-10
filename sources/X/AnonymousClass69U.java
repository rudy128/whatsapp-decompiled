package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.69U  reason: invalid class name */
public final class AnonymousClass69U extends C1409773u {
    public final Matrix A00 = C108945cZ.A0J();
    public final Paint A01 = AnonymousClass3MZ.A0A();
    public final Path A02;
    public final Path A03 = C108945cZ.A0L();

    public void A0O(RectF rectF, float f, float f2, float f3, float f4) {
        C18070vi.A0d(rectF, 0);
        float f5 = (f2 + f4) / 2.0f;
        float f6 = ((2.0f * (f3 - f)) / 3.0f) / 2.0f;
        float f7 = f5 - f6;
        float f8 = f5 + f6;
        super.A0O(rectF, f, f7, f3, f8);
    }

    public void A0J(float f) {
        super.A0J((2.0f * f) / 3.0f);
    }

    public AnonymousClass69U() {
        Path A0L = C108945cZ.A0L();
        this.A02 = A0L;
        double radians = Math.toRadians(35.0d);
        float cos = (float) (1000.0d * Math.cos(radians));
        float sin = (float) (1000.0d * Math.sin(radians));
        double radians2 = Math.toRadians(55.0d);
        float cos2 = (float) (1000.0d * Math.cos(radians2));
        float sin2 = (float) (1000.0d * Math.sin(radians2));
        A0L.addArc(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), 55.0f, 360.0f - (55.0f - 35.0f));
        A0L.moveTo(cos, sin);
        A0L.lineTo(1200.0f, 1200.0f);
        A0L.lineTo(cos2, sin2);
    }
}
