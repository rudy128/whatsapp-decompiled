package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.DDz  reason: case insensitive filesystem */
public class C26791DDz implements C28593E9i {
    public final SurfaceTexture.OnFrameAvailableListener A00 = new Cy1(this, 0);
    public final Object A01 = C17880vN.A0p();
    public final boolean A02 = true;
    public volatile SurfaceTexture A03;
    public volatile C28497E4c A04;
    public volatile int A05;

    public static SurfaceTexture A00(C26791DDz dDz) {
        SurfaceTexture surfaceTexture;
        SurfaceTexture surfaceTexture2 = dDz.A03;
        if (surfaceTexture2 != null) {
            return surfaceTexture2;
        }
        synchronized (dDz.A01) {
            surfaceTexture = dDz.A03;
            int i = dDz.A05;
            if (surfaceTexture == null) {
                surfaceTexture = new SurfaceTexture(i);
                dDz.A03 = surfaceTexture;
            }
            if (i != 0 && dDz.A02) {
                surfaceTexture.setOnFrameAvailableListener(dDz.A00);
            }
        }
        return surfaceTexture;
    }

    public long BaR() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            return surfaceTexture.getTimestamp();
        }
        return 0;
    }

    public void Bak(float[] fArr) {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(fArr);
        }
    }

    public void C8X(int i) {
        this.A05 = i;
        if (i != 0) {
            SurfaceTexture surfaceTexture = this.A03;
            if (surfaceTexture != null) {
                surfaceTexture.detachFromGLContext();
                surfaceTexture.attachToGLContext(i);
                if (this.A02) {
                    surfaceTexture.setOnFrameAvailableListener(this.A00);
                }
                surfaceTexture.updateTexImage();
                return;
            }
            A00(this);
        }
    }

    public void C8Y() {
        if (this.A03 != null) {
            synchronized (this.A01) {
                SurfaceTexture surfaceTexture = this.A03;
                this.A03 = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
        }
        this.A05 = 0;
    }

    public void CRQ() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public void CJe(C28497E4c e4c) {
        this.A04 = e4c;
    }
}
