package X;

import android.graphics.Path;

/* renamed from: X.BTy  reason: case insensitive filesystem */
public final class C22887BTy extends C3J implements C28505E4n {
    public final long A00;
    public final long A01;
    public final long A02;

    public void BCV(Path path, C25741ClB clB) {
        C18070vi.A0d(path, 0);
        long j = this.A00;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        float A03 = AnonymousClass000.A03(j);
        float A012 = AnonymousClass001.A01(j);
        long j2 = this.A01;
        float A032 = AnonymousClass000.A03(j2);
        float A013 = AnonymousClass001.A01(j2);
        long j3 = this.A02;
        path.cubicTo(A03, A012, A032, A013, AnonymousClass000.A03(j3), AnonymousClass001.A01(j3));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22887BTy) {
                C22887BTy bTy = (C22887BTy) obj;
                long j = this.A00;
                long j2 = bTy.A00;
                C24563C9j c9j = C24563C9j.$redex_init_class;
                if (!(j == j2 && this.A01 == bTy.A01 && this.A02 == bTy.A02)) {
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
        return AnonymousClass001.A0J(this.A02, AnonymousClass001.A0K(this.A01, AnonymousClass8BV.A00(j)));
    }

    public C22887BTy(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }
}
