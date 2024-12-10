package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public final class BU5 extends C3J implements EDM {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BU5) {
                BU5 bu5 = (BU5) obj;
                long j = this.A01;
                long j2 = bu5.A01;
                C24563C9j c9j = C24563C9j.$redex_init_class;
                if (!(j == j2 && this.A00 == bu5.A00)) {
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
        float A03 = AnonymousClass000.A03(j);
        float A012 = AnonymousClass001.A01(j);
        long j2 = this.A00;
        canvas.drawOval(new RectF(A03, A012, A03 + AnonymousClass000.A03(j2), A012 + AnonymousClass001.A01(j2)), paint);
    }

    public int hashCode() {
        long j = this.A01;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return AnonymousClass001.A0J(this.A00, AnonymousClass8BV.A00(j));
    }

    public BU5(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
