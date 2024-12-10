package X;

import android.opengl.Matrix;

public class CRH {
    public int A00;
    public int A01;
    public final boolean A02;
    public final float[] A03;

    public CRH(int i, int i2, boolean z) {
        float[] fArr = new float[16];
        this.A03 = fArr;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
        Matrix.setIdentityM(fArr, 0);
    }
}
