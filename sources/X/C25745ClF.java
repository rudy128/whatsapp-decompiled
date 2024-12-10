package X;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.ClF  reason: case insensitive filesystem */
public final class C25745ClF {
    public SurfaceTexture A00;
    public CJJ A01;
    public CRD A02;
    public CZB A03;
    public CountDownLatch A04 = new CountDownLatch(1);
    public final C24764CJc A05;
    public final BVt A06 = new BVt();
    public final Object A07;
    public final Object A08 = C17880vN.A0p();
    public final boolean A09;
    public final boolean A0A;

    public C25745ClF(CRD crd, C24764CJc cJc, Object obj, boolean z, boolean z2) {
        C18070vi.A0d(cJc, 7);
        this.A02 = crd;
        this.A05 = cJc;
        this.A09 = z;
        this.A0A = z2;
        this.A07 = obj;
    }

    public void A01() {
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
            surfaceTexture.release();
        }
        CZB czb = this.A03;
        if (czb != null) {
            czb.A01();
        }
        this.A04 = BE7.A0u();
        this.A00 = null;
        this.A03 = null;
    }

    public void A02(float[] fArr) {
        C18070vi.A0d(fArr, 0);
        if (this.A0A) {
            Matrix.setIdentityM(fArr, 0);
            CAD.A00(fArr, -((float) this.A02.A03));
            Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
            CAD.A00(fArr, 180.0f);
            return;
        }
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(fArr);
            CRD crd = this.A02;
            int i = crd.A02;
            int i2 = crd.A01;
            int i3 = i;
            int i4 = crd.A03 % 180;
            if (i4 != 0) {
                i3 = i2;
            }
            A00(0, 12, fArr, i3);
            if (i4 != 0) {
                i2 = i;
            }
            A00(4, 12, fArr, i2);
            A00(1, 13, fArr, i3);
            A00(5, 13, fArr, i2);
            return;
        }
        Matrix.setIdentityM(fArr, 0);
    }

    public static final void A00(int i, int i2, float[] fArr, int i3) {
        float f = fArr[i];
        float abs = (float) Math.abs((double) f);
        float f2 = fArr[i2];
        if (abs > 0.0f && abs < 1.0f && i3 > 2) {
            float f3 = (float) (i3 - 2);
            float f4 = f2 * (f3 / abs);
            if (Math.abs((double) (f4 - 1.0f)) < 0.009999999776482582d) {
                fArr[i] = (f * ((float) i3)) / ((float) (i3 - 2));
                fArr[i2] = 0.0f;
                return;
            }
            float f5 = (float) i3;
            if (Math.abs((double) ((f5 - f4) - 1.0f)) < 0.009999999776482582d) {
                fArr[i] = (f * f5) / f3;
                fArr[i2] = (fArr[i2] * f5) / ((float) (i3 - 1));
            }
        }
    }
}
