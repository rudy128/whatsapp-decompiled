package X;

import android.opengl.Matrix;

public class BUV extends C26246Cvk {
    public final float[] A00 = new float[16];

    public void A08(CWX cwx, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        float f;
        float f2;
        int i6 = i;
        int i7 = i2;
        if (i5 % 180 != 0) {
            i6 = i2;
            i7 = i;
        }
        float[] fArr3 = this.A00;
        C26246Cvk.A05(fArr3, fArr);
        if (i < i2) {
            f2 = ((float) i2) / ((float) i);
            f = 1.0f;
        } else {
            f = ((float) i) / ((float) i2);
            f2 = 1.0f;
        }
        Matrix.scaleM(fArr3, 0, f2, f, 1.0f);
        C26246Cvk.A02(fArr3, i5);
        C26246Cvk.A03(fArr3, i6, i7, i3, i4);
        C26246Cvk.A04(fArr3, z, z2);
        C26246Cvk.A01(cwx, fArr3);
        float f3 = (float) i6;
        float f4 = (float) i7;
        float f5 = ((float) i3) / ((float) i4);
        if (f5 < f3 / f4) {
            i6 = BE6.A04(f4, f5);
        } else {
            i7 = Math.round(f3 / f5);
        }
        cwx.A01 = i6;
        cwx.A00 = i7;
    }
}
