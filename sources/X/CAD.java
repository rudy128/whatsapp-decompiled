package X;

import android.opengl.Matrix;

public abstract class CAD {
    public static void A00(float[] fArr, float f) {
        float f2 = f;
        if (f != 0.0f) {
            float[] fArr2 = fArr;
            Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
            Matrix.rotateM(fArr2, 0, f2, 0.0f, 0.0f, 1.0f);
            Matrix.translateM(fArr2, 0, -0.5f, -0.5f, 0.0f);
        }
    }
}
