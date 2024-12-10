package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.BTz  reason: case insensitive filesystem */
public final class C22888BTz extends C3J implements C28505E4n {
    public final float A00;
    public final long A01;
    public final long A02;

    public void BCV(Path path, C25741ClB clB) {
        C18070vi.A0d(path, 0);
        long j = this.A02;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        float A03 = AnonymousClass000.A03(j);
        float A012 = AnonymousClass001.A01(j);
        long j2 = this.A01;
        RectF rectF = new RectF(A03, A012, A03 + AnonymousClass000.A03(j2), AnonymousClass001.A01(j2) + A012);
        float f = this.A00;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22888BTz) {
                C22888BTz bTz = (C22888BTz) obj;
                long j = this.A02;
                long j2 = bTz.A02;
                C24563C9j c9j = C24563C9j.$redex_init_class;
                if (!(j == j2 && this.A01 == bTz.A01 && Float.compare(this.A00, bTz.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A02;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return AnonymousClass000.A0C(AnonymousClass001.A0K(this.A01, AnonymousClass8BV.A00(j)), this.A00);
    }

    public C22888BTz(float f, long j, long j2) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = f;
    }
}
