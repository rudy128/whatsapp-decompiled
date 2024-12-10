package X;

import android.graphics.Matrix;
import android.graphics.RectF;

public class CK8 {
    public final Matrix A00;

    public CK8(Matrix matrix, int i, int i2, int i3, int i4) {
        RectF A04 = C108965cb.A04((float) i3, (float) i4);
        matrix.mapRect(A04);
        Matrix A0J = C108945cZ.A0J();
        A0J.setScale(i == 1 ? -1.0f : 1.0f, 1.0f);
        A0J.postRotate((float) i2);
        Matrix A0J2 = C108945cZ.A0J();
        A0J2.setRectToRect(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), A04, Matrix.ScaleToFit.FILL);
        A0J.setConcat(A0J2, A0J);
        Matrix A0J3 = C108945cZ.A0J();
        this.A00 = A0J3;
        A0J.invert(A0J3);
    }
}
