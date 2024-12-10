package X;

import android.graphics.Matrix;

public final class BU9 extends C3J implements C28506E4o {
    public final float A00;
    public final long A01;

    public void BCU(Matrix matrix) {
        C18070vi.A0d(matrix, 0);
        float f = this.A00;
        long j = this.A01;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        matrix.postRotate(f, AnonymousClass001.A02(j), AnonymousClass001.A01(j));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BU9) {
                BU9 bu9 = (BU9) obj;
                if (Float.compare(this.A00, bu9.A00) == 0) {
                    long j = this.A01;
                    long j2 = bu9.A01;
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
        int A05 = AnonymousClass000.A05(this.A00);
        long j = this.A01;
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return AnonymousClass001.A0J(j, A05);
    }

    public BU9(float f, long j) {
        this.A00 = f;
        this.A01 = j;
    }
}
