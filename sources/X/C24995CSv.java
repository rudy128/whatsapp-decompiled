package X;

import android.opengl.Matrix;

/* renamed from: X.CSv  reason: case insensitive filesystem */
public class C24995CSv {
    public C25739Cl9 A00;
    public final CPT A01 = C25326CdX.A00();
    public final C25998CqE A02;
    public final float[] A03;
    public final float[] A04;
    public final float[] A05;

    public C24995CSv(C25998CqE cqE) {
        float[] fArr = new float[16];
        this.A03 = fArr;
        float[] fArr2 = new float[16];
        this.A05 = fArr2;
        float[] fArr3 = new float[16];
        this.A04 = fArr3;
        this.A02 = cqE;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.A00 = C25998CqE.A00(this.A02, 2132017238, 2132017235);
    }
}
