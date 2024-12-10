package X;

import android.opengl.Matrix;

/* renamed from: X.Cie  reason: case insensitive filesystem */
public class C25599Cie {
    public static final float[] A06;
    public long A00;
    public CZB A01 = null;
    public float[] A02;
    public float[] A03;
    public float[] A04;
    public float[] A05;

    public C25599Cie() {
        float[] fArr = A06;
        this.A04 = fArr;
        this.A05 = fArr;
        this.A03 = fArr;
    }

    static {
        float[] fArr = new float[16];
        A06 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }
}
