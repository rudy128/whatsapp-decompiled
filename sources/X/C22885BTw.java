package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.BTw  reason: case insensitive filesystem */
public final class C22885BTw extends C3J implements C28505E4n {
    public final long A00;
    public final long A01;

    public void BCV(Path path, C25741ClB clB) {
        C18070vi.A0d(path, 0);
        long j = this.A01;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        float A03 = AnonymousClass000.A03(j);
        float A012 = AnonymousClass001.A01(j);
        long j2 = this.A00;
        path.addOval(new RectF(A03, A012, A03 + AnonymousClass000.A03(j2), AnonymousClass001.A01(j2) + A012), Path.Direction.CW);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22885BTw) {
                C22885BTw bTw = (C22885BTw) obj;
                long j = this.A01;
                long j2 = bTw.A01;
                C24563C9j c9j = C24563C9j.$redex_init_class;
                if (!(j == j2 && this.A00 == bTw.A00)) {
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
        return AnonymousClass001.A0J(this.A00, AnonymousClass8BV.A00(j));
    }

    public C22885BTw(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
