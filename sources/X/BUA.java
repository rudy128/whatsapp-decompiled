package X;

import android.graphics.Matrix;

public final class BUA extends C3J implements C28506E4o {
    public final float A00;
    public final float A01;

    public void BCU(Matrix matrix) {
        C18070vi.A0d(matrix, 0);
        matrix.postTranslate(this.A00, this.A01);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BUA) {
                BUA bua = (BUA) obj;
                if (!(Float.compare(this.A00, bua.A00) == 0 && Float.compare(this.A01, bua.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A05(this.A00), this.A01);
    }

    public BUA(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
