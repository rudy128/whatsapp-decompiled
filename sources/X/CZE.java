package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public final class CZE {
    public int A00;
    public final SurfaceTexture A01;
    public final ByteBuffer A02 = BEA.A0u(64);
    public final float[] A03 = new float[16];
    public volatile int A04;
    public volatile int A05;

    public boolean A01(GlVideoRenderer glVideoRenderer, int i, int i2) {
        if (this.A00 == 0) {
            Log.i("voip/video/SurfaceTextureHolder/render ignore rendering after texture is released");
            return false;
        }
        SurfaceTexture surfaceTexture = this.A01;
        surfaceTexture.updateTexImage();
        float[] fArr = this.A03;
        surfaceTexture.getTransformMatrix(fArr);
        int i3 = (this.A05 + this.A04) % 4;
        if (i3 != 0) {
            Matrix.rotateM(fArr, 0, (float) (i3 * 90), 0.0f, 0.0f, 1.0f);
        }
        if (i3 == 1) {
            Matrix.translateM(fArr, 0, 0.0f, -1.0f, 0.0f);
        } else if (i3 == 2) {
            Matrix.translateM(fArr, 0, -1.0f, -1.0f, 0.0f);
        } else if (i3 == 3) {
            Matrix.translateM(fArr, 0, -1.0f, 0.0f, 0.0f);
        }
        FloatBuffer asFloatBuffer = this.A02.asFloatBuffer();
        asFloatBuffer.rewind();
        asFloatBuffer.put(fArr);
        glVideoRenderer.renderOesTexture(this.A00, i, i2, asFloatBuffer);
        return true;
    }

    public CZE() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameterf(36197, 10242, 33071.0f);
        GLES20.glTexParameterf(36197, 10243, 33071.0f);
        C24648CDn.A00("generateTexture");
        this.A00 = i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.A01 = surfaceTexture;
        this.A05 = 0;
        C17900vP.A0Y(surfaceTexture, "voip/video/SurfaceTextureHolder/createSurfaceTexture, surfaceTexture = ", AnonymousClass000.A10());
    }

    public void A00() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/video/SurfaceTextureHolder/deleteSurfaceTexture surfaceTexture = ");
        SurfaceTexture surfaceTexture = this.A01;
        C17900vP.A0b(surfaceTexture, A10);
        surfaceTexture.release();
        int i = this.A00;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        this.A00 = 0;
    }
}
