package X;

import android.graphics.Path;

/* renamed from: X.BTv  reason: case insensitive filesystem */
public final class C22884BTv extends C3J implements C28505E4n {
    public final float A00;
    public final long A01;

    public void BCV(Path path, C25741ClB clB) {
        C18070vi.A0d(path, 0);
        long j = this.A01;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        path.addCircle(AnonymousClass001.A02(j), AnonymousClass001.A01(j), this.A00, Path.Direction.CW);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22884BTv) {
                C22884BTv bTv = (C22884BTv) obj;
                long j = this.A01;
                long j2 = bTv.A01;
                C24563C9j c9j = C24563C9j.$redex_init_class;
                if (!(j == j2 && Float.compare(this.A00, bTv.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A01;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return AnonymousClass000.A0C(AnonymousClass8BV.A00(j), this.A00);
    }

    public C22884BTv(float f, long j) {
        this.A01 = j;
        this.A00 = f;
    }
}
