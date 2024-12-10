package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;

/* renamed from: X.DDy  reason: case insensitive filesystem */
public class C26790DDy implements C28593E9i {
    public EB1 A00;
    public int A01;
    public final SurfaceTexture.OnFrameAvailableListener A02 = new Cy1(this, 1);
    public volatile SurfaceTexture A03;
    public volatile C28497E4c A04;

    public void C8Y() {
        this.A01 = 0;
    }

    public void A00() {
        if (this.A03 != null) {
            return;
        }
        if (this.A01 != 0) {
            C26294Cx6.A05("ar-session", "regular surface used");
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.A01);
            surfaceTexture.setOnFrameAvailableListener(this.A02);
            this.A03 = surfaceTexture;
            return;
        }
        throw BE6.A0j();
    }

    public void A01() {
        SurfaceTexture surfaceTexture = this.A03;
        this.A03 = null;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public void A02(Handler handler) {
        if (this.A01 != 0) {
            C26294Cx6.A05("ar-session", "regular surface used - attach");
            SurfaceTexture surfaceTexture = this.A03;
            if (surfaceTexture != null) {
                surfaceTexture.detachFromGLContext();
                surfaceTexture.attachToGLContext(this.A01);
                surfaceTexture.setOnFrameAvailableListener(this.A02, handler);
                surfaceTexture.updateTexImage();
                return;
            }
            return;
        }
        throw BE6.A0j();
    }

    public long BaR() {
        SurfaceTexture surfaceTexture = this.A03;
        C26159CtX.A01(surfaceTexture);
        return surfaceTexture.getTimestamp();
    }

    public void Bak(float[] fArr) {
        SurfaceTexture surfaceTexture = this.A03;
        C26159CtX.A01(surfaceTexture);
        surfaceTexture.getTransformMatrix(fArr);
    }

    public void CRQ() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public void C8X(int i) {
        this.A01 = i;
    }

    public void CJe(C28497E4c e4c) {
        this.A04 = e4c;
    }
}
