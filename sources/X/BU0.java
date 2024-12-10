package X;

import android.graphics.Path;
import android.graphics.RectF;

public final class BU0 extends C3J implements C28505E4n {
    public final float A00;
    public final float A01;
    public final float A02;
    public final long A03;
    public final boolean A04;

    public void BCV(Path path, C25741ClB clB) {
        C18070vi.A0d(path, 0);
        long j = this.A03;
        float f = this.A01;
        AnonymousClass1D6 A002 = C24560C9g.A00(this.A02, this.A00, this.A04);
        float A042 = AnonymousClass000.A04(A002.first);
        float A043 = AnonymousClass000.A04(A002.second);
        C24563C9j c9j = C24563C9j.$redex_init_class;
        float A022 = AnonymousClass001.A02(j);
        float A012 = AnonymousClass001.A01(j);
        path.arcTo(new RectF(A022 - f, A012 - f, A022 + f, A012 + f), A042, A043);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BU0) {
                BU0 bu0 = (BU0) obj;
                long j = this.A03;
                long j2 = bu0.A03;
                C24563C9j c9j = C24563C9j.$redex_init_class;
                if (!(j == j2 && Float.compare(this.A01, bu0.A01) == 0 && Float.compare(this.A02, bu0.A02) == 0 && Float.compare(this.A00, bu0.A00) == 0 && this.A04 == bu0.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A03;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return C17880vN.A01(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass8BV.A00(j), this.A01), this.A02), this.A00), this.A04);
    }

    public BU0(float f, float f2, float f3, long j, boolean z) {
        this.A03 = j;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A04 = z;
    }
}
