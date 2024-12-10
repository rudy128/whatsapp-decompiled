package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public final class BU8 extends C3J implements EDM {
    public final float A00;
    public final float A01;
    public final float A02;
    public final long A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BU8) {
                BU8 bu8 = (BU8) obj;
                long j = this.A03;
                long j2 = bu8.A03;
                C24563C9j c9j = C24563C9j.$redex_init_class;
                if (!(j == j2 && Float.compare(this.A01, bu8.A01) == 0 && Float.compare(this.A02, bu8.A02) == 0 && Float.compare(this.A00, bu8.A00) == 0 && this.A04 == bu8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void BJK(Canvas canvas, Paint paint) {
        long j = this.A03;
        float f = this.A01;
        AnonymousClass1D6 A002 = C24560C9g.A00(this.A02, this.A00, this.A04);
        float A042 = AnonymousClass000.A04(A002.first);
        float A043 = AnonymousClass000.A04(A002.second);
        C24563C9j c9j = C24563C9j.$redex_init_class;
        float A022 = AnonymousClass001.A02(j);
        float A012 = AnonymousClass001.A01(j);
        canvas.drawArc(new RectF(A022 - f, A012 - f, A022 + f, A012 + f), A042, A043, false, paint);
    }

    public int hashCode() {
        long j = this.A03;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return C17880vN.A01(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass8BV.A00(j), this.A01), this.A02), this.A00), this.A04);
    }

    public BU8(float f, float f2, float f3, long j, boolean z) {
        this.A03 = j;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A04 = z;
    }
}
