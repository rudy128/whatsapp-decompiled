package X;

import android.opengl.Matrix;

public class BUS extends C26246Cvk {
    public final float[] A00 = new float[16];

    public void A08(CWX cwx, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int round;
        int i6;
        int i7 = i5;
        int i8 = i;
        int i9 = i2;
        if (i7 % 180 == 0) {
            i9 = i8;
            i8 = i2;
        }
        float[] fArr3 = this.A00;
        C26246Cvk.A05(fArr3, fArr);
        C26246Cvk.A02(fArr3, i7);
        if (i9 < i8) {
            f2 = (float) i9;
            f = (float) i8;
            f4 = f2 / f;
            f3 = 1.0f;
        } else {
            f = (float) i8;
            f2 = (float) i9;
            f3 = f / f2;
            f4 = 1.0f;
        }
        int i10 = i3;
        int i11 = i4;
        if (i10 < i11) {
            f6 = (float) i10;
            f5 = (float) i11;
            f8 = f6 / f5;
            f7 = 1.0f;
        } else {
            f5 = (float) i11;
            f6 = (float) i10;
            f7 = f5 / f6;
            f8 = 1.0f;
        }
        Matrix.scaleM(fArr3, 0, f4 / f8, f3 / f7, 1.0f);
        C26246Cvk.A04(fArr3, z, z2);
        if (i10 < i11) {
            f10 = f6 / f5;
            f9 = 1.0f;
        } else {
            f9 = f5 / f6;
            f10 = 1.0f;
        }
        Matrix.scaleM(fArr3, 0, f10, f9, 1.0f);
        CWX cwx2 = cwx;
        C26246Cvk.A01(cwx, fArr3);
        float f11 = f2 / f;
        if (f11 < f6 / f5) {
            i6 = BE6.A04(f5, f11);
            round = i11;
        } else {
            round = Math.round(f6 / f11);
            i6 = i10;
        }
        C26246Cvk.A00(cwx2, (i3 - i6) / 2, (i4 - round) / 2, i6, round, i10, i11);
    }
}
