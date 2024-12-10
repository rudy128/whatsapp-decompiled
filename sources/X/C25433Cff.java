package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;

/* renamed from: X.Cff  reason: case insensitive filesystem */
public abstract class C25433Cff {
    public static final Matrix A00 = C108945cZ.A0J();
    public static final float[] A01 = C108945cZ.A1V();

    public static PointF A00(PointF pointF, View view) {
        float[] fArr = A01;
        fArr[0] = pointF.x - ((float) view.getLeft());
        fArr[1] = pointF.y - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = A00;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        matrix2.reset();
        return new PointF(fArr[0], fArr[1]);
    }
}
