package X;

import android.graphics.Path;

/* renamed from: X.BTs  reason: case insensitive filesystem */
public final class C22881BTs extends C3J implements C28505E4n {
    public final long A00;

    public void BCV(Path path, C25741ClB clB) {
        C18070vi.A0d(path, 0);
        long j = this.A00;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        path.lineTo(AnonymousClass001.A02(j), AnonymousClass001.A01(j));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22881BTs) {
                long j = this.A00;
                long j2 = ((C22881BTs) obj).A00;
                C24563C9j c9j = C24563C9j.$redex_init_class;
                if (j == j2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return AnonymousClass000.A0I(j);
    }

    public C22881BTs(long j) {
        this.A00 = j;
    }
}
