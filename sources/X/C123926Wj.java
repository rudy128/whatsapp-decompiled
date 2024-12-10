package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.6Wj  reason: invalid class name and case insensitive filesystem */
public abstract class C123926Wj {
    public static final Matrix A00(Matrix matrix, RectF rectF, float f) {
        if (matrix == null) {
            matrix = C108945cZ.A0J();
        } else {
            matrix.reset();
        }
        matrix.setRotate(f);
        float f2 = 0.0f;
        if (f != 90.0f) {
            if (f == 180.0f) {
                f2 = -rectF.width();
            } else if (f == 270.0f) {
                matrix.preTranslate(-rectF.width(), 0.0f);
                return matrix;
            } else {
                if (f != 0.0f) {
                    throw AnonymousClass000.A0k("Failed requirement.");
                }
                return matrix;
            }
        }
        matrix.preTranslate(f2, -rectF.height());
        return matrix;
    }
}
