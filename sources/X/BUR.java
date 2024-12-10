package X;

import android.opengl.Matrix;

public class BUR extends C26246Cvk {
    public final float[] A00 = new float[16];

    public void A08(CWX cwx, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        float f;
        float f2;
        int i6 = i;
        int i7 = i5;
        int i8 = i2;
        if (i7 % 180 == 0) {
            i8 = i6;
            i6 = i2;
        }
        float[] fArr3 = this.A00;
        C26246Cvk.A05(fArr3, fArr);
        C26246Cvk.A02(fArr3, i7);
        int i9 = i3;
        int i10 = i4;
        C26246Cvk.A03(fArr3, i8, i6, i9, i10);
        C26246Cvk.A04(fArr3, z, z2);
        if (i9 < i10) {
            f2 = ((float) i9) / ((float) i10);
            f = 1.0f;
        } else {
            f = ((float) i10) / ((float) i9);
            f2 = 1.0f;
        }
        Matrix.scaleM(fArr3, 0, f2, f, 1.0f);
        C26246Cvk.A01(cwx, fArr3);
        C26246Cvk.A00(cwx, 0, 0, i9, i10, i9, i10);
    }
}
