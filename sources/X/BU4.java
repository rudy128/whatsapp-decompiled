package X;

import android.graphics.Canvas;
import android.graphics.Paint;

public final class BU4 extends C3J implements EDM {
    public final float A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BU4) {
                BU4 bu4 = (BU4) obj;
                long j = this.A01;
                long j2 = bu4.A01;
                C24563C9j c9j = C24563C9j.$redex_init_class;
                if (!(j == j2 && Float.compare(this.A00, bu4.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void BJK(Canvas canvas, Paint paint) {
        long j = this.A01;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        canvas.drawCircle(AnonymousClass001.A02(j), AnonymousClass001.A01(j), this.A00, paint);
    }

    public int hashCode() {
        long j = this.A01;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return AnonymousClass000.A0C(AnonymousClass8BV.A00(j), this.A00);
    }

    public BU4(float f, long j) {
        this.A01 = j;
        this.A00 = f;
    }
}
