package X;

import android.graphics.Matrix;

public final class BUB extends C3J implements C28506E4o {
    public final float A00;
    public final float A01;
    public final long A02;

    public void BCU(Matrix matrix) {
        C18070vi.A0d(matrix, 0);
        float f = this.A00;
        float f2 = this.A01;
        long j = this.A02;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        matrix.postScale(f, f2, AnonymousClass001.A02(j), AnonymousClass001.A01(j));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BUB) {
                BUB bub = (BUB) obj;
                if (Float.compare(this.A00, bub.A00) == 0 && Float.compare(this.A01, bub.A01) == 0) {
                    long j = this.A02;
                    long j2 = bub.A02;
                    C24563C9j c9j = C24563C9j.$redex_init_class;
                    if (j == j2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0B = AnonymousClass000.A0B(AnonymousClass000.A05(this.A00), this.A01);
        long j = this.A02;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return AnonymousClass001.A0J(j, A0B);
    }

    public BUB(float f, float f2, long j) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = j;
    }
}
