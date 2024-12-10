package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;

public class Cy1 implements SurfaceTexture.OnFrameAvailableListener {
    public final int A00;
    public final Object A01;

    public Cy1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C28497E4c e4c;
        switch (this.A00) {
            case 0:
                e4c = ((C26791DDz) this.A01).A04;
                break;
            case 1:
                C26790DDy dDy = (C26790DDy) this.A01;
                if (surfaceTexture == dDy.A03) {
                    e4c = dDy.A04;
                    break;
                } else {
                    return;
                }
            case 2:
                Bq6 bq6 = (Bq6) this.A01;
                C25114CYn cYn = bq6.A0C;
                if (cYn != null && bq6.A03 != null && bq6.A0D != null && bq6.A0B != null && bq6.A0O) {
                    cYn.A00();
                    bq6.A03.updateTexImage();
                    SurfaceTexture surfaceTexture2 = bq6.A03;
                    float[] fArr = bq6.A0Z;
                    surfaceTexture2.getTransformMatrix(fArr);
                    GLES20.glViewport(0, 0, bq6.getWidth(), bq6.getHeight());
                    bq6.A0B.A00(bq6.A02, fArr);
                    C25114CYn cYn2 = bq6.A0C;
                    C26003CqK cqK = cYn2.A01;
                    if (!EGL14.eglSwapBuffers(cqK.A02, cYn2.A00)) {
                        Log.d("Grafika", "WARNING: swapBuffers() failed");
                    }
                    bq6.A0D.A00();
                    C25114CYn cYn3 = bq6.A0D;
                    C26003CqK cqK2 = cYn3.A01;
                    EGLSurface eGLSurface = cYn3.A00;
                    int[] A1X = BE6.A1X();
                    EGL14.eglQuerySurface(cqK2.A02, eGLSurface, 12375, A1X, 0);
                    int i = A1X[0];
                    C25114CYn cYn4 = bq6.A0D;
                    C26003CqK cqK3 = cYn4.A01;
                    EGLSurface eGLSurface2 = cYn4.A00;
                    int[] A1X2 = BE6.A1X();
                    EGL14.eglQuerySurface(cqK3.A02, eGLSurface2, 12374, A1X2, 0);
                    GLES20.glViewport(0, 0, i, A1X2[0]);
                    bq6.A0B.A00(bq6.A02, C26070Crk.A00);
                    C25114CYn cYn5 = bq6.A0D;
                    C26003CqK cqK4 = cYn5.A01;
                    if (!EGL14.eglSwapBuffers(cqK4.A02, cYn5.A00)) {
                        Log.d("Grafika", "WARNING: swapBuffers() failed");
                        return;
                    }
                    return;
                }
                return;
            default:
                ((VoipPhysicalCamera) this.A01).m74lambda$createTexture$8$comwhatsappvoipcallingcameraVoipPhysicalCamera(surfaceTexture);
                return;
        }
        if (e4c != null) {
            e4c.Bv1();
        }
    }
}
