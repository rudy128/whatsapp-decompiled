package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: X.4MX  reason: invalid class name */
public final class AnonymousClass4MX {
    public Bitmap A00;
    public Matrix A01;

    public static final boolean A00(AnonymousClass4MX r2) {
        Matrix matrix = r2.A01;
        boolean z = false;
        if (matrix == null) {
            return false;
        }
        float[] fArr = {0.0f, 1.0f};
        matrix.mapVectors(fArr);
        if (fArr[0] == 0.0f) {
            z = true;
        }
        return !z;
    }
}
