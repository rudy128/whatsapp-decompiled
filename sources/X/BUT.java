package X;

import android.opengl.Matrix;

public class BUT extends C26246Cvk {
    public int A00 = 1;
    public int A01 = 1;
    public int A02 = 0;
    public int A03 = 0;
    public final float[] A04 = new float[16];

    public void A08(CWX cwx, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        int i6 = i5;
        int i7 = i2;
        if (i6 % 180 == 0) {
            i7 = i;
            i = i2;
        }
        float[] fArr3 = this.A04;
        C26246Cvk.A05(fArr3, fArr);
        C26246Cvk.A02(fArr3, i6);
        C26246Cvk.A03(fArr3, i7, i, i3, i4);
        float f = (float) this.A02;
        float f2 = (float) this.A03;
        float f3 = (float) this.A01;
        float f4 = (float) this.A00;
        float f5 = (float) i7;
        float f6 = (float) i;
        float max = Math.max(f5, f6);
        float max2 = Math.max(f3, f4) / max;
        Matrix.translateM(fArr3, 0, (f + ((f3 - f5) / 2.0f)) / max, -((f2 + ((f4 - f6) / 2.0f)) / max), 0.0f);
        Matrix.scaleM(fArr3, 0, max2, max2, 1.0f);
        C26246Cvk.A04(fArr3, z, z2);
        C26246Cvk.A01(cwx, fArr3);
        int i8 = this.A01;
        int i9 = this.A00;
        cwx.A01 = i8;
        cwx.A00 = i9;
        float f7 = (float) i8;
        float f8 = (float) i9;
        float[] fArr4 = cwx.A02;
        Matrix.setIdentityM(fArr4, 0);
        Matrix.translateM(fArr4, 0, ((float) ((0 + i8) - i8)) / f7, ((float) ((0 + i9) - i9)) / f8, 0.0f);
        Matrix.scaleM(fArr4, 0, (1.0f * f7) / f7, (1.0f * f8) / f8, 1.0f);
    }
}
