package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public final class BU7 extends C3J implements EDM {
    public final float A00;
    public final long A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BU7) {
                BU7 bu7 = (BU7) obj;
                long j = this.A02;
                long j2 = bu7.A02;
                C24563C9j c9j = C24563C9j.$redex_init_class;
                if (!(j == j2 && this.A01 == bu7.A01 && Float.compare(this.A00, bu7.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void BJK(Canvas canvas, Paint paint) {
        long j = this.A02;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        float A03 = AnonymousClass000.A03(j);
        float A012 = AnonymousClass001.A01(j);
        long j2 = this.A01;
        RectF rectF = new RectF(A03, A012, A03 + AnonymousClass000.A03(j2), AnonymousClass001.A01(j2) + A012);
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    public int hashCode() {
        long j = this.A02;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return AnonymousClass000.A0C(AnonymousClass001.A0K(this.A01, AnonymousClass8BV.A00(j)), this.A00);
    }

    public BU7(float f, long j, long j2) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = f;
    }
}
