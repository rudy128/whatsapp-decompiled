package X;

import android.graphics.Path;

/* renamed from: X.BTx  reason: case insensitive filesystem */
public final class C22886BTx extends C3J implements C28505E4n {
    public final long A00;
    public final long A01;

    public void BCV(Path path, C25741ClB clB) {
        C18070vi.A0d(path, 0);
        long j = this.A00;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        float A03 = AnonymousClass000.A03(j);
        float A012 = AnonymousClass001.A01(j);
        long j2 = this.A01;
        path.quadTo(A03, A012, AnonymousClass000.A03(j2), AnonymousClass001.A01(j2));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22886BTx) {
                C22886BTx bTx = (C22886BTx) obj;
                long j = this.A00;
                long j2 = bTx.A00;
                C24563C9j c9j = C24563C9j.$redex_init_class;
                if (!(j == j2 && this.A01 == bTx.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return AnonymousClass001.A0J(this.A01, AnonymousClass8BV.A00(j));
    }

    public C22886BTx(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }
}
