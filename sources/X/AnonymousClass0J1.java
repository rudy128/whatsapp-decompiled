package X;

import android.graphics.Matrix;

/* renamed from: X.0J1  reason: invalid class name */
public final class AnonymousClass0J1 {
    public boolean A00 = true;
    public boolean A01 = true;
    public Matrix A02;
    public Matrix A03;
    public boolean A04 = true;
    public float[] A05;
    public float[] A06;
    public final AnonymousClass1OS A07;

    public final float[] A00(Object obj) {
        float[] fArr = this.A05;
        if (fArr == null) {
            fArr = C05040Qd.A08();
            this.A05 = fArr;
        }
        if (this.A01) {
            this.A04 = AnonymousClass0FG.A00(A01(obj), fArr);
            this.A01 = false;
        }
        if (this.A04) {
            return fArr;
        }
        return null;
    }

    public final float[] A01(Object obj) {
        float[] fArr = this.A06;
        if (fArr == null) {
            fArr = C05040Qd.A08();
            this.A06 = fArr;
        }
        if (this.A00) {
            Matrix matrix = this.A02;
            if (matrix == null) {
                matrix = new Matrix();
                this.A02 = matrix;
            }
            this.A07.invoke(obj, matrix);
            Matrix matrix2 = this.A03;
            if (matrix2 == null || !matrix.equals(matrix2)) {
                AnonymousClass0LJ.A01(matrix, fArr);
                this.A02 = matrix2;
                this.A03 = matrix;
            }
            this.A00 = false;
        }
        return fArr;
    }

    public AnonymousClass0J1(AnonymousClass1OS r2) {
        this.A07 = r2;
    }
}
